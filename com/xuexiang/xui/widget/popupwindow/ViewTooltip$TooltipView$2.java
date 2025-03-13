package com.xuexiang.xui.widget.popupwindow;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import m54207b69;

class ViewTooltip$TooltipView$2
  extends AnimatorListenerAdapter
{
  public ViewTooltip$TooltipView$2(ViewTooltip.TooltipView paramTooltipView, Animator.AnimatorListener paramAnimatorListener) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(5001, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView.2
 * JD-Core Version:    0.7.0.1
 */