package com.qinggan.dvr;

import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;

class DvrManager$3
  implements IBinder.DeathRecipient
{
  public DvrManager$3(DvrManager paramDvrManager) {}
  
  public void binderDied()
  {
    Object localObject = this.OooO00o;
    int i = 0;
    Runnable localRunnable = null;
    DvrManager.OooO0OO((DvrManager)localObject, null);
    try
    {
      localObject = this.OooO00o;
      localObject = DvrManager.OooO0Oo((DvrManager)localObject);
      i = 1;
      ((IDvrListener)localObject).OooO0O0(i);
    }
    catch (RemoteException localRemoteException)
    {
      label34:
      break label34;
    }
    localObject = DvrManager.OooO0o(this.OooO00o);
    localRunnable = DvrManager.OooO0o0(this.OooO00o);
    ((Handler)localObject).postDelayed(localRunnable, 200L);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.dvr.DvrManager.3
 * JD-Core Version:    0.7.0.1
 */