package com.qinggan.windowpolicy;

import android.os.IBinder.DeathRecipient;
import com.qinggan.util.Log;
import m54207b69;

class WindowPolicyManager$1
  implements IBinder.DeathRecipient
{
  public void binderDied()
  {
    WindowPolicyManager.OooO00o(this.OooO00o, null);
    WindowPolicyManager.OooO0OO(this.OooO00o, false);
    Object localObject1 = new java/lang/Thread;
    Object localObject2 = WindowPolicyManager.OooO0Oo(this.OooO00o);
    ((Thread)localObject1).<init>((Runnable)localObject2);
    ((Thread)localObject1).start();
    localObject1 = m54207b69.F54207b69_11("p&71504A454D567C5052584F6A77545656515466");
    localObject2 = m54207b69.F54207b69_11("c)5E4149504A635F4D4D49545B6659696E505B5E1C546F1F64586567");
    Log.OooO00o((String)localObject1, (String)localObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.windowpolicy.WindowPolicyManager.1
 * JD-Core Version:    0.7.0.1
 */