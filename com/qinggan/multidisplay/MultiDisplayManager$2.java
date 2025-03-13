package com.qinggan.multidisplay;

import android.os.IBinder.DeathRecipient;

class MultiDisplayManager$2
  implements IBinder.DeathRecipient
{
  public void binderDied()
  {
    MultiDisplayManager.OooO0oo(this.OooO00o, null);
    MultiDisplayManager.OooOO0(this.OooO00o, false);
    MultiDisplayManager.OooOO0O(this.OooO00o).OooO00o();
    MultiDisplayManager.OooOO0o(this.OooO00o).OooO00o();
    Thread localThread = new java/lang/Thread;
    Runnable localRunnable = MultiDisplayManager.OooOOO0(this.OooO00o);
    localThread.<init>(localRunnable);
    localThread.start();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.MultiDisplayManager.2
 * JD-Core Version:    0.7.0.1
 */