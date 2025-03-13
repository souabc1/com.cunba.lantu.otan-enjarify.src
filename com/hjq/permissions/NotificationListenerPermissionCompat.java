package com.hjq.permissions;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import m54207b69;

final class NotificationListenerPermissionCompat
{
  public static Intent OooO00o(Context paramContext)
  {
    boolean bool1 = AndroidVersion.isAndroid11();
    Object localObject1 = null;
    Object localObject2;
    if (bool1)
    {
      localObject2 = PermissionUtils.OooOO0(paramContext);
      Object localObject4;
      if (localObject2 != null)
      {
        localObject2 = ((AndroidManifestInfo)localObject2).OooO0o.iterator();
        bool2 = false;
        localObject3 = null;
        for (;;)
        {
          boolean bool3 = ((Iterator)localObject2).hasNext();
          if (!bool3) {
            break label111;
          }
          localObject4 = (AndroidManifestInfo.ServiceInfo)((Iterator)localObject2).next();
          String str1 = ((AndroidManifestInfo.ServiceInfo)localObject4).OooO0O0;
          String str2 = m54207b69.F54207b69_11("pf070904170D14084F1E0C1E161B22231E19195A37433D385040424C4A3C4C434652504B4B5D4F555C5A4C524E606663526461615857");
          boolean bool4 = TextUtils.equals(str1, str2);
          if (bool4)
          {
            if (localObject3 != null) {
              break;
            }
            localObject3 = localObject4;
          }
        }
      }
      boolean bool2 = false;
      Object localObject3 = null;
      label111:
      if (localObject3 != null)
      {
        localObject2 = new android/content/Intent;
        localObject4 = m54207b69.F54207b69_11("$W363A35283C4339802C3B2D2E4A463E33892A2A163226342B2E1C38333525393D2424343C362A2E3A3A2C4049473532413334504C4439");
        ((Intent)localObject2).<init>((String)localObject4);
        localObject4 = new android/content/ComponentName;
        localObject3 = ((AndroidManifestInfo.ServiceInfo)localObject3).OooO00o;
        ((ComponentName)localObject4).<init>(paramContext, (String)localObject3);
        localObject3 = ((ComponentName)localObject4).flattenToString();
        localObject4 = m54207b69.F54207b69_11("^z1B15200B1918245B12111F171F2B2D17643014211C306A4B4D474D574F56594D535656485A584F55675D6953516663665A66667268635B6B737079");
        ((Intent)localObject2).putExtra((String)localObject4, (String)localObject3);
        bool2 = PermissionUtils.OooO00o(paramContext, (Intent)localObject2);
        if (bool2) {
          localObject1 = localObject2;
        }
      }
    }
    if (localObject1 == null)
    {
      bool1 = AndroidVersion.isAndroid5_1();
      localObject1 = m54207b69.F54207b69_11("8$454B42594F5246115F4A5A5B595751661A7679838180809282848A887E8A8584908E8D8D9F8D939E988A948CA2A8A590A0A19F9D97AC");
      if (bool1)
      {
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>((String)localObject1);
      }
      else
      {
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>((String)localObject1);
      }
      localObject1 = localObject2;
    }
    bool1 = PermissionUtils.OooO00o(paramContext, (Intent)localObject1);
    if (!bool1) {
      localObject1 = PermissionIntentManager.OooO00o(paramContext);
    }
    return localObject1;
  }
  
  public static boolean OooO0O0(Context paramContext)
  {
    boolean bool1 = AndroidVersion.isAndroid4_3();
    boolean bool2 = true;
    if (!bool1) {
      return bool2;
    }
    Object localObject1 = paramContext.getContentResolver();
    String str1 = m54207b69.F54207b69_11("O%404C464A4D45478153535B574F595453615D5C5E8E5E626D6959655B7373");
    localObject1 = Settings.Secure.getString((ContentResolver)localObject1, str1);
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool3) {
      return false;
    }
    str1 = ":";
    localObject1 = ((String)localObject1).split(str1);
    int i = localObject1.length;
    int j = 0;
    while (j < i)
    {
      Object localObject2 = ComponentName.unflattenFromString(localObject1[j]);
      if (localObject2 != null)
      {
        String str2 = ((ComponentName)localObject2).getPackageName();
        String str3 = paramContext.getPackageName();
        boolean bool4 = TextUtils.equals(str2, str3);
        if (bool4)
        {
          localObject2 = ((ComponentName)localObject2).getClassName();
          try
          {
            Class.forName((String)localObject2);
            return bool2;
          }
          catch (ClassNotFoundException localClassNotFoundException)
          {
            localClassNotFoundException.printStackTrace();
          }
        }
      }
      j += 1;
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.NotificationListenerPermissionCompat
 * JD-Core Version:    0.7.0.1
 */