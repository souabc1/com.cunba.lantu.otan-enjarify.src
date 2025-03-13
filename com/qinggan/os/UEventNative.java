package com.qinggan.os;

public class UEventNative
{
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static native int native_setup(int paramInt);
  
  public static native int next_event(int[] paramArrayOfInt, int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.UEventNative
 * JD-Core Version:    0.7.0.1
 */