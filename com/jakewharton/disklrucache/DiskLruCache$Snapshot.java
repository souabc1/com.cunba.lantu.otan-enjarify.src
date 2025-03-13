package com.jakewharton.disklrucache;

import java.io.Closeable;
import java.io.InputStream;

public final class DiskLruCache$Snapshot
  implements Closeable
{
  public final String o00OoOoo;
  public final InputStream[] o00Ooo0;
  public final long o00Ooo00;
  public final long[] o00Ooo0O;
  
  public DiskLruCache$Snapshot(DiskLruCache paramDiskLruCache, String paramString, long paramLong, InputStream[] paramArrayOfInputStream, long[] paramArrayOfLong)
  {
    this.o00OoOoo = paramString;
    this.o00Ooo00 = paramLong;
    this.o00Ooo0 = paramArrayOfInputStream;
    this.o00Ooo0O = paramArrayOfLong;
  }
  
  public void close()
  {
    InputStream[] arrayOfInputStream = this.o00Ooo0;
    int i = arrayOfInputStream.length;
    int j = 0;
    while (j < i)
    {
      InputStream localInputStream = arrayOfInputStream[j];
      Util.OooO00o(localInputStream);
      j += 1;
    }
  }
  
  public InputStream getInputStream(int paramInt)
  {
    return this.o00Ooo0[paramInt];
  }
  
  public long getLength(int paramInt)
  {
    return this.o00Ooo0O[paramInt];
  }
  
  public String getString(int paramInt)
  {
    return DiskLruCache.OooO0Oo(getInputStream(paramInt));
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.jakewharton.disklrucache.DiskLruCache.Snapshot
 * JD-Core Version:    0.7.0.1
 */