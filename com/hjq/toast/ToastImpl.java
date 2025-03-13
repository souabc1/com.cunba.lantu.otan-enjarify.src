package com.hjq.toast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import android.widget.Toast;
import m54207b69;

final class ToastImpl
{
  public static final Handler OooO0oo;
  public final CustomToast OooO00o;
  public WindowLifecycle OooO0O0;
  public final String OooO0OO;
  public boolean OooO0Oo;
  public final Runnable OooO0o;
  public boolean OooO0o0;
  public final Runnable OooO0oO;
  
  static
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    OooO0oo = localHandler;
  }
  
  public ToastImpl(Activity paramActivity, CustomToast paramCustomToast)
  {
    this(paramActivity, paramCustomToast);
    this.OooO0o0 = false;
    paramCustomToast = new com/hjq/toast/WindowLifecycle;
    paramCustomToast.<init>(paramActivity);
    this.OooO0O0 = paramCustomToast;
  }
  
  public ToastImpl(Application paramApplication, CustomToast paramCustomToast)
  {
    this(paramApplication, paramCustomToast);
    this.OooO0o0 = true;
    paramCustomToast = new com/hjq/toast/WindowLifecycle;
    paramCustomToast.<init>(paramApplication);
    this.OooO0O0 = paramCustomToast;
  }
  
  public ToastImpl(Context paramContext, CustomToast paramCustomToast)
  {
    Object localObject = new com/hjq/toast/ToastImpl$1;
    ((ToastImpl.1)localObject).<init>(this);
    this.OooO0o = ((Runnable)localObject);
    localObject = new com/hjq/toast/ToastImpl$2;
    ((ToastImpl.2)localObject).<init>(this);
    this.OooO0oO = ((Runnable)localObject);
    this.OooO00o = paramCustomToast;
    paramContext = paramContext.getPackageName();
    this.OooO0OO = paramContext;
  }
  
  private boolean isMainThread()
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = Looper.getMainLooper();
    boolean bool;
    if (localLooper1 == localLooper2)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localLooper1 = null;
    }
    return bool;
  }
  
  public final void OooO(View paramView)
  {
    Object localObject1 = paramView.getContext();
    Object localObject2 = m54207b69.F54207b69_11("dM2C2F302B42432A362C2A2E4440");
    localObject2 = (AccessibilityManager)((Context)localObject1).getSystemService((String)localObject2);
    boolean bool = ((AccessibilityManager)localObject2).isEnabled();
    if (!bool) {
      return;
    }
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    int k = 64;
    AccessibilityEvent localAccessibilityEvent;
    if (i >= j)
    {
      localAccessibilityEvent = OooO00o.OooO00o();
      localAccessibilityEvent.setEventType(k);
    }
    else
    {
      localAccessibilityEvent = AccessibilityEvent.obtain(k);
    }
    String str = Toast.class.getName();
    localAccessibilityEvent.setClassName(str);
    localObject1 = ((Context)localObject1).getPackageName();
    localAccessibilityEvent.setPackageName((CharSequence)localObject1);
    paramView.dispatchPopulateAccessibilityEvent(localAccessibilityEvent);
    ((AccessibilityManager)localObject2).sendAccessibilityEvent(localAccessibilityEvent);
  }
  
  public void OooO0oO()
  {
    boolean bool1 = isShow();
    if (!bool1) {
      return;
    }
    Object localObject = OooO0oo;
    Runnable localRunnable = this.OooO0o;
    ((Handler)localObject).removeCallbacks(localRunnable);
    boolean bool2 = isMainThread();
    if (bool2)
    {
      localObject = this.OooO0oO;
      ((Runnable)localObject).run();
    }
    else
    {
      localRunnable = this.OooO0oO;
      ((Handler)localObject).removeCallbacks(localRunnable);
      localRunnable = this.OooO0oO;
      ((Handler)localObject).post(localRunnable);
    }
  }
  
  public void OooO0oo()
  {
    boolean bool = isShow();
    if (bool) {
      return;
    }
    bool = isMainThread();
    Object localObject;
    if (bool)
    {
      localObject = this.OooO0o;
      ((Runnable)localObject).run();
    }
    else
    {
      localObject = OooO0oo;
      Runnable localRunnable = this.OooO0o;
      ((Handler)localObject).removeCallbacks(localRunnable);
      localRunnable = this.OooO0o;
      ((Handler)localObject).post(localRunnable);
    }
  }
  
  public boolean isShow()
  {
    return this.OooO0Oo;
  }
  
  public void setShow(boolean paramBoolean)
  {
    this.OooO0Oo = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.ToastImpl
 * JD-Core Version:    0.7.0.1
 */