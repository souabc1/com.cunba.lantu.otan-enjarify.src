package com.qinggan.windowpolicy;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.qinggan.os.ServiceManager;
import m54207b69;

class WindowPolicyManager$2
  implements Runnable
{
  public void run()
  {
    int i = 100;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = WindowPolicyManager.OooO0O0((WindowPolicyManager)localObject1);
      if (bool1) {
        break;
      }
      localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("O;4C5357625851515B5F5B624D"));
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
          localObject3 = ((WindowPolicyManager)localObject3).OooO00o;
          localInterruptedException.linkToDeath((IBinder.DeathRecipient)localObject3, 0);
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
        WindowPolicyManager localWindowPolicyManager = this.o00OoOoo;
        Object localObject2 = IWindowPolicyService.Stub.o0Oo0o0O(localInterruptedException);
        WindowPolicyManager.OooO00o(localWindowPolicyManager, (IWindowPolicyService)localObject2);
        localObject2 = this.o00OoOoo;
        boolean bool2 = true;
        WindowPolicyManager.OooO0OO((WindowPolicyManager)localObject2, bool2);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.windowpolicy.WindowPolicyManager.2
 * JD-Core Version:    0.7.0.1
 */