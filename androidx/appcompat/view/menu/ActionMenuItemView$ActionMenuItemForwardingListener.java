package androidx.appcompat.view.menu;

import androidx.appcompat.widget.ForwardingListener;

class ActionMenuItemView$ActionMenuItemForwardingListener
  extends ForwardingListener
{
  public ActionMenuItemView$ActionMenuItemForwardingListener(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }
  
  public boolean OooO0O0()
  {
    Object localObject = this.o0O00o0;
    MenuBuilder.ItemInvoker localItemInvoker = ((ActionMenuItemView)localObject).o00Ooo0o;
    boolean bool1 = false;
    if (localItemInvoker != null)
    {
      localObject = ((ActionMenuItemView)localObject).o00Ooo00;
      boolean bool2 = localItemInvoker.OooO00o((MenuItemImpl)localObject);
      if (bool2)
      {
        localObject = getPopup();
        if (localObject != null)
        {
          bool2 = ((ShowableListMenu)localObject).isShowing();
          if (bool2) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public ShowableListMenu getPopup()
  {
    ActionMenuItemView.PopupCallback localPopupCallback = this.o0O00o0.o00OooO;
    if (localPopupCallback != null) {
      return localPopupCallback.getPopup();
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.ActionMenuItemView.ActionMenuItemForwardingListener
 * JD-Core Version:    0.7.0.1
 */