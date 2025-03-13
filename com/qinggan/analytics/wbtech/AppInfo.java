package com.qinggan.analytics.wbtech;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import m54207b69;

class AppInfo
{
  public static String OooO00o;
  public static Context OooO0O0;
  
  public static void OooO00o(Context paramContext)
  {
    OooO0O0 = paramContext;
  }
  
  public static String getAppKey()
  {
    String str1 = m54207b69.F54207b69_11("*5765B425C551A6161491E515B605E236F88777C87797A9487842E726B5D71367074627638776C807F3D9D857C73878A80A8858D8F87857C785386929457");
    String str2 = m54207b69.F54207b69_11("AT152526203E3741");
    String str3 = "";
    try
    {
      Object localObject1 = OooO0O0;
      localObject1 = ((Context)localObject1).getPackageManager();
      Object localObject2 = OooO0O0;
      localObject2 = ((Context)localObject2).getPackageName();
      int i = 128;
      localObject1 = ((PackageManager)localObject1).getApplicationInfo((String)localObject2, i);
      if (localObject1 != null)
      {
        localObject1 = ((ApplicationInfo)localObject1).metaData;
        localObject2 = "?/7A637E737284856B727F";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        str3 = ((BaseBundle)localObject1).getString((String)localObject2);
        if (str3 == null) {
          CobubLog.OooO0OO(str2, str1);
        }
      }
    }
    catch (Exception localException)
    {
      CobubLog.OooO0OO(str2, str1);
      CobubLog.OooO0O0(str2, localException);
    }
    return str3;
  }
  
  public static String getAppVersion()
  {
    Object localObject1 = "";
    Object localObject2 = OooO00o;
    if (localObject2 != null)
    {
      boolean bool = ((String)localObject2).isEmpty();
      if (!bool) {
        return OooO00o;
      }
    }
    try
    {
      localObject2 = OooO0O0;
      localObject2 = ((Context)localObject2).getPackageManager();
      localObject3 = OooO0O0;
      localObject3 = ((Context)localObject3).getPackageName();
      localObject2 = ((PackageManager)localObject2).getPackageInfo((String)localObject3, 0);
      localObject2 = ((PackageInfo)localObject2).versionName;
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    catch (Exception localException)
    {
      Object localObject3 = m54207b69.F54207b69_11("AT152526203E3741");
      String str = localException.toString();
      CobubLog.OooO0OO((String)localObject3, str);
    }
    return localObject1;
  }
  
  public static void setAppVersion(String paramString)
  {
    OooO00o = paramString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.AppInfo
 * JD-Core Version:    0.7.0.1
 */