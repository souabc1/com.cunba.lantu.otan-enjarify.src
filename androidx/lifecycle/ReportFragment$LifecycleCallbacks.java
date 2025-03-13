package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class ReportFragment$LifecycleCallbacks
  implements Application.ActivityLifecycleCallbacks
{
  public static final ReportFragment.LifecycleCallbacks.Companion Companion;
  
  static
  {
    ReportFragment.LifecycleCallbacks.Companion localCompanion = new androidx/lifecycle/ReportFragment$LifecycleCallbacks$Companion;
    localCompanion.<init>(null);
    Companion = localCompanion;
  }
  
  public static final void registerIn(Activity paramActivity)
  {
    Companion.OooO00o(paramActivity);
  }
  
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
  
  public void onActivityPostCreated(Activity paramActivity, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    paramBundle = ReportFragment.o00Ooo00;
    Lifecycle.Event localEvent = Lifecycle.Event.ON_CREATE;
    paramBundle.OooO00o(paramActivity, localEvent);
  }
  
  public void onActivityPostResumed(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    ReportFragment.Companion localCompanion = ReportFragment.o00Ooo00;
    Lifecycle.Event localEvent = Lifecycle.Event.ON_RESUME;
    localCompanion.OooO00o(paramActivity, localEvent);
  }
  
  public void onActivityPostStarted(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    ReportFragment.Companion localCompanion = ReportFragment.o00Ooo00;
    Lifecycle.Event localEvent = Lifecycle.Event.ON_START;
    localCompanion.OooO00o(paramActivity, localEvent);
  }
  
  public void onActivityPreDestroyed(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    ReportFragment.Companion localCompanion = ReportFragment.o00Ooo00;
    Lifecycle.Event localEvent = Lifecycle.Event.ON_DESTROY;
    localCompanion.OooO00o(paramActivity, localEvent);
  }
  
  public void onActivityPrePaused(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    ReportFragment.Companion localCompanion = ReportFragment.o00Ooo00;
    Lifecycle.Event localEvent = Lifecycle.Event.ON_PAUSE;
    localCompanion.OooO00o(paramActivity, localEvent);
  }
  
  public void onActivityPreStopped(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    ReportFragment.Companion localCompanion = ReportFragment.o00Ooo00;
    Lifecycle.Event localEvent = Lifecycle.Event.ON_STOP;
    localCompanion.OooO00o(paramActivity, localEvent);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    Intrinsics.OooO0o(paramBundle, "bundle");
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
 * Qualified Name:     androidx.lifecycle.ReportFragment.LifecycleCallbacks
 * JD-Core Version:    0.7.0.1
 */