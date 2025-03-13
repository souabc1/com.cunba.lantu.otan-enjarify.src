package com.sun.jna;

public class LastErrorException
  extends RuntimeException
{
  public int o00OoOoo;
  
  public int getErrorCode()
  {
    return this.o00OoOoo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.LastErrorException
 * JD-Core Version:    0.7.0.1
 */