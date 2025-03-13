package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class MenuPopup
  implements ShowableListMenu, MenuPresenter, AdapterView.OnItemClickListener
{
  public Rect o00OoOoo;
  
  public static int OooO0OO(ListAdapter paramListAdapter, ViewGroup paramViewGroup, Context paramContext, int paramInt)
  {
    int i = 0;
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = paramListAdapter.getCount();
    int n = 0;
    int i1 = 0;
    View localView = null;
    while (i < m)
    {
      int i2 = paramListAdapter.getItemViewType(i);
      if (i2 != i1)
      {
        localView = null;
        i1 = i2;
      }
      if (paramViewGroup == null)
      {
        paramViewGroup = new android/widget/FrameLayout;
        paramViewGroup.<init>(paramContext);
      }
      localView = paramListAdapter.getView(i, localView, paramViewGroup);
      localView.measure(j, k);
      i2 = localView.getMeasuredWidth();
      if (i2 >= paramInt) {
        return paramInt;
      }
      if (i2 > n) {
        n = i2;
      }
      i += 1;
    }
    return n;
  }
  
  public static boolean OooO0Oo(MenuBuilder paramMenuBuilder)
  {
    int i = paramMenuBuilder.size();
    boolean bool1 = false;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramMenuBuilder.getItem(j);
      boolean bool2 = ((MenuItem)localObject).isVisible();
      if (bool2)
      {
        localObject = ((MenuItem)localObject).getIcon();
        if (localObject != null)
        {
          bool1 = true;
          break;
        }
      }
      j += 1;
    }
    return bool1;
  }
  
  public static MenuAdapter OooO0o0(ListAdapter paramListAdapter)
  {
    boolean bool = paramListAdapter instanceof HeaderViewListAdapter;
    if (bool) {
      return (MenuAdapter)((HeaderViewListAdapter)paramListAdapter).getWrappedAdapter();
    }
    return (MenuAdapter)paramListAdapter;
  }
  
  public abstract void OooO00o(MenuBuilder paramMenuBuilder);
  
  public boolean OooO0O0()
  {
    return true;
  }
  
  public boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public Rect getEpicenterBounds()
  {
    return this.o00OoOoo;
  }
  
  public int getId()
  {
    return 0;
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (ListAdapter)paramAdapterView.getAdapter();
    paramView = OooO0o0(paramAdapterView).o00OoOoo;
    paramAdapterView = (MenuItem)paramAdapterView.getItem(paramInt);
    paramInt = OooO0O0();
    if (paramInt != 0) {
      paramInt = 0;
    } else {
      paramInt = 4;
    }
    paramView.performItemAction(paramAdapterView, this, paramInt);
  }
  
  public abstract void setAnchorView(View paramView);
  
  public void setEpicenterBounds(Rect paramRect)
  {
    this.o00OoOoo = paramRect;
  }
  
  public abstract void setForceShowIcon(boolean paramBoolean);
  
  public abstract void setGravity(int paramInt);
  
  public abstract void setHorizontalOffset(int paramInt);
  
  public abstract void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public abstract void setShowTitle(boolean paramBoolean);
  
  public abstract void setVerticalOffset(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuPopup
 * JD-Core Version:    0.7.0.1
 */