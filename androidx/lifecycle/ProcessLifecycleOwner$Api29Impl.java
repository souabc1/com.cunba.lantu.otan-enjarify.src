package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import kotlin.jvm.internal.Intrinsics;

public final class ProcessLifecycleOwner$Api29Impl
{
  public static final Api29Impl OooO00o;
  
  static
  {
    Api29Impl localApi29Impl = new androidx/lifecycle/ProcessLifecycleOwner$Api29Impl;
    localApi29Impl.<init>();
    OooO00o = localApi29Impl;
  }
  
  public static final void OooO00o(Activity paramActivity, Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    Intrinsics.OooO0o(paramActivityLifecycleCallbacks, "callback");
    paramActivity.registerActivityLifecycleCallbacks(paramActivityLifecycleCallbacks);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ProcessLifecycleOwner.Api29Impl
 * JD-Core Version:    0.7.0.1
 */