package androidx.navigation;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.StateFlow;

public abstract class Navigator
{
  public NavigatorState OooO00o;
  public boolean OooO0O0;
  
  public boolean OooO()
  {
    return true;
  }
  
  public abstract NavDestination OooO00o();
  
  public NavDestination OooO0O0(NavDestination paramNavDestination, Bundle paramBundle, NavOptions paramNavOptions, Navigator.Extras paramExtras)
  {
    Intrinsics.OooO0o(paramNavDestination, "destination");
    return paramNavDestination;
  }
  
  public void OooO0OO(List paramList, NavOptions paramNavOptions, Navigator.Extras paramExtras)
  {
    Intrinsics.OooO0o(paramList, "entries");
    paramList = CollectionsKt.Oooo0O0(paramList);
    Navigator.navigate.1 local1 = new androidx/navigation/Navigator$navigate$1;
    local1.<init>(this, paramNavOptions, paramExtras);
    paramList = SequencesKt.OooOO0(SequencesKt.OooOOO0(paramList, local1)).iterator();
    for (;;)
    {
      boolean bool = paramList.hasNext();
      if (!bool) {
        break;
      }
      paramNavOptions = (NavBackStackEntry)paramList.next();
      paramExtras = getState();
      paramExtras.OooO0oo(paramNavOptions);
    }
  }
  
  public void OooO0Oo(NavigatorState paramNavigatorState)
  {
    Intrinsics.OooO0o(paramNavigatorState, "state");
    this.OooO00o = paramNavigatorState;
    this.OooO0O0 = true;
  }
  
  public void OooO0o(Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramBundle, "savedState");
  }
  
  public void OooO0o0(NavBackStackEntry paramNavBackStackEntry)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "backStackEntry");
    NavDestination localNavDestination = paramNavBackStackEntry.getDestination();
    boolean bool = localNavDestination instanceof NavDestination;
    if (!bool) {
      localNavDestination = null;
    }
    if (localNavDestination == null) {
      return;
    }
    NavOptions localNavOptions = NavOptionsBuilderKt.OooO00o(Navigator.onLaunchSingleTop.1.o00OoOoo);
    OooO0O0(localNavDestination, null, localNavOptions, null);
    getState().OooO0OO(paramNavBackStackEntry);
  }
  
  public Bundle OooO0oO()
  {
    return null;
  }
  
  public void OooO0oo(NavBackStackEntry paramNavBackStackEntry, boolean paramBoolean)
  {
    Intrinsics.OooO0o(paramNavBackStackEntry, "popUpTo");
    Object localObject1 = (List)getState().getBackStack().getValue();
    boolean bool1 = ((List)localObject1).contains(paramNavBackStackEntry);
    if (bool1)
    {
      int i = ((List)localObject1).size();
      ListIterator localListIterator = ((List)localObject1).listIterator(i);
      localObject1 = null;
      boolean bool2;
      do
      {
        bool2 = OooO();
        if (!bool2) {
          break;
        }
        localObject1 = (NavBackStackEntry)localListIterator.previous();
        bool2 = Intrinsics.OooO00o(localObject1, paramNavBackStackEntry);
      } while (!bool2);
      if (localObject1 != null)
      {
        paramNavBackStackEntry = getState();
        paramNavBackStackEntry.OooO0o0((NavBackStackEntry)localObject1, paramBoolean);
      }
      return;
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("popBackStack was called with ");
    ((StringBuilder)localObject2).append(paramNavBackStackEntry);
    ((StringBuilder)localObject2).append(" which does not exist in back stack ");
    ((StringBuilder)localObject2).append(localObject1);
    paramNavBackStackEntry = ((StringBuilder)localObject2).toString();
    localObject2 = new java/lang/IllegalStateException;
    paramNavBackStackEntry = paramNavBackStackEntry.toString();
    ((IllegalStateException)localObject2).<init>(paramNavBackStackEntry);
    throw ((Throwable)localObject2);
  }
  
  public final NavigatorState getState()
  {
    Object localObject = this.OooO00o;
    if (localObject != null) {
      return localObject;
    }
    localObject = new java/lang/IllegalStateException;
    String str = "You cannot access the Navigator's state until the Navigator is attached".toString();
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public final boolean isAttached()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.Navigator
 * JD-Core Version:    0.7.0.1
 */