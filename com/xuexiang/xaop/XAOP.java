package com.xuexiang.xaop;

import android.app.Application;
import android.content.Context;
import com.xuexiang.xaop.cache.converter.IDiskConverter;
import com.xuexiang.xaop.cache.converter.SerializableDiskConverter;
import com.xuexiang.xaop.cache.key.DefaultCacheKeyCreator;
import com.xuexiang.xaop.cache.key.ICacheKeyCreator;
import com.xuexiang.xaop.checker.IThrowableHandler;
import com.xuexiang.xaop.checker.Interceptor;
import com.xuexiang.xaop.logger.ILogger;
import com.xuexiang.xaop.util.PermissionUtils.OnPermissionDeniedListener;
import com.xuexiang.xaop.util.Strings.ISerializer;
import m54207b69;

public final class XAOP
{
  public static Context OooO00o;
  public static PermissionUtils.OnPermissionDeniedListener OooO0O0;
  public static IDiskConverter OooO0OO;
  public static ICacheKeyCreator OooO0Oo;
  public static IThrowableHandler OooO0o;
  public static Interceptor OooO0o0;
  
  static
  {
    Object localObject = new com/xuexiang/xaop/cache/converter/SerializableDiskConverter;
    ((SerializableDiskConverter)localObject).<init>();
    OooO0OO = (IDiskConverter)localObject;
    localObject = new com/xuexiang/xaop/cache/key/DefaultCacheKeyCreator;
    ((DefaultCacheKeyCreator)localObject).<init>();
    OooO0Oo = (ICacheKeyCreator)localObject;
  }
  
  public static void OooO00o(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[0] = localBoolean;
    m54207b69.F54207b69_00(909, arrayOfObject);
  }
  
  public static void OooO0O0(Application paramApplication)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramApplication;
    m54207b69.F54207b69_00(910, arrayOfObject);
  }
  
  public static void OooO0OO()
  {
    Object[] arrayOfObject = new Object[0];
    m54207b69.F54207b69_00(911, arrayOfObject);
  }
  
  public static Context getContext()
  {
    Object[] arrayOfObject = new Object[0];
    return (Context)m54207b69.F54207b69_09(912, arrayOfObject);
  }
  
  public static ICacheKeyCreator getICacheKeyCreator()
  {
    Object[] arrayOfObject = new Object[0];
    return (ICacheKeyCreator)m54207b69.F54207b69_09(913, arrayOfObject);
  }
  
  public static IDiskConverter getIDiskConverter()
  {
    Object[] arrayOfObject = new Object[0];
    return (IDiskConverter)m54207b69.F54207b69_09(914, arrayOfObject);
  }
  
  public static IThrowableHandler getIThrowableHandler()
  {
    Object[] arrayOfObject = new Object[0];
    return (IThrowableHandler)m54207b69.F54207b69_09(915, arrayOfObject);
  }
  
  public static Interceptor getInterceptor()
  {
    Object[] arrayOfObject = new Object[0];
    return (Interceptor)m54207b69.F54207b69_09(916, arrayOfObject);
  }
  
  public static PermissionUtils.OnPermissionDeniedListener getOnPermissionDeniedListener()
  {
    Object[] arrayOfObject = new Object[0];
    return (PermissionUtils.OnPermissionDeniedListener)m54207b69.F54207b69_09(917, arrayOfObject);
  }
  
  public static void setICacheKeyCreator(ICacheKeyCreator paramICacheKeyCreator)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramICacheKeyCreator;
    m54207b69.F54207b69_00(918, arrayOfObject);
  }
  
  public static void setIDiskConverter(IDiskConverter paramIDiskConverter)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramIDiskConverter;
    m54207b69.F54207b69_00(919, arrayOfObject);
  }
  
  public static void setISerializer(Strings.ISerializer paramISerializer)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramISerializer;
    m54207b69.F54207b69_00(920, arrayOfObject);
  }
  
  public static void setIThrowableHandler(IThrowableHandler paramIThrowableHandler)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramIThrowableHandler;
    m54207b69.F54207b69_00(921, arrayOfObject);
  }
  
  public static void setInterceptor(Interceptor paramInterceptor)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramInterceptor;
    m54207b69.F54207b69_00(922, arrayOfObject);
  }
  
  public static void setLogger(ILogger paramILogger)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramILogger;
    m54207b69.F54207b69_00(923, arrayOfObject);
  }
  
  public static void setOnPermissionDeniedListener(PermissionUtils.OnPermissionDeniedListener paramOnPermissionDeniedListener)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramOnPermissionDeniedListener;
    m54207b69.F54207b69_00(924, arrayOfObject);
  }
  
  public static void setPriority(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    m54207b69.F54207b69_00(925, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xaop.XAOP
 * JD-Core Version:    0.7.0.1
 */