package com.qinggan.tuner;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

class TunerManager$3
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO00o;
    paramIBinder = ITunerService.Stub.o0Oo0o0O(paramIBinder);
    TunerManager.OooO0O0(paramComponentName, paramIBinder);
    paramComponentName = TunerManager.OooO00o(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = TunerManager.OooO00o(this.OooO00o);
      boolean bool = true;
      paramComponentName.OooO00o(bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    TunerManager.OooO0O0(this.OooO00o, null);
    paramComponentName = TunerManager.OooO00o(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = TunerManager.OooO00o(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.tuner.TunerManager.3
 * JD-Core Version:    0.7.0.1
 */