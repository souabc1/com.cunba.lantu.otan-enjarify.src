package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;

public class ActionMenuItem
  implements SupportMenuItem
{
  public char OooO;
  public final int OooO00o;
  public final int OooO0O0;
  public final int OooO0OO;
  public CharSequence OooO0Oo;
  public Intent OooO0o;
  public CharSequence OooO0o0;
  public char OooO0oO;
  public int OooO0oo;
  public int OooOO0;
  public Drawable OooOO0O;
  public Context OooOO0o;
  public CharSequence OooOOO;
  public MenuItem.OnMenuItemClickListener OooOOO0;
  public CharSequence OooOOOO;
  public ColorStateList OooOOOo;
  public boolean OooOOo;
  public PorterDuff.Mode OooOOo0;
  public boolean OooOOoo;
  public int OooOo00;
  
  public ActionMenuItem(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence)
  {
    paramInt3 = 4096;
    this.OooO0oo = paramInt3;
    this.OooOO0 = paramInt3;
    this.OooOOOo = null;
    this.OooOOo0 = null;
    this.OooOOo = false;
    this.OooOOoo = false;
    this.OooOo00 = 16;
    this.OooOO0o = paramContext;
    this.OooO00o = paramInt2;
    this.OooO0O0 = paramInt1;
    this.OooO0OO = paramInt4;
    this.OooO0Oo = paramCharSequence;
  }
  
  public SupportMenuItem OooO00o(androidx.core.view.ActionProvider paramActionProvider)
  {
    paramActionProvider = new java/lang/UnsupportedOperationException;
    paramActionProvider.<init>();
    throw paramActionProvider;
  }
  
  public final void OooO0O0()
  {
    Drawable localDrawable = this.OooOO0O;
    if (localDrawable != null)
    {
      boolean bool1 = this.OooOOo;
      if (!bool1)
      {
        bool1 = this.OooOOoo;
        if (!bool1) {}
      }
      else
      {
        localDrawable = DrawableCompat.OooOOo(localDrawable);
        this.OooOO0O = localDrawable;
        localDrawable = localDrawable.mutate();
        this.OooOO0O = localDrawable;
        bool1 = this.OooOOo;
        Object localObject;
        if (bool1)
        {
          localObject = this.OooOOOo;
          DrawableCompat.OooOOOO(localDrawable, (ColorStateList)localObject);
        }
        boolean bool2 = this.OooOOoo;
        if (bool2)
        {
          localDrawable = this.OooOO0O;
          localObject = this.OooOOo0;
          DrawableCompat.OooOOOo(localDrawable, (PorterDuff.Mode)localObject);
        }
      }
    }
  }
  
  public SupportMenuItem OooO0OO(int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public SupportMenuItem OooO0Oo(View paramView)
  {
    paramView = new java/lang/UnsupportedOperationException;
    paramView.<init>();
    throw paramView;
  }
  
  public SupportMenuItem OooO0o0(int paramInt)
  {
    setShowAsAction(paramInt);
    return this;
  }
  
  public boolean collapseActionView()
  {
    return false;
  }
  
  public boolean expandActionView()
  {
    return false;
  }
  
  public android.view.ActionProvider getActionProvider()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public View getActionView()
  {
    return null;
  }
  
  public int getAlphabeticModifiers()
  {
    return this.OooOO0;
  }
  
  public char getAlphabeticShortcut()
  {
    return this.OooO;
  }
  
  public CharSequence getContentDescription()
  {
    return this.OooOOO;
  }
  
  public int getGroupId()
  {
    return this.OooO0O0;
  }
  
  public Drawable getIcon()
  {
    return this.OooOO0O;
  }
  
  public ColorStateList getIconTintList()
  {
    return this.OooOOOo;
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return this.OooOOo0;
  }
  
  public Intent getIntent()
  {
    return this.OooO0o;
  }
  
  public int getItemId()
  {
    return this.OooO00o;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }
  
  public int getNumericModifiers()
  {
    return this.OooO0oo;
  }
  
  public char getNumericShortcut()
  {
    return this.OooO0oO;
  }
  
  public int getOrder()
  {
    return this.OooO0OO;
  }
  
  public SubMenu getSubMenu()
  {
    return null;
  }
  
  public androidx.core.view.ActionProvider getSupportActionProvider()
  {
    return null;
  }
  
  public CharSequence getTitle()
  {
    return this.OooO0Oo;
  }
  
  public CharSequence getTitleCondensed()
  {
    CharSequence localCharSequence = this.OooO0o0;
    if (localCharSequence == null) {
      localCharSequence = this.OooO0Oo;
    }
    return localCharSequence;
  }
  
  public CharSequence getTooltipText()
  {
    return this.OooOOOO;
  }
  
  public boolean hasSubMenu()
  {
    return false;
  }
  
  public boolean isActionViewExpanded()
  {
    return false;
  }
  
  public boolean isCheckable()
  {
    int i = this.OooOo00;
    int j = 1;
    i &= j;
    if (i == 0) {
      j = 0;
    }
    return j;
  }
  
  public boolean isChecked()
  {
    int i = this.OooOo00 & 0x2;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isEnabled()
  {
    int i = this.OooOo00 & 0x10;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isVisible()
  {
    int i = this.OooOo00 & 0x8;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public MenuItem setActionProvider(android.view.ActionProvider paramActionProvider)
  {
    paramActionProvider = new java/lang/UnsupportedOperationException;
    paramActionProvider.<init>();
    throw paramActionProvider;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    paramChar = Character.toLowerCase(paramChar);
    this.OooO = paramChar;
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    paramChar = Character.toLowerCase(paramChar);
    this.OooO = paramChar;
    paramChar = KeyEvent.normalizeMetaState(paramInt);
    this.OooOO0 = paramChar;
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    boolean bool = this.OooOo00 & 0xFFFFFFFE;
    paramBoolean |= bool;
    this.OooOo00 = paramBoolean;
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    boolean bool = this.OooOo00 & 0xFFFFFFFD;
    if (paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    paramBoolean |= bool;
    this.OooOo00 = paramBoolean;
    return this;
  }
  
  public SupportMenuItem setContentDescription(CharSequence paramCharSequence)
  {
    this.OooOOO = paramCharSequence;
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    boolean bool = this.OooOo00 & 0xFFFFFFEF;
    if (paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    paramBoolean |= bool;
    this.OooOo00 = paramBoolean;
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    Drawable localDrawable = ContextCompat.OooO0o0(this.OooOO0o, paramInt);
    this.OooOO0O = localDrawable;
    OooO0O0();
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    this.OooOO0O = paramDrawable;
    OooO0O0();
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    this.OooOOOo = paramColorStateList;
    this.OooOOo = true;
    OooO0O0();
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    this.OooOOo0 = paramMode;
    this.OooOOoo = true;
    OooO0O0();
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    this.OooO0o = paramIntent;
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    this.OooO0oO = paramChar;
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    this.OooO0oO = paramChar;
    paramChar = KeyEvent.normalizeMetaState(paramInt);
    this.OooO0oo = paramChar;
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    paramOnActionExpandListener = new java/lang/UnsupportedOperationException;
    paramOnActionExpandListener.<init>();
    throw paramOnActionExpandListener;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.OooOOO0 = paramOnMenuItemClickListener;
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.OooO0oO = paramChar1;
    paramChar1 = Character.toLowerCase(paramChar2);
    this.OooO = paramChar1;
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    this.OooO0oO = paramChar1;
    paramChar1 = KeyEvent.normalizeMetaState(paramInt1);
    this.OooO0oo = paramChar1;
    paramChar1 = Character.toLowerCase(paramChar2);
    this.OooO = paramChar1;
    paramChar1 = KeyEvent.normalizeMetaState(paramInt2);
    this.OooOO0 = paramChar1;
    return this;
  }
  
  public void setShowAsAction(int paramInt) {}
  
  public MenuItem setTitle(int paramInt)
  {
    String str = this.OooOO0o.getResources().getString(paramInt);
    this.OooO0Oo = str;
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.OooO0Oo = paramCharSequence;
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.OooO0o0 = paramCharSequence;
    return this;
  }
  
  public SupportMenuItem setTooltipText(CharSequence paramCharSequence)
  {
    this.OooOOOO = paramCharSequence;
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    int i = this.OooOo00;
    int j = 8;
    i &= j;
    if (paramBoolean) {
      j = 0;
    }
    paramBoolean = i | j;
    this.OooOo00 = paramBoolean;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.ActionMenuItem
 * JD-Core Version:    0.7.0.1
 */