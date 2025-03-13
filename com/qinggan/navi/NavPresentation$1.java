package com.qinggan.navi;

import com.qinggan.util.Log;
import m54207b69;

class NavPresentation$1
  implements Runnable
{
  public void run()
  {
    long l = 200L;
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
    Object localObject2 = m54207b69.F54207b69_11("Eu1C1C080418201C174425100C1C281E1658");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = NavPresentation.OooO00o();
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = m54207b69.F54207b69_11("Or3C140625041C071E240F1D11272A2A");
    localObject1 = ((StringBuilder)localObject1).toString();
    Log.OooO00o((String)localObject2, (String)localObject1);
    localObject1 = NavPresentation.OooO00o();
    if (localObject1 != null)
    {
      localObject1 = NavPresentation.OooO00o();
      boolean bool = true;
      ((NavPresentation.OnInitListener)localObject1).OooO00o(bool);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NavPresentation.1
 * JD-Core Version:    0.7.0.1
 */