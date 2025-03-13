package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.OooOO0;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OO00;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;
import java.util.List;
import m54207b69;

public abstract class BaseTransientBottomBar
{
  public static final int ANIMATION_MODE_FADE = 1;
  public static final int ANIMATION_MODE_SLIDE = 0;
  private static final float ANIMATION_SCALE_FROM_VALUE = 0.8F;
  static final int DEFAULT_ANIMATION_FADE_DURATION = 180;
  private static final TimeInterpolator DEFAULT_ANIMATION_FADE_INTERPOLATOR;
  private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 150;
  private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 75;
  private static final TimeInterpolator DEFAULT_ANIMATION_SCALE_INTERPOLATOR;
  private static final TimeInterpolator DEFAULT_ANIMATION_SLIDE_INTERPOLATOR = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
  static final int DEFAULT_SLIDE_ANIMATION_DURATION = 250;
  public static final int LENGTH_INDEFINITE = 254;
  public static final int LENGTH_LONG = 0;
  public static final int LENGTH_SHORT = 255;
  static final int MSG_DISMISS = 1;
  static final int MSG_SHOW;
  private static final int[] SNACKBAR_STYLE_ATTR;
  private static final String TAG;
  private static final boolean USE_OFFSET_API;
  static final Handler handler;
  private final AccessibilityManager accessibilityManager;
  private BaseTransientBottomBar.Anchor anchor;
  private boolean anchorViewLayoutListenerEnabled;
  private final int animationFadeInDuration;
  private final TimeInterpolator animationFadeInterpolator;
  private final int animationFadeOutDuration;
  private final TimeInterpolator animationScaleInterpolator;
  private final int animationSlideDuration;
  private final TimeInterpolator animationSlideInterpolator;
  private int appliedBottomMarginGestureInset;
  private BaseTransientBottomBar.Behavior behavior;
  private final Runnable bottomMarginGestureInsetRunnable;
  private List callbacks;
  private final ContentViewCallback contentViewCallback;
  private final Context context;
  private int duration;
  private int extraBottomMarginAnchorView;
  private int extraBottomMarginGestureInset;
  private int extraBottomMarginWindowInset;
  private int extraLeftMarginWindowInset;
  private int extraRightMarginWindowInset;
  private boolean gestureInsetBottomIgnored;
  SnackbarManager.Callback managerCallback;
  private boolean pendingShowingView;
  private final ViewGroup targetParent;
  protected final BaseTransientBottomBar.SnackbarBaseLayout view;
  
  static
  {
    DEFAULT_ANIMATION_FADE_INTERPOLATOR = AnimationUtils.LINEAR_INTERPOLATOR;
    DEFAULT_ANIMATION_SCALE_INTERPOLATOR = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
    USE_OFFSET_API = false;
    int i = R.attr.snackbarStyle;
    SNACKBAR_STYLE_ATTR = new int[] { i };
    TAG = BaseTransientBottomBar.class.getSimpleName();
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    BaseTransientBottomBar.1 local1 = new com/google/android/material/snackbar/BaseTransientBottomBar$1;
    local1.<init>();
    localHandler.<init>(localLooper, local1);
    handler = localHandler;
  }
  
