package com.xuexiang.xui.widget.imageview.preview.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import m54207b69;

class SmoothImageView$6
  extends AnimatorListenerAdapter
{
  public SmoothImageView$6(SmoothImageView paramSmoothImageView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(4281, arrayOfObject);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(4282, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.6
 * JD-Core Version:    0.7.0.1
 */