package com.qinggan.ota;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qinggan.common.OnInitListener;

class RemoteDeviceOTAManager$2
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO00o;
    paramIBinder = IRemoteDeviceOTAService.Stub.o0Oo0o0O(paramIBinder);
    RemoteDeviceOTAManager.OooO0O0(paramComponentName, paramIBinder);
    paramComponentName = RemoteDeviceOTAManager.OooO0OO(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = RemoteDeviceOTAManager.OooO0OO(this.OooO00o);
      boolean bool = true;
      paramComponentName.OooO00o(bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    RemoteDeviceOTAManager.OooO0O0(this.OooO00o, null);
    paramComponentName = RemoteDeviceOTAManager.OooO0OO(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = RemoteDeviceOTAManager.OooO0OO(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.RemoteDeviceOTAManager.2
 * JD-Core Version:    0.7.0.1
 */