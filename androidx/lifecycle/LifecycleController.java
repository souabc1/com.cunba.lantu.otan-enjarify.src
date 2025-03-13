package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job.DefaultImpls;

public final class LifecycleController
{
  public final Lifecycle OooO00o;
  public final Lifecycle.State OooO0O0;
  public final DispatchQueue OooO0OO;
  public final LifecycleEventObserver OooO0Oo;
  
  public LifecycleController(Lifecycle paramLifecycle, Lifecycle.State paramState, DispatchQueue paramDispatchQueue, Job paramJob)
  {
    this.OooO00o = paramLifecycle;
    this.OooO0O0 = paramState;
    this.OooO0OO = paramDispatchQueue;
    paramState = new androidx/lifecycle/OooO;
    paramState.<init>(this, paramJob);
    this.OooO0Oo = paramState;
    paramDispatchQueue = paramLifecycle.getCurrentState();
    Lifecycle.State localState = Lifecycle.State.o00OoOoo;
    if (paramDispatchQueue == localState)
    {
      int i = 1;
      paramState = null;
      Job.DefaultImpls.OooO00o(paramJob, null, i, null);
      OooO0O0();
    }
    else
    {
      paramLifecycle.OooO00o(paramState);
    }
  }
  
  public static final void OooO0OO(LifecycleController paramLifecycleController, Job paramJob, LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    Intrinsics.OooO0o(paramLifecycleController, "this$0");
    Intrinsics.OooO0o(paramJob, "$parentJob");
    Intrinsics.OooO0o(paramLifecycleOwner, "source");
    Intrinsics.OooO0o(paramEvent, "<anonymous parameter 1>");
    paramEvent = paramLifecycleOwner.getLifecycle().getCurrentState();
    Lifecycle.State localState = Lifecycle.State.o00OoOoo;
    if (paramEvent == localState)
    {
      int i = 1;
      paramEvent = null;
      Job.DefaultImpls.OooO00o(paramJob, null, i, null);
      paramLifecycleController.OooO0O0();
    }
    else
    {
      paramJob = paramLifecycleOwner.getLifecycle().getCurrentState();
      paramLifecycleOwner = paramLifecycleController.OooO0O0;
      int j = paramJob.compareTo(paramLifecycleOwner);
      paramLifecycleController = paramLifecycleController.OooO0OO;
      if (j < 0) {
        paramLifecycleController.OooO0oo();
      } else {
        paramLifecycleController.OooO();
      }
    }
  }
  
  public final void OooO0O0()
  {
    Lifecycle localLifecycle = this.OooO00o;
    LifecycleEventObserver localLifecycleEventObserver = this.OooO0Oo;
    localLifecycle.OooO0O0(localLifecycleEventObserver);
    this.OooO0OO.OooO0oO();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LifecycleController
 * JD-Core Version:    0.7.0.1
 */