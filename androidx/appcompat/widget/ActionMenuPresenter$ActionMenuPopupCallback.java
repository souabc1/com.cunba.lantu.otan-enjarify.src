package androidx.appcompat.widget;

import androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

class ActionMenuPresenter$ActionMenuPopupCallback
  extends ActionMenuItemView.PopupCallback
{
  public ActionMenuPresenter$ActionMenuPopupCallback(ActionMenuPresenter paramActionMenuPresenter) {}
  
  public ShowableListMenu getPopup()
  {
    Object localObject = this.OooO00o.o00o0O00;
    if (localObject != null) {
      localObject = ((MenuPopupHelper)localObject).getPopup();
    } else {
      localObject = null;
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.ActionMenuPopupCallback
 * JD-Core Version:    0.7.0.1
 */