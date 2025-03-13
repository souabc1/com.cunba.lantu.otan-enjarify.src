package com.xuexiang.xui.widget.picker.wheelview.timer;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;
import m54207b69;

public final class SmoothScrollTimerTask
  extends TimerTask
{
  public int o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public final WheelView o00Ooo0O;
  
  public SmoothScrollTimerTask(WheelView paramWheelView, int paramInt)
  {
    this.o00Ooo0O = paramWheelView;
    this.o00Ooo0 = paramInt;
    this.o00OoOoo = (-1 >>> 1);
    this.o00Ooo00 = 0;
  }
  
  public final void run()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(4835, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.picker.wheelview.timer.SmoothScrollTimerTask
 * JD-Core Version:    0.7.0.1
 */