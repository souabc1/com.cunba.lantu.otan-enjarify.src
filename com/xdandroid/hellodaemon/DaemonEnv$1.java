package com.xdandroid.hellodaemon;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Map;

final class DaemonEnv$1
  implements ServiceConnection
{
  public DaemonEnv$1(Class paramClass, Intent paramIntent) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = DaemonEnv.OooO0o0;
    paramIBinder = this.OooO00o;
    paramComponentName.put(paramIBinder, this);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = DaemonEnv.OooO0o0;
    Object localObject = this.OooO00o;
    paramComponentName.remove(localObject);
    paramComponentName = this.OooO0O0;
    DaemonEnv.OooO0OO(paramComponentName);
    boolean bool = DaemonEnv.OooO0Oo;
    if (!bool) {
      return;
    }
    paramComponentName = DaemonEnv.OooO00o;
    localObject = this.OooO0O0;
    paramComponentName.bindService((Intent)localObject, this, 1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xdandroid.hellodaemon.DaemonEnv.1
 * JD-Core Version:    0.7.0.1
 */