package com.qinggan.system;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import m54207b69;

class AppLaunchManager$1
  implements Runnable
{
  public void run()
  {
    int i = 100;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = AppLaunchManager.OooO00o((AppLaunchManager)localObject1);
      if (bool1) {
        break;
      }
      localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("\\w06115B190B0C2E221E0B231F2B"));
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
          localObject3 = ((AppLaunchManager)localObject3).OooO00o;
          localInterruptedException.linkToDeath((IBinder.DeathRecipient)localObject3, 0);
        }
        catch (RemoteException localRemoteException)
        {
          localRemoteException.printStackTrace();
        }
        AppLaunchManager localAppLaunchManager = this.o00OoOoo;
        Object localObject2 = IAppLaunchService.Stub.o0Oo0o0O(localInterruptedException);
        AppLaunchManager.OooO0Oo(localAppLaunchManager, (IAppLaunchService)localObject2);
        localObject2 = this.o00OoOoo;
        boolean bool2 = true;
        AppLaunchManager.OooO0O0((AppLaunchManager)localObject2, bool2);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.AppLaunchManager.1
 * JD-Core Version:    0.7.0.1
 */