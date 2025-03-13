package com.just.agentweb.core.web;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import java.io.File;
import m54207b69;

public class AgentWebConfig
{
  public static final String OooO00o;
  public static String OooO0O0;
  public static boolean OooO0OO;
  public static final boolean OooO0Oo;
  public static volatile boolean OooO0o = false;
  public static int OooO0o0;
  public static final String OooO0oO = AgentWebConfig.class.getSimpleName();
  public static int OooO0oo = 5242880;
  
  static
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = File.separator;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("D051585761484C5B59255C5B5E6462");
    localStringBuilder.append(str);
    OooO00o = localStringBuilder.toString();
    OooO0OO = false;
    OooO0Oo = false;
    OooO0o0 = 1;
  }
  
  public static void OooO0O0(Context paramContext) {}
  
  public static String OooO0OO(Context paramContext)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    paramContext = paramContext.getCacheDir().getAbsolutePath();
    localStringBuilder.append(paramContext);
    paramContext = OooO00o;
    localStringBuilder.append(paramContext);
    return localStringBuilder.toString();
  }
  
  public static String OooO0Oo(String paramString)
  {
    CookieManager localCookieManager = CookieManager.getInstance();
    if (localCookieManager == null)
    {
      paramString = null;
    }
    else
    {
      localCookieManager = CookieManager.getInstance();
      paramString = localCookieManager.getCookie(paramString);
    }
    return paramString;
  }
  
  public static void OooO0o0(Context paramContext)
  {
    synchronized (AgentWebConfig.class)
    {
      boolean bool1 = OooO0o;
      if (!bool1)
      {
        OooO0O0(paramContext);
        boolean bool2 = true;
        OooO0o = bool2;
      }
      return;
    }
  }
  
  private static ValueCallback getDefaultIgnoreCallback()
  {
    AgentWebConfig.2 local2 = new com/just/agentweb/core/web/AgentWebConfig$2;
    local2.<init>();
    return local2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.AgentWebConfig
 * JD-Core Version:    0.7.0.1
 */