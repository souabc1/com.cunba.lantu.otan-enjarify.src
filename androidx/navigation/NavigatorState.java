package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

public abstract class NavigatorState
{
  public final ReentrantLock OooO00o;
  public final MutableStateFlow OooO0O0;
  public final MutableStateFlow OooO0OO;
  public boolean OooO0Oo;
  public final StateFlow OooO0o;
  public final StateFlow OooO0o0;
  
  public NavigatorState()
  {
    Object localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>(true);
    this.OooO00o = ((ReentrantLock)localObject);
    localObject = StateFlowKt.OooO00o(CollectionsKt.OooO0oo());
    this.OooO0O0 = ((MutableStateFlow)localObject);
    MutableStateFlow localMutableStateFlow = StateFlowKt.OooO00o(SetsKt.OooO0Oo());
    this.OooO0OO = localMutableStateFlow;
    localObject = FlowKt.OooO0O0((MutableStateFlow)localObject);
    this.OooO0o0 = ((StateFlow)localObject);
    localObject = FlowKt.OooO0O0(localMutableStateFlow);
    this.OooO0o = ((StateFlow)localObject);
  }
  
  public void OooO(NavBackStackEntry paramNavBackStackEntry)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "backStackEntry");
    Object localObject1 = (Iterable)this.OooO0OO.getValue();
    boolean bool1 = localObject1 instanceof Collection;
    boolean bool2 = true;
    if (bool1)
    {
      localObject2 = localObject1;
      localObject2 = (Collection)localObject1;
      bool1 = ((Collection)localObject2).isEmpty();
      if (bool1)
      {
        i = 0;
        localObject1 = null;
        break label114;
      }
    }
    localObject1 = ((Iterable)localObject1).iterator();
    do
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (NavBackStackEntry)((Iterator)localObject1).next();
      if (localObject2 == paramNavBackStackEntry)
      {
        bool1 = bool2;
      }
      else
      {
        bool1 = false;
        localObject2 = null;
      }
    } while (!bool1);
    int i = bool2;
    label114:
    Set localSet;
    if (i != 0)
    {
      localObject1 = (Iterable)this.OooO0o0.getValue();
      bool1 = localObject1 instanceof Collection;
      if (bool1)
      {
        localObject2 = localObject1;
        localObject2 = (Collection)localObject1;
        bool1 = ((Collection)localObject2).isEmpty();
        if (bool1)
        {
          bool2 = false;
          localSet = null;
          break label224;
        }
      }
      localObject1 = ((Iterable)localObject1).iterator();
      do
      {
        bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = (NavBackStackEntry)((Iterator)localObject1).next();
        if (localObject2 == paramNavBackStackEntry)
        {
          bool1 = bool2;
        }
        else
        {
          bool1 = false;
          localObject2 = null;
        }
      } while (!bool1);
      label224:
      if (bool2) {
        return;
      }
    }
    localObject1 = (NavBackStackEntry)CollectionsKt.OoooOOO((List)this.OooO0o0.getValue());
    if (localObject1 != null)
    {
      localObject2 = this.OooO0OO;
      localSet = (Set)((MutableStateFlow)localObject2).getValue();
      localObject1 = SetsKt.OooO(localSet, localObject1);
      ((MutableStateFlow)localObject2).setValue(localObject1);
    }
    localObject1 = this.OooO0OO;
    Object localObject2 = SetsKt.OooO((Set)((MutableStateFlow)localObject1).getValue(), paramNavBackStackEntry);
    ((MutableStateFlow)localObject1).setValue(localObject2);
    OooO0oo(paramNavBackStackEntry);
  }
  
  public abstract NavBackStackEntry OooO00o(NavDestination paramNavDestination, Bundle paramBundle);
  
  public void OooO0O0(NavBackStackEntry paramNavBackStackEntry)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "entry");
    MutableStateFlow localMutableStateFlow = this.OooO0OO;
    paramNavBackStackEntry = SetsKt.OooO0oo((Set)localMutableStateFlow.getValue(), paramNavBackStackEntry);
    localMutableStateFlow.setValue(paramNavBackStackEntry);
  }
  
  public void OooO0OO(NavBackStackEntry paramNavBackStackEntry)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "backStackEntry");
    ReentrantLock localReentrantLock = this.OooO00o;
    localReentrantLock.lock();
    try
    {
      Object localObject1 = this.OooO0o0;
      localObject1 = ((StateFlow)localObject1).getValue();
      localObject1 = (Collection)localObject1;
      localObject1 = CollectionsKt.o0OoOo0((Collection)localObject1);
      int i = ((List)localObject1).size();
      ListIterator localListIterator = ((List)localObject1).listIterator(i);
      boolean bool;
      do
      {
        bool = localListIterator.hasPrevious();
        if (!bool) {
          break;
        }
        Object localObject2 = localListIterator.previous();
        localObject2 = (NavBackStackEntry)localObject2;
        localObject2 = ((NavBackStackEntry)localObject2).getId();
        String str = paramNavBackStackEntry.getId();
        bool = Intrinsics.OooO00o(localObject2, str);
      } while (!bool);
      i = localListIterator.nextIndex();
      break label129;
      i = -1;
      label129:
      ((List)localObject1).set(i, paramNavBackStackEntry);
      paramNavBackStackEntry = this.OooO0O0;
      paramNavBackStackEntry.setValue(localObject1);
      paramNavBackStackEntry = Unit.OooO00o;
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public void OooO0Oo(NavBackStackEntry paramNavBackStackEntry)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "backStackEntry");
    Object localObject1 = (List)this.OooO0o0.getValue();
    int i = ((List)localObject1).size();
    localObject1 = ((List)localObject1).listIterator(i);
    boolean bool2;
    do
    {
      boolean bool1 = ((ListIterator)localObject1).hasPrevious();
      if (!bool1) {
        break;
      }
      localObject2 = (NavBackStackEntry)((ListIterator)localObject1).previous();
      String str1 = ((NavBackStackEntry)localObject2).getId();
      String str2 = paramNavBackStackEntry.getId();
      bool2 = Intrinsics.OooO00o(str1, str2);
    } while (!bool2);
    localObject1 = this.OooO0OO;
    Object localObject2 = SetsKt.OooO(SetsKt.OooO((Set)((MutableStateFlow)localObject1).getValue(), localObject2), paramNavBackStackEntry);
    ((MutableStateFlow)localObject1).setValue(localObject2);
    OooO0OO(paramNavBackStackEntry);
    return;
    paramNavBackStackEntry = new java/util/NoSuchElementException;
    paramNavBackStackEntry.<init>("List contains no element matching the predicate.");
    throw paramNavBackStackEntry;
  }
  
  public void OooO0o(NavBackStackEntry paramNavBackStackEntry, boolean paramBoolean)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "popUpTo");
    Object localObject1 = (Iterable)this.OooO0OO.getValue();
    boolean bool1 = localObject1 instanceof Collection;
    int j = 1;
    if (bool1)
    {
      localObject2 = localObject1;
      localObject2 = (Collection)localObject1;
      bool1 = ((Collection)localObject2).isEmpty();
      if (bool1)
      {
        k = 0;
        localObject1 = null;
        break label123;
      }
    }
    localObject1 = ((Iterable)localObject1).iterator();
    do
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (NavBackStackEntry)((Iterator)localObject1).next();
      if (localObject2 == paramNavBackStackEntry)
      {
        bool1 = j;
      }
      else
      {
        bool1 = false;
        localObject2 = null;
      }
    } while (!bool1);
    int k = j;
    label123:
    if (k != 0)
    {
      localObject1 = (Iterable)this.OooO0o0.getValue();
      bool1 = localObject1 instanceof Collection;
      if (bool1)
      {
        localObject2 = localObject1;
        localObject2 = (Collection)localObject1;
        bool1 = ((Collection)localObject2).isEmpty();
        if (bool1)
        {
          k = j;
          break label245;
        }
      }
      localObject1 = ((Iterable)localObject1).iterator();
      do
      {
        bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = (NavBackStackEntry)((Iterator)localObject1).next();
        if (localObject2 == paramNavBackStackEntry)
        {
          bool1 = j;
        }
        else
        {
          bool1 = false;
          localObject2 = null;
        }
      } while (!bool1);
      k = 0;
      localObject1 = null;
      if (k != 0) {
        return;
      }
    }
    label245:
    localObject1 = this.OooO0OO;
    Object localObject2 = SetsKt.OooO((Set)((MutableStateFlow)localObject1).getValue(), paramNavBackStackEntry);
    ((MutableStateFlow)localObject1).setValue(localObject2);
    localObject1 = (List)this.OooO0o0.getValue();
    int i = ((List)localObject1).size();
    localObject1 = ((List)localObject1).listIterator(i);
    int n;
    do
    {
      bool2 = ((ListIterator)localObject1).hasPrevious();
      if (!bool2) {
        break;
      }
      localObject2 = ((ListIterator)localObject1).previous();
      Object localObject3 = localObject2;
      localObject3 = (NavBackStackEntry)localObject2;
      boolean bool3 = Intrinsics.OooO00o(localObject3, paramNavBackStackEntry);
      if (!bool3)
      {
        n = ((List)this.OooO0o0.getValue()).lastIndexOf(localObject3);
        List localList = (List)this.OooO0o0.getValue();
        int m = localList.lastIndexOf(paramNavBackStackEntry);
        if (n < m)
        {
          n = j;
          continue;
        }
      }
      n = 0;
      localObject3 = null;
    } while (n == 0);
    break label433;
    boolean bool2 = false;
    localObject2 = null;
    label433:
    localObject2 = (NavBackStackEntry)localObject2;
    if (localObject2 != null)
    {
      localObject1 = this.OooO0OO;
      Set localSet = (Set)((MutableStateFlow)localObject1).getValue();
      localObject2 = SetsKt.OooO(localSet, localObject2);
      ((MutableStateFlow)localObject1).setValue(localObject2);
    }
    OooO0o0(paramNavBackStackEntry, paramBoolean);
  }
  
  public void OooO0o0(NavBackStackEntry paramNavBackStackEntry, boolean paramBoolean)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "popUpTo");
    ReentrantLock localReentrantLock = this.OooO00o;
    localReentrantLock.lock();
    try
    {
      MutableStateFlow localMutableStateFlow = this.OooO0O0;
      Object localObject1 = localMutableStateFlow.getValue();
      localObject1 = (Iterable)localObject1;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject1 = ((Iterable)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        Object localObject2 = ((Iterator)localObject1).next();
        Object localObject3 = localObject2;
        localObject3 = (NavBackStackEntry)localObject2;
        boolean bool2 = Intrinsics.OooO00o(localObject3, paramNavBackStackEntry) ^ true;
        if (!bool2) {
          break;
        }
        localArrayList.add(localObject2);
      }
      localMutableStateFlow.setValue(localArrayList);
      paramNavBackStackEntry = Unit.OooO00o;
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public void OooO0oO(NavBackStackEntry paramNavBackStackEntry)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "entry");
    MutableStateFlow localMutableStateFlow = this.OooO0OO;
    paramNavBackStackEntry = SetsKt.OooO((Set)localMutableStateFlow.getValue(), paramNavBackStackEntry);
    localMutableStateFlow.setValue(paramNavBackStackEntry);
  }
  
  public void OooO0oo(NavBackStackEntry paramNavBackStackEntry)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "backStackEntry");
    ReentrantLock localReentrantLock = this.OooO00o;
    localReentrantLock.lock();
    try
    {
      MutableStateFlow localMutableStateFlow = this.OooO0O0;
      Object localObject = localMutableStateFlow.getValue();
      localObject = (Collection)localObject;
      paramNavBackStackEntry = CollectionsKt.OoooOoo((Collection)localObject, paramNavBackStackEntry);
      localMutableStateFlow.setValue(paramNavBackStackEntry);
      paramNavBackStackEntry = Unit.OooO00o;
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final StateFlow getBackStack()
  {
    return this.OooO0o0;
  }
  
  public final StateFlow getTransitionsInProgress()
  {
    return this.OooO0o;
  }
  
  public final boolean isNavigating()
  {
    return this.OooO0Oo;
  }
  
  public final void setNavigating(boolean paramBoolean)
  {
    this.OooO0Oo = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavigatorState
 * JD-Core Version:    0.7.0.1
 */