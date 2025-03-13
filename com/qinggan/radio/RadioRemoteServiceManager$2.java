package com.qinggan.radio;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import m54207b69;

class RadioRemoteServiceManager$2
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO00o;
    paramIBinder = IRadioRemoteService.Stub.o0Oo0o0O(paramIBinder);
    RadioRemoteServiceManager.OooO0O0(paramComponentName, paramIBinder);
    paramComponentName = new java/lang/StringBuilder;
    paramComponentName.<init>();
    paramIBinder = m54207b69.F54207b69_11("e*784C5046497E555F644C535A165252885F696E565D647F5C5C5D69647A6C6C29");
    paramComponentName.append(paramIBinder);
    paramIBinder = RadioRemoteServiceManager.OooO00o(this.OooO00o);
    paramComponentName.append(paramIBinder);
    try
    {
      paramComponentName = this.OooO00o;
      paramComponentName = RadioRemoteServiceManager.OooO00o(paramComponentName);
      paramIBinder = this.OooO00o;
      paramIBinder = RadioRemoteServiceManager.OooO0Oo(paramIBinder);
      paramComponentName.o0O0o0o(paramIBinder);
    }
    catch (RemoteException paramComponentName)
    {
      paramIBinder = new java/lang/StringBuilder;
      paramIBinder.<init>();
      String str = m54207b69.F54207b69_11(".P2236393C27293B290A3A3E444B0F434C4F35472645515249494C558B5145515440455B62628F");
      paramIBinder.append(str);
      str = paramComponentName.getMessage();
      paramIBinder.append(str);
      paramComponentName.printStackTrace();
    }
    paramComponentName = RadioRemoteServiceManager.OooO0OO(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = RadioRemoteServiceManager.OooO0OO(this.OooO00o);
      boolean bool = true;
      paramComponentName.OooO00o(bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    RadioRemoteServiceManager.OooO0O0(this.OooO00o, null);
    paramComponentName = RadioRemoteServiceManager.OooO0OO(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = RadioRemoteServiceManager.OooO0OO(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.radio.RadioRemoteServiceManager.2
 * JD-Core Version:    0.7.0.1
 */