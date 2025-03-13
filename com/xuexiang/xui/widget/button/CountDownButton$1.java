package com.xuexiang.xui.widget.button;

import android.os.CountDownTimer;
import m54207b69;

class CountDownButton$1
  extends CountDownTimer
{
  public void onFinish()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2700, arrayOfObject);
  }
  
  public void onTick(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    m54207b69.F54207b69_00(2701, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.CountDownButton.1
 * JD-Core Version:    0.7.0.1
 */