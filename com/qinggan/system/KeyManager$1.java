package com.qinggan.system;

import android.os.Handler;
import android.os.Message;

class KeyManager$1
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 1;
    if (i != 0)
    {
      if (i == j)
      {
        paramMessage = this.OooO00o;
        KeyManager.OooO00o(paramMessage);
      }
    }
    else
    {
      paramMessage = (KeyManager.OnInitListener)paramMessage.obj;
      if (paramMessage != null) {
        paramMessage.OooO00o(j);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.KeyManager.1
 * JD-Core Version:    0.7.0.1
 */