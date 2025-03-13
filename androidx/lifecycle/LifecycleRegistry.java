package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;

public class LifecycleRegistry
  extends Lifecycle
{
  public static final LifecycleRegistry.Companion OooOO0;
  public ArrayList OooO;
  public final boolean OooO0O0;
  public FastSafeIterableMap OooO0OO;
  public Lifecycle.State OooO0Oo;
  public int OooO0o;
  public final WeakReference OooO0o0;
  public boolean OooO0oO;
  public boolean OooO0oo;
  
  static
  {
    LifecycleRegistry.Companion localCompanion = new androidx/lifecycle/LifecycleRegistry$Companion;
    localCompanion.<init>(null);
    OooOO0 = localCompanion;
  }
  
  public LifecycleRegistry(LifecycleOwner paramLifecycleOwner)
  {
    this(paramLifecycleOwner, true);
  }
  
  public LifecycleRegistry(LifecycleOwner paramLifecycleOwner, boolean paramBoolean)
  {
    this.OooO0O0 = paramBoolean;
    Object localObject = new androidx/arch/core/internal/FastSafeIterableMap;
    ((FastSafeIterableMap)localObject).<init>();
    this.OooO0OO = ((FastSafeIterableMap)localObject);
    localObject = Lifecycle.State.o00Ooo00;
    this.OooO0Oo = ((Lifecycle.State)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO = ((ArrayList)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(paramLifecycleOwner);
    this.OooO0o0 = ((WeakReference)localObject);
  }
  
  private final boolean isSynced()
  {
    Object localObject1 = this.OooO0OO;
    int i = ((SafeIterableMap)localObject1).size();
    boolean bool = true;
    if (i == 0) {
      return bool;
    }
    localObject1 = this.OooO0OO.OooO00o();
    Intrinsics.OooO0OO(localObject1);
    localObject1 = ((LifecycleRegistry.ObserverWithState)((Map.Entry)localObject1).getValue()).getState();
    Object localObject2 = this.OooO0OO.OooO0Oo();
    Intrinsics.OooO0OO(localObject2);
    localObject2 = ((LifecycleRegistry.ObserverWithState)((Map.Entry)localObject2).getValue()).getState();
    if (localObject1 == localObject2)
    {
      localObject1 = this.OooO0Oo;
      if (localObject1 == localObject2) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final void OooO(Lifecycle.State paramState)
  {
    Object localObject = this.OooO0Oo;
    if (localObject == paramState) {
      return;
    }
    Lifecycle.State localState = Lifecycle.State.o00Ooo00;
    boolean bool1 = true;
    if (localObject == localState)
    {
      localObject = Lifecycle.State.o00OoOoo;
      if (paramState == localObject)
      {
        i = 0;
        localObject = null;
        break label47;
      }
    }
    int i = bool1;
    label47:
    if (i != 0)
    {
      this.OooO0Oo = paramState;
      boolean bool2 = this.OooO0oO;
      if (!bool2)
      {
        int j = this.OooO0o;
        if (j == 0)
        {
          this.OooO0oO = bool1;
          OooOO0o();
          this.OooO0oO = false;
          paramState = this.OooO0Oo;
          localObject = Lifecycle.State.o00OoOoo;
          if (paramState == localObject)
          {
            paramState = new androidx/arch/core/internal/FastSafeIterableMap;
            paramState.<init>();
            this.OooO0OO = paramState;
          }
          return;
        }
      }
      this.OooO0oo = bool1;
      return;
    }
    paramState = new java/lang/StringBuilder;
    paramState.<init>();
    paramState.append("no event down from ");
    localObject = this.OooO0Oo;
    paramState.append(localObject);
    paramState.append(" in component ");
    localObject = this.OooO0o0.get();
    paramState.append(localObject);
    paramState = paramState.toString();
    localObject = new java/lang/IllegalStateException;
    paramState = paramState.toString();
    ((IllegalStateException)localObject).<init>(paramState);
    throw ((Throwable)localObject);
  }
  
  public void OooO00o(LifecycleObserver paramLifecycleObserver)
  {
    Intrinsics.OooO0o(paramLifecycleObserver, "observer");
    OooO0o0("addObserver");
    Object localObject1 = this.OooO0Oo;
    Object localObject2 = Lifecycle.State.o00OoOoo;
    if (localObject1 != localObject2) {
      localObject2 = Lifecycle.State.o00Ooo00;
    }
    localObject1 = new androidx/lifecycle/LifecycleRegistry$ObserverWithState;
    ((LifecycleRegistry.ObserverWithState)localObject1).<init>(paramLifecycleObserver, (Lifecycle.State)localObject2);
    localObject2 = (LifecycleRegistry.ObserverWithState)this.OooO0OO.OooO0o(paramLifecycleObserver, localObject1);
    if (localObject2 != null) {
      return;
    }
    localObject2 = (LifecycleOwner)this.OooO0o0.get();
    if (localObject2 == null) {
      return;
    }
    int i = this.OooO0o;
    int j = 1;
    if (i == 0)
    {
      bool1 = this.OooO0oO;
      if (!bool1)
      {
        bool1 = false;
        break label115;
      }
    }
    boolean bool1 = j;
    label115:
    Lifecycle.State localState = OooO0Oo(paramLifecycleObserver);
    int k = this.OooO0o + j;
    this.OooO0o = k;
    for (;;)
    {
      Object localObject3 = ((LifecycleRegistry.ObserverWithState)localObject1).getState();
      j = ((Enum)localObject3).compareTo(localState);
      if (j >= 0) {
        break label276;
      }
      localObject3 = this.OooO0OO;
      boolean bool2 = ((FastSafeIterableMap)localObject3).contains(paramLifecycleObserver);
      if (!bool2) {
        break label276;
      }
      localObject3 = ((LifecycleRegistry.ObserverWithState)localObject1).getState();
      OooOO0O((Lifecycle.State)localObject3);
      localObject3 = Lifecycle.Event.Companion;
      localState = ((LifecycleRegistry.ObserverWithState)localObject1).getState();
      localObject3 = ((Lifecycle.Event.Companion)localObject3).OooO0O0(localState);
      if (localObject3 == null) {
        break;
      }
      ((LifecycleRegistry.ObserverWithState)localObject1).OooO00o((LifecycleOwner)localObject2, (Lifecycle.Event)localObject3);
      OooOO0();
      localState = OooO0Oo(paramLifecycleObserver);
    }
    paramLifecycleObserver = new java/lang/IllegalStateException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("no event up from ");
    localObject1 = ((LifecycleRegistry.ObserverWithState)localObject1).getState();
    ((StringBuilder)localObject2).append(localObject1);
    localObject1 = ((StringBuilder)localObject2).toString();
    paramLifecycleObserver.<init>((String)localObject1);
    throw paramLifecycleObserver;
    label276:
    if (!bool1) {
      OooOO0o();
    }
    int m = this.OooO0o + -1;
    this.OooO0o = m;
  }
  
  public void OooO0O0(LifecycleObserver paramLifecycleObserver)
  {
    Intrinsics.OooO0o(paramLifecycleObserver, "observer");
    OooO0o0("removeObserver");
    this.OooO0OO.OooO0oO(paramLifecycleObserver);
  }
  
  public final void OooO0OO(LifecycleOwner paramLifecycleOwner)
  {
    Object localObject1 = this.OooO0OO.descendingIterator();
    Object localObject2 = "observerMap.descendingIterator()";
    Intrinsics.OooO0o0(localObject1, (String)localObject2);
    boolean bool1 = ((Iterator)localObject1).hasNext();
    if (bool1)
    {
      bool1 = this.OooO0oo;
      if (!bool1)
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        Intrinsics.OooO0o0(localObject2, "next()");
        LifecycleObserver localLifecycleObserver = (LifecycleObserver)((Map.Entry)localObject2).getKey();
        localObject2 = (LifecycleRegistry.ObserverWithState)((Map.Entry)localObject2).getValue();
        for (;;)
        {
          Object localObject3 = ((LifecycleRegistry.ObserverWithState)localObject2).getState();
          Lifecycle.State localState = this.OooO0Oo;
          int i = ((Enum)localObject3).compareTo(localState);
          if (i <= 0) {
            break;
          }
          boolean bool2 = this.OooO0oo;
          if (bool2) {
            break;
          }
          localObject3 = this.OooO0OO;
          bool2 = ((FastSafeIterableMap)localObject3).contains(localLifecycleObserver);
          if (!bool2) {
            break;
          }
          localObject3 = Lifecycle.Event.Companion;
          localState = ((LifecycleRegistry.ObserverWithState)localObject2).getState();
          localObject3 = ((Lifecycle.Event.Companion)localObject3).OooO00o(localState);
          if (localObject3 == null) {
            break label186;
          }
          localState = ((Lifecycle.Event)localObject3).getTargetState();
          OooOO0O(localState);
          ((LifecycleRegistry.ObserverWithState)localObject2).OooO00o(paramLifecycleOwner, (Lifecycle.Event)localObject3);
          OooOO0();
        }
        label186:
        paramLifecycleOwner = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("no event down from ");
        localObject2 = ((LifecycleRegistry.ObserverWithState)localObject2).getState();
        ((StringBuilder)localObject1).append(localObject2);
        localObject1 = ((StringBuilder)localObject1).toString();
        paramLifecycleOwner.<init>((String)localObject1);
        throw paramLifecycleOwner;
      }
    }
  }
  
  public final Lifecycle.State OooO0Oo(LifecycleObserver paramLifecycleObserver)
  {
    paramLifecycleObserver = this.OooO0OO.OooO0oo(paramLifecycleObserver);
    Object localObject1 = null;
    if (paramLifecycleObserver != null)
    {
      paramLifecycleObserver = (LifecycleRegistry.ObserverWithState)paramLifecycleObserver.getValue();
      if (paramLifecycleObserver != null)
      {
        paramLifecycleObserver = paramLifecycleObserver.getState();
        break label39;
      }
    }
    paramLifecycleObserver = null;
    label39:
    Object localObject2 = this.OooO;
    boolean bool = ((Collection)localObject2).isEmpty() ^ true;
    if (bool)
    {
      localObject1 = this.OooO;
      int i = ((ArrayList)localObject1).size() + -1;
      localObject1 = (Lifecycle.State)((ArrayList)localObject1).get(i);
    }
    localObject2 = OooOO0;
    Lifecycle.State localState = this.OooO0Oo;
    paramLifecycleObserver = ((LifecycleRegistry.Companion)localObject2).OooO00o(localState, paramLifecycleObserver);
    return ((LifecycleRegistry.Companion)localObject2).OooO00o(paramLifecycleObserver, (Lifecycle.State)localObject1);
  }
  
  public final void OooO0o(LifecycleOwner paramLifecycleOwner)
  {
    Object localObject1 = this.OooO0OO.OooO0OO();
    Object localObject2 = "observerMap.iteratorWithAdditions()";
    Intrinsics.OooO0o0(localObject1, (String)localObject2);
    boolean bool1 = ((Iterator)localObject1).hasNext();
    if (bool1)
    {
      bool1 = this.OooO0oo;
      if (!bool1)
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        LifecycleObserver localLifecycleObserver = (LifecycleObserver)((Map.Entry)localObject2).getKey();
        localObject2 = (LifecycleRegistry.ObserverWithState)((Map.Entry)localObject2).getValue();
        for (;;)
        {
          Object localObject3 = ((LifecycleRegistry.ObserverWithState)localObject2).getState();
          Lifecycle.State localState = this.OooO0Oo;
          int i = ((Enum)localObject3).compareTo(localState);
          if (i >= 0) {
            break;
          }
          boolean bool2 = this.OooO0oo;
          if (bool2) {
            break;
          }
          localObject3 = this.OooO0OO;
          bool2 = ((FastSafeIterableMap)localObject3).contains(localLifecycleObserver);
          if (!bool2) {
            break;
          }
          localObject3 = ((LifecycleRegistry.ObserverWithState)localObject2).getState();
          OooOO0O((Lifecycle.State)localObject3);
          localObject3 = Lifecycle.Event.Companion;
          localState = ((LifecycleRegistry.ObserverWithState)localObject2).getState();
          localObject3 = ((Lifecycle.Event.Companion)localObject3).OooO0O0(localState);
          if (localObject3 == null) {
            break label179;
          }
          ((LifecycleRegistry.ObserverWithState)localObject2).OooO00o(paramLifecycleOwner, (Lifecycle.Event)localObject3);
          OooOO0();
        }
        label179:
        paramLifecycleOwner = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("no event up from ");
        localObject2 = ((LifecycleRegistry.ObserverWithState)localObject2).getState();
        ((StringBuilder)localObject1).append(localObject2);
        localObject1 = ((StringBuilder)localObject1).toString();
        paramLifecycleOwner.<init>((String)localObject1);
        throw paramLifecycleOwner;
      }
    }
  }
  
  public final void OooO0o0(String paramString)
  {
    boolean bool = this.OooO0O0;
    if (bool)
    {
      Object localObject = ArchTaskExecutor.getInstance();
      bool = ((ArchTaskExecutor)localObject).isMainThread();
      if (!bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Method ");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(" must be called on the main thread");
        paramString = ((StringBuilder)localObject).toString();
        localObject = new java/lang/IllegalStateException;
        paramString = paramString.toString();
        ((IllegalStateException)localObject).<init>(paramString);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public void OooO0oO(Lifecycle.Event paramEvent)
  {
    Intrinsics.OooO0o(paramEvent, "event");
    OooO0o0("handleLifecycleEvent");
    paramEvent = paramEvent.getTargetState();
    OooO(paramEvent);
  }
  
  public void OooO0oo(Lifecycle.State paramState)
  {
    Intrinsics.OooO0o(paramState, "state");
    OooO0o0("markState");
    setCurrentState(paramState);
  }
  
  public final void OooOO0()
  {
    ArrayList localArrayList = this.OooO;
    int i = localArrayList.size() + -1;
    localArrayList.remove(i);
  }
  
  public final void OooOO0O(Lifecycle.State paramState)
  {
    this.OooO.add(paramState);
  }
  
  public final void OooOO0o()
  {
    Object localObject1 = (LifecycleOwner)this.OooO0o0.get();
    if (localObject1 != null)
    {
      for (;;)
      {
        boolean bool1 = isSynced();
        boolean bool2 = false;
        Object localObject2 = null;
        this.OooO0oo = false;
        if (bool1) {
          break;
        }
        Object localObject3 = this.OooO0Oo;
        localObject2 = this.OooO0OO.OooO00o();
        Intrinsics.OooO0OO(localObject2);
        localObject2 = ((LifecycleRegistry.ObserverWithState)((Map.Entry)localObject2).getValue()).getState();
        int i = ((Enum)localObject3).compareTo((Enum)localObject2);
        if (i < 0) {
          OooO0OO((LifecycleOwner)localObject1);
        }
        localObject3 = this.OooO0OO.OooO0Oo();
        bool2 = this.OooO0oo;
        if ((!bool2) && (localObject3 != null))
        {
          localObject2 = this.OooO0Oo;
          localObject3 = ((LifecycleRegistry.ObserverWithState)((Map.Entry)localObject3).getValue()).getState();
          i = ((Enum)localObject2).compareTo((Enum)localObject3);
          if (i > 0) {
            OooO0o((LifecycleOwner)localObject1);
          }
        }
      }
      return;
    }
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    throw ((Throwable)localObject1);
  }
  
  public Lifecycle.State getCurrentState()
  {
    return this.OooO0Oo;
  }
  
  public int getObserverCount()
  {
    OooO0o0("getObserverCount");
    return this.OooO0OO.size();
  }
  
  public void setCurrentState(Lifecycle.State paramState)
  {
    Intrinsics.OooO0o(paramState, "state");
    OooO0o0("setCurrentState");
    OooO(paramState);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LifecycleRegistry
 * JD-Core Version:    0.7.0.1
 */