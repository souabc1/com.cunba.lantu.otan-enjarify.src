package com.qinggan.os;

public class BTSSEManager
{
  public static BTSSEManager OooO0O0;
  public boolean OooO00o = false;
  
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static BTSSEManager getInstance()
  {
    BTSSEManager localBTSSEManager = OooO0O0;
    if (localBTSSEManager == null)
    {
      localBTSSEManager = new com/qinggan/os/BTSSEManager;
      localBTSSEManager.<init>();
      OooO0O0 = localBTSSEManager;
    }
    return OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.BTSSEManager
 * JD-Core Version:    0.7.0.1
 */