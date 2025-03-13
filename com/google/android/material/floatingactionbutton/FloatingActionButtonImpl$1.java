package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.VisibilityAwareImageButton;

class FloatingActionButtonImpl$1
  extends AnimatorListenerAdapter
{
  private boolean cancelled;
  
  public FloatingActionButtonImpl$1(FloatingActionButtonImpl paramFloatingActionButtonImpl, boolean paramBoolean, FloatingActionButtonImpl.InternalVisibilityChangedListener paramInternalVisibilityChangedListener) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.cancelled = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    FloatingActionButtonImpl.access$002(this.this$0, 0);
    paramAnimator = this.this$0;
    boolean bool1 = false;
    FloatingActionButtonImpl.access$102(paramAnimator, null);
    boolean bool2 = this.cancelled;
    if (!bool2)
    {
      paramAnimator = this.this$0.view;
      bool1 = this.val$fromUser;
      int i;
      if (bool1) {
        i = 8;
      } else {
        i = 4;
      }
      paramAnimator.internalSetVisibility(i, bool1);
      paramAnimator = this.val$listener;
      if (paramAnimator != null) {
        paramAnimator.onHidden();
      }
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    FloatingActionButton localFloatingActionButton = this.this$0.view;
    boolean bool = this.val$fromUser;
    localFloatingActionButton.internalSetVisibility(0, bool);
    FloatingActionButtonImpl.access$002(this.this$0, 1);
    FloatingActionButtonImpl.access$102(this.this$0, paramAnimator);
    this.cancelled = false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1
 * JD-Core Version:    0.7.0.1
 */