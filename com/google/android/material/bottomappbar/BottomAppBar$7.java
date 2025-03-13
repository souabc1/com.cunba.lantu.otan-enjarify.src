package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

class BottomAppBar$7
  extends AnimatorListenerAdapter
{
  public boolean cancelled;
  
  public BottomAppBar$7(BottomAppBar paramBottomAppBar, ActionMenuView paramActionMenuView, int paramInt, boolean paramBoolean) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.cancelled = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool1 = this.cancelled;
    if (!bool1)
    {
      paramAnimator = this.this$0;
      int i = BottomAppBar.access$2100(paramAnimator);
      if (i != 0)
      {
        i = 1;
      }
      else
      {
        i = 0;
        paramAnimator = null;
      }
      BottomAppBar localBottomAppBar = this.this$0;
      int j = BottomAppBar.access$2100(localBottomAppBar);
      localBottomAppBar.replaceMenu(j);
      localBottomAppBar = this.this$0;
      ActionMenuView localActionMenuView = this.val$actionMenuView;
      int k = this.val$targetMode;
      boolean bool2 = this.val$targetAttached;
      BottomAppBar.access$2200(localBottomAppBar, localActionMenuView, k, bool2, i);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.bottomappbar.BottomAppBar.7
 * JD-Core Version:    0.7.0.1
 */