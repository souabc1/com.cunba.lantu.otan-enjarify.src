package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public class EmptyActivityLifecycleCallbacks
  implements Application.ActivityLifecycleCallbacks
{
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    Intrinsics.OooO0o(paramBundle, "outState");
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.EmptyActivityLifecycleCallbacks
 * JD-Core Version:    0.7.0.1
 */