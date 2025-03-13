package com.sun.jna;

import java.io.File;
import java.io.FilenameFilter;

final class Native$5
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    paramFile = ".x";
    boolean bool = paramString.endsWith(paramFile);
    if (bool)
    {
      paramFile = "jna";
      bool = paramString.startsWith(paramFile);
      if (bool) {
        return true;
      }
    }
    bool = false;
    paramFile = null;
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Native.5
 * JD-Core Version:    0.7.0.1
 */