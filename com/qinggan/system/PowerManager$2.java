package com.qinggan.system;

import android.os.IBinder.DeathRecipient;
import java.util.HashMap;
import java.util.List;

class PowerManager$2
  implements IBinder.DeathRecipient
{
  public void binderDied()
  {
    Object localObject1 = this.OooO00o;
    Object localObject2 = null;
    PowerManager.OooO0Oo((PowerManager)localObject1, false);
    localObject1 = PowerManager.OooO0O0(this.OooO00o);
    int i = ((HashMap)localObject1).size();
    if (i > 0)
    {
      localObject1 = PowerManager.OooO0O0(this.OooO00o);
      localObject2 = PowerManager.OooO0oO(this.OooO00o);
      localObject1 = (PowerManager.OnInitListener)((HashMap)localObject1).get(localObject2);
      localObject2 = this.OooO00o;
      PowerManager.OooO0oo((PowerManager)localObject2, (PowerManager.OnInitListener)localObject1);
    }
    PowerManager.OooO0o(this.OooO00o, null);
    PowerManager.OooO0o0(this.OooO00o).clear();
    PowerManager.OooO(this.OooO00o);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.PowerManager.2
 * JD-Core Version:    0.7.0.1
 */