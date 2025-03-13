package com.qinggan.now;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

class NowManager$2
  implements ServiceConnection
{
  public NowManager$2(NowManager paramNowManager) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = NowManager.OooO0oO;
    paramComponentName = this.OooO00o;
    paramIBinder = INowService.Stub.o0Oo0o0O(paramIBinder);
    NowManager.OooO0O0(paramComponentName, paramIBinder);
    paramComponentName = NowManager.OooO0OO(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = NowManager.OooO0OO(this.OooO00o);
      boolean bool = true;
      paramComponentName.OooO00o(bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = NowManager.OooO0oO;
    NowManager.OooO0O0(this.OooO00o, null);
    paramComponentName = NowManager.OooO0OO(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = NowManager.OooO0OO(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowManager.2
 * JD-Core Version:    0.7.0.1
 */