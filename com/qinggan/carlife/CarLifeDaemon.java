package com.qinggan.carlife;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import m54207b69;

public class CarLifeDaemon
{
  public static ICarLifeDaemon OooO0O0;
  public static Object OooO0OO;
  public Context OooO00o;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0OO = localObject;
  }
  
  private ICarLifeDaemon getService()
  {
    synchronized (OooO0OO)
    {
      Object localObject2 = OooO0O0;
      if (localObject2 != null) {
        return localObject2;
      }
      localObject2 = "$Q203781353428433F3F3D18403C414A4D4F";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = ServiceManager.OooO0O0((String)localObject2);
      int i;
      Object localObject5;
      if (localObject2 == null)
      {
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>();
        Object localObject4 = "7i180F49030B22120E25501215290D1416574B4F3B4F524C4140543F3B4B49544C484D46494B";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        ((Intent)localObject2).setAction((String)localObject4);
        localObject4 = "RY3A37367A2C353D45464141824645394440504E8A514D524B4E50";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        ((Intent)localObject2).setPackage((String)localObject4);
        localObject4 = "LO3E29632925403028436A36394737362F4D47731F2232191D21232A262A27201F21";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        ((Intent)localObject2).addCategory((String)localObject4);
        localObject4 = this.OooO00o;
        ((Context)localObject4).startService((Intent)localObject2);
        i = 0;
        localObject2 = null;
        int j = 10;
        if (i >= j) {
          break label176;
        }
        long l = 200L;
        try
        {
          Thread.sleep(l);
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
        localObject5 = "$Q203781353428433F3F3D18403C414A4D4F";
        localObject5 = m54207b69.F54207b69_11((String)localObject5);
        localObject5 = ServiceManager.OooO0O0((String)localObject5);
        if (localObject5 == null) {}
      }
      for (localObject2 = ICarLifeDaemon.Stub.o0Oo0o0O((IBinder)localObject5);; localObject2 = ICarLifeDaemon.Stub.o0Oo0o0O((IBinder)localObject2))
      {
        OooO0O0 = (ICarLifeDaemon)localObject2;
        break label176;
        i += 1;
        break;
      }
      label176:
      localObject2 = OooO0O0;
      return localObject2;
    }
  }
  
  public final ICarLifeDaemon OooO00o()
  {
    Object localObject1 = OooO0OO;
    ICarLifeDaemon localICarLifeDaemon = null;
    try
    {
      OooO0O0 = null;
      localICarLifeDaemon = getService();
      return localICarLifeDaemon;
    }
    finally {}
  }
  
  public int getConnectionProgress()
  {
    ICarLifeDaemon localICarLifeDaemon = getService();
    if (localICarLifeDaemon != null) {
      try
      {
        return localICarLifeDaemon.getConnectionProgress();
      }
      catch (RemoteException localRemoteException)
      {
        OooO00o();
      }
    }
    return 0;
  }
  
  public boolean isMobileDeviceConnect()
  {
    ICarLifeDaemon localICarLifeDaemon = getService();
    if (localICarLifeDaemon != null) {
      try
      {
        return localICarLifeDaemon.isMobileDeviceConnect();
      }
      catch (RemoteException localRemoteException)
      {
        OooO00o();
      }
    }
    return false;
  }
  
  public boolean isiOSDeviceConnect()
  {
    ICarLifeDaemon localICarLifeDaemon = getService();
    if (localICarLifeDaemon != null) {
      try
      {
        return localICarLifeDaemon.isiOSDeviceConnect();
      }
      catch (RemoteException localRemoteException)
      {
        OooO00o();
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.carlife.CarLifeDaemon
 * JD-Core Version:    0.7.0.1
 */