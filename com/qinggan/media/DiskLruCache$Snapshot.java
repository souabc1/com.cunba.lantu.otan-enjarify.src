package com.qinggan.media;

import java.io.Closeable;
import java.io.InputStream;

public final class DiskLruCache$Snapshot
  implements Closeable
{
  public final InputStream[] o00OoOoo;
  public final long o00Ooo0;
  public final String o00Ooo00;
  
  public DiskLruCache$Snapshot(DiskLruCache paramDiskLruCache, String paramString, long paramLong, InputStream[] paramArrayOfInputStream)
  {
    this.o00Ooo00 = paramString;
    this.o00Ooo0 = paramLong;
    this.o00OoOoo = paramArrayOfInputStream;
  }
  
  public void close()
  {
    InputStream[] arrayOfInputStream = this.o00OoOoo;
    int i = arrayOfInputStream.length;
    int j = 0;
    while (j < i)
    {
      InputStream localInputStream = arrayOfInputStream[j];
      DiskLruCache.OooOo0O(localInputStream);
      j += 1;
    }
  }
  
  public InputStream getInputStream(int paramInt)
  {
    return this.o00OoOoo[paramInt];
  }
  
  public String getString(int paramInt)
  {
    return DiskLruCache.OooO0Oo(getInputStream(paramInt));
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.media.DiskLruCache.Snapshot
 * JD-Core Version:    0.7.0.1
 */