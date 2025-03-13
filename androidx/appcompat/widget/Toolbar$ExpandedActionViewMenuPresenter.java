package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.SubMenuBuilder;

class Toolbar$ExpandedActionViewMenuPresenter
  implements MenuPresenter
{
  public MenuBuilder o00OoOoo;
  public MenuItemImpl o00Ooo00;
  
  public Toolbar$ExpandedActionViewMenuPresenter(Toolbar paramToolbar) {}
  
  public boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    paramMenuBuilder = this.o00Ooo0.mExpandedActionView;
    boolean bool = paramMenuBuilder instanceof CollapsibleActionView;
    if (bool)
    {
      paramMenuBuilder = (CollapsibleActionView)paramMenuBuilder;
      paramMenuBuilder.OooO0OO();
    }
    paramMenuBuilder = this.o00Ooo0;
    Object localObject = paramMenuBuilder.mExpandedActionView;
    paramMenuBuilder.removeView((View)localObject);
    paramMenuBuilder = this.o00Ooo0;
    localObject = paramMenuBuilder.mCollapseButtonView;
    paramMenuBuilder.removeView((View)localObject);
    paramMenuBuilder = this.o00Ooo0;
    paramMenuBuilder.mExpandedActionView = null;
    paramMenuBuilder.addChildrenForExpandedActionView();
    this.o00Ooo00 = null;
    this.o00Ooo0.requestLayout();
    paramMenuItemImpl.setActionViewExpanded(false);
    this.o00Ooo0.updateBackInvokedCallbackState();
    return true;
  }
  
  public boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    this.o00Ooo0.ensureCollapseButtonView();
    paramMenuBuilder = this.o00Ooo0.mCollapseButtonView.getParent();
    Object localObject = this.o00Ooo0;
    boolean bool1;
    if (paramMenuBuilder != localObject)
    {
      bool1 = paramMenuBuilder instanceof ViewGroup;
      if (bool1)
      {
        paramMenuBuilder = (ViewGroup)paramMenuBuilder;
        localObject = ((Toolbar)localObject).mCollapseButtonView;
        paramMenuBuilder.removeView((View)localObject);
      }
      paramMenuBuilder = this.o00Ooo0;
      localObject = paramMenuBuilder.mCollapseButtonView;
      paramMenuBuilder.addView((View)localObject);
    }
    paramMenuBuilder = this.o00Ooo0;
    localObject = paramMenuItemImpl.getActionView();
    paramMenuBuilder.mExpandedActionView = ((View)localObject);
    this.o00Ooo00 = paramMenuItemImpl;
    paramMenuBuilder = this.o00Ooo0.mExpandedActionView.getParent();
    localObject = this.o00Ooo0;
    if (paramMenuBuilder != localObject)
    {
      bool1 = paramMenuBuilder instanceof ViewGroup;
      if (bool1)
      {
        paramMenuBuilder = (ViewGroup)paramMenuBuilder;
        localObject = ((Toolbar)localObject).mExpandedActionView;
        paramMenuBuilder.removeView((View)localObject);
      }
      paramMenuBuilder = this.o00Ooo0.generateDefaultLayoutParams();
      localObject = this.o00Ooo0;
      int i = ((Toolbar)localObject).mButtonGravity & 0x70;
      int j = 8388611;
      i |= j;
      paramMenuBuilder.OooO00o = i;
      i = 2;
      paramMenuBuilder.OooO0O0 = i;
      ((Toolbar)localObject).mExpandedActionView.setLayoutParams(paramMenuBuilder);
      paramMenuBuilder = this.o00Ooo0;
      localObject = paramMenuBuilder.mExpandedActionView;
      paramMenuBuilder.addView((View)localObject);
    }
    this.o00Ooo0.removeChildrenForExpandedActionView();
    paramMenuBuilder = this.o00Ooo0;
    paramMenuBuilder.requestLayout();
    boolean bool2 = true;
    paramMenuItemImpl.setActionViewExpanded(bool2);
    paramMenuItemImpl = this.o00Ooo0.mExpandedActionView;
    boolean bool3 = paramMenuItemImpl instanceof CollapsibleActionView;
    if (bool3)
    {
      paramMenuItemImpl = (CollapsibleActionView)paramMenuItemImpl;
      paramMenuItemImpl.OooO0O0();
    }
    this.o00Ooo0.updateBackInvokedCallbackState();
    return bool2;
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public int getId()
  {
    return 0;
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder)
  {
    paramContext = this.o00OoOoo;
    if (paramContext != null)
    {
      MenuItemImpl localMenuItemImpl = this.o00Ooo00;
      if (localMenuItemImpl != null) {
        paramContext.collapseItemActionView(localMenuItemImpl);
      }
    }
    this.o00OoOoo = paramMenuBuilder;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    return false;
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback) {}
  
  public void updateMenuView(boolean paramBoolean)
  {
    Object localObject = this.o00Ooo00;
    if (localObject != null)
    {
      localObject = this.o00OoOoo;
      int i = 0;
      MenuItemImpl localMenuItemImpl1 = null;
      if (localObject != null)
      {
        paramBoolean = ((MenuBuilder)localObject).size();
        boolean bool = false;
        while (bool < paramBoolean)
        {
          MenuItem localMenuItem = this.o00OoOoo.getItem(bool);
          MenuItemImpl localMenuItemImpl2 = this.o00Ooo00;
          if (localMenuItem == localMenuItemImpl2)
          {
            i = 1;
            break;
          }
          int j;
          bool += true;
        }
      }
      if (i == 0)
      {
        localObject = this.o00OoOoo;
        localMenuItemImpl1 = this.o00Ooo00;
        collapseItemActionView((MenuBuilder)localObject, localMenuItemImpl1);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter
 * JD-Core Version:    0.7.0.1
 */