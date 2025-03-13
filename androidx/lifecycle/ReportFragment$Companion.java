package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build.VERSION;
import kotlin.jvm.internal.Intrinsics;

public final class ReportFragment$Companion
{
  public final void OooO00o(Activity paramActivity, Lifecycle.Event paramEvent)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    String str = "event";
    Intrinsics.OooO0o(paramEvent, str);
    boolean bool = paramActivity instanceof LifecycleRegistryOwner;
    if (bool)
    {
      ((LifecycleRegistryOwner)paramActivity).getLifecycle().OooO0oO(paramEvent);
      return;
    }
    bool = paramActivity instanceof LifecycleOwner;
    if (bool)
    {
      paramActivity = ((LifecycleOwner)paramActivity).getLifecycle();
      bool = paramActivity instanceof LifecycleRegistry;
      if (bool)
      {
        paramActivity = (LifecycleRegistry)paramActivity;
        paramActivity.OooO0oO(paramEvent);
      }
    }
  }
  
  public final ReportFragment OooO0O0(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "<this>");
    paramActivity = paramActivity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    Intrinsics.OooO0Oo(paramActivity, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
    return (ReportFragment)paramActivity;
  }
  
  public final void OooO0OO(Activity paramActivity)
  {
    Object localObject1 = "activity";
    Intrinsics.OooO0o(paramActivity, (String)localObject1);
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      localObject1 = ReportFragment.LifecycleCallbacks.Companion;
      ((ReportFragment.LifecycleCallbacks.Companion)localObject1).OooO00o(paramActivity);
    }
    paramActivity = paramActivity.getFragmentManager();
    localObject1 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    Object localObject2 = paramActivity.findFragmentByTag((String)localObject1);
    if (localObject2 == null)
    {
      localObject2 = paramActivity.beginTransaction();
      ReportFragment localReportFragment = new androidx/lifecycle/ReportFragment;
      localReportFragment.<init>();
      localObject1 = ((FragmentTransaction)localObject2).add(localReportFragment, (String)localObject1);
      ((FragmentTransaction)localObject1).commit();
      paramActivity.executePendingTransactions();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ReportFragment.Companion
 * JD-Core Version:    0.7.0.1
 */