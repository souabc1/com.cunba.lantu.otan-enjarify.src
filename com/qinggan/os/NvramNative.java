package com.qinggan.os;

public class NvramNative
{
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static native String native_nvramread(int paramInt);
  
  public static native String native_nvramread64(int paramInt);
  
  public static native int native_nvramwrite(String paramString, int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.NvramNative
 * JD-Core Version:    0.7.0.1
 */