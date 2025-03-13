package com.xuexiang.xui.widget.popupwindow.status;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import m54207b69;

public abstract class SimpleAnimListener
  implements Animation.AnimationListener
{
  public void onAnimationRepeat(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(5136, arrayOfObject);
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(5137, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.popupwindow.status.SimpleAnimListener
 * JD-Core Version:    0.7.0.1
 */