package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

public class MenuPopupWindow$MenuDropDownListView
  extends DropDownListView
{
  public final int o00o000;
  public final int o00o000O;
  public MenuItemHoverListener o00o000o;
  public MenuItem oo00oO;
  
  public MenuPopupWindow$MenuDropDownListView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, paramBoolean);
    paramContext = paramContext.getResources().getConfiguration();
    paramBoolean = true;
    boolean bool = MenuPopupWindow.MenuDropDownListView.Api17Impl.OooO00o(paramContext);
    int i = 21;
    int j = 22;
    if (paramBoolean == bool)
    {
      this.o00o000 = i;
      this.o00o000O = j;
    }
    else
    {
      this.o00o000 = j;
      this.o00o000O = i;
    }
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    Object localObject1 = this.o00o000o;
    if (localObject1 != null)
    {
      localObject1 = getAdapter();
      boolean bool = localObject1 instanceof HeaderViewListAdapter;
      if (bool)
      {
        localObject1 = (HeaderViewListAdapter)localObject1;
        i = ((HeaderViewListAdapter)localObject1).getHeadersCount();
        localObject1 = (MenuAdapter)((HeaderViewListAdapter)localObject1).getWrappedAdapter();
      }
      else
      {
        localObject1 = (MenuAdapter)localObject1;
        i = 0;
        localMenuItemImpl = null;
      }
      int j = paramMotionEvent.getAction();
      int k = 10;
      if (j != k)
      {
        float f = paramMotionEvent.getX();
        j = (int)f;
        k = (int)paramMotionEvent.getY();
        j = pointToPosition(j, k);
        k = -1;
        if (j != k)
        {
          j -= i;
          if (j >= 0)
          {
            i = ((MenuAdapter)localObject1).getCount();
            if (j < i)
            {
              localMenuItemImpl = ((MenuAdapter)localObject1).getItem(j);
              break label147;
            }
          }
        }
      }
      int i = 0;
      MenuItemImpl localMenuItemImpl = null;
      label147:
      Object localObject2 = this.oo00oO;
      if (localObject2 != localMenuItemImpl)
      {
        localObject1 = ((MenuAdapter)localObject1).getAdapterMenu();
        if (localObject2 != null)
        {
          MenuItemHoverListener localMenuItemHoverListener = this.o00o000o;
          localMenuItemHoverListener.OooO0O0((MenuBuilder)localObject1, (MenuItem)localObject2);
        }
        this.oo00oO = localMenuItemImpl;
        if (localMenuItemImpl != null)
        {
          localObject2 = this.o00o000o;
          ((MenuItemHoverListener)localObject2).OooO00o((MenuBuilder)localObject1, localMenuItemImpl);
        }
      }
    }
    return super.onHoverEvent(paramMotionEvent);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    ListMenuItemView localListMenuItemView = (ListMenuItemView)getSelectedView();
    boolean bool1 = true;
    Object localObject;
    if (localListMenuItemView != null)
    {
      int i = this.o00o000;
      if (paramInt == i)
      {
        paramInt = localListMenuItemView.isEnabled();
        if (paramInt != 0)
        {
          localObject = localListMenuItemView.getItemData();
          paramInt = ((MenuItemImpl)localObject).hasSubMenu();
          if (paramInt != 0)
          {
            paramInt = getSelectedItemPosition();
            long l = getSelectedItemId();
            performItemClick(localListMenuItemView, paramInt, l);
          }
        }
        return bool1;
      }
    }
    if (localListMenuItemView != null)
    {
      int j = this.o00o000O;
      if (paramInt == j)
      {
        paramInt = -1;
        setSelection(paramInt);
        localObject = getAdapter();
        boolean bool2 = localObject instanceof HeaderViewListAdapter;
        if (bool2) {
          localObject = ((HeaderViewListAdapter)localObject).getWrappedAdapter();
        }
        ((MenuAdapter)localObject).getAdapterMenu().close(false);
        return bool1;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void setHoverListener(MenuItemHoverListener paramMenuItemHoverListener)
  {
    this.o00o000o = paramMenuItemHoverListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.MenuPopupWindow.MenuDropDownListView
 * JD-Core Version:    0.7.0.1
 */