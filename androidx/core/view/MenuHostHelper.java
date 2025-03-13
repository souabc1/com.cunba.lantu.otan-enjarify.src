package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuHostHelper
{
  public final Runnable OooO00o;
  public final CopyOnWriteArrayList OooO0O0;
  public final Map OooO0OO;
  
  public MenuHostHelper(Runnable paramRunnable)
  {
    Object localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    this.OooO0O0 = ((CopyOnWriteArrayList)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0OO = ((Map)localObject);
    this.OooO00o = paramRunnable;
  }
  
  public void OooO(Menu paramMenu)
  {
    Iterator localIterator = this.OooO0O0.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MenuProvider localMenuProvider = (MenuProvider)localIterator.next();
      localMenuProvider.OooO0O0(paramMenu);
    }
  }
  
  public void OooO0OO(MenuProvider paramMenuProvider)
  {
    this.OooO0O0.add(paramMenuProvider);
    this.OooO00o.run();
  }
  
  public void OooO0Oo(MenuProvider paramMenuProvider, LifecycleOwner paramLifecycleOwner)
  {
    OooO0OO(paramMenuProvider);
    paramLifecycleOwner = paramLifecycleOwner.getLifecycle();
    Object localObject = (MenuHostHelper.LifecycleContainer)this.OooO0OO.remove(paramMenuProvider);
    if (localObject != null) {
      ((MenuHostHelper.LifecycleContainer)localObject).OooO00o();
    }
    localObject = new androidx/core/view/o000oOoO;
    ((o000oOoO)localObject).<init>(this, paramMenuProvider);
    Map localMap = this.OooO0OO;
    MenuHostHelper.LifecycleContainer localLifecycleContainer = new androidx/core/view/MenuHostHelper$LifecycleContainer;
    localLifecycleContainer.<init>(paramLifecycleOwner, (LifecycleEventObserver)localObject);
    localMap.put(paramMenuProvider, localLifecycleContainer);
  }
  
  public void OooO0o0(MenuProvider paramMenuProvider, LifecycleOwner paramLifecycleOwner, Lifecycle.State paramState)
  {
    paramLifecycleOwner = paramLifecycleOwner.getLifecycle();
    Object localObject = (MenuHostHelper.LifecycleContainer)this.OooO0OO.remove(paramMenuProvider);
    if (localObject != null) {
      ((MenuHostHelper.LifecycleContainer)localObject).OooO00o();
    }
    localObject = new androidx/core/view/o0OoOo0;
    ((o0OoOo0)localObject).<init>(this, paramState, paramMenuProvider);
    paramState = this.OooO0OO;
    MenuHostHelper.LifecycleContainer localLifecycleContainer = new androidx/core/view/MenuHostHelper$LifecycleContainer;
    localLifecycleContainer.<init>(paramLifecycleOwner, (LifecycleEventObserver)localObject);
    paramState.put(paramMenuProvider, localLifecycleContainer);
  }
  
  public void OooO0oo(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    Iterator localIterator = this.OooO0O0.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MenuProvider localMenuProvider = (MenuProvider)localIterator.next();
      localMenuProvider.OooO0OO(paramMenu, paramMenuInflater);
    }
  }
  
  public boolean OooOO0(MenuItem paramMenuItem)
  {
    Iterator localIterator = this.OooO0O0.iterator();
    boolean bool;
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MenuProvider localMenuProvider = (MenuProvider)localIterator.next();
      bool = localMenuProvider.OooO00o(paramMenuItem);
    } while (!bool);
    return true;
    return false;
  }
  
  public void OooOO0O(Menu paramMenu)
  {
    Iterator localIterator = this.OooO0O0.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MenuProvider localMenuProvider = (MenuProvider)localIterator.next();
      localMenuProvider.OooO0Oo(paramMenu);
    }
  }
  
  public void OooOO0o(MenuProvider paramMenuProvider)
  {
    this.OooO0O0.remove(paramMenuProvider);
    Map localMap = this.OooO0OO;
    paramMenuProvider = (MenuHostHelper.LifecycleContainer)localMap.remove(paramMenuProvider);
    if (paramMenuProvider != null) {
      paramMenuProvider.OooO00o();
    }
    this.OooO00o.run();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.MenuHostHelper
 * JD-Core Version:    0.7.0.1
 */