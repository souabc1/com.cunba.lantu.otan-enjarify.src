package com.lzf.easyfloat.permission.rom;

import android.util.Log;
import m54207b69;

public class MiuiUtils
{
  public static int getMiuiVersion()
  {
    String str1 = RomUtils.OooO0o0(m54207b69.F54207b69_11("[b100E4E120F1C11531F14561F131D1F1A1D1D5E1F17241D"));
    if (str1 != null)
    {
      int i = 1;
      try
      {
        String str2 = str1.substring(i);
        return Integer.parseInt(str2);
      }
      catch (Exception localException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str3 = m54207b69.F54207b69_11("`&414454094F5459560E594D5F615C575716565B55571B596B6C626E25226D617375706B6B2A412C");
        localStringBuilder.append(str3);
        localStringBuilder.append(str1);
        Log.getStackTraceString(localException);
      }
    }
    return -1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.permission.rom.MiuiUtils
 * JD-Core Version:    0.7.0.1
 */