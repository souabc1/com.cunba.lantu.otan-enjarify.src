package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;

class PopupMenu$1
  implements MenuBuilder.Callback
{
  public PopupMenu$1(PopupMenu paramPopupMenu) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    paramMenuBuilder = this.o00OoOoo.OooO0o0;
    if (paramMenuBuilder != null) {
      return paramMenuBuilder.onMenuItemClick(paramMenuItem);
    }
    return false;
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.PopupMenu.1
 * JD-Core Version:    0.7.0.1
 */