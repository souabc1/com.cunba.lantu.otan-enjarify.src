package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class ExtendedFloatingActionButton$5
  extends AnimatorListenerAdapter
{
  private boolean cancelled;
  
  public ExtendedFloatingActionButton$5(ExtendedFloatingActionButton paramExtendedFloatingActionButton, MotionStrategy paramMotionStrategy, ExtendedFloatingActionButton.OnChangedCallback paramOnChangedCallback) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.cancelled = true;
    this.val$strategy.onAnimationCancel();
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.val$strategy;
    paramAnimator.onAnimationEnd();
    boolean bool = this.cancelled;
    if (!bool)
    {
      paramAnimator = this.val$strategy;
      ExtendedFloatingActionButton.OnChangedCallback localOnChangedCallback = this.val$callback;
      paramAnimator.onChange(localOnChangedCallback);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.val$strategy.onAnimationStart(paramAnimator);
    this.cancelled = false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
 * JD-Core Version:    0.7.0.1
 */