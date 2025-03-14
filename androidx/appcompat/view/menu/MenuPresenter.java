package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

public abstract interface MenuPresenter
{
  public abstract boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl);
  
  public abstract boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl);
  
  public abstract boolean flagActionItems();
  
  public abstract int getId();
  
  public abstract void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder);
  
  public abstract void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean);
  
  public abstract void onRestoreInstanceState(Parcelable paramParcelable);
  
  public abstract Parcelable onSaveInstanceState();
  
  public abstract boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder);
  
  public abstract void setCallback(MenuPresenter.Callback paramCallback);
  
  public abstract void updateMenuView(boolean paramBoolean);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuPresenter
 * JD-Core Version:    0.7.0.1
 */