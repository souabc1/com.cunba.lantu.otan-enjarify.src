package com.qinggan.os;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;
import m54207b69;

public class FileUtils
{
  public static final Pattern OooO00o = Pattern.compile(m54207b69.F54207b69_11("g%7E7A5403120E1111208312831A"));
  
  static
  {
    try {}catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static boolean OooO00o(FileOutputStream paramFileOutputStream)
  {
    if (paramFileOutputStream != null) {
      try
      {
        paramFileOutputStream = paramFileOutputStream.getFD();
        paramFileOutputStream.sync();
      }
      catch (IOException localIOException)
      {
        return false;
      }
    }
    return true;
  }
  
  public static native int setPermissions(String paramString, int paramInt1, int paramInt2, int paramInt3);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.FileUtils
 * JD-Core Version:    0.7.0.1
 */