package com.qinggan.os;

public class ScreenLampNative
{
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static int getSreenLampBrightness()
  {
    return native_get_brightness();
  }
  
  public static int getSreenLampColor()
  {
    return native_get_color();
  }
  
  public static int getSreenLampFre()
  {
    return native_get_frequency();
  }
  
  public static boolean isScreenLamFreOn()
  {
    int i = native_get_frequency_control();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public static boolean isScreenLampOn()
  {
    int i = native_get_control();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public static native int native_get_brightness();
  
  public static native int native_get_color();
  
  public static native int native_get_control();
  
  public static native int native_get_frequency();
  
  public static native int native_get_frequency_control();
  
  public static native int native_set_brightness_and_color(int paramInt1, int paramInt2);
  
  public static native int native_set_frequency(int paramInt);
  
  public static void setSreenLampBrightnessColor(int paramInt1, int paramInt2)
  {
    native_set_brightness_and_color(paramInt1, paramInt2);
  }
  
  public static void setSreenLampFre(int paramInt)
  {
    native_set_frequency(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.ScreenLampNative
 * JD-Core Version:    0.7.0.1
 */