  public BaseTransientBottomBar(Context paramContext, ViewGroup paramViewGroup, View paramView, ContentViewCallback paramContentViewCallback)
  {
    int i = 0;
    float f = 0.0F;
    this.anchorViewLayoutListenerEnabled = false;
    Object localObject = new com/google/android/material/snackbar/BaseTransientBottomBar$2;
    ((BaseTransientBottomBar.2)localObject).<init>(this);
    this.bottomMarginGestureInsetRunnable = ((Runnable)localObject);
    localObject = new com/google/android/material/snackbar/BaseTransientBottomBar$5;
    ((BaseTransientBottomBar.5)localObject).<init>(this);
    this.managerCallback = ((SnackbarManager.Callback)localObject);
    if (paramViewGroup != null)
    {
      if (paramView != null)
      {
        if (paramContentViewCallback != null)
        {
          this.targetParent = paramViewGroup;
          this.contentViewCallback = paramContentViewCallback;
          this.context = paramContext;
          ThemeEnforcement.checkAppCompatTheme(paramContext);
          paramContentViewCallback = LayoutInflater.from(paramContext);
          int j = getSnackbarBaseLayoutResId();
          paramViewGroup = (BaseTransientBottomBar.SnackbarBaseLayout)paramContentViewCallback.inflate(j, paramViewGroup, false);
          this.view = paramViewGroup;
          BaseTransientBottomBar.SnackbarBaseLayout.access$500(paramViewGroup, this);
          boolean bool = paramView instanceof SnackbarContentLayout;
          if (bool)
          {
            paramContentViewCallback = paramView;
            paramContentViewCallback = (SnackbarContentLayout)paramView;
            f = paramViewGroup.getActionTextColorAlpha();
            paramContentViewCallback.updateActionTextColorAlphaIfNeeded(f);
            i = paramViewGroup.getMaxInlineActionWidth();
            paramContentViewCallback.setMaxInlineActionWidth(i);
          }
          paramViewGroup.addView((View)paramView);
          int k = 1;
          ViewCompat.o0ooOO0(paramViewGroup, k);
          ViewCompat.o000000(paramViewGroup, k);
          ViewCompat.o0O0O00(paramViewGroup, k);
          paramView = new com/google/android/material/snackbar/BaseTransientBottomBar$3;
          paramView.<init>(this);
          ViewCompat.o00000O0(paramViewGroup, paramView);
          paramView = new com/google/android/material/snackbar/BaseTransientBottomBar$4;
          paramView.<init>(this);
          ViewCompat.o00oO0o(paramViewGroup, paramView);
          paramViewGroup = m54207b69.F54207b69_11("dM2C2F302B42432A362C2A2E4440");
          paramViewGroup = (AccessibilityManager)paramContext.getSystemService(paramViewGroup);
          this.accessibilityManager = paramViewGroup;
          int m = R.attr.motionDurationLong2;
          m = MotionUtils.resolveThemeDuration(paramContext, m, 250);
          this.animationSlideDuration = m;
          m = R.attr.motionDurationLong2;
          m = MotionUtils.resolveThemeDuration(paramContext, m, 150);
          this.animationFadeInDuration = m;
          m = R.attr.motionDurationMedium1;
          m = MotionUtils.resolveThemeDuration(paramContext, m, 75);
          this.animationFadeOutDuration = m;
          m = R.attr.motionEasingEmphasizedInterpolator;
          paramView = DEFAULT_ANIMATION_FADE_INTERPOLATOR;
          paramViewGroup = MotionUtils.resolveThemeInterpolator(paramContext, m, paramView);
          this.animationFadeInterpolator = paramViewGroup;
          m = R.attr.motionEasingEmphasizedInterpolator;
          paramView = DEFAULT_ANIMATION_SCALE_INTERPOLATOR;
          paramViewGroup = MotionUtils.resolveThemeInterpolator(paramContext, m, paramView);
          this.animationScaleInterpolator = paramViewGroup;
          m = R.attr.motionEasingEmphasizedInterpolator;
          paramView = DEFAULT_ANIMATION_SLIDE_INTERPOLATOR;
          paramContext = MotionUtils.resolveThemeInterpolator(paramContext, m, paramView);
          this.animationSlideInterpolator = paramContext;
          return;
        }
        paramContext = new java/lang/IllegalArgumentException;
        paramViewGroup = m54207b69.F54207b69_11("l@14332331372E2B353C692C3A40413D3C7033334574424B4A4C79423C52427E4D4F4F8F51595152874B4A56574E4E515A");
        paramContext.<init>(paramViewGroup);
        throw paramContext;
      }
      paramContext = new java/lang/IllegalArgumentException;
      paramViewGroup = m54207b69.F54207b69_11(":E1138262E3A312632396E31353D3E38377538364A793D464D497E473F4F3D834A4A4C8A4E544E4F8C4E53555C4C585F");
      paramContext.<init>(paramViewGroup);
      throw paramContext;
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramViewGroup = m54207b69.F54207b69_11("l+7F5A4C485C47544C6714534F6B6C52551B5A5C6C1F5B746F77245D65796B296464662868826C6D3283738379718C");
    paramContext.<init>(paramViewGroup);
    throw paramContext;
  }
  
  public BaseTransientBottomBar(ViewGroup paramViewGroup, View paramView, ContentViewCallback paramContentViewCallback)
  {
    this(localContext, paramViewGroup, paramView, paramContentViewCallback);
  }
  
  private void animateViewOut(int paramInt)
  {
    BaseTransientBottomBar.SnackbarBaseLayout localSnackbarBaseLayout = this.view;
    int i = localSnackbarBaseLayout.getAnimationMode();
    int j = 1;
    if (i == j) {
      startFadeOutAnimation(paramInt);
    } else {
      startSlideOutAnimation(paramInt);
    }
  }
  
  private int calculateBottomMarginForAnchorView()
  {
    Object localObject = getAnchorView();
    if (localObject == null) {
      return 0;
    }
    int i = 2;
    int[] arrayOfInt = new int[i];
    getAnchorView().getLocationOnScreen(arrayOfInt);
    int j = 1;
    int k = arrayOfInt[j];
    localObject = new int[i];
    this.targetParent.getLocationOnScreen((int[])localObject);
    i = localObject[j];
    j = this.targetParent.getHeight();
    return i + j - k;
  }
  
  private static GradientDrawable createGradientDrawableBackground(int paramInt, Resources paramResources)
  {
    int i = R.dimen.mtrl_snackbar_background_corner_radius;
    float f = paramResources.getDimension(i);
    GradientDrawable localGradientDrawable = new android/graphics/drawable/GradientDrawable;
    localGradientDrawable.<init>();
    localGradientDrawable.setShape(0);
    localGradientDrawable.setCornerRadius(f);
    localGradientDrawable.setColor(paramInt);
    return localGradientDrawable;
  }
  
  private static MaterialShapeDrawable createMaterialShapeDrawableBackground(int paramInt, ShapeAppearanceModel paramShapeAppearanceModel)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = new com/google/android/material/shape/MaterialShapeDrawable;
    localMaterialShapeDrawable.<init>(paramShapeAppearanceModel);
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    localMaterialShapeDrawable.setFillColor(localColorStateList);
    return localMaterialShapeDrawable;
  }
  
