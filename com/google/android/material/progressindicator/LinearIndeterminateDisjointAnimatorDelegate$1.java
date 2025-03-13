package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class LinearIndeterminateDisjointAnimatorDelegate$1
  extends AnimatorListenerAdapter
{
  public LinearIndeterminateDisjointAnimatorDelegate$1(LinearIndeterminateDisjointAnimatorDelegate paramLinearIndeterminateDisjointAnimatorDelegate) {}
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    super.onAnimationRepeat(paramAnimator);
    paramAnimator = this.this$0;
    int i = LinearIndeterminateDisjointAnimatorDelegate.access$000(paramAnimator);
    int j = 1;
    i += j;
    int k = LinearIndeterminateDisjointAnimatorDelegate.access$100(this.this$0).indicatorColors.length;
    i %= k;
    LinearIndeterminateDisjointAnimatorDelegate.access$002(paramAnimator, i);
    LinearIndeterminateDisjointAnimatorDelegate.access$202(this.this$0, j);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
 * JD-Core Version:    0.7.0.1
 */