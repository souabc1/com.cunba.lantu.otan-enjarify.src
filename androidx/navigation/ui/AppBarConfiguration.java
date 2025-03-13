package androidx.navigation.ui;

import androidx.customview.widget.Openable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestination.Companion;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraph.Companion;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class AppBarConfiguration
{
  public final Set OooO00o;
  public final Openable OooO0O0;
  public final AppBarConfiguration.OnNavigateUpListener OooO0OO;
  
  public AppBarConfiguration(Set paramSet, Openable paramOpenable, AppBarConfiguration.OnNavigateUpListener paramOnNavigateUpListener)
  {
    this.OooO00o = paramSet;
    this.OooO0O0 = paramOpenable;
    this.OooO0OO = paramOnNavigateUpListener;
  }
  
  public final boolean OooO00o(NavDestination paramNavDestination)
  {
    Intrinsics.OooO0o(paramNavDestination, "destination");
    Iterator localIterator = NavDestination.o0O00o0.OooO0OO(paramNavDestination).iterator();
    boolean bool4;
    do
    {
      boolean bool1 = localIterator.hasNext();
      bool2 = false;
      if (!bool1) {
        break;
      }
      Object localObject = (NavDestination)localIterator.next();
      Set localSet = this.OooO00o;
      Integer localInteger = Integer.valueOf(((NavDestination)localObject).getId());
      boolean bool3 = localSet.contains(localInteger);
      bool4 = true;
      if (bool3 == bool4)
      {
        bool3 = localObject instanceof NavGraph;
        if (bool3)
        {
          int j = paramNavDestination.getId();
          NavGraph.Companion localCompanion = NavGraph.o00o000o;
          localObject = (NavGraph)localObject;
          localObject = localCompanion.OooO00o((NavGraph)localObject);
          int i = ((NavDestination)localObject).getId();
          if (j != i) {}
        }
        else
        {
          bool2 = bool4;
        }
      }
    } while (!bool2);
    boolean bool2 = bool4;
    return bool2;
  }
  
  public final DrawerLayout getDrawerLayout()
  {
    Object localObject = this.OooO0O0;
    boolean bool = localObject instanceof DrawerLayout;
    if (bool) {
      localObject = (DrawerLayout)localObject;
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public final AppBarConfiguration.OnNavigateUpListener getFallbackOnNavigateUpListener()
  {
    return this.OooO0OO;
  }
  
  public final Openable getOpenableLayout()
  {
    return this.OooO0O0;
  }
  
  public final Set getTopLevelDestinations()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.ui.AppBarConfiguration
 * JD-Core Version:    0.7.0.1
 */