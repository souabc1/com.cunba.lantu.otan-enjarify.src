package com.xuexiang.xui.widget.searchview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import m54207b69;

final class AnimationUtils$2
  extends AnimatorListenerAdapter
{
  public AnimationUtils$2(AnimationUtils.AnimationListener paramAnimationListener, View paramView) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(5457, arrayOfObject);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(5458, arrayOfObject);
  }
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(5459, arrayOfObject);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(5460, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.searchview.AnimationUtils.2
 * JD-Core Version:    0.7.0.1
 */