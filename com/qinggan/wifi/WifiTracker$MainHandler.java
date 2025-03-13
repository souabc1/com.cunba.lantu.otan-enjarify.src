package com.qinggan.wifi;

import android.os.Handler;
import android.os.Message;

final class WifiTracker$MainHandler
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    WifiTracker.WifiListener localWifiListener = WifiTracker.OooO0o(this.OooO00o);
    if (localWifiListener == null) {
      return;
    }
    int i = paramMessage.what;
    if (i != 0)
    {
      int j = 1;
      int k;
      if (i != j)
      {
        k = 2;
        if (i != k)
        {
          k = 3;
          if (i != k)
          {
            k = 4;
            if (i == k)
            {
              paramMessage = this.OooO00o.OooOOO;
              if (paramMessage != null) {
                paramMessage.OooO00o();
              }
            }
          }
          else
          {
            paramMessage = this.OooO00o.OooOOO;
            if (paramMessage != null) {
              paramMessage.OooO0O0();
            }
          }
        }
        else
        {
          paramMessage = WifiTracker.OooO0o(this.OooO00o);
          paramMessage.OooO0O0();
        }
      }
      else
      {
        localWifiListener = WifiTracker.OooO0o(this.OooO00o);
        k = paramMessage.arg1;
        localWifiListener.OooO00o(k);
      }
    }
    else
    {
      paramMessage = WifiTracker.OooO0o(this.OooO00o);
      paramMessage.OooO0OO();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wifi.WifiTracker.MainHandler
 * JD-Core Version:    0.7.0.1
 */