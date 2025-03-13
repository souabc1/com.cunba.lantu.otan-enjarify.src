package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class BaseTransientBottomBar$15
  extends AnimatorListenerAdapter
{
  public BaseTransientBottomBar$15(BaseTransientBottomBar paramBaseTransientBottomBar, int paramInt) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.this$0;
    int i = this.val$event;
    paramAnimator.onViewHidden(i);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = BaseTransientBottomBar.access$1600(this.this$0);
    int i = BaseTransientBottomBar.access$1800(this.this$0);
    paramAnimator.animateContentOut(0, i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.15
 * JD-Core Version:    0.7.0.1
 */