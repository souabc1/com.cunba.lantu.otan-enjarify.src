package com.qinggan.os;

import m54207b69;

public class BackLightNative
{
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static int getBackLight()
  {
    int i = native_get_backlight();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("j05756466657475B5C666C4E5C5062181F62536B6A6C59746C5B5C2A282C");
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    return i;
  }
  
  public static int getBackLight(int paramInt)
  {
    return native_get_backlight_for_screen(paramInt);
  }
  
  public static String getBackLightVersion()
  {
    return native_get_backlight_ver();
  }
  
  public static int getKeypadBacklight()
  {
    return native_get_key_backlight();
  }
  
  public static int getMode(int paramInt)
  {
    paramInt = native_get_mode(paramInt);
    int i = 1;
    if (paramInt == i) {
      return 0;
    }
    return i;
  }
  
  public static int getScreenState()
  {
    int i = native_get_screen_state();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("cD2322321A2B3B272832203A303C2E8C734741374335798F7B");
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    if (i == 0) {
      return 1;
    }
    return 0;
  }
  
  public static int getScreenState(int paramInt)
  {
    paramInt = native_get_screen_state_for_screen(paramInt);
    if (paramInt == 0) {
      return 1;
    }
    return 0;
  }
  
  public static boolean isKeypadBackLightEnabled()
  {
    int i = native_get_key_state();
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static native int native_backlight_set_stm8(int paramInt);
  
  public static native int native_get_backlight();
  
  public static native int native_get_backlight_for_screen(int paramInt);
  
  public static native String native_get_backlight_ver();
  
  public static native int native_get_key_backlight();
  
  public static native int native_get_key_state();
  
  public static native int native_get_mode(int paramInt);
  
  public static native int native_get_screen_state();
  
  public static native int native_get_screen_state_for_screen(int paramInt);
  
  public static native int native_set_backlight(int paramInt);
  
  public static native int native_set_backlight_for_screen(int paramInt1, int paramInt2);
  
  public static native int native_set_keypad_backlight(int paramInt);
  
  public static native int native_set_mode(int paramInt1, int paramInt2);
  
  public static native int native_slidebar_set_state(int paramInt);
  
  public static void setBackLight(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = 255;
      if (paramInt <= i)
      {
        native_set_backlight(paramInt);
        return;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11(">g0E0A13090F13094E0D1E180B1B2017112425");
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public static void setBackLight(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      int i = 255;
      if (paramInt1 <= i)
      {
        native_set_backlight_for_screen(paramInt1, paramInt2);
        if (paramInt2 == 0) {
          native_backlight_set_stm8(paramInt1);
        }
        return;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11(">g0E0A13090F13094E0D1E180B1B2017112425");
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public static void setKeypadBackLight(int paramInt)
  {
    native_set_keypad_backlight(paramInt);
  }
  
  public static void setMode(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    native_set_mode(paramInt1, paramInt2);
  }
  
  public static void setSlidebarState(int paramInt)
  {
    native_slidebar_set_state(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.BackLightNative
 * JD-Core Version:    0.7.0.1
 */