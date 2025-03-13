package androidx.appcompat.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class MenuItemWrapperICS$OnMenuItemClickListenerWrapper
  implements MenuItem.OnMenuItemClickListener
{
  public final MenuItem.OnMenuItemClickListener o00OoOoo;
  
  public MenuItemWrapperICS$OnMenuItemClickListenerWrapper(MenuItemWrapperICS paramMenuItemWrapperICS, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.o00OoOoo = paramOnMenuItemClickListener;
  }
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    MenuItem.OnMenuItemClickListener localOnMenuItemClickListener = this.o00OoOoo;
    paramMenuItem = this.o00Ooo00.OooO0O0(paramMenuItem);
    return localOnMenuItemClickListener.onMenuItemClick(paramMenuItem);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS.OnMenuItemClickListenerWrapper
 * JD-Core Version:    0.7.0.1
 */