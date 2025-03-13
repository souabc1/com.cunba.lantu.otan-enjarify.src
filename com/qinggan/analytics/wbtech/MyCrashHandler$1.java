package com.qinggan.analytics.wbtech;

import android.content.Context;
import android.os.Looper;
import android.os.Process;
import m54207b69;
import org.json.JSONObject;

class MyCrashHandler$1
  extends Thread
{
  public MyCrashHandler$1(MyCrashHandler paramMyCrashHandler, Throwable paramThrowable) {}
  
  public void run()
  {
    super.run();
    Looper.prepare();
    Object localObject1 = this.o00OoOoo;
    Object localObject2 = this.o00Ooo00;
    localObject1 = MyCrashHandler.OooO00o((MyCrashHandler)localObject1, (Throwable)localObject2);
    localObject2 = "\n\t";
    Object localObject3 = ((String)localObject1).split((String)localObject2);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = localObject3[0];
    localStringBuilder.append(str);
    localStringBuilder.append((String)localObject2);
    str = localObject3[1];
    localStringBuilder.append(str);
    localStringBuilder.append((String)localObject2);
    localObject3 = localObject3[2];
    localStringBuilder.append((String)localObject3);
    localObject3 = localStringBuilder.toString();
    int i = ((String)localObject3).length();
    int j = 255;
    if (i > j)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject3 = ((String)localObject3).substring(0, j);
    }
    else
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
    }
    localStringBuilder.append((String)localObject3);
    localStringBuilder.append((String)localObject2);
    localObject2 = localStringBuilder.toString();
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append((String)localObject2);
    ((StringBuilder)localObject3).append((String)localObject1);
    localObject2 = ((StringBuilder)localObject3).toString();
    MyCrashHandler.OooO0O0(this.o00OoOoo, localObject2);
    localObject2 = this.o00OoOoo;
    localObject3 = CommonUtil.OooO0OO(MyCrashHandler.OooO0Oo((MyCrashHandler)localObject2));
    MyCrashHandler.OooO0OO((MyCrashHandler)localObject2, (String)localObject3);
    localObject2 = this.o00OoOoo;
    localObject3 = DeviceInfo.getDeviceTime();
    MyCrashHandler.OooO0o0((MyCrashHandler)localObject2, (String)localObject3);
    localObject2 = this.o00OoOoo;
    localObject3 = AppInfo.getAppKey();
    MyCrashHandler.OooO0o((MyCrashHandler)localObject2, (String)localObject3);
    localObject2 = this.o00OoOoo;
    localObject3 = DeviceInfo.getOsVersion();
    MyCrashHandler.OooO0oO((MyCrashHandler)localObject2, (String)localObject3);
    localObject2 = this.o00OoOoo;
    localObject3 = MyCrashHandler.OooO0Oo((MyCrashHandler)localObject2);
    localObject2 = MyCrashHandler.OooO0oo((MyCrashHandler)localObject2, (Context)localObject3);
    CobubLog.OooO0Oo(m54207b69.F54207b69_11("@R1F2C1323372640213B454049432D"), (String)localObject1);
    localObject1 = MyCrashHandler.OooO0Oo(this.o00OoOoo);
    CommonUtil.OooOOo(m54207b69.F54207b69_11("u+4E5A5B475D674B544C"), (JSONObject)localObject2, (Context)localObject1);
    Process.killProcess(Process.myPid());
    Looper.loop();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.MyCrashHandler.1
 * JD-Core Version:    0.7.0.1
 */