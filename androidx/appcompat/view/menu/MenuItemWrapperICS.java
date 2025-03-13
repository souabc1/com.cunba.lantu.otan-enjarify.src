package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportMenuItem;
import java.lang.reflect.Method;

public class MenuItemWrapperICS
  extends BaseMenuWrapper
  implements MenuItem
{
  public final SupportMenuItem OooO0Oo;
  public Method OooO0o0;
  
  public MenuItemWrapperICS(Context paramContext, SupportMenuItem paramSupportMenuItem)
  {
    super(paramContext);
    if (paramSupportMenuItem != null)
    {
      this.OooO0Oo = paramSupportMenuItem;
      return;
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramContext.<init>("Wrapped Object can not be null.");
    throw paramContext;
  }
  
  public boolean collapseActionView()
  {
    return this.OooO0Oo.collapseActionView();
  }
  
  public boolean expandActionView()
  {
    return this.OooO0Oo.expandActionView();
  }
  
  public android.view.ActionProvider getActionProvider()
  {
    androidx.core.view.ActionProvider localActionProvider = this.OooO0Oo.getSupportActionProvider();
    boolean bool = localActionProvider instanceof MenuItemWrapperICS.ActionProviderWrapper;
    if (bool) {
      return ((MenuItemWrapperICS.ActionProviderWrapper)localActionProvider).OooO0Oo;
    }
    return null;
  }
  
  public View getActionView()
  {
    View localView = this.OooO0Oo.getActionView();
    boolean bool = localView instanceof MenuItemWrapperICS.CollapsibleActionViewWrapper;
    if (bool) {
      localView = ((MenuItemWrapperICS.CollapsibleActionViewWrapper)localView).getWrappedView();
    }
    return localView;
  }
  
  public int getAlphabeticModifiers()
  {
    return this.OooO0Oo.getAlphabeticModifiers();
  }
  
  public char getAlphabeticShortcut()
  {
    return this.OooO0Oo.getAlphabeticShortcut();
  }
  
  public CharSequence getContentDescription()
  {
    return this.OooO0Oo.getContentDescription();
  }
  
  public int getGroupId()
  {
    return this.OooO0Oo.getGroupId();
  }
  
  public Drawable getIcon()
  {
    return this.OooO0Oo.getIcon();
  }
  
  public ColorStateList getIconTintList()
  {
    return this.OooO0Oo.getIconTintList();
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return this.OooO0Oo.getIconTintMode();
  }
  
  public Intent getIntent()
  {
    return this.OooO0Oo.getIntent();
  }
  
  public int getItemId()
  {
    return this.OooO0Oo.getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.OooO0Oo.getMenuInfo();
  }
  
  public int getNumericModifiers()
  {
    return this.OooO0Oo.getNumericModifiers();
  }
  
  public char getNumericShortcut()
  {
    return this.OooO0Oo.getNumericShortcut();
  }
  
  public int getOrder()
  {
    return this.OooO0Oo.getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    SubMenu localSubMenu = this.OooO0Oo.getSubMenu();
    return OooO0OO(localSubMenu);
  }
  
  public CharSequence getTitle()
  {
    return this.OooO0Oo.getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return this.OooO0Oo.getTitleCondensed();
  }
  
  public CharSequence getTooltipText()
  {
    return this.OooO0Oo.getTooltipText();
  }
  
  public boolean hasSubMenu()
  {
    return this.OooO0Oo.hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return this.OooO0Oo.isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return this.OooO0Oo.isCheckable();
  }
  
  public boolean isChecked()
  {
    return this.OooO0Oo.isChecked();
  }
  
  public boolean isEnabled()
  {
    return this.OooO0Oo.isEnabled();
  }
  
  public boolean isVisible()
  {
    return this.OooO0Oo.isVisible();
  }
  
  public MenuItem setActionProvider(android.view.ActionProvider paramActionProvider)
  {
    MenuItemWrapperICS.ActionProviderWrapperJB localActionProviderWrapperJB = new androidx/appcompat/view/menu/MenuItemWrapperICS$ActionProviderWrapperJB;
    Object localObject = this.OooO00o;
    localActionProviderWrapperJB.<init>(this, (Context)localObject, paramActionProvider);
    localObject = this.OooO0Oo;
    if (paramActionProvider == null) {
      localActionProviderWrapperJB = null;
    }
    ((SupportMenuItem)localObject).OooO00o(localActionProviderWrapperJB);
    return this;
  }
  
  public MenuItem setActionView(int paramInt)
  {
    SupportMenuItem localSupportMenuItem = this.OooO0Oo;
    localSupportMenuItem.setActionView(paramInt);
    View localView = this.OooO0Oo.getActionView();
    boolean bool = localView instanceof CollapsibleActionView;
    if (bool)
    {
      localSupportMenuItem = this.OooO0Oo;
      MenuItemWrapperICS.CollapsibleActionViewWrapper localCollapsibleActionViewWrapper = new androidx/appcompat/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;
      localCollapsibleActionViewWrapper.<init>((View)localView);
      localSupportMenuItem.setActionView(localCollapsibleActionViewWrapper);
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    boolean bool = paramView instanceof CollapsibleActionView;
    if (bool)
    {
      MenuItemWrapperICS.CollapsibleActionViewWrapper localCollapsibleActionViewWrapper = new androidx/appcompat/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;
      localCollapsibleActionViewWrapper.<init>((View)paramView);
      paramView = localCollapsibleActionViewWrapper;
    }
    this.OooO0Oo.setActionView(paramView);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    this.OooO0Oo.setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    this.OooO0Oo.setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    this.OooO0Oo.setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    this.OooO0Oo.setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    this.OooO0Oo.setContentDescription(paramCharSequence);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    this.OooO0Oo.setEnabled(paramBoolean);
    return this;
  }
  
  public void setExclusiveCheckable(boolean paramBoolean)
  {
    try
    {
      Object localObject1 = this.OooO0o0;
      int i = 1;
      if (localObject1 == null)
      {
        localObject1 = this.OooO0Oo;
        localObject1 = localObject1.getClass();
        localObject2 = "setExclusiveCheckable";
        Class[] arrayOfClass = new Class[i];
        Class localClass = Boolean.TYPE;
        arrayOfClass[0] = localClass;
        localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
        this.OooO0o0 = ((Method)localObject1);
      }
      localObject1 = this.OooO0o0;
      Object localObject2 = this.OooO0Oo;
      Object[] arrayOfObject = new Object[i];
      Boolean localBoolean = Boolean.valueOf(paramBoolean);
      arrayOfObject[0] = localBoolean;
      ((Method)localObject1).invoke(localObject2, arrayOfObject);
      label94:
      return;
    }
    catch (Exception localException)
    {
      break label94;
    }
  }
  
  public MenuItem setIcon(int paramInt)
  {
    this.OooO0Oo.setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    this.OooO0Oo.setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    this.OooO0Oo.setIconTintList(paramColorStateList);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    this.OooO0Oo.setIconTintMode(paramMode);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    this.OooO0Oo.setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    this.OooO0Oo.setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    this.OooO0Oo.setNumericShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    SupportMenuItem localSupportMenuItem = this.OooO0Oo;
    MenuItemWrapperICS.OnActionExpandListenerWrapper localOnActionExpandListenerWrapper;
    if (paramOnActionExpandListener != null)
    {
      localOnActionExpandListenerWrapper = new androidx/appcompat/view/menu/MenuItemWrapperICS$OnActionExpandListenerWrapper;
      localOnActionExpandListenerWrapper.<init>(this, paramOnActionExpandListener);
    }
    else
    {
      localOnActionExpandListenerWrapper = null;
    }
    localSupportMenuItem.setOnActionExpandListener(localOnActionExpandListenerWrapper);
    return this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    SupportMenuItem localSupportMenuItem = this.OooO0Oo;
    MenuItemWrapperICS.OnMenuItemClickListenerWrapper localOnMenuItemClickListenerWrapper;
    if (paramOnMenuItemClickListener != null)
    {
      localOnMenuItemClickListenerWrapper = new androidx/appcompat/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;
      localOnMenuItemClickListenerWrapper.<init>(this, paramOnMenuItemClickListener);
    }
    else
    {
      localOnMenuItemClickListenerWrapper = null;
    }
    localSupportMenuItem.setOnMenuItemClickListener(localOnMenuItemClickListenerWrapper);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.OooO0Oo.setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    this.OooO0Oo.setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    this.OooO0Oo.setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    this.OooO0Oo.setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    this.OooO0Oo.setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.OooO0Oo.setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.OooO0Oo.setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    this.OooO0Oo.setTooltipText(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return this.OooO0Oo.setVisible(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS
 * JD-Core Version:    0.7.0.1
 */