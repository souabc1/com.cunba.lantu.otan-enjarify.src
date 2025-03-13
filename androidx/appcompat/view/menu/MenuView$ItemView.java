package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;

public abstract interface MenuView$ItemView
{
  public abstract MenuItemImpl getItemData();
  
  public abstract void initialize(MenuItemImpl paramMenuItemImpl, int paramInt);
  
  public abstract boolean prefersCondensedTitle();
  
  public abstract void setCheckable(boolean paramBoolean);
  
  public abstract void setChecked(boolean paramBoolean);
  
  public abstract void setEnabled(boolean paramBoolean);
  
  public abstract void setIcon(Drawable paramDrawable);
  
  public abstract void setTitle(CharSequence paramCharSequence);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuView.ItemView
 * JD-Core Version:    0.7.0.1
 */