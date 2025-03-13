package com.qinggan.system;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.qinggan.os.ServiceManager;
import m54207b69;

class MultiWindowManager$2
  implements Runnable
{
  public MultiWindowManager$2(MultiWindowManager paramMultiWindowManager) {}
  
  public void run()
  {
    int i = 100;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = MultiWindowManager.OooO0OO((MultiWindowManager)localObject1);
      if (bool1) {
        break;
      }
      localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("uh051E061F0524070D141029"));
      if (localObject1 == null)
      {
        int j = i % 1000;
        long l = 100;
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
        try
        {
          Object localObject3 = this.o00OoOoo;
          localObject3 = ((MultiWindowManager)localObject3).OooO00o;
          localInterruptedException.linkToDeath((IBinder.DeathRecipient)localObject3, 0);
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
        MultiWindowManager localMultiWindowManager = this.o00OoOoo;
        Object localObject2 = IMultiWindowService.Stub.o0Oo0o0O(localInterruptedException);
        MultiWindowManager.OooO0O0(localMultiWindowManager, (IMultiWindowService)localObject2);
        localObject2 = this.o00OoOoo;
        boolean bool2 = true;
        MultiWindowManager.OooO0Oo((MultiWindowManager)localObject2, bool2);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.MultiWindowManager.2
 * JD-Core Version:    0.7.0.1
 */