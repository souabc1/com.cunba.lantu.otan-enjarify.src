package com.qinggan.wifi;

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;

final class WifiTracker$WorkHandler
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    if (i != 0)
    {
      int j = 1;
      if (i != j)
      {
        int k = 2;
        if (i == k)
        {
          paramMessage = this.OooO00o;
          WifiTracker.OooO(paramMessage);
        }
      }
      else
      {
        WifiTracker localWifiTracker = this.OooO00o;
        paramMessage = (NetworkInfo)paramMessage.obj;
        WifiTracker.OooO0oo(localWifiTracker, paramMessage);
      }
    }
    else
    {
      paramMessage = this.OooO00o;
      WifiTracker.OooO0oO(paramMessage);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wifi.WifiTracker.WorkHandler
 * JD-Core Version:    0.7.0.1
 */