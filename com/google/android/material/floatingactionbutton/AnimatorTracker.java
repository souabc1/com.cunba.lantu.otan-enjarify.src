package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

class AnimatorTracker
{
  private Animator currentAnimator;
  
  public void cancelCurrent()
  {
    Animator localAnimator = this.currentAnimator;
    if (localAnimator != null) {
      localAnimator.cancel();
    }
  }
  
  public void clear()
  {
    this.currentAnimator = null;
  }
  
  public void onNextAnimationStart(Animator paramAnimator)
  {
    cancelCurrent();
    this.currentAnimator = paramAnimator;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.AnimatorTracker
 * JD-Core Version:    0.7.0.1
 */