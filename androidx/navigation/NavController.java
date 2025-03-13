package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.collection.SparseArrayCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

public class NavController
{
  public static final NavController.Companion Oooo0;
  public static boolean Oooo0O0 = true;
  public final MutableStateFlow OooO;
  public final Context OooO00o;
  public Activity OooO0O0;
  public NavInflater OooO0OO;
  public NavGraph OooO0Oo;
  public Parcelable[] OooO0o;
  public Bundle OooO0o0;
  public boolean OooO0oO;
  public final ArrayDeque OooO0oo;
  public final StateFlow OooOO0;
  public final MutableStateFlow OooOO0O;
  public final StateFlow OooOO0o;
  public final Map OooOOO;
  public final Map OooOOO0;
  public final Map OooOOOO;
  public final Map OooOOOo;
  public OnBackPressedDispatcher OooOOo;
  public LifecycleOwner OooOOo0;
  public NavControllerViewModel OooOOoo;
  public boolean OooOo;
  public Lifecycle.State OooOo0;
  public final CopyOnWriteArrayList OooOo00;
  public final LifecycleObserver OooOo0O;
  public final OnBackPressedCallback OooOo0o;
  public final Map OooOoO;
  public NavigatorProvider OooOoO0;
  public Function1 OooOoOO;
  public final Map OooOoo;
  public Function1 OooOoo0;
  public int OooOooO;
  public final List OooOooo;
  public final Lazy Oooo000;
  public final MutableSharedFlow Oooo00O;
  public final Flow Oooo00o;
  
  static
  {
    NavController.Companion localCompanion = new androidx/navigation/NavController$Companion;
    localCompanion.<init>(null);
    Oooo0 = localCompanion;
  }
  
