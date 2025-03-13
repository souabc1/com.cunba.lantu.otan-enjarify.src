package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

class ActionMenuPresenter$OverflowMenuButton$1
  extends ForwardingListener
{
  public ActionMenuPresenter$OverflowMenuButton$1(ActionMenuPresenter.OverflowMenuButton paramOverflowMenuButton, View paramView, ActionMenuPresenter paramActionMenuPresenter)
  {
    super(paramView);
  }
  
  public boolean OooO0O0()
  {
    this.o00OoooO.o00OoOoo.OooOo0();
    return true;
  }
  
  public boolean OooO0OO()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00OoooO.o00OoOoo;
    ActionMenuPresenter.OpenOverflowRunnable localOpenOverflowRunnable = localActionMenuPresenter.o00o0O0;
    if (localOpenOverflowRunnable != null) {
      return false;
    }
    localActionMenuPresenter.OooOOo();
    return true;
  }
  
  public ShowableListMenu getPopup()
  {
    ActionMenuPresenter.OverflowPopup localOverflowPopup = this.o00OoooO.o00OoOoo.o00o0;
    if (localOverflowPopup == null) {
      return null;
    }
    return localOverflowPopup.getPopup();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
 * JD-Core Version:    0.7.0.1
 */