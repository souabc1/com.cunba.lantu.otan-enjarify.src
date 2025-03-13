package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class BaseTransientBottomBar$13
  extends AnimatorListenerAdapter
{
  public BaseTransientBottomBar$13(BaseTransientBottomBar paramBaseTransientBottomBar) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.this$0.onViewShown();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = BaseTransientBottomBar.access$1600(this.this$0);
    int i = BaseTransientBottomBar.access$1400(this.this$0);
    int j = BaseTransientBottomBar.access$1500(this.this$0);
    i -= j;
    j = BaseTransientBottomBar.access$1500(this.this$0);
    paramAnimator.animateContentIn(i, j);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.13
 * JD-Core Version:    0.7.0.1
 */