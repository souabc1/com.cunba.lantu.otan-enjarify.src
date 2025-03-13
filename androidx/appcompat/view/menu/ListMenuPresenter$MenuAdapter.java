package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class ListMenuPresenter$MenuAdapter
  extends BaseAdapter
{
  public int o00OoOoo = -1;
  
  public ListMenuPresenter$MenuAdapter(ListMenuPresenter paramListMenuPresenter)
  {
    OooO00o();
  }
  
  public void OooO00o()
  {
    MenuItemImpl localMenuItemImpl1 = this.o00Ooo00.o00Ooo0.getExpandedItem();
    if (localMenuItemImpl1 != null)
    {
      ArrayList localArrayList = this.o00Ooo00.o00Ooo0.getNonActionItems();
      int i = localArrayList.size();
      int j = 0;
      while (j < i)
      {
        MenuItemImpl localMenuItemImpl2 = (MenuItemImpl)localArrayList.get(j);
        if (localMenuItemImpl2 == localMenuItemImpl1)
        {
          this.o00OoOoo = j;
          return;
        }
        j += 1;
      }
    }
    this.o00OoOoo = -1;
  }
  
  public int getCount()
  {
    ArrayList localArrayList = this.o00Ooo00.o00Ooo0.getNonActionItems();
    int i = localArrayList.size();
    ListMenuPresenter localListMenuPresenter = this.o00Ooo00;
    int j = localListMenuPresenter.o00Ooo0o;
    i -= j;
    j = this.o00OoOoo;
    if (j < 0) {
      return i;
    }
    return i + -1;
  }
  
  public MenuItemImpl getItem(int paramInt)
  {
    ArrayList localArrayList = this.o00Ooo00.o00Ooo0.getNonActionItems();
    ListMenuPresenter localListMenuPresenter = this.o00Ooo00;
    int i = localListMenuPresenter.o00Ooo0o;
    paramInt += i;
    i = this.o00OoOoo;
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
      paramView = this.o00Ooo00;
      LayoutInflater localLayoutInflater = paramView.o00Ooo00;
      int i = paramView.o00OooO;
      paramView = localLayoutInflater.inflate(i, paramViewGroup, false);
    }
    paramViewGroup = paramView;
    paramViewGroup = (MenuView.ItemView)paramView;
    MenuItemImpl localMenuItemImpl = getItem(paramInt);
    paramViewGroup.initialize(localMenuItemImpl, 0);
    return paramView;
  }
  
  public void notifyDataSetChanged()
  {
    OooO00o();
    super.notifyDataSetChanged();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter
 * JD-Core Version:    0.7.0.1
 */