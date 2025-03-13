package com.qinggan.system;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import java.util.HashMap;
import m54207b69;

class PowerManager$ObtainServiceThread
  extends Thread
{
  public PowerManager$ObtainServiceThread(PowerManager paramPowerManager) {}
  
  public void run()
  {
    int i = 100;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = PowerManager.OooO0OO((PowerManager)localObject1);
      if (bool1) {
        break;
      }
      localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("he14034D180E17061E42110E16100F0E26"));
      int j;
      if (localObject1 == null)
      {
        j = i % 1000;
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
        Object localObject3 = this.o00OoOoo;
        boolean bool2 = true;
        PowerManager.OooO0Oo((PowerManager)localObject3, bool2);
        try
        {
          localObject3 = this.o00OoOoo;
          localObject3 = ((PowerManager)localObject3).OooO0OO;
          bool2 = false;
          localInterruptedException.linkToDeath((IBinder.DeathRecipient)localObject3, 0);
        }
        catch (RemoteException localRemoteException)
        {
          localRemoteException.printStackTrace();
        }
        Object localObject4 = this.o00OoOoo;
        Object localObject2 = IPowerManagerService.Stub.o0Oo0o0O(localInterruptedException);
        PowerManager.OooO0o((PowerManager)localObject4, (IPowerManagerService)localObject2);
        localObject2 = PowerManager.OooO0O0(this.o00OoOoo);
        j = ((HashMap)localObject2).size();
        if (j > 0)
        {
          localObject2 = PowerManager.OooO0O0(this.o00OoOoo);
          localObject4 = PowerManager.OooO0oO(this.o00OoOoo);
          localObject2 = (PowerManager.OnInitListener)((HashMap)localObject2).get(localObject4);
          localObject4 = this.o00OoOoo;
          PowerManager.OooO0oo((PowerManager)localObject4, (PowerManager.OnInitListener)localObject2);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.PowerManager.ObtainServiceThread
 * JD-Core Version:    0.7.0.1
 */