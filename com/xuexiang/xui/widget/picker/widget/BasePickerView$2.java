package com.xuexiang.xui.widget.picker.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import m54207b69;

class BasePickerView$2
  implements Animation.AnimationListener
{
  public BasePickerView$2(BasePickerView paramBasePickerView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(4837, arrayOfObject);
  }
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(4838, arrayOfObject);
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(4839, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.picker.widget.BasePickerView.2
 * JD-Core Version:    0.7.0.1
 */