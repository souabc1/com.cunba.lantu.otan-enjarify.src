package com.hjq.toast;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.lifecycle.OooOO0O;
import m54207b69;

final class WindowLifecycle
  implements Application.ActivityLifecycleCallbacks
{
  public Activity o00OoOoo;
  public ToastImpl o00Ooo0;
  public Application o00Ooo00;
  
  public WindowLifecycle(Activity paramActivity)
  {
    this.o00OoOoo = paramActivity;
  }
  
  public WindowLifecycle(Application paramApplication)
  {
    this.o00Ooo00 = paramApplication;
  }
  
  public void OooO00o(ToastImpl paramToastImpl)
  {
    this.o00Ooo0 = paramToastImpl;
    paramToastImpl = this.o00OoOoo;
    if (paramToastImpl == null) {
      return;
    }
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      OooOO0O.OooO00o(paramToastImpl, this);
    }
    else
    {
      paramToastImpl = paramToastImpl.getApplication();
      paramToastImpl.registerActivityLifecycleCallbacks(this);
    }
  }
  
  public void OooO0O0()
  {
    this.o00Ooo0 = null;
    Object localObject = this.o00OoOoo;
    if (localObject == null) {
      return;
    }
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      OooO0OO.OooO00o((Activity)localObject, this);
    }
    else
    {
      localObject = ((Activity)localObject).getApplication();
      ((Application)localObject).unregisterActivityLifecycleCallbacks(this);
    }
  }
  
  public WindowManager getWindowManager()
  {
    Object localObject = this.o00OoOoo;
    String str = null;
    if (localObject != null)
    {
      boolean bool = ((Activity)localObject).isDestroyed();
      if (bool) {
        return null;
      }
      return this.o00OoOoo.getWindowManager();
    }
    localObject = this.o00Ooo00;
    if (localObject != null)
    {
      str = m54207b69.F54207b69_11("LM3A25252C263F");
      return (WindowManager)((Context)localObject).getSystemService(str);
    }
    return null;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    Activity localActivity = this.o00OoOoo;
    if (localActivity != paramActivity) {
      return;
    }
    paramActivity = this.o00Ooo0;
    if (paramActivity != null) {
      paramActivity.OooO0oO();
    }
    OooO0O0();
    this.o00OoOoo = null;
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    Activity localActivity = this.o00OoOoo;
    if (localActivity != paramActivity) {
      return;
    }
    paramActivity = this.o00Ooo0;
    if (paramActivity == null) {
      return;
    }
    paramActivity.OooO0oO();
  }
  
  public void onActivityResumed(Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.WindowLifecycle
 * JD-Core Version:    0.7.0.1
 */