package com.qinggan.system;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import java.util.HashMap;
import m54207b69;

class KeyManager$2
  implements Runnable
{
  public void run()
  {
    int i = 100;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = KeyManager.OooO0O0((KeyManager)localObject1);
      if (!bool1)
      {
        localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("/[2A3D773342270A3D423E44474A36"));
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
          try
          {
            Object localObject3 = this.o00OoOoo;
            localObject3 = ((KeyManager)localObject3).OooO0O0;
            localInterruptedException.linkToDeath((IBinder.DeathRecipient)localObject3, 0);
          }
          catch (RemoteException localRemoteException)
          {
            localRemoteException.printStackTrace();
          }
          Object localObject4 = this.o00OoOoo;
          ??? = IKeyManagerService.Stub.o0Oo0o0O(localInterruptedException);
          KeyManager.OooO0oO((KeyManager)localObject4, (IKeyManagerService)???);
          ??? = this.o00OoOoo;
          boolean bool2 = true;
          KeyManager.OooO0Oo((KeyManager)???, bool2);
          synchronized (KeyManager.class)
          {
            ??? = this.o00OoOoo;
            ??? = KeyManager.OooO0oo((KeyManager)???);
            if (??? != null)
            {
              ??? = this.o00OoOoo;
              ??? = KeyManager.OooO0oo((KeyManager)???);
              j = ((HashMap)???).size();
              if (j > 0)
              {
                ??? = this.o00OoOoo;
                ??? = KeyManager.OooO0oo((KeyManager)???);
                localObject4 = this.o00OoOoo;
                localObject4 = KeyManager.OooO((KeyManager)localObject4);
                ??? = ((HashMap)???).get(localObject4);
                ??? = (KeyManager.OnInitListener)???;
                localObject4 = this.o00OoOoo;
                bool2 = KeyManager.OooO0O0((KeyManager)localObject4);
                ((KeyManager.OnInitListener)???).OooO00o(bool2);
              }
            }
            ??? = KeyManager.class;
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.KeyManager.2
 * JD-Core Version:    0.7.0.1
 */