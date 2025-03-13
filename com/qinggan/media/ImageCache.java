package com.qinggan.media;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Environment;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import m54207b69;

public class ImageCache
{
  public static final Bitmap.CompressFormat OooO0Oo = Bitmap.CompressFormat.JPEG;
  public ImageCache.ImageCacheParams OooO00o;
  public final Object OooO0O0;
  public DiskLruCache OooO0OO;
  
  public static String OooO0Oo(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfByte.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfByte[i] & 0xFF;
      String str = Integer.toHexString(j);
      int k = str.length();
      int m = 1;
      if (k == m)
      {
        k = 48;
        localStringBuilder.append(k);
      }
      localStringBuilder.append(str);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static int OooO0o(Bitmap paramBitmap)
  {
    boolean bool = Utils.OooO0O0();
    if (bool) {
      return paramBitmap.getByteCount();
    }
    int i = paramBitmap.getRowBytes();
    int j = paramBitmap.getHeight();
    return i * j;
  }
  
  public static String OooO0oO(String paramString)
  {
    Object localObject = "MD5";
    try
    {
      localObject = MessageDigest.getInstance((String)localObject);
      byte[] arrayOfByte = paramString.getBytes();
      ((MessageDigest)localObject).update(arrayOfByte);
      localObject = ((MessageDigest)localObject).digest();
      paramString = OooO0Oo((byte[])localObject);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      int i = paramString.hashCode();
      paramString = String.valueOf(i);
    }
    return paramString;
  }
  
  public static boolean isExternalStorageRemovable()
  {
    boolean bool = Utils.OooO00o();
    if (bool) {
      return Environment.isExternalStorageRemovable();
    }
    return true;
  }
  
  public void OooO0o0()
  {
    synchronized (this.OooO0O0)
    {
      DiskLruCache localDiskLruCache = this.OooO0OO;
      if (localDiskLruCache != null) {
        try
        {
          localDiskLruCache.flush();
        }
        catch (IOException localIOException)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = "4Z3C37312C367F7D81";
          str = m54207b69.F54207b69_11(str);
          localStringBuilder.append(str);
          localStringBuilder.append(localIOException);
        }
      }
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.media.ImageCache
 * JD-Core Version:    0.7.0.1
 */