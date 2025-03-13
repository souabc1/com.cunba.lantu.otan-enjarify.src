package com.qinggan.sched.notification;

import android.os.BaseBundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import m54207b69;

class NotificationConnection$MyHandler
  extends Handler
{
  public NotificationConnection$MyHandler(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    int i = paramMessage.what;
    int j = 1;
    NotificationConnection localNotificationConnection;
    String str1;
    Object localObject;
    int k;
    if (i == j)
    {
      localNotificationConnection = (NotificationConnection)paramMessage.obj;
      paramMessage = paramMessage.getData();
      j = 0;
      str1 = null;
      if (paramMessage != null)
      {
        localObject = m54207b69.F54207b69_11("sr071D1D060B1C411D");
        k = paramMessage.getInt((String)localObject);
      }
      else
      {
        k = -1;
      }
    }
    for (;;)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11(")=5E534A564D225A55251027");
      ((StringBuilder)localObject).append(str2);
      ((StringBuilder)localObject).append(j);
      boolean bool = localNotificationConnection.isConnected();
      if (bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append(str2);
        ((StringBuilder)localObject).append(j);
        str1 = m54207b69.F54207b69_11("Q@60342A323B");
        ((StringBuilder)localObject).append(str1);
        localNotificationConnection.OooO0O0(k);
      }
      else
      {
        long l = 50;
        try
        {
          Thread.sleep(l);
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
        int m = 20;
        if (j != m) {
          break label189;
        }
      }
      return;
      label189:
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.sched.notification.NotificationConnection.MyHandler
 * JD-Core Version:    0.7.0.1
 */