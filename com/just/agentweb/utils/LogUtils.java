package com.just.agentweb.utils;

import com.just.agentweb.core.web.AgentWebConfig;
import m54207b69;

public class LogUtils
{
  public static void OooO00o(String paramString1, String paramString2)
  {
    boolean bool = isDebug();
    if (bool)
    {
      paramString2 = m54207b69.F54207b69_11("~[7B3B3E413934324541848086");
      paramString2.concat(paramString1);
    }
  }
  
  public static void OooO0O0(String paramString1, String paramString2, Throwable paramThrowable) {}
  
  public static void OooO0OO(String paramString1, String paramString2)
  {
    boolean bool = isDebug();
    if (bool)
    {
      paramString2 = m54207b69.F54207b69_11("~[7B3B3E413934324541848086");
      paramString2.concat(paramString1);
    }
  }
  
  public static void OooO0Oo(String paramString1, String paramString2, Throwable paramThrowable)
  {
    boolean bool = isDebug();
    String str = m54207b69.F54207b69_11("~[7B3B3E413934324541848086");
    if (!bool)
    {
      str.concat(paramString1);
      return;
    }
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    paramString1 = str.concat(paramString1);
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" ");
    localStringBuilder.append(paramString2);
    paramString1 = localStringBuilder.toString();
    localRuntimeException.<init>(paramString1, paramThrowable);
    throw localRuntimeException;
  }
  
  public static boolean isDebug()
  {
    return AgentWebConfig.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.utils.LogUtils
 * JD-Core Version:    0.7.0.1
 */