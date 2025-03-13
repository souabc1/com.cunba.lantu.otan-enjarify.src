package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.integer;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m54207b69;

class FloatingActionButtonImpl
{
  static final int ANIM_STATE_HIDING = 1;
  static final int ANIM_STATE_NONE = 0;
  static final int ANIM_STATE_SHOWING = 2;
  static final long ELEVATION_ANIM_DELAY = 100L;
  static final long ELEVATION_ANIM_DURATION = 100L;
  static final TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
  static final int[] EMPTY_STATE_SET = new int[0];
  static final int[] ENABLED_STATE_SET;
  static final int[] FOCUSED_ENABLED_STATE_SET;
  private static final int HIDE_ANIM_DURATION_ATTR = 0;
  private static final int HIDE_ANIM_EASING_ATTR = 0;
  private static final float HIDE_ICON_SCALE = 0.4F;
  private static final float HIDE_OPACITY = 0.0F;
  private static final float HIDE_SCALE = 0.4F;
  static final int[] HOVERED_ENABLED_STATE_SET;
  static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET;
  static final int[] PRESSED_ENABLED_STATE_SET;
  static final float SHADOW_MULTIPLIER = 1.5F;
  private static final int SHOW_ANIM_DURATION_ATTR = R.attr.motionDurationLong2;
  private static final int SHOW_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
  private static final float SHOW_ICON_SCALE = 1.0F;
  private static final float SHOW_OPACITY = 1.0F;
  private static final float SHOW_SCALE = 1.0F;
  private static final float SPEC_HIDE_ICON_SCALE;
  private static final float SPEC_HIDE_SCALE;
  private int animState = 0;
  BorderDrawable borderDrawable;
  Drawable contentBackground;
  private Animator currentAnimator;
  float elevation;
  boolean ensureMinTouchTargetSize;
  private ArrayList hideListeners;
  private MotionSpec hideMotionSpec;
  float hoveredFocusedTranslationZ;
  private float imageMatrixScale = 1.0F;
  private int maxImageSize;
  int minTouchTargetSize;
  private ViewTreeObserver.OnPreDrawListener preDrawListener;
  float pressedTranslationZ;
  Drawable rippleDrawable;
  private float rotation;
  boolean shadowPaddingEnabled = true;
  final ShadowViewDelegate shadowViewDelegate;
  ShapeAppearanceModel shapeAppearance;
  MaterialShapeDrawable shapeDrawable;
  private ArrayList showListeners;
  private MotionSpec showMotionSpec;
  private final StateListAnimator stateListAnimator;
  private final Matrix tmpMatrix;
  private final Rect tmpRect;
  private final RectF tmpRectF1;
  private final RectF tmpRectF2;
  private ArrayList transformationCallbacks;
  final FloatingActionButton view;
  
  static
  {
    HIDE_ANIM_DURATION_ATTR = R.attr.motionDurationMedium1;
    HIDE_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    int i = 16842910;
    PRESSED_ENABLED_STATE_SET = new int[] { 16842919, i };
    int j = 16843623;
    int k = 16842908;
    int[] tmp57_55 = new int[3];
    int[] tmp58_57 = tmp57_55;
    int[] tmp58_57 = tmp57_55;
    tmp58_57[0] = j;
    tmp58_57[1] = k;
    tmp58_57[2] = i;
    HOVERED_FOCUSED_ENABLED_STATE_SET = tmp58_57;
    FOCUSED_ENABLED_STATE_SET = new int[] { k, i };
    HOVERED_ENABLED_STATE_SET = new int[] { j, i };
    ENABLED_STATE_SET = new int[] { i };
  }
  
