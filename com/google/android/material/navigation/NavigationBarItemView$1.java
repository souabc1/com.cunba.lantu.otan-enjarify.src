package com.google.android.material.navigation;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ImageView;

class NavigationBarItemView$1
  implements View.OnLayoutChangeListener
{
  public NavigationBarItemView$1(NavigationBarItemView paramNavigationBarItemView) {}
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    paramView = NavigationBarItemView.access$200(this.this$0);
    int i = paramView.getVisibility();
    if (i == 0)
    {
      paramView = this.this$0;
      ImageView localImageView = NavigationBarItemView.access$200(paramView);
      NavigationBarItemView.access$300(paramView, localImageView);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.navigation.NavigationBarItemView.1
 * JD-Core Version:    0.7.0.1
 */