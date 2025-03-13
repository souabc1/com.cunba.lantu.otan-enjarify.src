package com.qinggan.system;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

class PowerManager$PowerManagerHandler
  extends Handler
{
  public void OooO00o(Message paramMessage, int paramInt)
  {
    int i = paramMessage.what;
    boolean bool = hasMessages(i);
    if (bool)
    {
      int j = paramMessage.what;
      removeMessages(j);
    }
    long l = paramInt;
    super.sendMessageDelayed(paramMessage, l);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    if (i == 0)
    {
      paramMessage = paramMessage.obj;
      boolean bool1 = paramMessage instanceof Object[];
      if (bool1)
      {
        paramMessage = (Object[])paramMessage;
        bool1 = false;
        Context localContext = paramMessage[0];
        boolean bool2 = localContext instanceof Context;
        Object localObject = null;
        if (bool2)
        {
          localContext = (Context)localContext;
        }
        else
        {
          bool1 = false;
          localContext = null;
        }
        paramMessage = paramMessage[1];
        bool2 = paramMessage instanceof PowerManager.OnInitListener;
        if (bool2)
        {
          localObject = paramMessage;
          localObject = (PowerManager.OnInitListener)paramMessage;
        }
        paramMessage = PowerManager.OooO00o();
        if ((paramMessage != null) && (localObject != null))
        {
          paramMessage = PowerManager.OooO0O0(PowerManager.OooO00o());
          paramMessage.put(localContext, localObject);
        }
        if (localObject != null)
        {
          paramMessage = this.OooO00o;
          boolean bool3 = PowerManager.OooO0OO(paramMessage);
          ((PowerManager.OnInitListener)localObject).OooO00o(bool3);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.PowerManager.PowerManagerHandler
 * JD-Core Version:    0.7.0.1
 */