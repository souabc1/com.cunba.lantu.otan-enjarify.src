package com.qinggan.os;

import android.os.BaseBundle;
import android.os.Bundle;
import m54207b69;

public class BundleFormat
{
  public static Bundle OooO00o(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null)
    {
      i = paramArrayOfInt.length;
      if (i > 0)
      {
        localBundle = new android/os/Bundle;
        localBundle.<init>();
        String str = m54207b69.F54207b69_11("={3D150B191E14");
        byte b = 3;
        localBundle.putByte(str, b);
        str = m54207b69.F54207b69_11("9~17110C2827");
        localBundle.putIntArray(str, paramArrayOfInt);
        return localBundle;
      }
    }
    int i = 0;
    Bundle localBundle = null;
    return localBundle;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.BundleFormat
 * JD-Core Version:    0.7.0.1
 */