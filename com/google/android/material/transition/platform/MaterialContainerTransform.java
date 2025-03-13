package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import com.google.android.material.shape.Shapeable;
import java.util.Map;
import m54207b69;

public final class MaterialContainerTransform
  extends Transition
{
  private static final MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS;
  private static final MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC;
  private static final MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS;
  private static final MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC;
  private static final float ELEVATION_NOT_SET = -1.0F;
  public static final int FADE_MODE_CROSS = 2;
  public static final int FADE_MODE_IN = 0;
  public static final int FADE_MODE_OUT = 1;
  public static final int FADE_MODE_THROUGH = 3;
  public static final int FIT_MODE_AUTO = 0;
  public static final int FIT_MODE_HEIGHT = 2;
  public static final int FIT_MODE_WIDTH = 1;
  private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
  private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
  private static final String TAG = "MaterialContainerTransform";
  public static final int TRANSITION_DIRECTION_AUTO = 0;
  public static final int TRANSITION_DIRECTION_ENTER = 1;
  public static final int TRANSITION_DIRECTION_RETURN = 2;
  private static final String[] TRANSITION_PROPS;
  private boolean appliedThemeValues = false;
  private int containerColor;
  private boolean drawDebugEnabled = false;
  private int drawingViewId = 16908290;
  private boolean elevationShadowEnabled;
  private int endContainerColor;
  private float endElevation;
  private ShapeAppearanceModel endShapeAppearanceModel;
  private View endView;
  private int endViewId;
  private int fadeMode;
  private MaterialContainerTransform.ProgressThresholds fadeProgressThresholds;
  private int fitMode;
  private boolean holdAtEndEnabled = false;
  private boolean pathMotionCustom = false;
  private MaterialContainerTransform.ProgressThresholds scaleMaskProgressThresholds;
  private MaterialContainerTransform.ProgressThresholds scaleProgressThresholds;
  private int scrimColor;
  private MaterialContainerTransform.ProgressThresholds shapeMaskProgressThresholds;
  private int startContainerColor;
  private float startElevation;
  private ShapeAppearanceModel startShapeAppearanceModel;
  private View startView;
  private int startViewId;
  private int transitionDirection;
  
  static
  {
    Object localObject1 = m54207b69.F54207b69_11("5[363B31412D37403E203D3F3A463F434D39203B4D493D48464A4D4F7C55514C545F49");
    Object localObject2 = m54207b69.F54207b69_11("1W3A37253529433C421C41432E424B4741351437494D39543A56515388405C54465237494A565B4B5D615D5C");
    TRANSITION_PROPS = new String[] { localObject1, localObject2 };
    localObject1 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;
    MaterialContainerTransform.ProgressThresholds localProgressThresholds1 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds1.<init>(0.0F, 0.25F);
    MaterialContainerTransform.ProgressThresholds localProgressThresholds2 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    float f1 = 1.0F;
    localProgressThresholds2.<init>(0.0F, f1);
    MaterialContainerTransform.ProgressThresholds localProgressThresholds3 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds3.<init>(0.0F, f1);
    MaterialContainerTransform.ProgressThresholds localProgressThresholds4 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds4.<init>(0.0F, 0.75F);
    localObject2 = localObject1;
    ((MaterialContainerTransform.ProgressThresholdsGroup)localObject1).<init>(localProgressThresholds1, localProgressThresholds2, localProgressThresholds3, localProgressThresholds4, null);
    DEFAULT_ENTER_THRESHOLDS = (MaterialContainerTransform.ProgressThresholdsGroup)localObject1;
    localObject1 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;
    MaterialContainerTransform.ProgressThresholds localProgressThresholds5 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    float f2 = 0.6F;
    float f3 = 0.9F;
    localProgressThresholds5.<init>(f2, f3);
    MaterialContainerTransform.ProgressThresholds localProgressThresholds6 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds6.<init>(0.0F, f1);
    MaterialContainerTransform.ProgressThresholds localProgressThresholds7 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds7.<init>(0.0F, f3);
    MaterialContainerTransform.ProgressThresholds localProgressThresholds8 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds8.<init>(0.3F, f3);
    ((MaterialContainerTransform.ProgressThresholdsGroup)localObject1).<init>(localProgressThresholds5, localProgressThresholds6, localProgressThresholds7, localProgressThresholds8, null);
    DEFAULT_RETURN_THRESHOLDS = (MaterialContainerTransform.ProgressThresholdsGroup)localObject1;
    localObject1 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;
    localProgressThresholds2 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    float f4 = 0.1F;
    localProgressThresholds2.<init>(f4, 0.4F);
    localProgressThresholds3 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds3.<init>(f4, f1);
    MaterialContainerTransform.ProgressThresholds localProgressThresholds9 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds9.<init>(f4, f1);
    MaterialContainerTransform.ProgressThresholds localProgressThresholds10 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds10.<init>(f4, f3);
    ((MaterialContainerTransform.ProgressThresholdsGroup)localObject1).<init>(localProgressThresholds2, localProgressThresholds3, localProgressThresholds9, localProgressThresholds10, null);
    DEFAULT_ENTER_THRESHOLDS_ARC = (MaterialContainerTransform.ProgressThresholdsGroup)localObject1;
    localObject1 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;
    localProgressThresholds5 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds5.<init>(f2, f3);
    localProgressThresholds6 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds6.<init>(0.0F, f3);
    localProgressThresholds7 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds7.<init>(0.0F, f3);
    localProgressThresholds8 = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
    localProgressThresholds8.<init>(0.2F, f3);
    ((MaterialContainerTransform.ProgressThresholdsGroup)localObject1).<init>(localProgressThresholds5, localProgressThresholds6, localProgressThresholds7, localProgressThresholds8, null);
    DEFAULT_RETURN_THRESHOLDS_ARC = (MaterialContainerTransform.ProgressThresholdsGroup)localObject1;
  }
  
  public MaterialContainerTransform()
  {
    int i = -1;
    this.startViewId = i;
    this.endViewId = i;
    this.containerColor = 0;
    this.startContainerColor = 0;
    this.endContainerColor = 0;
    this.scrimColor = 1375731712;
    this.transitionDirection = 0;
    this.fadeMode = 0;
    this.fitMode = 0;
    this.elevationShadowEnabled = true;
    float f = -1.0F;
    this.startElevation = f;
    this.endElevation = f;
  }
  
  public MaterialContainerTransform(Context paramContext, boolean paramBoolean)
  {
    int i = -1;
    this.startViewId = i;
    this.endViewId = i;
    this.containerColor = 0;
    this.startContainerColor = 0;
    this.endContainerColor = 0;
    this.scrimColor = 1375731712;
    this.transitionDirection = 0;
    this.fadeMode = 0;
    this.fitMode = 0;
    boolean bool = true;
    this.elevationShadowEnabled = bool;
    float f = -1.0F;
    this.startElevation = f;
    this.endElevation = f;
    maybeApplyThemeValues(paramContext, paramBoolean);
    this.appliedThemeValues = bool;
  }
  
  private MaterialContainerTransform.ProgressThresholdsGroup buildThresholdsGroup(boolean paramBoolean)
  {
    Object localObject = getPathMotion();
    boolean bool1 = localObject instanceof ArcMotion;
    if (!bool1)
    {
      boolean bool2 = localObject instanceof MaterialArcMotion;
      if (!bool2) {
        localObject = DEFAULT_ENTER_THRESHOLDS;
      }
    }
    for (MaterialContainerTransform.ProgressThresholdsGroup localProgressThresholdsGroup = DEFAULT_RETURN_THRESHOLDS;; localProgressThresholdsGroup = DEFAULT_RETURN_THRESHOLDS_ARC)
    {
      return getThresholdsOrDefault(paramBoolean, (MaterialContainerTransform.ProgressThresholdsGroup)localObject, localProgressThresholdsGroup);
      localObject = DEFAULT_ENTER_THRESHOLDS_ARC;
    }
  }
  
  private static RectF calculateDrawableBounds(View paramView1, View paramView2, float paramFloat1, float paramFloat2)
  {
    if (paramView2 != null)
    {
      paramView1 = TransitionUtils.getLocationOnScreen(paramView2);
      paramView1.offset(paramFloat1, paramFloat2);
      return paramView1;
    }
    paramView2 = new android/graphics/RectF;
    paramFloat1 = paramView1.getWidth();
    float f = paramView1.getHeight();
    paramView2.<init>(0.0F, 0.0F, paramFloat1, f);
    return paramView2;
  }
  
  private static ShapeAppearanceModel captureShapeAppearance(View paramView, RectF paramRectF, ShapeAppearanceModel paramShapeAppearanceModel)
  {
    return TransitionUtils.convertToRelativeCornerSizes(getShapeAppearance(paramView, paramShapeAppearanceModel), paramRectF);
  }
  
  private static void captureValues(TransitionValues paramTransitionValues, View paramView, int paramInt, ShapeAppearanceModel paramShapeAppearanceModel)
  {
    int i = -1;
    if (paramInt != i) {
      paramView = TransitionUtils.findDescendantOrAncestorById(paramTransitionValues.view, paramInt);
    }
    for (;;)
    {
      paramTransitionValues.view = paramView;
      break;
      if (paramView == null)
      {
        paramView = paramTransitionValues.view;
        paramInt = R.id.mtrl_motion_snapshot_view;
        paramView = paramView.getTag(paramInt);
        boolean bool = paramView instanceof View;
        if (!bool) {
          break;
        }
        paramView = paramTransitionValues.view;
        paramInt = R.id.mtrl_motion_snapshot_view;
        paramView = (View)paramView.getTag(paramInt);
        localObject1 = paramTransitionValues.view;
        i = R.id.mtrl_motion_snapshot_view;
        str = null;
        ((View)localObject1).setTag(i, null);
      }
    }
    paramView = paramTransitionValues.view;
    paramInt = ViewCompat.OoooOOO(paramView);
    if (paramInt == 0)
    {
      paramInt = paramView.getWidth();
      if (paramInt == 0)
      {
        paramInt = paramView.getHeight();
        if (paramInt == 0) {
          return;
        }
      }
    }
    Object localObject1 = paramView.getParent();
    if (localObject1 == null) {
      localObject1 = TransitionUtils.getRelativeBounds(paramView);
    } else {
      localObject1 = TransitionUtils.getLocationOnScreen(paramView);
    }
    Object localObject2 = paramTransitionValues.values;
    String str = m54207b69.F54207b69_11("5[363B31412D37403E203D3F3A463F434D39203B4D493D48464A4D4F7C55514C545F49");
    ((Map)localObject2).put(str, localObject1);
    paramTransitionValues = paramTransitionValues.values;
    localObject2 = m54207b69.F54207b69_11("1W3A37253529433C421C41432E424B4741351437494D39543A56515388405C54465237494A565B4B5D615D5C");
    paramView = captureShapeAppearance(paramView, (RectF)localObject1, paramShapeAppearanceModel);
    paramTransitionValues.put(localObject2, paramView);
  }
  
  private static float getElevationOrDefault(float paramFloat, View paramView)
  {
    float f = -1.0F;
    boolean bool = paramFloat < f;
    if (!bool) {
      paramFloat = ViewCompat.OooOo0O(paramView);
    }
    return paramFloat;
  }
  
  private static ShapeAppearanceModel getShapeAppearance(View paramView, ShapeAppearanceModel paramShapeAppearanceModel)
  {
    if (paramShapeAppearanceModel != null) {
      return paramShapeAppearanceModel;
    }
    int i = R.id.mtrl_motion_snapshot_view;
    paramShapeAppearanceModel = paramView.getTag(i);
    boolean bool1 = paramShapeAppearanceModel instanceof ShapeAppearanceModel;
    if (bool1)
    {
      int j = R.id.mtrl_motion_snapshot_view;
      return (ShapeAppearanceModel)paramView.getTag(j);
    }
    paramShapeAppearanceModel = paramView.getContext();
    int k = getTransitionShapeAppearanceResId(paramShapeAppearanceModel);
    int m = -1;
    if (k != m) {
      return ShapeAppearanceModel.builder(paramShapeAppearanceModel, k, 0).build();
    }
    boolean bool2 = paramView instanceof Shapeable;
    if (bool2) {
      return ((Shapeable)paramView).getShapeAppearanceModel();
    }
    return ShapeAppearanceModel.builder().build();
  }
  
  private MaterialContainerTransform.ProgressThresholdsGroup getThresholdsOrDefault(boolean paramBoolean, MaterialContainerTransform.ProgressThresholdsGroup paramProgressThresholdsGroup1, MaterialContainerTransform.ProgressThresholdsGroup paramProgressThresholdsGroup2)
  {
    if (!paramBoolean) {
      paramProgressThresholdsGroup1 = paramProgressThresholdsGroup2;
    }
    MaterialContainerTransform.ProgressThresholdsGroup localProgressThresholdsGroup = new com/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;
    paramProgressThresholdsGroup2 = this.fadeProgressThresholds;
    Object localObject1 = MaterialContainerTransform.ProgressThresholdsGroup.access$400(paramProgressThresholdsGroup1);
    paramProgressThresholdsGroup2 = TransitionUtils.defaultIfNull(paramProgressThresholdsGroup2, localObject1);
    Object localObject2 = paramProgressThresholdsGroup2;
    localObject2 = (MaterialContainerTransform.ProgressThresholds)paramProgressThresholdsGroup2;
    paramProgressThresholdsGroup2 = this.scaleProgressThresholds;
    localObject1 = MaterialContainerTransform.ProgressThresholdsGroup.access$500(paramProgressThresholdsGroup1);
    paramProgressThresholdsGroup2 = TransitionUtils.defaultIfNull(paramProgressThresholdsGroup2, localObject1);
    Object localObject3 = paramProgressThresholdsGroup2;
    localObject3 = (MaterialContainerTransform.ProgressThresholds)paramProgressThresholdsGroup2;
    paramProgressThresholdsGroup2 = this.scaleMaskProgressThresholds;
    localObject1 = MaterialContainerTransform.ProgressThresholdsGroup.access$600(paramProgressThresholdsGroup1);
    paramProgressThresholdsGroup2 = TransitionUtils.defaultIfNull(paramProgressThresholdsGroup2, localObject1);
    Object localObject4 = paramProgressThresholdsGroup2;
    localObject4 = (MaterialContainerTransform.ProgressThresholds)paramProgressThresholdsGroup2;
    paramProgressThresholdsGroup2 = this.shapeMaskProgressThresholds;
    paramProgressThresholdsGroup1 = MaterialContainerTransform.ProgressThresholdsGroup.access$700(paramProgressThresholdsGroup1);
    paramProgressThresholdsGroup1 = TransitionUtils.defaultIfNull(paramProgressThresholdsGroup2, paramProgressThresholdsGroup1);
    Object localObject5 = paramProgressThresholdsGroup1;
    localObject5 = (MaterialContainerTransform.ProgressThresholds)paramProgressThresholdsGroup1;
    localObject1 = localProgressThresholdsGroup;
    localProgressThresholdsGroup.<init>((MaterialContainerTransform.ProgressThresholds)localObject2, (MaterialContainerTransform.ProgressThresholds)localObject3, (MaterialContainerTransform.ProgressThresholds)localObject4, (MaterialContainerTransform.ProgressThresholds)localObject5, null);
    return localProgressThresholdsGroup;
  }
  
  private static int getTransitionShapeAppearanceResId(Context paramContext)
  {
    int i = R.attr.transitionShapeAppearance;
    int[] arrayOfInt = { i };
    paramContext = paramContext.obtainStyledAttributes(arrayOfInt);
    i = paramContext.getResourceId(0, -1);
    paramContext.recycle();
    return i;
  }
  
  private boolean isEntering(RectF paramRectF1, RectF paramRectF2)
  {
    int i = this.transitionDirection;
    boolean bool1 = false;
    int j = 1;
    if (i != 0)
    {
      if (i != j)
      {
        int k = 2;
        f1 = 2.802597E-045F;
        if (i == k) {
          return false;
        }
        paramRectF1 = new java/lang/IllegalArgumentException;
        paramRectF2 = new java/lang/StringBuilder;
        paramRectF2.<init>();
        String str = m54207b69.F54207b69_11("?97058515B5955632055546262565D5B5F66682B7064607271656970721F36");
        paramRectF2.append(str);
        i = this.transitionDirection;
        paramRectF2.append(i);
        paramRectF2 = paramRectF2.toString();
        paramRectF1.<init>(paramRectF2);
        throw paramRectF1;
      }
      return j;
    }
    float f2 = TransitionUtils.calculateArea(paramRectF2);
    float f1 = TransitionUtils.calculateArea(paramRectF1);
    boolean bool2 = f2 < f1;
    if (bool2) {
      bool1 = j;
    }
    return bool1;
  }
  
  private void maybeApplyThemeValues(Context paramContext, boolean paramBoolean)
  {
    int i = R.attr.motionEasingEmphasizedInterpolator;
    TimeInterpolator localTimeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    TransitionUtils.maybeApplyThemeInterpolator(this, paramContext, i, localTimeInterpolator);
    if (paramBoolean) {
      paramBoolean = R.attr.motionDurationLong2;
    } else {
      paramBoolean = R.attr.motionDurationMedium4;
    }
    TransitionUtils.maybeApplyThemeDuration(this, paramContext, paramBoolean);
    paramBoolean = this.pathMotionCustom;
    if (!paramBoolean)
    {
      paramBoolean = R.attr.motionPath;
      TransitionUtils.maybeApplyThemePath(this, paramContext, paramBoolean);
    }
  }
  
  public void captureEndValues(TransitionValues paramTransitionValues)
  {
    View localView = this.endView;
    int i = this.endViewId;
    ShapeAppearanceModel localShapeAppearanceModel = this.endShapeAppearanceModel;
    captureValues(paramTransitionValues, localView, i, localShapeAppearanceModel);
  }
  
  public void captureStartValues(TransitionValues paramTransitionValues)
  {
    View localView = this.startView;
    int i = this.startViewId;
    ShapeAppearanceModel localShapeAppearanceModel = this.startShapeAppearanceModel;
    captureValues(paramTransitionValues, localView, i, localShapeAppearanceModel);
  }
  
  public Animator createAnimator(ViewGroup paramViewGroup, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    MaterialContainerTransform localMaterialContainerTransform = this;
    Object localObject1 = paramTransitionValues1;
    Object localObject2 = paramTransitionValues2;
    View localView = null;
    if ((paramTransitionValues1 != null) && (paramTransitionValues2 != null))
    {
      Object localObject3 = paramTransitionValues1.values;
      Object localObject4 = m54207b69.F54207b69_11("5[363B31412D37403E203D3F3A463F434D39203B4D493D48464A4D4F7C55514C545F49");
      localObject3 = ((Map)localObject3).get(localObject4);
      Object localObject5 = localObject3;
      localObject5 = (RectF)localObject3;
      localObject3 = paramTransitionValues1.values;
      Object localObject6 = m54207b69.F54207b69_11("1W3A37253529433C421C41432E424B4741351437494D39543A56515388405C54465237494A565B4B5D615D5C");
      localObject3 = ((Map)localObject3).get(localObject6);
      Object localObject7 = localObject3;
      localObject7 = (ShapeAppearanceModel)localObject3;
      if ((localObject5 != null) && (localObject7 != null))
      {
        localObject3 = paramTransitionValues2.values.get(localObject4);
        Object localObject8 = localObject3;
        localObject8 = (RectF)localObject3;
        localObject3 = paramTransitionValues2.values.get(localObject6);
        Object localObject9 = localObject3;
        localObject9 = (ShapeAppearanceModel)localObject3;
        if ((localObject8 != null) && (localObject9 != null))
        {
          localObject4 = paramTransitionValues1.view;
          localObject6 = paramTransitionValues2.view;
          localObject1 = ((View)localObject6).getParent();
          if (localObject1 != null) {
            localObject1 = localObject6;
          } else {
            localObject1 = localObject4;
          }
          int i = localMaterialContainerTransform.drawingViewId;
          int j = ((View)localObject1).getId();
          if (i == j)
          {
            localView = (View)((View)localObject1).getParent();
            localObject2 = localObject1;
          }
          else
          {
            i = localMaterialContainerTransform.drawingViewId;
            localView = TransitionUtils.findAncestorById((View)localObject1, i);
            i = 0;
            localObject2 = null;
          }
          localObject3 = TransitionUtils.getLocationOnScreen(localView);
          float f1 = -((RectF)localObject3).left;
          float f2 = -((RectF)localObject3).top;
          localObject2 = calculateDrawableBounds(localView, (View)localObject2, f1, f2);
          ((RectF)localObject5).offset(f1, f2);
          ((RectF)localObject8).offset(f1, f2);
          boolean bool1 = localMaterialContainerTransform.isEntering((RectF)localObject5, (RectF)localObject8);
          boolean bool2 = localMaterialContainerTransform.appliedThemeValues;
          if (!bool2)
          {
            localObject1 = ((View)localObject1).getContext();
            localMaterialContainerTransform.maybeApplyThemeValues((Context)localObject1, bool1);
          }
          localObject1 = new com/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;
          Object localObject10 = localObject1;
          Object localObject11 = getPathMotion();
          float f3 = getElevationOrDefault(localMaterialContainerTransform.startElevation, (View)localObject4);
          float f4 = getElevationOrDefault(localMaterialContainerTransform.endElevation, (View)localObject6);
          int n = localMaterialContainerTransform.containerColor;
          int i1 = localMaterialContainerTransform.startContainerColor;
          int i2 = localMaterialContainerTransform.endContainerColor;
          int i3 = localMaterialContainerTransform.scrimColor;
          boolean bool3 = localMaterialContainerTransform.elevationShadowEnabled;
          FadeModeEvaluator localFadeModeEvaluator = FadeModeEvaluators.get(localMaterialContainerTransform.fadeMode, bool1);
          FitModeEvaluator localFitModeEvaluator = FitModeEvaluators.get(localMaterialContainerTransform.fitMode, bool1, (RectF)localObject5, (RectF)localObject8);
          MaterialContainerTransform.ProgressThresholdsGroup localProgressThresholdsGroup = localMaterialContainerTransform.buildThresholdsGroup(bool1);
          boolean bool4 = localMaterialContainerTransform.drawDebugEnabled;
          ((MaterialContainerTransform.TransitionDrawable)localObject1).<init>((PathMotion)localObject11, (View)localObject4, (RectF)localObject5, (ShapeAppearanceModel)localObject7, f3, (View)localObject6, (RectF)localObject8, (ShapeAppearanceModel)localObject9, f4, n, i1, i2, i3, bool1, bool3, localFadeModeEvaluator, localFitModeEvaluator, localProgressThresholdsGroup, bool4, null);
          int k = Math.round(((RectF)localObject2).left);
          int m = Math.round(((RectF)localObject2).top);
          int i4 = Math.round(((RectF)localObject2).right);
          i = Math.round(((RectF)localObject2).bottom);
          ((Drawable)localObject1).setBounds(k, m, i4, i);
          localObject2 = new float[2];
          Object tmp577_575 = localObject2;
          tmp577_575[0] = 0.0F;
          tmp577_575[1] = 1.0F;
          localObject10 = ValueAnimator.ofFloat((float[])localObject2);
          localObject2 = new com/google/android/material/transition/platform/MaterialContainerTransform$1;
          ((MaterialContainerTransform.1)localObject2).<init>(localMaterialContainerTransform, (MaterialContainerTransform.TransitionDrawable)localObject1);
          ((ValueAnimator)localObject10).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
          localObject11 = new com/google/android/material/transition/platform/MaterialContainerTransform$2;
          localObject3 = localObject1;
          localObject1 = localObject11;
          localObject2 = this;
          ((MaterialContainerTransform.2)localObject11).<init>(this, localView, (MaterialContainerTransform.TransitionDrawable)localObject3, (View)localObject4, (View)localObject6);
          localMaterialContainerTransform.addListener((Transition.TransitionListener)localObject11);
          return localObject10;
        }
      }
    }
    return null;
  }
  
  public int getContainerColor()
  {
    return this.containerColor;
  }
  
  public int getDrawingViewId()
  {
    return this.drawingViewId;
  }
  
  public int getEndContainerColor()
  {
    return this.endContainerColor;
  }
  
  public float getEndElevation()
  {
    return this.endElevation;
  }
  
  public ShapeAppearanceModel getEndShapeAppearanceModel()
  {
    return this.endShapeAppearanceModel;
  }
  
  public View getEndView()
  {
    return this.endView;
  }
  
  public int getEndViewId()
  {
    return this.endViewId;
  }
  
  public int getFadeMode()
  {
    return this.fadeMode;
  }
  
  public MaterialContainerTransform.ProgressThresholds getFadeProgressThresholds()
  {
    return this.fadeProgressThresholds;
  }
  
  public int getFitMode()
  {
    return this.fitMode;
  }
  
  public MaterialContainerTransform.ProgressThresholds getScaleMaskProgressThresholds()
  {
    return this.scaleMaskProgressThresholds;
  }
  
  public MaterialContainerTransform.ProgressThresholds getScaleProgressThresholds()
  {
    return this.scaleProgressThresholds;
  }
  
  public int getScrimColor()
  {
    return this.scrimColor;
  }
  
  public MaterialContainerTransform.ProgressThresholds getShapeMaskProgressThresholds()
  {
    return this.shapeMaskProgressThresholds;
  }
  
  public int getStartContainerColor()
  {
    return this.startContainerColor;
  }
  
  public float getStartElevation()
  {
    return this.startElevation;
  }
  
  public ShapeAppearanceModel getStartShapeAppearanceModel()
  {
    return this.startShapeAppearanceModel;
  }
  
  public View getStartView()
  {
    return this.startView;
  }
  
  public int getStartViewId()
  {
    return this.startViewId;
  }
  
  public int getTransitionDirection()
  {
    return this.transitionDirection;
  }
  
  public String[] getTransitionProperties()
  {
    return TRANSITION_PROPS;
  }
  
  public boolean isDrawDebugEnabled()
  {
    return this.drawDebugEnabled;
  }
  
  public boolean isElevationShadowEnabled()
  {
    return this.elevationShadowEnabled;
  }
  
  public boolean isHoldAtEndEnabled()
  {
    return this.holdAtEndEnabled;
  }
  
  public void setAllContainerColors(int paramInt)
  {
    this.containerColor = paramInt;
    this.startContainerColor = paramInt;
    this.endContainerColor = paramInt;
  }
  
  public void setContainerColor(int paramInt)
  {
    this.containerColor = paramInt;
  }
  
  public void setDrawDebugEnabled(boolean paramBoolean)
  {
    this.drawDebugEnabled = paramBoolean;
  }
  
  public void setDrawingViewId(int paramInt)
  {
    this.drawingViewId = paramInt;
  }
  
  public void setElevationShadowEnabled(boolean paramBoolean)
  {
    this.elevationShadowEnabled = paramBoolean;
  }
  
  public void setEndContainerColor(int paramInt)
  {
    this.endContainerColor = paramInt;
  }
  
  public void setEndElevation(float paramFloat)
  {
    this.endElevation = paramFloat;
  }
  
  public void setEndShapeAppearanceModel(ShapeAppearanceModel paramShapeAppearanceModel)
  {
    this.endShapeAppearanceModel = paramShapeAppearanceModel;
  }
  
  public void setEndView(View paramView)
  {
    this.endView = paramView;
  }
  
  public void setEndViewId(int paramInt)
  {
    this.endViewId = paramInt;
  }
  
  public void setFadeMode(int paramInt)
  {
    this.fadeMode = paramInt;
  }
  
  public void setFadeProgressThresholds(MaterialContainerTransform.ProgressThresholds paramProgressThresholds)
  {
    this.fadeProgressThresholds = paramProgressThresholds;
  }
  
  public void setFitMode(int paramInt)
  {
    this.fitMode = paramInt;
  }
  
  public void setHoldAtEndEnabled(boolean paramBoolean)
  {
    this.holdAtEndEnabled = paramBoolean;
  }
  
  public void setPathMotion(PathMotion paramPathMotion)
  {
    super.setPathMotion(paramPathMotion);
    this.pathMotionCustom = true;
  }
  
  public void setScaleMaskProgressThresholds(MaterialContainerTransform.ProgressThresholds paramProgressThresholds)
  {
    this.scaleMaskProgressThresholds = paramProgressThresholds;
  }
  
  public void setScaleProgressThresholds(MaterialContainerTransform.ProgressThresholds paramProgressThresholds)
  {
    this.scaleProgressThresholds = paramProgressThresholds;
  }
  
  public void setScrimColor(int paramInt)
  {
    this.scrimColor = paramInt;
  }
  
  public void setShapeMaskProgressThresholds(MaterialContainerTransform.ProgressThresholds paramProgressThresholds)
  {
    this.shapeMaskProgressThresholds = paramProgressThresholds;
  }
  
  public void setStartContainerColor(int paramInt)
  {
    this.startContainerColor = paramInt;
  }
  
  public void setStartElevation(float paramFloat)
  {
    this.startElevation = paramFloat;
  }
  
  public void setStartShapeAppearanceModel(ShapeAppearanceModel paramShapeAppearanceModel)
  {
    this.startShapeAppearanceModel = paramShapeAppearanceModel;
  }
  
  public void setStartView(View paramView)
  {
    this.startView = paramView;
  }
  
  public void setStartViewId(int paramInt)
  {
    this.startViewId = paramInt;
  }
  
  public void setTransitionDirection(int paramInt)
  {
    this.transitionDirection = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.MaterialContainerTransform
 * JD-Core Version:    0.7.0.1
 */