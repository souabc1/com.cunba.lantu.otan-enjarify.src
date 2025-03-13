package androidx.navigation.ui;

import OooO0OO.OooO00o;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.customview.widget.Openable;
import androidx.navigation.ActivityNavigator.Destination;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestination.Companion;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraph.Companion;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptions.Builder;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class NavigationUI
{
  public static final NavigationUI OooO00o;
  
  static
  {
    NavigationUI localNavigationUI = new androidx/navigation/ui/NavigationUI;
    localNavigationUI.<init>();
    OooO00o = localNavigationUI;
  }
  
  public static final BottomSheetBehavior OooO0O0(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
    Object localObject1 = paramView.getLayoutParams();
    boolean bool1 = localObject1 instanceof CoordinatorLayout.LayoutParams;
    Object localObject2 = null;
    if (!bool1)
    {
      paramView = paramView.getParent();
      bool2 = paramView instanceof View;
      if (bool2)
      {
        paramView = (View)paramView;
        localObject2 = OooO0O0(paramView);
      }
      return localObject2;
    }
    localObject1 = (CoordinatorLayout.LayoutParams)localObject1;
    paramView = ((CoordinatorLayout.LayoutParams)localObject1).getBehavior();
    boolean bool2 = paramView instanceof BottomSheetBehavior;
    if (bool2)
    {
      localObject2 = paramView;
      localObject2 = (BottomSheetBehavior)paramView;
    }
    return localObject2;
  }
  
  public static final boolean OooO0OO(NavDestination paramNavDestination, int paramInt)
  {
    Intrinsics.OooO0o(paramNavDestination, "<this>");
    Object localObject = NavDestination.o0O00o0;
    paramNavDestination = ((NavDestination.Companion)localObject).OooO0OO(paramNavDestination).iterator();
    boolean bool3;
    do
    {
      boolean bool1 = paramNavDestination.hasNext();
      bool2 = false;
      if (!bool1) {
        break;
      }
      localObject = (NavDestination)paramNavDestination.next();
      int i = ((NavDestination)localObject).getId();
      bool3 = true;
      if (i == paramInt) {
        bool2 = bool3;
      }
    } while (!bool2);
    boolean bool2 = bool3;
    return bool2;
  }
  
  public static final boolean OooO0Oo(MenuItem paramMenuItem, NavController paramNavController)
  {
    Intrinsics.OooO0o(paramMenuItem, "item");
    Intrinsics.OooO0o(paramNavController, "navController");
    Object localObject1 = new androidx/navigation/NavOptions$Builder;
    ((NavOptions.Builder)localObject1).<init>();
    int i = 1;
    localObject1 = ((NavOptions.Builder)localObject1).OooO0Oo(i).OooOO0(i);
    Object localObject2 = paramNavController.getCurrentDestination();
    Intrinsics.OooO0OO(localObject2);
    localObject2 = ((NavDestination)localObject2).getParent();
    Intrinsics.OooO0OO(localObject2);
    int j = paramMenuItem.getItemId();
    localObject2 = ((NavGraph)localObject2).OooOOOo(j);
    boolean bool1 = localObject2 instanceof ActivityNavigator.Destination;
    if (bool1)
    {
      k = R.anim.nav_default_enter_anim;
      localObject2 = ((NavOptions.Builder)localObject1).OooO0O0(k);
      j = R.anim.nav_default_exit_anim;
      localObject2 = ((NavOptions.Builder)localObject2).OooO0OO(j);
      j = R.anim.nav_default_pop_enter_anim;
      localObject2 = ((NavOptions.Builder)localObject2).OooO0o0(j);
      j = R.anim.nav_default_pop_exit_anim;
    }
    else
    {
      k = R.animator.nav_default_enter_anim;
      localObject2 = ((NavOptions.Builder)localObject1).OooO0O0(k);
      j = R.animator.nav_default_exit_anim;
      localObject2 = ((NavOptions.Builder)localObject2).OooO0OO(j);
      j = R.animator.nav_default_pop_enter_anim;
      localObject2 = ((NavOptions.Builder)localObject2).OooO0o0(j);
      j = R.animator.nav_default_pop_exit_anim;
    }
    ((NavOptions.Builder)localObject2).OooO0o(j);
    int k = paramMenuItem.getOrder() & 0x30000;
    j = 0;
    NavGraph localNavGraph;
    if (k == 0)
    {
      localObject2 = NavGraph.o00o000o;
      localNavGraph = paramNavController.getGraph();
      localObject2 = ((NavGraph.Companion)localObject2).OooO00o(localNavGraph);
      k = ((NavDestination)localObject2).getId();
      ((NavOptions.Builder)localObject1).OooO0oO(k, false, i);
    }
    localObject1 = ((NavOptions.Builder)localObject1).OooO00o();
    try
    {
      k = paramMenuItem.getItemId();
      localNavGraph = null;
      paramNavController.Oooo000(k, null, (NavOptions)localObject1);
      localObject1 = paramNavController.getCurrentDestination();
      if (localObject1 != null)
      {
        k = paramMenuItem.getItemId();
        boolean bool2 = OooO0OO((NavDestination)localObject1, k);
        if (bool2 == i) {}
      }
      else
      {
        i = 0;
        localObject3 = null;
      }
      j = i;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localObject1 = NavDestination.o0O00o0;
      Object localObject3 = paramNavController.getContext();
      int m = paramMenuItem.getItemId();
      paramMenuItem = ((NavDestination.Companion)localObject1).OooO0O0((Context)localObject3, m);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "Ignoring onNavDestinationSelected for MenuItem ";
      ((StringBuilder)localObject1).append((String)localObject3);
      ((StringBuilder)localObject1).append(paramMenuItem);
      ((StringBuilder)localObject1).append(" as it cannot be found from the current destination ");
      paramMenuItem = paramNavController.getCurrentDestination();
      ((StringBuilder)localObject1).append(paramMenuItem);
    }
    return j;
  }
  
  public static final void OooO0o(NavigationView paramNavigationView, NavController paramNavController)
  {
    Intrinsics.OooO0o(paramNavigationView, "navigationView");
    Intrinsics.OooO0o(paramNavController, "navController");
    Object localObject = new OooO0OO/OooO00o;
    ((OooO00o)localObject).<init>(paramNavController, paramNavigationView);
    paramNavigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(paramNavigationView);
    paramNavigationView = new androidx/navigation/ui/NavigationUI$setupWithNavController$4;
    paramNavigationView.<init>((WeakReference)localObject, paramNavController);
    paramNavController.OooOOo(paramNavigationView);
  }
  
  public static final void OooO0o0(AppCompatActivity paramAppCompatActivity, NavController paramNavController, AppBarConfiguration paramAppBarConfiguration)
  {
    Intrinsics.OooO0o(paramAppCompatActivity, "activity");
    Intrinsics.OooO0o(paramNavController, "navController");
    Intrinsics.OooO0o(paramAppBarConfiguration, "configuration");
    ActionBarOnDestinationChangedListener localActionBarOnDestinationChangedListener = new androidx/navigation/ui/ActionBarOnDestinationChangedListener;
    localActionBarOnDestinationChangedListener.<init>(paramAppCompatActivity, paramAppBarConfiguration);
    paramNavController.OooOOo(localActionBarOnDestinationChangedListener);
  }
  
  public static final boolean OooO0oO(NavController paramNavController, NavigationView paramNavigationView, MenuItem paramMenuItem)
  {
    Intrinsics.OooO0o(paramNavController, "$navController");
    Intrinsics.OooO0o(paramNavigationView, "$navigationView");
    String str = "item";
    Intrinsics.OooO0o(paramMenuItem, str);
    boolean bool1 = OooO0Oo(paramMenuItem, paramNavController);
    if (bool1)
    {
      paramMenuItem = paramNavigationView.getParent();
      boolean bool2 = paramMenuItem instanceof Openable;
      if (bool2)
      {
        paramMenuItem = (Openable)paramMenuItem;
        paramMenuItem.close();
      }
      else
      {
        paramNavigationView = OooO0O0(paramNavigationView);
        if (paramNavigationView != null)
        {
          int i = 5;
          paramNavigationView.setState(i);
        }
      }
    }
    return bool1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.ui.NavigationUI
 * JD-Core Version:    0.7.0.1
 */