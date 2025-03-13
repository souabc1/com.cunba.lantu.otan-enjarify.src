package com.hjq.permissions;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import m54207b69;

final class PermissionIntentManager
{
  public static Intent OooO(Context paramContext)
  {
    Object localObject = paramContext.getPackageManager();
    String str = m54207b69.F54207b69_11("F`03100F5113151616561C0B1111");
    localObject = ((PackageManager)localObject).getLaunchIntentForPackage(str);
    boolean bool1 = PermissionUtils.OooO00o(paramContext, (Intent)localObject);
    if (bool1) {
      return localObject;
    }
    localObject = paramContext.getPackageManager();
    str = m54207b69.F54207b69_11("SK282528682C292D2B416E4235393B363D3550404C");
    localObject = ((PackageManager)localObject).getLaunchIntentForPackage(str);
    bool1 = PermissionUtils.OooO00o(paramContext, (Intent)localObject);
    if (bool1) {
      return localObject;
    }
    localObject = paramContext.getPackageManager();
    str = m54207b69.F54207b69_11("q]3E3332763632372F367C384747454C47433A4A42");
    localObject = ((PackageManager)localObject).getLaunchIntentForPackage(str);
    boolean bool2 = PermissionUtils.OooO00o(paramContext, (Intent)localObject);
    if (bool2) {
      return localObject;
    }
    return null;
  }
  
  public static Intent OooO00o(Context paramContext)
  {
    Intent localIntent = new android/content/Intent;
    Object localObject = m54207b69.F54207b69_11("@;5A56614C5857651C5067595A5E626A57258B7D7E8B878E91878B8E90809C9C8E9A93998B888DA496979B9FA794");
    localIntent.<init>((String)localObject);
    localObject = PermissionUtils.OooOO0O(paramContext);
    localIntent.setData((Uri)localObject);
    boolean bool1 = PermissionUtils.OooO00o(paramContext, localIntent);
    if (bool1) {
      return localIntent;
    }
    localIntent = new android/content/Intent;
    localObject = m54207b69.F54207b69_11("q`010F0615130E0A551B0E1E1F151B15225E324243403E39384C4249495B504353544A504A57");
    localIntent.<init>((String)localObject);
    bool1 = PermissionUtils.OooO00o(paramContext, localIntent);
    if (bool1) {
      return localIntent;
    }
    localIntent = new android/content/Intent;
    localObject = m54207b69.F54207b69_11("9y18181F0E1A15235E122517181C242C1967454A4A4C53523D504243504C57564C5057594D4A4F62545559616956");
    localIntent.<init>((String)localObject);
    boolean bool2 = PermissionUtils.OooO00o(paramContext, localIntent);
    if (bool2) {
      return localIntent;
    }
    return getAndroidSettingAppIntent();
  }
  
  public static Intent OooO0O0(Context paramContext)
  {
    Intent localIntent = new android/content/Intent;
    Object localObject = m54207b69.F54207b69_11("8@23302F7133353636763C2B31317B3E34423E3B46473E454586293F4D49465152495050375355274A5C5260546066");
    localIntent.<init>((String)localObject);
    localObject = OooO(paramContext);
    boolean bool1 = PermissionUtils.OooO00o(paramContext, localIntent);
    if (!bool1) {
      localIntent = null;
    }
    boolean bool2 = PermissionUtils.OooO00o(paramContext, (Intent)localObject);
    if (bool2) {
      localIntent = StartActivityManager.OooO00o(localIntent, (Intent)localObject);
    }
    return localIntent;
  }
  
