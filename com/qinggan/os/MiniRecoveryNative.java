package com.qinggan.os;

public class MiniRecoveryNative
{
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static native int getBootSystem();
  
  public static native int getNextBootSystem();
  
  public static native int getOtaInstallPercent();
  
  public static native int getSystemType();
  
  public static native String getSystemVersion(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.MiniRecoveryNative
 * JD-Core Version:    0.7.0.1
 */