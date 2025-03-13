package com.qinggan.systempolicy;

import android.content.Context;
import m54207b69;

class VideoPolicyManager$2
  implements Runnable
{
  public void run()
  {
    long l = 100;
    try
    {
      Thread.sleep(l);
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
    }
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("zW0C3440272B3B293B470E3C2F2E48312D49145138464B492153573E3E4E5650448D");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.o00Ooo00;
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = m54207b69.F54207b69_11("ck474C1D031056");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = VideoPolicyManager.OooO0OO(this.o00OoOoo).getPackageName();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.o00Ooo00;
    if (localObject1 != null)
    {
      boolean bool = this.o00Ooo0;
      if (bool) {
        ((VideoPolicyManager.OnInitListener)localObject1).OooO0O0();
      } else {
        ((VideoPolicyManager.OnInitListener)localObject1).OooO00o();
      }
      localObject1 = this.o00OoOoo;
      localObject2 = this.o00Ooo00;
      VideoPolicyManager.OooO0Oo((VideoPolicyManager)localObject1, (VideoPolicyManager.OnInitListener)localObject2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.systempolicy.VideoPolicyManager.2
 * JD-Core Version:    0.7.0.1
 */