  public FloatingActionButtonImpl(FloatingActionButton paramFloatingActionButton, ShadowViewDelegate paramShadowViewDelegate)
  {
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.tmpRect = ((Rect)localObject1);
    localObject1 = new android/graphics/RectF;
    ((RectF)localObject1).<init>();
    this.tmpRectF1 = ((RectF)localObject1);
    localObject1 = new android/graphics/RectF;
    ((RectF)localObject1).<init>();
    this.tmpRectF2 = ((RectF)localObject1);
    localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    this.tmpMatrix = ((Matrix)localObject1);
    this.view = paramFloatingActionButton;
    this.shadowViewDelegate = paramShadowViewDelegate;
    paramShadowViewDelegate = new com/google/android/material/internal/StateListAnimator;
    paramShadowViewDelegate.<init>();
    this.stateListAnimator = paramShadowViewDelegate;
    localObject1 = PRESSED_ENABLED_STATE_SET;
    Object localObject2 = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$ElevateToPressedTranslationZAnimation;
    ((FloatingActionButtonImpl.ElevateToPressedTranslationZAnimation)localObject2).<init>(this);
    localObject2 = createElevationAnimator((FloatingActionButtonImpl.ShadowAnimatorImpl)localObject2);
    paramShadowViewDelegate.addState((int[])localObject1, (ValueAnimator)localObject2);
    localObject1 = HOVERED_FOCUSED_ENABLED_STATE_SET;
    localObject2 = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation;
    ((FloatingActionButtonImpl.ElevateToHoveredFocusedTranslationZAnimation)localObject2).<init>(this);
    localObject2 = createElevationAnimator((FloatingActionButtonImpl.ShadowAnimatorImpl)localObject2);
    paramShadowViewDelegate.addState((int[])localObject1, (ValueAnimator)localObject2);
    localObject1 = FOCUSED_ENABLED_STATE_SET;
    localObject2 = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation;
    ((FloatingActionButtonImpl.ElevateToHoveredFocusedTranslationZAnimation)localObject2).<init>(this);
    localObject2 = createElevationAnimator((FloatingActionButtonImpl.ShadowAnimatorImpl)localObject2);
    paramShadowViewDelegate.addState((int[])localObject1, (ValueAnimator)localObject2);
    localObject1 = HOVERED_ENABLED_STATE_SET;
    localObject2 = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation;
    ((FloatingActionButtonImpl.ElevateToHoveredFocusedTranslationZAnimation)localObject2).<init>(this);
    localObject2 = createElevationAnimator((FloatingActionButtonImpl.ShadowAnimatorImpl)localObject2);
    paramShadowViewDelegate.addState((int[])localObject1, (ValueAnimator)localObject2);
    localObject1 = ENABLED_STATE_SET;
    localObject2 = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$ResetElevationAnimation;
    ((FloatingActionButtonImpl.ResetElevationAnimation)localObject2).<init>(this);
    localObject2 = createElevationAnimator((FloatingActionButtonImpl.ShadowAnimatorImpl)localObject2);
    paramShadowViewDelegate.addState((int[])localObject1, (ValueAnimator)localObject2);
    localObject1 = EMPTY_STATE_SET;
    localObject2 = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$DisabledElevationAnimation;
    ((FloatingActionButtonImpl.DisabledElevationAnimation)localObject2).<init>(this);
    localObject2 = createElevationAnimator((FloatingActionButtonImpl.ShadowAnimatorImpl)localObject2);
    paramShadowViewDelegate.addState((int[])localObject1, (ValueAnimator)localObject2);
    float f = paramFloatingActionButton.getRotation();
    this.rotation = f;
  }
  
  private void calculateImageMatrixFromScale(float paramFloat, Matrix paramMatrix)
  {
    paramMatrix.reset();
    Object localObject = this.view.getDrawable();
    if (localObject != null)
    {
      int i = this.maxImageSize;
      if (i != 0)
      {
        RectF localRectF1 = this.tmpRectF1;
        RectF localRectF2 = this.tmpRectF2;
        int j = ((Drawable)localObject).getIntrinsicWidth();
        float f1 = j;
        float f2 = ((Drawable)localObject).getIntrinsicHeight();
        localRectF1.set(0.0F, 0.0F, f1, f2);
        int k = this.maxImageSize;
        f1 = k;
        f2 = k;
        localRectF2.set(0.0F, 0.0F, f1, f2);
        localObject = Matrix.ScaleToFit.CENTER;
        paramMatrix.setRectToRect(localRectF1, localRectF2, (Matrix.ScaleToFit)localObject);
        k = this.maxImageSize;
        float f3 = k;
        float f4 = 2.0F;
        f3 /= f4;
        f2 = k / f4;
        paramMatrix.postScale(paramFloat, paramFloat, f3, f2);
      }
    }
  }
  
