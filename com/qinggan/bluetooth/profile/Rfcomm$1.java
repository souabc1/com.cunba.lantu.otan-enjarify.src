package com.qinggan.bluetooth.profile;

import android.os.Handler.Callback;
import android.os.Message;
import java.util.Iterator;
import java.util.List;

class Rfcomm$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 1;
    Iterator localIterator;
    boolean bool;
    IRfcommCallback localIRfcommCallback;
    if (i != 0)
    {
      if (i == j)
      {
        localIterator = this.OooO00o.OooO00o.iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localIRfcommCallback = (IRfcommCallback)localIterator.next();
          byte[] arrayOfByte = (byte[])paramMessage.obj;
          int k = paramMessage.arg1;
          int m = paramMessage.arg2;
          localIRfcommCallback.OooO0O0(arrayOfByte, k, m);
        }
      }
    }
    else
    {
      localIterator = this.OooO00o.OooO00o.iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localIRfcommCallback = (IRfcommCallback)localIterator.next();
        int n = paramMessage.arg1;
        localIRfcommCallback.OooO00o(n);
      }
    }
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bluetooth.profile.Rfcomm.1
 * JD-Core Version:    0.7.0.1
 */