package com.xuexiang.xrouter.launcher;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.xuexiang.xrouter.facade.Postcard;
import com.xuexiang.xrouter.facade.callback.NavigationCallback;
import com.xuexiang.xrouter.logs.ILogger;
import com.xuexiang.xrouter.logs.XRLog;
import com.xuexiang.xrouter.model.RouteInfo;
import com.xuexiang.xrouter.thread.DefaultPoolExecutor;
import com.xuexiang.xrouter.utils.TextUtils;
import java.lang.reflect.Constructor;
import java.util.concurrent.ThreadPoolExecutor;
import m54207b69;

final class _XRouter
{
  public static volatile boolean OooO00o = false;
  public static volatile boolean OooO0O0 = false;
  public static volatile _XRouter OooO0OO;
  public static volatile boolean OooO0Oo = false;
  public static Handler OooO0o;
  public static volatile ThreadPoolExecutor OooO0o0 = ;
  public static Context OooO0oO;
  
  static
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    OooO0o = localHandler;
  }
  
  public static void OooO()
  {
    Object[] arrayOfObject = new Object[0];
    m54207b69.F54207b69_00(1801, arrayOfObject);
  }
  
  public static void OooOO0()
  {
    Object[] arrayOfObject = new Object[0];
    m54207b69.F54207b69_00(1810, arrayOfObject);
  }
  
  public static _XRouter getInstance()
  {
    Object[] arrayOfObject = new Object[0];
    return (_XRouter)m54207b69.F54207b69_09(1811, arrayOfObject);
  }
  
  public static boolean isMonitorMode()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(1812, arrayOfObject);
  }
  
  public static void setExecutor(ThreadPoolExecutor paramThreadPoolExecutor)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramThreadPoolExecutor;
    m54207b69.F54207b69_00(1813, arrayOfObject);
  }
  
  public static void setLogger(ILogger paramILogger)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramILogger;
    m54207b69.F54207b69_00(1814, arrayOfObject);
  }
  
  public final Object OooO00o(android.app.Fragment paramFragment, Postcard paramPostcard, int paramInt, NavigationCallback paramNavigationCallback)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramFragment;
    arrayOfObject[2] = paramPostcard;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[3] = localInteger;
    arrayOfObject[4] = paramNavigationCallback;
    return m54207b69.F54207b69_09(1802, arrayOfObject);
  }
  
  public final Object OooO0O0(Context paramContext, Postcard paramPostcard, int paramInt, NavigationCallback paramNavigationCallback)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    arrayOfObject[2] = paramPostcard;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[3] = localInteger;
    arrayOfObject[4] = paramNavigationCallback;
    return m54207b69.F54207b69_09(1803, arrayOfObject);
  }
  
  public final Object OooO0OO(androidx.fragment.app.Fragment paramFragment, Postcard paramPostcard, int paramInt, NavigationCallback paramNavigationCallback)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramFragment;
    arrayOfObject[2] = paramPostcard;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[3] = localInteger;
    arrayOfObject[4] = paramNavigationCallback;
    return m54207b69.F54207b69_09(1804, arrayOfObject);
  }
  
  public final Intent OooO0oO(Context paramContext, Postcard paramPostcard)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    arrayOfObject[2] = paramPostcard;
    return (Intent)m54207b69.F54207b69_09(1808, arrayOfObject);
  }
  
  public final Object OooO0oo(Postcard paramPostcard)
  {
    Object localObject1 = paramPostcard.getDestination();
    boolean bool = false;
    Object localObject2 = null;
    try
    {
      Class[] arrayOfClass = new Class[0];
      localObject1 = ((Class)localObject1).getConstructor(arrayOfClass);
      localObject2 = new Object[0];
      localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
      bool = localObject1 instanceof android.app.Fragment;
      if (bool)
      {
        localObject2 = localObject1;
        localObject2 = (android.app.Fragment)localObject1;
        paramPostcard = paramPostcard.getExtras();
        ((android.app.Fragment)localObject2).setArguments(paramPostcard);
      }
      else
      {
        bool = localObject1 instanceof androidx.fragment.app.Fragment;
        if (bool)
        {
          localObject2 = localObject1;
          localObject2 = (androidx.fragment.app.Fragment)localObject1;
          paramPostcard = paramPostcard.getExtras();
          ((androidx.fragment.app.Fragment)localObject2).setArguments(paramPostcard);
        }
      }
      return localObject1;
    }
    catch (Exception paramPostcard)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("\\@062636262C652C39293037303A416E383E44463442383B773D4B4C4A4E897E");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramPostcard = TextUtils.OooO00o(paramPostcard.getStackTrace());
      ((StringBuilder)localObject1).append(paramPostcard);
      XRLog.OooO0OO(((StringBuilder)localObject1).toString());
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xrouter.launcher._XRouter
 * JD-Core Version:    0.7.0.1
 */