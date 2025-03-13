package com.qinggan.common;

import android.os.Handler.Callback;
import android.os.Message;

class QGManagerBase$1
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
        bool = paramMessage.OooO0Oo;
        QGManagerBase.OooO00o(paramMessage, bool);
      }
    }
    else
    {
      paramMessage = (OnInitListener)paramMessage.obj;
      QGManagerBase localQGManagerBase = this.OooO00o;
      bool = localQGManagerBase.OooO0Oo;
      paramMessage.OooO00o(bool);
    }
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.common.QGManagerBase.1
 * JD-Core Version:    0.7.0.1
 */