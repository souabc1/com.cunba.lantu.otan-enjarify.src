package com.qinggan.system;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.qinggan.common.OnInitListener;
import com.qinggan.os.ServiceManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m54207b69;

class SystemPolicyManager$3
  implements Runnable
{
  public void run()
  {
    int i = 100;
    Object localObject1 = null;
    boolean bool3;
    int j;
    for (;;)
    {
      boolean bool1 = SystemPolicyManager.OooOOO0;
      bool3 = true;
      if (bool1) {
        break;
      }
      localObject1 = ServiceManager.OooO0O0(SystemPolicyManager.OooO0oo);
      if (localObject1 == null)
      {
        j = i % 1000;
        if (j == 0)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = m54207b69.F54207b69_11(";-4E4D451047475F14525163186A556D6A545F5A20");
          localStringBuilder.append(str);
          str = SystemPolicyManager.OooO0oo;
          localStringBuilder.append(str);
        }
        long l = 200L;
        try
        {
          Thread.sleep(l);
          i += 100;
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
      }
      else
      {
        SystemPolicyManager.OooOOO0 = bool3;
      }
    }
    Object localObject4;
    if (localObject1 == null)
    {
      localObject4 = SystemPolicyManager.OooO0oo;
      localObject1 = ServiceManager.OooO0O0((String)localObject4);
    }
    Object localObject3;
    try
    {
      localObject4 = this.o00OoOoo;
      localObject4 = ((SystemPolicyManager)localObject4).OooO00o;
      j = 0;
      localObject3 = null;
      ((IBinder)localObject1).linkToDeath((IBinder.DeathRecipient)localObject4, 0);
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
    }
    ??? = this.o00OoOoo;
    localObject1 = ISystemPolicy.Stub.o0Oo0o0O((IBinder)localObject1);
    SystemPolicyManager.OooO0OO((SystemPolicyManager)???, (ISystemPolicy)localObject1);
    synchronized (SystemPolicyManager.OooO0o(this.o00OoOoo))
    {
      localObject1 = this.o00OoOoo;
      localObject1 = SystemPolicyManager.OooO0o((SystemPolicyManager)localObject1);
      localObject1 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject3 = ((Iterator)localObject1).next();
        localObject3 = (OnInitListener)localObject3;
        ((OnInitListener)localObject3).OooO00o(bool3);
      }
      ??? = SystemPolicyManager.OooO0O0(this.o00OoOoo);
      i = ((HashMap)???).size();
      if (i > 0)
      {
        ??? = SystemPolicyManager.OooO0O0(this.o00OoOoo);
        localObject1 = SystemPolicyManager.OooO0Oo(this.o00OoOoo);
        ??? = (OnInitListener)((HashMap)???).get(localObject1);
        localObject1 = this.o00OoOoo;
        SystemPolicyManager.OooO0o0((SystemPolicyManager)localObject1, (OnInitListener)???);
      }
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.SystemPolicyManager.3
 * JD-Core Version:    0.7.0.1
 */