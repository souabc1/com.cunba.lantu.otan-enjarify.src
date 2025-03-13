package com.qinggan.system;

import android.os.IBinder.DeathRecipient;
import com.qinggan.common.OnInitListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class SystemPolicyManager$2
  implements IBinder.DeathRecipient
{
  public void binderDied()
  {
    SystemPolicyManager.OooO0OO(this.OooO00o, null);
    Thread localThread = null;
    SystemPolicyManager.OooOOO0 = false;
    ??? = SystemPolicyManager.OooO0O0(this.OooO00o);
    int i = ((HashMap)???).size();
    Object localObject3;
    if (i > 0)
    {
      ??? = SystemPolicyManager.OooO0O0(this.OooO00o);
      localObject3 = SystemPolicyManager.OooO0Oo(this.OooO00o);
      ??? = (OnInitListener)((HashMap)???).get(localObject3);
      localObject3 = this.OooO00o;
      SystemPolicyManager.OooO0o0((SystemPolicyManager)localObject3, (OnInitListener)???);
    }
    synchronized (SystemPolicyManager.OooO0o(this.OooO00o))
    {
      localObject3 = this.OooO00o;
      localObject3 = SystemPolicyManager.OooO0o((SystemPolicyManager)localObject3);
      localObject3 = ((List)localObject3).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject3).hasNext();
        if (!bool) {
          break;
        }
        Object localObject4 = ((Iterator)localObject3).next();
        localObject4 = (OnInitListener)localObject4;
        ((OnInitListener)localObject4).OooO00o(false);
      }
      localThread = new java/lang/Thread;
      ??? = SystemPolicyManager.OooO0oO(this.OooO00o);
      localThread.<init>((Runnable)???);
      localThread.start();
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.SystemPolicyManager.2
 * JD-Core Version:    0.7.0.1
 */