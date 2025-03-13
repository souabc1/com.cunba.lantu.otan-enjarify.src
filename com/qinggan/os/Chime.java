package com.qinggan.os;

public class Chime
{
  public static Chime OooO00o;
  
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static Chime getInstance()
  {
    Chime localChime = OooO00o;
    if (localChime == null)
    {
      localChime = new com/qinggan/os/Chime;
      localChime.<init>();
      OooO00o = localChime;
    }
    return OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.Chime
 * JD-Core Version:    0.7.0.1
 */