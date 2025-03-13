package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class BottomAppBar$1
  extends AnimatorListenerAdapter
{
  public BottomAppBar$1(BottomAppBar paramBottomAppBar) {}
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.this$0;
    boolean bool1 = BottomAppBar.access$000(paramAnimator);
    if (!bool1)
    {
      paramAnimator = this.this$0;
      int i = BottomAppBar.access$100(paramAnimator);
      BottomAppBar localBottomAppBar = this.this$0;
      boolean bool2 = BottomAppBar.access$200(localBottomAppBar);
      BottomAppBar.access$300(paramAnimator, i, bool2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.bottomappbar.BottomAppBar.1
 * JD-Core Version:    0.7.0.1
 */