package com.xuexiang.xui.utils;

import android.app.Activity;
import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import java.util.HashMap;
import m54207b69;

public class KeyboardUtils
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public static HashMap o00Ooo0O;
  public KeyboardUtils.SoftKeyboardToggleListener o00OoOoo;
  public Boolean o00Ooo0;
  public ViewGroup o00Ooo00;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    o00Ooo0O = localHashMap;
  }
  
  public static boolean OooO(View paramView, MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramView;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(2075, arrayOfObject);
  }
  
  public static void OooO00o(MotionEvent paramMotionEvent, Dialog paramDialog)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramMotionEvent;
    arrayOfObject[1] = paramDialog;
    m54207b69.F54207b69_00(2076, arrayOfObject);
  }
  
  public static void OooO0O0(MotionEvent paramMotionEvent, Window paramWindow)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramMotionEvent;
    arrayOfObject[1] = paramWindow;
    m54207b69.F54207b69_00(2077, arrayOfObject);
  }
  
  public static View OooO0OO(ViewGroup paramViewGroup, MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramViewGroup;
    arrayOfObject[1] = paramMotionEvent;
    return (View)m54207b69.F54207b69_09(2078, arrayOfObject);
  }
  
  public static void OooO0Oo(View paramView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramView;
    m54207b69.F54207b69_00(2079, arrayOfObject);
  }
  
  public static boolean OooO0o(Window paramWindow, MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramWindow;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(2080, arrayOfObject);
  }
  
  public static void OooO0o0(View paramView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramView;
    m54207b69.F54207b69_00(2081, arrayOfObject);
  }
  
  public static boolean OooO0oO(ViewGroup paramViewGroup)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramViewGroup;
    return m54207b69.F54207b69_01(2082, arrayOfObject);
  }
  
  public static boolean OooO0oo(Window paramWindow)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramWindow;
    return m54207b69.F54207b69_01(2083, arrayOfObject);
  }
  
  public static void OooOO0(KeyboardUtils.SoftKeyboardToggleListener paramSoftKeyboardToggleListener)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramSoftKeyboardToggleListener;
    m54207b69.F54207b69_00(2084, arrayOfObject);
  }
  
  public static void setSoftInputAdjustNothing(Activity paramActivity)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramActivity;
    m54207b69.F54207b69_00(2087, arrayOfObject);
  }
  
  public static void setSoftInputAdjustPan(Activity paramActivity)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramActivity;
    m54207b69.F54207b69_00(2088, arrayOfObject);
  }
  
  public static void setSoftInputAdjustResize(Activity paramActivity)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramActivity;
    m54207b69.F54207b69_00(2089, arrayOfObject);
  }
  
  public final void OooOO0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2085, arrayOfObject);
  }
  
  public void onGlobalLayout()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2086, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.KeyboardUtils
 * JD-Core Version:    0.7.0.1
 */