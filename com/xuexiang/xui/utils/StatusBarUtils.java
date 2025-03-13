package com.xuexiang.xui.utils;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import m54207b69;

public class StatusBarUtils
{
  public static float OooO00o = -1.0F;
  public static float OooO0O0 = -1.0F;
  
  private StatusBarUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static void OooO0O0(Window paramWindow)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramWindow;
    m54207b69.F54207b69_00(2144, arrayOfObject);
  }
  
  public static void OooO0OO(Window paramWindow, View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramWindow;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(2145, arrayOfObject);
  }
  
  public static boolean OooO0Oo(Activity paramActivity, Window paramWindow, StatusBarUtils.IWindowShower paramIWindowShower)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramActivity;
    arrayOfObject[1] = paramWindow;
    arrayOfObject[2] = paramIWindowShower;
    return m54207b69.F54207b69_01(2146, arrayOfObject);
  }
  
  public static boolean OooO0o(Activity paramActivity, Window paramWindow)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramActivity;
    arrayOfObject[1] = paramWindow;
    return m54207b69.F54207b69_01(2147, arrayOfObject);
  }
  
  public static void OooO0o0(Window paramWindow, StatusBarUtils.IWindowShower paramIWindowShower)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramWindow;
    arrayOfObject[1] = paramIWindowShower;
    m54207b69.F54207b69_00(2148, arrayOfObject);
  }
  
  public static boolean OooO0oO(Window paramWindow1, Window paramWindow2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramWindow1;
    arrayOfObject[1] = paramWindow2;
    return m54207b69.F54207b69_01(2149, arrayOfObject);
  }
  
  private static boolean isMIUICustomStatusBarLightModeImpl()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2150, arrayOfObject);
  }
  
  public static boolean isNotchOfficialSupport()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2151, arrayOfObject);
  }
  
  public static void setVirtualDensity(float paramFloat)
  {
    Object[] arrayOfObject = new Object[1];
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[0] = localFloat;
    m54207b69.F54207b69_00(2152, arrayOfObject);
  }
  
  public static void setVirtualDensityDpi(float paramFloat)
  {
    Object[] arrayOfObject = new Object[1];
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[0] = localFloat;
    m54207b69.F54207b69_00(2153, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.StatusBarUtils
 * JD-Core Version:    0.7.0.1
 */