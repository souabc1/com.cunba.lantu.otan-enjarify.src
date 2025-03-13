package com.qinggan.analytics.wbtech;

import android.content.Context;
import m54207b69;

class UmsAgent$6
  implements Runnable
{
  public void run()
  {
    Object localObject1 = m54207b69.F54207b69_11("sJ1F081B0E31342A45");
    Object localObject2 = m54207b69.F54207b69_11("E{381B191A5F191B4511121E145F5F");
    CobubLog.OooO0Oo((String)localObject1, (String)localObject2);
    localObject1 = MyCrashHandler.getInstance();
    localObject2 = this.o00OoOoo.getApplicationContext();
    ((MyCrashHandler)localObject1).OooOO0O((Context)localObject2);
    Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.UmsAgent.6
 * JD-Core Version:    0.7.0.1
 */