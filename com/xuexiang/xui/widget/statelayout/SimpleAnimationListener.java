package com.xuexiang.xui.widget.statelayout;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import m54207b69;

public class SimpleAnimationListener
  implements Animation.AnimationListener
{
  public void onAnimationEnd(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(5691, arrayOfObject);
  }
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(5692, arrayOfObject);
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimation;
    m54207b69.F54207b69_00(5693, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.statelayout.SimpleAnimationListener
 * JD-Core Version:    0.7.0.1
 */