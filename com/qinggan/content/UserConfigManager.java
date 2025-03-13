package com.qinggan.content;

import com.qinggan.os.FileUtils;
import com.qinggan.os.FileUtils.FileStatus;
import java.io.File;
import java.util.HashMap;
import m54207b69;

public class UserConfigManager
{
  public static final HashMap OooO0Oo;
  public File OooO00o;
  public String OooO0O0;
  public final Object OooO0OO;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    OooO0Oo = localHashMap;
  }
  
  public static boolean OooO0O0(String paramString, FileUtils.FileStatus paramFileStatus)
  {
    paramFileStatus = new java/lang/StringBuilder;
    paramFileStatus.<init>();
    Object localObject = m54207b69.F54207b69_11("UV31342413433F390C2A402C2E31873446324F7E");
    paramFileStatus.append((String)localObject);
    paramFileStatus.append(paramString);
    paramFileStatus = null;
    if (paramString != null)
    {
      localObject = new java/io/File;
      ((File)localObject).<init>(paramString);
      boolean bool = ((File)localObject).exists();
      if (bool) {
        return true;
      }
    }
    return false;
  }
  
  public static void OooO0OO(String paramString, int paramInt1, int paramInt2)
  {
    paramInt2 |= 0x1B0;
    int i = paramInt1 & 0x1;
    if (i != 0) {
      paramInt2 |= 0x4;
    }
    i = paramInt1 & 0x2;
    if (i != 0) {
      paramInt2 |= 0x2;
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("7f20100C064A");
    localStringBuilder.append(str1);
    localStringBuilder.append(paramString);
    str1 = m54207b69.F54207b69_11("ZK716C282733337C823B");
    localStringBuilder.append(str1);
    String str2 = Integer.toHexString(paramInt1);
    localStringBuilder.append(str2);
    str2 = m54207b69.F54207b69_11("]T787526342A3E2D706C35");
    localStringBuilder.append(str2);
    str2 = Integer.toHexString(paramInt2);
    localStringBuilder.append(str2);
    paramInt2 = -1;
    FileUtils.setPermissions(paramString, 511, paramInt2, paramInt2);
  }
  
  private File getConfigDir()
  {
    synchronized (this.OooO0OO)
    {
      File localFile = this.OooO00o;
      if (localFile == null)
      {
        localFile = new java/io/File;
        String str = this.OooO0O0;
        localFile.<init>(str);
        this.OooO00o = localFile;
      }
      localFile = this.OooO00o;
      return localFile;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.content.UserConfigManager
 * JD-Core Version:    0.7.0.1
 */