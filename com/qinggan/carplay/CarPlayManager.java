package com.qinggan.carplay;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashMap;
import m54207b69;

public class CarPlayManager
  implements ServiceConnection
{
  public static Object OooO0o;
  public static Object OooO0o0;
  public HashMap OooO00o;
  public Context OooO0O0;
  public boolean OooO0OO;
  public ICarPlayManager OooO0Oo;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0o0 = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooO0o = localObject;
  }
  
  public final void OooO0OO()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject = m54207b69.F54207b69_11("KG232C366C322E3929313C733130403C37397A26261A2A292F1C1F2F3227233C3734233734322928");
    localIntent.setAction((String)localObject);
    localObject = m54207b69.F54207b69_11(",-4E43420661515F4F4A0C78576B8A4F5B6414905B73705A6560");
    localIntent.setPackage((String)localObject);
    localObject = m54207b69.F54207b69_11("i'434C560C524E5949515C134F5260504F5866701C787B8B8E837F98");
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
  
  public boolean isCarPlayPhoneIdle()
  {
    ICarPlayManager localICarPlayManager = this.OooO0Oo;
    if (localICarPlayManager != null) {
      try
      {
        return localICarPlayManager.isCarPlayPhoneIdle();
      }
      catch (RemoteException localRemoteException)
      {
        OooO0OO();
      }
    }
    return false;
  }
  
  public boolean isCarPlayStart()
  {
    ICarPlayManager localICarPlayManager = this.OooO0Oo;
    if (localICarPlayManager != null) {
      try
      {
        return localICarPlayManager.isCarPlayStart();
      }
      catch (RemoteException localRemoteException)
      {
        OooO0OO();
      }
    }
    return false;
  }
  
  public boolean isSupportCarPlay()
  {
    ICarPlayManager localICarPlayManager = this.OooO0Oo;
    if (localICarPlayManager != null) {
      try
      {
        return localICarPlayManager.isSupportCarPlay();
      }
      catch (RemoteException localRemoteException)
      {
        OooO0OO();
      }
    }
    return false;
  }
  
  public boolean isiPodConnected()
  {
    ICarPlayManager localICarPlayManager = this.OooO0Oo;
    if (localICarPlayManager != null) {
      try
      {
        return localICarPlayManager.isiPodConnected();
      }
      catch (RemoteException localRemoteException)
      {
        OooO0OO();
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
      paramComponentName = ICarPlayManager.Stub.o0Oo0o0O(paramIBinder);
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
        paramComponentName = (CarPlayManager.CarPlayManagerCallback)paramComponentName.get(paramIBinder);
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
        paramComponentName = (CarPlayManager.CarPlayManagerCallback)paramComponentName.get(localContext);
        if (paramComponentName != null)
        {
          boolean bool = this.OooO0OO;
          paramComponentName.OooO00o(bool);
        }
      }
    }
    OooO0OO();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.carplay.CarPlayManager
 * JD-Core Version:    0.7.0.1
 */