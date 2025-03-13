package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.view.menu.MenuBuilder;

class NavigationBarMenuView$1
  implements View.OnClickListener
{
  public NavigationBarMenuView$1(NavigationBarMenuView paramNavigationBarMenuView) {}
  
  public void onClick(View paramView)
  {
    paramView = ((NavigationBarItemView)paramView).getItemData();
    MenuBuilder localMenuBuilder = NavigationBarMenuView.access$100(this.this$0);
    NavigationBarPresenter localNavigationBarPresenter = NavigationBarMenuView.access$000(this.this$0);
    boolean bool = localMenuBuilder.performItemAction(paramView, localNavigationBarPresenter, 0);
    if (!bool)
    {
      bool = true;
      paramView.setChecked(bool);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.navigation.NavigationBarMenuView.1
 * JD-Core Version:    0.7.0.1
 */