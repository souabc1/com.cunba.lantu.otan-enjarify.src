package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.app.ActionBar.Tab;

class ScrollingTabContainerView$TabAdapter
  extends BaseAdapter
{
  public ScrollingTabContainerView$TabAdapter(ScrollingTabContainerView paramScrollingTabContainerView) {}
  
  public int getCount()
  {
    return this.o00OoOoo.o00Ooo0.getChildCount();
  }
  
  public Object getItem(int paramInt)
  {
    return ((ScrollingTabContainerView.TabView)this.o00OoOoo.o00Ooo0.getChildAt(paramInt)).getTab();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ActionBar.Tab localTab;
    if (paramView == null)
    {
      paramView = this.o00OoOoo;
      localTab = (ActionBar.Tab)getItem(paramInt);
      boolean bool = true;
      paramView = paramView.OooO0Oo(localTab, bool);
    }
    else
    {
      paramViewGroup = paramView;
      paramViewGroup = (ScrollingTabContainerView.TabView)paramView;
      localTab = (ActionBar.Tab)getItem(paramInt);
      paramViewGroup.OooO00o(localTab);
    }
    return paramView;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter
 * JD-Core Version:    0.7.0.1
 */