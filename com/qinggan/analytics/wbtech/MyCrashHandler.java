package com.qinggan.analytics.wbtech;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

class MyCrashHandler
  implements Thread.UncaughtExceptionHandler
{
  public static MyCrashHandler OooO0oo;
  public String OooO00o;
  public String OooO0O0;
  public Context OooO0OO;
  public String OooO0Oo;
  public final String OooO0o;
  public Object OooO0o0;
  public String OooO0oO;
  
  private MyCrashHandler()
  {
    String str = m54207b69.F54207b69_11("@R1F2C1323372640213B454049432D");
    this.OooO0o = str;
  }
  
  /* Error */
  public static MyCrashHandler getInstance()
  {
    // Byte code:
    //   0: ldc 2
    //   2: astore_0
    //   3: aload_0
    //   4: monitorenter
    //   5: getstatic 54	com/qinggan/analytics/wbtech/MyCrashHandler:OooO0oo	Lcom/qinggan/analytics/wbtech/MyCrashHandler;
    //   8: astore_0
    //   9: aload_0
    //   10: ifnull +8 -> 18
    //   13: ldc 2
    //   15: monitorexit
    //   16: aload_0
    //   17: areturn
    //   18: new 2	com/qinggan/analytics/wbtech/MyCrashHandler
    //   21: astore_0
    //   22: aload_0
    //   23: invokespecial 55	com/qinggan/analytics/wbtech/MyCrashHandler:<init>	()V
    //   26: aload_0
    //   27: putstatic 54	com/qinggan/analytics/wbtech/MyCrashHandler:OooO0oo	Lcom/qinggan/analytics/wbtech/MyCrashHandler;
    //   30: goto -17 -> 13
    //   33: astore_0
    //   34: ldc 2
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   2	25	0	localMyCrashHandler	MyCrashHandler
    //   33	5	0	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	8	33	finally
    //   18	21	33	finally
    //   22	26	33	finally
    //   26	30	33	finally
  }
  
  public final String OooO(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    PrintWriter localPrintWriter = new java/io/PrintWriter;
    localPrintWriter.<init>(localStringWriter);
    paramThrowable.printStackTrace(localPrintWriter);
    localPrintWriter.close();
    return localStringWriter.toString();
  }
  
  public final JSONObject OooOO0(Context paramContext)
  {
    paramContext = new org/json/JSONObject;
    paramContext.<init>();
    String str = "B%5652464952565D4B4E49";
    try
    {
      str = m54207b69.F54207b69_11(str);
      Object localObject = this.OooO0o0;
      paramContext.put(str, localObject);
      str = "NS273B4039";
      str = m54207b69.F54207b69_11(str);
      localObject = this.OooO0oO;
      paramContext.put(str, localObject);
      str = "/h1E0E1C1E050C0C";
      str = m54207b69.F54207b69_11(str);
      localObject = AppInfo.getAppVersion();
      paramContext.put(str, localObject);
      str = ":'4645555155535965";
      str = m54207b69.F54207b69_11(str);
      localObject = this.OooO00o;
      paramContext.put(str, localObject);
      str = "UV372728403734";
      str = m54207b69.F54207b69_11(str);
      localObject = this.OooO0O0;
      paramContext.put(str, localObject);
      str = "'~110E230B1F11131E1919";
      str = m54207b69.F54207b69_11(str);
      localObject = this.OooO0Oo;
      paramContext.put(str, localObject);
      str = "]s1717071D141B201E";
      str = m54207b69.F54207b69_11(str);
      localObject = DeviceInfo.getDeviceName();
      paramContext.put(str, localObject);
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
    return paramContext;
  }
  
  public void OooOO0O(Context paramContext)
  {
    this.OooO0OO = paramContext;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    OooO(paramThrowable);
    paramThread = new com/qinggan/analytics/wbtech/MyCrashHandler$1;
    paramThread.<init>(this, paramThrowable);
    paramThread.start();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.MyCrashHandler
 * JD-Core Version:    0.7.0.1
 */