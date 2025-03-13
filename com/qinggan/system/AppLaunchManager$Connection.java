package com.qinggan.system;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

class AppLaunchManager$Connection
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = AppLaunchManager.OooO0OO(this.OooO00o);
    IAppLaunchService localIAppLaunchService;
    boolean bool;
    if (paramComponentName == null)
    {
      paramComponentName = this.OooO00o;
      localIAppLaunchService = IAppLaunchService.Stub.o0Oo0o0O(paramIBinder);
      AppLaunchManager.OooO0Oo(paramComponentName, localIAppLaunchService);
      paramComponentName = this.OooO00o;
      bool = true;
      AppLaunchManager.OooO0O0(paramComponentName, bool);
    }
    try
    {
      paramComponentName = this.OooO00o;
      paramComponentName = paramComponentName.OooO00o;
      bool = false;
      localIAppLaunchService = null;
      paramIBinder.linkToDeath(paramComponentName, 0);
    }
    catch (Exception paramComponentName)
    {
      paramComponentName.printStackTrace();
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = AppLaunchManager.OooO0OO(this.OooO00o);
    if (paramComponentName != null)
    {
      AppLaunchManager.OooO0Oo(this.OooO00o, null);
      paramComponentName = this.OooO00o;
      AppLaunchManager.OooO0O0(paramComponentName, false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.AppLaunchManager.Connection
 * JD-Core Version:    0.7.0.1
 */