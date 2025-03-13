package com.qinggan.provider;

import android.net.Uri;
import android.os.Environment;
import java.io.File;
import m54207b69;

public final class QGMediaStore
{
  public static final String OooO00o;
  
  static
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = Environment.getExternalStorageDirectory().getPath();
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("_{54110E19120D181F2023135F");
    localStringBuilder.append(str);
    OooO00o = localStringBuilder.toString();
  }
  
  public static Uri getMediaScannerUri()
  {
    return Uri.parse(m54207b69.F54207b69_11("@}1E13150C1C180F4E5A5B1A2325212A612323252B66252E302C353C293A3931323830"));
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.provider.QGMediaStore
 * JD-Core Version:    0.7.0.1
 */