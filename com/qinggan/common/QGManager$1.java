package com.qinggan.common;

import android.os.Handler.Callback;
import android.os.Message;

class QGManager$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 1;
    boolean bool;
    if (i != j)
    {
      int k = 2;
      if (i == k)
      {
        paramMessage = this.OooO00o;
        bool = paramMessage.OooO0o0;
        QGManager.OooO0O0(paramMessage, bool);
      }
    }
    else
    {
      paramMessage = paramMessage.obj;
      if (paramMessage != null)
      {
        paramMessage = (OnInitListener)paramMessage;
        QGManager.OooO00o(this.OooO00o, paramMessage);
        QGManager localQGManager = this.OooO00o;
        bool = localQGManager.OooO0o0;
        paramMessage.OooO00o(bool);
      }
    }
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.common.QGManager.1
 * JD-Core Version:    0.7.0.1
 */