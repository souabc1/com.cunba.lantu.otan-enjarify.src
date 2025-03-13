package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

public final class LifecycleRegistry$ObserverWithState
{
  public Lifecycle.State OooO00o;
  public LifecycleEventObserver OooO0O0;
  
  public LifecycleRegistry$ObserverWithState(LifecycleObserver paramLifecycleObserver, Lifecycle.State paramState)
  {
    Intrinsics.OooO0OO(paramLifecycleObserver);
    paramLifecycleObserver = Lifecycling.OooO0o(paramLifecycleObserver);
    this.OooO0O0 = paramLifecycleObserver;
    this.OooO00o = paramState;
  }
  
  public final void OooO00o(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    Intrinsics.OooO0o(paramEvent, "event");
    Lifecycle.State localState1 = paramEvent.getTargetState();
    Object localObject = LifecycleRegistry.OooOO0;
    Lifecycle.State localState2 = this.OooO00o;
    localObject = ((LifecycleRegistry.Companion)localObject).OooO00o(localState2, localState1);
    this.OooO00o = ((Lifecycle.State)localObject);
    localObject = this.OooO0O0;
    Intrinsics.OooO0OO(paramLifecycleOwner);
    ((LifecycleEventObserver)localObject).OooO0OO(paramLifecycleOwner, paramEvent);
    this.OooO00o = localState1;
  }
  
  public final LifecycleEventObserver getLifecycleObserver()
  {
    return this.OooO0O0;
  }
  
  public final Lifecycle.State getState()
  {
    return this.OooO00o;
  }
  
  public final void setLifecycleObserver(LifecycleEventObserver paramLifecycleEventObserver)
  {
    Intrinsics.OooO0o(paramLifecycleEventObserver, "<set-?>");
    this.OooO0O0 = paramLifecycleEventObserver;
  }
  
  public final void setState(Lifecycle.State paramState)
  {
    Intrinsics.OooO0o(paramState, "<set-?>");
    this.OooO00o = paramState;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LifecycleRegistry.ObserverWithState
 * JD-Core Version:    0.7.0.1
 */