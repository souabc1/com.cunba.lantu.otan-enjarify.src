package androidx.lifecycle;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class ProcessLifecycleOwner$attach$1
  extends EmptyActivityLifecycleCallbacks
{
  public ProcessLifecycleOwner$attach$1(ProcessLifecycleOwner paramProcessLifecycleOwner) {}
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    paramBundle = "activity";
    Intrinsics.OooO0o(paramActivity, paramBundle);
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i < j)
    {
      paramActivity = ReportFragment.o00Ooo00.OooO0O0(paramActivity);
      paramBundle = ProcessLifecycleOwner.OooO0O0(this.this$0);
      paramActivity.setProcessListener(paramBundle);
    }
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    this.this$0.OooO0Oo();
  }
  
  public void onActivityPreCreated(Activity paramActivity, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    paramBundle = new androidx/lifecycle/ProcessLifecycleOwner$attach$1$onActivityPreCreated$1;
    ProcessLifecycleOwner localProcessLifecycleOwner = this.this$0;
    paramBundle.<init>(localProcessLifecycleOwner);
    ProcessLifecycleOwner.Api29Impl.OooO00o(paramActivity, paramBundle);
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    this.this$0.OooO0oO();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ProcessLifecycleOwner.attach.1
 * JD-Core Version:    0.7.0.1
 */