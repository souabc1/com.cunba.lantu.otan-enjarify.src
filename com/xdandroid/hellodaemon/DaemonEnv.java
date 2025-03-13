package com.xdandroid.hellodaemon;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.HashMap;
import java.util.Map;

public final class DaemonEnv
{
  public static Context OooO00o;
  public static Class OooO0O0;
  public static int OooO0OO = 360000;
  public static boolean OooO0Oo;
  public static final Map OooO0o0;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    OooO0o0 = localHashMap;
  }
  
  public static void OooO00o(Context paramContext, Class paramClass, Integer paramInteger)
  {
    OooO00o = paramContext;
    OooO0O0 = paramClass;
    if (paramInteger != null)
    {
      int i = paramInteger.intValue();
      OooO0OO = i;
    }
    OooO0Oo = true;
  }
  
  public static void OooO0O0(Class paramClass)
  {
    boolean bool = OooO0Oo;
    if (!bool) {
      return;
    }
    Intent localIntent = new android/content/Intent;
    Object localObject = OooO00o;
    localIntent.<init>((Context)localObject, paramClass);
    OooO0OO(localIntent);
    localObject = (ServiceConnection)OooO0o0.get(paramClass);
    if (localObject == null)
    {
      localObject = OooO00o;
      DaemonEnv.1 local1 = new com/xdandroid/hellodaemon/DaemonEnv$1;
      local1.<init>(paramClass, localIntent);
      int i = 1;
      ((Context)localObject).bindService(localIntent, local1, i);
    }
  }
  
  public static void OooO0OO(Intent paramIntent)
  {
    boolean bool = OooO0Oo;
    if (!bool) {
      return;
    }
    try
    {
      Context localContext = OooO00o;
      localContext.startService(paramIntent);
      label19:
      return;
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  public static int getWakeUpInterval()
  {
    return Math.max(OooO0OO, 180000);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xdandroid.hellodaemon.DaemonEnv
 * JD-Core Version:    0.7.0.1
 */