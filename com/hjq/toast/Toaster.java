package com.hjq.toast;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import com.hjq.toast.config.IToastInterceptor;
import com.hjq.toast.config.IToastStrategy;
import com.hjq.toast.config.IToastStyle;
import com.hjq.toast.style.BlackToastStyle;
import com.hjq.toast.style.CustomToastStyle;
import com.hjq.toast.style.LocationToastStyle;
import m54207b69;

public final class Toaster
{
  public static Application OooO00o;
  public static IToastStrategy OooO0O0;
  public static IToastStyle OooO0OO;
  public static IToastInterceptor OooO0Oo;
  public static Boolean OooO0o0;
  
  public static void OooO(CharSequence paramCharSequence)
  {
    ToastParams localToastParams = new com/hjq/toast/ToastParams;
    localToastParams.<init>();
    localToastParams.OooO00o = paramCharSequence;
    OooO0oo(localToastParams);
  }
  
  public static void OooO00o()
  {
    Object localObject = OooO00o;
    if (localObject != null) {
      return;
    }
    localObject = new java/lang/IllegalStateException;
    String str = m54207b69.F54207b69_11("bQ053F32252939297841392C7C4B4B338043454652854D554F3D514A5854485254");
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public static void OooO0O0(Application paramApplication, IToastStrategy paramIToastStrategy, IToastStyle paramIToastStyle)
  {
    boolean bool = isInit();
    if (bool) {
      return;
    }
    OooO00o = paramApplication;
    ActivityStack localActivityStack = ActivityStack.getInstance();
    localActivityStack.OooO00o(paramApplication);
    if (paramIToastStrategy == null)
    {
      paramIToastStrategy = new com/hjq/toast/ToastStrategy;
      paramIToastStrategy.<init>();
    }
    setStrategy(paramIToastStrategy);
    if (paramIToastStyle == null)
    {
      paramIToastStyle = new com/hjq/toast/style/BlackToastStyle;
      paramIToastStyle.<init>();
    }
    setStyle(paramIToastStyle);
  }
  
  public static void OooO0OO(Application paramApplication, IToastStyle paramIToastStyle)
  {
    OooO0O0(paramApplication, null, paramIToastStyle);
  }
  
  public static CharSequence OooO0Oo(Object paramObject)
  {
    if (paramObject != null) {
      paramObject = paramObject.toString();
    } else {
      paramObject = m54207b69.F54207b69_11("C?514B5556");
    }
    return paramObject;
  }
  
  public static void OooO0o(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2)
  {
    LocationToastStyle localLocationToastStyle = new com/hjq/toast/style/LocationToastStyle;
    IToastStyle localIToastStyle = OooO0OO;
    localLocationToastStyle.<init>(localIToastStyle, paramInt1, paramInt2, paramInt3, paramFloat1, paramFloat2);
    OooO0OO = localLocationToastStyle;
  }
  
  public static void OooO0o0(int paramInt1, int paramInt2, int paramInt3)
  {
    OooO0o(paramInt1, paramInt2, paramInt3, 0.0F, 0.0F);
  }
  
  public static void OooO0oO(int paramInt)
  {
    OooO(OooOO0O(paramInt));
  }
  
  public static void OooO0oo(ToastParams paramToastParams)
  {
    OooO00o();
    Object localObject = paramToastParams.OooO00o;
    if (localObject != null)
    {
      int i = ((CharSequence)localObject).length();
      if (i != 0)
      {
        localObject = paramToastParams.OooO0o;
        if (localObject == null)
        {
          localObject = OooO0O0;
          paramToastParams.OooO0o = ((IToastStrategy)localObject);
        }
        localObject = paramToastParams.OooO0oO;
        if (localObject == null)
        {
          localObject = OooO0Oo;
          if (localObject == null)
          {
            localObject = new com/hjq/toast/ToastLogInterceptor;
            ((ToastLogInterceptor)localObject).<init>();
            OooO0Oo = (IToastInterceptor)localObject;
          }
          localObject = OooO0Oo;
          paramToastParams.OooO0oO = ((IToastInterceptor)localObject);
        }
        localObject = paramToastParams.OooO0o0;
        if (localObject == null)
        {
          localObject = OooO0OO;
          paramToastParams.OooO0o0 = ((IToastStyle)localObject);
        }
        localObject = paramToastParams.OooO0oO;
        boolean bool = ((IToastInterceptor)localObject).OooO00o(paramToastParams);
        if (bool) {
          return;
        }
        int j = paramToastParams.OooO0O0;
        int k = -1;
        if (j == k)
        {
          localObject = paramToastParams.OooO00o;
          j = ((CharSequence)localObject).length();
          k = 20;
          if (j > k)
          {
            j = 1;
          }
          else
          {
            j = 0;
            localObject = null;
          }
          paramToastParams.OooO0O0 = j;
        }
        localObject = paramToastParams.OooO0o;
        ((IToastStrategy)localObject).OooO00o(paramToastParams);
      }
    }
  }
  
  public static void OooOO0(Object paramObject)
  {
    OooO(OooO0Oo(paramObject));
  }
  
  public static CharSequence OooOO0O(int paramInt)
  {
    
    try
    {
      Object localObject = OooO00o;
      localObject = ((Context)localObject).getResources();
      return ((Resources)localObject).getText(paramInt);
    }
    catch (Resources.NotFoundException localNotFoundException) {}
    return String.valueOf(paramInt);
  }
  
  public static IToastInterceptor getInterceptor()
  {
    return OooO0Oo;
  }
  
  public static IToastStrategy getStrategy()
  {
    return OooO0O0;
  }
  
  public static IToastStyle getStyle()
  {
    return OooO0OO;
  }
  
  public static boolean isDebugMode()
  {
    Object localObject = OooO0o0;
    if (localObject == null)
    {
      OooO00o();
      localObject = OooO00o.getApplicationInfo();
      int i = ((ApplicationInfo)localObject).flags & 0x2;
      if (i != 0)
      {
        i = 1;
      }
      else
      {
        i = 0;
        localObject = null;
      }
      localObject = Boolean.valueOf(i);
      OooO0o0 = (Boolean)localObject;
    }
    return OooO0o0.booleanValue();
  }
  
  public static boolean isInit()
  {
    Object localObject = OooO00o;
    if (localObject != null)
    {
      localObject = OooO0O0;
      if (localObject != null)
      {
        localObject = OooO0OO;
        if (localObject != null) {
          return true;
        }
      }
    }
    boolean bool = false;
    localObject = null;
    return bool;
  }
  
  public static void setDebugMode(boolean paramBoolean)
  {
    OooO0o0 = Boolean.valueOf(paramBoolean);
  }
  
  public static void setGravity(int paramInt)
  {
    OooO0o0(paramInt, 0, 0);
  }
  
  public static void setInterceptor(IToastInterceptor paramIToastInterceptor)
  {
    OooO0Oo = paramIToastInterceptor;
  }
  
  public static void setStrategy(IToastStrategy paramIToastStrategy)
  {
    if (paramIToastStrategy == null) {
      return;
    }
    OooO0O0 = paramIToastStrategy;
    Application localApplication = OooO00o;
    paramIToastStrategy.OooO0O0(localApplication);
  }
  
  public static void setStyle(IToastStyle paramIToastStyle)
  {
    if (paramIToastStyle == null) {
      return;
    }
    OooO0OO = paramIToastStyle;
  }
  
  public static void setView(int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    IToastStyle localIToastStyle = OooO0OO;
    if (localIToastStyle == null) {
      return;
    }
    CustomToastStyle localCustomToastStyle = new com/hjq/toast/style/CustomToastStyle;
    int i = localIToastStyle.getGravity();
    int j = OooO0OO.getXOffset();
    int k = OooO0OO.getYOffset();
    float f1 = OooO0OO.getHorizontalMargin();
    float f2 = OooO0OO.getVerticalMargin();
    localCustomToastStyle.<init>(paramInt, i, j, k, f1, f2);
    setStyle(localCustomToastStyle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.Toaster
 * JD-Core Version:    0.7.0.1
 */