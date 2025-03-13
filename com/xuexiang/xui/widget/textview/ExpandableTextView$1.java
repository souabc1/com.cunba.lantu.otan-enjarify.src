package com.xuexiang.xui.widget.textview;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import m54207b69;

class ExpandableTextView$1
  implements Animation.AnimationListener
{
  public ExpandableTextView$1(ExpandableTextView paramExpandableTextView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(6082, arrayOfObject);
  }
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(6083, arrayOfObject);
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(6084, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.ExpandableTextView.1
 * JD-Core Version:    0.7.0.1
 */