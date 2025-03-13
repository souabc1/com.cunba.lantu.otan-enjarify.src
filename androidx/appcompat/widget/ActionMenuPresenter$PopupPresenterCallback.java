package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.SubMenuBuilder;

class ActionMenuPresenter$PopupPresenterCallback
  implements MenuPresenter.Callback
{
  public ActionMenuPresenter$PopupPresenterCallback(ActionMenuPresenter paramActionMenuPresenter) {}
  
  public boolean OooO00o(MenuBuilder paramMenuBuilder)
  {
    Object localObject1 = ActionMenuPresenter.OooOO0o(this.o00OoOoo);
    boolean bool = false;
    if (paramMenuBuilder == localObject1) {
      return false;
    }
    localObject1 = this.o00OoOoo;
    Object localObject2 = paramMenuBuilder;
    localObject2 = ((SubMenuBuilder)paramMenuBuilder).getItem();
    int i = ((MenuItem)localObject2).getItemId();
    ((ActionMenuPresenter)localObject1).o00o0OO = i;
    localObject1 = this.o00OoOoo.getCallback();
    if (localObject1 != null) {
      bool = ((MenuPresenter.Callback)localObject1).OooO00o(paramMenuBuilder);
    }
    return bool;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    boolean bool = paramMenuBuilder instanceof SubMenuBuilder;
    if (bool)
    {
      localObject = ((MenuBuilder)paramMenuBuilder).getRootMenu();
      ((MenuBuilder)localObject).close(false);
    }
    Object localObject = this.o00OoOoo.getCallback();
    if (localObject != null) {
      ((MenuPresenter.Callback)localObject).onCloseMenu((MenuBuilder)paramMenuBuilder, paramBoolean);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.PopupPresenterCallback
 * JD-Core Version:    0.7.0.1
 */