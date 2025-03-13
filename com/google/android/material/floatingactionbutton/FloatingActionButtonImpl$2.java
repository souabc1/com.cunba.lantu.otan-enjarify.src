package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.VisibilityAwareImageButton;

class FloatingActionButtonImpl$2
  extends AnimatorListenerAdapter
{
  public FloatingActionButtonImpl$2(FloatingActionButtonImpl paramFloatingActionButtonImpl, boolean paramBoolean, FloatingActionButtonImpl.InternalVisibilityChangedListener paramInternalVisibilityChangedListener) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    FloatingActionButtonImpl.access$002(this.this$0, 0);
    FloatingActionButtonImpl.access$102(this.this$0, null);
    paramAnimator = this.val$listener;
    if (paramAnimator != null) {
      paramAnimator.onShown();
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    FloatingActionButton localFloatingActionButton = this.this$0.view;
    boolean bool = this.val$fromUser;
    localFloatingActionButton.internalSetVisibility(0, bool);
    FloatingActionButtonImpl.access$002(this.this$0, 2);
    FloatingActionButtonImpl.access$102(this.this$0, paramAnimator);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.2
 * JD-Core Version:    0.7.0.1
 */