  public NavController(Context paramContext)
  {
    this.OooO00o = paramContext;
    Object localObject1 = NavController.activity.1.o00OoOoo;
    paramContext = SequencesKt.OooO0o(paramContext, (Function1)localObject1).iterator();
    boolean bool2;
    do
    {
      bool1 = paramContext.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = paramContext.next();
      localObject2 = localObject1;
      localObject2 = (Context)localObject1;
      bool2 = localObject2 instanceof Activity;
    } while (!bool2);
    break label76;
    boolean bool1 = false;
    localObject1 = null;
    label76:
    localObject1 = (Activity)localObject1;
    this.OooO0O0 = ((Activity)localObject1);
    paramContext = new kotlin/collections/ArrayDeque;
    paramContext.<init>();
    this.OooO0oo = paramContext;
    paramContext = StateFlowKt.OooO00o(CollectionsKt.OooO0oo());
    this.OooO = paramContext;
    paramContext = FlowKt.OooO0O0(paramContext);
    this.OooOO0 = paramContext;
    paramContext = StateFlowKt.OooO00o(CollectionsKt.OooO0oo());
    this.OooOO0O = paramContext;
    paramContext = FlowKt.OooO0O0(paramContext);
    this.OooOO0o = paramContext;
    paramContext = new java/util/LinkedHashMap;
    paramContext.<init>();
    this.OooOOO0 = paramContext;
    paramContext = new java/util/LinkedHashMap;
    paramContext.<init>();
    this.OooOOO = paramContext;
    paramContext = new java/util/LinkedHashMap;
    paramContext.<init>();
    this.OooOOOO = paramContext;
    paramContext = new java/util/LinkedHashMap;
    paramContext.<init>();
    this.OooOOOo = paramContext;
    paramContext = new java/util/concurrent/CopyOnWriteArrayList;
    paramContext.<init>();
    this.OooOo00 = paramContext;
    paramContext = Lifecycle.State.o00Ooo00;
    this.OooOo0 = paramContext;
    paramContext = new androidx/navigation/OooO00o;
    paramContext.<init>(this);
    this.OooOo0O = paramContext;
    paramContext = new androidx/navigation/NavController$onBackPressedCallback$1;
    paramContext.<init>(this);
    this.OooOo0o = paramContext;
    int i = 1;
    this.OooOo = i;
    localObject1 = new androidx/navigation/NavigatorProvider;
    ((NavigatorProvider)localObject1).<init>();
    this.OooOoO0 = ((NavigatorProvider)localObject1);
    localObject1 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject1).<init>();
    this.OooOoO = ((Map)localObject1);
    localObject1 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject1).<init>();
    this.OooOoo = ((Map)localObject1);
    localObject1 = this.OooOoO0;
    Object localObject2 = new androidx/navigation/NavGraphNavigator;
    ((NavGraphNavigator)localObject2).<init>((NavigatorProvider)localObject1);
    ((NavigatorProvider)localObject1).OooO0O0((Navigator)localObject2);
    localObject1 = this.OooOoO0;
    localObject2 = new androidx/navigation/ActivityNavigator;
    Context localContext = this.OooO00o;
    ((ActivityNavigator)localObject2).<init>(localContext);
    ((NavigatorProvider)localObject1).OooO0O0((Navigator)localObject2);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.OooOooo = ((List)localObject1);
    localObject1 = new androidx/navigation/NavController$navInflater$2;
    ((NavController.navInflater.2)localObject1).<init>(this);
    localObject1 = LazyKt.OooO0O0((Function0)localObject1);
    this.Oooo000 = ((Lazy)localObject1);
    localObject1 = BufferOverflow.o00Ooo00;
    paramContext = SharedFlowKt.OooO0O0(i, 0, (BufferOverflow)localObject1, 2, null);
    this.Oooo00O = paramContext;
    paramContext = FlowKt.OooO00o(paramContext);
    this.Oooo00o = paramContext;
  }
  
  public static final void OooOooO(NavController paramNavController, LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    Intrinsics.OooO0o(paramNavController, "this$0");
    String str = "<anonymous parameter 0>";
    Intrinsics.OooO0o(paramLifecycleOwner, str);
    Intrinsics.OooO0o(paramEvent, "event");
    paramLifecycleOwner = paramEvent.getTargetState();
    paramNavController.OooOo0 = paramLifecycleOwner;
    paramLifecycleOwner = paramNavController.OooO0Oo;
    if (paramLifecycleOwner != null)
    {
      paramNavController = paramNavController.OooO0oo.iterator();
      for (;;)
      {
        boolean bool = paramNavController.hasNext();
        if (!bool) {
          break;
        }
        paramLifecycleOwner = (NavBackStackEntry)paramNavController.next();
        paramLifecycleOwner.OooO0OO(paramEvent);
      }
    }
  }
  
  private final int getDestinationCountOnBackStack()
  {
    Object localObject = this.OooO0oo;
    boolean bool = localObject instanceof Collection;
    int i = 0;
    if (bool)
    {
      bool = ((Collection)localObject).isEmpty();
      if (bool) {}
    }
    else
    {
      localObject = ((Iterable)localObject).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject).hasNext();
        if (!bool) {
          break;
        }
        NavDestination localNavDestination = ((NavBackStackEntry)((Iterator)localObject).next()).getDestination();
        bool = localNavDestination instanceof NavGraph ^ true;
        if (bool)
        {
          i += 1;
          if (i < 0) {
            CollectionsKt.OooOOOO();
          }
        }
      }
    }
    return i;
  }
  
  public final void OooOOOo(NavDestination paramNavDestination, Bundle paramBundle, NavBackStackEntry paramNavBackStackEntry, List paramList)
  {
    NavController localNavController = this;
    NavDestination localNavDestination = paramNavDestination;
    Object localObject1 = paramBundle;
    Object localObject2 = paramNavBackStackEntry;
    Object localObject3 = paramList;
    Object localObject4 = paramNavBackStackEntry.getDestination();
    boolean bool1 = localObject4 instanceof FloatingWindow;
    boolean bool6;
    Object localObject6;
    if (!bool1) {
      do
      {
        localObject5 = localNavController.OooO0oo;
        bool1 = ((ArrayDeque)localObject5).isEmpty();
        if (bool1) {
          break;
        }
        localObject5 = ((NavBackStackEntry)localNavController.OooO0oo.OooO()).getDestination();
        bool1 = localObject5 instanceof FloatingWindow;
        if (!bool1) {
          break;
        }
        int i1 = ((NavBackStackEntry)localNavController.OooO0oo.OooO()).getDestination().getId();
        bool6 = true;
        localObject6 = null;
        i4 = 4;
        f1 = 5.605194E-045F;
        localObject7 = null;
        localObject5 = this;
        bool1 = OoooO00(this, i1, bool6, false, i4, null);
      } while (bool1);
    }
    Object localObject7 = new kotlin/collections/ArrayDeque;
    ((ArrayDeque)localObject7).<init>();
    bool1 = localNavDestination instanceof NavGraph;
    int i4 = 1;
    float f1 = 1.4E-45F;
    Object localObject8 = null;
    boolean bool4;
    Object localObject10;
    label275:
    Object localObject12;
    NavBackStackEntry.Companion localCompanion;
    if (bool1)
    {
      localObject5 = localObject4;
      for (;;)
      {
        Intrinsics.OooO0OO(localObject5);
        localObject6 = ((NavDestination)localObject5).getParent();
        if (localObject6 != null)
        {
          int i = paramList.size();
          localObject5 = ((List)localObject3).listIterator(i);
          do
          {
            bool4 = ((ListIterator)localObject5).hasPrevious();
            if (!bool4) {
              break;
            }
            localObject9 = ((ListIterator)localObject5).previous();
            localObject10 = localObject9;
            localObject10 = ((NavBackStackEntry)localObject9).getDestination();
            bool6 = Intrinsics.OooO00o(localObject10, localObject6);
          } while (!bool6);
          break label275;
          bool4 = false;
          localObject9 = null;
          localObject9 = (NavBackStackEntry)localObject9;
          if (localObject9 == null)
          {
            localObject11 = NavBackStackEntry.o00o000O;
            localObject12 = localNavController.OooO00o;
            localObject5 = getHostLifecycleState$navigation_runtime_release();
            localObject9 = localNavController.OooOOoo;
            bool6 = false;
            localCompanion = null;
            localObject13 = paramBundle;
            localObject14 = localObject4;
            localObject4 = localObject5;
            localObject5 = localObject3;
            localObject3 = localObject9;
            localObject9 = localObject2;
            localObject2 = null;
            localObject10 = localObject1;
            localObject1 = null;
            int i5 = 96;
            NavBackStackEntry localNavBackStackEntry = NavBackStackEntry.Companion.OooO0O0((NavBackStackEntry.Companion)localObject11, (Context)localObject12, (NavDestination)localObject6, paramBundle, (Lifecycle.State)localObject4, (NavViewModelStoreProvider)localObject3, null, null, i5, null);
            localObject11 = localObject9;
            localObject9 = localNavBackStackEntry;
          }
          else
          {
            localObject14 = localObject4;
            localObject5 = localObject3;
            localObject11 = localObject2;
            localObject10 = localObject1;
          }
          ((ArrayDeque)localObject7).addFirst(localObject9);
          localObject9 = localNavController.OooO0oo;
          bool4 = ((Collection)localObject9).isEmpty() ^ i4;
          if (bool4)
          {
            localObject9 = ((NavBackStackEntry)localNavController.OooO0oo.OooO()).getDestination();
            if (localObject9 == localObject6)
            {
              localObject9 = (NavBackStackEntry)localNavController.OooO0oo.OooO();
              int i6 = 6;
              float f2 = 8.407791E-045F;
              localObject4 = null;
              localObject3 = localObject5;
              localObject5 = this;
              localObject2 = localObject10;
              bool6 = false;
              localObject10 = null;
              localObject12 = localObject6;
              localObject6 = null;
              i7 = i4;
              f3 = f1;
              i4 = i6;
              f1 = f2;
              localObject13 = localObject7;
              localObject7 = null;
              OoooO0O(this, (NavBackStackEntry)localObject9, false, null, i6, null);
              break label598;
            }
          }
          localObject3 = localObject5;
          localObject2 = localObject10;
          localObject12 = localObject6;
          i7 = i4;
          f3 = f1;
          localObject13 = localObject7;
        }
        else
        {
          localObject12 = localObject6;
          i7 = i4;
          f3 = f1;
          localObject13 = localObject7;
          localObject14 = localObject4;
          localObject11 = localObject2;
          localObject2 = localObject1;
        }
        label598:
        if ((localObject12 == null) || (localObject12 == localNavDestination)) {
          break;
        }
        localObject5 = localObject12;
        i4 = i7;
        f1 = f3;
        localObject7 = localObject13;
        localObject1 = localObject2;
        localObject4 = localObject14;
        localObject2 = localObject11;
      }
    }
    int i7 = i4;
    float f3 = f1;
    Object localObject13 = localObject7;
    Object localObject14 = localObject4;
    Object localObject11 = localObject2;
    localObject2 = localObject1;
    boolean bool2 = ((ArrayDeque)localObject13).isEmpty();
    if (bool2)
    {
      localObject4 = localObject14;
    }
    else
    {
      localObject5 = (NavBackStackEntry)((ArrayDeque)localObject13).OooO0o();
      localObject4 = ((NavBackStackEntry)localObject5).getDestination();
    }
    label788:
    label883:
    Object localObject15;
    Object localObject16;
    Lifecycle.State localState;
    int i8;
    Object localObject17;
    Object localObject18;
    for (;;)
    {
      localObject12 = null;
      if (localObject4 == null) {
        break;
      }
      int j = ((NavDestination)localObject4).getId();
      localObject5 = localNavController.OooOo0o(j);
      if (localObject5 == localObject4) {
        break;
      }
      localObject4 = ((NavDestination)localObject4).getParent();
      if (localObject4 != null)
      {
        if (localObject2 != null)
        {
          int k = paramBundle.isEmpty();
          if (k == i7)
          {
            i4 = i7;
            f1 = f3;
            break label788;
          }
        }
        i4 = 0;
        f1 = 0.0F;
        if (i4 != 0) {
          localObject1 = null;
        } else {
          localObject1 = localObject2;
        }
        int m = paramList.size();
        localObject5 = ((List)localObject3).listIterator(m);
        do
        {
          bool4 = ((ListIterator)localObject5).hasPrevious();
          if (!bool4) {
            break;
          }
          localObject9 = ((ListIterator)localObject5).previous();
          localObject10 = localObject9;
          localObject10 = ((NavBackStackEntry)localObject9).getDestination();
          bool6 = Intrinsics.OooO00o(localObject10, localObject4);
        } while (!bool6);
        break label883;
        bool4 = false;
        localObject9 = null;
        localObject9 = (NavBackStackEntry)localObject9;
        if (localObject9 == null)
        {
          localObject15 = NavBackStackEntry.o00o000O;
          localObject5 = localNavController.OooO00o;
          localObject16 = ((NavDestination)localObject4).OooO0Oo((Bundle)localObject1);
          localState = getHostLifecycleState$navigation_runtime_release();
          localObject9 = localNavController.OooOOoo;
          i8 = 0;
          int i9 = 96;
          localObject17 = localObject5;
          localObject18 = localObject4;
          localObject9 = NavBackStackEntry.Companion.OooO0O0((NavBackStackEntry.Companion)localObject15, (Context)localObject5, (NavDestination)localObject4, (Bundle)localObject16, localState, (NavViewModelStoreProvider)localObject9, null, null, i9, null);
        }
        ((ArrayDeque)localObject13).addFirst(localObject9);
      }
    }
    boolean bool3 = ((ArrayDeque)localObject13).isEmpty();
    if (bool3)
    {
      localObject4 = localObject14;
    }
    else
    {
      localObject5 = (NavBackStackEntry)((ArrayDeque)localObject13).OooO0o();
      localObject4 = ((NavBackStackEntry)localObject5).getDestination();
    }
    for (;;)
    {
      localObject5 = localNavController.OooO0oo;
      bool3 = ((ArrayDeque)localObject5).isEmpty();
      if (bool3) {
        break;
      }
      localObject5 = ((NavBackStackEntry)localNavController.OooO0oo.OooO()).getDestination();
      bool3 = localObject5 instanceof NavGraph;
      if (!bool3) {
        break;
      }
      localObject5 = ((NavBackStackEntry)localNavController.OooO0oo.OooO()).getDestination();
      localObject9 = "null cannot be cast to non-null type androidx.navigation.NavGraph";
      Intrinsics.OooO0Oo(localObject5, (String)localObject9);
      localObject5 = (NavGraph)localObject5;
      int i2 = ((NavDestination)localObject4).getId();
      localObject5 = ((NavGraph)localObject5).OooOOo0(i2, false);
      if (localObject5 != null) {
        break;
      }
      localObject5 = localNavController.OooO0oo.OooO();
      localObject9 = localObject5;
      localObject9 = (NavBackStackEntry)localObject5;
      bool6 = false;
      localObject10 = null;
      localObject6 = null;
      i4 = 6;
      f1 = 8.407791E-045F;
      localObject7 = null;
      localObject5 = this;
      OoooO0O(this, (NavBackStackEntry)localObject9, false, null, i4, null);
    }
    Object localObject5 = (NavBackStackEntry)localNavController.OooO0oo.OooO0oO();
    if (localObject5 == null) {
      localObject5 = (NavBackStackEntry)((ArrayDeque)localObject13).OooO0oO();
    }
    if (localObject5 != null)
    {
      localObject5 = ((NavBackStackEntry)localObject5).getDestination();
    }
    else
    {
      bool3 = false;
      localObject5 = null;
    }
    Object localObject9 = localNavController.OooO0Oo;
    bool3 = Intrinsics.OooO00o(localObject5, localObject9);
    boolean bool5;
    if (!bool3)
    {
      int n = paramList.size();
      localObject5 = ((List)localObject3).listIterator(n);
      do
      {
        bool5 = ((ListIterator)localObject5).hasPrevious();
        if (!bool5) {
          break;
        }
        localObject9 = ((ListIterator)localObject5).previous();
        localObject10 = localObject9;
        localObject10 = ((NavBackStackEntry)localObject9).getDestination();
        localObject6 = localNavController.OooO0Oo;
        Intrinsics.OooO0OO(localObject6);
        bool6 = Intrinsics.OooO00o(localObject10, localObject6);
      } while (!bool6);
      localObject8 = localObject9;
      localObject8 = (NavBackStackEntry)localObject8;
      if (localObject8 == null)
      {
        localCompanion = NavBackStackEntry.o00o000O;
        localObject5 = localNavController.OooO00o;
        localObject9 = localNavController.OooO0Oo;
        Intrinsics.OooO0OO(localObject9);
        localObject10 = localNavController.OooO0Oo;
        Intrinsics.OooO0OO(localObject10);
        localObject17 = ((NavDestination)localObject10).OooO0Oo((Bundle)localObject2);
        localObject18 = getHostLifecycleState$navigation_runtime_release();
        localObject10 = localNavController.OooOOoo;
        localState = null;
        i8 = 96;
        localObject14 = localObject5;
        localObject15 = localObject9;
        localObject16 = localObject10;
        localObject8 = NavBackStackEntry.Companion.OooO0O0(localCompanion, (Context)localObject5, (NavDestination)localObject9, (Bundle)localObject17, (Lifecycle.State)localObject18, (NavViewModelStoreProvider)localObject10, null, null, i8, null);
      }
      localObject5 = localObject8;
      ((ArrayDeque)localObject13).addFirst(localObject8);
    }
    localObject5 = ((Iterable)localObject13).iterator();
    for (;;)
    {
      bool5 = ((Iterator)localObject5).hasNext();
      if (!bool5) {
        break label1629;
      }
      localObject9 = (NavBackStackEntry)((Iterator)localObject5).next();
      localObject10 = localNavController.OooOoO0;
      localObject6 = ((NavBackStackEntry)localObject9).getDestination().getNavigatorName();
      localObject10 = ((NavigatorProvider)localObject10).OooO0Oo((String)localObject6);
      localObject6 = localNavController.OooOoO;
      localObject10 = ((Map)localObject6).get(localObject10);
      if (localObject10 == null) {
        break;
      }
      localObject10 = (NavController.NavControllerNavigatorState)localObject10;
      ((NavController.NavControllerNavigatorState)localObject10).OooOO0O((NavBackStackEntry)localObject9);
    }
    localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    ((StringBuilder)localObject5).append("NavigatorBackStack for ");
    localObject9 = paramNavDestination.getNavigatorName();
    ((StringBuilder)localObject5).append((String)localObject9);
    ((StringBuilder)localObject5).append(" should already be created");
    localObject5 = ((StringBuilder)localObject5).toString();
    localObject9 = new java/lang/IllegalStateException;
    localObject5 = localObject5.toString();
    ((IllegalStateException)localObject9).<init>((String)localObject5);
    throw ((Throwable)localObject9);
    label1629:
    localNavController.OooO0oo.addAll((Collection)localObject13);
    localNavController.OooO0oo.add(localObject11);
    localObject5 = CollectionsKt.OoooOoo((Collection)localObject13, localObject11).iterator();
    for (;;)
    {
      bool5 = ((Iterator)localObject5).hasNext();
      if (!bool5) {
        break;
      }
      localObject9 = (NavBackStackEntry)((Iterator)localObject5).next();
      localObject10 = ((NavBackStackEntry)localObject9).getDestination().getParent();
      if (localObject10 != null)
      {
        int i3 = ((NavDestination)localObject10).getId();
        localObject10 = localNavController.getBackStackEntry(i3);
        localNavController.OooOooo((NavBackStackEntry)localObject9, (NavBackStackEntry)localObject10);
      }
    }
  }
  
  public void OooOOo(NavController.OnDestinationChangedListener paramOnDestinationChangedListener)
  {
    Intrinsics.OooO0o(paramOnDestinationChangedListener, "listener");
    this.OooOo00.add(paramOnDestinationChangedListener);
    Object localObject = this.OooO0oo;
    boolean bool = ((Collection)localObject).isEmpty() ^ true;
    if (bool)
    {
      localObject = (NavBackStackEntry)this.OooO0oo.OooO();
      NavDestination localNavDestination = ((NavBackStackEntry)localObject).getDestination();
      localObject = ((NavBackStackEntry)localObject).getArguments();
      paramOnDestinationChangedListener.OooOOoo(this, localNavDestination, (Bundle)localObject);
    }
  }
  
  public final boolean OooOOoo(int paramInt)
  {
    Object localObject1 = this.OooOoO.values().iterator();
    boolean bool2;
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      bool2 = true;
      if (!bool1) {
        break;
      }
      localObject2 = (NavController.NavControllerNavigatorState)((Iterator)localObject1).next();
      ((NavigatorState)localObject2).setNavigating(bool2);
    }
    localObject1 = NavOptionsBuilderKt.OooO00o(NavController.clearBackStackInternal.restored.1.o00OoOoo);
    boolean bool1 = false;
    boolean bool3 = OoooOOO(paramInt, null, (NavOptions)localObject1, null);
    Object localObject2 = this.OooOoO.values().iterator();
    for (;;)
    {
      boolean bool4 = ((Iterator)localObject2).hasNext();
      if (!bool4) {
        break;
      }
      NavController.NavControllerNavigatorState localNavControllerNavigatorState = (NavController.NavControllerNavigatorState)((Iterator)localObject2).next();
      localNavControllerNavigatorState.setNavigating(false);
    }
    if (bool3)
    {
      paramInt = Oooo(paramInt, bool2, false);
      if (paramInt != 0) {}
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  public final NavDestination OooOo(NavDestination paramNavDestination, int paramInt)
  {
    int i = paramNavDestination.getId();
    if (i == paramInt) {
      return paramNavDestination;
    }
    boolean bool = paramNavDestination instanceof NavGraph;
    if (bool)
    {
      paramNavDestination = (NavGraph)paramNavDestination;
    }
    else
    {
      paramNavDestination = paramNavDestination.getParent();
      Intrinsics.OooO0OO(paramNavDestination);
    }
    return paramNavDestination.OooOOOo(paramInt);
  }
  
  public final boolean OooOo0(List paramList, NavDestination paramNavDestination, boolean paramBoolean1, boolean paramBoolean2)
  {
    NavController localNavController = this;
    boolean bool1 = paramBoolean2;
    Ref.BooleanRef localBooleanRef1 = new kotlin/jvm/internal/Ref$BooleanRef;
    localBooleanRef1.<init>();
    ArrayDeque localArrayDeque = new kotlin/collections/ArrayDeque;
    localArrayDeque.<init>();
    Iterator localIterator = paramList.iterator();
    boolean bool2;
    Object localObject1;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    do
    {
      bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = localIterator.next();
      Object localObject2 = localObject1;
      localObject2 = (Navigator)localObject1;
      Ref.BooleanRef localBooleanRef2 = new kotlin/jvm/internal/Ref$BooleanRef;
      localBooleanRef2.<init>();
      localObject1 = localNavController.OooO0oo.OooO();
      Object localObject3 = localObject1;
      localObject3 = (NavBackStackEntry)localObject1;
      NavController.executePopOperations.1 local1 = new androidx/navigation/NavController$executePopOperations$1;
      localObject1 = local1;
      localObject4 = localBooleanRef2;
      localObject5 = localBooleanRef1;
      localObject6 = this;
      local1.<init>(localBooleanRef2, localBooleanRef1, this, paramBoolean2, localArrayDeque);
      Oooo0oo((Navigator)localObject2, (NavBackStackEntry)localObject3, bool1, local1);
      bool2 = localBooleanRef2.o00OoOoo;
    } while (bool2);
    if (bool1)
    {
      int i;
      if (!paramBoolean1)
      {
        localObject1 = NavController.executePopOperations.2.o00OoOoo;
        localObject4 = paramNavDestination;
        localObject1 = SequencesKt.OooO0o(paramNavDestination, (Function1)localObject1);
        localObject4 = new androidx/navigation/NavController$executePopOperations$3;
        ((NavController.executePopOperations.3)localObject4).<init>(this);
        localObject1 = SequencesKt.OooOOOO((Sequence)localObject1, (Function1)localObject4).iterator();
        for (;;)
        {
          boolean bool3 = ((Iterator)localObject1).hasNext();
          if (!bool3) {
            break;
          }
          localObject4 = (NavDestination)((Iterator)localObject1).next();
          localObject5 = localNavController.OooOOOO;
          i = ((NavDestination)localObject4).getId();
          localObject4 = Integer.valueOf(i);
          localObject6 = (NavBackStackEntryState)localArrayDeque.OooO0oO();
          if (localObject6 != null) {
            localObject6 = ((NavBackStackEntryState)localObject6).getId();
          } else {
            localObject6 = null;
          }
          ((Map)localObject5).put(localObject4, localObject6);
        }
      }
      bool2 = localArrayDeque.isEmpty() ^ true;
      if (bool2)
      {
        localObject1 = (NavBackStackEntryState)localArrayDeque.OooO0o();
        i = ((NavBackStackEntryState)localObject1).getDestinationId();
        localObject4 = OooOo0o(i);
        localObject5 = NavController.executePopOperations.5.o00OoOoo;
        localObject4 = SequencesKt.OooO0o(localObject4, (Function1)localObject5);
        localObject5 = new androidx/navigation/NavController$executePopOperations$6;
        ((NavController.executePopOperations.6)localObject5).<init>(this);
        localObject4 = SequencesKt.OooOOOO((Sequence)localObject4, (Function1)localObject5).iterator();
        for (;;)
        {
          boolean bool4 = ((Iterator)localObject4).hasNext();
          if (!bool4) {
            break;
          }
          localObject5 = (NavDestination)((Iterator)localObject4).next();
          localObject6 = localNavController.OooOOOO;
          int j = ((NavDestination)localObject5).getId();
          localObject5 = Integer.valueOf(j);
          String str = ((NavBackStackEntryState)localObject1).getId();
          ((Map)localObject6).put(localObject5, str);
        }
        localObject4 = localNavController.OooOOOo;
        localObject1 = ((NavBackStackEntryState)localObject1).getId();
        ((Map)localObject4).put(localObject1, localArrayDeque);
      }
    }
    Ooooo00();
    return localBooleanRef1.o00OoOoo;
  }
  
  public final boolean OooOo00()
  {
    Object localObject2;
    boolean bool2;
    Object localObject3;
    Object localObject4;
    NavDestination localNavDestination;
    Object localObject5;
    for (;;)
    {
      localObject1 = this.OooO0oo;
      boolean bool1 = ((ArrayDeque)localObject1).isEmpty();
      if (bool1) {
        break;
      }
      localObject1 = ((NavBackStackEntry)this.OooO0oo.OooO()).getDestination();
      bool1 = localObject1 instanceof NavGraph;
      if (!bool1) {
        break;
      }
      localObject1 = this.OooO0oo.OooO();
      localObject2 = localObject1;
      localObject2 = (NavBackStackEntry)localObject1;
      bool2 = false;
      localObject3 = null;
      localObject4 = null;
      int i = 6;
      localNavDestination = null;
      localObject5 = this;
      OoooO0O(this, (NavBackStackEntry)localObject2, false, null, i, null);
    }
    Object localObject1 = (NavBackStackEntry)this.OooO0oo.OooOO0();
    if (localObject1 != null)
    {
      localObject5 = this.OooOooo;
      ((Collection)localObject5).add(localObject1);
    }
    int j = this.OooOooO;
    int k = 1;
    j += k;
    this.OooOooO = j;
    OoooOoo();
    j = this.OooOooO + -1;
    this.OooOooO = j;
    if (j == 0)
    {
      localObject5 = CollectionsKt.o0OoOo0(this.OooOooo);
      localObject3 = this.OooOooo;
      ((List)localObject3).clear();
      localObject5 = ((List)localObject5).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject5).hasNext();
        if (!bool2) {
          break;
        }
        localObject3 = (NavBackStackEntry)((Iterator)localObject5).next();
        localObject4 = this.OooOo00.iterator();
        for (;;)
        {
          boolean bool3 = ((Iterator)localObject4).hasNext();
          if (!bool3) {
            break;
          }
          NavController.OnDestinationChangedListener localOnDestinationChangedListener = (NavController.OnDestinationChangedListener)((Iterator)localObject4).next();
          localNavDestination = ((NavBackStackEntry)localObject3).getDestination();
          Bundle localBundle = ((NavBackStackEntry)localObject3).getArguments();
          localOnDestinationChangedListener.OooOOoo(this, localNavDestination, localBundle);
        }
        localObject4 = this.Oooo00O;
        ((MutableSharedFlow)localObject4).OooO0o(localObject3);
      }
      localObject5 = this.OooO;
      localObject3 = CollectionsKt.o0OoOo0(this.OooO0oo);
      ((MutableSharedFlow)localObject5).OooO0o(localObject3);
      localObject5 = this.OooOO0O;
      localObject3 = OoooO();
      ((MutableSharedFlow)localObject5).OooO0o(localObject3);
    }
    if (localObject1 == null)
    {
      k = 0;
      localObject2 = null;
    }
    return k;
  }
  
  public final boolean OooOo0O(List paramList, Bundle paramBundle, NavOptions paramNavOptions, Navigator.Extras paramExtras)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    Object localObject3 = paramList.iterator();
    Object localObject4;
    Object localObject5;
    boolean bool2;
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      localObject4 = ((Iterator)localObject3).next();
      localObject5 = localObject4;
      localObject5 = ((NavBackStackEntry)localObject4).getDestination();
      bool2 = localObject5 instanceof NavGraph;
      if (!bool2) {
        ((Collection)localObject2).add(localObject4);
      }
    }
    localObject2 = ((Iterable)localObject2).iterator();
    boolean bool3;
    label183:
    Object localObject6;
    for (;;)
    {
      bool3 = ((Iterator)localObject2).hasNext();
      if (!bool3) {
        break;
      }
      localObject3 = (NavBackStackEntry)((Iterator)localObject2).next();
      localObject4 = (List)CollectionsKt.OoooOOO((List)localObject1);
      if (localObject4 != null)
      {
        localObject5 = (NavBackStackEntry)CollectionsKt.o000oOoO((List)localObject4);
        if (localObject5 != null)
        {
          localObject5 = ((NavBackStackEntry)localObject5).getDestination();
          if (localObject5 != null)
          {
            localObject5 = ((NavDestination)localObject5).getNavigatorName();
            break label183;
          }
        }
      }
      bool2 = false;
      localObject5 = null;
      localObject6 = ((NavBackStackEntry)localObject3).getDestination().getNavigatorName();
      bool2 = Intrinsics.OooO00o(localObject5, localObject6);
      if (bool2)
      {
        ((Collection)localObject4).add(localObject3);
      }
      else
      {
        localObject3 = CollectionsKt.OooOOO0(new NavBackStackEntry[] { localObject3 });
        ((Collection)localObject1).add(localObject3);
      }
    }
    localObject2 = new kotlin/jvm/internal/Ref$BooleanRef;
    ((Ref.BooleanRef)localObject2).<init>();
    localObject1 = ((List)localObject1).iterator();
    for (;;)
    {
      bool3 = ((Iterator)localObject1).hasNext();
      if (!bool3) {
        break;
      }
      localObject3 = (List)((Iterator)localObject1).next();
      localObject4 = this.OooOoO0;
      localObject5 = ((NavBackStackEntry)CollectionsKt.Oooo0o((List)localObject3)).getDestination().getNavigatorName();
      Navigator localNavigator = ((NavigatorProvider)localObject4).OooO0Oo((String)localObject5);
      Object localObject7 = new kotlin/jvm/internal/Ref$IntRef;
      ((Ref.IntRef)localObject7).<init>();
      NavController.executeRestoreState.3 local3 = new androidx/navigation/NavController$executeRestoreState$3;
      localObject4 = local3;
      localObject5 = localObject2;
      localObject6 = paramList;
      local3.<init>((Ref.BooleanRef)localObject2, paramList, (Ref.IntRef)localObject7, this, paramBundle);
      localObject4 = this;
      localObject5 = localNavigator;
      localObject6 = localObject3;
      localObject7 = paramNavOptions;
      Oooo0(localNavigator, (List)localObject3, paramNavOptions, paramExtras, local3);
    }
    return ((Ref.BooleanRef)localObject2).o00OoOoo;
  }
  
  public final NavDestination OooOo0o(int paramInt)
  {
    Object localObject = this.OooO0Oo;
    if (localObject == null) {
      return null;
    }
    Intrinsics.OooO0OO(localObject);
    int i = ((NavDestination)localObject).getId();
    if (i == paramInt) {
      return this.OooO0Oo;
    }
    localObject = (NavBackStackEntry)this.OooO0oo.OooOO0();
    if (localObject != null)
    {
      localObject = ((NavBackStackEntry)localObject).getDestination();
      if (localObject != null) {}
    }
    else
    {
      localObject = this.OooO0Oo;
      Intrinsics.OooO0OO(localObject);
    }
    return OooOo((NavDestination)localObject, paramInt);
  }
  
  public final NavBackStackEntry OooOoO(String paramString)
  {
    Intrinsics.OooO0o(paramString, "route");
    Object localObject1 = this.OooO0oo;
    int i = ((List)localObject1).size();
    localObject1 = ((List)localObject1).listIterator(i);
    boolean bool2;
    do
    {
      bool1 = ((ListIterator)localObject1).hasPrevious();
      if (!bool1) {
        break;
      }
      localObject2 = ((ListIterator)localObject1).previous();
      Object localObject3 = localObject2;
      localObject3 = (NavBackStackEntry)localObject2;
      NavDestination localNavDestination = ((NavBackStackEntry)localObject3).getDestination();
      localObject3 = ((NavBackStackEntry)localObject3).getArguments();
      bool2 = localNavDestination.OooO(paramString, (Bundle)localObject3);
    } while (!bool2);
    break label94;
    boolean bool1 = false;
    Object localObject2 = null;
    label94:
    localObject2 = (NavBackStackEntry)localObject2;
    if (localObject2 != null) {
      return localObject2;
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("No destination with route ");
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append(" is on the NavController's back stack. The current destination is ");
    paramString = getCurrentDestination();
    ((StringBuilder)localObject1).append(paramString);
    paramString = ((StringBuilder)localObject1).toString();
    localObject1 = new java/lang/IllegalArgumentException;
    paramString = paramString.toString();
    ((IllegalArgumentException)localObject1).<init>(paramString);
    throw ((Throwable)localObject1);
  }
  
  public final String OooOoO0(int[] paramArrayOfInt)
  {
    Object localObject1 = this.OooO0Oo;
    int i = paramArrayOfInt.length;
    int j = 0;
    for (;;)
    {
      Object localObject2 = null;
      if (j >= i) {
        break;
      }
      int k = paramArrayOfInt[j];
      if (j == 0)
      {
        NavGraph localNavGraph = this.OooO0Oo;
        Intrinsics.OooO0OO(localNavGraph);
        int m = localNavGraph.getId();
        if (m == k) {
          localObject2 = this.OooO0Oo;
        }
      }
      else
      {
        Intrinsics.OooO0OO(localObject1);
        localObject2 = ((NavGraph)localObject1).OooOOOo(k);
      }
      if (localObject2 == null)
      {
        paramArrayOfInt = NavDestination.o0O00o0;
        localObject1 = this.OooO00o;
        return paramArrayOfInt.OooO0O0((Context)localObject1, k);
      }
      k = paramArrayOfInt.length + -1;
      if (j != k)
      {
        boolean bool1 = localObject2 instanceof NavGraph;
        if (bool1)
        {
          for (localObject2 = (NavGraph)localObject2;; localObject2 = (NavGraph)localObject1)
          {
            Intrinsics.OooO0OO(localObject2);
            int n = ((NavGraph)localObject2).getStartDestinationId();
            localObject1 = ((NavGraph)localObject2).OooOOOo(n);
            boolean bool2 = localObject1 instanceof NavGraph;
            if (!bool2) {
              break;
            }
            int i1 = ((NavGraph)localObject2).getStartDestinationId();
            localObject1 = ((NavGraph)localObject2).OooOOOo(i1);
            localObject2 = localObject1;
          }
          localObject1 = localObject2;
        }
      }
      j += 1;
    }
    return null;
  }
  
  public boolean OooOoOO(Intent paramIntent)
  {
    NavController localNavController = this;
    Object localObject1 = paramIntent;
    int i = 0;
    if (paramIntent == null) {
      return false;
    }
    Object localObject2 = paramIntent.getExtras();
    Object localObject3;
    Object localObject4;
    int j;
    if (localObject2 != null)
    {
      localObject3 = "android-support-nav:controller:deepLinkIds";
      try
      {
        localObject3 = ((BaseBundle)localObject2).getIntArray((String)localObject3);
      }
      catch (Exception localException)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "handleDeepLink() could not extract deepLink from ";
        ((StringBuilder)localObject3).append((String)localObject4);
        ((StringBuilder)localObject3).append(localObject1);
      }
    }
    else
    {
      j = 0;
      localObject3 = null;
    }
    int m;
    if (localObject2 != null)
    {
      localObject4 = ((Bundle)localObject2).getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
    }
    else
    {
      m = 0;
      localObject4 = null;
    }
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject5;
    int i1;
    if (localObject2 != null)
    {
      localObject5 = "android-support-nav:controller:deepLinkExtras";
      localObject2 = ((Bundle)localObject2).getBundle((String)localObject5);
    }
    else
    {
      i1 = 0;
      localObject2 = null;
    }
    if (localObject2 != null) {
      localBundle.putAll((Bundle)localObject2);
    }
    int i3 = 1;
    if (localObject3 != null)
    {
      i1 = localObject3.length;
      if (i1 == 0)
      {
        i1 = i3;
      }
      else
      {
        i1 = 0;
        localObject2 = null;
      }
      if (i1 == 0) {}
    }
    else
    {
      localObject2 = localNavController.OooO0Oo;
      Intrinsics.OooO0OO(localObject2);
      localObject5 = new androidx/navigation/NavDeepLinkRequest;
      ((NavDeepLinkRequest)localObject5).<init>((Intent)localObject1);
      localObject2 = ((NavGraph)localObject2).OooOO0((NavDeepLinkRequest)localObject5);
      if (localObject2 != null)
      {
        localObject3 = ((NavDestination.DeepLinkMatch)localObject2).getDestination();
        localObject4 = NavDestination.OooO0o((NavDestination)localObject3, null, i3, null);
        localObject2 = ((NavDestination.DeepLinkMatch)localObject2).getMatchingArgs();
        localObject2 = ((NavDestination)localObject3).OooO0Oo((Bundle)localObject2);
        if (localObject2 != null) {
          localBundle.putAll((Bundle)localObject2);
        }
        localObject6 = localObject4;
        m = 0;
        localObject4 = null;
        break label287;
      }
    }
    Object localObject6 = localObject3;
    label287:
    if (localObject6 != null)
    {
      i1 = localObject6.length;
      if (i1 == 0)
      {
        i1 = i3;
      }
      else
      {
        i1 = 0;
        localObject2 = null;
      }
      if (i1 == 0)
      {
        localObject2 = localNavController.OooOoO0(localObject6);
        if (localObject2 != null)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("Could not find destination ");
          ((StringBuilder)localObject3).append((String)localObject2);
          ((StringBuilder)localObject3).append(" in the navigation graph, ignoring the deep link from ");
          ((StringBuilder)localObject3).append(localObject1);
          return false;
        }
        localObject2 = "android-support-nav:controller:deepLinkIntent";
        localBundle.putParcelable((String)localObject2, (Parcelable)localObject1);
        i1 = localObject6.length;
        Bundle[] arrayOfBundle = new Bundle[i1];
        j = 0;
        localObject3 = null;
        while (j < i1)
        {
          localObject5 = new android/os/Bundle;
          ((Bundle)localObject5).<init>();
          ((Bundle)localObject5).putAll(localBundle);
          if (localObject4 != null)
          {
            localObject7 = (Bundle)((ArrayList)localObject4).get(j);
            if (localObject7 != null) {
              ((Bundle)localObject5).putAll((Bundle)localObject7);
            }
          }
          arrayOfBundle[j] = localObject5;
          j += 1;
        }
        int i2 = paramIntent.getFlags();
        j = 0x10000000 & i2;
        if (j != 0)
        {
          m = 32768;
          i2 &= m;
          if (i2 == 0)
          {
            ((Intent)localObject1).addFlags(m);
            localObject1 = TaskStackBuilder.OooO0o0(localNavController.OooO00o).OooO0O0((Intent)localObject1);
            localObject2 = "create(context)\n        …ntWithParentStack(intent)";
            Intrinsics.OooO0o0(localObject1, (String)localObject2);
            ((TaskStackBuilder)localObject1).OooO0oO();
            localObject1 = localNavController.OooO0O0;
            if (localObject1 != null)
            {
              ((Activity)localObject1).finish();
              ((Activity)localObject1).overridePendingTransition(0, 0);
            }
            return i3;
          }
        }
        Object localObject7 = "Deep Linking failed: destination ";
        int i4;
        if (j != 0)
        {
          localObject1 = localNavController.OooO0oo;
          boolean bool1 = ((ArrayDeque)localObject1).isEmpty();
          if (!bool1)
          {
            localObject1 = localNavController.OooO0Oo;
            Intrinsics.OooO0OO(localObject1);
            i2 = ((NavDestination)localObject1).getId();
            j = 1;
            m = 0;
            localObject4 = null;
            int i6 = 4;
            localObject5 = null;
            localObject1 = this;
            OoooO00(this, i2, j, false, i6, null);
          }
          for (;;)
          {
            i4 = localObject6.length;
            if (i >= i4) {
              break label809;
            }
            i4 = localObject6[i];
            i2 = i + 1;
            localObject3 = arrayOfBundle[i];
            localObject4 = localNavController.OooOo0o(i4);
            if (localObject4 == null) {
              break;
            }
            localObject1 = new androidx/navigation/NavController$handleDeepLink$2;
            ((NavController.handleDeepLink.2)localObject1).<init>((NavDestination)localObject4, localNavController);
            localObject1 = NavOptionsBuilderKt.OooO00o((Function1)localObject1);
            localNavController.Oooo00o((NavDestination)localObject4, (Bundle)localObject3, (NavOptions)localObject1, null);
            i = i2;
          }
          localObject2 = NavDestination.o0O00o0;
          localObject3 = localNavController.OooO00o;
          localObject1 = ((NavDestination.Companion)localObject2).OooO0O0((Context)localObject3, i4);
          localObject2 = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append((String)localObject7);
          ((StringBuilder)localObject3).append((String)localObject1);
          ((StringBuilder)localObject3).append(" cannot be found from the current destination ");
          localObject1 = getCurrentDestination();
          ((StringBuilder)localObject3).append(localObject1);
          localObject1 = ((StringBuilder)localObject3).toString();
          ((IllegalStateException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
          label809:
          return i3;
        }
        localObject1 = localNavController.OooO0Oo;
        i2 = localObject6.length;
        int k = 0;
        localObject3 = null;
        while (k < i2)
        {
          m = localObject6[k];
          localBundle = arrayOfBundle[k];
          if (k == 0)
          {
            localObject5 = localNavController.OooO0Oo;
          }
          else
          {
            Intrinsics.OooO0OO(localObject1);
            localObject5 = ((NavGraph)localObject1).OooOOOo(m);
          }
          int n;
          if (localObject5 != null)
          {
            m = localObject6.length - i3;
            if (k != m)
            {
              n = localObject5 instanceof NavGraph;
              if (n != 0)
              {
                for (localObject5 = (NavGraph)localObject5;; localObject5 = (NavGraph)localObject1)
                {
                  Intrinsics.OooO0OO(localObject5);
                  i4 = ((NavGraph)localObject5).getStartDestinationId();
                  localObject1 = ((NavGraph)localObject5).OooOOOo(i4);
                  boolean bool2 = localObject1 instanceof NavGraph;
                  if (!bool2) {
                    break;
                  }
                  int i5 = ((NavGraph)localObject5).getStartDestinationId();
                  localObject1 = ((NavGraph)localObject5).OooOOOo(i5);
                  localObject5 = localObject1;
                }
                localObject1 = localObject5;
              }
            }
            else
            {
              NavOptions.Builder localBuilder = new androidx/navigation/NavOptions$Builder;
              localBuilder.<init>();
              localObject4 = localNavController.OooO0Oo;
              Intrinsics.OooO0OO(localObject4);
              int i7 = ((NavDestination)localObject4).getId();
              boolean bool3 = true;
              int i8 = 4;
              localObject4 = NavOptions.Builder.OooO(localBuilder, i7, bool3, false, i8, null).OooO0O0(0).OooO0OO(0).OooO00o();
              localNavController.Oooo00o((NavDestination)localObject5, localBundle, (NavOptions)localObject4, null);
            }
            k += 1;
          }
          else
          {
            localObject2 = NavDestination.o0O00o0;
            localObject3 = localNavController.OooO00o;
            localObject2 = ((NavDestination.Companion)localObject2).OooO0O0((Context)localObject3, n);
            localObject3 = new java/lang/IllegalStateException;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append((String)localObject7);
            ((StringBuilder)localObject4).append((String)localObject2);
            ((StringBuilder)localObject4).append(" cannot be found in graph ");
            ((StringBuilder)localObject4).append(localObject1);
            localObject1 = ((StringBuilder)localObject4).toString();
            ((IllegalStateException)localObject3).<init>((String)localObject1);
            throw ((Throwable)localObject3);
          }
        }
        localNavController.OooO0oO = i3;
        return i3;
      }
    }
    return false;
  }
  
  public final boolean OooOoo(NavDestination paramNavDestination, Bundle paramBundle)
  {
    Object localObject1 = getCurrentBackStackEntry();
    boolean bool1 = paramNavDestination instanceof NavGraph;
    int i;
    if (bool1)
    {
      localObject2 = NavGraph.o00o000o;
      Object localObject3 = paramNavDestination;
      localObject3 = (NavGraph)paramNavDestination;
      localObject2 = ((NavGraph.Companion)localObject2).OooO00o((NavGraph)localObject3);
      i = ((NavDestination)localObject2).getId();
    }
    else
    {
      i = paramNavDestination.getId();
    }
    int j = 1;
    NavBackStackEntry localNavBackStackEntry = null;
    if (localObject1 != null)
    {
      localObject1 = ((NavBackStackEntry)localObject1).getDestination();
      if (localObject1 != null)
      {
        k = ((NavDestination)localObject1).getId();
        if (i == k)
        {
          k = j;
          break label99;
        }
      }
    }
    int k = 0;
    localObject1 = null;
    label99:
    if (k == 0) {
      return false;
    }
    localObject1 = new kotlin/collections/ArrayDeque;
    ((ArrayDeque)localObject1).<init>();
    Object localObject2 = this.OooO0oo;
    int m = ((List)localObject2).size();
    localObject2 = ((List)localObject2).listIterator(m);
    boolean bool2;
    Object localObject4;
    do
    {
      bool2 = ((ListIterator)localObject2).hasPrevious();
      if (!bool2) {
        break;
      }
      localObject4 = ((NavBackStackEntry)((ListIterator)localObject2).previous()).getDestination();
      if (localObject4 == paramNavDestination)
      {
        bool2 = j;
      }
      else
      {
        bool2 = false;
        localObject4 = null;
      }
    } while (!bool2);
    int n = ((ListIterator)localObject2).nextIndex();
    break label208;
    n = -1;
    for (;;)
    {
      label208:
      localObject2 = this.OooO0oo;
      i = CollectionsKt.OooOO0((List)localObject2);
      if (i < n) {
        break;
      }
      localObject2 = (NavBackStackEntry)this.OooO0oo.removeLast();
      OoooOoO((NavBackStackEntry)localObject2);
      localNavBackStackEntry = new androidx/navigation/NavBackStackEntry;
      localObject4 = ((NavBackStackEntry)localObject2).getDestination().OooO0Oo(paramBundle);
      localNavBackStackEntry.<init>((NavBackStackEntry)localObject2, (Bundle)localObject4);
      ((ArrayDeque)localObject1).addFirst(localNavBackStackEntry);
    }
    paramNavDestination = ((Iterable)localObject1).iterator();
    boolean bool3;
    for (;;)
    {
      bool3 = paramNavDestination.hasNext();
      if (!bool3) {
        break;
      }
      paramBundle = (NavBackStackEntry)paramNavDestination.next();
      localObject2 = paramBundle.getDestination().getParent();
      if (localObject2 != null)
      {
        i = ((NavDestination)localObject2).getId();
        localObject2 = getBackStackEntry(i);
        OooOooo(paramBundle, (NavBackStackEntry)localObject2);
      }
      localObject2 = this.OooO0oo;
      ((ArrayDeque)localObject2).add(paramBundle);
    }
    paramNavDestination = ((Iterable)localObject1).iterator();
    for (;;)
    {
      bool3 = paramNavDestination.hasNext();
      if (!bool3) {
        break;
      }
      paramBundle = (NavBackStackEntry)paramNavDestination.next();
      localObject1 = this.OooOoO0;
      localObject2 = paramBundle.getDestination().getNavigatorName();
      localObject1 = ((NavigatorProvider)localObject1).OooO0Oo((String)localObject2);
      ((Navigator)localObject1).OooO0o0(paramBundle);
    }
    return j;
  }
  
  public final List OooOoo0(ArrayDeque paramArrayDeque)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = (NavBackStackEntry)this.OooO0oo.OooOO0();
    if (localObject2 != null)
    {
      localObject2 = ((NavBackStackEntry)localObject2).getDestination();
      if (localObject2 != null) {}
    }
    else
    {
      localObject2 = getGraph();
    }
    if (paramArrayDeque != null)
    {
      paramArrayDeque = paramArrayDeque.iterator();
      NavBackStackEntryState localNavBackStackEntryState;
      for (;;)
      {
        boolean bool = paramArrayDeque.hasNext();
        if (!bool) {
          return localObject1;
        }
        localNavBackStackEntryState = (NavBackStackEntryState)paramArrayDeque.next();
        int j = localNavBackStackEntryState.getDestinationId();
        NavDestination localNavDestination = OooOo((NavDestination)localObject2, j);
        if (localNavDestination == null) {
          break;
        }
        localObject2 = this.OooO00o;
        Lifecycle.State localState = getHostLifecycleState$navigation_runtime_release();
        NavControllerViewModel localNavControllerViewModel = this.OooOOoo;
        localObject2 = localNavBackStackEntryState.OooO00o((Context)localObject2, localNavDestination, localState, localNavControllerViewModel);
        ((Collection)localObject1).add(localObject2);
        localObject2 = localNavDestination;
      }
      paramArrayDeque = NavDestination.o0O00o0;
      localObject1 = this.OooO00o;
      int i = localNavBackStackEntryState.getDestinationId();
      paramArrayDeque = paramArrayDeque.OooO0O0((Context)localObject1, i);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Restore State failed: destination ");
      ((StringBuilder)localObject1).append(paramArrayDeque);
      ((StringBuilder)localObject1).append(" cannot be found from the current destination ");
      ((StringBuilder)localObject1).append(localObject2);
      paramArrayDeque = ((StringBuilder)localObject1).toString();
      localObject1 = new java/lang/IllegalStateException;
      paramArrayDeque = paramArrayDeque.toString();
      ((IllegalStateException)localObject1).<init>(paramArrayDeque);
      throw ((Throwable)localObject1);
    }
    return localObject1;
  }
  
  public final void OooOooo(NavBackStackEntry paramNavBackStackEntry1, NavBackStackEntry paramNavBackStackEntry2)
  {
    Object localObject = this.OooOOO0;
    ((Map)localObject).put(paramNavBackStackEntry1, paramNavBackStackEntry2);
    paramNavBackStackEntry1 = this.OooOOO.get(paramNavBackStackEntry2);
    if (paramNavBackStackEntry1 == null)
    {
      paramNavBackStackEntry1 = this.OooOOO;
      localObject = new java/util/concurrent/atomic/AtomicInteger;
      ((AtomicInteger)localObject).<init>(0);
      paramNavBackStackEntry1.put(paramNavBackStackEntry2, localObject);
    }
    paramNavBackStackEntry1 = this.OooOOO.get(paramNavBackStackEntry2);
    Intrinsics.OooO0OO(paramNavBackStackEntry1);
    ((AtomicInteger)paramNavBackStackEntry1).incrementAndGet();
  }
  
  public final boolean Oooo(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = this.OooO0oo;
    boolean bool1 = ((ArrayDeque)localObject1).isEmpty();
    if (bool1) {
      return false;
    }
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Iterator localIterator = CollectionsKt.Ooooo00(this.OooO0oo).iterator();
    int j;
    do
    {
      bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localNavDestination = ((NavBackStackEntry)localIterator.next()).getDestination();
      Object localObject2 = this.OooOoO0;
      String str1 = localNavDestination.getNavigatorName();
      localObject2 = ((NavigatorProvider)localObject2).OooO0Oo(str1);
      if (!paramBoolean1)
      {
        int i = localNavDestination.getId();
        if (i == paramInt) {}
      }
      else
      {
        ((List)localObject1).add(localObject2);
      }
      j = localNavDestination.getId();
    } while (j != paramInt);
    break label144;
    boolean bool2 = false;
    NavDestination localNavDestination = null;
    label144:
    if (localNavDestination == null)
    {
      Object localObject3 = NavDestination.o0O00o0;
      Context localContext = this.OooO00o;
      String str2 = ((NavDestination.Companion)localObject3).OooO0O0(localContext, paramInt);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("Ignoring popBackStack to destination ");
      ((StringBuilder)localObject3).append(str2);
      ((StringBuilder)localObject3).append(" as it was not found on the current back stack");
      return false;
    }
    return OooOo0((List)localObject1, localNavDestination, paramBoolean1, paramBoolean2);
  }
  
  public final void Oooo0(Navigator paramNavigator, List paramList, NavOptions paramNavOptions, Navigator.Extras paramExtras, Function1 paramFunction1)
  {
    this.OooOoOO = paramFunction1;
    paramNavigator.OooO0OO(paramList, paramNavOptions, paramExtras);
    this.OooOoOO = null;
  }
  
  public void Oooo000(int paramInt, Bundle paramBundle, NavOptions paramNavOptions)
  {
    Oooo00O(paramInt, paramBundle, paramNavOptions, null);
  }
  
  public void Oooo00O(int paramInt, Bundle paramBundle, NavOptions paramNavOptions, Navigator.Extras paramExtras)
  {
    Object localObject1 = this.OooO0oo;
    boolean bool1 = ((ArrayDeque)localObject1).isEmpty();
    if (bool1) {
      localObject1 = this.OooO0Oo;
    } else {
      localObject1 = ((NavBackStackEntry)this.OooO0oo.OooO()).getDestination();
    }
    if (localObject1 != null)
    {
      Object localObject2 = ((NavDestination)localObject1).getAction(paramInt);
      Bundle localBundle1 = null;
      int i;
      if (localObject2 != null)
      {
        if (paramNavOptions == null) {
          paramNavOptions = ((NavAction)localObject2).getNavOptions();
        }
        i = ((NavAction)localObject2).getDestinationId();
        localBundle2 = ((NavAction)localObject2).getDefaultArguments();
        if (localBundle2 != null)
        {
          localBundle1 = new android/os/Bundle;
          localBundle1.<init>();
          localBundle1.putAll(localBundle2);
        }
      }
      else
      {
        i = paramInt;
      }
      if (paramBundle != null)
      {
        if (localBundle1 == null)
        {
          localBundle1 = new android/os/Bundle;
          localBundle1.<init>();
        }
        localBundle1.putAll(paramBundle);
      }
      if ((i == 0) && (paramNavOptions != null))
      {
        int j = paramNavOptions.getPopUpToId();
        k = -1;
        if (j != k)
        {
          paramInt = paramNavOptions.getPopUpToId();
          bool2 = paramNavOptions.isPopUpToInclusive();
          Oooo0o0(paramInt, bool2);
          return;
        }
      }
      boolean bool2 = true;
      int k = 0;
      Bundle localBundle2 = null;
      boolean bool3;
      NavDestination localNavDestination;
      if (i != 0)
      {
        bool3 = bool2;
      }
      else
      {
        bool3 = false;
        localNavDestination = null;
      }
      if (bool3)
      {
        localNavDestination = OooOo0o(i);
        if (localNavDestination == null)
        {
          paramNavOptions = NavDestination.o0O00o0;
          paramExtras = this.OooO00o;
          paramExtras = paramNavOptions.OooO0O0(paramExtras, i);
          if (localObject2 != null)
          {
            bool2 = false;
            paramBundle = null;
          }
          localObject2 = " cannot be found from the current destination ";
          if (!bool2)
          {
            paramBundle = new java/lang/StringBuilder;
            paramBundle.<init>();
            paramBundle.append("Navigation destination ");
            paramBundle.append(paramExtras);
            paramBundle.append(" referenced from action ");
            paramExtras = this.OooO00o;
            localObject3 = paramNavOptions.OooO0O0(paramExtras, paramInt);
            paramBundle.append((String)localObject3);
            paramBundle.append((String)localObject2);
            paramBundle.append(localObject1);
            localObject3 = paramBundle.toString();
            paramBundle = new java/lang/IllegalArgumentException;
            localObject3 = localObject3.toString();
            paramBundle.<init>((String)localObject3);
            throw paramBundle;
          }
          localObject3 = new java/lang/IllegalArgumentException;
          paramBundle = new java/lang/StringBuilder;
          paramBundle.<init>();
          paramBundle.append("Navigation action/destination ");
          paramBundle.append(paramExtras);
          paramBundle.append((String)localObject2);
          paramBundle.append(localObject1);
          paramBundle = paramBundle.toString();
          ((IllegalArgumentException)localObject3).<init>(paramBundle);
          throw ((Throwable)localObject3);
        }
        Oooo00o(localNavDestination, localBundle1, paramNavOptions, paramExtras);
        return;
      }
      localObject3 = new java/lang/IllegalArgumentException;
      paramBundle = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString();
      ((IllegalArgumentException)localObject3).<init>(paramBundle);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new java/lang/IllegalStateException;
    paramBundle = new java/lang/StringBuilder;
    paramBundle.<init>();
    paramBundle.append("No current destination found. Ensure a navigation graph has been set for NavController ");
    paramBundle.append(this);
    paramBundle.append('.');
    paramBundle = paramBundle.toString();
    ((IllegalStateException)localObject3).<init>(paramBundle);
    throw ((Throwable)localObject3);
  }
  
  public final void Oooo00o(NavDestination paramNavDestination, Bundle paramBundle, NavOptions paramNavOptions, Navigator.Extras paramExtras)
  {
    NavController localNavController = this;
    NavOptions localNavOptions = paramNavOptions;
    Object localObject1 = this.OooOoO.values().iterator();
    boolean bool4;
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      bool4 = true;
      if (!bool1) {
        break;
      }
      localObject2 = (NavController.NavControllerNavigatorState)((Iterator)localObject1).next();
      ((NavigatorState)localObject2).setNavigating(bool4);
    }
    Ref.BooleanRef localBooleanRef = new kotlin/jvm/internal/Ref$BooleanRef;
    localBooleanRef.<init>();
    boolean bool5;
    if (localNavOptions != null)
    {
      int k = paramNavOptions.getPopUpToId();
      int i = -1;
      if (k != i)
      {
        k = paramNavOptions.getPopUpToId();
        bool2 = paramNavOptions.isPopUpToInclusive();
        boolean bool6 = paramNavOptions.OooO0O0();
        bool5 = localNavController.Oooo(k, bool2, bool6);
        bool7 = bool5;
        break label133;
      }
    }
    boolean bool7 = false;
    label133:
    localObject1 = paramNavDestination.OooO0Oo(paramBundle);
    if (localNavOptions != null)
    {
      bool2 = paramNavOptions.OooO0OO();
      if (bool2 == bool4)
      {
        bool2 = bool4;
        break label171;
      }
    }
    boolean bool2 = false;
    Object localObject2 = null;
    label171:
    if (bool2)
    {
      localObject2 = localNavController.OooOOOO;
      int m = paramNavDestination.getId();
      localObject3 = Integer.valueOf(m);
      bool2 = ((Map)localObject2).containsKey(localObject3);
      if (bool2)
      {
        int j = paramNavDestination.getId();
        localObject3 = paramExtras;
        bool5 = localNavController.OoooOOO(j, (Bundle)localObject1, localNavOptions, paramExtras);
        localBooleanRef.o00OoOoo = bool5;
        n = 0;
        break label452;
      }
    }
    Object localObject3 = paramExtras;
    if (localNavOptions != null)
    {
      bool3 = paramNavOptions.OooO00o();
      if (bool3 == bool4)
      {
        bool3 = bool4;
        break label285;
      }
    }
    boolean bool3 = false;
    localObject2 = null;
    label285:
    if (bool3)
    {
      bool3 = OooOoo(paramNavDestination, paramBundle);
      if (bool3)
      {
        n = bool4;
        break label313;
      }
    }
    int n = 0;
    label313:
    if (n == 0)
    {
      Object localObject4 = NavBackStackEntry.o00o000O;
      Context localContext = localNavController.OooO00o;
      Lifecycle.State localState = getHostLifecycleState$navigation_runtime_release();
      NavControllerViewModel localNavControllerViewModel = localNavController.OooOOoo;
      int i1 = 96;
      localObject2 = NavBackStackEntry.Companion.OooO0O0((NavBackStackEntry.Companion)localObject4, localContext, paramNavDestination, (Bundle)localObject1, localState, localNavControllerViewModel, null, null, i1, null);
      Object localObject5 = localNavController.OooOoO0;
      Object localObject6 = paramNavDestination.getNavigatorName();
      localObject5 = ((NavigatorProvider)localObject5).OooO0Oo((String)localObject6);
      localObject6 = CollectionsKt.OooO0o0(localObject2);
      localObject4 = new androidx/navigation/NavController$navigate$5;
      localObject2 = paramNavDestination;
      ((NavController.navigate.5)localObject4).<init>(localBooleanRef, localNavController, paramNavDestination, (Bundle)localObject1);
      localObject1 = this;
      localObject2 = localObject5;
      localObject5 = localObject6;
      localNavOptions = paramNavOptions;
      localObject3 = paramExtras;
      localObject6 = localObject4;
      Oooo0((Navigator)localObject2, (List)localObject5, paramNavOptions, paramExtras, (Function1)localObject4);
    }
    label452:
    Ooooo00();
    localObject1 = localNavController.OooOoO.values().iterator();
    for (;;)
    {
      bool3 = ((Iterator)localObject1).hasNext();
      if (!bool3) {
        break;
      }
      localObject2 = (NavController.NavControllerNavigatorState)((Iterator)localObject1).next();
      ((NavigatorState)localObject2).setNavigating(false);
    }
    if (!bool7)
    {
      bool5 = localBooleanRef.o00OoOoo;
      if ((!bool5) && (n == 0))
      {
        OoooOoo();
        return;
      }
    }
    OooOo00();
  }
  
  public final void Oooo0O0(Bundle paramBundle)
  {
    Object localObject1 = this.OooO0o0;
    Object localObject5;
    if (localObject1 != null)
    {
      localObject2 = ((Bundle)localObject1).getStringArrayList("android-support-nav:controller:navigatorState:names");
      if (localObject2 != null)
      {
        localObject2 = ((ArrayList)localObject2).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject2).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = (String)((Iterator)localObject2).next();
          localObject4 = this.OooOoO0;
          localObject5 = "name";
          Intrinsics.OooO0o0(localObject3, (String)localObject5);
          localObject4 = ((NavigatorProvider)localObject4).OooO0Oo((String)localObject3);
          localObject3 = ((Bundle)localObject1).getBundle((String)localObject3);
          if (localObject3 != null) {
            ((Navigator)localObject4).OooO0o((Bundle)localObject3);
          }
        }
      }
    }
    localObject1 = this.OooO0o;
    int i = 0;
    Object localObject2 = null;
    boolean bool1 = false;
    Object localObject3 = null;
    Object localObject6;
    if (localObject1 != null)
    {
      int j = localObject1.length;
      int k = 0;
      localObject5 = null;
      while (k < j)
      {
        localObject6 = localObject1[k];
        Intrinsics.OooO0Oo(localObject6, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
        localObject6 = (NavBackStackEntryState)localObject6;
        int m = ((NavBackStackEntryState)localObject6).getDestinationId();
        Object localObject7 = OooOo0o(m);
        if (localObject7 != null)
        {
          Object localObject8 = this.OooO00o;
          Object localObject9 = getHostLifecycleState$navigation_runtime_release();
          NavControllerViewModel localNavControllerViewModel = this.OooOOoo;
          localObject6 = ((NavBackStackEntryState)localObject6).OooO00o((Context)localObject8, (NavDestination)localObject7, (Lifecycle.State)localObject9, localNavControllerViewModel);
          localObject8 = this.OooOoO0;
          localObject7 = ((NavDestination)localObject7).getNavigatorName();
          localObject7 = ((NavigatorProvider)localObject8).OooO0Oo((String)localObject7);
          localObject8 = this.OooOoO;
          localObject9 = ((Map)localObject8).get(localObject7);
          if (localObject9 == null)
          {
            localObject9 = new androidx/navigation/NavController$NavControllerNavigatorState;
            ((NavController.NavControllerNavigatorState)localObject9).<init>(this, (Navigator)localObject7);
            ((Map)localObject8).put(localObject7, localObject9);
          }
          localObject9 = (NavController.NavControllerNavigatorState)localObject9;
          this.OooO0oo.add(localObject6);
          ((NavController.NavControllerNavigatorState)localObject9).OooOO0O((NavBackStackEntry)localObject6);
          localObject7 = ((NavBackStackEntry)localObject6).getDestination().getParent();
          if (localObject7 != null)
          {
            m = ((NavDestination)localObject7).getId();
            localObject7 = getBackStackEntry(m);
            OooOooo((NavBackStackEntry)localObject6, (NavBackStackEntry)localObject7);
          }
          k += 1;
        }
        else
        {
          paramBundle = NavDestination.o0O00o0;
          localObject1 = this.OooO00o;
          i = ((NavBackStackEntryState)localObject6).getDestinationId();
          paramBundle = paramBundle.OooO0O0((Context)localObject1, i);
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Restoring the Navigation back stack failed: destination ");
          ((StringBuilder)localObject2).append(paramBundle);
          ((StringBuilder)localObject2).append(" cannot be found from the current destination ");
          paramBundle = getCurrentDestination();
          ((StringBuilder)localObject2).append(paramBundle);
          paramBundle = ((StringBuilder)localObject2).toString();
          ((IllegalStateException)localObject1).<init>(paramBundle);
          throw ((Throwable)localObject1);
        }
      }
      Ooooo00();
      this.OooO0o = null;
    }
    localObject1 = this.OooOoO0.getNavigators().values();
    Object localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = ((Iterable)localObject1).iterator();
    for (;;)
    {
      boolean bool3 = ((Iterator)localObject1).hasNext();
      if (!bool3) {
        break;
      }
      localObject5 = ((Iterator)localObject1).next();
      localObject6 = localObject5;
      localObject6 = (Navigator)localObject5;
      boolean bool4 = ((Navigator)localObject6).isAttached();
      if (!bool4) {
        ((Collection)localObject4).add(localObject5);
      }
    }
    localObject1 = ((Iterable)localObject4).iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      localObject4 = (Navigator)((Iterator)localObject1).next();
      localObject5 = this.OooOoO;
      localObject6 = ((Map)localObject5).get(localObject4);
      if (localObject6 == null)
      {
        localObject6 = new androidx/navigation/NavController$NavControllerNavigatorState;
        ((NavController.NavControllerNavigatorState)localObject6).<init>(this, (Navigator)localObject4);
        ((Map)localObject5).put(localObject4, localObject6);
      }
      localObject6 = (NavController.NavControllerNavigatorState)localObject6;
      ((Navigator)localObject4).OooO0Oo((NavigatorState)localObject6);
    }
    localObject1 = this.OooO0Oo;
    if (localObject1 != null)
    {
      localObject1 = this.OooO0oo;
      boolean bool5 = ((ArrayDeque)localObject1).isEmpty();
      if (bool5)
      {
        bool5 = this.OooO0oO;
        if (!bool5)
        {
          localObject1 = this.OooO0O0;
          if (localObject1 != null)
          {
            Intrinsics.OooO0OO(localObject1);
            localObject1 = ((Activity)localObject1).getIntent();
            bool5 = OooOoOO((Intent)localObject1);
            if (bool5) {
              i = 1;
            }
          }
        }
        if (i != 0) {
          return;
        }
        localObject1 = this.OooO0Oo;
        Intrinsics.OooO0OO(localObject1);
        Oooo00o((NavDestination)localObject1, paramBundle, null, null);
        return;
      }
    }
    OooOo00();
  }
  
  public boolean Oooo0OO()
  {
    Object localObject = this.OooO0oo;
    boolean bool1 = ((ArrayDeque)localObject).isEmpty();
    boolean bool2;
    if (bool1)
    {
      bool1 = false;
      localObject = null;
    }
    else
    {
      localObject = getCurrentDestination();
      Intrinsics.OooO0OO(localObject);
      int i = ((NavDestination)localObject).getId();
      boolean bool3 = true;
      bool2 = Oooo0o0(i, bool3);
    }
    return bool2;
  }
  
  public boolean Oooo0o(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramInt = Oooo(paramInt, paramBoolean1, paramBoolean2);
    if (paramInt != 0)
    {
      paramInt = OooOo00();
      if (paramInt != 0) {
        return 1;
      }
    }
    paramInt = 0;
    return paramInt;
  }
  
  public boolean Oooo0o0(int paramInt, boolean paramBoolean)
  {
    return Oooo0o(paramInt, paramBoolean, false);
  }
  
  public final void Oooo0oO(NavBackStackEntry paramNavBackStackEntry, Function0 paramFunction0)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "popUpTo");
    Intrinsics.OooO0o(paramFunction0, "onComplete");
    Object localObject = this.OooO0oo;
    int i = ((ArrayDeque)localObject).indexOf(paramNavBackStackEntry);
    if (i < 0)
    {
      paramFunction0 = new java/lang/StringBuilder;
      paramFunction0.<init>();
      paramFunction0.append("Ignoring pop of ");
      paramFunction0.append(paramNavBackStackEntry);
      paramFunction0.append(" as it was not found on the current back stack");
      return;
    }
    int j = 1;
    i += j;
    ArrayDeque localArrayDeque = this.OooO0oo;
    int k = localArrayDeque.size();
    if (i != k)
    {
      localObject = ((NavBackStackEntry)this.OooO0oo.get(i)).getDestination();
      i = ((NavDestination)localObject).getId();
      k = 0;
      localArrayDeque = null;
      Oooo(i, j, false);
    }
    OoooO0O(this, paramNavBackStackEntry, false, null, 6, null);
    paramFunction0.OooO00o();
    Ooooo00();
    OooOo00();
  }
  
  public final void Oooo0oo(Navigator paramNavigator, NavBackStackEntry paramNavBackStackEntry, boolean paramBoolean, Function1 paramFunction1)
  {
    this.OooOoo0 = paramFunction1;
    paramNavigator.OooO0oo(paramNavBackStackEntry, paramBoolean);
    this.OooOoo0 = null;
  }
  
  public final List OoooO()
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = this.OooOoO.values().iterator();
    boolean bool1;
    boolean bool2;
    Object localObject3;
    boolean bool3;
    Object localObject5;
    boolean bool4;
    Object localObject6;
    Object localObject7;
    boolean bool6;
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      bool2 = false;
      localObject3 = null;
      bool3 = true;
      if (!bool1) {
        break;
      }
      localObject4 = (Iterable)((NavController.NavControllerNavigatorState)((Iterator)localObject2).next()).getTransitionsInProgress().getValue();
      localObject5 = new java/util/ArrayList;
      ((ArrayList)localObject5).<init>();
      localObject4 = ((Iterable)localObject4).iterator();
      for (;;)
      {
        bool4 = ((Iterator)localObject4).hasNext();
        if (!bool4) {
          break;
        }
        localObject6 = ((Iterator)localObject4).next();
        localObject7 = localObject6;
        localObject7 = (NavBackStackEntry)localObject6;
        boolean bool5 = ((List)localObject1).contains(localObject7);
        if (!bool5)
        {
          localObject7 = ((NavBackStackEntry)localObject7).getMaxLifecycle();
          Lifecycle.State localState = Lifecycle.State.o00Ooo0O;
          bool6 = ((Lifecycle.State)localObject7).OooO0OO(localState);
          if (!bool6)
          {
            bool6 = bool3;
            break label172;
          }
        }
        bool6 = false;
        localObject7 = null;
        label172:
        if (bool6) {
          ((Collection)localObject5).add(localObject6);
        }
      }
      CollectionsKt.OooOo00((Collection)localObject1, (Iterable)localObject5);
    }
    localObject2 = this.OooO0oo;
    Object localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject2 = ((Iterable)localObject2).iterator();
    for (;;)
    {
      boolean bool7 = ((Iterator)localObject2).hasNext();
      if (!bool7) {
        break;
      }
      localObject5 = ((Iterator)localObject2).next();
      localObject6 = localObject5;
      localObject6 = (NavBackStackEntry)localObject5;
      bool6 = ((List)localObject1).contains(localObject6);
      if (!bool6)
      {
        localObject6 = ((NavBackStackEntry)localObject6).getMaxLifecycle();
        localObject7 = Lifecycle.State.o00Ooo0O;
        bool4 = ((Lifecycle.State)localObject6).OooO0OO((Lifecycle.State)localObject7);
        if (bool4)
        {
          bool4 = bool3;
          break label308;
        }
      }
      bool4 = false;
      localObject6 = null;
      label308:
      if (bool4) {
        ((Collection)localObject4).add(localObject5);
      }
    }
    CollectionsKt.OooOo00((Collection)localObject1, (Iterable)localObject4);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    localObject1 = ((Iterable)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject4 = ((Iterator)localObject1).next();
      localObject3 = localObject4;
      localObject3 = ((NavBackStackEntry)localObject4).getDestination();
      bool2 = localObject3 instanceof NavGraph ^ bool3;
      if (bool2) {
        ((Collection)localObject2).add(localObject4);
      }
    }
    return localObject2;
  }
  
  public final void OoooO0(NavBackStackEntry paramNavBackStackEntry, boolean paramBoolean, ArrayDeque paramArrayDeque)
  {
    NavBackStackEntry localNavBackStackEntry = (NavBackStackEntry)this.OooO0oo.OooO();
    boolean bool1 = Intrinsics.OooO00o(localNavBackStackEntry, paramNavBackStackEntry);
    if (bool1)
    {
      this.OooO0oo.removeLast();
      paramNavBackStackEntry = getNavigatorProvider();
      Object localObject1 = localNavBackStackEntry.getDestination().getNavigatorName();
      paramNavBackStackEntry = paramNavBackStackEntry.OooO0Oo((String)localObject1);
      localObject1 = this.OooOoO;
      paramNavBackStackEntry = (NavController.NavControllerNavigatorState)((Map)localObject1).get(paramNavBackStackEntry);
      bool1 = true;
      Lifecycle.State localState = null;
      if (paramNavBackStackEntry != null)
      {
        paramNavBackStackEntry = paramNavBackStackEntry.getTransitionsInProgress();
        if (paramNavBackStackEntry != null)
        {
          paramNavBackStackEntry = (Set)paramNavBackStackEntry.getValue();
          if (paramNavBackStackEntry != null)
          {
            bool2 = paramNavBackStackEntry.contains(localNavBackStackEntry);
            if (bool2 == bool1)
            {
              bool2 = bool1;
              break label135;
            }
          }
        }
      }
      boolean bool2 = false;
      paramNavBackStackEntry = null;
      label135:
      if (!bool2)
      {
        paramNavBackStackEntry = this.OooOOO;
        bool2 = paramNavBackStackEntry.containsKey(localNavBackStackEntry);
        if (!bool2)
        {
          bool1 = false;
          localObject1 = null;
        }
      }
      paramNavBackStackEntry = localNavBackStackEntry.getLifecycle().getCurrentState();
      localState = Lifecycle.State.o00Ooo0;
      bool2 = paramNavBackStackEntry.OooO0OO(localState);
      if (bool2)
      {
        if (paramBoolean)
        {
          localNavBackStackEntry.setMaxLifecycle(localState);
          paramNavBackStackEntry = new androidx/navigation/NavBackStackEntryState;
          paramNavBackStackEntry.<init>(localNavBackStackEntry);
          paramArrayDeque.addFirst(paramNavBackStackEntry);
        }
        if (!bool1)
        {
          paramNavBackStackEntry = Lifecycle.State.o00OoOoo;
          localNavBackStackEntry.setMaxLifecycle(paramNavBackStackEntry);
          OoooOoO(localNavBackStackEntry);
        }
        else
        {
          localNavBackStackEntry.setMaxLifecycle(localState);
        }
      }
      if ((!paramBoolean) && (!bool1))
      {
        paramNavBackStackEntry = this.OooOOoo;
        if (paramNavBackStackEntry != null)
        {
          localObject2 = localNavBackStackEntry.getId();
          paramNavBackStackEntry.OooO0oo((String)localObject2);
        }
      }
      return;
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Attempted to pop ");
    paramNavBackStackEntry = paramNavBackStackEntry.getDestination();
    ((StringBuilder)localObject2).append(paramNavBackStackEntry);
    ((StringBuilder)localObject2).append(", which is not the top of the back stack (");
    paramNavBackStackEntry = localNavBackStackEntry.getDestination();
    ((StringBuilder)localObject2).append(paramNavBackStackEntry);
    ((StringBuilder)localObject2).append(')');
    paramNavBackStackEntry = ((StringBuilder)localObject2).toString();
    localObject2 = new java/lang/IllegalStateException;
    paramNavBackStackEntry = paramNavBackStackEntry.toString();
    ((IllegalStateException)localObject2).<init>(paramNavBackStackEntry);
    throw ((Throwable)localObject2);
  }
  
  public void OoooOO0(NavController.OnDestinationChangedListener paramOnDestinationChangedListener)
  {
    Intrinsics.OooO0o(paramOnDestinationChangedListener, "listener");
    this.OooOo00.remove(paramOnDestinationChangedListener);
  }
  
  public final boolean OoooOOO(int paramInt, Bundle paramBundle, NavOptions paramNavOptions, Navigator.Extras paramExtras)
  {
    Object localObject1 = this.OooOOOO;
    Object localObject2 = Integer.valueOf(paramInt);
    boolean bool = ((Map)localObject1).containsKey(localObject2);
    if (!bool) {
      return false;
    }
    localObject1 = this.OooOOOO;
    Object localObject3 = Integer.valueOf(paramInt);
    localObject3 = (String)((Map)localObject1).get(localObject3);
    localObject1 = this.OooOOOO.values();
    localObject2 = new androidx/navigation/NavController$restoreStateInternal$1;
    ((NavController.restoreStateInternal.1)localObject2).<init>((String)localObject3);
    CollectionsKt.OooOo0o((Iterable)localObject1, (Function1)localObject2);
    localObject3 = (ArrayDeque)TypeIntrinsics.OooO0O0(this.OooOOOo).remove(localObject3);
    localObject3 = OooOoo0((ArrayDeque)localObject3);
    return OooOo0O((List)localObject3, paramBundle, paramNavOptions, paramExtras);
  }
  
  public Bundle OoooOOo()
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = new android/os/Bundle;
    ((Bundle)localObject2).<init>();
    Object localObject3 = this.OooOoO0.getNavigators().entrySet().iterator();
    Object localObject4;
    Object localObject5;
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      localObject4 = (Map.Entry)((Iterator)localObject3).next();
      localObject5 = (String)((Map.Entry)localObject4).getKey();
      localObject4 = ((Navigator)((Map.Entry)localObject4).getValue()).OooO0oO();
      if (localObject4 != null)
      {
        ((ArrayList)localObject1).add(localObject5);
        ((Bundle)localObject2).putBundle((String)localObject5, (Bundle)localObject4);
      }
    }
    boolean bool2 = ((Collection)localObject1).isEmpty() ^ true;
    if (bool2)
    {
      localObject3 = new android/os/Bundle;
      ((Bundle)localObject3).<init>();
      localObject4 = "android-support-nav:controller:navigatorState:names";
      ((Bundle)localObject2).putStringArrayList((String)localObject4, (ArrayList)localObject1);
      localObject1 = "android-support-nav:controller:navigatorState";
      ((Bundle)localObject3).putBundle((String)localObject1, (Bundle)localObject2);
    }
    else
    {
      bool2 = false;
      localObject3 = null;
    }
    localObject1 = this.OooO0oo;
    boolean bool3 = ((Collection)localObject1).isEmpty() ^ true;
    boolean bool6 = false;
    localObject2 = null;
    boolean bool7;
    boolean bool8;
    Object localObject6;
    Object localObject7;
    if (bool3)
    {
      if (localObject3 == null)
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        localObject3 = localObject1;
      }
      int i = this.OooO0oo.size();
      localObject1 = new Parcelable[i];
      localObject4 = this.OooO0oo.iterator();
      bool7 = false;
      localObject5 = null;
      for (;;)
      {
        bool8 = ((Iterator)localObject4).hasNext();
        if (!bool8) {
          break;
        }
        localObject6 = (NavBackStackEntry)((Iterator)localObject4).next();
        int k = bool7 + true;
        localObject7 = new androidx/navigation/NavBackStackEntryState;
        ((NavBackStackEntryState)localObject7).<init>((NavBackStackEntry)localObject6);
        localObject1[bool7] = localObject7;
        bool7 = k;
      }
      localObject4 = "android-support-nav:controller:backStack";
      ((Bundle)localObject3).putParcelableArray((String)localObject4, (Parcelable[])localObject1);
    }
    localObject1 = this.OooOOOO;
    boolean bool4 = ((Map)localObject1).isEmpty() ^ true;
    Object localObject8;
    int n;
    if (bool4)
    {
      if (localObject3 == null)
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        localObject3 = localObject1;
      }
      int j = this.OooOOOO.size();
      localObject1 = new int[j];
      localObject4 = new java/util/ArrayList;
      ((ArrayList)localObject4).<init>();
      localObject5 = this.OooOOOO.entrySet().iterator();
      bool8 = false;
      localObject6 = null;
      for (;;)
      {
        boolean bool9 = ((Iterator)localObject5).hasNext();
        if (!bool9) {
          break;
        }
        localObject8 = (Map.Entry)((Iterator)localObject5).next();
        localObject7 = (Number)((Map.Entry)localObject8).getKey();
        n = ((Number)localObject7).intValue();
        localObject8 = (String)((Map.Entry)localObject8).getValue();
        int i1 = bool8 + true;
        localObject1[bool8] = n;
        ((Collection)localObject4).add(localObject8);
        bool8 = i1;
      }
      localObject5 = "android-support-nav:controller:backStackDestIds";
      ((BaseBundle)localObject3).putIntArray((String)localObject5, (int[])localObject1);
      localObject1 = "android-support-nav:controller:backStackIds";
      ((Bundle)localObject3).putStringArrayList((String)localObject1, (ArrayList)localObject4);
    }
    localObject1 = this.OooOOOo;
    boolean bool5 = ((Map)localObject1).isEmpty() ^ true;
    if (bool5)
    {
      if (localObject3 == null)
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        localObject3 = localObject1;
      }
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      localObject4 = this.OooOOOo.entrySet().iterator();
      for (;;)
      {
        bool7 = ((Iterator)localObject4).hasNext();
        if (!bool7) {
          break;
        }
        localObject5 = (Map.Entry)((Iterator)localObject4).next();
        localObject6 = (String)((Map.Entry)localObject5).getKey();
        localObject5 = (ArrayDeque)((Map.Entry)localObject5).getValue();
        ((Collection)localObject1).add(localObject6);
        int m = ((AbstractMutableList)localObject5).size();
        localObject8 = new Parcelable[m];
        localObject5 = ((Iterable)localObject5).iterator();
        n = 0;
        localObject7 = null;
        for (;;)
        {
          boolean bool10 = ((Iterator)localObject5).hasNext();
          if (!bool10) {
            break;
          }
          Object localObject9 = ((Iterator)localObject5).next();
          int i2 = n + 1;
          if (n < 0) {
            CollectionsKt.OooOOOo();
          }
          localObject9 = (NavBackStackEntryState)localObject9;
          localObject8[n] = localObject9;
          n = i2;
        }
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject7 = "android-support-nav:controller:backStackStates:";
        ((StringBuilder)localObject5).append((String)localObject7);
        ((StringBuilder)localObject5).append((String)localObject6);
        localObject5 = ((StringBuilder)localObject5).toString();
        ((Bundle)localObject3).putParcelableArray((String)localObject5, (Parcelable[])localObject8);
      }
      localObject2 = "android-support-nav:controller:backStackStates";
      ((Bundle)localObject3).putStringArrayList((String)localObject2, (ArrayList)localObject1);
    }
    bool5 = this.OooO0oO;
    if (bool5)
    {
      if (localObject3 == null)
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        localObject3 = localObject1;
      }
      localObject1 = "android-support-nav:controller:deepLinkHandled";
      bool6 = this.OooO0oO;
      ((BaseBundle)localObject3).putBoolean((String)localObject1, bool6);
    }
    return localObject3;
  }
  
  public void OoooOo0(NavGraph paramNavGraph, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramNavGraph, "graph");
    Object localObject1 = this.OooO0Oo;
    int i = Intrinsics.OooO00o(localObject1, paramNavGraph);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int k;
    if (i == 0)
    {
      localObject1 = this.OooO0Oo;
      if (localObject1 != null)
      {
        localObject2 = new java/util/ArrayList;
        localObject3 = this.OooOOOO.keySet();
        ((ArrayList)localObject2).<init>((Collection)localObject3);
        localObject2 = ((Iterable)localObject2).iterator();
        for (;;)
        {
          boolean bool2 = ((Iterator)localObject2).hasNext();
          if (!bool2) {
            break;
          }
          localObject3 = (Integer)((Iterator)localObject2).next();
          localObject4 = "id";
          Intrinsics.OooO0o0(localObject3, (String)localObject4);
          k = ((Integer)localObject3).intValue();
          OooOOoo(k);
        }
        int m = ((NavDestination)localObject1).getId();
        boolean bool4 = true;
        int n = 4;
        localObject4 = this;
        OoooO00(this, m, bool4, false, n, null);
      }
      this.OooO0Oo = paramNavGraph;
      Oooo0O0(paramBundle);
    }
    else
    {
      paramBundle = paramNavGraph.getNodes();
      int i1 = paramBundle.OooOOOO();
      i = 0;
      localObject1 = null;
      while (i < i1)
      {
        localObject2 = (NavDestination)paramNavGraph.getNodes().OooOOOo(i);
        localObject3 = this.OooO0Oo;
        Intrinsics.OooO0OO(localObject3);
        localObject3 = ((NavGraph)localObject3).getNodes();
        k = ((SparseArrayCompat)localObject3).OooOO0O(i);
        localObject4 = this.OooO0Oo;
        Intrinsics.OooO0OO(localObject4);
        localObject4 = ((NavGraph)localObject4).getNodes();
        ((SparseArrayCompat)localObject4).OooOOO(k, localObject2);
        int j;
        i += 1;
      }
      paramBundle = this.OooO0oo.iterator();
      for (;;)
      {
        boolean bool1 = paramBundle.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (NavBackStackEntry)paramBundle.next();
        localObject2 = NavDestination.o0O00o0;
        localObject3 = ((NavBackStackEntry)localObject1).getDestination();
        localObject2 = CollectionsKt.OooOooo(SequencesKt.OooOOo0(((NavDestination.Companion)localObject2).OooO0OO((NavDestination)localObject3)));
        localObject3 = this.OooO0Oo;
        Intrinsics.OooO0OO(localObject3);
        localObject2 = ((Iterable)localObject2).iterator();
        for (;;)
        {
          boolean bool5 = ((Iterator)localObject2).hasNext();
          if (!bool5) {
            break;
          }
          localObject4 = (NavDestination)((Iterator)localObject2).next();
          NavGraph localNavGraph = this.OooO0Oo;
          boolean bool3 = Intrinsics.OooO00o(localObject4, localNavGraph);
          if (bool3)
          {
            bool3 = Intrinsics.OooO00o(localObject3, paramNavGraph);
            if (bool3) {}
          }
          else
          {
            bool3 = localObject3 instanceof NavGraph;
            if (bool3)
            {
              localObject3 = (NavGraph)localObject3;
              int i2 = ((NavDestination)localObject4).getId();
              localObject3 = ((NavGraph)localObject3).OooOOOo(i2);
              Intrinsics.OooO0OO(localObject3);
            }
          }
        }
        ((NavBackStackEntry)localObject1).setDestination((NavDestination)localObject3);
      }
    }
  }
  
  public final NavBackStackEntry OoooOoO(NavBackStackEntry paramNavBackStackEntry)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "child");
    paramNavBackStackEntry = (NavBackStackEntry)this.OooOOO0.remove(paramNavBackStackEntry);
    int i = 0;
    Object localObject1 = null;
    if (paramNavBackStackEntry == null) {
      return null;
    }
    Object localObject2 = (AtomicInteger)this.OooOOO.get(paramNavBackStackEntry);
    if (localObject2 != null)
    {
      i = ((AtomicInteger)localObject2).decrementAndGet();
      localObject1 = Integer.valueOf(i);
    }
    if (localObject1 != null)
    {
      i = ((Integer)localObject1).intValue();
      if (i == 0)
      {
        localObject1 = this.OooOoO0;
        localObject2 = paramNavBackStackEntry.getDestination().getNavigatorName();
        localObject1 = ((NavigatorProvider)localObject1).OooO0Oo((String)localObject2);
        localObject2 = this.OooOoO;
        localObject1 = (NavController.NavControllerNavigatorState)((Map)localObject2).get(localObject1);
        if (localObject1 != null) {
          ((NavController.NavControllerNavigatorState)localObject1).OooO0O0(paramNavBackStackEntry);
        }
        localObject1 = this.OooOOO;
        ((Map)localObject1).remove(paramNavBackStackEntry);
      }
    }
    return paramNavBackStackEntry;
  }
  
  public final void OoooOoo()
  {
    Object localObject1 = CollectionsKt.o0OoOo0(this.OooO0oo);
    boolean bool1 = ((List)localObject1).isEmpty();
    if (bool1) {
      return;
    }
    Object localObject2 = ((NavBackStackEntry)CollectionsKt.o000oOoO((List)localObject1)).getDestination();
    Object localObject3 = new java/util/ArrayList;
    ((ArrayList)localObject3).<init>();
    boolean bool2 = localObject2 instanceof FloatingWindow;
    boolean bool4;
    if (bool2)
    {
      localObject4 = CollectionsKt.Ooooo00((Iterable)localObject1).iterator();
      boolean bool3;
      do
      {
        do
        {
          bool3 = ((Iterator)localObject4).hasNext();
          if (!bool3) {
            break;
          }
          localObject5 = ((NavBackStackEntry)((Iterator)localObject4).next()).getDestination();
          ((List)localObject3).add(localObject5);
          bool4 = localObject5 instanceof FloatingWindow;
        } while (bool4);
        bool3 = localObject5 instanceof NavGraph;
      } while (bool3);
    }
    Object localObject4 = new java/util/HashMap;
    ((HashMap)localObject4).<init>();
    Object localObject5 = CollectionsKt.Ooooo00((Iterable)localObject1).iterator();
    for (;;)
    {
      bool4 = ((Iterator)localObject5).hasNext();
      if (!bool4) {
        break;
      }
      Object localObject6 = (NavBackStackEntry)((Iterator)localObject5).next();
      Object localObject7 = ((NavBackStackEntry)localObject6).getMaxLifecycle();
      NavDestination localNavDestination = ((NavBackStackEntry)localObject6).getDestination();
      int j = 1;
      label338:
      Object localObject9;
      if (localObject2 != null)
      {
        int k = localNavDestination.getId();
        int n = ((NavDestination)localObject2).getId();
        if (k == n)
        {
          Lifecycle.State localState = Lifecycle.State.o00Ooo0o;
          n = 0;
          int i1;
          if (localObject7 != localState)
          {
            localObject7 = getNavigatorProvider();
            Object localObject8 = ((NavBackStackEntry)localObject6).getDestination().getNavigatorName();
            localObject7 = ((NavigatorProvider)localObject7).OooO0Oo((String)localObject8);
            localObject8 = this.OooOoO;
            localObject7 = (NavController.NavControllerNavigatorState)((Map)localObject8).get(localObject7);
            if (localObject7 != null)
            {
              localObject7 = ((NavigatorState)localObject7).getTransitionsInProgress();
              if (localObject7 != null)
              {
                localObject7 = (Set)((StateFlow)localObject7).getValue();
                if (localObject7 != null)
                {
                  bool5 = ((Set)localObject7).contains(localObject6);
                  localObject7 = Boolean.valueOf(bool5);
                  break label338;
                }
              }
            }
            boolean bool5 = false;
            localObject7 = null;
            localObject8 = Boolean.TRUE;
            bool5 = Intrinsics.OooO00o(localObject7, localObject8);
            if (!bool5)
            {
              localObject7 = (AtomicInteger)this.OooOOO.get(localObject6);
              if (localObject7 != null)
              {
                i1 = ((AtomicInteger)localObject7).get();
                if (i1 == 0)
                {
                  i1 = j;
                  break label403;
                }
              }
              i1 = 0;
              localObject7 = null;
              label403:
              if (i1 == 0)
              {
                ((Map)localObject4).put(localObject6, localState);
                break label440;
              }
            }
            localObject7 = Lifecycle.State.o00Ooo0O;
            ((Map)localObject4).put(localObject6, localObject7);
          }
          label440:
          localObject6 = (NavDestination)CollectionsKt.Oooo0oO((List)localObject3);
          if (localObject6 != null)
          {
            int i = ((NavDestination)localObject6).getId();
            i1 = localNavDestination.getId();
            if (i == i1) {}
          }
          else
          {
            j = 0;
            localObject9 = null;
          }
          if (j != 0) {
            CollectionsKt.OooOo((List)localObject3);
          }
          localObject2 = ((NavDestination)localObject2).getParent();
          continue;
        }
      }
      int m = ((Collection)localObject3).isEmpty();
      j ^= m;
      if (j != 0)
      {
        int i2 = localNavDestination.getId();
        localObject9 = (NavDestination)CollectionsKt.Oooo0o((List)localObject3);
        j = ((NavDestination)localObject9).getId();
        if (i2 == j)
        {
          localNavDestination = (NavDestination)CollectionsKt.OooOo((List)localObject3);
          localObject9 = Lifecycle.State.o00Ooo0o;
          if (localObject7 == localObject9)
          {
            localObject7 = Lifecycle.State.o00Ooo0O;
            ((NavBackStackEntry)localObject6).setMaxLifecycle((Lifecycle.State)localObject7);
          }
          else
          {
            localObject9 = Lifecycle.State.o00Ooo0O;
            if (localObject7 != localObject9) {
              ((Map)localObject4).put(localObject6, localObject9);
            }
          }
          localObject6 = localNavDestination.getParent();
          if (localObject6 == null) {
            continue;
          }
          boolean bool6 = ((List)localObject3).contains(localObject6);
          if (bool6) {
            continue;
          }
          ((List)localObject3).add(localObject6);
          continue;
        }
      }
      localObject7 = Lifecycle.State.o00Ooo0;
      ((NavBackStackEntry)localObject6).setMaxLifecycle((Lifecycle.State)localObject7);
    }
    localObject1 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (NavBackStackEntry)((Iterator)localObject1).next();
      localObject3 = (Lifecycle.State)((HashMap)localObject4).get(localObject2);
      if (localObject3 != null) {
        ((NavBackStackEntry)localObject2).setMaxLifecycle((Lifecycle.State)localObject3);
      } else {
        ((NavBackStackEntry)localObject2).OooO0o0();
      }
    }
  }
  
  public final void Ooooo00()
  {
    OnBackPressedCallback localOnBackPressedCallback = this.OooOo0o;
    boolean bool = this.OooOo;
    int j;
    if (bool)
    {
      int i = getDestinationCountOnBackStack();
      j = 1;
      if (i > j) {}
    }
    else
    {
      j = 0;
    }
    localOnBackPressedCallback.setEnabled(j);
  }
  
  public NavBackStackEntry getBackStackEntry(int paramInt)
  {
    Object localObject1 = this.OooO0oo;
    int i = ((List)localObject1).size();
    localObject1 = ((List)localObject1).listIterator(i);
    int j;
    do
    {
      bool = ((ListIterator)localObject1).hasPrevious();
      if (!bool) {
        break;
      }
      localObject2 = ((ListIterator)localObject1).previous();
      Object localObject3 = localObject2;
      localObject3 = ((NavBackStackEntry)localObject2).getDestination();
      j = ((NavDestination)localObject3).getId();
      if (j == paramInt)
      {
        j = 1;
      }
      else
      {
        j = 0;
        localObject3 = null;
      }
    } while (j == 0);
    break label91;
    boolean bool = false;
    Object localObject2 = null;
    label91:
    localObject2 = (NavBackStackEntry)localObject2;
    if (localObject2 != null) {
      return localObject2;
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("No destination with ID ");
    ((StringBuilder)localObject1).append(paramInt);
    ((StringBuilder)localObject1).append(" is on the NavController's back stack. The current destination is ");
    Object localObject4 = getCurrentDestination();
    ((StringBuilder)localObject1).append(localObject4);
    localObject4 = ((StringBuilder)localObject1).toString();
    localObject1 = new java/lang/IllegalArgumentException;
    localObject4 = localObject4.toString();
    ((IllegalArgumentException)localObject1).<init>((String)localObject4);
    throw ((Throwable)localObject1);
  }
  
  public final Context getContext()
  {
    return this.OooO00o;
  }
  
  public final StateFlow getCurrentBackStack()
  {
    return this.OooOO0;
  }
  
  public NavBackStackEntry getCurrentBackStackEntry()
  {
    return (NavBackStackEntry)this.OooO0oo.OooOO0();
  }
  
  public final Flow getCurrentBackStackEntryFlow()
  {
    return this.Oooo00o;
  }
  
  public NavDestination getCurrentDestination()
  {
    Object localObject = getCurrentBackStackEntry();
    if (localObject != null) {
      localObject = ((NavBackStackEntry)localObject).getDestination();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public NavGraph getGraph()
  {
    Object localObject = this.OooO0Oo;
    if (localObject != null)
    {
      Intrinsics.OooO0Oo(localObject, "null cannot be cast to non-null type androidx.navigation.NavGraph");
      return localObject;
    }
    localObject = new java/lang/IllegalStateException;
    String str = "You must call setGraph() before calling getGraph()".toString();
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public final Lifecycle.State getHostLifecycleState$navigation_runtime_release()
  {
    Object localObject = this.OooOOo0;
    if (localObject == null) {
      localObject = Lifecycle.State.o00Ooo0;
    } else {
      localObject = this.OooOo0;
    }
    return localObject;
  }
  
  public NavInflater getNavInflater()
  {
    return (NavInflater)this.Oooo000.getValue();
  }
  
  public NavigatorProvider getNavigatorProvider()
  {
    return this.OooOoO0;
  }
  
  public NavBackStackEntry getPreviousBackStackEntry()
  {
    Iterator localIterator = CollectionsKt.Ooooo00(this.OooO0oo).iterator();
    boolean bool1 = localIterator.hasNext();
    if (bool1) {
      localIterator.next();
    }
    localIterator = SequencesKt.OooO0OO(localIterator).iterator();
    boolean bool2;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = localIterator.next();
      Object localObject2 = localObject1;
      localObject2 = ((NavBackStackEntry)localObject1).getDestination();
      bool2 = localObject2 instanceof NavGraph ^ true;
    } while (!bool2);
    break label92;
    bool1 = false;
    Object localObject1 = null;
    label92:
    return (NavBackStackEntry)localObject1;
  }
  
  public ViewModelStoreOwner getViewModelStoreOwner(int paramInt)
  {
    Object localObject1 = this.OooOOoo;
    if (localObject1 != null)
    {
      localObject1 = getBackStackEntry(paramInt);
      NavDestination localNavDestination = ((NavBackStackEntry)localObject1).getDestination();
      boolean bool = localNavDestination instanceof NavGraph;
      if (bool) {
        return localObject1;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("No NavGraph with ID ");
      ((StringBuilder)localObject1).append(paramInt);
      ((StringBuilder)localObject1).append(" is on the NavController's back stack");
      localObject2 = ((StringBuilder)localObject1).toString();
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = localObject2.toString();
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = new java/lang/IllegalStateException;
    localObject1 = "You must call setViewModelStore() before calling getViewModelStoreOwner().".toString();
    ((IllegalStateException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  public final StateFlow getVisibleEntries()
  {
    return this.OooOO0o;
  }
  
  public void o000oOoO(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    Object localObject1 = this.OooO00o.getClassLoader();
    paramBundle.setClassLoader((ClassLoader)localObject1);
    localObject1 = paramBundle.getBundle("android-support-nav:controller:navigatorState");
    this.OooO0o0 = ((Bundle)localObject1);
    localObject1 = paramBundle.getParcelableArray("android-support-nav:controller:backStack");
    this.OooO0o = ((Parcelable[])localObject1);
    this.OooOOOo.clear();
    localObject1 = paramBundle.getIntArray("android-support-nav:controller:backStackDestIds");
    Object localObject2 = paramBundle.getStringArrayList("android-support-nav:controller:backStackIds");
    Object localObject3;
    Object localObject4;
    int m;
    Object localObject5;
    if ((localObject1 != null) && (localObject2 != null))
    {
      int i = localObject1.length;
      int j = 0;
      localObject3 = null;
      int k = 0;
      localObject4 = null;
      while (j < i)
      {
        m = localObject1[j];
        int n = k + 1;
        localObject5 = Integer.valueOf(m);
        Map localMap = this.OooOOOO;
        localObject4 = ((ArrayList)localObject2).get(k);
        localMap.put(localObject5, localObject4);
        j += 1;
        k = n;
      }
    }
    localObject1 = paramBundle.getStringArrayList("android-support-nav:controller:backStackStates");
    if (localObject1 != null)
    {
      localObject1 = ((Iterable)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (String)((Iterator)localObject1).next();
        Object localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        localObject3 = "android-support-nav:controller:backStackStates:";
        ((StringBuilder)localObject6).append((String)localObject3);
        ((StringBuilder)localObject6).append((String)localObject2);
        localObject6 = ((StringBuilder)localObject6).toString();
        localObject6 = paramBundle.getParcelableArray((String)localObject6);
        if (localObject6 != null)
        {
          localObject3 = this.OooOOOo;
          Intrinsics.OooO0o0(localObject2, "id");
          localObject4 = new kotlin/collections/ArrayDeque;
          m = localObject6.length;
          ((ArrayDeque)localObject4).<init>(m);
          localObject6 = ArrayIteratorKt.OooO00o((Object[])localObject6);
          for (;;)
          {
            boolean bool1 = ((Iterator)localObject6).hasNext();
            if (!bool1) {
              break;
            }
            localObject5 = (Parcelable)((Iterator)localObject6).next();
            String str = "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState";
            Intrinsics.OooO0Oo(localObject5, str);
            localObject5 = (NavBackStackEntryState)localObject5;
            ((ArrayDeque)localObject4).add(localObject5);
          }
          ((Map)localObject3).put(localObject2, localObject4);
        }
      }
    }
    boolean bool3 = paramBundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    this.OooO0oO = bool3;
  }
  
  public void setGraph(int paramInt)
  {
    NavGraph localNavGraph = getNavInflater().OooO0O0(paramInt);
    OoooOo0(localNavGraph, null);
  }
  
  public void setGraph(int paramInt, Bundle paramBundle)
  {
    NavGraph localNavGraph = getNavInflater().OooO0O0(paramInt);
    OoooOo0(localNavGraph, paramBundle);
  }
  
  public void setGraph(NavGraph paramNavGraph)
  {
    Intrinsics.OooO0o(paramNavGraph, "graph");
    OoooOo0(paramNavGraph, null);
  }
  
  public final void setHostLifecycleState$navigation_runtime_release(Lifecycle.State paramState)
  {
    Intrinsics.OooO0o(paramState, "<set-?>");
    this.OooOo0 = paramState;
  }
  
  public void setLifecycleOwner(LifecycleOwner paramLifecycleOwner)
  {
    Intrinsics.OooO0o(paramLifecycleOwner, "owner");
    Object localObject = this.OooOOo0;
    boolean bool = Intrinsics.OooO00o(paramLifecycleOwner, localObject);
    if (bool) {
      return;
    }
    localObject = this.OooOOo0;
    if (localObject != null)
    {
      localObject = ((LifecycleOwner)localObject).getLifecycle();
      if (localObject != null)
      {
        LifecycleObserver localLifecycleObserver = this.OooOo0O;
        ((Lifecycle)localObject).OooO0O0(localLifecycleObserver);
      }
    }
    this.OooOOo0 = paramLifecycleOwner;
    paramLifecycleOwner = paramLifecycleOwner.getLifecycle();
    localObject = this.OooOo0O;
    paramLifecycleOwner.OooO00o((LifecycleObserver)localObject);
  }
  
  public void setNavigatorProvider(NavigatorProvider paramNavigatorProvider)
  {
    Intrinsics.OooO0o(paramNavigatorProvider, "navigatorProvider");
    Object localObject = this.OooO0oo;
    boolean bool = ((ArrayDeque)localObject).isEmpty();
    if (bool)
    {
      this.OooOoO0 = paramNavigatorProvider;
      return;
    }
    paramNavigatorProvider = new java/lang/IllegalStateException;
    localObject = "NavigatorProvider must be set before setGraph call".toString();
    paramNavigatorProvider.<init>((String)localObject);
    throw paramNavigatorProvider;
  }
  
  public void setOnBackPressedDispatcher(OnBackPressedDispatcher paramOnBackPressedDispatcher)
  {
    Intrinsics.OooO0o(paramOnBackPressedDispatcher, "dispatcher");
    Object localObject = this.OooOOo;
    boolean bool = Intrinsics.OooO00o(paramOnBackPressedDispatcher, localObject);
    if (bool) {
      return;
    }
    localObject = this.OooOOo0;
    if (localObject != null)
    {
      this.OooOo0o.OooO0o();
      this.OooOOo = paramOnBackPressedDispatcher;
      OnBackPressedCallback localOnBackPressedCallback = this.OooOo0o;
      paramOnBackPressedDispatcher.OooO0O0((LifecycleOwner)localObject, localOnBackPressedCallback);
      paramOnBackPressedDispatcher = ((LifecycleOwner)localObject).getLifecycle();
      localObject = this.OooOo0O;
      paramOnBackPressedDispatcher.OooO0O0((LifecycleObserver)localObject);
      localObject = this.OooOo0O;
      paramOnBackPressedDispatcher.OooO00o((LifecycleObserver)localObject);
      return;
    }
    paramOnBackPressedDispatcher = new java/lang/IllegalStateException;
    localObject = "You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString();
    paramOnBackPressedDispatcher.<init>((String)localObject);
    throw paramOnBackPressedDispatcher;
  }
  
  public void setViewModelStore(ViewModelStore paramViewModelStore)
  {
    Intrinsics.OooO0o(paramViewModelStore, "viewModelStore");
    Object localObject = this.OooOOoo;
    NavControllerViewModel.Companion localCompanion = NavControllerViewModel.OooO0o0;
    NavControllerViewModel localNavControllerViewModel = localCompanion.OooO00o(paramViewModelStore);
    boolean bool = Intrinsics.OooO00o(localObject, localNavControllerViewModel);
    if (bool) {
      return;
    }
    localObject = this.OooO0oo;
    bool = ((ArrayDeque)localObject).isEmpty();
    if (bool)
    {
      paramViewModelStore = localCompanion.OooO00o(paramViewModelStore);
      this.OooOOoo = paramViewModelStore;
      return;
    }
    paramViewModelStore = new java/lang/IllegalStateException;
    localObject = "ViewModelStore should be set before setGraph call".toString();
    paramViewModelStore.<init>((String)localObject);
    throw paramViewModelStore;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavController
 * JD-Core Version:    0.7.0.1
 */