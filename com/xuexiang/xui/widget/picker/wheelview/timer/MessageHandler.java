package com.xuexiang.xui.widget.picker.wheelview.timer;

import android.os.Handler;
import android.os.Message;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import m54207b69;

public final class MessageHandler
  extends Handler
{
  public final WheelView OooO00o;
  
  public MessageHandler(WheelView paramWheelView)
  {
    this.OooO00o = paramWheelView;
  }
  
  public final void handleMessage(Message paramMessage)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMessage;
    m54207b69.F54207b69_00(4834, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.picker.wheelview.timer.MessageHandler
 * JD-Core Version:    0.7.0.1
 */