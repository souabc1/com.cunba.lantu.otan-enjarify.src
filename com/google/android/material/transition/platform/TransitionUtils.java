package com.google.android.material.transition.platform;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.PathParser;
import com.google.android.material.canvas.CanvasCompat.CanvasOperation;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import m54207b69;

class TransitionUtils
{
  static final int NO_ATTR_RES_ID = 0;
  static final int NO_DURATION = 255;
  private static final int PATH_TYPE_ARC = 1;
  private static final int PATH_TYPE_LINEAR;
  private static final RectF transformAlphaRectF;
  
  static
  {
    RectF localRectF = new android/graphics/RectF;
    localRectF.<init>();
    transformAlphaRectF = localRectF;
  }
  
  public static float calculateArea(RectF paramRectF)
  {
    float f1 = paramRectF.width();
    float f2 = paramRectF.height();
    return f1 * f2;
  }
  
  public static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel paramShapeAppearanceModel, RectF paramRectF)
  {
    OooO00o localOooO00o = new com/google/android/material/transition/platform/OooO00o;
    localOooO00o.<init>(paramRectF);
    return paramShapeAppearanceModel.withTransformedCornerSizes(localOooO00o);
  }
  
  public static Shader createColorShader(int paramInt)
  {
    LinearGradient localLinearGradient = new android/graphics/LinearGradient;
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    localLinearGradient.<init>(0.0F, 0.0F, 0.0F, 0.0F, paramInt, paramInt, localTileMode);
    return localLinearGradient;
  }
  
  public static Object defaultIfNull(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      paramObject1 = paramObject2;
    }
    return paramObject1;
  }
  
  public static View findAncestorById(View paramView, int paramInt)
  {
    String str = paramView.getResources().getResourceName(paramInt);
    while (paramView != null)
    {
      int i = paramView.getId();
      if (i == paramInt) {
        return paramView;
      }
      paramView = paramView.getParent();
      boolean bool = paramView instanceof View;
      if (!bool) {
        break;
      }
      paramView = (View)paramView;
    }
    paramView = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append(str);
    str = m54207b69.F54207b69_11("h@602A356332343A672969402C3836326F313F353847494549");
    ((StringBuilder)localObject).append(str);
    localObject = ((StringBuilder)localObject).toString();
    paramView.<init>((String)localObject);
    throw paramView;
  }
  
  public static View findDescendantOrAncestorById(View paramView, int paramInt)
  {
    View localView = paramView.findViewById(paramInt);
    if (localView != null) {
      return localView;
    }
    return findAncestorById(paramView, paramInt);
  }
  
  public static RectF getLocationOnScreen(View paramView)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    int k = paramView.getWidth() + i;
    int m = paramView.getHeight() + j;
    RectF localRectF = new android/graphics/RectF;
    float f1 = i;
    float f2 = j;
    float f3 = k;
    float f4 = m;
    localRectF.<init>(f1, f2, f3, f4);
    return localRectF;
  }
  
  public static RectF getRelativeBounds(View paramView)
  {
    RectF localRectF = new android/graphics/RectF;
    float f1 = paramView.getLeft();
    float f2 = paramView.getTop();
    float f3 = paramView.getRight();
    float f4 = paramView.getBottom();
    localRectF.<init>(f1, f2, f3, f4);
    return localRectF;
  }
  
  public static Rect getRelativeBoundsRect(View paramView)
  {
    Rect localRect = new android/graphics/Rect;
    int i = paramView.getLeft();
    int j = paramView.getTop();
    int k = paramView.getRight();
    int m = paramView.getBottom();
    localRect.<init>(i, j, k, m);
    return localRect;
  }
  
  private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel paramShapeAppearanceModel, RectF paramRectF)
  {
    CornerSize localCornerSize = paramShapeAppearanceModel.getTopLeftCornerSize();
    float f1 = localCornerSize.getCornerSize(paramRectF);
    boolean bool1 = f1 < 0.0F;
    if (!bool1)
    {
      localCornerSize = paramShapeAppearanceModel.getTopRightCornerSize();
      f1 = localCornerSize.getCornerSize(paramRectF);
      bool1 = f1 < 0.0F;
      if (!bool1)
      {
        localCornerSize = paramShapeAppearanceModel.getBottomRightCornerSize();
        f1 = localCornerSize.getCornerSize(paramRectF);
        bool1 = f1 < 0.0F;
        if (!bool1)
        {
          paramShapeAppearanceModel = paramShapeAppearanceModel.getBottomLeftCornerSize();
          f2 = paramShapeAppearanceModel.getCornerSize(paramRectF);
          bool2 = f2 < 0.0F;
          if (!bool2)
          {
            bool2 = false;
            f2 = 0.0F;
            paramShapeAppearanceModel = null;
            break label115;
          }
        }
      }
    }
    boolean bool2 = true;
    float f2 = 1.4E-45F;
    label115:
    return bool2;
  }
  
  public static float lerp(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat2 -= paramFloat1;
    paramFloat3 *= paramFloat2;
    return paramFloat1 + paramFloat3;
  }
  
  public static float lerp(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    return lerp(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, false);
  }
  
  public static float lerp(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      float f = 0.0F;
      paramBoolean = paramFloat5 < 0.0F;
      if (!paramBoolean)
      {
        f = 1.0F;
        paramBoolean = paramFloat5 < f;
        if (!paramBoolean) {}
      }
      else
      {
        return lerp(paramFloat1, paramFloat2, paramFloat5);
      }
    }
    paramBoolean = paramFloat5 < paramFloat3;
    if (paramBoolean) {
      return paramFloat1;
    }
    paramBoolean = paramFloat5 < paramFloat4;
    if (paramBoolean) {
      return paramFloat2;
    }
    paramFloat5 -= paramFloat3;
    paramFloat4 -= paramFloat3;
    paramFloat5 /= paramFloat4;
    return lerp(paramFloat1, paramFloat2, paramFloat5);
  }
  
  public static int lerp(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool = paramFloat3 < paramFloat1;
    if (bool) {
      return paramInt1;
    }
    bool = paramFloat3 < paramFloat2;
    if (bool) {
      return paramInt2;
    }
    float f1 = paramInt1;
    float f2 = paramInt2;
    paramFloat3 -= paramFloat1;
    paramFloat2 -= paramFloat1;
    paramFloat3 /= paramFloat2;
    return (int)lerp(f1, f2, paramFloat3);
  }
  
  public static ShapeAppearanceModel lerp(ShapeAppearanceModel paramShapeAppearanceModel1, ShapeAppearanceModel paramShapeAppearanceModel2, RectF paramRectF1, RectF paramRectF2, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool = paramFloat3 < paramFloat1;
    if (bool) {
      return paramShapeAppearanceModel1;
    }
    bool = paramFloat3 < paramFloat2;
    if (bool) {
      return paramShapeAppearanceModel2;
    }
    TransitionUtils.1 local1 = new com/google/android/material/transition/platform/TransitionUtils$1;
    local1.<init>(paramRectF1, paramRectF2, paramFloat1, paramFloat2, paramFloat3);
    return transformCornerSizes(paramShapeAppearanceModel1, paramShapeAppearanceModel2, paramRectF1, local1);
  }
  
  public static void maybeAddTransition(TransitionSet paramTransitionSet, Transition paramTransition)
  {
    if (paramTransition != null) {
      paramTransitionSet.addTransition(paramTransition);
    }
  }
  
  public static boolean maybeApplyThemeDuration(Transition paramTransition, Context paramContext, int paramInt)
  {
    if (paramInt != 0)
    {
      long l1 = paramTransition.getDuration();
      long l2 = -1;
      boolean bool = l1 < l2;
      if (!bool)
      {
        int i = -1;
        int j = MotionUtils.resolveThemeDuration(paramContext, paramInt, i);
        if (j != i)
        {
          long l3 = j;
          paramTransition.setDuration(l3);
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean maybeApplyThemeInterpolator(Transition paramTransition, Context paramContext, int paramInt, TimeInterpolator paramTimeInterpolator)
  {
    if (paramInt != 0)
    {
      TimeInterpolator localTimeInterpolator = paramTransition.getInterpolator();
      if (localTimeInterpolator == null)
      {
        paramContext = MotionUtils.resolveThemeInterpolator(paramContext, paramInt, paramTimeInterpolator);
        paramTransition.setInterpolator(paramContext);
        return true;
      }
    }
    return false;
  }
  
  public static boolean maybeApplyThemePath(Transition paramTransition, Context paramContext, int paramInt)
  {
    if (paramInt != 0)
    {
      paramContext = resolveThemePath(paramContext, paramInt);
      if (paramContext != null)
      {
        paramTransition.setPathMotion(paramContext);
        return true;
      }
    }
    return false;
  }
  
  public static void maybeRemoveTransition(TransitionSet paramTransitionSet, Transition paramTransition)
  {
    if (paramTransition != null) {
      paramTransitionSet.removeTransition(paramTransition);
    }
  }
  
  public static PathMotion resolveThemePath(Context paramContext, int paramInt)
  {
    Object localObject1 = new android/util/TypedValue;
    ((TypedValue)localObject1).<init>();
    paramContext = paramContext.getTheme();
    int i = 1;
    boolean bool = paramContext.resolveAttribute(paramInt, (TypedValue)localObject1, i);
    paramInt = 0;
    Object localObject2 = null;
    if (bool)
    {
      int j = ((TypedValue)localObject1).type;
      int k = 16;
      if (j == k)
      {
        j = ((TypedValue)localObject1).data;
        if (j == 0) {
          return null;
        }
        if (j == i)
        {
          paramContext = new com/google/android/material/transition/platform/MaterialArcMotion;
          paramContext.<init>();
          return paramContext;
        }
        localObject2 = new java/lang/IllegalArgumentException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        String str = m54207b69.F54207b69_11(":|35130C20141A1E63191C12201F1F6A1B2D19266F1C1A22305E75");
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(j);
        paramContext = ((StringBuilder)localObject1).toString();
        ((IllegalArgumentException)localObject2).<init>(paramContext);
        throw ((Throwable)localObject2);
      }
      paramInt = 3;
      if (j == paramInt)
      {
        paramContext = String.valueOf(((TypedValue)localObject1).string);
        localObject2 = new android/transition/PatternPathMotion;
        paramContext = PathParser.OooO0o0(paramContext);
        ((PatternPathMotion)localObject2).<init>(paramContext);
        return localObject2;
      }
      paramContext = new java/lang/IllegalArgumentException;
      localObject2 = m54207b69.F54207b69_11("=`2D10160C13134617091D124B2015131C1551132728271F192D2D1F5B2932313360262B372C2A38672A2E6A2C3A6D333D453E724935414B3C78484C7B4C3E5247804543574585595B5A525852");
      paramContext.<init>((String)localObject2);
      throw paramContext;
    }
    return null;
  }
  
  private static int saveLayerAlphaCompat(Canvas paramCanvas, Rect paramRect, int paramInt)
  {
    RectF localRectF = transformAlphaRectF;
    localRectF.set(paramRect);
    return paramCanvas.saveLayerAlpha(localRectF, paramInt);
  }
  
  public static void transform(Canvas paramCanvas, Rect paramRect, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, CanvasCompat.CanvasOperation paramCanvasOperation)
  {
    if (paramInt <= 0) {
      return;
    }
    int i = paramCanvas.save();
    paramCanvas.translate(paramFloat1, paramFloat2);
    paramCanvas.scale(paramFloat3, paramFloat3);
    int j = 255;
    paramFloat1 = 3.573311E-043F;
    if (paramInt < j) {
      saveLayerAlphaCompat(paramCanvas, paramRect, paramInt);
    }
    paramCanvasOperation.run(paramCanvas);
    paramCanvas.restoreToCount(i);
  }
  
  public static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel paramShapeAppearanceModel1, ShapeAppearanceModel paramShapeAppearanceModel2, RectF paramRectF, TransitionUtils.CornerSizeBinaryOperator paramCornerSizeBinaryOperator)
  {
    boolean bool = isShapeAppearanceSignificant(paramShapeAppearanceModel1, paramRectF);
    if (bool) {
      paramRectF = paramShapeAppearanceModel1;
    } else {
      paramRectF = paramShapeAppearanceModel2;
    }
    paramRectF = paramRectF.toBuilder();
    CornerSize localCornerSize1 = paramShapeAppearanceModel1.getTopLeftCornerSize();
    CornerSize localCornerSize2 = paramShapeAppearanceModel2.getTopLeftCornerSize();
    localCornerSize1 = paramCornerSizeBinaryOperator.apply(localCornerSize1, localCornerSize2);
    paramRectF = paramRectF.setTopLeftCornerSize(localCornerSize1);
    localCornerSize1 = paramShapeAppearanceModel1.getTopRightCornerSize();
    localCornerSize2 = paramShapeAppearanceModel2.getTopRightCornerSize();
    localCornerSize1 = paramCornerSizeBinaryOperator.apply(localCornerSize1, localCornerSize2);
    paramRectF = paramRectF.setTopRightCornerSize(localCornerSize1);
    localCornerSize1 = paramShapeAppearanceModel1.getBottomLeftCornerSize();
    localCornerSize2 = paramShapeAppearanceModel2.getBottomLeftCornerSize();
    localCornerSize1 = paramCornerSizeBinaryOperator.apply(localCornerSize1, localCornerSize2);
    paramRectF = paramRectF.setBottomLeftCornerSize(localCornerSize1);
    paramShapeAppearanceModel1 = paramShapeAppearanceModel1.getBottomRightCornerSize();
    paramShapeAppearanceModel2 = paramShapeAppearanceModel2.getBottomRightCornerSize();
    paramShapeAppearanceModel1 = paramCornerSizeBinaryOperator.apply(paramShapeAppearanceModel1, paramShapeAppearanceModel2);
    return paramRectF.setBottomRightCornerSize(paramShapeAppearanceModel1).build();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.TransitionUtils
 * JD-Core Version:    0.7.0.1
 */