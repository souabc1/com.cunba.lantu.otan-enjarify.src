package com.xuexiang.xui.widget.tabbar.vertical;

import android.content.Context;

public abstract interface TabAdapter
{
  public abstract ITabView.TabIcon OooO00o(Context paramContext, int paramInt);
  
  public abstract int getBackground(int paramInt);
  
  public abstract ITabView.TabBadge getBadge(int paramInt);
  
  public abstract int getCount();
  
  public abstract ITabView.TabTitle getTitle(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.tabbar.vertical.TabAdapter
 * JD-Core Version:    0.7.0.1
 */