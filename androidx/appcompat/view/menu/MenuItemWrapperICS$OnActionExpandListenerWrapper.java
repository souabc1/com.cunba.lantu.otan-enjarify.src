package androidx.appcompat.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

class MenuItemWrapperICS$OnActionExpandListenerWrapper
  implements MenuItem.OnActionExpandListener
{
  public final MenuItem.OnActionExpandListener OooO00o;
  
  public MenuItemWrapperICS$OnActionExpandListenerWrapper(MenuItemWrapperICS paramMenuItemWrapperICS, MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    this.OooO00o = paramOnActionExpandListener;
  }
  
  public boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
  {
    MenuItem.OnActionExpandListener localOnActionExpandListener = this.OooO00o;
    paramMenuItem = this.OooO0O0.OooO0O0(paramMenuItem);
    return localOnActionExpandListener.onMenuItemActionCollapse(paramMenuItem);
  }
  
  public boolean onMenuItemActionExpand(MenuItem paramMenuItem)
  {
    MenuItem.OnActionExpandListener localOnActionExpandListener = this.OooO00o;
    paramMenuItem = this.OooO0O0.OooO0O0(paramMenuItem);
    return localOnActionExpandListener.onMenuItemActionExpand(paramMenuItem);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS.OnActionExpandListenerWrapper
 * JD-Core Version:    0.7.0.1
 */