  private AnimatorSet createAnimator(MotionSpec paramMotionSpec, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = this.view;
    Object localObject2 = View.ALPHA;
    int i = 1;
    float[] arrayOfFloat = new float[i];
    arrayOfFloat[0] = paramFloat1;
    Object localObject3 = ObjectAnimator.ofFloat(localObject1, (Property)localObject2, arrayOfFloat);
    localObject1 = m54207b69.F54207b69_11("K{140C1C1B161408");
    paramMotionSpec.getTiming((String)localObject1).apply((Animator)localObject3);
    localArrayList.add(localObject3);
    localObject3 = this.view;
    localObject1 = View.SCALE_X;
    localObject2 = new float[i];
    localObject2[0] = paramFloat2;
    localObject3 = ObjectAnimator.ofFloat(localObject3, (Property)localObject1, (float[])localObject2);
    localObject1 = m54207b69.F54207b69_11("|I3A2B2A2830");
    paramMotionSpec.getTiming((String)localObject1).apply((Animator)localObject3);
    workAroundOreoBug((ObjectAnimator)localObject3);
    localArrayList.add(localObject3);
    localObject3 = this.view;
    localObject2 = View.SCALE_Y;
    arrayOfFloat = new float[i];
    arrayOfFloat[0] = paramFloat2;
    localObject3 = ObjectAnimator.ofFloat(localObject3, (Property)localObject2, arrayOfFloat);
    paramMotionSpec.getTiming((String)localObject1).apply((Animator)localObject3);
    workAroundOreoBug((ObjectAnimator)localObject3);
    localArrayList.add(localObject3);
    localObject3 = this.tmpMatrix;
    calculateImageMatrixFromScale(paramFloat3, (Matrix)localObject3);
    localObject3 = this.view;
    Object localObject4 = new com/google/android/material/animation/ImageMatrixProperty;
    ((ImageMatrixProperty)localObject4).<init>();
    FloatingActionButtonImpl.3 local3 = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$3;
    local3.<init>(this);
    localObject1 = new Matrix[i];
    localObject2 = new android/graphics/Matrix;
    Matrix localMatrix = this.tmpMatrix;
    ((Matrix)localObject2).<init>(localMatrix);
    localObject1[0] = localObject2;
    localObject3 = ObjectAnimator.ofObject(localObject3, (Property)localObject4, local3, (Object[])localObject1);
    localObject4 = m54207b69.F54207b69_11("7059546161675857635D");
    paramMotionSpec.getTiming((String)localObject4).apply((Animator)localObject3);
    localArrayList.add(localObject3);
    paramMotionSpec = new android/animation/AnimatorSet;
    paramMotionSpec.<init>();
    AnimatorSetCompat.playTogether(paramMotionSpec, localArrayList);
    return paramMotionSpec;
  }
  
  private AnimatorSet createDefaultAnimator(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2)
  {
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new float[2];
    Object tmp27_25 = localObject1;
    tmp27_25[0] = 0.0F;
    tmp27_25[1] = 1.0F;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat((float[])localObject1);
    float f1 = this.view.getAlpha();
    float f2 = this.view.getScaleX();
    float f3 = this.view.getScaleY();
    float f4 = this.imageMatrixScale;
    Matrix localMatrix = new android/graphics/Matrix;
    localObject1 = this.tmpMatrix;
    localMatrix.<init>((Matrix)localObject1);
    FloatingActionButtonImpl.4 local4 = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$4;
    localObject1 = local4;
    Object localObject2 = this;
    local4.<init>(this, f1, paramFloat1, f2, paramFloat2, f3, f4, paramFloat3, localMatrix);
    localValueAnimator.addUpdateListener(local4);
    localArrayList.add(localValueAnimator);
    AnimatorSetCompat.playTogether(localAnimatorSet, localArrayList);
    localObject1 = this.view.getContext();
    localObject2 = this.view.getContext().getResources();
    int i = R.integer.material_motion_duration_long_1;
    int j = ((Resources)localObject2).getInteger(i);
    i = paramInt1;
    long l = MotionUtils.resolveThemeDuration((Context)localObject1, paramInt1, j);
    localAnimatorSet.setDuration(l);
    localObject1 = this.view.getContext();
    localObject2 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    i = paramInt2;
    localObject1 = MotionUtils.resolveThemeInterpolator((Context)localObject1, paramInt2, (TimeInterpolator)localObject2);
    localAnimatorSet.setInterpolator((TimeInterpolator)localObject1);
    return localAnimatorSet;
  }
  
  private ValueAnimator createElevationAnimator(FloatingActionButtonImpl.ShadowAnimatorImpl paramShadowAnimatorImpl)
  {
    ValueAnimator localValueAnimator = new android/animation/ValueAnimator;
    localValueAnimator.<init>();
    TimeInterpolator localTimeInterpolator = ELEVATION_ANIM_INTERPOLATOR;
    localValueAnimator.setInterpolator(localTimeInterpolator);
    localValueAnimator.setDuration(100);
    localValueAnimator.addListener(paramShadowAnimatorImpl);
    localValueAnimator.addUpdateListener(paramShadowAnimatorImpl);
    paramShadowAnimatorImpl = new float[2];
    FloatingActionButtonImpl.ShadowAnimatorImpl tmp40_39 = paramShadowAnimatorImpl;
    tmp40_39[0] = 0.0F;
    tmp40_39[1] = 1.0F;
    localValueAnimator.setFloatValues(paramShadowAnimatorImpl);
    return localValueAnimator;
  }
  
