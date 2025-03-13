package com.xuexiang.xui.widget.popupwindow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import m54207b69;

class ViewTooltip$TooltipView$1
  extends AnimatorListenerAdapter
{
  public ViewTooltip$TooltipView$1(ViewTooltip.TooltipView paramTooltipView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(5000, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView.1
 * JD-Core Version:    0.7.0.1
 */