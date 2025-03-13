package com.hjq.permissions;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import m54207b69;

final class NotificationPermissionCompat
{
  public static Intent OooO00o(Context paramContext)
  {
    boolean bool1 = AndroidVersion.isAndroid8();
    Object localObject = m54207b69.F54207b69_11("=y18181F0E1A15235E122517181C242C1967493B3C3A4C4C4448584A55544A4E5557474C5F5152565E6653");
    Intent localIntent;
    String str;
    if (bool1)
    {
      localIntent = new android/content/Intent;
      localIntent.<init>((String)localObject);
      localObject = m54207b69.F54207b69_11("7-4C444B6246494F0A65684C665056566E1359676C7361198395968C98888B848B8A89");
      str = paramContext.getPackageName();
      localIntent.putExtra((String)localObject, str);
    }
    else
    {
      bool1 = AndroidVersion.isAndroid5();
      if (bool1)
      {
        localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.setAction((String)localObject);
        localObject = paramContext.getPackageName();
        str = m54207b69.F54207b69_11("9c0214153F1707060F0A0D10");
        localIntent.putExtra(str, (String)localObject);
        localObject = paramContext.getApplicationInfo();
        int i = ((ApplicationInfo)localObject).uid;
        str = m54207b69.F54207b69_11("gr130304300B201C");
        localIntent.putExtra(str, i);
      }
      else
      {
        bool1 = false;
        localIntent = null;
      }
    }
    boolean bool2 = PermissionUtils.OooO00o(paramContext, localIntent);
    if (!bool2) {
      localIntent = PermissionIntentManager.OooO00o(paramContext);
    }
    return localIntent;
  }
  
  public static boolean OooO0O0(Context paramContext)
  {
    boolean bool = AndroidVersion.isAndroid7();
    if (bool) {
      return ((NotificationManager)paramContext.getSystemService(NotificationManager.class)).areNotificationsEnabled();
    }
    bool = AndroidVersion.isAndroid4_4();
    if (bool)
    {
      String str = m54207b69.F54207b69_11("?D0B151D170F1C162212141A180E1A1514201E1D1D");
      return PermissionUtils.OooO0Oo(paramContext, str, 11);
    }
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.NotificationPermissionCompat
 * JD-Core Version:    0.7.0.1
 */