package com.google.android.material.transition.platform;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.PathMotion;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.core.util.Preconditions;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import m54207b69;

final class MaterialContainerTransform$TransitionDrawable
  extends Drawable
{
  private static final int COMPAT_SHADOW_COLOR = 8947848;
  private static final int SHADOW_COLOR = 754974720;
  private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3F;
  private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5F;
  private final MaterialShapeDrawable compatShadowDrawable;
  private final Paint containerPaint;
  private float currentElevation;
  private float currentElevationDy;
  private final RectF currentEndBounds;
  private final RectF currentEndBoundsMasked;
  private RectF currentMaskBounds;
  private final RectF currentStartBounds;
  private final RectF currentStartBoundsMasked;
  private final Paint debugPaint;
  private final Path debugPath;
  private final float displayHeight;
  private final float displayWidth;
  private final boolean drawDebugEnabled;
  private final boolean elevationShadowEnabled;
  private final RectF endBounds;
  private final Paint endContainerPaint;
  private final float endElevation;
  private final ShapeAppearanceModel endShapeAppearanceModel;
  private final View endView;
  private final boolean entering;
  private final FadeModeEvaluator fadeModeEvaluator;
  private FadeModeResult fadeModeResult;
  private final FitModeEvaluator fitModeEvaluator;
  private FitModeResult fitModeResult;
  private final MaskEvaluator maskEvaluator;
  private final float motionPathLength;
  private final PathMeasure motionPathMeasure;
  private final float[] motionPathPosition;
  private float progress;
  private final MaterialContainerTransform.ProgressThresholdsGroup progressThresholds;
  private final Paint scrimPaint;
  private final Paint shadowPaint;
  private final RectF startBounds;
  private final Paint startContainerPaint;
  private final float startElevation;
  private final ShapeAppearanceModel startShapeAppearanceModel;
  private final View startView;
  
  private MaterialContainerTransform$TransitionDrawable(PathMotion paramPathMotion, View paramView1, RectF paramRectF1, ShapeAppearanceModel paramShapeAppearanceModel1, float paramFloat1, View paramView2, RectF paramRectF2, ShapeAppearanceModel paramShapeAppearanceModel2, float paramFloat2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, FadeModeEvaluator paramFadeModeEvaluator, FitModeEvaluator paramFitModeEvaluator, MaterialContainerTransform.ProgressThresholdsGroup paramProgressThresholdsGroup, boolean paramBoolean3)
  {
    Paint localPaint1 = new android/graphics/Paint;
    localPaint1.<init>();
    this.containerPaint = localPaint1;
    Object localObject2 = new android/graphics/Paint;
    ((Paint)localObject2).<init>();
    this.startContainerPaint = ((Paint)localObject2);
    Object localObject3 = new android/graphics/Paint;
    ((Paint)localObject3).<init>();
    this.endContainerPaint = ((Paint)localObject3);
    Paint localPaint2 = new android/graphics/Paint;
    localPaint2.<init>();
    this.shadowPaint = localPaint2;
    localPaint2 = new android/graphics/Paint;
    localPaint2.<init>();
    this.scrimPaint = localPaint2;
    MaskEvaluator localMaskEvaluator = new com/google/android/material/transition/platform/MaskEvaluator;
    localMaskEvaluator.<init>();
    this.maskEvaluator = localMaskEvaluator;
    int i = 2;
    float[] arrayOfFloat = new float[i];
    this.motionPathPosition = arrayOfFloat;
    MaterialShapeDrawable localMaterialShapeDrawable = new com/google/android/material/shape/MaterialShapeDrawable;
    localMaterialShapeDrawable.<init>();
    this.compatShadowDrawable = localMaterialShapeDrawable;
    Paint localPaint3 = new android/graphics/Paint;
    localPaint3.<init>();
    this.debugPaint = localPaint3;
    Object localObject4 = new android/graphics/Path;
    ((Path)localObject4).<init>();
    this.debugPath = ((Path)localObject4);
    localObject4 = paramView1;
    this.startView = paramView1;
    this.startBounds = paramRectF1;
    this.startShapeAppearanceModel = paramShapeAppearanceModel1;
    this.startElevation = paramFloat1;
    this.endView = paramView2;
    this.endBounds = paramRectF2;
    Object localObject5 = paramShapeAppearanceModel2;
    this.endShapeAppearanceModel = paramShapeAppearanceModel2;
    this.endElevation = paramFloat2;
    this.entering = paramBoolean1;
    this.elevationShadowEnabled = paramBoolean2;
    localObject5 = paramFadeModeEvaluator;
    this.fadeModeEvaluator = paramFadeModeEvaluator;
    localObject5 = paramFitModeEvaluator;
    this.fitModeEvaluator = paramFitModeEvaluator;
    localObject5 = paramProgressThresholdsGroup;
    this.progressThresholds = paramProgressThresholdsGroup;
    this.drawDebugEnabled = paramBoolean3;
    localObject4 = paramView1.getContext();
    localObject5 = m54207b69.F54207b69_11("LM3A25252C263F");
    localObject4 = (WindowManager)((Context)localObject4).getSystemService((String)localObject5);
    localObject5 = new android/util/DisplayMetrics;
    ((DisplayMetrics)localObject5).<init>();
    ((WindowManager)localObject4).getDefaultDisplay().getMetrics((DisplayMetrics)localObject5);
    float f1 = ((DisplayMetrics)localObject5).widthPixels;
    this.displayWidth = f1;
    f1 = ((DisplayMetrics)localObject5).heightPixels;
    this.displayHeight = f1;
    localPaint1.setColor(paramInt1);
    ((Paint)localObject2).setColor(paramInt2);
    ((Paint)localObject3).setColor(paramInt3);
    localObject2 = ColorStateList.valueOf(0);
    localMaterialShapeDrawable.setFillColor((ColorStateList)localObject2);
    localMaterialShapeDrawable.setShadowCompatibilityMode(i);
    localMaterialShapeDrawable.setShadowBitmapDrawingEnable(false);
    localMaterialShapeDrawable.setShadowColor(-7829368);
    localObject2 = new android/graphics/RectF;
    ((RectF)localObject2).<init>(paramRectF1);
    this.currentStartBounds = ((RectF)localObject2);
    localObject3 = new android/graphics/RectF;
    ((RectF)localObject3).<init>((RectF)localObject2);
    this.currentStartBoundsMasked = ((RectF)localObject3);
    localObject3 = new android/graphics/RectF;
    ((RectF)localObject3).<init>((RectF)localObject2);
    this.currentEndBounds = ((RectF)localObject3);
    localObject2 = new android/graphics/RectF;
    ((RectF)localObject2).<init>((RectF)localObject3);
    this.currentEndBoundsMasked = ((RectF)localObject2);
    localObject2 = getMotionPathPoint(paramRectF1);
    localObject3 = getMotionPathPoint(paramRectF2);
    float f2 = ((PointF)localObject2).x;
    float f3 = ((PointF)localObject2).y;
    float f4 = ((PointF)localObject3).x;
    float f5 = ((PointF)localObject3).y;
    localObject4 = paramPathMotion;
    localObject2 = paramPathMotion.getPath(f2, f3, f4, f5);
    localObject3 = new android/graphics/PathMeasure;
    ((PathMeasure)localObject3).<init>((Path)localObject2, false);
    this.motionPathMeasure = ((PathMeasure)localObject3);
    f3 = ((PathMeasure)localObject3).getLength();
    this.motionPathLength = f3;
    f3 = paramRectF1.centerX();
    arrayOfFloat[0] = f3;
    float f6 = paramRectF1.top;
    arrayOfFloat[1] = f6;
    localObject1 = Paint.Style.FILL;
    localPaint2.setStyle((Paint.Style)localObject1);
    localObject1 = TransitionUtils.createColorShader(paramInt4);
    localPaint2.setShader((Shader)localObject1);
    localObject1 = Paint.Style.STROKE;
    localPaint3.setStyle((Paint.Style)localObject1);
    localPaint3.setStrokeWidth(10.0F);
    updateProgress(0.0F);
  }
  
  private static float calculateElevationDxMultiplier(RectF paramRectF, float paramFloat)
  {
    float f = paramRectF.centerX();
    paramFloat /= 2.0F;
    return (f / paramFloat - 1.0F) * 0.3F;
  }
  
  private static float calculateElevationDyMultiplier(RectF paramRectF, float paramFloat)
  {
    return paramRectF.centerY() / paramFloat * 1.5F;
  }
  
  private void drawDebugCumulativePath(Canvas paramCanvas, RectF paramRectF, Path paramPath, int paramInt)
  {
    paramRectF = getMotionPathPoint(paramRectF);
    float f1 = this.progress;
    boolean bool = f1 < 0.0F;
    float f3;
    if (!bool)
    {
      paramPath.reset();
      float f2 = paramRectF.x;
      f3 = paramRectF.y;
      paramPath.moveTo(f2, f3);
    }
    else
    {
      f1 = paramRectF.x;
      f3 = paramRectF.y;
      paramPath.lineTo(f1, f3);
      this.debugPaint.setColor(paramInt);
      paramRectF = this.debugPaint;
      paramCanvas.drawPath(paramPath, paramRectF);
    }
  }
  
  private void drawDebugRect(Canvas paramCanvas, RectF paramRectF, int paramInt)
  {
    this.debugPaint.setColor(paramInt);
    Paint localPaint = this.debugPaint;
    paramCanvas.drawRect(paramRectF, localPaint);
  }
  
  private void drawElevationShadow(Canvas paramCanvas)
  {
    paramCanvas.save();
    Path localPath = this.maskEvaluator.getPath();
    Region.Op localOp = Region.Op.DIFFERENCE;
    paramCanvas.clipPath(localPath, localOp);
    int i = Build.VERSION.SDK_INT;
    int j = 28;
    if (i > j) {
      drawElevationShadowWithPaintShadowLayer(paramCanvas);
    } else {
      drawElevationShadowWithMaterialShapeDrawable(paramCanvas);
    }
    paramCanvas.restore();
  }
  
  private void drawElevationShadowWithMaterialShapeDrawable(Canvas paramCanvas)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.compatShadowDrawable;
    Object localObject = this.currentMaskBounds;
    int i = (int)((RectF)localObject).left;
    int j = (int)((RectF)localObject).top;
    int k = (int)((RectF)localObject).right;
    int m = (int)((RectF)localObject).bottom;
    localMaterialShapeDrawable.setBounds(i, j, k, m);
    localMaterialShapeDrawable = this.compatShadowDrawable;
    float f = this.currentElevation;
    localMaterialShapeDrawable.setElevation(f);
    localMaterialShapeDrawable = this.compatShadowDrawable;
    m = (int)this.currentElevationDy;
    localMaterialShapeDrawable.setShadowVerticalOffset(m);
    localMaterialShapeDrawable = this.compatShadowDrawable;
    localObject = this.maskEvaluator.getCurrentShapeAppearanceModel();
    localMaterialShapeDrawable.setShapeAppearanceModel((ShapeAppearanceModel)localObject);
    this.compatShadowDrawable.draw(paramCanvas);
  }
  
  private void drawElevationShadowWithPaintShadowLayer(Canvas paramCanvas)
  {
    Object localObject1 = this.maskEvaluator.getCurrentShapeAppearanceModel();
    Object localObject2 = this.currentMaskBounds;
    boolean bool = ((ShapeAppearanceModel)localObject1).isRoundRect((RectF)localObject2);
    if (bool)
    {
      localObject1 = ((ShapeAppearanceModel)localObject1).getTopLeftCornerSize();
      localObject2 = this.currentMaskBounds;
      float f = ((CornerSize)localObject1).getCornerSize((RectF)localObject2);
      localObject2 = this.currentMaskBounds;
      Paint localPaint = this.shadowPaint;
      paramCanvas.drawRoundRect((RectF)localObject2, f, f, localPaint);
    }
    else
    {
      localObject1 = this.maskEvaluator.getPath();
      localObject2 = this.shadowPaint;
      paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
    }
  }
  
  private void drawEndView(Canvas paramCanvas)
  {
    Object localObject = this.endContainerPaint;
    maybeDrawContainerColor(paramCanvas, (Paint)localObject);
    Rect localRect = getBounds();
    localObject = this.currentEndBounds;
    float f1 = ((RectF)localObject).left;
    float f2 = ((RectF)localObject).top;
    float f3 = this.fitModeResult.endScale;
    int i = this.fadeModeResult.endAlpha;
    MaterialContainerTransform.TransitionDrawable.2 local2 = new com/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable$2;
    local2.<init>(this);
    TransitionUtils.transform(paramCanvas, localRect, f1, f2, f3, i, local2);
  }
  
  private void drawStartView(Canvas paramCanvas)
  {
    Object localObject = this.startContainerPaint;
    maybeDrawContainerColor(paramCanvas, (Paint)localObject);
    Rect localRect = getBounds();
    localObject = this.currentStartBounds;
    float f1 = ((RectF)localObject).left;
    float f2 = ((RectF)localObject).top;
    float f3 = this.fitModeResult.startScale;
    int i = this.fadeModeResult.startAlpha;
    MaterialContainerTransform.TransitionDrawable.1 local1 = new com/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable$1;
    local1.<init>(this);
    TransitionUtils.transform(paramCanvas, localRect, f1, f2, f3, i, local1);
  }
  
  private static PointF getMotionPathPoint(RectF paramRectF)
  {
    PointF localPointF = new android/graphics/PointF;
    float f1 = paramRectF.centerX();
    float f2 = paramRectF.top;
    localPointF.<init>(f1, f2);
    return localPointF;
  }
  
  private void maybeDrawContainerColor(Canvas paramCanvas, Paint paramPaint)
  {
    int i = paramPaint.getColor();
    if (i != 0)
    {
      i = paramPaint.getAlpha();
      if (i > 0)
      {
        Rect localRect = getBounds();
        paramCanvas.drawRect(localRect, paramPaint);
      }
    }
  }
  
  private void setProgress(float paramFloat)
  {
    float f = this.progress;
    boolean bool = f < paramFloat;
    if (bool) {
      updateProgress(paramFloat);
    }
  }
  
  private void updateProgress(float paramFloat)
  {
    this.progress = paramFloat;
    Object localObject1 = this.scrimPaint;
    boolean bool1 = this.entering;
    int j = 1132396544;
    float f1 = 255.0F;
    if (bool1) {
      f2 = TransitionUtils.lerp(0.0F, f1, paramFloat);
    } else {
      f2 = TransitionUtils.lerp(f1, 0.0F, paramFloat);
    }
    int i = (int)f2;
    ((Paint)localObject1).setAlpha(i);
    localObject1 = this.motionPathMeasure;
    float f2 = this.motionPathLength * paramFloat;
    Object localObject2 = this.motionPathPosition;
    float f3 = 0.0F;
    Object localObject3 = null;
    ((PathMeasure)localObject1).getPosTan(f2, (float[])localObject2, null);
    localObject1 = this.motionPathPosition;
    i = 0;
    f2 = 0.0F;
    Object localObject4 = null;
    f1 = localObject1[0];
    int k = 1;
    float f4 = 1.4E-45F;
    float f5 = localObject1[k];
    float f6 = 1.0F;
    boolean bool3 = paramFloat < f6;
    if (!bool3)
    {
      boolean bool4 = paramFloat < 0.0F;
      if (bool4) {}
    }
    float f7;
    float f8;
    for (;;)
    {
      f7 = f1;
      f8 = f5;
      break;
      int m;
      if (bool3)
      {
        f9 = (paramFloat - f6) / 0.009999991F;
        m = 1065185444;
        f10 = 0.99F;
      }
      else
      {
        m = 1008981770;
        f10 = 0.01F;
        f9 = paramFloat / f10;
        f7 = -1.0F;
        f9 *= f7;
      }
      PathMeasure localPathMeasure = this.motionPathMeasure;
      f8 = this.motionPathLength * f10;
      localPathMeasure.getPosTan(f8, (float[])localObject1, null);
      localObject1 = this.motionPathPosition;
      f2 = localObject1[0];
      f11 = localObject1[k];
      f2 = (f1 - f2) * f9;
      f1 += f2;
      f11 = (f5 - f11) * f9;
      f5 += f11;
    }
    f1 = ((Float)Preconditions.OooO0oo(Float.valueOf(MaterialContainerTransform.ProgressThresholds.access$1000(MaterialContainerTransform.ProgressThresholdsGroup.access$500(this.progressThresholds))))).floatValue();
    f3 = ((Float)Preconditions.OooO0oo(Float.valueOf(MaterialContainerTransform.ProgressThresholds.access$1100(MaterialContainerTransform.ProgressThresholdsGroup.access$500(this.progressThresholds))))).floatValue();
    localObject1 = this.fitModeEvaluator;
    f4 = this.startBounds.width();
    f5 = this.startBounds.height();
    float f9 = this.endBounds.width();
    float f10 = this.endBounds.height();
    f2 = paramFloat;
    localObject1 = ((FitModeEvaluator)localObject1).evaluate(paramFloat, f1, f3, f4, f5, f9, f10);
    this.fitModeResult = ((FitModeResult)localObject1);
    localObject4 = this.currentStartBounds;
    f1 = ((FitModeResult)localObject1).currentStartWidth;
    f3 = 2.0F;
    f4 = f1 / f3;
    f4 = f7 - f4;
    f1 = f1 / f3 + f7;
    float f11 = ((FitModeResult)localObject1).currentStartHeight + f8;
    ((RectF)localObject4).set(f4, f8, f1, f11);
    localObject1 = this.currentEndBounds;
    localObject4 = this.fitModeResult;
    f1 = ((FitModeResult)localObject4).currentEndWidth;
    f4 = f1 / f3;
    f4 = f7 - f4;
    f1 /= f3;
    f7 += f1;
    f2 = ((FitModeResult)localObject4).currentEndHeight + f8;
    ((RectF)localObject1).set(f4, f8, f7, f2);
    localObject1 = this.currentStartBoundsMasked;
    localObject4 = this.currentStartBounds;
    ((RectF)localObject1).set((RectF)localObject4);
    localObject1 = this.currentEndBoundsMasked;
    localObject4 = this.currentEndBounds;
    ((RectF)localObject1).set((RectF)localObject4);
    localObject1 = (Float)Preconditions.OooO0oo(Float.valueOf(MaterialContainerTransform.ProgressThresholds.access$1000(MaterialContainerTransform.ProgressThresholdsGroup.access$600(this.progressThresholds))));
    f11 = ((Float)localObject1).floatValue();
    localObject4 = (Float)Preconditions.OooO0oo(Float.valueOf(MaterialContainerTransform.ProgressThresholds.access$1100(MaterialContainerTransform.ProgressThresholdsGroup.access$600(this.progressThresholds))));
    f2 = ((Float)localObject4).floatValue();
    localObject2 = this.fitModeEvaluator;
    localObject3 = this.fitModeResult;
    boolean bool2 = ((FitModeEvaluator)localObject2).shouldMaskStartBounds((FitModeResult)localObject3);
    if (bool2) {
      localObject3 = this.currentStartBoundsMasked;
    } else {
      localObject3 = this.currentEndBoundsMasked;
    }
    f11 = TransitionUtils.lerp(0.0F, f6, f11, f2, paramFloat);
    if (!bool2) {
      f11 = f6 - f11;
    }
    localObject4 = this.fitModeEvaluator;
    localObject2 = this.fitModeResult;
    ((FitModeEvaluator)localObject4).applyMask((RectF)localObject3, f11, (FitModeResult)localObject2);
    localObject1 = new android/graphics/RectF;
    f2 = this.currentStartBoundsMasked.left;
    f1 = this.currentEndBoundsMasked.left;
    f2 = Math.min(f2, f1);
    f1 = this.currentStartBoundsMasked.top;
    f3 = this.currentEndBoundsMasked.top;
    f1 = Math.min(f1, f3);
    f3 = this.currentStartBoundsMasked.right;
    f4 = this.currentEndBoundsMasked.right;
    f3 = Math.max(f3, f4);
    f4 = this.currentStartBoundsMasked.bottom;
    f5 = this.currentEndBoundsMasked.bottom;
    f4 = Math.max(f4, f5);
    ((RectF)localObject1).<init>(f2, f1, f3, f4);
    this.currentMaskBounds = ((RectF)localObject1);
    localObject1 = this.maskEvaluator;
    localObject2 = this.startShapeAppearanceModel;
    localObject3 = this.endShapeAppearanceModel;
    RectF localRectF1 = this.currentStartBounds;
    RectF localRectF2 = this.currentStartBoundsMasked;
    RectF localRectF3 = this.currentEndBoundsMasked;
    MaterialContainerTransform.ProgressThresholds localProgressThresholds = MaterialContainerTransform.ProgressThresholdsGroup.access$700(this.progressThresholds);
    f2 = paramFloat;
    ((MaskEvaluator)localObject1).evaluate(paramFloat, (ShapeAppearanceModel)localObject2, (ShapeAppearanceModel)localObject3, localRectF1, localRectF2, localRectF3, localProgressThresholds);
    f11 = this.startElevation;
    f2 = this.endElevation;
    f11 = TransitionUtils.lerp(f11, f2, paramFloat);
    this.currentElevation = f11;
    localObject1 = this.currentMaskBounds;
    f2 = this.displayWidth;
    f11 = calculateElevationDxMultiplier((RectF)localObject1, f2);
    localObject4 = this.currentMaskBounds;
    f1 = this.displayHeight;
    f2 = calculateElevationDyMultiplier((RectF)localObject4, f1);
    f1 = this.currentElevation;
    f11 = (int)(f11 * f1);
    i = (int)(f2 * f1);
    f2 = i;
    this.currentElevationDy = f2;
    localObject3 = this.shadowPaint;
    k = 754974720;
    f4 = 7.275958E-012F;
    ((Paint)localObject3).setShadowLayer(f1, f11, f2, k);
    f11 = ((Float)Preconditions.OooO0oo(Float.valueOf(MaterialContainerTransform.ProgressThresholds.access$1000(MaterialContainerTransform.ProgressThresholdsGroup.access$400(this.progressThresholds))))).floatValue();
    localObject4 = (Float)Preconditions.OooO0oo(Float.valueOf(MaterialContainerTransform.ProgressThresholds.access$1100(MaterialContainerTransform.ProgressThresholdsGroup.access$400(this.progressThresholds))));
    f2 = ((Float)localObject4).floatValue();
    localObject2 = this.fadeModeEvaluator;
    f3 = 0.35F;
    localObject1 = ((FadeModeEvaluator)localObject2).evaluate(paramFloat, f11, f2, f3);
    this.fadeModeResult = ((FadeModeResult)localObject1);
    localObject1 = this.startContainerPaint;
    int n = ((Paint)localObject1).getColor();
    if (n != 0)
    {
      localObject1 = this.startContainerPaint;
      localObject4 = this.fadeModeResult;
      i = ((FadeModeResult)localObject4).startAlpha;
      ((Paint)localObject1).setAlpha(i);
    }
    localObject1 = this.endContainerPaint;
    n = ((Paint)localObject1).getColor();
    if (n != 0)
    {
      localObject1 = this.endContainerPaint;
      localObject4 = this.fadeModeResult;
      i = ((FadeModeResult)localObject4).endAlpha;
      ((Paint)localObject1).setAlpha(i);
    }
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject1 = this.scrimPaint;
    int i = ((Paint)localObject1).getAlpha();
    if (i > 0)
    {
      localObject1 = getBounds();
      localObject2 = this.scrimPaint;
      paramCanvas.drawRect((Rect)localObject1, (Paint)localObject2);
    }
    boolean bool1 = this.drawDebugEnabled;
    int j;
    if (bool1) {
      j = paramCanvas.save();
    } else {
      j = -1;
    }
    boolean bool2 = this.elevationShadowEnabled;
    float f;
    int m;
    if (bool2)
    {
      f = this.currentElevation;
      m = 0;
      bool2 = f < 0.0F;
      if (bool2) {
        drawElevationShadow(paramCanvas);
      }
    }
    this.maskEvaluator.clip(paramCanvas);
    Object localObject2 = this.containerPaint;
    maybeDrawContainerColor(paramCanvas, (Paint)localObject2);
    localObject2 = this.fadeModeResult;
    bool2 = ((FadeModeResult)localObject2).endOnTop;
    if (bool2)
    {
      drawStartView(paramCanvas);
      drawEndView(paramCanvas);
    }
    else
    {
      drawEndView(paramCanvas);
      drawStartView(paramCanvas);
    }
    bool2 = this.drawDebugEnabled;
    if (bool2)
    {
      paramCanvas.restoreToCount(j);
      localObject1 = this.currentStartBounds;
      localObject2 = this.debugPath;
      m = -65281;
      drawDebugCumulativePath(paramCanvas, (RectF)localObject1, (Path)localObject2, m);
      localObject1 = this.currentStartBoundsMasked;
      drawDebugRect(paramCanvas, (RectF)localObject1, -256);
      localObject1 = this.currentStartBounds;
      drawDebugRect(paramCanvas, (RectF)localObject1, -16711936);
      localObject1 = this.currentEndBoundsMasked;
      drawDebugRect(paramCanvas, (RectF)localObject1, -16711681);
      localObject1 = this.currentEndBounds;
      int k = -16776961;
      f = -1.701464E+038F;
      drawDebugRect(paramCanvas, (RectF)localObject1, k);
    }
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void setAlpha(int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("|u261103042020185C1C220F282062282A652D18682F2F176C1E191F2036241F2F31");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    paramColorFilter = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("WD17223233312F296B2D6D313634384473323E3A43354B7A444F7D44464C81555054554D59544646");
    paramColorFilter.<init>(str);
    throw paramColorFilter;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable
 * JD-Core Version:    0.7.0.1
 */