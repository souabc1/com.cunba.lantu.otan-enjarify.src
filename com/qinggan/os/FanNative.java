package com.qinggan.os;

public class FanNative
{
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static native int native_set_fan(int paramInt);
  
  public static void setFan(int paramInt)
  {
    native_set_fan(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.FanNative
 * JD-Core Version:    0.7.0.1
 */