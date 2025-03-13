package androidx.core.app;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class ActivityRecreator$LifecycleCheckCallbacks
  implements Application.ActivityLifecycleCallbacks
{
  public Object o00OoOoo;
  public final int o00Ooo0;
  public Activity o00Ooo00;
  public boolean o00Ooo0O;
  public boolean o00Ooo0o;
  public boolean o00OooO0;
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    Activity localActivity = this.o00Ooo00;
    if (localActivity == paramActivity)
    {
      paramActivity = null;
      this.o00Ooo00 = null;
      boolean bool = true;
      this.o00Ooo0o = bool;
    }
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    boolean bool1 = this.o00Ooo0o;
    if (bool1)
    {
      bool1 = this.o00OooO0;
      if (!bool1)
      {
        bool1 = this.o00Ooo0O;
        if (!bool1)
        {
          Object localObject = this.o00OoOoo;
          int i = this.o00Ooo0;
          boolean bool2 = ActivityRecreator.OooO0o0(localObject, i, paramActivity);
          if (bool2)
          {
            this.o00OooO0 = true;
            bool2 = false;
            paramActivity = null;
            this.o00OoOoo = null;
          }
        }
      }
    }
  }
  
  public void onActivityResumed(Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    Activity localActivity = this.o00Ooo00;
    if (localActivity == paramActivity)
    {
      boolean bool = true;
      this.o00Ooo0O = bool;
    }
  }
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityRecreator.LifecycleCheckCallbacks
 * JD-Core Version:    0.7.0.1
 */