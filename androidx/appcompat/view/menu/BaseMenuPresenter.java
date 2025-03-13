package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class BaseMenuPresenter
  implements MenuPresenter
{
  public Context o00OoOoo;
  public MenuBuilder o00Ooo0;
  public Context o00Ooo00;
  public LayoutInflater o00Ooo0O;
  public LayoutInflater o00Ooo0o;
  public int o00OooO;
  public MenuPresenter.Callback o00OooO0;
  public int o00OooOO;
  public MenuView o00OooOo;
  public int o0O00o0;
  
  public BaseMenuPresenter(Context paramContext, int paramInt1, int paramInt2)
  {
    this.o00OoOoo = paramContext;
    paramContext = LayoutInflater.from(paramContext);
    this.o00Ooo0O = paramContext;
    this.o00OooO = paramInt1;
    this.o00OooOO = paramInt2;
  }
  
  public void OooO0O0(View paramView, int paramInt)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    if (localViewGroup != null) {
      localViewGroup.removeView(paramView);
    }
    ((ViewGroup)this.o00OooOo).addView(paramView, paramInt);
  }
  
  public abstract void OooO0OO(MenuItemImpl paramMenuItemImpl, MenuView.ItemView paramItemView);
  
  public MenuView.ItemView OooO0Oo(ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = this.o00Ooo0O;
    int i = this.o00OooOO;
    return (MenuView.ItemView)localLayoutInflater.inflate(i, paramViewGroup, false);
  }
  
  public View OooO0o(MenuItemImpl paramMenuItemImpl, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = paramView instanceof MenuView.ItemView;
    if (bool) {
      paramView = (MenuView.ItemView)paramView;
    } else {
      paramView = OooO0Oo(paramViewGroup);
    }
    OooO0OO(paramMenuItemImpl, paramView);
    return (View)paramView;
  }
  
  public boolean OooO0o0(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public MenuView OooO0oO(ViewGroup paramViewGroup)
  {
    Object localObject = this.o00OooOo;
    if (localObject == null)
    {
      localObject = this.o00Ooo0O;
      int i = this.o00OooO;
      paramViewGroup = (MenuView)((LayoutInflater)localObject).inflate(i, paramViewGroup, false);
      this.o00OooOo = paramViewGroup;
      localObject = this.o00Ooo0;
      paramViewGroup.initialize((MenuBuilder)localObject);
      boolean bool = true;
      updateMenuView(bool);
    }
    return this.o00OooOo;
  }
  
  public boolean OooO0oo(int paramInt, MenuItemImpl paramMenuItemImpl)
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
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public MenuPresenter.Callback getCallback()
  {
    return this.o00OooO0;
  }
  
  public int getId()
  {
    return this.o0O00o0;
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder)
  {
    this.o00Ooo00 = paramContext;
    paramContext = LayoutInflater.from(paramContext);
    this.o00Ooo0o = paramContext;
    this.o00Ooo0 = paramMenuBuilder;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    MenuPresenter.Callback localCallback = this.o00OooO0;
    if (localCallback != null) {
      localCallback.onCloseMenu(paramMenuBuilder, paramBoolean);
    }
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    MenuPresenter.Callback localCallback = this.o00OooO0;
    if (localCallback != null)
    {
      if (paramSubMenuBuilder == null) {
        paramSubMenuBuilder = this.o00Ooo0;
      }
      return localCallback.OooO00o(paramSubMenuBuilder);
    }
    return false;
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback)
  {
    this.o00OooO0 = paramCallback;
  }
  
  public void setId(int paramInt)
  {
    this.o0O00o0 = paramInt;
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)this.o00OooOo;
    if (localViewGroup == null) {
      return;
    }
    Object localObject1 = this.o00Ooo0;
    int i = 0;
    if (localObject1 != null)
    {
      ((MenuBuilder)localObject1).flagActionItems();
      localObject1 = this.o00Ooo0.getVisibleItems();
      int j = ((ArrayList)localObject1).size();
      int k = 0;
      int m = 0;
      while (k < j)
      {
        MenuItemImpl localMenuItemImpl = (MenuItemImpl)((ArrayList)localObject1).get(k);
        boolean bool1 = OooO0oo(m, localMenuItemImpl);
        if (bool1)
        {
          View localView1 = localViewGroup.getChildAt(m);
          boolean bool2 = localView1 instanceof MenuView.ItemView;
          Object localObject2;
          if (bool2)
          {
            localObject2 = localView1;
            localObject2 = ((MenuView.ItemView)localView1).getItemData();
          }
          else
          {
            bool2 = false;
            localObject2 = null;
          }
          View localView2 = OooO0o(localMenuItemImpl, (View)localView1, localViewGroup);
          if (localMenuItemImpl != localObject2)
          {
            localView2.setPressed(false);
            localView2.jumpDrawablesToCurrentState();
          }
          if (localView2 != localView1) {
            OooO0O0(localView2, m);
          }
          m += 1;
        }
        k += 1;
      }
      i = m;
    }
    for (;;)
    {
      int n = localViewGroup.getChildCount();
      if (i >= n) {
        break;
      }
      boolean bool3 = OooO0o0(localViewGroup, i);
      if (!bool3) {
        i += 1;
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.BaseMenuPresenter
 * JD-Core Version:    0.7.0.1
 */