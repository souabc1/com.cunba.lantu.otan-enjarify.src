package com.qinggan.system;

import android.os.IBinder.DeathRecipient;
import com.qinggan.util.Log;
import m54207b69;

class MultiWindowManager$1
  implements IBinder.DeathRecipient
{
  public MultiWindowManager$1(MultiWindowManager paramMultiWindowManager) {}
  
  public void binderDied()
  {
    MultiWindowManager.OooO0O0(this.OooO00o, null);
    MultiWindowManager.OooO0Oo(this.OooO00o, false);
    Object localObject1 = new java/lang/Thread;
    Object localObject2 = MultiWindowManager.OooO0o0(this.OooO00o);
    ((Thread)localObject1).<init>((Runnable)localObject2);
    ((Thread)localObject1).start();
    localObject1 = m54207b69.F54207b69_11("Ts3E07210A1E2920241F250E491E2A20232612");
    localObject2 = m54207b69.F54207b69_11("a,415A425B49604B49504C656A556B68545F5A1E5873215E5C6161");
    Log.OooO00o((String)localObject1, (String)localObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.MultiWindowManager.1
 * JD-Core Version:    0.7.0.1
 */