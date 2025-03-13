package androidx.appcompat.app;

import android.view.Window.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;

final class AppCompatDelegateImpl$ActionMenuPresenterCallback
  implements MenuPresenter.Callback
{
  public AppCompatDelegateImpl$ActionMenuPresenterCallback(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public boolean OooO00o(MenuBuilder paramMenuBuilder)
  {
    Window.Callback localCallback = this.o00OoOoo.getWindowCallback();
    if (localCallback != null)
    {
      int i = 108;
      localCallback.onMenuOpened(i, paramMenuBuilder);
    }
    return true;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    this.o00OoOoo.Oooo0oO(paramMenuBuilder);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.ActionMenuPresenterCallback
 * JD-Core Version:    0.7.0.1
 */