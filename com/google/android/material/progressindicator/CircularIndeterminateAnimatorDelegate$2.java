package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;

class CircularIndeterminateAnimatorDelegate$2
  extends AnimatorListenerAdapter
{
  public CircularIndeterminateAnimatorDelegate$2(CircularIndeterminateAnimatorDelegate paramCircularIndeterminateAnimatorDelegate) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    super.onAnimationEnd(paramAnimator);
    this.this$0.cancelAnimatorImmediately();
    paramAnimator = this.this$0;
    Animatable2Compat.AnimationCallback localAnimationCallback = paramAnimator.animatorCompleteCallback;
    if (localAnimationCallback != null)
    {
      paramAnimator = paramAnimator.drawable;
      localAnimationCallback.onAnimationEnd(paramAnimator);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.2
 * JD-Core Version:    0.7.0.1
 */