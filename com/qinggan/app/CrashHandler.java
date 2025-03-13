package com.qinggan.app;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import m54207b69;

class CrashHandler
  implements Thread.UncaughtExceptionHandler
{
  public static CrashHandler OooO0Oo;
  public Map OooO00o;
  public Context OooO0O0;
  public Thread.UncaughtExceptionHandler OooO0OO;
  
  static
  {
    CrashHandler localCrashHandler = new com/qinggan/app/CrashHandler;
    localCrashHandler.<init>();
    OooO0Oo = localCrashHandler;
  }
  
  private CrashHandler()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO00o = localHashMap;
  }
  
  public static CrashHandler getInstance()
  {
    return OooO0Oo;
  }
  
  public void OooO00o(Context paramContext)
  {
    int i = 1;
    try
    {
      Object localObject1 = paramContext.getPackageManager();
      paramContext = paramContext.getPackageName();
      paramContext = ((PackageManager)localObject1).getPackageInfo(paramContext, i);
      if (paramContext != null)
      {
        localObject1 = paramContext.versionName;
        if (localObject1 == null) {
          localObject1 = m54207b69.F54207b69_11("C?514B5556");
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        int j = paramContext.versionCode;
        ((StringBuilder)localObject2).append(j);
        paramContext = "";
        ((StringBuilder)localObject2).append(paramContext);
        paramContext = ((StringBuilder)localObject2).toString();
        localObject2 = this.OooO00o;
        localObject3 = "gV20342628433E3E1F3F443D";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        ((Map)localObject2).put(localObject3, localObject1);
        localObject1 = this.OooO00o;
        localObject2 = "N$5242585A5150506E53494B";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        ((Map)localObject1).put(localObject2, paramContext);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject2;
      Object localObject3;
      label132:
      int k;
      int m;
      break label132;
    }
    paramContext = Build.class.getDeclaredFields();
    k = paramContext.length;
    m = 0;
    localObject2 = null;
    while (m < k)
    {
      localObject3 = paramContext[m];
      try
      {
        ((AccessibleObject)localObject3).setAccessible(i);
        Object localObject4 = this.OooO00o;
        String str = ((Field)localObject3).getName();
        Object localObject5 = ((Field)localObject3).get(null);
        localObject5 = localObject5.toString();
        ((Map)localObject4).put(str, localObject5);
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        str = ((Field)localObject3).getName();
        ((StringBuilder)localObject4).append(str);
        str = " : ";
        ((StringBuilder)localObject4).append(str);
        localObject3 = ((Field)localObject3).get(null);
        ((StringBuilder)localObject4).append(localObject3);
      }
      catch (Exception localException)
      {
        label260:
        break label260;
      }
      m += 1;
    }
  }
  
  public final boolean OooO0O0(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return false;
    }
    Object localObject = this.OooO0O0;
    OooO00o((Context)localObject);
    localObject = this.OooO0O0;
    OooO0OO((Context)localObject, paramThrowable);
    localObject = new com/qinggan/app/CrashInfo;
    ((CrashInfo)localObject).<init>(paramThrowable);
    ((CrashInfo)localObject).OooO00o("");
    return true;
  }
  
  public final void OooO0OO(Context paramContext, Throwable paramThrowable) {}
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    OooO0O0(paramThrowable);
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = this.OooO0OO;
    if (localUncaughtExceptionHandler != null)
    {
      Process.killProcess(Process.myPid());
      int i = 10;
      System.exit(i);
      localUncaughtExceptionHandler = this.OooO0OO;
      localUncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.app.CrashHandler
 * JD-Core Version:    0.7.0.1
 */