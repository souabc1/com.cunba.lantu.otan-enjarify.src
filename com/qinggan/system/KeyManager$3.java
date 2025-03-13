package com.qinggan.system;

import android.os.IBinder.DeathRecipient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

class KeyManager$3
  implements IBinder.DeathRecipient
{
  public void binderDied()
  {
    KeyManager.OooO0oO(this.OooO00o, null);
    KeyManager.OooO0Oo(this.OooO00o, false);
    Object localObject = this.OooO00o;
    ScheduledExecutorService localScheduledExecutorService = ((KeyManager)localObject).OooO0Oo;
    localObject = KeyManager.OooOO0((KeyManager)localObject);
    localScheduledExecutorService.execute((Runnable)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.KeyManager.3
 * JD-Core Version:    0.7.0.1
 */