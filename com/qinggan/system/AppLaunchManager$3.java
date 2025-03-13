package com.qinggan.system;

import android.os.IBinder.DeathRecipient;
import com.qinggan.util.Log;
import m54207b69;

class AppLaunchManager$3
  implements IBinder.DeathRecipient
{
  public void binderDied()
  {
    AppLaunchManager.OooO0Oo(this.OooO00o, null);
    AppLaunchManager.OooO0O0(this.OooO00o, false);
    Object localObject1 = new java/lang/Thread;
    Object localObject2 = AppLaunchManager.OooO0o(this.OooO00o);
    ((Thread)localObject1).<init>((Runnable)localObject2);
    ((Thread)localObject1).start();
    localObject1 = m54207b69.F54207b69_11("9C02343512263B332733172C382E313440");
    localObject2 = m54207b69.F54207b69_11("]g2618192E0A170F0B17331014120D1024571F265A29171A2C1A1F2D1D637778797A7B7C7D7E7F808182838485868788898A8B8C8D8E8F909192939495969798999A9B9C9D9E9FA0A1A2A391");
    Log.OooO00o((String)localObject1, (String)localObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.AppLaunchManager.3
 * JD-Core Version:    0.7.0.1
 */