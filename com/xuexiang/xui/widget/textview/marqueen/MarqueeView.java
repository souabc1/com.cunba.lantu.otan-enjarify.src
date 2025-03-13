package com.xuexiang.xui.widget.textview.marqueen;

import android.view.animation.Animation;
import android.widget.ViewFlipper;
import m54207b69;

public class MarqueeView
  extends ViewFlipper
{
  public int o00OoOoo;
  public Animation o00Ooo0;
  public int o00Ooo00;
  public Animation o00Ooo0O;
  
  public Animation getAnimIn()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Animation)m54207b69.F54207b69_09(6409, arrayOfObject);
  }
  
  public Animation getAnimOut()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Animation)m54207b69.F54207b69_09(6410, arrayOfObject);
  }
  
  public void onDetachedFromWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6411, arrayOfObject);
  }
  
  public void setAnimDuration(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(6412, arrayOfObject);
  }
  
  public void setAnimInAndOut(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(6413, arrayOfObject);
  }
  
  public void setInterval(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(6414, arrayOfObject);
  }
  
  public void setMarqueeFactory(MarqueeFactory paramMarqueeFactory)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMarqueeFactory;
    m54207b69.F54207b69_00(6415, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.marqueen.MarqueeView
 * JD-Core Version:    0.7.0.1
 */