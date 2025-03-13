package androidx.fragment.app;

import androidx.core.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public class SpecialEffectsController$Operation
{
  public SpecialEffectsController.Operation.State OooO00o;
  public SpecialEffectsController.Operation.LifecycleImpact OooO0O0;
  public final Fragment OooO0OO;
  public final List OooO0Oo;
  public boolean OooO0o;
  public final Set OooO0o0;
  public boolean OooO0oO;
  
  public SpecialEffectsController$Operation(SpecialEffectsController.Operation.State paramState, SpecialEffectsController.Operation.LifecycleImpact paramLifecycleImpact, Fragment paramFragment, CancellationSignal paramCancellationSignal)
  {
    this.OooO00o = paramState;
    this.OooO0O0 = paramLifecycleImpact;
    this.OooO0OO = paramFragment;
    paramState = new java/util/ArrayList;
    paramState.<init>();
    this.OooO0Oo = paramState;
    paramState = new java/util/LinkedHashSet;
    paramState.<init>();
    this.OooO0o0 = paramState;
    paramState = new androidx/fragment/app/o00oO0o;
    paramState.<init>(this);
    paramCancellationSignal.setOnCancelListener(paramState);
  }
  
  public static final void OooO0O0(Operation paramOperation)
  {
    Intrinsics.OooO0o(paramOperation, "this$0");
    paramOperation.OooO0Oo();
  }
  
  public void OooO() {}
  
  public final void OooO0OO(Runnable paramRunnable)
  {
    Intrinsics.OooO0o(paramRunnable, "listener");
    this.OooO0Oo.add(paramRunnable);
  }
  
  public final void OooO0Oo()
  {
    boolean bool1 = this.OooO0o;
    if (bool1) {
      return;
    }
    this.OooO0o = true;
    Object localObject = this.OooO0o0;
    bool1 = ((Set)localObject).isEmpty();
    if (bool1)
    {
      OooO0o0();
    }
    else
    {
      localObject = CollectionsKt.ooOO(this.OooO0o0).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject).hasNext();
        if (!bool2) {
          break;
        }
        CancellationSignal localCancellationSignal = (CancellationSignal)((Iterator)localObject).next();
        localCancellationSignal.OooO00o();
      }
    }
  }
  
  public final void OooO0o(CancellationSignal paramCancellationSignal)
  {
    Intrinsics.OooO0o(paramCancellationSignal, "signal");
    Set localSet = this.OooO0o0;
    boolean bool = localSet.remove(paramCancellationSignal);
    if (bool)
    {
      paramCancellationSignal = this.OooO0o0;
      bool = paramCancellationSignal.isEmpty();
      if (bool) {
        OooO0o0();
      }
    }
  }
  
  public void OooO0o0()
  {
    boolean bool1 = this.OooO0oO;
    if (bool1) {
      return;
    }
    bool1 = FragmentManager.isLoggingEnabled(2);
    Object localObject2;
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("SpecialEffectsController: ");
      ((StringBuilder)localObject1).append(this);
      localObject2 = " has called complete.";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    bool1 = true;
    this.OooO0oO = bool1;
    Object localObject1 = this.OooO0Oo.iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      localObject2 = (Runnable)((Iterator)localObject1).next();
      ((Runnable)localObject2).run();
    }
  }
  
  public final void OooO0oO(CancellationSignal paramCancellationSignal)
  {
    Intrinsics.OooO0o(paramCancellationSignal, "signal");
    OooO();
    this.OooO0o0.add(paramCancellationSignal);
  }
  
  public final void OooO0oo(SpecialEffectsController.Operation.State paramState, SpecialEffectsController.Operation.LifecycleImpact paramLifecycleImpact)
  {
    Intrinsics.OooO0o(paramState, "finalState");
    Intrinsics.OooO0o(paramLifecycleImpact, "lifecycleImpact");
    Object localObject1 = SpecialEffectsController.Operation.WhenMappings.OooO00o;
    int i = paramLifecycleImpact.ordinal();
    i = localObject1[i];
    int j = 1;
    Object localObject2 = "SpecialEffectsController: For fragment ";
    int k = 2;
    boolean bool2;
    if (i != j)
    {
      localObject1 = " mFinalState = ";
      if (i != k)
      {
        int m = 3;
        if (i == m)
        {
          paramLifecycleImpact = this.OooO00o;
          SpecialEffectsController.Operation.State localState = SpecialEffectsController.Operation.State.o00Ooo00;
          if (paramLifecycleImpact != localState)
          {
            boolean bool1 = FragmentManager.isLoggingEnabled(k);
            if (bool1)
            {
              paramLifecycleImpact = new java/lang/StringBuilder;
              paramLifecycleImpact.<init>();
              paramLifecycleImpact.append((String)localObject2);
              localObject2 = this.OooO0OO;
              paramLifecycleImpact.append(localObject2);
              paramLifecycleImpact.append((String)localObject1);
              localObject1 = this.OooO00o;
              paramLifecycleImpact.append(localObject1);
              localObject1 = " -> ";
              paramLifecycleImpact.append((String)localObject1);
              paramLifecycleImpact.append(paramState);
              j = 46;
              paramLifecycleImpact.append(j);
            }
            this.OooO00o = paramState;
          }
        }
      }
      else
      {
        bool2 = FragmentManager.isLoggingEnabled(k);
        if (bool2)
        {
          paramState = new java/lang/StringBuilder;
          paramState.<init>();
          paramState.append((String)localObject2);
          paramLifecycleImpact = this.OooO0OO;
          paramState.append(paramLifecycleImpact);
          paramState.append((String)localObject1);
          paramLifecycleImpact = this.OooO00o;
          paramState.append(paramLifecycleImpact);
          paramState.append(" -> REMOVED. mLifecycleImpact  = ");
          paramLifecycleImpact = this.OooO0O0;
          paramState.append(paramLifecycleImpact);
          paramLifecycleImpact = " to REMOVING.";
          paramState.append(paramLifecycleImpact);
        }
        paramState = SpecialEffectsController.Operation.State.o00Ooo00;
        this.OooO00o = paramState;
      }
    }
    else
    {
      for (paramState = SpecialEffectsController.Operation.LifecycleImpact.o00Ooo0;; paramState = SpecialEffectsController.Operation.LifecycleImpact.o00Ooo00)
      {
        this.OooO0O0 = paramState;
        break;
        paramState = this.OooO00o;
        paramLifecycleImpact = SpecialEffectsController.Operation.State.o00Ooo00;
        if (paramState != paramLifecycleImpact) {
          break;
        }
        bool2 = FragmentManager.isLoggingEnabled(k);
        if (bool2)
        {
          paramState = new java/lang/StringBuilder;
          paramState.<init>();
          paramState.append((String)localObject2);
          paramLifecycleImpact = this.OooO0OO;
          paramState.append(paramLifecycleImpact);
          paramState.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
          paramLifecycleImpact = this.OooO0O0;
          paramState.append(paramLifecycleImpact);
          paramLifecycleImpact = " to ADDING.";
          paramState.append(paramLifecycleImpact);
        }
        paramState = SpecialEffectsController.Operation.State.o00Ooo0;
        this.OooO00o = paramState;
      }
    }
  }
  
  public final SpecialEffectsController.Operation.State getFinalState()
  {
    return this.OooO00o;
  }
  
  public final Fragment getFragment()
  {
    return this.OooO0OO;
  }
  
  public final SpecialEffectsController.Operation.LifecycleImpact getLifecycleImpact()
  {
    return this.OooO0O0;
  }
  
  public final boolean isCanceled()
  {
    return this.OooO0o;
  }
  
  public final boolean isComplete()
  {
    return this.OooO0oO;
  }
  
  public final void setFinalState(SpecialEffectsController.Operation.State paramState)
  {
    Intrinsics.OooO0o(paramState, "<set-?>");
    this.OooO00o = paramState;
  }
  
  public final void setLifecycleImpact(SpecialEffectsController.Operation.LifecycleImpact paramLifecycleImpact)
  {
    Intrinsics.OooO0o(paramLifecycleImpact, "<set-?>");
    this.OooO0O0 = paramLifecycleImpact;
  }
  
  public String toString()
  {
    Object localObject = Integer.toHexString(System.identityHashCode(this));
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Operation {");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("} {finalState = ");
    localObject = this.OooO00o;
    localStringBuilder.append(localObject);
    localStringBuilder.append(" lifecycleImpact = ");
    localObject = this.OooO0O0;
    localStringBuilder.append(localObject);
    localStringBuilder.append(" fragment = ");
    localObject = this.OooO0OO;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController.Operation
 * JD-Core Version:    0.7.0.1
 */