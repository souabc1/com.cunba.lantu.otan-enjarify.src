package com.qinggan.analytics.wbtech;

import android.content.Context;
import m54207b69;

class UmsAgent$4
  implements Runnable
{
  public void run()
  {
    Object localObject1 = m54207b69.F54207b69_11("sJ1F081B0E31342A45");
    Object localObject2 = m54207b69.F54207b69_11("`u36151B1C591F212E180F0A231C6A6A");
    CobubLog.OooO0Oo((String)localObject1, (String)localObject2);
    localObject1 = UmsAgent.OooO0O0();
    if (localObject1 == null)
    {
      localObject1 = new com/qinggan/analytics/wbtech/UsinglogManager;
      localObject2 = this.o00OoOoo;
      ((UsinglogManager)localObject1).<init>((Context)localObject2);
      UmsAgent.OooO0OO((UsinglogManager)localObject1);
    }
    localObject1 = UmsAgent.OooO0O0();
    localObject2 = this.o00Ooo00;
    ((UsinglogManager)localObject1).OooO0O0((String)localObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.UmsAgent.4
 * JD-Core Version:    0.7.0.1
 */