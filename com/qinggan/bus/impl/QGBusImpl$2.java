package com.qinggan.bus.impl;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.qinggan.bus.QGBusEvent;

class QGBusImpl$2
  extends Handler
{
  public QGBusImpl$2(QGBusImpl paramQGBusImpl) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 4;
    Object localObject;
    if (i != j)
    {
      j = 6;
      if (i == j)
      {
        localObject = QGBusImpl.OooO0o0(this.OooO00o);
        ProtocolMessage.OooO0o0((Messenger)localObject);
      }
    }
    else
    {
      localObject = ProtocolMessage.OooO00o(paramMessage);
      SubscribeInfo localSubscribeInfo = QGBusImpl.OooO0Oo(this.OooO00o);
      localSubscribeInfo.OooO0O0((QGBusEvent)localObject);
    }
    super.handleMessage(paramMessage);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bus.impl.QGBusImpl.2
 * JD-Core Version:    0.7.0.1
 */