  public static Intent OooO0OO(Context paramContext)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject1 = m54207b69.F54207b69_11("&g04090C4C13170C170A17531F2A2121111A1B181C1A15182C611F1D1E2D2B202F2A292B31372D3B704E2C2D5C3A2F3E59383A40463C4A5C3B4B474B494F5B");
    Object localObject2 = m54207b69.F54207b69_11("05565B5A1E61455A495865255158534F5F6869666E6867665E");
    localIntent.setClassName((String)localObject2, (String)localObject1);
    localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>();
    String str = m54207b69.F54207b69_11("ck0805084807231023160B4F10102C101C12191C3216191B1D221E24272A36633D22664727432733293033492D30325439353B3E39423A556140583C583E5C50");
    ((Intent)localObject1).setClassName((String)localObject2, str);
    localObject2 = OooO0Oo(paramContext);
    str = PhoneRomUtils.getRomVersionName();
    if (str == null) {
      str = "";
    }
    boolean bool1 = str.startsWith("3.0");
    if (bool1)
    {
      bool1 = PermissionUtils.OooO00o(paramContext, (Intent)localObject1);
      if (!bool1) {
        localObject1 = null;
      }
      bool1 = PermissionUtils.OooO00o(paramContext, localIntent);
      if (bool1) {
        localObject1 = StartActivityManager.OooO00o((Intent)localObject1, localIntent);
      }
    }
    else
    {
      bool1 = PermissionUtils.OooO00o(paramContext, localIntent);
      if (!bool1) {
        localIntent = null;
      }
      bool1 = PermissionUtils.OooO00o(paramContext, (Intent)localObject1);
      if (bool1) {
        localObject1 = StartActivityManager.OooO00o(localIntent, (Intent)localObject1);
      } else {
        localObject1 = localIntent;
      }
    }
    boolean bool2 = PermissionUtils.OooO00o(paramContext, (Intent)localObject2);
    if (bool2) {
      localObject1 = StartActivityManager.OooO00o((Intent)localObject1, (Intent)localObject2);
    }
    return localObject1;
  }
  
  public static Intent OooO0Oo(Context paramContext)
  {
    Object localObject = paramContext.getPackageManager();
    String str = m54207b69.F54207b69_11("05565B5A1E61455A495865255158534F5F6869666E6867665E");
    localObject = ((PackageManager)localObject).getLaunchIntentForPackage(str);
    boolean bool = PermissionUtils.OooO00o(paramContext, (Intent)localObject);
    if (bool) {
      return localObject;
    }
    return null;
  }
  
  public static Intent OooO0o(Context paramContext)
  {
    return OooO0o0(paramContext);
  }
  
  public static Intent OooO0o0(Context paramContext)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject = m54207b69.F54207b69_11("eR3F3C293E8040422D3F4530873F3E344A4D4D8E26161723192F193928333339253D21");
    localIntent = localIntent.setAction((String)localObject);
    localObject = paramContext.getPackageName();
    String str = m54207b69.F54207b69_11("2I2C323F3E2C1B3F293630322F38");
    localIntent = localIntent.putExtra(str, (String)localObject);
    localObject = OooOO0o(paramContext);
    boolean bool1 = PermissionUtils.OooO00o(paramContext, localIntent);
    if (!bool1) {
      localIntent = null;
    }
    boolean bool2 = PermissionUtils.OooO00o(paramContext, (Intent)localObject);
    if (bool2) {
      localIntent = StartActivityManager.OooO00o(localIntent, (Intent)localObject);
    }
    return localIntent;
  }
  
  public static Intent OooO0oO(Context paramContext)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject = m54207b69.F54207b69_11("cv151A1D5B1B1D180B21281C63112010112F292318");
    String str1 = m54207b69.F54207b69_11(":A222F2E7224342B3A36312F7A3E3143443840384583273A4C4D4149414E821E50512F535529495B4750565C2B4E62566658666A");
    localIntent.setClassName((String)localObject, str1);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    str1 = paramContext.getPackageName();
    String str2 = m54207b69.F54207b69_11(";o1F0F0E07120D10");
    ((BaseBundle)localObject).putString(str2, str1);
    str1 = m54207b69.F54207b69_11("S+1159506263474B53601A624E5069825C695B5E59625A758B62726673");
    localIntent.putExtra(str1, (Bundle)localObject);
    localObject = PermissionUtils.OooOO0O(paramContext);
    localIntent.setData((Uri)localObject);
    boolean bool = PermissionUtils.OooO00o(paramContext, localIntent);
    if (bool) {
      return localIntent;
    }
    return null;
  }
  
  public static Intent OooO0oo(Context paramContext)
  {
    return OooO0oO(paramContext);
  }
  
  public static Intent OooOO0(Context paramContext)
  {
    Intent localIntent = OooOO0O(paramContext);
    boolean bool = PermissionUtils.OooO00o(paramContext, localIntent);
    if (bool) {
      return localIntent;
    }
    return null;
  }
  
  public static Intent OooOO0O(Context paramContext)
  {
    Object localObject = paramContext.getPackageManager();
    String str = m54207b69.F54207b69_11("gp13201F611D062526660C1F1E110F23");
    localObject = ((PackageManager)localObject).getLaunchIntentForPackage(str);
    boolean bool = PermissionUtils.OooO00o(paramContext, (Intent)localObject);
    if (bool) {
      return localObject;
    }
    return null;
  }
  
  public static Intent OooOO0o(Context paramContext)
  {
    Object localObject = paramContext.getPackageManager();
    String str = m54207b69.F54207b69_11("?G24292C6C2E333835713D2C2F3E423C424E35343C47374B");
    localObject = ((PackageManager)localObject).getLaunchIntentForPackage(str);
    boolean bool = PermissionUtils.OooO00o(paramContext, (Intent)localObject);
    if (bool) {
      return localObject;
    }
    return null;
  }
  
  public static Intent getAndroidSettingAppIntent()
  {
    Intent localIntent = new android/content/Intent;
    String str = m54207b69.F54207b69_11("V-4C444B6246494F0A665163645050586D138F7A8C8D79798196");
    localIntent.<init>(str);
    return localIntent;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.PermissionIntentManager
 * JD-Core Version:    0.7.0.1
 */