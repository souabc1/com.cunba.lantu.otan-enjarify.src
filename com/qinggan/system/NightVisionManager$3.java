package com.qinggan.system;

import android.os.IBinder.DeathRecipient;

class NightVisionManager$3
  implements IBinder.DeathRecipient
{
  public void binderDied()
  {
    NightVisionManager.OooO0o(this.OooO00o, null);
    NightVisionManager.OooO0o0(this.OooO00o, false);
    Thread localThread = new java/lang/Thread;
    Runnable localRunnable = NightVisionManager.OooO0oO(this.OooO00o);
    localThread.<init>(localRunnable);
    localThread.start();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.NightVisionManager.3
 * JD-Core Version:    0.7.0.1
 */