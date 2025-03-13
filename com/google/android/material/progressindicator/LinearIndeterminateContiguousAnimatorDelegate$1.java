package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class LinearIndeterminateContiguousAnimatorDelegate$1
  extends AnimatorListenerAdapter
{
  public LinearIndeterminateContiguousAnimatorDelegate$1(LinearIndeterminateContiguousAnimatorDelegate paramLinearIndeterminateContiguousAnimatorDelegate) {}
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    super.onAnimationRepeat(paramAnimator);
    paramAnimator = this.this$0;
    int i = LinearIndeterminateContiguousAnimatorDelegate.access$000(paramAnimator);
    int j = 1;
    i += j;
    int k = LinearIndeterminateContiguousAnimatorDelegate.access$100(this.this$0).indicatorColors.length;
    i %= k;
    LinearIndeterminateContiguousAnimatorDelegate.access$002(paramAnimator, i);
    LinearIndeterminateContiguousAnimatorDelegate.access$202(this.this$0, j);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.1
 * JD-Core Version:    0.7.0.1
 */