  private ValueAnimator getAlphaAnimator(float... paramVarArgs)
  {
    paramVarArgs = ValueAnimator.ofFloat(paramVarArgs);
    Object localObject = this.animationFadeInterpolator;
    paramVarArgs.setInterpolator((TimeInterpolator)localObject);
    localObject = new com/google/android/material/snackbar/BaseTransientBottomBar$11;
    ((BaseTransientBottomBar.11)localObject).<init>(this);
    paramVarArgs.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject);
    return paramVarArgs;
  }
  
  private ValueAnimator getScaleAnimator(float... paramVarArgs)
  {
    paramVarArgs = ValueAnimator.ofFloat(paramVarArgs);
    Object localObject = this.animationScaleInterpolator;
    paramVarArgs.setInterpolator((TimeInterpolator)localObject);
    localObject = new com/google/android/material/snackbar/BaseTransientBottomBar$12;
    ((BaseTransientBottomBar.12)localObject).<init>(this);
    paramVarArgs.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject);
    return paramVarArgs;
  }
  
  private int getTranslationYBottom()
  {
    BaseTransientBottomBar.SnackbarBaseLayout localSnackbarBaseLayout = this.view;
    int i = localSnackbarBaseLayout.getHeight();
    Object localObject = this.view.getLayoutParams();
    boolean bool = localObject instanceof ViewGroup.MarginLayoutParams;
    if (bool)
    {
      localObject = (ViewGroup.MarginLayoutParams)localObject;
      int j = ((ViewGroup.MarginLayoutParams)localObject).bottomMargin;
      i += j;
    }
    return i;
  }
  
  private int getViewAbsoluteBottom()
  {
    int[] arrayOfInt = new int[2];
    this.view.getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[1];
    int j = this.view.getHeight();
    return i + j;
  }
  
  private boolean isSwipeDismissable()
  {
    Object localObject = this.view.getLayoutParams();
    boolean bool1 = localObject instanceof CoordinatorLayout.LayoutParams;
    if (bool1)
    {
      localObject = ((CoordinatorLayout.LayoutParams)localObject).getBehavior();
      bool2 = localObject instanceof SwipeDismissBehavior;
      if (bool2) {
        return true;
      }
    }
    boolean bool2 = false;
    localObject = null;
    return bool2;
  }
  
  private void recalculateAndUpdateMargins()
  {
    int i = calculateBottomMarginForAnchorView();
    this.extraBottomMarginAnchorView = i;
    updateMargins();
  }
  
  private void setUpBehavior(CoordinatorLayout.LayoutParams paramLayoutParams)
  {
    Object localObject1 = this.behavior;
    if (localObject1 == null) {
      localObject1 = getNewBehavior();
    }
    boolean bool = localObject1 instanceof BaseTransientBottomBar.Behavior;
    if (bool)
    {
      localObject2 = localObject1;
      localObject2 = (BaseTransientBottomBar.Behavior)localObject1;
      BaseTransientBottomBar.Behavior.access$1100((BaseTransientBottomBar.Behavior)localObject2, this);
    }
    Object localObject2 = new com/google/android/material/snackbar/BaseTransientBottomBar$7;
    ((BaseTransientBottomBar.7)localObject2).<init>(this);
    ((SwipeDismissBehavior)localObject1).setListener((SwipeDismissBehavior.OnDismissListener)localObject2);
    paramLayoutParams.setBehavior((CoordinatorLayout.Behavior)localObject1);
    localObject1 = getAnchorView();
    if (localObject1 == null)
    {
      int i = 80;
      paramLayoutParams.OooO0oO = i;
    }
  }
  
  private boolean shouldUpdateGestureInset()
  {
    int i = this.extraBottomMarginGestureInset;
    if (i > 0)
    {
      bool = this.gestureInsetBottomIgnored;
      if (!bool)
      {
        bool = isSwipeDismissable();
        if (bool) {
          return true;
        }
      }
    }
    boolean bool = false;
    return bool;
  }
  
  private void showViewImpl()
  {
    boolean bool = shouldAnimate();
    if (bool)
    {
      animateViewIn();
    }
    else
    {
      Object localObject = this.view.getParent();
      if (localObject != null)
      {
        localObject = this.view;
        ((View)localObject).setVisibility(0);
      }
      onViewShown();
    }
  }
  
  private void startFadeInAnimation()
  {
    int i = 2;
    Object localObject1 = new float[i];
    Object tmp7_6 = localObject1;
    tmp7_6[0] = 0.0F;
    tmp7_6[1] = 1.0F;
    localObject1 = getAlphaAnimator((float[])localObject1);
    Object localObject2 = new float[i];
    Object tmp27_26 = localObject2;
    tmp27_26[0] = 0.8F;
    tmp27_26[1] = 1.0F;
    localObject2 = getScaleAnimator((float[])localObject2);
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    Object localObject3 = new Animator[i];
    localObject3[0] = localObject1;
    localObject3[1] = localObject2;
    localAnimatorSet.playTogether((Animator[])localObject3);
    long l = this.animationFadeInDuration;
    localAnimatorSet.setDuration(l);
    localObject3 = new com/google/android/material/snackbar/BaseTransientBottomBar$9;
    ((BaseTransientBottomBar.9)localObject3).<init>(this);
    localAnimatorSet.addListener((Animator.AnimatorListener)localObject3);
    localAnimatorSet.start();
  }
  
  private void startFadeOutAnimation(int paramInt)
  {
    Object localObject = new float[2];
    Object tmp5_4 = localObject;
    tmp5_4[0] = 1.0F;
    tmp5_4[1] = 0.0F;
    localObject = getAlphaAnimator((float[])localObject);
    long l = this.animationFadeOutDuration;
    ((ValueAnimator)localObject).setDuration(l);
    BaseTransientBottomBar.10 local10 = new com/google/android/material/snackbar/BaseTransientBottomBar$10;
    local10.<init>(this, paramInt);
    ((Animator)localObject).addListener(local10);
    ((ValueAnimator)localObject).start();
  }
  
  private void startSlideInAnimation()
  {
    int i = getTranslationYBottom();
    boolean bool = USE_OFFSET_API;
    if (bool)
    {
      localObject1 = this.view;
      ViewCompat.OooooO0((View)localObject1, i);
    }
    else
    {
      localObject1 = this.view;
      float f = i;
      ((View)localObject1).setTranslationY(f);
    }
    Object localObject1 = new android/animation/ValueAnimator;
    ((ValueAnimator)localObject1).<init>();
    Object localObject2 = { i, 0 };
    ((ValueAnimator)localObject1).setIntValues((int[])localObject2);
    localObject2 = this.animationSlideInterpolator;
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    long l = this.animationSlideDuration;
    ((ValueAnimator)localObject1).setDuration(l);
    localObject2 = new com/google/android/material/snackbar/BaseTransientBottomBar$13;
    ((BaseTransientBottomBar.13)localObject2).<init>(this);
    ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
    localObject2 = new com/google/android/material/snackbar/BaseTransientBottomBar$14;
    ((BaseTransientBottomBar.14)localObject2).<init>(this, i);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    ((ValueAnimator)localObject1).start();
  }
  
  private void startSlideOutAnimation(int paramInt)
  {
    ValueAnimator localValueAnimator = new android/animation/ValueAnimator;
    localValueAnimator.<init>();
    int i = getTranslationYBottom();
    Object localObject = { 0, i };
    localValueAnimator.setIntValues((int[])localObject);
    localObject = this.animationSlideInterpolator;
    localValueAnimator.setInterpolator((TimeInterpolator)localObject);
    long l = this.animationSlideDuration;
    localValueAnimator.setDuration(l);
    localObject = new com/google/android/material/snackbar/BaseTransientBottomBar$15;
    ((BaseTransientBottomBar.15)localObject).<init>(this, paramInt);
    localValueAnimator.addListener((Animator.AnimatorListener)localObject);
    BaseTransientBottomBar.16 local16 = new com/google/android/material/snackbar/BaseTransientBottomBar$16;
    local16.<init>(this);
    localValueAnimator.addUpdateListener(local16);
    localValueAnimator.start();
  }
  
  private void updateMargins()
  {
    Object localObject1 = this.view.getLayoutParams();
    boolean bool1 = localObject1 instanceof ViewGroup.MarginLayoutParams;
    if (!bool1) {
      return;
    }
    Object localObject2 = BaseTransientBottomBar.SnackbarBaseLayout.access$1000(this.view);
    if (localObject2 == null) {
      return;
    }
    localObject2 = this.view.getParent();
    if (localObject2 == null) {
      return;
    }
    localObject2 = getAnchorView();
    if (localObject2 != null) {
      i = this.extraBottomMarginAnchorView;
    } else {
      i = this.extraBottomMarginWindowInset;
    }
    localObject1 = (ViewGroup.MarginLayoutParams)localObject1;
    Rect localRect1 = BaseTransientBottomBar.SnackbarBaseLayout.access$1000(this.view);
    int j = localRect1.bottom + i;
    localObject2 = BaseTransientBottomBar.SnackbarBaseLayout.access$1000(this.view);
    int i = ((Rect)localObject2).left;
    int k = this.extraLeftMarginWindowInset;
    i += k;
    Rect localRect2 = BaseTransientBottomBar.SnackbarBaseLayout.access$1000(this.view);
    k = localRect2.right;
    int m = this.extraRightMarginWindowInset;
    k += m;
    Rect localRect3 = BaseTransientBottomBar.SnackbarBaseLayout.access$1000(this.view);
    m = localRect3.top;
    int n = ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin;
    if (n == j)
    {
      n = ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;
      if (n == i)
      {
        n = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin;
        if (n == k)
        {
          n = ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
          if (n == m)
          {
            n = 0;
            break label221;
          }
        }
      }
    }
    n = 1;
    label221:
    if (n != 0)
    {
      ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin = j;
      ((ViewGroup.MarginLayoutParams)localObject1).leftMargin = i;
      ((ViewGroup.MarginLayoutParams)localObject1).rightMargin = k;
      ((ViewGroup.MarginLayoutParams)localObject1).topMargin = m;
      localObject1 = this.view;
      ((View)localObject1).requestLayout();
    }
    int i1;
    if (n == 0)
    {
      i1 = this.appliedBottomMarginGestureInset;
      i = this.extraBottomMarginGestureInset;
      if (i1 == i) {}
    }
    else
    {
      i1 = Build.VERSION.SDK_INT;
      i = 29;
      if (i1 >= i)
      {
        boolean bool2 = shouldUpdateGestureInset();
        if (bool2)
        {
          localObject1 = this.view;
          localObject2 = this.bottomMarginGestureInsetRunnable;
          ((View)localObject1).removeCallbacks((Runnable)localObject2);
          localObject1 = this.view;
          localObject2 = this.bottomMarginGestureInsetRunnable;
          ((View)localObject1).post((Runnable)localObject2);
        }
      }
    }
  }
  
  public BaseTransientBottomBar addCallback(BaseTransientBottomBar.BaseCallback paramBaseCallback)
  {
    if (paramBaseCallback == null) {
      return this;
    }
    Object localObject = this.callbacks;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.callbacks = ((List)localObject);
    }
    this.callbacks.add(paramBaseCallback);
    return this;
  }
  
  public void animateViewIn()
  {
    BaseTransientBottomBar.SnackbarBaseLayout localSnackbarBaseLayout = this.view;
    BaseTransientBottomBar.8 local8 = new com/google/android/material/snackbar/BaseTransientBottomBar$8;
    local8.<init>(this);
    localSnackbarBaseLayout.post(local8);
  }
  
  public void dismiss()
  {
    dispatchDismiss(3);
  }
  
  public void dispatchDismiss(int paramInt)
  {
    SnackbarManager localSnackbarManager = SnackbarManager.getInstance();
    SnackbarManager.Callback localCallback = this.managerCallback;
    localSnackbarManager.dismiss(localCallback, paramInt);
  }
  
  public View getAnchorView()
  {
    Object localObject = this.anchor;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((BaseTransientBottomBar.Anchor)localObject).getAnchorView();
    }
    return localObject;
  }
  
  public int getAnimationMode()
  {
    return this.view.getAnimationMode();
  }
  
  public BaseTransientBottomBar.Behavior getBehavior()
  {
    return this.behavior;
  }
  
  public Context getContext()
  {
    return this.context;
  }
  
  public int getDuration()
  {
    return this.duration;
  }
  
  public SwipeDismissBehavior getNewBehavior()
  {
    BaseTransientBottomBar.Behavior localBehavior = new com/google/android/material/snackbar/BaseTransientBottomBar$Behavior;
    localBehavior.<init>();
    return localBehavior;
  }
  
  public int getSnackbarBaseLayoutResId()
  {
    boolean bool = hasSnackbarStyleAttr();
    int i;
    if (bool) {
      i = R.layout.mtrl_layout_snackbar;
    } else {
      i = R.layout.design_layout_snackbar;
    }
    return i;
  }
  
  public View getView()
  {
    return this.view;
  }
  
  public boolean hasSnackbarStyleAttr()
  {
    Object localObject = this.context;
    int[] arrayOfInt = SNACKBAR_STYLE_ATTR;
    localObject = ((Context)localObject).obtainStyledAttributes(arrayOfInt);
    boolean bool = false;
    arrayOfInt = null;
    int i = -1;
    int j = ((TypedArray)localObject).getResourceId(0, i);
    ((TypedArray)localObject).recycle();
    if (j != i) {
      bool = true;
    }
    return bool;
  }
  
  public final void hideView(int paramInt)
  {
    boolean bool = shouldAnimate();
    if (bool)
    {
      BaseTransientBottomBar.SnackbarBaseLayout localSnackbarBaseLayout = this.view;
      int i = localSnackbarBaseLayout.getVisibility();
      if (i == 0)
      {
        animateViewOut(paramInt);
        return;
      }
    }
    onViewHidden(paramInt);
  }
  
  public boolean isAnchorViewLayoutListenerEnabled()
  {
    return this.anchorViewLayoutListenerEnabled;
  }
  
  public boolean isGestureInsetBottomIgnored()
  {
    return this.gestureInsetBottomIgnored;
  }
  
  public boolean isShown()
  {
    SnackbarManager localSnackbarManager = SnackbarManager.getInstance();
    SnackbarManager.Callback localCallback = this.managerCallback;
    return localSnackbarManager.isCurrent(localCallback);
  }
  
  public boolean isShownOrQueued()
  {
    SnackbarManager localSnackbarManager = SnackbarManager.getInstance();
    SnackbarManager.Callback localCallback = this.managerCallback;
    return localSnackbarManager.isCurrentOrNext(localCallback);
  }
  
  public void onAttachedToWindow()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      Object localObject = this.view.getRootWindowInsets();
      if (localObject != null)
      {
        localObject = o000OO00.OooO00o((WindowInsets)localObject);
        i = OooOO0.OooO00o((Insets)localObject);
        this.extraBottomMarginGestureInset = i;
        updateMargins();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    boolean bool = isShownOrQueued();
    if (bool)
    {
      Handler localHandler = handler;
      BaseTransientBottomBar.6 local6 = new com/google/android/material/snackbar/BaseTransientBottomBar$6;
      local6.<init>(this);
      localHandler.post(local6);
    }
  }
  
  public void onLayoutChange()
  {
    boolean bool = this.pendingShowingView;
    if (bool)
    {
      showViewImpl();
      bool = false;
      this.pendingShowingView = false;
    }
  }
  
  public void onViewHidden(int paramInt)
  {
    Object localObject1 = SnackbarManager.getInstance();
    Object localObject2 = this.managerCallback;
    ((SnackbarManager)localObject1).onDismissed((SnackbarManager.Callback)localObject2);
    localObject1 = this.callbacks;
    if (localObject1 != null)
    {
      int i = ((List)localObject1).size() + -1;
      while (i >= 0)
      {
        localObject2 = (BaseTransientBottomBar.BaseCallback)this.callbacks.get(i);
        ((BaseTransientBottomBar.BaseCallback)localObject2).onDismissed(this, paramInt);
        i += -1;
      }
    }
    Object localObject3 = this.view.getParent();
    boolean bool = localObject3 instanceof ViewGroup;
    if (bool)
    {
      localObject3 = (ViewGroup)localObject3;
      localObject1 = this.view;
      ((ViewGroup)localObject3).removeView((View)localObject1);
    }
  }
  
  public void onViewShown()
  {
    Object localObject1 = SnackbarManager.getInstance();
    Object localObject2 = this.managerCallback;
    ((SnackbarManager)localObject1).onShown((SnackbarManager.Callback)localObject2);
    localObject1 = this.callbacks;
    if (localObject1 != null)
    {
      int i = ((List)localObject1).size() + -1;
      while (i >= 0)
      {
        localObject2 = (BaseTransientBottomBar.BaseCallback)this.callbacks.get(i);
        ((BaseTransientBottomBar.BaseCallback)localObject2).onShown(this);
        i += -1;
      }
    }
  }
  
  public BaseTransientBottomBar removeCallback(BaseTransientBottomBar.BaseCallback paramBaseCallback)
  {
    if (paramBaseCallback == null) {
      return this;
    }
    List localList = this.callbacks;
    if (localList == null) {
      return this;
    }
    localList.remove(paramBaseCallback);
    return this;
  }
  
  public BaseTransientBottomBar setAnchorView(int paramInt)
  {
    Object localObject = this.targetParent.findViewById(paramInt);
    if (localObject != null) {
      return setAnchorView((View)localObject);
    }
    localObject = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("j\\09333F41343E822F3B8544403E458A4C425046464291404C514496465145529B5559889F");
    localStringBuilder.append(str1);
    localStringBuilder.append(paramInt);
    String str2 = localStringBuilder.toString();
    ((IllegalArgumentException)localObject).<init>(str2);
    throw ((Throwable)localObject);
  }
  
  public BaseTransientBottomBar setAnchorView(View paramView)
  {
    BaseTransientBottomBar.Anchor localAnchor = this.anchor;
    if (localAnchor != null) {
      localAnchor.unanchor();
    }
    if (paramView == null) {
      paramView = null;
    } else {
      paramView = BaseTransientBottomBar.Anchor.anchor(this, paramView);
    }
    this.anchor = paramView;
    return this;
  }
  
  public void setAnchorViewLayoutListenerEnabled(boolean paramBoolean)
  {
    this.anchorViewLayoutListenerEnabled = paramBoolean;
  }
  
  public BaseTransientBottomBar setAnimationMode(int paramInt)
  {
    this.view.setAnimationMode(paramInt);
    return this;
  }
  
  public BaseTransientBottomBar setBehavior(BaseTransientBottomBar.Behavior paramBehavior)
  {
    this.behavior = paramBehavior;
    return this;
  }
  
  public BaseTransientBottomBar setDuration(int paramInt)
  {
    this.duration = paramInt;
    return this;
  }
  
  public BaseTransientBottomBar setGestureInsetBottomIgnored(boolean paramBoolean)
  {
    this.gestureInsetBottomIgnored = paramBoolean;
    return this;
  }
  
  public boolean shouldAnimate()
  {
    Object localObject = this.accessibilityManager;
    int i = 1;
    if (localObject == null) {
      return i;
    }
    localObject = ((AccessibilityManager)localObject).getEnabledAccessibilityServiceList(i);
    boolean bool1;
    if (localObject != null)
    {
      boolean bool2 = ((List)localObject).isEmpty();
      if (bool2) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public void show()
  {
    SnackbarManager localSnackbarManager = SnackbarManager.getInstance();
    int i = getDuration();
    SnackbarManager.Callback localCallback = this.managerCallback;
    localSnackbarManager.show(i, localCallback);
  }
  
  public final void showView()
  {
    Object localObject = this.view.getParent();
    if (localObject == null)
    {
      localObject = this.view.getLayoutParams();
      boolean bool1 = localObject instanceof CoordinatorLayout.LayoutParams;
      if (bool1)
      {
        localObject = (CoordinatorLayout.LayoutParams)localObject;
        setUpBehavior((CoordinatorLayout.LayoutParams)localObject);
      }
      localObject = this.view;
      ViewGroup localViewGroup = this.targetParent;
      ((BaseTransientBottomBar.SnackbarBaseLayout)localObject).addToTargetParent(localViewGroup);
      recalculateAndUpdateMargins();
      localObject = this.view;
      int i = 4;
      ((View)localObject).setVisibility(i);
    }
    localObject = this.view;
    boolean bool2 = ViewCompat.OoooOOO((View)localObject);
    if (bool2)
    {
      showViewImpl();
      return;
    }
    this.pendingShowingView = true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar
 * JD-Core Version:    0.7.0.1
 */