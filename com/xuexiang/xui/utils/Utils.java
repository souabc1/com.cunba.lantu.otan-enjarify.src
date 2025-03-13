package com.xuexiang.xui.utils;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m54207b69;

public final class Utils
{
  private Utils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static boolean OooO(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramCharSequence;
    return m54207b69.F54207b69_01(2177, arrayOfObject);
  }
  
  public static Object OooO00o(Object paramObject, Class paramClass)
  {
    if (paramClass != null)
    {
      boolean bool = paramClass.isInstance(paramObject);
      if (bool) {}
    }
    else
    {
      paramObject = null;
    }
    return paramObject;
  }
  
  public static int OooO0O0(AbsListView paramAbsListView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramAbsListView;
    return m54207b69.F54207b69_05(2179, arrayOfObject);
  }
  
  public static Drawable OooO0OO(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return (Drawable)m54207b69.F54207b69_09(2180, arrayOfObject);
  }
  
  public static Bitmap OooO0Oo(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramDrawable;
    return (Bitmap)m54207b69.F54207b69_09(2181, arrayOfObject);
  }
  
  public static int OooO0o(ListView paramListView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramListView;
    return m54207b69.F54207b69_05(2182, arrayOfObject);
  }
  
  public static int OooO0o0(Resources paramResources, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramResources;
    arrayOfObject[1] = paramString;
    return m54207b69.F54207b69_05(2183, arrayOfObject);
  }
  
  public static int OooO0oO(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return m54207b69.F54207b69_05(2184, arrayOfObject);
  }
  
  public static int OooO0oo(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return m54207b69.F54207b69_05(2185, arrayOfObject);
  }
  
  public static void OooOO0(View paramView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramView;
    m54207b69.F54207b69_00(2186, arrayOfObject);
  }
  
  public static void OooOO0O(Context paramContext, View paramView, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramView;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(2187, arrayOfObject);
  }
  
  public static ColorFilter OooOO0o(Drawable paramDrawable, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramDrawable;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (ColorFilter)m54207b69.F54207b69_09(2188, arrayOfObject);
  }
  
  public static Application getApplicationByReflect()
  {
    String str = m54207b69.F54207b69_11("bj1306214D1D070B260E17540E10102C591C142A2C32");
    Object localObject1 = "2_3E323D30343B41784638397C2A49394539473D391F4C43515654";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      Object localObject2 = "?U3621292A3440271B3E2A462E482E3A104D38424745";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      Object[] arrayOfObject = null;
      Object localObject3 = new Class[0];
      localObject2 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      localObject3 = new Object[0];
      Class[] arrayOfClass = null;
      localObject2 = ((Method)localObject2).invoke(null, (Object[])localObject3);
      localObject3 = "XV3134241A2A2B40463D402C4A4545";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      arrayOfClass = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject3, arrayOfClass);
      arrayOfObject = new Object[0];
      localObject1 = ((Method)localObject1).invoke(localObject2, arrayOfObject);
      if (localObject1 != null) {
        return (Application)localObject1;
      }
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>(str);
      throw ((Throwable)localObject1);
    }
    catch (ClassNotFoundException localClassNotFoundException) {}catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}catch (NoSuchMethodException localNoSuchMethodException) {}
    localNoSuchMethodException.printStackTrace();
    NullPointerException localNullPointerException = new java/lang/NullPointerException;
    localNullPointerException.<init>(str);
    throw localNullPointerException;
  }
  
  public static int getNumberDigits(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    return m54207b69.F54207b69_05(2190, arrayOfObject);
  }
  
  public static int getStatusBarHeight()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_05(2191, arrayOfObject);
  }
  
  public static boolean isLight(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    return m54207b69.F54207b69_01(2192, arrayOfObject);
  }
  
  public static boolean isSupportColorAttrs()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2193, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.Utils
 * JD-Core Version:    0.7.0.1
 */