package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import androidx.appcompat.R.layout;

public class ListMenuPresenter
  implements MenuPresenter, AdapterView.OnItemClickListener
{
  public Context o00OoOoo;
  public MenuBuilder o00Ooo0;
  public LayoutInflater o00Ooo00;
  public ExpandedMenuView o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  public MenuPresenter.Callback o00OooOO;
  public ListMenuPresenter.MenuAdapter o00OooOo;
  public int o0O00o0;
  
  public ListMenuPresenter(int paramInt1, int paramInt2)
  {
    this.o00OooO = paramInt1;
    this.o00OooO0 = paramInt2;
  }
  
  public ListMenuPresenter(Context paramContext, int paramInt)
  {
    this(paramInt, 0);
    this.o00OoOoo = paramContext;
    paramContext = LayoutInflater.from(paramContext);
    this.o00Ooo00 = paramContext;
  }
  
  public MenuView OooO00o(ViewGroup paramViewGroup)
  {
    Object localObject = this.o00Ooo0O;
    if (localObject == null)
    {
      localObject = this.o00Ooo00;
      int i = R.layout.abc_expanded_menu_layout;
      paramViewGroup = (ExpandedMenuView)((LayoutInflater)localObject).inflate(i, paramViewGroup, false);
      this.o00Ooo0O = paramViewGroup;
      paramViewGroup = this.o00OooOo;
      if (paramViewGroup == null)
      {
        paramViewGroup = new androidx/appcompat/view/menu/ListMenuPresenter$MenuAdapter;
        paramViewGroup.<init>(this);
        this.o00OooOo = paramViewGroup;
      }
      paramViewGroup = this.o00Ooo0O;
      localObject = this.o00OooOo;
      paramViewGroup.setAdapter((ListAdapter)localObject);
      paramViewGroup = this.o00Ooo0O;
      paramViewGroup.setOnItemClickListener(this);
    }
    return this.o00Ooo0O;
  }
  
  public void OooO0O0(Bundle paramBundle)
  {
    Object localObject = "android:menu:list";
    paramBundle = paramBundle.getSparseParcelableArray((String)localObject);
    if (paramBundle != null)
    {
      localObject = this.o00Ooo0O;
      ((View)localObject).restoreHierarchyState(paramBundle);
    }
  }
  
  public void OooO0OO(Bundle paramBundle)
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    ExpandedMenuView localExpandedMenuView = this.o00Ooo0O;
    if (localExpandedMenuView != null) {
      localExpandedMenuView.saveHierarchyState(localSparseArray);
    }
    paramBundle.putSparseParcelableArray("android:menu:list", localSparseArray);
  }
  
  public boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public ListAdapter getAdapter()
  {
    ListMenuPresenter.MenuAdapter localMenuAdapter = this.o00OooOo;
    if (localMenuAdapter == null)
    {
      localMenuAdapter = new androidx/appcompat/view/menu/ListMenuPresenter$MenuAdapter;
      localMenuAdapter.<init>(this);
      this.o00OooOo = localMenuAdapter;
    }
    return this.o00OooOo;
  }
  
  public int getId()
  {
    return this.o0O00o0;
  }
  
  public int getItemIndexOffset()
  {
    return this.o00Ooo0o;
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder)
  {
    int i = this.o00OooO0;
    Object localObject;
    if (i != 0)
    {
      localObject = new android/view/ContextThemeWrapper;
      int j = this.o00OooO0;
      ((ContextThemeWrapper)localObject).<init>(paramContext, j);
      this.o00OoOoo = ((Context)localObject);
    }
    for (paramContext = LayoutInflater.from((Context)localObject);; paramContext = LayoutInflater.from(paramContext))
    {
      this.o00Ooo00 = paramContext;
      break;
      localObject = this.o00OoOoo;
      if (localObject == null) {
        break;
      }
      this.o00OoOoo = paramContext;
      localObject = this.o00Ooo00;
      if (localObject != null) {
        break;
      }
    }
    this.o00Ooo0 = paramMenuBuilder;
    paramContext = this.o00OooOo;
    if (paramContext != null) {
      paramContext.notifyDataSetChanged();
    }
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    MenuPresenter.Callback localCallback = this.o00OooOO;
    if (localCallback != null) {
      localCallback.onCloseMenu(paramMenuBuilder, paramBoolean);
    }
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.o00Ooo0;
    paramView = this.o00OooOo.getItem(paramInt);
    paramAdapterView.performItemAction(paramView, this, 0);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (Bundle)paramParcelable;
    OooO0O0(paramParcelable);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object localObject = this.o00Ooo0O;
    if (localObject == null) {
      return null;
    }
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    OooO0OO((Bundle)localObject);
    return localObject;
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    boolean bool = paramSubMenuBuilder.hasVisibleItems();
    if (!bool) {
      return false;
    }
    Object localObject = new androidx/appcompat/view/menu/MenuDialogHelper;
    ((MenuDialogHelper)localObject).<init>(paramSubMenuBuilder);
    ((MenuDialogHelper)localObject).OooO0OO(null);
    localObject = this.o00OooOO;
    if (localObject != null) {
      ((MenuPresenter.Callback)localObject).OooO00o(paramSubMenuBuilder);
    }
    return true;
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback)
  {
    this.o00OooOO = paramCallback;
  }
  
  public void setId(int paramInt)
  {
    this.o0O00o0 = paramInt;
  }
  
  public void setItemIndexOffset(int paramInt)
  {
    this.o00Ooo0o = paramInt;
    ExpandedMenuView localExpandedMenuView = this.o00Ooo0O;
    if (localExpandedMenuView != null)
    {
      paramInt = 0;
      localExpandedMenuView = null;
      updateMenuView(false);
    }
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    ListMenuPresenter.MenuAdapter localMenuAdapter = this.o00OooOo;
    if (localMenuAdapter != null) {
      localMenuAdapter.notifyDataSetChanged();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.ListMenuPresenter
 * JD-Core Version:    0.7.0.1
 */