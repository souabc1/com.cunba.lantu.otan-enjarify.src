package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

class StateListAnimator$1
  extends AnimatorListenerAdapter
{
  public StateListAnimator$1(StateListAnimator paramStateListAnimator) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    StateListAnimator localStateListAnimator = this.this$0;
    ValueAnimator localValueAnimator = localStateListAnimator.runningAnimator;
    if (localValueAnimator == paramAnimator)
    {
      paramAnimator = null;
      localStateListAnimator.runningAnimator = null;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.StateListAnimator.1
 * JD-Core Version:    0.7.0.1
 */