package com.xuexiang.xhttp2.cache;

import android.content.Context;
import com.xuexiang.xhttp2.cache.converter.IDiskConverter;
import com.xuexiang.xhttp2.cache.converter.SerializableDiskConverter;
import java.io.File;
import m54207b69;

public final class RxCache$Builder
{
  public long OooO;
  public Context OooO00o;
  public boolean OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public File OooO0o;
  public long OooO0o0;
  public IDiskConverter OooO0oO;
  public String OooO0oo;
  
  public RxCache$Builder()
  {
    int i = 1;
    this.OooO0O0 = i;
    SerializableDiskConverter localSerializableDiskConverter = new com/xuexiang/xhttp2/cache/converter/SerializableDiskConverter;
    localSerializableDiskConverter.<init>();
    this.OooO0oO = localSerializableDiskConverter;
    this.OooO = -1;
    this.OooO0Oo = i;
  }
  
  public RxCache$Builder(RxCache paramRxCache)
  {
    Object localObject = RxCache.OooO0Oo(paramRxCache);
    this.OooO00o = ((Context)localObject);
    boolean bool = RxCache.OooO0o0(paramRxCache);
    this.OooO0O0 = bool;
    int i = RxCache.OooO0o(paramRxCache);
    this.OooO0OO = i;
    i = RxCache.OooO0oO(paramRxCache);
    this.OooO0Oo = i;
    long l = RxCache.OooO0oo(paramRxCache);
    this.OooO0o0 = l;
    localObject = RxCache.OooO(paramRxCache);
    this.OooO0o = ((File)localObject);
    localObject = RxCache.OooOO0(paramRxCache);
    this.OooO0oO = ((IDiskConverter)localObject);
    localObject = RxCache.OooO00o(paramRxCache);
    this.OooO0oo = ((String)localObject);
    l = RxCache.OooO0O0(paramRxCache);
    this.OooO = l;
  }
  
  public static long OooOOO0(File paramFile)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramFile;
    return m54207b69.F54207b69_06(1087, arrayOfObject);
  }
  
  public RxCache OooOO0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (RxCache)m54207b69.F54207b69_09(1083, arrayOfObject);
  }
  
  public Builder OooOO0O(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (Builder)m54207b69.F54207b69_09(1084, arrayOfObject);
  }
  
  public Builder OooOO0o(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    return (Builder)m54207b69.F54207b69_09(1085, arrayOfObject);
  }
  
  public Builder OooOOO(IDiskConverter paramIDiskConverter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramIDiskConverter;
    return (Builder)m54207b69.F54207b69_09(1086, arrayOfObject);
  }
  
  public Builder OooOOOO(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    return (Builder)m54207b69.F54207b69_09(1088, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.cache.RxCache.Builder
 * JD-Core Version:    0.7.0.1
 */