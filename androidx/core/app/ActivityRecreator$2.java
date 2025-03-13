package androidx.core.app;

import android.app.Application;

class ActivityRecreator$2
  implements Runnable
{
  public void run()
  {
    Application localApplication = this.o00OoOoo;
    ActivityRecreator.LifecycleCheckCallbacks localLifecycleCheckCallbacks = this.o00Ooo00;
    localApplication.unregisterActivityLifecycleCallbacks(localLifecycleCheckCallbacks);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityRecreator.2
 * JD-Core Version:    0.7.0.1
 */