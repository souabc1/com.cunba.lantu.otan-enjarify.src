package com.xuexiang.xui.widget.picker.wheelview.timer;

import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.TimerTask;
import m54207b69;

public final class InertiaTimerTask
  extends TimerTask
{
  public float o00OoOoo;
  public final WheelView o00Ooo0;
  public final float o00Ooo00;
  
  public InertiaTimerTask(WheelView paramWheelView, float paramFloat)
  {
    this.o00Ooo0 = paramWheelView;
    this.o00Ooo00 = paramFloat;
    this.o00OoOoo = 2.147484E+009F;
  }
  
  public final void run()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(4833, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.picker.wheelview.timer.InertiaTimerTask
 * JD-Core Version:    0.7.0.1
 */