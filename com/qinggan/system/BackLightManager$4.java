package com.qinggan.system;

import com.qinggan.common.OnInitListener;
import java.util.List;

class BackLightManager$4
  implements Runnable
{
  public void run()
  {
    int i = 100;
    for (;;)
    {
      boolean bool2 = SystemPolicyManager.OooOOO0;
      if (bool2) {
        break;
      }
      j = i % 1000;
      long l = 200L;
      try
      {
        Thread.sleep(l);
        i += 100;
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
    }
    Object localObject = this.o00OoOoo;
    int j = 1;
    ((OnInitListener)localObject).OooO00o(j);
    localObject = BackLightManager.OooO0o().OooO00o;
    OnInitListener localOnInitListener = this.o00OoOoo;
    boolean bool1 = ((List)localObject).contains(localOnInitListener);
    if (bool1)
    {
      localObject = BackLightManager.OooO0o().OooO00o;
      localOnInitListener = this.o00OoOoo;
      ((List)localObject).remove(localOnInitListener);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.BackLightManager.4
 * JD-Core Version:    0.7.0.1
 */