package com.hjq.permissions;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PermissionInfo;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import m54207b69;

final class GetInstalledAppsPermissionCompat
{
  public static Intent OooO00o(Context paramContext)
  {
    boolean bool = PhoneRomUtils.isMiui();
    if (bool)
    {
      bool = PhoneRomUtils.isMiuiOptimization();
      Intent localIntent;
      if (bool)
      {
        localIntent = PermissionIntentManager.OooO0o0(paramContext);
      }
      else
      {
        bool = false;
        localIntent = null;
      }
      paramContext = PermissionIntentManager.OooO00o(paramContext);
      return StartActivityManager.OooO00o(localIntent, paramContext);
    }
    return PermissionIntentManager.OooO00o(paramContext);
  }
  
  public static boolean OooO0O0(Activity paramActivity)
  {
    boolean bool1 = AndroidVersion.isAndroid4_4();
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    bool1 = AndroidVersion.isAndroid6();
    boolean bool3 = true;
    if (bool1)
    {
      bool1 = OooO0Oo(paramActivity);
      if (bool1)
      {
        String str = m54207b69.F54207b69_11("4L2F24236531272E452B2E326D48364C30355051383737782221312D201E3C362C20212B2B3732424347");
        boolean bool4 = PermissionUtils.OooO0o0(paramActivity, str);
        if (!bool4)
        {
          boolean bool5 = PermissionUtils.OooOo00(paramActivity, str);
          if (!bool5) {
            bool2 = bool3;
          }
        }
        return bool2;
      }
    }
    bool1 = PhoneRomUtils.isMiui();
    if (bool1)
    {
      bool1 = isMiuiSupportGetInstalledAppsPermission();
      if (bool1)
      {
        bool1 = PhoneRomUtils.isMiuiOptimization();
        if (!bool1) {
          return false;
        }
        return OooO0OO(paramActivity) ^ bool3;
      }
    }
    return false;
  }
  
  public static boolean OooO0OO(Context paramContext)
  {
    boolean bool1 = AndroidVersion.isAndroid4_4();
    boolean bool2 = true;
    if (!bool1) {
      return bool2;
    }
    bool1 = AndroidVersion.isAndroid6();
    String str;
    if (bool1)
    {
      bool1 = OooO0Oo(paramContext);
      if (bool1)
      {
        str = m54207b69.F54207b69_11("4L2F24236531272E452B2E326D48364C30355051383737782221312D201E3C362C20212B2B3732424347");
        return PermissionUtils.OooO0o0(paramContext, str);
      }
    }
    bool1 = PhoneRomUtils.isMiui();
    if (bool1)
    {
      bool1 = isMiuiSupportGetInstalledAppsPermission();
      if (bool1)
      {
        bool1 = PhoneRomUtils.isMiuiOptimization();
        if (!bool1) {
          return bool2;
        }
        str = m54207b69.F54207b69_11(">W18080A1316080E25210D0D21272820221827191A18");
        return PermissionUtils.OooO0Oo(paramContext, str, 10022);
      }
    }
    return bool2;
  }
  
  public static boolean OooO0Oo(Context paramContext)
  {
    boolean bool1 = false;
    int i = 1;
    try
    {
      Object localObject = paramContext.getPackageManager();
      String str2 = "4L2F24236531272E452B2E326D48364C30355051383737782221312D201E3C362C20212B2B3732424347";
      str2 = m54207b69.F54207b69_11(str2);
      localObject = ((PackageManager)localObject).getPermissionInfo(str2, 0);
      if (localObject != null)
      {
        boolean bool2 = AndroidVersion.isAndroid9();
        if (bool2)
        {
          j = ((PermissionInfo)localObject).getProtection();
          if (j == i) {
            bool1 = i;
          }
          return bool1;
        }
        j = ((PermissionInfo)localObject).protectionLevel & 0xF;
        if (j == i) {
          bool1 = i;
        }
        return bool1;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      int j;
      localNameNotFoundException.printStackTrace();
      try
      {
        paramContext = paramContext.getContentResolver();
        String str1 = ":x171E172A151B1113211D1E2828342717181C391D212B22282D364123392733302B2C333A3A4C433D41433E48";
        str1 = m54207b69.F54207b69_11(str1);
        j = Settings.Secure.getInt(paramContext, str1);
        if (j == i) {
          bool1 = i;
        }
        return bool1;
      }
      catch (Settings.SettingNotFoundException localSettingNotFoundException)
      {
        localSettingNotFoundException;
      }
    }
    return false;
  }
  
  private static boolean isMiuiSupportGetInstalledAppsPermission()
  {
    boolean bool1 = AndroidVersion.isAndroid4_4();
    boolean bool2 = true;
    if (!bool1) {
      return bool2;
    }
    Object localObject = AppOpsManager.class;
    try
    {
      localObject = ((Class)localObject).getName();
      localObject = Class.forName((String)localObject);
      String str = ">W18080A1316080E25210D0D21272820221827191A18";
      str = m54207b69.F54207b69_11(str);
      ((Class)localObject).getDeclaredField(str);
      return bool2;
    }
    catch (NoSuchFieldException localNoSuchFieldException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    localClassNotFoundException.printStackTrace();
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.GetInstalledAppsPermissionCompat
 * JD-Core Version:    0.7.0.1
 */