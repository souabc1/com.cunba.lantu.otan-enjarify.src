package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class SpecialEffectsController
{
  public static final SpecialEffectsController.Companion OooO0o;
  public final ViewGroup OooO00o;
  public final List OooO0O0;
  public final List OooO0OO;
  public boolean OooO0Oo;
  public boolean OooO0o0;
  
  static
  {
    SpecialEffectsController.Companion localCompanion = new androidx/fragment/app/SpecialEffectsController$Companion;
    localCompanion.<init>(null);
    OooO0o = localCompanion;
  }
  
  public SpecialEffectsController(ViewGroup paramViewGroup)
  {
    this.OooO00o = paramViewGroup;
    paramViewGroup = new java/util/ArrayList;
    paramViewGroup.<init>();
    this.OooO0O0 = paramViewGroup;
    paramViewGroup = new java/util/ArrayList;
    paramViewGroup.<init>();
    this.OooO0OO = paramViewGroup;
  }
  
  public static final void OooO0Oo(SpecialEffectsController paramSpecialEffectsController, SpecialEffectsController.FragmentStateManagerOperation paramFragmentStateManagerOperation)
  {
    Intrinsics.OooO0o(paramSpecialEffectsController, "this$0");
    String str = "$operation";
    Intrinsics.OooO0o(paramFragmentStateManagerOperation, str);
    paramSpecialEffectsController = paramSpecialEffectsController.OooO0O0;
    boolean bool = paramSpecialEffectsController.contains(paramFragmentStateManagerOperation);
    if (bool)
    {
      paramSpecialEffectsController = paramFragmentStateManagerOperation.getFinalState();
      paramFragmentStateManagerOperation = paramFragmentStateManagerOperation.getFragment().mView;
      str = "operation.fragment.mView";
      Intrinsics.OooO0o0(paramFragmentStateManagerOperation, str);
      paramSpecialEffectsController.OooO0OO(paramFragmentStateManagerOperation);
    }
  }
  
  public static final void OooO0o0(SpecialEffectsController paramSpecialEffectsController, SpecialEffectsController.FragmentStateManagerOperation paramFragmentStateManagerOperation)
  {
    Intrinsics.OooO0o(paramSpecialEffectsController, "this$0");
    Intrinsics.OooO0o(paramFragmentStateManagerOperation, "$operation");
    paramSpecialEffectsController.OooO0O0.remove(paramFragmentStateManagerOperation);
    paramSpecialEffectsController.OooO0OO.remove(paramFragmentStateManagerOperation);
  }
  
  public static final SpecialEffectsController OooOOo(ViewGroup paramViewGroup, SpecialEffectsControllerFactory paramSpecialEffectsControllerFactory)
  {
    return OooO0o.OooO0O0(paramViewGroup, paramSpecialEffectsControllerFactory);
  }
  
  public static final SpecialEffectsController OooOOo0(ViewGroup paramViewGroup, FragmentManager paramFragmentManager)
  {
    return OooO0o.OooO00o(paramViewGroup, paramFragmentManager);
  }
  
  public final void OooO(FragmentStateManager paramFragmentStateManager)
  {
    Object localObject1 = "fragmentStateManager";
    Intrinsics.OooO0o(paramFragmentStateManager, (String)localObject1);
    boolean bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("SpecialEffectsController: Enqueuing show operation for fragment ");
      localObject2 = paramFragmentStateManager.getFragment();
      ((StringBuilder)localObject1).append(localObject2);
    }
    localObject1 = SpecialEffectsController.Operation.State.o00Ooo0;
    Object localObject2 = SpecialEffectsController.Operation.LifecycleImpact.o00OoOoo;
    OooO0OO((SpecialEffectsController.Operation.State)localObject1, (SpecialEffectsController.Operation.LifecycleImpact)localObject2, paramFragmentStateManager);
  }
  
  public final void OooO0OO(SpecialEffectsController.Operation.State paramState, SpecialEffectsController.Operation.LifecycleImpact paramLifecycleImpact, FragmentStateManager paramFragmentStateManager)
  {
    synchronized (this.OooO0O0)
    {
      CancellationSignal localCancellationSignal = new androidx/core/os/CancellationSignal;
      localCancellationSignal.<init>();
      Object localObject = paramFragmentStateManager.getFragment();
      String str = "fragmentStateManager.fragment";
      Intrinsics.OooO0o0(localObject, str);
      localObject = OooOO0o((Fragment)localObject);
      if (localObject != null)
      {
        ((SpecialEffectsController.Operation)localObject).OooO0oo(paramState, paramLifecycleImpact);
        return;
      }
      localObject = new androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;
      ((SpecialEffectsController.FragmentStateManagerOperation)localObject).<init>(paramState, paramLifecycleImpact, paramFragmentStateManager, localCancellationSignal);
      paramState = this.OooO0O0;
      paramState.add(localObject);
      paramState = new androidx/fragment/app/o00Ooo;
      paramState.<init>(this, (SpecialEffectsController.FragmentStateManagerOperation)localObject);
      ((SpecialEffectsController.Operation)localObject).OooO0OO(paramState);
      paramState = new androidx/fragment/app/oo000o;
      paramState.<init>(this, (SpecialEffectsController.FragmentStateManagerOperation)localObject);
      ((SpecialEffectsController.Operation)localObject).OooO0OO(paramState);
      paramState = Unit.OooO00o;
      return;
    }
  }
  
  public final void OooO0o(SpecialEffectsController.Operation.State paramState, FragmentStateManager paramFragmentStateManager)
  {
    Intrinsics.OooO0o(paramState, "finalState");
    Object localObject = "fragmentStateManager";
    Intrinsics.OooO0o(paramFragmentStateManager, (String)localObject);
    boolean bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("SpecialEffectsController: Enqueuing add operation for fragment ");
      Fragment localFragment = paramFragmentStateManager.getFragment();
      ((StringBuilder)localObject).append(localFragment);
    }
    localObject = SpecialEffectsController.Operation.LifecycleImpact.o00Ooo00;
    OooO0OO(paramState, (SpecialEffectsController.Operation.LifecycleImpact)localObject, paramFragmentStateManager);
  }
  
  public final void OooO0oO(FragmentStateManager paramFragmentStateManager)
  {
    Object localObject1 = "fragmentStateManager";
    Intrinsics.OooO0o(paramFragmentStateManager, (String)localObject1);
    boolean bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("SpecialEffectsController: Enqueuing hide operation for fragment ");
      localObject2 = paramFragmentStateManager.getFragment();
      ((StringBuilder)localObject1).append(localObject2);
    }
    localObject1 = SpecialEffectsController.Operation.State.o00Ooo0O;
    Object localObject2 = SpecialEffectsController.Operation.LifecycleImpact.o00OoOoo;
    OooO0OO((SpecialEffectsController.Operation.State)localObject1, (SpecialEffectsController.Operation.LifecycleImpact)localObject2, paramFragmentStateManager);
  }
  
  public final void OooO0oo(FragmentStateManager paramFragmentStateManager)
  {
    Object localObject1 = "fragmentStateManager";
    Intrinsics.OooO0o(paramFragmentStateManager, (String)localObject1);
    boolean bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("SpecialEffectsController: Enqueuing remove operation for fragment ");
      localObject2 = paramFragmentStateManager.getFragment();
      ((StringBuilder)localObject1).append(localObject2);
    }
    localObject1 = SpecialEffectsController.Operation.State.o00Ooo00;
    Object localObject2 = SpecialEffectsController.Operation.LifecycleImpact.o00Ooo0;
    OooO0OO((SpecialEffectsController.Operation.State)localObject1, (SpecialEffectsController.Operation.LifecycleImpact)localObject2, paramFragmentStateManager);
  }
  
  public abstract void OooOO0(List paramList, boolean paramBoolean);
  
  public final void OooOO0O()
  {
    boolean bool1 = this.OooO0o0;
    if (bool1) {
      return;
    }
    ??? = this.OooO00o;
    bool1 = ViewCompat.o000oOoO((View)???);
    Unit localUnit = null;
    if (!bool1)
    {
      OooOOO();
      this.OooO0Oo = false;
      return;
    }
    synchronized (this.OooO0O0)
    {
      Object localObject3 = this.OooO0O0;
      boolean bool2 = ((Collection)localObject3).isEmpty() ^ true;
      if (bool2)
      {
        localObject3 = this.OooO0OO;
        localObject3 = CollectionsKt.o0OoOo0((Collection)localObject3);
        Object localObject4 = this.OooO0OO;
        ((List)localObject4).clear();
        localObject3 = ((List)localObject3).iterator();
        int j;
        Object localObject6;
        for (;;)
        {
          bool3 = ((Iterator)localObject3).hasNext();
          int i = 2;
          if (!bool3) {
            break;
          }
          localObject4 = ((Iterator)localObject3).next();
          localObject4 = (SpecialEffectsController.Operation)localObject4;
          j = FragmentManager.isLoggingEnabled(i);
          Object localObject5;
          if (j != 0)
          {
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "SpecialEffectsController: Cancelling operation ";
            ((StringBuilder)localObject5).append((String)localObject6);
            ((StringBuilder)localObject5).append(localObject4);
          }
          ((SpecialEffectsController.Operation)localObject4).OooO0Oo();
          j = ((SpecialEffectsController.Operation)localObject4).isComplete();
          if (j == 0)
          {
            localObject5 = this.OooO0OO;
            ((List)localObject5).add(localObject4);
          }
        }
        OooOo00();
        localObject3 = this.OooO0O0;
        localObject3 = CollectionsKt.o0OoOo0((Collection)localObject3);
        localObject4 = this.OooO0O0;
        ((List)localObject4).clear();
        localObject4 = this.OooO0OO;
        ((List)localObject4).addAll((Collection)localObject3);
        boolean bool3 = FragmentManager.isLoggingEnabled(j);
        localObject4 = ((List)localObject3).iterator();
        for (;;)
        {
          boolean bool4 = ((Iterator)localObject4).hasNext();
          if (!bool4) {
            break;
          }
          localObject6 = ((Iterator)localObject4).next();
          localObject6 = (SpecialEffectsController.Operation)localObject6;
          ((SpecialEffectsController.Operation)localObject6).OooO();
        }
        bool3 = this.OooO0Oo;
        OooOO0((List)localObject3, bool3);
        this.OooO0Oo = false;
        FragmentManager.isLoggingEnabled(j);
      }
      localUnit = Unit.OooO00o;
      return;
    }
  }
  
  public final SpecialEffectsController.Operation OooOO0o(Fragment paramFragment)
  {
    Iterator localIterator = this.OooO0O0.iterator();
    boolean bool3;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = localIterator.next();
      Object localObject2 = localObject1;
      localObject2 = (SpecialEffectsController.Operation)localObject1;
      Fragment localFragment = ((SpecialEffectsController.Operation)localObject2).getFragment();
      boolean bool2 = Intrinsics.OooO00o(localFragment, paramFragment);
      if (bool2)
      {
        bool3 = ((SpecialEffectsController.Operation)localObject2).isCanceled();
        if (!bool3)
        {
          bool3 = true;
          continue;
        }
      }
      bool3 = false;
      localObject2 = null;
    } while (!bool3);
    break label97;
    boolean bool1 = false;
    Object localObject1 = null;
    label97:
    return (SpecialEffectsController.Operation)localObject1;
  }
  
  public final void OooOOO()
  {
    int i = 2;
    FragmentManager.isLoggingEnabled(i);
    ViewGroup localViewGroup = this.OooO00o;
    boolean bool1 = ViewCompat.o000oOoO(localViewGroup);
    synchronized (this.OooO0O0)
    {
      OooOo00();
      Object localObject1 = this.OooO0O0;
      localObject1 = ((List)localObject1).iterator();
      boolean bool2;
      Object localObject2;
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = ((Iterator)localObject1).next();
        localObject2 = (SpecialEffectsController.Operation)localObject2;
        ((SpecialEffectsController.Operation)localObject2).OooO();
      }
      localObject1 = this.OooO0OO;
      localObject1 = CollectionsKt.o0OoOo0((Collection)localObject1);
      localObject1 = ((List)localObject1).iterator();
      boolean bool3;
      Object localObject3;
      Object localObject4;
      String str;
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = ((Iterator)localObject1).next();
        localObject2 = (SpecialEffectsController.Operation)localObject2;
        bool3 = FragmentManager.isLoggingEnabled(i);
        if (bool3)
        {
          if (bool1)
          {
            localObject3 = "";
          }
          else
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject4 = "Container ";
            ((StringBuilder)localObject3).append((String)localObject4);
            localObject4 = this.OooO00o;
            ((StringBuilder)localObject3).append(localObject4);
            localObject4 = " is not attached to window. ";
            ((StringBuilder)localObject3).append((String)localObject4);
            localObject3 = ((StringBuilder)localObject3).toString();
          }
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          str = "SpecialEffectsController: ";
          ((StringBuilder)localObject4).append(str);
          ((StringBuilder)localObject4).append((String)localObject3);
          localObject3 = "Cancelling running operation ";
          ((StringBuilder)localObject4).append((String)localObject3);
          ((StringBuilder)localObject4).append(localObject2);
        }
        ((SpecialEffectsController.Operation)localObject2).OooO0Oo();
      }
      localObject1 = this.OooO0O0;
      localObject1 = CollectionsKt.o0OoOo0((Collection)localObject1);
      localObject1 = ((List)localObject1).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = ((Iterator)localObject1).next();
        localObject2 = (SpecialEffectsController.Operation)localObject2;
        bool3 = FragmentManager.isLoggingEnabled(i);
        if (bool3)
        {
          if (bool1)
          {
            localObject3 = "";
          }
          else
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject4 = "Container ";
            ((StringBuilder)localObject3).append((String)localObject4);
            localObject4 = this.OooO00o;
            ((StringBuilder)localObject3).append(localObject4);
            localObject4 = " is not attached to window. ";
            ((StringBuilder)localObject3).append((String)localObject4);
            localObject3 = ((StringBuilder)localObject3).toString();
          }
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          str = "SpecialEffectsController: ";
          ((StringBuilder)localObject4).append(str);
          ((StringBuilder)localObject4).append((String)localObject3);
          localObject3 = "Cancelling pending operation ";
          ((StringBuilder)localObject4).append((String)localObject3);
          ((StringBuilder)localObject4).append(localObject2);
        }
        ((SpecialEffectsController.Operation)localObject2).OooO0Oo();
      }
      Unit localUnit = Unit.OooO00o;
      return;
    }
  }
  
  public final SpecialEffectsController.Operation OooOOO0(Fragment paramFragment)
  {
    Iterator localIterator = this.OooO0OO.iterator();
    boolean bool3;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = localIterator.next();
      Object localObject2 = localObject1;
      localObject2 = (SpecialEffectsController.Operation)localObject1;
      Fragment localFragment = ((SpecialEffectsController.Operation)localObject2).getFragment();
      boolean bool2 = Intrinsics.OooO00o(localFragment, paramFragment);
      if (bool2)
      {
        bool3 = ((SpecialEffectsController.Operation)localObject2).isCanceled();
        if (!bool3)
        {
          bool3 = true;
          continue;
        }
      }
      bool3 = false;
      localObject2 = null;
    } while (!bool3);
    break label97;
    boolean bool1 = false;
    Object localObject1 = null;
    label97:
    return (SpecialEffectsController.Operation)localObject1;
  }
  
  public final void OooOOOO()
  {
    boolean bool = this.OooO0o0;
    if (bool)
    {
      FragmentManager.isLoggingEnabled(2);
      bool = false;
      this.OooO0o0 = false;
      OooOO0O();
    }
  }
  
  public final SpecialEffectsController.Operation.LifecycleImpact OooOOOo(FragmentStateManager paramFragmentStateManager)
  {
    Intrinsics.OooO0o(paramFragmentStateManager, "fragmentStateManager");
    paramFragmentStateManager = paramFragmentStateManager.getFragment();
    Intrinsics.OooO0o0(paramFragmentStateManager, "fragmentStateManager.fragment");
    Object localObject = OooOO0o(paramFragmentStateManager);
    SpecialEffectsController.Operation.LifecycleImpact localLifecycleImpact = null;
    if (localObject != null) {
      localObject = ((SpecialEffectsController.Operation)localObject).getLifecycleImpact();
    } else {
      localObject = null;
    }
    paramFragmentStateManager = OooOOO0(paramFragmentStateManager);
    if (paramFragmentStateManager != null) {
      localLifecycleImpact = paramFragmentStateManager.getLifecycleImpact();
    }
    int i = -1;
    int j;
    if (localObject == null)
    {
      j = i;
    }
    else
    {
      int[] arrayOfInt = SpecialEffectsController.WhenMappings.OooO00o;
      int k = ((Enum)localObject).ordinal();
      j = arrayOfInt[k];
    }
    if (j != i)
    {
      i = 1;
      if (j != i) {}
    }
    else
    {
      localObject = localLifecycleImpact;
    }
    return localObject;
  }
  
  public final void OooOOoo()
  {
    synchronized (this.OooO0O0)
    {
      OooOo00();
      Object localObject1 = this.OooO0O0;
      int i = ((List)localObject1).size();
      localObject1 = ((List)localObject1).listIterator(i);
      boolean bool2;
      Fragment localFragment;
      int j;
      do
      {
        bool1 = ((ListIterator)localObject1).hasPrevious();
        bool2 = false;
        localFragment = null;
        if (!bool1) {
          break;
        }
        localObject3 = ((ListIterator)localObject1).previous();
        Object localObject4 = localObject3;
        localObject4 = (SpecialEffectsController.Operation)localObject3;
        Object localObject5 = SpecialEffectsController.Operation.State.o00OoOoo;
        Object localObject6 = ((SpecialEffectsController.Operation)localObject4).getFragment();
        localObject6 = ((Fragment)localObject6).mView;
        String str = "operation.fragment.mView";
        Intrinsics.OooO0o0(localObject6, str);
        localObject5 = ((SpecialEffectsController.Operation.State.Companion)localObject5).OooO00o((View)localObject6);
        localObject4 = ((SpecialEffectsController.Operation)localObject4).getFinalState();
        localObject6 = SpecialEffectsController.Operation.State.o00Ooo0;
        if ((localObject4 == localObject6) && (localObject5 != localObject6))
        {
          j = 1;
        }
        else
        {
          j = 0;
          localObject4 = null;
        }
      } while (j == 0);
      break label157;
      boolean bool1 = false;
      Object localObject3 = null;
      label157:
      localObject3 = (SpecialEffectsController.Operation)localObject3;
      if (localObject3 != null) {
        localFragment = ((SpecialEffectsController.Operation)localObject3).getFragment();
      }
      if (localFragment != null) {
        bool2 = localFragment.isPostponed();
      }
      this.OooO0o0 = bool2;
      localObject1 = Unit.OooO00o;
      return;
    }
  }
  
  public final void OooOo0(boolean paramBoolean)
  {
    this.OooO0Oo = paramBoolean;
  }
  
  public final void OooOo00()
  {
    Iterator localIterator = this.OooO0O0.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      SpecialEffectsController.Operation localOperation = (SpecialEffectsController.Operation)localIterator.next();
      Object localObject1 = localOperation.getLifecycleImpact();
      Object localObject2 = SpecialEffectsController.Operation.LifecycleImpact.o00Ooo00;
      if (localObject1 == localObject2)
      {
        localObject1 = localOperation.getFragment().requireView();
        Intrinsics.OooO0o0(localObject1, "fragment.requireView()");
        localObject2 = SpecialEffectsController.Operation.State.o00OoOoo;
        int i = ((View)localObject1).getVisibility();
        localObject1 = ((SpecialEffectsController.Operation.State.Companion)localObject2).OooO0O0(i);
        localObject2 = SpecialEffectsController.Operation.LifecycleImpact.o00OoOoo;
        localOperation.OooO0oo((SpecialEffectsController.Operation.State)localObject1, (SpecialEffectsController.Operation.LifecycleImpact)localObject2);
      }
    }
  }
  
  public final ViewGroup getContainer()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController
 * JD-Core Version:    0.7.0.1
 */