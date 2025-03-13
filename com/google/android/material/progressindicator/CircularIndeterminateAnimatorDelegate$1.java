package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class CircularIndeterminateAnimatorDelegate$1
  extends AnimatorListenerAdapter
{
  public CircularIndeterminateAnimatorDelegate$1(CircularIndeterminateAnimatorDelegate paramCircularIndeterminateAnimatorDelegate) {}
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    super.onAnimationRepeat(paramAnimator);
    paramAnimator = this.this$0;
    int i = CircularIndeterminateAnimatorDelegate.access$000(paramAnimator) + 4;
    int j = CircularIndeterminateAnimatorDelegate.access$100(this.this$0).indicatorColors.length;
    i %= j;
    CircularIndeterminateAnimatorDelegate.access$002(paramAnimator, i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.1
 * JD-Core Version:    0.7.0.1
 */