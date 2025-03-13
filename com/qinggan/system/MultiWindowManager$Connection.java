package com.qinggan.system;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

class MultiWindowManager$Connection
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = MultiWindowManager.OooO00o(this.OooO00o);
    if (paramComponentName == null)
    {
      paramComponentName = this.OooO00o;
      paramIBinder = IMultiWindowService.Stub.o0Oo0o0O(paramIBinder);
      MultiWindowManager.OooO0O0(paramComponentName, paramIBinder);
      paramComponentName = this.OooO00o;
      boolean bool = true;
      MultiWindowManager.OooO0Oo(paramComponentName, bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = MultiWindowManager.OooO00o(this.OooO00o);
    if (paramComponentName != null)
    {
      MultiWindowManager.OooO0O0(this.OooO00o, null);
      paramComponentName = this.OooO00o;
      MultiWindowManager.OooO0Oo(paramComponentName, false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.MultiWindowManager.Connection
 * JD-Core Version:    0.7.0.1
 */