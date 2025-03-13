package com.hjq.toast;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class ActivityStack
  implements Application.ActivityLifecycleCallbacks
{
  public static volatile ActivityStack o00Ooo00;
  public Activity o00OoOoo;
  
  public static ActivityStack getInstance()
  {
    ??? = o00Ooo00;
    if (??? == null) {
      synchronized (ActivityStack.class)
      {
        ActivityStack localActivityStack2 = o00Ooo00;
        if (localActivityStack2 == null)
        {
          localActivityStack2 = new com/hjq/toast/ActivityStack;
          localActivityStack2.<init>();
          o00Ooo00 = localActivityStack2;
        }
      }
    }
    return o00Ooo00;
  }
  
  public void OooO00o(Application paramApplication)
  {
    if (paramApplication == null) {
      return;
    }
    paramApplication.registerActivityLifecycleCallbacks(this);
  }
  
  public Activity getForegroundActivity()
  {
    return this.o00OoOoo;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity)
  {
    Activity localActivity = this.o00OoOoo;
    if (localActivity != paramActivity) {
      return;
    }
    this.o00OoOoo = null;
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    this.o00OoOoo = paramActivity;
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.ActivityStack
 * JD-Core Version:    0.7.0.1
 */