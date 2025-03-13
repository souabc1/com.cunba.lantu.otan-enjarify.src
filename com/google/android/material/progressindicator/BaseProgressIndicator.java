package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import java.util.Arrays;
import m54207b69;

public abstract class BaseProgressIndicator
  extends ProgressBar
{
  static final float DEFAULT_OPACITY = 0.2F;
  static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ProgressIndicator;
  public static final int HIDE_INWARD = 2;
  public static final int HIDE_NONE = 0;
  public static final int HIDE_OUTWARD = 1;
  static final int MAX_ALPHA = 255;
  static final int MAX_HIDE_DELAY = 1000;
  public static final int SHOW_INWARD = 2;
  public static final int SHOW_NONE = 0;
  public static final int SHOW_OUTWARD = 1;
  AnimatorDurationScaleProvider animatorDurationScaleProvider;
  private final Runnable delayedHide;
  private final Runnable delayedShow;
  private final Animatable2Compat.AnimationCallback hideAnimationCallback;
  private boolean isIndeterminateModeChangeRequested = false;
  private boolean isParentDoneInitializing;
  private long lastShowStartTime = -1;
  private final int minHideDelay;
  private final int showDelay;
  BaseProgressIndicatorSpec spec;
  private int storedProgress;
  private boolean storedProgressAnimated;
  private final Animatable2Compat.AnimationCallback switchIndeterminateModeCallback;
  private int visibilityAfterHide = 4;
  
  public BaseProgressIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    Object localObject = new com/google/android/material/progressindicator/BaseProgressIndicator$1;
    ((BaseProgressIndicator.1)localObject).<init>(this);
    this.delayedShow = ((Runnable)localObject);
    localObject = new com/google/android/material/progressindicator/BaseProgressIndicator$2;
    ((BaseProgressIndicator.2)localObject).<init>(this);
    this.delayedHide = ((Runnable)localObject);
    localObject = new com/google/android/material/progressindicator/BaseProgressIndicator$3;
    ((BaseProgressIndicator.3)localObject).<init>(this);
    this.switchIndeterminateModeCallback = ((Animatable2Compat.AnimationCallback)localObject);
    localObject = new com/google/android/material/progressindicator/BaseProgressIndicator$4;
    ((BaseProgressIndicator.4)localObject).<init>(this);
    this.hideAnimationCallback = ((Animatable2Compat.AnimationCallback)localObject);
    Context localContext = getContext();
    localObject = createSpec(localContext, paramAttributeSet);
    this.spec = ((BaseProgressIndicatorSpec)localObject);
    int[] arrayOfInt1 = R.styleable.BaseProgressIndicator;
    int[] arrayOfInt2 = new int[0];
    paramContext = ThemeEnforcement.obtainStyledAttributes(localContext, paramAttributeSet, arrayOfInt1, paramInt1, paramInt2, arrayOfInt2);
    int j = R.styleable.BaseProgressIndicator_showDelay;
    paramInt1 = -1;
    j = paramContext.getInt(j, paramInt1);
    this.showDelay = j;
    j = R.styleable.BaseProgressIndicator_minHideDelay;
    j = Math.min(paramContext.getInt(j, paramInt1), 1000);
    this.minHideDelay = j;
    paramContext.recycle();
    paramContext = new com/google/android/material/progressindicator/AnimatorDurationScaleProvider;
    paramContext.<init>();
    this.animatorDurationScaleProvider = paramContext;
    this.isParentDoneInitializing = true;
  }
  
  private DrawingDelegate getCurrentDrawingDelegate()
  {
    boolean bool = isIndeterminate();
    DrawingDelegate localDrawingDelegate = null;
    if (bool)
    {
      localObject = getIndeterminateDrawable();
      if (localObject != null)
      {
        localObject = getIndeterminateDrawable();
        localDrawingDelegate = ((IndeterminateDrawable)localObject).getDrawingDelegate();
      }
      return localDrawingDelegate;
    }
    Object localObject = getProgressDrawable();
    if (localObject != null)
    {
      localObject = getProgressDrawable();
      localDrawingDelegate = ((DeterminateDrawable)localObject).getDrawingDelegate();
    }
    return localDrawingDelegate;
  }
  
  private void internalHide()
  {
    DrawableWithAnimatedVisibilityChange localDrawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange)getCurrentDrawable();
    boolean bool1 = true;
    localDrawableWithAnimatedVisibilityChange.setVisible(false, false, bool1);
    boolean bool2 = isNoLongerNeedToBeVisible();
    if (bool2)
    {
      int i = 4;
      setVisibility(i);
    }
  }
  
  private void internalShow()
  {
    int i = this.minHideDelay;
    if (i > 0)
    {
      long l = SystemClock.uptimeMillis();
      this.lastShowStartTime = l;
    }
    setVisibility(0);
  }
  
  private boolean isNoLongerNeedToBeVisible()
  {
    Object localObject = getProgressDrawable();
    if (localObject != null)
    {
      localObject = getProgressDrawable();
      bool = ((Drawable)localObject).isVisible();
      if (bool) {}
    }
    else
    {
      localObject = getIndeterminateDrawable();
      if (localObject == null) {
        break label56;
      }
      localObject = getIndeterminateDrawable();
      bool = ((Drawable)localObject).isVisible();
      if (!bool) {
        break label56;
      }
    }
    boolean bool = false;
    localObject = null;
    return bool;
    label56:
    bool = true;
    return bool;
  }
  
  private void registerAnimationCallbacks()
  {
    Object localObject = getProgressDrawable();
    Animatable2Compat.AnimationCallback localAnimationCallback;
    if (localObject != null)
    {
      localObject = getIndeterminateDrawable();
      if (localObject != null)
      {
        localObject = getIndeterminateDrawable().getAnimatorDelegate();
        localAnimationCallback = this.switchIndeterminateModeCallback;
        ((IndeterminateAnimatorDelegate)localObject).registerAnimatorsCompleteCallback(localAnimationCallback);
      }
    }
    localObject = getProgressDrawable();
    if (localObject != null)
    {
      localObject = getProgressDrawable();
      localAnimationCallback = this.hideAnimationCallback;
      ((DeterminateDrawable)localObject).registerAnimationCallback(localAnimationCallback);
    }
    localObject = getIndeterminateDrawable();
    if (localObject != null)
    {
      localObject = getIndeterminateDrawable();
      localAnimationCallback = this.hideAnimationCallback;
      ((IndeterminateDrawable)localObject).registerAnimationCallback(localAnimationCallback);
    }
  }
  
  private void unregisterAnimationCallbacks()
  {
    Object localObject = getIndeterminateDrawable();
    Animatable2Compat.AnimationCallback localAnimationCallback;
    if (localObject != null)
    {
      localObject = getIndeterminateDrawable();
      localAnimationCallback = this.hideAnimationCallback;
      ((IndeterminateDrawable)localObject).unregisterAnimationCallback(localAnimationCallback);
      localObject = getIndeterminateDrawable().getAnimatorDelegate();
      ((IndeterminateAnimatorDelegate)localObject).unregisterAnimatorsCompleteCallback();
    }
    localObject = getProgressDrawable();
    if (localObject != null)
    {
      localObject = getProgressDrawable();
      localAnimationCallback = this.hideAnimationCallback;
      ((DeterminateDrawable)localObject).unregisterAnimationCallback(localAnimationCallback);
    }
  }
  
  public void applyNewVisibility(boolean paramBoolean)
  {
    boolean bool1 = this.isParentDoneInitializing;
    if (!bool1) {
      return;
    }
    DrawableWithAnimatedVisibilityChange localDrawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange)getCurrentDrawable();
    boolean bool2 = visibleToUser();
    localDrawableWithAnimatedVisibilityChange.setVisible(bool2, false, paramBoolean);
  }
  
  public abstract BaseProgressIndicatorSpec createSpec(Context paramContext, AttributeSet paramAttributeSet);
  
  public Drawable getCurrentDrawable()
  {
    boolean bool = isIndeterminate();
    Object localObject;
    if (bool) {
      localObject = getIndeterminateDrawable();
    } else {
      localObject = getProgressDrawable();
    }
    return localObject;
  }
  
  public int getHideAnimationBehavior()
  {
    return this.spec.hideAnimationBehavior;
  }
  
  public IndeterminateDrawable getIndeterminateDrawable()
  {
    return (IndeterminateDrawable)super.getIndeterminateDrawable();
  }
  
  public int[] getIndicatorColor()
  {
    return this.spec.indicatorColors;
  }
  
  public DeterminateDrawable getProgressDrawable()
  {
    return (DeterminateDrawable)super.getProgressDrawable();
  }
  
  public int getShowAnimationBehavior()
  {
    return this.spec.showAnimationBehavior;
  }
  
  public int getTrackColor()
  {
    return this.spec.trackColor;
  }
  
  public int getTrackCornerRadius()
  {
    return this.spec.trackCornerRadius;
  }
  
  public int getTrackThickness()
  {
    return this.spec.trackThickness;
  }
  
  public void hide()
  {
    int i = getVisibility();
    if (i != 0)
    {
      localRunnable1 = this.delayedShow;
      removeCallbacks(localRunnable1);
      return;
    }
    Runnable localRunnable1 = this.delayedHide;
    removeCallbacks(localRunnable1);
    long l1 = SystemClock.uptimeMillis();
    long l2 = this.lastShowStartTime;
    l1 -= l2;
    int j = this.minHideDelay;
    long l3 = j;
    boolean bool = l1 < l3;
    if (!bool)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localRunnable2 = null;
    }
    if (bool)
    {
      this.delayedHide.run();
      return;
    }
    Runnable localRunnable2 = this.delayedHide;
    long l4 = j - l1;
    postDelayed(localRunnable2, l4);
  }
  
  public void invalidate()
  {
    super.invalidate();
    Drawable localDrawable = getCurrentDrawable();
    if (localDrawable != null)
    {
      localDrawable = getCurrentDrawable();
      localDrawable.invalidateSelf();
    }
  }
  
  public boolean isEffectivelyVisible()
  {
    for (Object localObject = this;; localObject = (View)localObject)
    {
      int i = ((View)localObject).getVisibility();
      boolean bool = false;
      if (i != 0) {
        return false;
      }
      localObject = ((View)localObject).getParent();
      i = 1;
      if (localObject == null)
      {
        int j = getWindowVisibility();
        if (j == 0) {
          bool = i;
        }
        return bool;
      }
      bool = localObject instanceof View;
      if (!bool) {
        return i;
      }
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    registerAnimationCallbacks();
    boolean bool = visibleToUser();
    if (bool) {
      internalShow();
    }
  }
  
  public void onDetachedFromWindow()
  {
    Runnable localRunnable = this.delayedHide;
    removeCallbacks(localRunnable);
    localRunnable = this.delayedShow;
    removeCallbacks(localRunnable);
    ((DrawableWithAnimatedVisibilityChange)getCurrentDrawable()).hideNow();
    unregisterAnimationCallbacks();
    super.onDetachedFromWindow();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    try
    {
      int i = paramCanvas.save();
      int j = getPaddingLeft();
      int k;
      if (j == 0)
      {
        j = getPaddingTop();
        if (j == 0) {}
      }
      else
      {
        j = getPaddingLeft();
        float f1 = j;
        k = getPaddingTop();
        float f2 = k;
        paramCanvas.translate(f1, f2);
      }
      j = getPaddingRight();
      if (j == 0)
      {
        j = getPaddingBottom();
        if (j == 0) {}
      }
      else
      {
        j = getWidth();
        k = getPaddingLeft();
        int m = getPaddingRight();
        k += m;
        j -= k;
        k = getHeight();
        m = getPaddingTop();
        int n = getPaddingBottom();
        m += n;
        k -= m;
        m = 0;
        paramCanvas.clipRect(0, 0, j, k);
      }
      Drawable localDrawable = getCurrentDrawable();
      localDrawable.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
      return;
    }
    finally {}
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      DrawingDelegate localDrawingDelegate = getCurrentDrawingDelegate();
      if (localDrawingDelegate == null) {
        return;
      }
      int i = localDrawingDelegate.getPreferredWidth();
      if (i < 0)
      {
        i = getSuggestedMinimumWidth();
        paramInt1 = View.getDefaultSize(i, paramInt1);
      }
      else
      {
        paramInt1 = localDrawingDelegate.getPreferredWidth();
        i = getPaddingLeft();
        paramInt1 += i;
        i = getPaddingRight();
        paramInt1 += i;
      }
      i = localDrawingDelegate.getPreferredHeight();
      int j;
      if (i < 0)
      {
        j = getSuggestedMinimumHeight();
        paramInt2 = View.getDefaultSize(j, paramInt2);
      }
      else
      {
        paramInt2 = localDrawingDelegate.getPreferredHeight();
        j = getPaddingTop();
        paramInt2 += j;
        j = getPaddingBottom();
        paramInt2 += j;
      }
      setMeasuredDimension(paramInt1, paramInt2);
      return;
    }
    finally {}
  }
  
  public void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    boolean bool;
    if (paramInt == 0)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramView = null;
    }
    applyNewVisibility(bool);
  }
  
  public void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    applyNewVisibility(false);
  }
  
  public void setAnimatorDurationScaleProvider(AnimatorDurationScaleProvider paramAnimatorDurationScaleProvider)
  {
    this.animatorDurationScaleProvider = paramAnimatorDurationScaleProvider;
    Object localObject = getProgressDrawable();
    if (localObject != null)
    {
      localObject = getProgressDrawable();
      ((DrawableWithAnimatedVisibilityChange)localObject).animatorDurationScaleProvider = paramAnimatorDurationScaleProvider;
    }
    localObject = getIndeterminateDrawable();
    if (localObject != null)
    {
      localObject = getIndeterminateDrawable();
      ((DrawableWithAnimatedVisibilityChange)localObject).animatorDurationScaleProvider = paramAnimatorDurationScaleProvider;
    }
  }
  
  public void setHideAnimationBehavior(int paramInt)
  {
    this.spec.hideAnimationBehavior = paramInt;
    invalidate();
  }
  
  public void setIndeterminate(boolean paramBoolean)
  {
    try
    {
      boolean bool1 = isIndeterminate();
      if (paramBoolean == bool1) {
        return;
      }
      Object localObject1 = getCurrentDrawable();
      localObject1 = (DrawableWithAnimatedVisibilityChange)localObject1;
      if (localObject1 != null) {
        ((DrawableWithAnimatedVisibilityChange)localObject1).hideNow();
      }
      super.setIndeterminate(paramBoolean);
      Object localObject2 = getCurrentDrawable();
      localObject2 = (DrawableWithAnimatedVisibilityChange)localObject2;
      bool1 = false;
      localObject1 = null;
      if (localObject2 != null)
      {
        bool2 = visibleToUser();
        ((DrawableWithAnimatedVisibilityChange)localObject2).setVisible(bool2, false, false);
      }
      boolean bool2 = localObject2 instanceof IndeterminateDrawable;
      if (bool2)
      {
        bool2 = visibleToUser();
        if (bool2)
        {
          localObject2 = (IndeterminateDrawable)localObject2;
          localObject2 = ((IndeterminateDrawable)localObject2).getAnimatorDelegate();
          ((IndeterminateAnimatorDelegate)localObject2).startAnimator();
        }
      }
      this.isIndeterminateModeChangeRequested = false;
      return;
    }
    finally {}
  }
  
  public void setIndeterminateDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == null)
    {
      super.setIndeterminateDrawable(null);
      return;
    }
    boolean bool = paramDrawable instanceof IndeterminateDrawable;
    if (bool)
    {
      localObject = paramDrawable;
      ((DrawableWithAnimatedVisibilityChange)paramDrawable).hideNow();
      super.setIndeterminateDrawable((Drawable)paramDrawable);
      return;
    }
    paramDrawable = new java/lang/IllegalArgumentException;
    Object localObject = m54207b69.F54207b69_11("1P133240414329762A3D2D7A412E3E4B443750344E844938483F4A4C57518D4F42905A605759495B496562685C50629E635262596466716BB5");
    paramDrawable.<init>((String)localObject);
    throw paramDrawable;
  }
  
  public void setIndicatorColor(int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i == 0)
    {
      paramVarArgs = getContext();
      i = R.attr.colorPrimary;
      int j = -1;
      int k = MaterialColors.getColor(paramVarArgs, i, j);
      paramVarArgs = new int[] { k };
    }
    Object localObject = getIndicatorColor();
    boolean bool = Arrays.equals((int[])localObject, paramVarArgs);
    if (!bool)
    {
      localObject = this.spec;
      ((BaseProgressIndicatorSpec)localObject).indicatorColors = paramVarArgs;
      paramVarArgs = getIndeterminateDrawable().getAnimatorDelegate();
      paramVarArgs.invalidateSpecValues();
      invalidate();
    }
  }
  
  public void setProgress(int paramInt)
  {
    try
    {
      boolean bool = isIndeterminate();
      if (bool) {
        return;
      }
      bool = false;
      setProgressCompat(paramInt, false);
      return;
    }
    finally {}
  }
  
  public void setProgressCompat(int paramInt, boolean paramBoolean)
  {
    boolean bool = isIndeterminate();
    Object localObject1;
    if (bool)
    {
      DeterminateDrawable localDeterminateDrawable = getProgressDrawable();
      if (localDeterminateDrawable != null)
      {
        this.storedProgress = paramInt;
        this.storedProgressAnimated = paramBoolean;
        float f = 1.4E-45F;
        this.isIndeterminateModeChangeRequested = true;
        localObject1 = getIndeterminateDrawable();
        paramInt = ((Drawable)localObject1).isVisible();
        if (paramInt != 0)
        {
          localObject1 = this.animatorDurationScaleProvider;
          localObject2 = getContext().getContentResolver();
          f = ((AnimatorDurationScaleProvider)localObject1).getSystemAnimatorDurationScale((ContentResolver)localObject2);
          paramBoolean = false;
          localObject2 = null;
          paramInt = f < 0.0F;
          if (paramInt != 0)
          {
            localObject1 = getIndeterminateDrawable().getAnimatorDelegate();
            ((IndeterminateAnimatorDelegate)localObject1).requestCancelAnimatorAfterCurrentCycle();
            return;
          }
        }
        localObject1 = this.switchIndeterminateModeCallback;
        Object localObject2 = getIndeterminateDrawable();
        ((Animatable2Compat.AnimationCallback)localObject1).onAnimationEnd((Drawable)localObject2);
      }
    }
    else
    {
      super.setProgress(paramInt);
      localObject1 = getProgressDrawable();
      if ((localObject1 != null) && (!paramBoolean))
      {
        localObject1 = getProgressDrawable();
        ((DeterminateDrawable)localObject1).jumpToCurrentState();
      }
    }
  }
  
  public void setProgressDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == null)
    {
      super.setProgressDrawable(null);
      return;
    }
    boolean bool = paramDrawable instanceof DeterminateDrawable;
    if (bool)
    {
      paramDrawable = (DeterminateDrawable)paramDrawable;
      paramDrawable.hideNow();
      super.setProgressDrawable(paramDrawable);
      float f1 = getProgress();
      float f2 = getMax();
      f1 /= f2;
      paramDrawable.setLevelByFraction(f1);
      return;
    }
    paramDrawable = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("0o2C0F03040420552312245914291B101928112F17632033253027271E266C2C3B6F403F232C423043447835483A453C3C333B73");
    paramDrawable.<init>(str);
    throw paramDrawable;
  }
  
  public void setShowAnimationBehavior(int paramInt)
  {
    this.spec.showAnimationBehavior = paramInt;
    invalidate();
  }
  
  public void setTrackColor(int paramInt)
  {
    BaseProgressIndicatorSpec localBaseProgressIndicatorSpec = this.spec;
    int i = localBaseProgressIndicatorSpec.trackColor;
    if (i != paramInt)
    {
      localBaseProgressIndicatorSpec.trackColor = paramInt;
      invalidate();
    }
  }
  
  public void setTrackCornerRadius(int paramInt)
  {
    BaseProgressIndicatorSpec localBaseProgressIndicatorSpec = this.spec;
    int i = localBaseProgressIndicatorSpec.trackCornerRadius;
    if (i != paramInt)
    {
      i = localBaseProgressIndicatorSpec.trackThickness / 2;
      paramInt = Math.min(paramInt, i);
      localBaseProgressIndicatorSpec.trackCornerRadius = paramInt;
    }
  }
  
  public void setTrackThickness(int paramInt)
  {
    BaseProgressIndicatorSpec localBaseProgressIndicatorSpec = this.spec;
    int i = localBaseProgressIndicatorSpec.trackThickness;
    if (i != paramInt)
    {
      localBaseProgressIndicatorSpec.trackThickness = paramInt;
      requestLayout();
    }
  }
  
  public void setVisibilityAfterHide(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 4;
      if (paramInt != i)
      {
        i = 8;
        if (paramInt != i)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          String str = m54207b69.F54207b69_11(";+7F44500E4C494C624C4E58506B19661A6D536A555D575D59776B25617A757D2A696F2D676973316B7534A78DA48F97969E383D9599B298AF9AA2A1A9434888848F4CAEA7A9B3519696968C909A9C5991955CCF95A2B15B");
          localIllegalArgumentException.<init>(str);
          throw localIllegalArgumentException;
        }
      }
    }
    this.visibilityAfterHide = paramInt;
  }
  
  public void show()
  {
    int i = this.showDelay;
    Runnable localRunnable;
    if (i > 0)
    {
      localRunnable = this.delayedShow;
      removeCallbacks(localRunnable);
      localRunnable = this.delayedShow;
      int j = this.showDelay;
      long l = j;
      postDelayed(localRunnable, l);
    }
    else
    {
      localRunnable = this.delayedShow;
      localRunnable.run();
    }
  }
  
  public boolean visibleToUser()
  {
    boolean bool1 = ViewCompat.o000oOoO(this);
    if (bool1)
    {
      int i = getWindowVisibility();
      if (i == 0)
      {
        bool2 = isEffectivelyVisible();
        if (bool2) {
          return true;
        }
      }
    }
    boolean bool2 = false;
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.BaseProgressIndicator
 * JD-Core Version:    0.7.0.1
 */