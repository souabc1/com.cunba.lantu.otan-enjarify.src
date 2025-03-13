package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;
import m54207b69;

public class ManufacturerUtils
{
  private static final String LGE = "lge";
  private static final String MEIZU = "meizu";
  private static final String SAMSUNG = "samsung";
  
  public static boolean isDateInputKeyboardMissingSeparatorCharacters()
  {
    boolean bool = isLGEDevice();
    if (!bool)
    {
      bool = isSamsungDevice();
      if (!bool) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public static boolean isLGEDevice()
  {
    String str = Build.MANUFACTURER;
    Locale localLocale = Locale.ENGLISH;
    return str.toLowerCase(localLocale).equals("lge");
  }
  
  public static boolean isMeizuDevice()
  {
    String str = Build.MANUFACTURER;
    Object localObject = Locale.ENGLISH;
    str = str.toLowerCase((Locale)localObject);
    localObject = m54207b69.F54207b69_11("T@2D262B3D39");
    return str.equals(localObject);
  }
  
  public static boolean isSamsungDevice()
  {
    String str = Build.MANUFACTURER;
    Object localObject = Locale.ENGLISH;
    str = str.toLowerCase((Locale)localObject);
    localObject = m54207b69.F54207b69_11("j)5A49465D604C54");
    return str.equals(localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ManufacturerUtils
 * JD-Core Version:    0.7.0.1
 */