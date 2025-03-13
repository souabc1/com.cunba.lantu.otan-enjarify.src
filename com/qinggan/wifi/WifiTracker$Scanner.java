package com.qinggan.wifi;

import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;

class WifiTracker$Scanner
  extends Handler
{
  public int OooO00o;
  
  public void OooO00o()
  {
    this.OooO00o = 0;
    removeMessages(0);
  }
  
  public void OooO0O0()
  {
    boolean bool = hasMessages(0);
    if (!bool) {
      sendEmptyMessage(0);
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    if (i != 0) {
      return;
    }
    paramMessage = WifiTracker.OooOO0(this.OooO0O0);
    boolean bool = paramMessage.startScan();
    if (bool)
    {
      this.OooO00o = 0;
    }
    else
    {
      int j = this.OooO00o + 1;
      this.OooO00o = j;
      int k = 3;
      if (j >= k)
      {
        this.OooO00o = 0;
        WifiTracker.OooO0O0(this.OooO0O0);
        return;
      }
    }
    sendEmptyMessageDelayed(0, 20000L);
  }
  
  public boolean isScanning()
  {
    return hasMessages(0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wifi.WifiTracker.Scanner
 * JD-Core Version:    0.7.0.1
 */