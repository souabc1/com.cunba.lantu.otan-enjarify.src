package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class MenuAdapter
  extends BaseAdapter
{
  public MenuBuilder o00OoOoo;
  public boolean o00Ooo0;
  public int o00Ooo00 = -1;
  public final boolean o00Ooo0O;
  public final LayoutInflater o00Ooo0o;
  public final int o00OooO0;
  
  public MenuAdapter(MenuBuilder paramMenuBuilder, LayoutInflater paramLayoutInflater, boolean paramBoolean, int paramInt)
  {
    this.o00Ooo0O = paramBoolean;
    this.o00Ooo0o = paramLayoutInflater;
    this.o00OoOoo = paramMenuBuilder;
    this.o00OooO0 = paramInt;
    OooO00o();
  }
  
  public void OooO00o()
  {
    MenuItemImpl localMenuItemImpl1 = this.o00OoOoo.getExpandedItem();
    if (localMenuItemImpl1 != null)
    {
      ArrayList localArrayList = this.o00OoOoo.getNonActionItems();
      int i = localArrayList.size();
      int j = 0;
      while (j < i)
      {
        MenuItemImpl localMenuItemImpl2 = (MenuItemImpl)localArrayList.get(j);
        if (localMenuItemImpl2 == localMenuItemImpl1)
        {
          this.o00Ooo00 = j;
          return;
        }
        j += 1;
      }
    }
    this.o00Ooo00 = -1;
  }
  
  public MenuBuilder getAdapterMenu()
  {
    return this.o00OoOoo;
  }
  
  public int getCount()
  {
    boolean bool = this.o00Ooo0O;
    ArrayList localArrayList;
    if (bool) {
      localArrayList = this.o00OoOoo.getNonActionItems();
    } else {
      localArrayList = this.o00OoOoo.getVisibleItems();
    }
    int j = this.o00Ooo00;
    int i = localArrayList.size();
    if (j < 0) {
      return i;
    }
    return i + -1;
  }
  
  public boolean getForceShowIcon()
  {
    return this.o00Ooo0;
  }
  
  public MenuItemImpl getItem(int paramInt)
  {
    boolean bool = this.o00Ooo0O;
    ArrayList localArrayList;
    if (bool) {
      localArrayList = this.o00OoOoo.getNonActionItems();
    } else {
      localArrayList = this.o00OoOoo.getVisibleItems();
    }
    int i = this.o00Ooo00;
    if ((i >= 0) && (paramInt >= i)) {
      paramInt += 1;
    }
    return (MenuItemImpl)localArrayList.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.o00Ooo0o;
      i = this.o00OooO0;
      paramView = paramView.inflate(i, paramViewGroup, false);
    }
    paramViewGroup = getItem(paramInt);
    int j = paramViewGroup.getGroupId();
    int i = paramInt + -1;
    if (i >= 0)
    {
      MenuItemImpl localMenuItemImpl1 = getItem(i);
      i = localMenuItemImpl1.getGroupId();
    }
    else
    {
      i = j;
    }
    Object localObject = paramView;
    localObject = (ListMenuItemView)paramView;
    MenuBuilder localMenuBuilder = this.o00OoOoo;
    boolean bool2 = localMenuBuilder.isGroupDividerEnabled();
    int k = 1;
    if ((bool2) && (j != i))
    {
      j = k;
    }
    else
    {
      j = 0;
      paramViewGroup = null;
    }
    ((ListMenuItemView)localObject).setGroupDividerEnabled(j);
    paramViewGroup = paramView;
    paramViewGroup = (MenuView.ItemView)paramView;
    boolean bool1 = this.o00Ooo0;
    if (bool1) {
      ((ListMenuItemView)localObject).setForceShowIcon(k);
    }
    MenuItemImpl localMenuItemImpl2 = getItem(paramInt);
    paramViewGroup.initialize(localMenuItemImpl2, 0);
    return paramView;
  }
  
  public void notifyDataSetChanged()
  {
    OooO00o();
    super.notifyDataSetChanged();
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.o00Ooo0 = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuAdapter
 * JD-Core Version:    0.7.0.1
 */