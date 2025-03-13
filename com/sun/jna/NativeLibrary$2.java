package com.sun.jna;

import java.io.File;
import java.io.FilenameFilter;

final class NativeLibrary$2
  implements FilenameFilter
{
  public NativeLibrary$2(String paramString) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    paramFile = new java/lang/StringBuilder;
    paramFile.<init>();
    String str1 = "lib";
    paramFile.append(str1);
    String str2 = this.OooO00o;
    paramFile.append(str2);
    str2 = ".so";
    paramFile.append(str2);
    paramFile = paramFile.toString();
    boolean bool = paramString.startsWith(paramFile);
    if (!bool)
    {
      paramFile = new java/lang/StringBuilder;
      paramFile.<init>();
      String str3 = this.OooO00o;
      paramFile.append(str3);
      paramFile.append(str2);
      paramFile = paramFile.toString();
      bool = paramString.startsWith(paramFile);
      if (bool)
      {
        paramFile = this.OooO00o;
        bool = paramFile.startsWith(str1);
        if (!bool) {}
      }
    }
    else
    {
      bool = NativeLibrary.OooO00o(paramString);
      if (bool)
      {
        bool = true;
        break label142;
      }
    }
    bool = false;
    paramFile = null;
    label142:
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.NativeLibrary.2
 * JD-Core Version:    0.7.0.1
 */