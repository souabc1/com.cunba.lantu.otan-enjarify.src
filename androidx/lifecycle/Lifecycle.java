package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

public abstract class Lifecycle
{
  public AtomicReference OooO00o;
  
  public Lifecycle()
  {
    AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
    localAtomicReference.<init>();
    this.OooO00o = localAtomicReference;
  }
  
  public abstract void OooO00o(LifecycleObserver paramLifecycleObserver);
  
  public abstract void OooO0O0(LifecycleObserver paramLifecycleObserver);
  
  public abstract Lifecycle.State getCurrentState();
  
  public final AtomicReference getInternalScopeRef()
  {
    return this.OooO00o;
  }
  
  public final void setInternalScopeRef(AtomicReference paramAtomicReference)
  {
    Intrinsics.OooO0o(paramAtomicReference, "<set-?>");
    this.OooO00o = paramAtomicReference;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.Lifecycle
 * JD-Core Version:    0.7.0.1
 */