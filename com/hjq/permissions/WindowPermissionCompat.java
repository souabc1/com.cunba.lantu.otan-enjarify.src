package com.hjq.permissions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import m54207b69;

final class WindowPermissionCompat
{
  public static Intent OooO00o(Context paramContext)
  {
    boolean bool1 = AndroidVersion.isAndroid6();
    Intent localIntent;
    if (bool1)
    {
      bool1 = AndroidVersion.isAndroid11();
      if (bool1)
      {
        bool1 = PhoneRomUtils.isMiui();
        if (bool1)
        {
          bool1 = PhoneRomUtils.isMiuiOptimization();
          if (bool1) {
            localIntent = PermissionIntentManager.OooO0o0(paramContext);
          }
        }
      }
    }
    for (;;)
    {
      paramContext = PermissionIntentManager.OooO00o(paramContext);
      return StartActivityManager.OooO00o(localIntent, paramContext);
      localIntent = new android/content/Intent;
      Object localObject = m54207b69.F54207b69_11("R@212F2635332E2A753B2E3E3F353B35427E3235473D444485251A281C23223D2E3626342F253E45372D3B37343F40373E3E");
      localIntent.<init>((String)localObject);
      localObject = PermissionUtils.OooOO0O(paramContext);
      localIntent.setData((Uri)localObject);
      boolean bool2 = PermissionUtils.OooO00o(paramContext, localIntent);
      if (bool2) {
        return localIntent;
      }
      return PermissionIntentManager.OooO00o(paramContext);
      bool1 = PhoneRomUtils.isEmui();
      if (bool1)
      {
        localIntent = PermissionIntentManager.OooO0OO(paramContext);
      }
      else
      {
        bool1 = PhoneRomUtils.isMiui();
        if (bool1)
        {
          bool1 = PhoneRomUtils.isMiuiOptimization();
          if (bool1)
          {
            localIntent = PermissionIntentManager.OooO0o(paramContext);
          }
          else
          {
            bool1 = false;
            localIntent = null;
          }
        }
        else
        {
          bool1 = PhoneRomUtils.isColorOs();
          if (bool1)
          {
            localIntent = PermissionIntentManager.OooO0O0(paramContext);
          }
          else
          {
            bool1 = PhoneRomUtils.isOriginOs();
            if (bool1)
            {
              localIntent = PermissionIntentManager.OooOO0(paramContext);
            }
            else
            {
              bool1 = PhoneRomUtils.isOneUi();
              if (!bool1) {
                break;
              }
              localIntent = PermissionIntentManager.OooO0oo(paramContext);
            }
          }
        }
      }
    }
    return PermissionIntentManager.OooO00o(paramContext);
  }
  
  public static boolean OooO0O0(Context paramContext)
  {
    boolean bool = AndroidVersion.isAndroid6();
    if (bool) {
      return Settings.canDrawOverlays(paramContext);
    }
    bool = AndroidVersion.isAndroid4_4();
    if (bool)
    {
      String str = m54207b69.F54207b69_11("Mi263A383D343F43332C3F323038484B454E3139403A53");
      return PermissionUtils.OooO0Oo(paramContext, str, 24);
    }
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.WindowPermissionCompat
 * JD-Core Version:    0.7.0.1
 */