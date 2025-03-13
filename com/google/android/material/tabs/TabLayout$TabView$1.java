package com.google.android.material.tabs;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

class TabLayout$TabView$1
  implements View.OnLayoutChangeListener
{
  public TabLayout$TabView$1(TabLayout.TabView paramTabView, View paramView) {}
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    paramView = this.val$view;
    int i = paramView.getVisibility();
    if (i == 0)
    {
      paramView = this.this$1;
      View localView = this.val$view;
      TabLayout.TabView.access$1400(paramView, localView);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabLayout.TabView.1
 * JD-Core Version:    0.7.0.1
 */