package com.xuexiang.constant;

import com.xuexiang.xutil.app.PathUtils;
import java.io.File;
import m54207b69;

public final class PathConstants
{
  public static final String OooO00o;
  public static final String OooO0O0;
  public static final String OooO0OO;
  public static final String OooO0Oo;
  public static final String OooO0o = PathUtils.getExtDCIMPath();
  public static final String OooO0o0;
  
  static
  {
    String str = PathUtils.getExtStoragePath();
    OooO00o = str;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(str);
    str = File.separator;
    localStringBuilder.append(str);
    str = localStringBuilder.toString();
    OooO0O0 = str;
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("jY18383F2E3A3543");
    localStringBuilder.append(str);
    OooO0OO = localStringBuilder.toString();
    OooO0Oo = PathUtils.getExtDownloadsPath();
    OooO0o0 = PathUtils.getExtPicturesPath();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.constant.PathConstants
 * JD-Core Version:    0.7.0.1
 */