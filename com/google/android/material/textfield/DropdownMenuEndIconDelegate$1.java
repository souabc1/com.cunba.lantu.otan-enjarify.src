package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

class DropdownMenuEndIconDelegate$1
  extends AnimatorListenerAdapter
{
  public DropdownMenuEndIconDelegate$1(DropdownMenuEndIconDelegate paramDropdownMenuEndIconDelegate) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.this$0.refreshIconState();
    DropdownMenuEndIconDelegate.access$000(this.this$0).start();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
 * JD-Core Version:    0.7.0.1
 */