package androidx.appcompat.app;

import android.view.Menu;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;

final class AppCompatDelegateImpl$PanelMenuPresenterCallback
  implements MenuPresenter.Callback
{
  public AppCompatDelegateImpl$PanelMenuPresenterCallback(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public boolean OooO00o(MenuBuilder paramMenuBuilder)
  {
    Object localObject = paramMenuBuilder.getRootMenu();
    if (paramMenuBuilder == localObject)
    {
      localObject = this.o00OoOoo;
      boolean bool = ((AppCompatDelegateImpl)localObject).o00o0Oo0;
      if (bool)
      {
        localObject = ((AppCompatDelegateImpl)localObject).getWindowCallback();
        if (localObject != null)
        {
          AppCompatDelegateImpl localAppCompatDelegateImpl = this.o00OoOoo;
          bool = localAppCompatDelegateImpl.o00o0oOo;
          if (!bool)
          {
            int i = 108;
            ((Window.Callback)localObject).onMenuOpened(i, paramMenuBuilder);
          }
        }
      }
    }
    return true;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    Object localObject = paramMenuBuilder.getRootMenu();
    boolean bool1 = true;
    boolean bool2;
    if (localObject != paramMenuBuilder) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    AppCompatDelegateImpl localAppCompatDelegateImpl1 = this.o00OoOoo;
    if (bool2) {
      paramMenuBuilder = (MenuBuilder)localObject;
    }
    paramMenuBuilder = localAppCompatDelegateImpl1.OoooOoo(paramMenuBuilder);
    if (paramMenuBuilder != null) {
      if (bool2)
      {
        AppCompatDelegateImpl localAppCompatDelegateImpl2 = this.o00OoOoo;
        int i = paramMenuBuilder.OooO00o;
        localAppCompatDelegateImpl2.Oooo0o(i, paramMenuBuilder, (Menu)localObject);
        localAppCompatDelegateImpl2 = this.o00OoOoo;
        localAppCompatDelegateImpl2.OoooO00(paramMenuBuilder, bool1);
      }
      else
      {
        localObject = this.o00OoOoo;
        ((AppCompatDelegateImpl)localObject).OoooO00(paramMenuBuilder, paramBoolean);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.PanelMenuPresenterCallback
 * JD-Core Version:    0.7.0.1
 */