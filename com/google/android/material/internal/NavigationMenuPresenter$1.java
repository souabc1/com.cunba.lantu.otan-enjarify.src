package com.google.android.material.internal;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;

class NavigationMenuPresenter$1
  implements View.OnClickListener
{
  public NavigationMenuPresenter$1(NavigationMenuPresenter paramNavigationMenuPresenter) {}
  
  public void onClick(View paramView)
  {
    paramView = (NavigationMenuItemView)paramView;
    Object localObject = this.this$0;
    boolean bool1 = true;
    ((NavigationMenuPresenter)localObject).setUpdateSuspended(bool1);
    paramView = paramView.getItemData();
    localObject = this.this$0;
    MenuBuilder localMenuBuilder = ((NavigationMenuPresenter)localObject).menu;
    boolean bool2 = localMenuBuilder.performItemAction(paramView, (MenuPresenter)localObject, 0);
    if (paramView != null)
    {
      boolean bool3 = paramView.isCheckable();
      if ((bool3) && (bool2))
      {
        localObject = this.this$0.adapter;
        ((NavigationMenuPresenter.NavigationMenuAdapter)localObject).setCheckedItem(paramView);
        break label81;
      }
    }
    bool1 = false;
    label81:
    paramView = this.this$0;
    paramView.setUpdateSuspended(false);
    if (bool1)
    {
      paramView = this.this$0;
      paramView.updateMenuView(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.NavigationMenuPresenter.1
 * JD-Core Version:    0.7.0.1
 */