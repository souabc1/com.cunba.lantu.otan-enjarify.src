package com.qinggan.system;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

class LocalCityManager$Connection
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = LocalCityManager.OooO0OO(this.OooO00o);
    if (paramComponentName == null)
    {
      paramComponentName = this.OooO00o;
      paramIBinder = ILocalCityService.Stub.o0Oo0o0O(paramIBinder);
      LocalCityManager.OooO0Oo(paramComponentName, paramIBinder);
      try
      {
        paramComponentName = this.OooO00o;
        paramComponentName = LocalCityManager.OooO0OO(paramComponentName);
        paramIBinder = this.OooO00o;
        paramIBinder = LocalCityManager.OooO0o0(paramIBinder);
        paramComponentName.o00ooO0O(paramIBinder);
      }
      catch (RemoteException paramComponentName)
      {
        paramComponentName.printStackTrace();
      }
      paramComponentName = this.OooO00o;
      boolean bool = true;
      LocalCityManager.OooO0o(paramComponentName, bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = LocalCityManager.OooO0OO(this.OooO00o);
    if (paramComponentName != null)
    {
      LocalCityManager.OooO0Oo(this.OooO00o, null);
      paramComponentName = this.OooO00o;
      LocalCityManager.OooO0o(paramComponentName, false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.LocalCityManager.Connection
 * JD-Core Version:    0.7.0.1
 */