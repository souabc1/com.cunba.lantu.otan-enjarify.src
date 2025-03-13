package androidx.core.app;

import android.os.PowerManager.WakeLock;

final class JobIntentService$CompatWorkEnqueuer
  extends JobIntentService.WorkEnqueuer
{
  public final PowerManager.WakeLock OooO00o;
  public final PowerManager.WakeLock OooO0O0;
  public boolean OooO0OO;
  public boolean OooO0Oo;
  
  public void OooO00o()
  {
    try
    {
      boolean bool = this.OooO0Oo;
      if (bool)
      {
        bool = this.OooO0OO;
        if (bool)
        {
          localWakeLock = this.OooO00o;
          long l = 60000L;
          localWakeLock.acquire(l);
        }
        bool = false;
        PowerManager.WakeLock localWakeLock = null;
        this.OooO0Oo = false;
        localWakeLock = this.OooO0O0;
        localWakeLock.release();
      }
      return;
    }
    finally {}
  }
  
  public void OooO0O0()
  {
    try
    {
      boolean bool = this.OooO0Oo;
      if (!bool)
      {
        bool = true;
        this.OooO0Oo = bool;
        PowerManager.WakeLock localWakeLock = this.OooO0O0;
        long l = 600000L;
        localWakeLock.acquire(l);
        localWakeLock = this.OooO00o;
        localWakeLock.release();
      }
      return;
    }
    finally {}
  }
  
  public void OooO0OO()
  {
    Object localObject1 = null;
    try
    {
      this.OooO0OO = false;
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.JobIntentService.CompatWorkEnqueuer
 * JD-Core Version:    0.7.0.1
 */