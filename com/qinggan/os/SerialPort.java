package com.qinggan.os;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class SerialPort
{
  public FileInputStream OooO00o;
  public FileOutputStream OooO0O0;
  
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public InputStream getInputStream()
  {
    return this.OooO00o;
  }
  
  public OutputStream getOutputStream()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.SerialPort
 * JD-Core Version:    0.7.0.1
 */