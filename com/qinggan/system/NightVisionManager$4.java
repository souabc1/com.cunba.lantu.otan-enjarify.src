package com.qinggan.system;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.qinggan.common.OnInitListener;
import com.qinggan.os.ServiceManager;
import java.util.HashMap;
import m54207b69;

class NightVisionManager$4
  implements Runnable
{
  public void run()
  {
    int i = 100;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = NightVisionManager.OooO0Oo((NightVisionManager)localObject1);
      if (bool1) {
        break;
      }
      localObject1 = ServiceManager.OooO0O0(NightVisionManager.OooO0oO);
      int j;
      Object localObject3;
      if (localObject1 == null)
      {
        j = i % 1000;
        if (j == 0)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject3 = m54207b69.F54207b69_11(";-4E4D451047475F14525163186A556D6A545F5A20");
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = NightVisionManager.OooO0oO;
          ((StringBuilder)localObject1).append((String)localObject3);
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
        boolean bool2;
        Object localObject5;
        try
        {
          localObject3 = this.o00OoOoo;
          localObject3 = ((NightVisionManager)localObject3).OooO00o;
          bool2 = false;
          localObject5 = null;
          localInterruptedException.linkToDeath((IBinder.DeathRecipient)localObject3, 0);
        }
        catch (RemoteException localRemoteException)
        {
          localRemoteException.printStackTrace();
        }
        Object localObject4 = this.o00OoOoo;
        Object localObject2 = ISystemPolicy.Stub.o0Oo0o0O(localInterruptedException);
        NightVisionManager.OooO0o((NightVisionManager)localObject4, (ISystemPolicy)localObject2);
        localObject2 = this.o00OoOoo;
        boolean bool3 = true;
        NightVisionManager.OooO0o0((NightVisionManager)localObject2, bool3);
        localObject2 = NightVisionManager.OooO00o(this.o00OoOoo);
        if (localObject2 != null)
        {
          localObject2 = NightVisionManager.OooO00o(this.o00OoOoo);
          j = ((HashMap)localObject2).size();
          if (j > 0)
          {
            localObject2 = NightVisionManager.OooO00o(this.o00OoOoo);
            localObject4 = NightVisionManager.OooO0O0(this.o00OoOoo);
            localObject2 = (OnInitListener)((HashMap)localObject2).get(localObject4);
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject5 = m54207b69.F54207b69_11("J?52774E7F54565761645464662B635A2E2F");
            ((StringBuilder)localObject4).append((String)localObject5);
            localObject5 = this.o00OoOoo;
            bool2 = NightVisionManager.OooO0Oo((NightVisionManager)localObject5);
            ((StringBuilder)localObject4).append(bool2);
            localObject4 = this.o00OoOoo;
            bool3 = NightVisionManager.OooO0Oo((NightVisionManager)localObject4);
            ((OnInitListener)localObject2).OooO00o(bool3);
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.NightVisionManager.4
 * JD-Core Version:    0.7.0.1
 */