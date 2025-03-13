package androidx.appcompat.app;

import android.view.Window.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.widget.DecorToolbar;

final class ToolbarActionBar$ActionMenuPresenterCallback
  implements MenuPresenter.Callback
{
  public boolean o00OoOoo;
  
  public ToolbarActionBar$ActionMenuPresenterCallback(ToolbarActionBar paramToolbarActionBar) {}
  
  public boolean OooO00o(MenuBuilder paramMenuBuilder)
  {
    this.o00Ooo00.OooO0O0.onMenuOpened(108, paramMenuBuilder);
    return true;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    paramBoolean = this.o00OoOoo;
    if (paramBoolean) {
      return;
    }
    this.o00OoOoo = true;
    this.o00Ooo00.OooO00o.OooO0o();
    this.o00Ooo00.OooO0O0.onPanelClosed(108, paramMenuBuilder);
    this.o00OoOoo = false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.ToolbarActionBar.ActionMenuPresenterCallback
 * JD-Core Version:    0.7.0.1
 */