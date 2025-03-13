package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;

class ActionMenuView$MenuBuilderCallback
  implements MenuBuilder.Callback
{
  public ActionMenuView$MenuBuilderCallback(ActionMenuView paramActionMenuView) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    paramMenuBuilder = this.o00OoOoo.o00Ooooo;
    if (paramMenuBuilder != null)
    {
      bool = paramMenuBuilder.onMenuItemClick(paramMenuItem);
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    paramMenuBuilder = null;
    return bool;
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    MenuBuilder.Callback localCallback = this.o00OoOoo.o00OooO;
    if (localCallback != null) {
      localCallback.onMenuModeChange(paramMenuBuilder);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionMenuView.MenuBuilderCallback
 * JD-Core Version:    0.7.0.1
 */