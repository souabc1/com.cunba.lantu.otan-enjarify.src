package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.SubMenu;
import android.view.View;

class MenuItemWrapperICS$ActionProviderWrapper
  extends androidx.core.view.ActionProvider
{
  public final android.view.ActionProvider OooO0Oo;
  
  public MenuItemWrapperICS$ActionProviderWrapper(MenuItemWrapperICS paramMenuItemWrapperICS, Context paramContext, android.view.ActionProvider paramActionProvider)
  {
    super(paramContext);
    this.OooO0Oo = paramActionProvider;
  }
  
  public boolean OooO00o()
  {
    return this.OooO0Oo.hasSubMenu();
  }
  
  public View OooO0O0()
  {
    return this.OooO0Oo.onCreateActionView();
  }
  
  public boolean OooO0Oo()
  {
    return this.OooO0Oo.onPerformDefaultAction();
  }
  
  public void OooO0o0(SubMenu paramSubMenu)
  {
    android.view.ActionProvider localActionProvider = this.OooO0Oo;
    paramSubMenu = this.OooO0o0.OooO0OO(paramSubMenu);
    localActionProvider.onPrepareSubMenu(paramSubMenu);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper
 * JD-Core Version:    0.7.0.1
 */