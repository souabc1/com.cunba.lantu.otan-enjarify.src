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
import java.util.HashMap;
import m54207b69;

public class NightVisionManager
  implements ServiceConnection
{
  public static Object OooO;
  public static String OooO0oO = "qg.system_policy";
  public static NightVisionManager OooO0oo;
  public IBinder.DeathRecipient OooO00o;
  public HashMap OooO0O0;
  public Context OooO0OO;
  public boolean OooO0Oo;
  public ISystemPolicy OooO0o;
  public Runnable OooO0o0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO = localObject;
  }
  
  public final void OooO0oo()
  {
    Object localObject1 = ServiceManager.OooO0O0(OooO0oO);
    int i = 1;
    if (localObject1 == null)
    {
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("hg04090C4C1A130F07080F1354202B2222121B291B1F231A35614D382F2F1F2856282C30274259283C39372E2D");
      ((Intent)localObject1).setAction((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("0q121F1E62041D251D1E19296A0E151014242D1331312D281F");
      ((Intent)localObject1).setPackage((String)localObject2);
      this.OooO0OO.bindService((Intent)localObject1, this, i);
      localObject1 = new java/lang/Thread;
      localObject3 = this.OooO0o0;
      ((Thread)localObject1).<init>((Runnable)localObject3);
      ((Thread)localObject1).start();
      return;
    }
    Object localObject2 = ISystemPolicy.Stub.o0Oo0o0O((IBinder)localObject1);
    this.OooO0o = ((ISystemPolicy)localObject2);
    this.OooO0Oo = i;
    Object localObject3 = new java/lang/Thread;
    localObject2 = new com/qinggan/system/NightVisionManager$2;
    ((NightVisionManager.2)localObject2).<init>(this);
    ((Thread)localObject3).<init>((Runnable)localObject2);
    ((Thread)localObject3).start();
    try
    {
      localObject3 = this.OooO00o;
      localObject2 = null;
      ((IBinder)localObject1).linkToDeath((IBinder.DeathRecipient)localObject3, 0);
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
    }
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO0o;
    int i;
    if (paramComponentName == null)
    {
      paramComponentName = ISystemPolicy.Stub.o0Oo0o0O(paramIBinder);
      this.OooO0o = paramComponentName;
      i = 1;
      this.OooO0Oo = i;
    }
    paramComponentName = this.OooO0O0;
    if (paramComponentName != null)
    {
      i = paramComponentName.size();
      if (i > 0)
      {
        paramComponentName = this.OooO0O0;
        paramIBinder = this.OooO0OO;
        paramComponentName = (OnInitListener)paramComponentName.get(paramIBinder);
        if (paramComponentName != null)
        {
          boolean bool = this.OooO0Oo;
          paramComponentName.OooO00o(bool);
        }
      }
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = this.OooO0o;
    int i;
    if (paramComponentName != null)
    {
      this.OooO0o = null;
      i = 0;
      paramComponentName = null;
      this.OooO0Oo = false;
    }
    paramComponentName = this.OooO0O0;
    if (paramComponentName != null)
    {
      i = paramComponentName.size();
      if (i > 0)
      {
        paramComponentName = this.OooO0O0;
        Context localContext = this.OooO0OO;
        paramComponentName = (OnInitListener)paramComponentName.get(localContext);
        if (paramComponentName != null)
        {
          boolean bool = this.OooO0Oo;
          paramComponentName.OooO00o(bool);
        }
      }
    }
    OooO0oo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.NightVisionManager
 * JD-Core Version:    0.7.0.1
 */