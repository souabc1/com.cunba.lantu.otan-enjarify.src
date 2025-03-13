package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.appcompat.R.string;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider.VisibilityListener;

public final class MenuItemImpl
  implements SupportMenuItem
{
  public int OooO;
  public final int OooO00o;
  public final int OooO0O0;
  public final int OooO0OO;
  public final int OooO0Oo;
  public CharSequence OooO0o;
  public CharSequence OooO0o0;
  public Intent OooO0oO;
  public char OooO0oo;
  public char OooOO0;
  public int OooOO0O;
  public Drawable OooOO0o;
  public MenuBuilder OooOOO;
  public int OooOOO0;
  public SubMenuBuilder OooOOOO;
  public Runnable OooOOOo;
  public CharSequence OooOOo;
  public MenuItem.OnMenuItemClickListener OooOOo0;
  public CharSequence OooOOoo;
  public boolean OooOo;
  public PorterDuff.Mode OooOo0;
  public ColorStateList OooOo00;
  public boolean OooOo0O;
  public boolean OooOo0o;
  public int OooOoO;
  public int OooOoO0;
  public View OooOoOO;
  public MenuItem.OnActionExpandListener OooOoo;
  public androidx.core.view.ActionProvider OooOoo0;
  public boolean OooOooO;
  public ContextMenu.ContextMenuInfo OooOooo;
  
  public MenuItemImpl(MenuBuilder paramMenuBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    int i = 4096;
    this.OooO = i;
    this.OooOO0O = i;
    this.OooOOO0 = 0;
    this.OooOo00 = null;
    this.OooOo0 = null;
    this.OooOo0O = false;
    this.OooOo0o = false;
    this.OooOo = false;
    this.OooOoO0 = 16;
    this.OooOooO = false;
    this.OooOOO = paramMenuBuilder;
    this.OooO00o = paramInt2;
    this.OooO0O0 = paramInt1;
    this.OooO0OO = paramInt3;
    this.OooO0Oo = paramInt4;
    this.OooO0o0 = paramCharSequence;
    this.OooOoO = paramInt5;
  }
  
  public static void OooO0OO(StringBuilder paramStringBuilder, int paramInt1, int paramInt2, String paramString)
  {
    paramInt1 &= paramInt2;
    if (paramInt1 == paramInt2) {
      paramStringBuilder.append(paramString);
    }
  }
  
  public boolean OooO()
  {
    int i = this.OooOoO;
    int j = 2;
    i &= j;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public SupportMenuItem OooO00o(androidx.core.view.ActionProvider paramActionProvider)
  {
    Object localObject = this.OooOoo0;
    if (localObject != null) {
      ((androidx.core.view.ActionProvider)localObject).OooO0oO();
    }
    localObject = null;
    this.OooOoOO = null;
    this.OooOoo0 = paramActionProvider;
    paramActionProvider = this.OooOOO;
    boolean bool = true;
    paramActionProvider.onItemsChanged(bool);
    paramActionProvider = this.OooOoo0;
    if (paramActionProvider != null)
    {
      localObject = new androidx/appcompat/view/menu/MenuItemImpl$1;
      ((MenuItemImpl.1)localObject).<init>(this);
      paramActionProvider.setVisibilityListener((ActionProvider.VisibilityListener)localObject);
    }
    return this;
  }
  
  public void OooO0O0()
  {
    this.OooOOO.onItemActionRequestChanged(this);
  }
  
  public final Drawable OooO0Oo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      boolean bool = this.OooOo;
      if (bool)
      {
        bool = this.OooOo0O;
        if (!bool)
        {
          bool = this.OooOo0o;
          if (!bool) {}
        }
        else
        {
          paramDrawable = DrawableCompat.OooOOo(paramDrawable).mutate();
          bool = this.OooOo0O;
          if (bool)
          {
            localObject = this.OooOo00;
            DrawableCompat.OooOOOO(paramDrawable, (ColorStateList)localObject);
          }
          bool = this.OooOo0o;
          if (bool)
          {
            localObject = this.OooOo0;
            DrawableCompat.OooOOOo(paramDrawable, (PorterDuff.Mode)localObject);
          }
          bool = false;
          Object localObject = null;
          this.OooOo = false;
        }
      }
    }
    return paramDrawable;
  }
  
  public boolean OooO0o()
  {
    int i = this.OooOoO & 0x8;
    boolean bool = false;
    if (i != 0)
    {
      Object localObject = this.OooOoOO;
      if (localObject == null)
      {
        localObject = this.OooOoo0;
        if (localObject != null)
        {
          localObject = ((androidx.core.view.ActionProvider)localObject).OooO0OO(this);
          this.OooOoOO = ((View)localObject);
        }
      }
      localObject = this.OooOoOO;
      if (localObject != null) {
        bool = true;
      }
    }
    return bool;
  }
  
  public CharSequence OooO0o0(MenuView.ItemView paramItemView)
  {
    if (paramItemView != null)
    {
      boolean bool = paramItemView.prefersCondensedTitle();
      if (bool) {
        return getTitleCondensed();
      }
    }
    paramItemView = getTitle();
    return paramItemView;
  }
  
  public boolean OooO0oO()
  {
    Object localObject = this.OooOOo0;
    boolean bool1 = true;
    if (localObject != null)
    {
      bool2 = ((MenuItem.OnMenuItemClickListener)localObject).onMenuItemClick(this);
      if (bool2) {
        return bool1;
      }
    }
    localObject = this.OooOOO;
    boolean bool2 = ((MenuBuilder)localObject).dispatchMenuItemSelected((MenuBuilder)localObject, this);
    if (bool2) {
      return bool1;
    }
    localObject = this.OooOOOo;
    if (localObject != null)
    {
      ((Runnable)localObject).run();
      return bool1;
    }
    localObject = this.OooO0oO;
    if (localObject != null) {
      try
      {
        localObject = this.OooOOO;
        localObject = ((MenuBuilder)localObject).getContext();
        Intent localIntent = this.OooO0oO;
        ((Context)localObject).startActivity(localIntent);
        return bool1;
      }
      catch (ActivityNotFoundException localActivityNotFoundException) {}
    }
    localObject = this.OooOoo0;
    if (localObject != null)
    {
      bool2 = ((androidx.core.view.ActionProvider)localObject).OooO0Oo();
      if (bool2) {
        return bool1;
      }
    }
    return false;
  }
  
  public boolean OooO0oo()
  {
    int i = this.OooOoO;
    int j = 1;
    i &= j;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public SupportMenuItem OooOO0(int paramInt)
  {
    Context localContext = this.OooOOO.getContext();
    LayoutInflater localLayoutInflater = LayoutInflater.from(localContext);
    LinearLayout localLinearLayout = new android/widget/LinearLayout;
    localLinearLayout.<init>(localContext);
    View localView = localLayoutInflater.inflate(paramInt, localLinearLayout, false);
    OooOO0O(localView);
    return this;
  }
  
  public SupportMenuItem OooOO0O(View paramView)
  {
    this.OooOoOO = paramView;
    int i = 0;
    this.OooOoo0 = null;
    if (paramView != null)
    {
      i = paramView.getId();
      int j = -1;
      if (i == j)
      {
        i = this.OooO00o;
        if (i > 0) {
          paramView.setId(i);
        }
      }
    }
    this.OooOOO.onItemActionRequestChanged(this);
    return this;
  }
  
  public SupportMenuItem OooOO0o(int paramInt)
  {
    setShowAsAction(paramInt);
    return this;
  }
  
  public boolean OooOOO()
  {
    return this.OooOOO.getOptionalIconsVisible();
  }
  
  public boolean OooOOO0(boolean paramBoolean)
  {
    boolean bool1 = this.OooOoO0;
    boolean bool2 = bool1 & true;
    boolean bool3 = false;
    if (paramBoolean) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    paramBoolean |= bool2;
    this.OooOoO0 = paramBoolean;
    if (bool1 != paramBoolean) {
      bool3 = true;
    }
    return bool3;
  }
  
  public boolean OooOOOO()
  {
    MenuBuilder localMenuBuilder = this.OooOOO;
    boolean bool = localMenuBuilder.isShortcutsVisible();
    if (bool)
    {
      i = getShortcut();
      if (i != 0) {
        return 1;
      }
    }
    int i = 0;
    localMenuBuilder = null;
    return i;
  }
  
  public boolean OooOOOo()
  {
    int i = this.OooOoO;
    int j = 4;
    i &= j;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean collapseActionView()
  {
    int i = this.OooOoO & 0x8;
    if (i == 0) {
      return false;
    }
    Object localObject = this.OooOoOO;
    if (localObject == null) {
      return true;
    }
    localObject = this.OooOoo;
    if (localObject != null)
    {
      boolean bool = ((MenuItem.OnActionExpandListener)localObject).onMenuItemActionCollapse(this);
      if (!bool) {
        return false;
      }
    }
    return this.OooOOO.collapseItemActionView(this);
  }
  
  public boolean expandActionView()
  {
    boolean bool = OooO0o();
    if (!bool) {
      return false;
    }
    MenuItem.OnActionExpandListener localOnActionExpandListener = this.OooOoo;
    if (localOnActionExpandListener != null)
    {
      bool = localOnActionExpandListener.onMenuItemActionExpand(this);
      if (!bool) {
        return false;
      }
    }
    return this.OooOOO.expandItemActionView(this);
  }
  
  public android.view.ActionProvider getActionProvider()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("This is not supported, use MenuItemCompat.getActionProvider()");
    throw localUnsupportedOperationException;
  }
  
  public View getActionView()
  {
    Object localObject = this.OooOoOO;
    if (localObject != null) {
      return localObject;
    }
    localObject = this.OooOoo0;
    if (localObject != null)
    {
      localObject = ((androidx.core.view.ActionProvider)localObject).OooO0OO(this);
      this.OooOoOO = ((View)localObject);
      return localObject;
    }
    return null;
  }
  
  public int getAlphabeticModifiers()
  {
    return this.OooOO0O;
  }
  
  public char getAlphabeticShortcut()
  {
    return this.OooOO0;
  }
  
  public Runnable getCallback()
  {
    return this.OooOOOo;
  }
  
  public CharSequence getContentDescription()
  {
    return this.OooOOo;
  }
  
  public int getGroupId()
  {
    return this.OooO0O0;
  }
  
  public Drawable getIcon()
  {
    Object localObject = this.OooOO0o;
    if (localObject != null) {
      return OooO0Oo((Drawable)localObject);
    }
    int i = this.OooOOO0;
    if (i != 0)
    {
      localObject = this.OooOOO.getContext();
      int j = this.OooOOO0;
      localObject = AppCompatResources.OooO0O0((Context)localObject, j);
      this.OooOOO0 = 0;
      this.OooOO0o = ((Drawable)localObject);
      return OooO0Oo((Drawable)localObject);
    }
    return null;
  }
  
  public ColorStateList getIconTintList()
  {
    return this.OooOo00;
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return this.OooOo0;
  }
  
  public Intent getIntent()
  {
    return this.OooO0oO;
  }
  
  public int getItemId()
  {
    return this.OooO00o;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.OooOooo;
  }
  
  public int getNumericModifiers()
  {
    return this.OooO;
  }
  
  public char getNumericShortcut()
  {
    return this.OooO0oo;
  }
  
  public int getOrder()
  {
    return this.OooO0OO;
  }
  
  public int getOrdering()
  {
    return this.OooO0Oo;
  }
  
  public char getShortcut()
  {
    MenuBuilder localMenuBuilder = this.OooOOO;
    boolean bool = localMenuBuilder.isQwertyMode();
    char c;
    if (bool) {
      c = this.OooOO0;
    } else {
      c = this.OooO0oo;
    }
    return c;
  }
  
  public String getShortcutLabel()
  {
    int i = getShortcut();
    if (i == 0) {
      return "";
    }
    Resources localResources = this.OooOOO.getContext().getResources();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = ViewConfiguration.get(this.OooOOO.getContext());
    boolean bool1 = ((ViewConfiguration)localObject).hasPermanentMenuKey();
    if (bool1)
    {
      int k = R.string.abc_prepend_shortcut_label;
      localObject = localResources.getString(k);
      localStringBuilder.append((String)localObject);
    }
    localObject = this.OooOOO;
    boolean bool2 = ((MenuBuilder)localObject).isQwertyMode();
    int m;
    if (bool2) {
      m = this.OooOO0O;
    } else {
      m = this.OooO;
    }
    int i1 = R.string.abc_menu_meta_shortcut_label;
    String str1 = localResources.getString(i1);
    OooO0OO(localStringBuilder, m, 65536, str1);
    i1 = R.string.abc_menu_ctrl_shortcut_label;
    str1 = localResources.getString(i1);
    OooO0OO(localStringBuilder, m, 4096, str1);
    i1 = R.string.abc_menu_alt_shortcut_label;
    str1 = localResources.getString(i1);
    OooO0OO(localStringBuilder, m, 2, str1);
    i1 = R.string.abc_menu_shift_shortcut_label;
    str1 = localResources.getString(i1);
    OooO0OO(localStringBuilder, m, 1, str1);
    i1 = R.string.abc_menu_sym_shortcut_label;
    str1 = localResources.getString(i1);
    OooO0OO(localStringBuilder, m, 4, str1);
    i1 = R.string.abc_menu_function_shortcut_label;
    str1 = localResources.getString(i1);
    int i2 = 8;
    OooO0OO(localStringBuilder, m, i2, str1);
    int j;
    if (i != i2)
    {
      m = 10;
      if (i != m)
      {
        int n = 32;
        if (i != n)
        {
          localStringBuilder.append(i);
          break label317;
        }
        j = R.string.abc_menu_space_shortcut_label;
      }
      else
      {
        j = R.string.abc_menu_enter_shortcut_label;
      }
    }
    else
    {
      j = R.string.abc_menu_delete_shortcut_label;
    }
    String str2 = localResources.getString(j);
    localStringBuilder.append(str2);
    label317:
    return localStringBuilder.toString();
  }
  
  public SubMenu getSubMenu()
  {
    return this.OooOOOO;
  }
  
  public androidx.core.view.ActionProvider getSupportActionProvider()
  {
    return this.OooOoo0;
  }
  
  public CharSequence getTitle()
  {
    return this.OooO0o0;
  }
  
  public CharSequence getTitleCondensed()
  {
    CharSequence localCharSequence = this.OooO0o;
    if (localCharSequence == null) {
      localCharSequence = this.OooO0o0;
    }
    return localCharSequence;
  }
  
  public CharSequence getTooltipText()
  {
    return this.OooOOoo;
  }
  
  public boolean hasSubMenu()
  {
    SubMenuBuilder localSubMenuBuilder = this.OooOOOO;
    boolean bool;
    if (localSubMenuBuilder != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localSubMenuBuilder = null;
    }
    return bool;
  }
  
  public boolean isActionButton()
  {
    int i = this.OooOoO0;
    int j = 32;
    i &= j;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isActionViewExpanded()
  {
    return this.OooOooO;
  }
  
  public boolean isCheckable()
  {
    int i = this.OooOoO0;
    int j = 1;
    i &= j;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public boolean isChecked()
  {
    int i = this.OooOoO0;
    int j = 2;
    i &= j;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isEnabled()
  {
    int i = this.OooOoO0 & 0x10;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isExclusiveCheckable()
  {
    int i = this.OooOoO0 & 0x4;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isVisible()
  {
    androidx.core.view.ActionProvider localActionProvider = this.OooOoo0;
    boolean bool1 = true;
    if (localActionProvider != null)
    {
      boolean bool2 = localActionProvider.OooO0o();
      if (bool2)
      {
        int i = this.OooOoO0 & 0x8;
        if (i == 0)
        {
          localActionProvider = this.OooOoo0;
          boolean bool3 = localActionProvider.isVisible();
          if (bool3) {}
        }
        else
        {
          bool1 = false;
        }
        return bool1;
      }
    }
    int j = this.OooOoO0 & 0x8;
    if (j != 0) {
      bool1 = false;
    }
    return bool1;
  }
  
  public MenuItem setActionProvider(android.view.ActionProvider paramActionProvider)
  {
    paramActionProvider = new java/lang/UnsupportedOperationException;
    paramActionProvider.<init>("This is not supported, use MenuItemCompat.setActionProvider()");
    throw paramActionProvider;
  }
  
  public void setActionViewExpanded(boolean paramBoolean)
  {
    this.OooOooO = paramBoolean;
    this.OooOOO.onItemsChanged(false);
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    char c = this.OooOO0;
    if (c == paramChar) {
      return this;
    }
    paramChar = Character.toLowerCase(paramChar);
    this.OooOO0 = paramChar;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    char c = this.OooOO0;
    if (c == paramChar)
    {
      c = this.OooOO0O;
      if (c == paramInt) {
        return this;
      }
    }
    paramChar = Character.toLowerCase(paramChar);
    this.OooOO0 = paramChar;
    paramChar = KeyEvent.normalizeMetaState(paramInt);
    this.OooOO0O = paramChar;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    boolean bool1 = this.OooOoO0;
    boolean bool2 = bool1 & true;
    paramBoolean |= bool2;
    this.OooOoO0 = paramBoolean;
    if (bool1 != paramBoolean)
    {
      MenuBuilder localMenuBuilder = this.OooOOO;
      bool1 = false;
      localMenuBuilder.onItemsChanged(false);
    }
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    int i = this.OooOoO0 & 0x4;
    if (i != 0)
    {
      MenuBuilder localMenuBuilder = this.OooOOO;
      localMenuBuilder.setExclusiveItemChecked(this);
    }
    else
    {
      setCheckedInt(paramBoolean);
    }
    return this;
  }
  
  public void setCheckedInt(boolean paramBoolean)
  {
    boolean bool1 = this.OooOoO0;
    boolean bool2 = bool1 & true;
    MenuBuilder localMenuBuilder;
    if (paramBoolean)
    {
      paramBoolean = true;
    }
    else
    {
      paramBoolean = false;
      localMenuBuilder = null;
    }
    paramBoolean |= bool2;
    this.OooOoO0 = paramBoolean;
    if (bool1 != paramBoolean)
    {
      localMenuBuilder = this.OooOOO;
      localMenuBuilder.onItemsChanged(false);
    }
  }
  
  public SupportMenuItem setContentDescription(CharSequence paramCharSequence)
  {
    this.OooOOo = paramCharSequence;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {
      paramBoolean = this.OooOoO0 | 0x10;
    } else {
      paramBoolean = this.OooOoO0 & 0xFFFFFFEF;
    }
    this.OooOoO0 = paramBoolean;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public void setExclusiveCheckable(boolean paramBoolean)
  {
    boolean bool = this.OooOoO0 & 0xFFFFFFFB;
    if (paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    paramBoolean |= bool;
    this.OooOoO0 = paramBoolean;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    this.OooOO0o = null;
    this.OooOOO0 = paramInt;
    this.OooOo = true;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    this.OooOOO0 = 0;
    this.OooOO0o = paramDrawable;
    this.OooOo = true;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    this.OooOo00 = paramColorStateList;
    boolean bool = true;
    this.OooOo0O = bool;
    this.OooOo = bool;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    this.OooOo0 = paramMode;
    boolean bool = true;
    this.OooOo0o = bool;
    this.OooOo = bool;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    this.OooO0oO = paramIntent;
    return this;
  }
  
  public void setIsActionButton(boolean paramBoolean)
  {
    if (paramBoolean) {
      paramBoolean = this.OooOoO0 | 0x20;
    } else {
      paramBoolean = this.OooOoO0 & 0xFFFFFFDF;
    }
    this.OooOoO0 = paramBoolean;
  }
  
  public void setMenuInfo(ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.OooOooo = paramContextMenuInfo;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    char c = this.OooO0oo;
    if (c == paramChar) {
      return this;
    }
    this.OooO0oo = paramChar;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    char c = this.OooO0oo;
    if (c == paramChar)
    {
      c = this.OooO;
      if (c == paramInt) {
        return this;
      }
    }
    this.OooO0oo = paramChar;
    paramChar = KeyEvent.normalizeMetaState(paramInt);
    this.OooO = paramChar;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    this.OooOoo = paramOnActionExpandListener;
    return this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.OooOOo0 = paramOnMenuItemClickListener;
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.OooO0oo = paramChar1;
    paramChar1 = Character.toLowerCase(paramChar2);
    this.OooOO0 = paramChar1;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    this.OooO0oo = paramChar1;
    paramChar1 = KeyEvent.normalizeMetaState(paramInt1);
    this.OooO = paramChar1;
    paramChar1 = Character.toLowerCase(paramChar2);
    this.OooOO0 = paramChar1;
    paramChar1 = KeyEvent.normalizeMetaState(paramInt2);
    this.OooOO0O = paramChar1;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    int i = paramInt & 0x3;
    if (i != 0)
    {
      int j = 1;
      if (i != j)
      {
        j = 2;
        if (i != j)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
          throw localIllegalArgumentException;
        }
      }
    }
    this.OooOoO = paramInt;
    this.OooOOO.onItemActionRequestChanged(this);
  }
  
  public void setSubMenu(SubMenuBuilder paramSubMenuBuilder)
  {
    this.OooOOOO = paramSubMenuBuilder;
    CharSequence localCharSequence = getTitle();
    paramSubMenuBuilder.setHeaderTitle(localCharSequence);
  }
  
  public MenuItem setTitle(int paramInt)
  {
    String str = this.OooOOO.getContext().getString(paramInt);
    return setTitle(str);
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.OooO0o0 = paramCharSequence;
    this.OooOOO.onItemsChanged(false);
    SubMenuBuilder localSubMenuBuilder = this.OooOOOO;
    if (localSubMenuBuilder != null) {
      localSubMenuBuilder.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.OooO0o = paramCharSequence;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public SupportMenuItem setTooltipText(CharSequence paramCharSequence)
  {
    this.OooOOoo = paramCharSequence;
    this.OooOOO.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    paramBoolean = OooOOO0(paramBoolean);
    if (paramBoolean)
    {
      MenuBuilder localMenuBuilder = this.OooOOO;
      localMenuBuilder.onItemVisibleChanged(this);
    }
    return this;
  }
  
  public String toString()
  {
    Object localObject = this.OooO0o0;
    if (localObject != null) {
      localObject = ((CharSequence)localObject).toString();
    } else {
      localObject = null;
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemImpl
 * JD-Core Version:    0.7.0.1
 */