package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.core.view.MenuHostHelper;

class Toolbar$3
  implements MenuBuilder.Callback
{
  public Toolbar$3(Toolbar paramToolbar) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    MenuBuilder.Callback localCallback = this.o00OoOoo.mMenuBuilderCallback;
    if (localCallback != null)
    {
      bool = localCallback.onMenuItemSelected(paramMenuBuilder, paramMenuItem);
      if (bool)
      {
        bool = true;
        break label38;
      }
    }
    boolean bool = false;
    paramMenuBuilder = null;
    label38:
    return bool;
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    Object localObject = this.o00OoOoo.mMenuView;
    boolean bool = ((ActionMenuView)localObject).isOverflowMenuShowing();
    if (!bool)
    {
      localObject = this.o00OoOoo.mMenuHostHelper;
      ((MenuHostHelper)localObject).OooOO0O(paramMenuBuilder);
    }
    localObject = this.o00OoOoo.mMenuBuilderCallback;
    if (localObject != null) {
      ((MenuBuilder.Callback)localObject).onMenuModeChange(paramMenuBuilder);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.Toolbar.3
 * JD-Core Version:    0.7.0.1
 */