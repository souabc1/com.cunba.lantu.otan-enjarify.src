package com.qinggan.media;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import m54207b69;

final class DiskLruCache$Entry
{
  public DiskLruCache.Editor OooO00o;
  public final String OooO0O0;
  public final long[] OooO0OO;
  public boolean OooO0Oo;
  public long OooO0o0;
  
  public DiskLruCache$Entry(DiskLruCache paramDiskLruCache, String paramString)
  {
    this.OooO0O0 = paramString;
    paramDiskLruCache = new long[DiskLruCache.OooOO0(paramDiskLruCache)];
    this.OooO0OO = paramDiskLruCache;
  }
  
  private void setLengths(String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    Object localObject = this.OooO0o;
    int j = DiskLruCache.OooOO0((DiskLruCache)localObject);
    if (i == j)
    {
      i = 0;
      try
      {
        for (;;)
        {
          j = paramArrayOfString.length;
          if (i >= j) {
            break;
          }
          localObject = this.OooO0OO;
          String str = paramArrayOfString[i];
          long l = Long.parseLong(str);
          localObject[i] = l;
          i += 1;
        }
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw OooO(paramArrayOfString);
      }
    }
    throw OooO(paramArrayOfString);
  }
  
  public final IOException OooO(String[] paramArrayOfString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("vs061E180E071B160E1E205D2428130F2C223065322E322C606B");
    ((StringBuilder)localObject).append(str);
    paramArrayOfString = Arrays.toString(paramArrayOfString);
    ((StringBuilder)localObject).append(paramArrayOfString);
    paramArrayOfString = new java/io/IOException;
    localObject = ((StringBuilder)localObject).toString();
    paramArrayOfString.<init>((String)localObject);
    throw paramArrayOfString;
  }
  
  public File getCleanFile(int paramInt)
  {
    File localFile1 = DiskLruCache.OooOO0O(this.OooO0o);
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = this.OooO0O0;
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(".");
    ((StringBuilder)localObject).append(paramInt);
    File localFile2 = new java/io/File;
    localObject = ((StringBuilder)localObject).toString();
    localFile2.<init>(localFile1, (String)localObject);
    return localFile2;
  }
  
  public File getDirtyFile(int paramInt)
  {
    File localFile = DiskLruCache.OooOO0O(this.OooO0o);
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str = this.OooO0O0;
    ((StringBuilder)localObject1).append(str);
    ((StringBuilder)localObject1).append(".");
    ((StringBuilder)localObject1).append(paramInt);
    Object localObject2 = m54207b69.F54207b69_11("4&08534D59");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = new java/io/File;
    localObject1 = ((StringBuilder)localObject1).toString();
    ((File)localObject2).<init>(localFile, (String)localObject1);
    return localObject2;
  }
  
  public String getLengths()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    long[] arrayOfLong = this.OooO0OO;
    int i = arrayOfLong.length;
    int j = 0;
    while (j < i)
    {
      long l = arrayOfLong[j];
      char c = ' ';
      localStringBuilder.append(c);
      localStringBuilder.append(l);
      j += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.media.DiskLruCache.Entry
 * JD-Core Version:    0.7.0.1
 */