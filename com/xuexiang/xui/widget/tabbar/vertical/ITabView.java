package com.xuexiang.xui.widget.tabbar.vertical;

import android.view.View;

public abstract interface ITabView
{
  public abstract ITabView.TabBadge getBadge();
  
  public abstract ITabView.TabIcon getIcon();
  
  public abstract View getTabView();
  
  public abstract ITabView.TabTitle getTitle();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.tabbar.vertical.ITabView
 * JD-Core Version:    0.7.0.1
 */