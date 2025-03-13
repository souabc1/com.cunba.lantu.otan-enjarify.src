package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class BaseTransientBottomBar$10
  extends AnimatorListenerAdapter
{
  public BaseTransientBottomBar$10(BaseTransientBottomBar paramBaseTransientBottomBar, int paramInt) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.this$0;
    int i = this.val$event;
    paramAnimator.onViewHidden(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.10
 * JD-Core Version:    0.7.0.1
 */