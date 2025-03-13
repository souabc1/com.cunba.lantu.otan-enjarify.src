package com.qinggan.os;

public class TouchScreenNative
{
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static native int native_set_touchscreen(int paramInt);
  
  public static native int native_set_touchscreen_for_screen(int paramInt1, int paramInt2);
  
  public static void setTouchScreen(int paramInt)
  {
    native_set_touchscreen(paramInt);
  }
  
  public static void setTouchScreen(int paramInt1, int paramInt2)
  {
    native_set_touchscreen_for_screen(paramInt1, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.TouchScreenNative
 * JD-Core Version:    0.7.0.1
 */