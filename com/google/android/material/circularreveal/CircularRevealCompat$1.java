package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class CircularRevealCompat$1
  extends AnimatorListenerAdapter
{
  public CircularRevealCompat$1(CircularRevealWidget paramCircularRevealWidget) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.val$view.destroyCircularRevealCache();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.val$view.buildCircularRevealCache();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.circularreveal.CircularRevealCompat.1
 * JD-Core Version:    0.7.0.1
 */