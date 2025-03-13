package com.hjq.permissions;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;

final class AndroidVersion
{
  public static int OooO00o(Context paramContext)
  {
    return paramContext.getApplicationInfo().targetSdkVersion;
  }
  
  public static int getAndroidVersionCode()
  {
    return Build.VERSION.SDK_INT;
  }
  
  public static boolean isAndroid10()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static boolean isAndroid11()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static boolean isAndroid12()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    if (i >= j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static boolean isAndroid13()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static boolean isAndroid14()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 34;
    if (i >= j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static boolean isAndroid4()
  {
    return true;
  }
  
  public static boolean isAndroid4_2()
  {
    return true;
  }
  
  public static boolean isAndroid4_3()
  {
    return true;
  }
  
  public static boolean isAndroid4_4()
  {
    return true;
  }
  
  public static boolean isAndroid5()
  {
    return true;
  }
  
  public static boolean isAndroid5_1()
  {
    return true;
  }
  
  public static boolean isAndroid6()
  {
    return true;
  }
  
  public static boolean isAndroid7()
  {
    return true;
  }
  
  public static boolean isAndroid7_1()
  {
    return true;
  }
  
  public static boolean isAndroid8()
  {
    return true;
  }
  
  public static boolean isAndroid9()
  {
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.AndroidVersion
 * JD-Core Version:    0.7.0.1
 */