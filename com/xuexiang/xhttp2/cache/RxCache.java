package com.xuexiang.xhttp2.cache;

import android.content.Context;
import com.xuexiang.xhttp2.cache.converter.IDiskConverter;
import com.xuexiang.xhttp2.cache.core.CacheCore;
import com.xuexiang.xhttp2.cache.core.ICache;
import com.xuexiang.xhttp2.cache.core.LruDiskCache;
import com.xuexiang.xhttp2.cache.core.LruMemoryCache;
import com.xuexiang.xhttp2.cache.key.ICacheKeyCreator;
import com.xuexiang.xhttp2.cache.model.CacheMode;
import com.xuexiang.xhttp2.cache.stategy.IStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import java.io.File;
import java.lang.reflect.Type;
import m54207b69;

public final class RxCache
{
  public static ICacheKeyCreator OooOO0O;
  public final int OooO;
  public boolean OooO00o;
  public int OooO0O0;
  public final Context OooO0OO;
  public final CacheCore OooO0Oo;
  public final long OooO0o;
  public final String OooO0o0;
  public final IDiskConverter OooO0oO;
  public final File OooO0oo;
  public final long OooOO0;
  
  public RxCache()
  {
    this(localBuilder);
  }
  
  public RxCache(RxCache.Builder paramBuilder)
  {
    Object localObject = RxCache.Builder.OooO00o(paramBuilder);
    this.OooO0OO = ((Context)localObject);
    boolean bool1 = RxCache.Builder.OooO0O0(paramBuilder);
    this.OooO00o = bool1;
    int i = RxCache.Builder.OooO0OO(paramBuilder);
    this.OooO0O0 = i;
    localObject = RxCache.Builder.OooO0Oo(paramBuilder);
    this.OooO0o0 = ((String)localObject);
    long l1 = RxCache.Builder.OooO0o0(paramBuilder);
    this.OooO0o = l1;
    File localFile = RxCache.Builder.OooO0o(paramBuilder);
    this.OooO0oo = localFile;
    int j = RxCache.Builder.OooO0oO(paramBuilder);
    this.OooO = j;
    long l2 = RxCache.Builder.OooO0oo(paramBuilder);
    this.OooOO0 = l2;
    IDiskConverter localIDiskConverter = RxCache.Builder.OooO(paramBuilder);
    this.OooO0oO = localIDiskConverter;
    boolean bool2 = this.OooO00o;
    if (bool2)
    {
      paramBuilder = new com/xuexiang/xhttp2/cache/core/CacheCore;
      localObject = new com/xuexiang/xhttp2/cache/core/LruDiskCache;
      ((LruDiskCache)localObject).<init>(localIDiskConverter, localFile, j, l2);
      paramBuilder.<init>((ICache)localObject);
      this.OooO0Oo = paramBuilder;
    }
    else
    {
      localObject = new com/xuexiang/xhttp2/cache/core/CacheCore;
      LruMemoryCache localLruMemoryCache = new com/xuexiang/xhttp2/cache/core/LruMemoryCache;
      int k = RxCache.Builder.OooO0OO(paramBuilder);
      localLruMemoryCache.<init>(k);
      ((CacheCore)localObject).<init>(localLruMemoryCache);
      this.OooO0Oo = ((CacheCore)localObject);
    }
  }
  
  public static ICacheKeyCreator getICacheKeyCreator()
  {
    Object[] arrayOfObject = new Object[0];
    return (ICacheKeyCreator)m54207b69.F54207b69_09(1115, arrayOfObject);
  }
  
  public static void setICacheKeyCreator(ICacheKeyCreator paramICacheKeyCreator)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramICacheKeyCreator;
    m54207b69.F54207b69_00(1116, arrayOfObject);
  }
  
  public Observable OooOO0o(Type paramType, String paramString, long paramLong)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramType;
    arrayOfObject[2] = paramString;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[3] = localLong;
    return (Observable)m54207b69.F54207b69_09(1101, arrayOfObject);
  }
  
  public final void OooOOO(CacheMode paramCacheMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCacheMode;
    m54207b69.F54207b69_00(1102, arrayOfObject);
  }
  
  public final IStrategy OooOOO0(CacheMode paramCacheMode)
  {
    Object localObject1 = IStrategy.class;
    try
    {
      localObject1 = ((Class)localObject1).getPackage();
      localObject1 = ((Package)localObject1).getName();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = ".";
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = paramCacheMode.getClassName();
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = ((StringBuilder)localObject2).toString();
      localObject1 = Class.forName((String)localObject1);
      localObject1 = ((Class)localObject1).newInstance();
      return (IStrategy)localObject1;
    }
    catch (Exception localException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = m54207b69.F54207b69_11("xF2A2A292519373A2E3A2C2B4A7A");
      localStringBuilder.append(str);
      localStringBuilder.append(paramCacheMode);
      paramCacheMode = m54207b69.F54207b69_11("WB6B632933346869");
      localStringBuilder.append(paramCacheMode);
      paramCacheMode = localException.getMessage();
      localStringBuilder.append(paramCacheMode);
      paramCacheMode = localStringBuilder.toString();
      ((RuntimeException)localObject2).<init>(paramCacheMode);
      throw ((Throwable)localObject2);
    }
  }
  
  public RxCache.Builder OooOOOO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (RxCache.Builder)m54207b69.F54207b69_09(1104, arrayOfObject);
  }
  
  public Observable OooOOOo(String paramString, Object paramObject)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = paramObject;
    return (Observable)m54207b69.F54207b69_09(1105, arrayOfObject);
  }
  
  public ObservableTransformer OooOOo0(CacheMode paramCacheMode, Type paramType)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCacheMode;
    arrayOfObject[2] = paramType;
    return (ObservableTransformer)m54207b69.F54207b69_09(1106, arrayOfObject);
  }
  
  public int getAppVersion()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1107, arrayOfObject);
  }
  
  public CacheCore getCacheCore()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (CacheCore)m54207b69.F54207b69_09(1108, arrayOfObject);
  }
  
  public String getCacheKey()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1109, arrayOfObject);
  }
  
  public long getCacheTime()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(1110, arrayOfObject);
  }
  
  public Context getContext()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Context)m54207b69.F54207b69_09(1111, arrayOfObject);
  }
  
  public IDiskConverter getDiskConverter()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (IDiskConverter)m54207b69.F54207b69_09(1112, arrayOfObject);
  }
  
  public File getDiskDir()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (File)m54207b69.F54207b69_09(1113, arrayOfObject);
  }
  
  public long getDiskMaxSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(1114, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.cache.RxCache
 * JD-Core Version:    0.7.0.1
 */