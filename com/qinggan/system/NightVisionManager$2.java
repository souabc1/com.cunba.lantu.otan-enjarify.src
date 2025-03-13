package com.qinggan.system;

import com.qinggan.common.OnInitListener;
import java.util.HashMap;
import m54207b69;

class NightVisionManager$2
  implements Runnable
{
  public NightVisionManager$2(NightVisionManager paramNightVisionManager) {}
  
  public void run()
  {
    Object localObject1 = NightVisionManager.OooO00o(this.o00OoOoo);
    if (localObject1 != null)
    {
      localObject1 = NightVisionManager.OooO00o(this.o00OoOoo);
      int i = ((HashMap)localObject1).size();
      if (i > 0)
      {
        localObject1 = NightVisionManager.OooO00o(this.o00OoOoo);
        Object localObject2 = NightVisionManager.OooO0O0(this.o00OoOoo);
        localObject1 = (OnInitListener)((HashMap)localObject1).get(localObject2);
        long l = 30;
        try
        {
          Thread.sleep(l);
          for (;;)
          {
            localObject2 = NightVisionManager.OooO0OO();
            if (localObject2 != null) {
              break;
            }
            l = 50;
            Thread.sleep(l);
          }
          Object localObject3;
          Object localObject4;
          boolean bool1;
          boolean bool2;
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          if (localObject1 != null)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject4 = m54207b69.F54207b69_11("J?52774E7F54565761645464662B635A2E2F");
            ((StringBuilder)localObject3).append((String)localObject4);
            localObject4 = this.o00OoOoo;
            bool1 = NightVisionManager.OooO0Oo((NightVisionManager)localObject4);
            ((StringBuilder)localObject3).append(bool1);
            localObject3 = this.o00OoOoo;
            bool2 = NightVisionManager.OooO0Oo((NightVisionManager)localObject3);
            ((OnInitListener)localObject1).OooO00o(bool2);
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.NightVisionManager.2
 * JD-Core Version:    0.7.0.1
 */