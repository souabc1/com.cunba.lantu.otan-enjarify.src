package com.qinggan.iap2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashMap;
import m54207b69;

public class IAP2Manager
  implements ServiceConnection
{
  public static Object OooO0o;
  public static Object OooO0o0;
  public HashMap OooO00o;
  public Context OooO0O0;
  public boolean OooO0OO;
  public IIAP2Manager OooO0Oo;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0o0 = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooO0o = localObject;
  }
  
  public final void OooO0Oo()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject = m54207b69.F54207b69_11("9_3B342E743A36314139347B494838443F41821E1E322221172E3729881C29382C29373E3D");
    localIntent.setAction((String)localObject);
    localObject = m54207b69.F54207b69_11("F^3D323573324430423979412A1A797E1C4B3D3A4A5150");
    localIntent.setPackage((String)localObject);
    localObject = m54207b69.F54207b69_11("`A252E34722C343B2B373E792D2C4232353E444A823C15278A");
    localIntent.addCategory((String)localObject);
    localObject = this.OooO0O0;
    int i = 1;
    boolean bool = ((Context)localObject).bindService(localIntent, this, i);
    if (!bool)
    {
      bool = false;
      localIntent = null;
      this.OooO0Oo = null;
    }
  }
  
  public boolean isIAP2DeviceConnected()
  {
    IIAP2Manager localIIAP2Manager = this.OooO0Oo;
    if (localIIAP2Manager != null) {
      try
      {
        localIIAP2Manager = this.OooO0Oo;
        return localIIAP2Manager.isIAP2DeviceConnected();
      }
      catch (RemoteException localRemoteException)
      {
        OooO0Oo();
      }
    }
    return false;
  }
  
  public boolean isSupportCarPlay()
  {
    IIAP2Manager localIIAP2Manager = this.OooO0Oo;
    if (localIIAP2Manager != null) {
      try
      {
        return localIIAP2Manager.isSupportCarPlay();
      }
      catch (RemoteException localRemoteException)
      {
        OooO0Oo();
      }
    }
    return false;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO0Oo;
    int i;
    if (paramComponentName == null)
    {
      paramComponentName = IIAP2Manager.Stub.o0Oo0o0O(paramIBinder);
      this.OooO0Oo = paramComponentName;
      i = 1;
      this.OooO0OO = i;
    }
    paramComponentName = this.OooO00o;
    if (paramComponentName != null)
    {
      i = paramComponentName.size();
      if (i > 0)
      {
        paramComponentName = this.OooO00o;
        paramIBinder = this.OooO0O0;
        paramComponentName = (IAP2Manager.IAP2ManagerCallback)paramComponentName.get(paramIBinder);
        if (paramComponentName != null)
        {
          boolean bool = this.OooO0OO;
          paramComponentName.OooO00o(bool);
        }
      }
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = this.OooO0Oo;
    int i;
    if (paramComponentName != null)
    {
      this.OooO0Oo = null;
      i = 0;
      paramComponentName = null;
      this.OooO0OO = false;
    }
    paramComponentName = this.OooO00o;
    if (paramComponentName != null)
    {
      i = paramComponentName.size();
      if (i > 0)
      {
        paramComponentName = this.OooO00o;
        Context localContext = this.OooO0O0;
        paramComponentName = (IAP2Manager.IAP2ManagerCallback)paramComponentName.get(localContext);
        if (paramComponentName != null)
        {
          boolean bool = this.OooO0OO;
          paramComponentName.OooO00o(bool);
        }
      }
    }
    OooO0Oo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.iap2.IAP2Manager
 * JD-Core Version:    0.7.0.1
 */