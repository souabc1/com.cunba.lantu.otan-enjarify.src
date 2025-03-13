package com.qinggan.system;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.qinggan.common.OnInitListener;
import com.qinggan.os.ServiceManager;
import java.util.Iterator;
import java.util.List;
import m54207b69;

public class ReverseManager
  implements ServiceConnection
{
  public static Object OooO;
  public static String OooO0oO = "qg.system_policy";
  public static ReverseManager OooO0oo;
  public IBinder.DeathRecipient OooO00o;
  public Context OooO0O0;
  public final List OooO0OO;
  public volatile boolean OooO0Oo;
  public ISystemPolicy OooO0o;
  public ReverseManager.ObtainServiceThread OooO0o0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO = localObject;
  }
  
  public final void OooO(boolean paramBoolean)
  {
    synchronized (this.OooO0OO)
    {
      Object localObject1 = this.OooO0OO;
      localObject1 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        Object localObject2 = ((Iterator)localObject1).next();
        localObject2 = (OnInitListener)localObject2;
        if (localObject2 != null) {
          ((OnInitListener)localObject2).OooO00o(paramBoolean);
        }
      }
      return;
    }
  }
  
  public final void OooO0oo()
  {
    try
    {
      Object localObject1 = OooO0oO;
      localObject1 = ServiceManager.OooO0O0((String)localObject1);
      int i = 1;
      if (localObject1 == null)
      {
        localObject1 = this.OooO0O0;
        if (localObject1 == null) {
          return;
        }
        localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>();
        localObject3 = "hg04090C4C1A130F07080F1354202B2222121B291B1F231A35614D382F2F1F2856282C30274259283C39372E2D";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        ((Intent)localObject1).setAction((String)localObject3);
        localObject3 = "0q121F1E62041D251D1E19296A0E151014242D1331312D281F";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        ((Intent)localObject1).setPackage((String)localObject3);
        localObject3 = this.OooO0O0;
        ((Context)localObject3).bindService((Intent)localObject1, this, i);
        localObject1 = this.OooO0o0;
        i = 0;
        localObject4 = null;
        if (localObject1 == null)
        {
          localObject1 = new com/qinggan/system/ReverseManager$ObtainServiceThread;
          ((ReverseManager.ObtainServiceThread)localObject1).<init>(this, null);
        }
        for (this.OooO0o0 = ((ReverseManager.ObtainServiceThread)localObject1);; this.OooO0o0 = ((ReverseManager.ObtainServiceThread)localObject1))
        {
          ((Thread)localObject1).start();
          break;
          boolean bool = ((Thread)localObject1).isAlive();
          if (bool) {
            break;
          }
          this.OooO0o0 = null;
          localObject1 = new com/qinggan/system/ReverseManager$ObtainServiceThread;
          ((ReverseManager.ObtainServiceThread)localObject1).<init>(this, null);
        }
        return;
      }
      Object localObject3 = ISystemPolicy.Stub.o0Oo0o0O((IBinder)localObject1);
      this.OooO0o = ((ISystemPolicy)localObject3);
      this.OooO0Oo = i;
      Object localObject4 = new java/lang/Thread;
      localObject3 = new com/qinggan/system/ReverseManager$2;
      ((ReverseManager.2)localObject3).<init>(this);
      ((Thread)localObject4).<init>((Runnable)localObject3);
      ((Thread)localObject4).start();
      try
      {
        localObject4 = this.OooO00o;
        localObject3 = null;
        ((IBinder)localObject1).linkToDeath((IBinder.DeathRecipient)localObject4, 0);
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
      return;
    }
    finally {}
  }
  
  public int getCamera(int paramInt)
  {
    boolean bool = this.OooO0Oo;
    int i = -1;
    if (!bool) {
      return i;
    }
    try
    {
      ISystemPolicy localISystemPolicy = this.OooO0o;
      if (localISystemPolicy != null) {
        return localISystemPolicy.o0O0OOO(paramInt, 0, 0);
      }
      OooO0oo();
    }
    catch (RemoteException localRemoteException)
    {
      OooO0oo();
    }
    return i;
  }
  
  public int getPdcState()
  {
    boolean bool = this.OooO0Oo;
    int i = -1;
    if (!bool) {
      return i;
    }
    try
    {
      ISystemPolicy localISystemPolicy = this.OooO0o;
      if (localISystemPolicy != null) {
        return localISystemPolicy.getPdcState();
      }
      OooO0oo();
    }
    catch (RemoteException localRemoteException)
    {
      OooO0oo();
    }
    return i;
  }
  
  public int getPreReverseState()
  {
    boolean bool = this.OooO0Oo;
    int i = -1;
    if (!bool) {
      return i;
    }
    try
    {
      ISystemPolicy localISystemPolicy = this.OooO0o;
      if (localISystemPolicy != null) {
        return localISystemPolicy.getPreReverseState();
      }
      OooO0oo();
    }
    catch (RemoteException localRemoteException)
    {
      OooO0oo();
    }
    return i;
  }
  
  public int getReverseState()
  {
    boolean bool = this.OooO0Oo;
    int i = -1;
    if (!bool) {
      return i;
    }
    try
    {
      ISystemPolicy localISystemPolicy = this.OooO0o;
      if (localISystemPolicy != null) {
        return localISystemPolicy.getReverseState();
      }
      OooO0oo();
    }
    catch (RemoteException localRemoteException)
    {
      OooO0oo();
    }
    return i;
  }
  
  public void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    ??? = this.OooO0o;
    if (??? == null)
    {
      ??? = ISystemPolicy.Stub.o0Oo0o0O(paramIBinder);
      this.OooO0o = ???;
    }
    boolean bool1 = true;
    this.OooO0Oo = bool1;
    synchronized (OooO)
    {
      boolean bool2 = this.OooO0Oo;
      OooO(bool2);
      return;
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = this.OooO0o;
    if (paramComponentName != null)
    {
      bool = false;
      paramComponentName = null;
      this.OooO0o = null;
    }
    this.OooO0Oo = false;
    boolean bool = this.OooO0Oo;
    OooO(bool);
    OooO0oo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.ReverseManager
 * JD-Core Version:    0.7.0.1
 */