  private ViewTreeObserver.OnPreDrawListener getOrCreatePreDrawListener()
  {
    Object localObject = this.preDrawListener;
    if (localObject == null)
    {
      localObject = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$6;
      ((FloatingActionButtonImpl.6)localObject).<init>(this);
      this.preDrawListener = ((ViewTreeObserver.OnPreDrawListener)localObject);
    }
    return this.preDrawListener;
  }
  
  private boolean shouldAnimateVisibilityChange()
  {
    FloatingActionButton localFloatingActionButton = this.view;
    boolean bool = ViewCompat.OoooOOO(localFloatingActionButton);
    if (bool)
    {
      localFloatingActionButton = this.view;
      bool = localFloatingActionButton.isInEditMode();
      if (!bool) {
        return true;
      }
    }
    bool = false;
    localFloatingActionButton = null;
    return bool;
  }
  
  private void workAroundOreoBug(ObjectAnimator paramObjectAnimator) {}
  
  public void addOnHideAnimationListener(Animator.AnimatorListener paramAnimatorListener)
  {
    ArrayList localArrayList = this.hideListeners;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.hideListeners = localArrayList;
    }
    this.hideListeners.add(paramAnimatorListener);
  }
  
  public void addOnShowAnimationListener(Animator.AnimatorListener paramAnimatorListener)
  {
    ArrayList localArrayList = this.showListeners;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.showListeners = localArrayList;
    }
    this.showListeners.add(paramAnimatorListener);
  }
  
  public void addTransformationCallback(FloatingActionButtonImpl.InternalTransformationCallback paramInternalTransformationCallback)
  {
    ArrayList localArrayList = this.transformationCallbacks;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.transformationCallbacks = localArrayList;
    }
    this.transformationCallbacks.add(paramInternalTransformationCallback);
  }
  
  public MaterialShapeDrawable createShapeDrawable()
  {
    ShapeAppearanceModel localShapeAppearanceModel = (ShapeAppearanceModel)Preconditions.OooO0oo(this.shapeAppearance);
    MaterialShapeDrawable localMaterialShapeDrawable = new com/google/android/material/shape/MaterialShapeDrawable;
    localMaterialShapeDrawable.<init>(localShapeAppearanceModel);
    return localMaterialShapeDrawable;
  }
  
  public final Drawable getContentBackground()
  {
    return this.contentBackground;
  }
  
  public float getElevation()
  {
    return this.elevation;
  }
  
  public boolean getEnsureMinTouchTargetSize()
  {
    return this.ensureMinTouchTargetSize;
  }
  
  public final MotionSpec getHideMotionSpec()
  {
    return this.hideMotionSpec;
  }
  
  public float getHoveredFocusedTranslationZ()
  {
    return this.hoveredFocusedTranslationZ;
  }
  
  public void getPadding(Rect paramRect)
  {
    boolean bool1 = this.ensureMinTouchTargetSize;
    FloatingActionButton localFloatingActionButton;
    if (bool1)
    {
      i = this.minTouchTargetSize;
      localFloatingActionButton = this.view;
      int j = localFloatingActionButton.getSizeDimension();
      i = (i - j) / 2;
    }
    else
    {
      i = 0;
    }
    boolean bool2 = this.shadowPaddingEnabled;
    float f1;
    if (bool2)
    {
      f1 = getElevation();
      float f2 = this.pressedTranslationZ;
      f1 += f2;
    }
    else
    {
      bool2 = false;
      f1 = 0.0F;
      localFloatingActionButton = null;
    }
    int m = (int)Math.ceil(f1);
    m = Math.max(i, m);
    int k = (int)Math.ceil(f1 * 1.5F);
    int i = Math.max(i, k);
    paramRect.set(m, i, m, i);
  }
  
  public float getPressedTranslationZ()
  {
    return this.pressedTranslationZ;
  }
  
  public final ShapeAppearanceModel getShapeAppearance()
  {
    return this.shapeAppearance;
  }
  
  public final MotionSpec getShowMotionSpec()
  {
    return this.showMotionSpec;
  }
  
  public void hide(FloatingActionButtonImpl.InternalVisibilityChangedListener paramInternalVisibilityChangedListener, boolean paramBoolean)
  {
    boolean bool = isOrWillBeHidden();
    if (bool) {
      return;
    }
    Object localObject1 = this.currentAnimator;
    if (localObject1 != null) {
      ((Animator)localObject1).cancel();
    }
    bool = shouldAnimateVisibilityChange();
    int i;
    if (bool)
    {
      localObject1 = this.hideMotionSpec;
      if (localObject1 != null)
      {
        i = 0;
        localObject2 = null;
        localObject1 = createAnimator((MotionSpec)localObject1, 0.0F, 0.0F, 0.0F);
      }
      else
      {
        float f1 = 0.4F;
        float f2 = 0.4F;
        int j = HIDE_ANIM_DURATION_ATTR;
        int k = HIDE_ANIM_EASING_ATTR;
        localObject2 = this;
        localObject1 = createDefaultAnimator(0.0F, f1, f2, j, k);
      }
      Object localObject2 = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$1;
      ((FloatingActionButtonImpl.1)localObject2).<init>(this, paramBoolean, paramInternalVisibilityChangedListener);
      ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
      paramInternalVisibilityChangedListener = this.hideListeners;
      if (paramInternalVisibilityChangedListener != null)
      {
        paramInternalVisibilityChangedListener = paramInternalVisibilityChangedListener.iterator();
        for (;;)
        {
          paramBoolean = paramInternalVisibilityChangedListener.hasNext();
          if (!paramBoolean) {
            break;
          }
          Animator.AnimatorListener localAnimatorListener = (Animator.AnimatorListener)paramInternalVisibilityChangedListener.next();
          ((Animator)localObject1).addListener(localAnimatorListener);
        }
      }
      ((AnimatorSet)localObject1).start();
    }
    else
    {
      localObject1 = this.view;
      if (paramBoolean) {
        i = 8;
      } else {
        i = 4;
      }
      ((VisibilityAwareImageButton)localObject1).internalSetVisibility(i, paramBoolean);
      if (paramInternalVisibilityChangedListener != null) {
        paramInternalVisibilityChangedListener.onHidden();
      }
    }
  }
  
  public void initializeBackgroundDrawable(ColorStateList paramColorStateList1, PorterDuff.Mode paramMode, ColorStateList paramColorStateList2, int paramInt)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = createShapeDrawable();
    this.shapeDrawable = localMaterialShapeDrawable;
    localMaterialShapeDrawable.setTintList(paramColorStateList1);
    if (paramMode != null)
    {
      paramColorStateList1 = this.shapeDrawable;
      paramColorStateList1.setTintMode(paramMode);
    }
    this.shapeDrawable.setShadowColor(-12303292);
    paramColorStateList1 = this.shapeDrawable;
    paramMode = this.view.getContext();
    paramColorStateList1.initializeElevationOverlay(paramMode);
    paramColorStateList1 = new com/google/android/material/ripple/RippleDrawableCompat;
    paramMode = this.shapeDrawable.getShapeAppearanceModel();
    paramColorStateList1.<init>(paramMode);
    paramMode = RippleUtils.sanitizeRippleDrawableColor(paramColorStateList2);
    paramColorStateList1.setTintList(paramMode);
    this.rippleDrawable = paramColorStateList1;
    paramMode = new Drawable[2];
    paramColorStateList2 = (Drawable)Preconditions.OooO0oo(this.shapeDrawable);
    paramMode[0] = paramColorStateList2;
    paramMode[1] = paramColorStateList1;
    paramColorStateList1 = new android/graphics/drawable/LayerDrawable;
    paramColorStateList1.<init>(paramMode);
    this.contentBackground = paramColorStateList1;
  }
  
  public boolean isOrWillBeHidden()
  {
    FloatingActionButton localFloatingActionButton = this.view;
    int i = localFloatingActionButton.getVisibility();
    boolean bool = false;
    int j = 1;
    if (i == 0)
    {
      i = this.animState;
      if (i == j) {
        bool = j;
      }
      return bool;
    }
    i = this.animState;
    int k = 2;
    if (i != k) {
      bool = j;
    }
    return bool;
  }
  
  public boolean isOrWillBeShown()
  {
    FloatingActionButton localFloatingActionButton = this.view;
    int i = localFloatingActionButton.getVisibility();
    boolean bool = false;
    int j = 1;
    if (i != 0)
    {
      i = this.animState;
      int k = 2;
      if (i == k) {
        bool = j;
      }
      return bool;
    }
    i = this.animState;
    if (i != j) {
      bool = j;
    }
    return bool;
  }
  
  public void jumpDrawableToCurrentState()
  {
    this.stateListAnimator.jumpToCurrentState();
  }
  
  public void onAttachedToWindow()
  {
    Object localObject1 = this.shapeDrawable;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = this.view;
      MaterialShapeUtils.setParentAbsoluteElevation((View)localObject2, (MaterialShapeDrawable)localObject1);
    }
    boolean bool = requirePreDrawListener();
    if (bool)
    {
      localObject1 = this.view.getViewTreeObserver();
      localObject2 = getOrCreatePreDrawListener();
      ((ViewTreeObserver)localObject1).addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)localObject2);
    }
  }
  
  public void onCompatShadowChanged() {}
  
  public void onDetachedFromWindow()
  {
    ViewTreeObserver localViewTreeObserver = this.view.getViewTreeObserver();
    ViewTreeObserver.OnPreDrawListener localOnPreDrawListener = this.preDrawListener;
    if (localOnPreDrawListener != null)
    {
      localViewTreeObserver.removeOnPreDrawListener(localOnPreDrawListener);
      localViewTreeObserver = null;
      this.preDrawListener = null;
    }
  }
  
  public void onDrawableStateChanged(int[] paramArrayOfInt)
  {
    this.stateListAnimator.setState(paramArrayOfInt);
  }
  
  public void onElevationsChanged(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    updatePadding();
    updateShapeElevation(paramFloat1);
  }
  
  public void onPaddingUpdated(Rect paramRect)
  {
    Object localObject1 = this.contentBackground;
    Object localObject2 = m54207b69.F54207b69_11("bt301E121D57055A2422260A2821252B1D2165292E2E152731186D3030333C31253B223C33");
    Preconditions.OooO(localObject1, localObject2);
    boolean bool = shouldAddPadding();
    if (bool)
    {
      localObject1 = new android/graphics/drawable/InsetDrawable;
      Drawable localDrawable = this.contentBackground;
      int i = paramRect.left;
      int j = paramRect.top;
      int k = paramRect.right;
      int m = paramRect.bottom;
      localObject2 = localObject1;
      ((InsetDrawable)localObject1).<init>(localDrawable, i, j, k, m);
      paramRect = this.shadowViewDelegate;
    }
    else
    {
      paramRect = this.shadowViewDelegate;
      localObject1 = this.contentBackground;
    }
    paramRect.setBackgroundDrawable((Drawable)localObject1);
  }
  
  public void onPreDraw()
  {
    FloatingActionButton localFloatingActionButton = this.view;
    float f1 = localFloatingActionButton.getRotation();
    float f2 = this.rotation;
    boolean bool = f2 < f1;
    if (bool)
    {
      this.rotation = f1;
      updateFromViewRotation();
    }
  }
  
  public void onScaleChanged()
  {
    Object localObject = this.transformationCallbacks;
    if (localObject != null)
    {
      localObject = ((ArrayList)localObject).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject).hasNext();
        if (!bool) {
          break;
        }
        FloatingActionButtonImpl.InternalTransformationCallback localInternalTransformationCallback = (FloatingActionButtonImpl.InternalTransformationCallback)((Iterator)localObject).next();
        localInternalTransformationCallback.onScaleChanged();
      }
    }
  }
  
  public void onTranslationChanged()
  {
    Object localObject = this.transformationCallbacks;
    if (localObject != null)
    {
      localObject = ((ArrayList)localObject).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject).hasNext();
        if (!bool) {
          break;
        }
        FloatingActionButtonImpl.InternalTransformationCallback localInternalTransformationCallback = (FloatingActionButtonImpl.InternalTransformationCallback)((Iterator)localObject).next();
        localInternalTransformationCallback.onTranslationChanged();
      }
    }
  }
  
  public void removeOnHideAnimationListener(Animator.AnimatorListener paramAnimatorListener)
  {
    ArrayList localArrayList = this.hideListeners;
    if (localArrayList == null) {
      return;
    }
    localArrayList.remove(paramAnimatorListener);
  }
  
  public void removeOnShowAnimationListener(Animator.AnimatorListener paramAnimatorListener)
  {
    ArrayList localArrayList = this.showListeners;
    if (localArrayList == null) {
      return;
    }
    localArrayList.remove(paramAnimatorListener);
  }
  
  public void removeTransformationCallback(FloatingActionButtonImpl.InternalTransformationCallback paramInternalTransformationCallback)
  {
    ArrayList localArrayList = this.transformationCallbacks;
    if (localArrayList == null) {
      return;
    }
    localArrayList.remove(paramInternalTransformationCallback);
  }
  
  public boolean requirePreDrawListener()
  {
    return true;
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.shapeDrawable;
    if (localObject != null) {
      ((MaterialShapeDrawable)localObject).setTintList(paramColorStateList);
    }
    localObject = this.borderDrawable;
    if (localObject != null) {
      ((BorderDrawable)localObject).setBorderTint(paramColorStateList);
    }
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.shapeDrawable;
    if (localMaterialShapeDrawable != null) {
      localMaterialShapeDrawable.setTintMode(paramMode);
    }
  }
  
  public final void setElevation(float paramFloat)
  {
    float f1 = this.elevation;
    boolean bool = f1 < paramFloat;
    if (bool)
    {
      this.elevation = paramFloat;
      f1 = this.hoveredFocusedTranslationZ;
      float f2 = this.pressedTranslationZ;
      onElevationsChanged(paramFloat, f1, f2);
    }
  }
  
  public void setEnsureMinTouchTargetSize(boolean paramBoolean)
  {
    this.ensureMinTouchTargetSize = paramBoolean;
  }
  
  public final void setHideMotionSpec(MotionSpec paramMotionSpec)
  {
    this.hideMotionSpec = paramMotionSpec;
  }
  
  public final void setHoveredFocusedTranslationZ(float paramFloat)
  {
    float f1 = this.hoveredFocusedTranslationZ;
    boolean bool = f1 < paramFloat;
    if (bool)
    {
      this.hoveredFocusedTranslationZ = paramFloat;
      f1 = this.elevation;
      float f2 = this.pressedTranslationZ;
      onElevationsChanged(f1, paramFloat, f2);
    }
  }
  
  public final void setImageMatrixScale(float paramFloat)
  {
    this.imageMatrixScale = paramFloat;
    Matrix localMatrix = this.tmpMatrix;
    calculateImageMatrixFromScale(paramFloat, localMatrix);
    this.view.setImageMatrix(localMatrix);
  }
  
  public final void setMaxImageSize(int paramInt)
  {
    int i = this.maxImageSize;
    if (i != paramInt)
    {
      this.maxImageSize = paramInt;
      updateImageMatrixScale();
    }
  }
  
  public void setMinTouchTargetSize(int paramInt)
  {
    this.minTouchTargetSize = paramInt;
  }
  
  public final void setPressedTranslationZ(float paramFloat)
  {
    float f1 = this.pressedTranslationZ;
    boolean bool = f1 < paramFloat;
    if (bool)
    {
      this.pressedTranslationZ = paramFloat;
      f1 = this.elevation;
      float f2 = this.hoveredFocusedTranslationZ;
      onElevationsChanged(f1, f2, paramFloat);
    }
  }
  
  public void setRippleColor(ColorStateList paramColorStateList)
  {
    Drawable localDrawable = this.rippleDrawable;
    if (localDrawable != null)
    {
      paramColorStateList = RippleUtils.sanitizeRippleDrawableColor(paramColorStateList);
      DrawableCompat.OooOOOO(localDrawable, paramColorStateList);
    }
  }
  
  public void setShadowPaddingEnabled(boolean paramBoolean)
  {
    this.shadowPaddingEnabled = paramBoolean;
    updatePadding();
  }
  
  public final void setShapeAppearance(ShapeAppearanceModel paramShapeAppearanceModel)
  {
    this.shapeAppearance = paramShapeAppearanceModel;
    Object localObject = this.shapeDrawable;
    if (localObject != null) {
      ((MaterialShapeDrawable)localObject).setShapeAppearanceModel(paramShapeAppearanceModel);
    }
    localObject = this.rippleDrawable;
    boolean bool = localObject instanceof Shapeable;
    if (bool)
    {
      localObject = (Shapeable)localObject;
      ((Shapeable)localObject).setShapeAppearanceModel(paramShapeAppearanceModel);
    }
    localObject = this.borderDrawable;
    if (localObject != null) {
      ((BorderDrawable)localObject).setShapeAppearanceModel(paramShapeAppearanceModel);
    }
  }
  
  public final void setShowMotionSpec(MotionSpec paramMotionSpec)
  {
    this.showMotionSpec = paramMotionSpec;
  }
  
  public boolean shouldAddPadding()
  {
    return true;
  }
  
  public final boolean shouldExpandBoundsForA11y()
  {
    boolean bool = this.ensureMinTouchTargetSize;
    if (bool)
    {
      FloatingActionButton localFloatingActionButton = this.view;
      i = localFloatingActionButton.getSizeDimension();
      int j = this.minTouchTargetSize;
      if (i < j)
      {
        i = 0;
        localFloatingActionButton = null;
        return i;
      }
    }
    int i = 1;
    return i;
  }
  
  public void show(FloatingActionButtonImpl.InternalVisibilityChangedListener paramInternalVisibilityChangedListener, boolean paramBoolean)
  {
    boolean bool1 = isOrWillBeShown();
    if (bool1) {
      return;
    }
    Object localObject1 = this.currentAnimator;
    if (localObject1 != null) {
      ((Animator)localObject1).cancel();
    }
    localObject1 = this.showMotionSpec;
    int i = 0;
    Object localObject2 = null;
    if (localObject1 == null)
    {
      bool1 = true;
    }
    else
    {
      bool1 = false;
      localObject1 = null;
    }
    boolean bool2 = shouldAnimateVisibilityChange();
    float f1 = 1.0F;
    Object localObject3;
    if (bool2)
    {
      localObject2 = this.view;
      i = ((View)localObject2).getVisibility();
      float f2;
      int k;
      float f3;
      int m;
      if (i != 0)
      {
        localObject2 = this.view;
        bool2 = false;
        f2 = 0.0F;
        ((View)localObject2).setAlpha(0.0F);
        localObject2 = this.view;
        k = 1053609165;
        f3 = 0.4F;
        float f4;
        if (bool1)
        {
          m = k;
          f4 = f3;
        }
        else
        {
          m = 0;
          f4 = 0.0F;
        }
        ((FloatingActionButton)localObject2).setScaleY(f4);
        localObject2 = this.view;
        if (bool1)
        {
          m = k;
          f4 = f3;
        }
        else
        {
          m = 0;
          f4 = 0.0F;
        }
        ((FloatingActionButton)localObject2).setScaleX(f4);
        if (bool1)
        {
          bool2 = k;
          f2 = f3;
        }
        setImageMatrixScale(f2);
      }
      localObject1 = this.showMotionSpec;
      if (localObject1 != null)
      {
        localObject1 = createAnimator((MotionSpec)localObject1, f1, f1, f1);
      }
      else
      {
        int j = 1065353216;
        f2 = 1.0F;
        f1 = 1.0F;
        k = 1065353216;
        f3 = 1.0F;
        m = SHOW_ANIM_DURATION_ATTR;
        int n = SHOW_ANIM_EASING_ATTR;
        localObject2 = this;
        localObject1 = createDefaultAnimator(f2, f1, f3, m, n);
      }
      localObject2 = new com/google/android/material/floatingactionbutton/FloatingActionButtonImpl$2;
      ((FloatingActionButtonImpl.2)localObject2).<init>(this, paramBoolean, paramInternalVisibilityChangedListener);
      ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
      paramInternalVisibilityChangedListener = this.showListeners;
      if (paramInternalVisibilityChangedListener != null)
      {
        paramInternalVisibilityChangedListener = paramInternalVisibilityChangedListener.iterator();
        for (;;)
        {
          paramBoolean = paramInternalVisibilityChangedListener.hasNext();
          if (!paramBoolean) {
            break;
          }
          localObject3 = (Animator.AnimatorListener)paramInternalVisibilityChangedListener.next();
          ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject3);
        }
      }
      ((AnimatorSet)localObject1).start();
    }
    else
    {
      localObject1 = this.view;
      ((VisibilityAwareImageButton)localObject1).internalSetVisibility(0, paramBoolean);
      this.view.setAlpha(f1);
      this.view.setScaleY(f1);
      localObject3 = this.view;
      ((FloatingActionButton)localObject3).setScaleX(f1);
      setImageMatrixScale(f1);
      if (paramInternalVisibilityChangedListener != null) {
        paramInternalVisibilityChangedListener.onShown();
      }
    }
  }
  
  public void updateFromViewRotation()
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.shapeDrawable;
    if (localMaterialShapeDrawable != null)
    {
      float f = this.rotation;
      int i = (int)f;
      localMaterialShapeDrawable.setShadowCompatRotation(i);
    }
  }
  
  public final void updateImageMatrixScale()
  {
    float f = this.imageMatrixScale;
    setImageMatrixScale(f);
  }
  
  public final void updatePadding()
  {
    Rect localRect = this.tmpRect;
    getPadding(localRect);
    onPaddingUpdated(localRect);
    ShadowViewDelegate localShadowViewDelegate = this.shadowViewDelegate;
    int i = localRect.left;
    int j = localRect.top;
    int k = localRect.right;
    int m = localRect.bottom;
    localShadowViewDelegate.setShadowPadding(i, j, k, m);
  }
  
  public void updateShapeElevation(float paramFloat)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.shapeDrawable;
    if (localMaterialShapeDrawable != null) {
      localMaterialShapeDrawable.setElevation(paramFloat);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
 * JD-Core Version:    0.7.0.1
 */