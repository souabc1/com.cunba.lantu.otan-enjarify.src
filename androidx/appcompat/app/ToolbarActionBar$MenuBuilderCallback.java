package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.widget.DecorToolbar;

final class ToolbarActionBar$MenuBuilderCallback
  implements MenuBuilder.Callback
{
  public ToolbarActionBar$MenuBuilderCallback(ToolbarActionBar paramToolbarActionBar) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    Object localObject = this.o00OoOoo.OooO00o;
    boolean bool = ((DecorToolbar)localObject).isOverflowMenuShowing();
    int i = 108;
    if (bool)
    {
      localObject = this.o00OoOoo.OooO0O0;
      ((Window.Callback)localObject).onPanelClosed(i, paramMenuBuilder);
    }
    else
    {
      localObject = this.o00OoOoo.OooO0O0;
      bool = ((Window.Callback)localObject).onPreparePanel(0, null, paramMenuBuilder);
      if (bool)
      {
        localObject = this.o00OoOoo.OooO0O0;
        ((Window.Callback)localObject).onMenuOpened(i, paramMenuBuilder);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.ToolbarActionBar.MenuBuilderCallback
 * JD-Core Version:    0.7.0.1
 */