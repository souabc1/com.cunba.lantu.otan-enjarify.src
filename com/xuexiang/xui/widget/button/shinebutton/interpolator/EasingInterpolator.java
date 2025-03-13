package com.xuexiang.xui.widget.button.shinebutton.interpolator;

import android.view.animation.Interpolator;
import m54207b69;

public class EasingInterpolator
  implements Interpolator
{
  public final Ease OooO00o;
  
  public EasingInterpolator(Ease paramEase)
  {
    this.OooO00o = paramEase;
  }
  
  public Ease getEase()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Ease)m54207b69.F54207b69_09(2890, arrayOfObject);
  }
  
  public float getInterpolation(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    return m54207b69.F54207b69_07(2891, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.shinebutton.interpolator.EasingInterpolator
 * JD-Core Version:    0.7.0.1
 */