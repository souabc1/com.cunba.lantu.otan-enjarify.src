package com.jakewharton.disklrucache;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import m54207b69;

final class DiskLruCache$Entry
{
  public final String OooO00o;
  public final long[] OooO0O0;
  public boolean OooO0OO;
  public DiskLruCache.Editor OooO0Oo;
  public long OooO0o0;
  
  public DiskLruCache$Entry(DiskLruCache paramDiskLruCache, String paramString)
  {
    this.OooO00o = paramString;
    paramDiskLruCache = new long[DiskLruCache.OooO0o0(paramDiskLruCache)];
    this.OooO0O0 = paramDiskLruCache;
  }
  
  private void setLengths(String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    Object localObject = this.OooO0o;
    int j = DiskLruCache.OooO0o0((DiskLruCache)localObject);
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
          localObject = this.OooO0O0;
          String str = paramArrayOfString[i];
          long l = Long.parseLong(str);
          localObject[i] = l;
          i += 1;
        }
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw OooOO0(paramArrayOfString);
      }
    }
    throw OooOO0(paramArrayOfString);
  }
  
  public final IOException OooOO0(String[] paramArrayOfString)
  {
    IOException localIOException = new java/io/IOException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("vs061E180E071B160E1E205D2428130F2C223065322E322C606B");
    localStringBuilder.append(str);
    paramArrayOfString = Arrays.toString(paramArrayOfString);
    localStringBuilder.append(paramArrayOfString);
    paramArrayOfString = localStringBuilder.toString();
    localIOException.<init>(paramArrayOfString);
    throw localIOException;
  }
  
  public File getCleanFile(int paramInt)
  {
    File localFile1 = new java/io/File;
    File localFile2 = DiskLruCache.OooO0oO(this.OooO0o);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = this.OooO00o;
    localStringBuilder.append(str1);
    localStringBuilder.append(".");
    localStringBuilder.append(paramInt);
    String str2 = localStringBuilder.toString();
    localFile1.<init>(localFile2, str2);
    return localFile1;
  }
  
  public File getDirtyFile(int paramInt)
  {
    File localFile1 = new java/io/File;
    File localFile2 = DiskLruCache.OooO0oO(this.OooO0o);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = this.OooO00o;
    localStringBuilder.append(str1);
    localStringBuilder.append(".");
    localStringBuilder.append(paramInt);
    String str2 = m54207b69.F54207b69_11("4&08534D59");
    localStringBuilder.append(str2);
    str2 = localStringBuilder.toString();
    localFile1.<init>(localFile2, str2);
    return localFile1;
  }
  
  public String getLengths()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    long[] arrayOfLong = this.OooO0O0;
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
 * Qualified Name:     com.jakewharton.disklrucache.DiskLruCache.Entry
 * JD-Core Version:    0.7.0.1
 */