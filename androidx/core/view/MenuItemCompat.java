package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import androidx.core.internal.view.SupportMenuItem;

public final class MenuItemCompat
{
  public static MenuItem OooO00o(MenuItem paramMenuItem, ActionProvider paramActionProvider)
  {
    boolean bool = paramMenuItem instanceof SupportMenuItem;
    if (bool) {
      paramMenuItem = ((SupportMenuItem)paramMenuItem).OooO00o(paramActionProvider);
    }
    return paramMenuItem;
  }
  
  public static void OooO0O0(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    boolean bool = paramMenuItem instanceof SupportMenuItem;
    if (bool)
    {
      paramMenuItem = (SupportMenuItem)paramMenuItem;
      paramMenuItem.setAlphabeticShortcut(paramChar, paramInt);
    }
    else
    {
      MenuItemCompat.Api26Impl.OooO0oO(paramMenuItem, paramChar, paramInt);
    }
  }
  
  public static void OooO0OO(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    boolean bool = paramMenuItem instanceof SupportMenuItem;
    if (bool)
    {
      paramMenuItem = (SupportMenuItem)paramMenuItem;
      paramMenuItem.setContentDescription(paramCharSequence);
    }
    else
    {
      MenuItemCompat.Api26Impl.OooO0oo(paramMenuItem, paramCharSequence);
    }
  }
  
  public static void OooO0Oo(MenuItem paramMenuItem, ColorStateList paramColorStateList)
  {
    boolean bool = paramMenuItem instanceof SupportMenuItem;
    if (bool)
    {
      paramMenuItem = (SupportMenuItem)paramMenuItem;
      paramMenuItem.setIconTintList(paramColorStateList);
    }
    else
    {
      MenuItemCompat.Api26Impl.OooO(paramMenuItem, paramColorStateList);
    }
  }
  
  public static void OooO0o(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    boolean bool = paramMenuItem instanceof SupportMenuItem;
    if (bool)
    {
      paramMenuItem = (SupportMenuItem)paramMenuItem;
      paramMenuItem.setNumericShortcut(paramChar, paramInt);
    }
    else
    {
      MenuItemCompat.Api26Impl.OooOO0O(paramMenuItem, paramChar, paramInt);
    }
  }
  
  public static void OooO0o0(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
  {
    boolean bool = paramMenuItem instanceof SupportMenuItem;
    if (bool)
    {
      paramMenuItem = (SupportMenuItem)paramMenuItem;
      paramMenuItem.setIconTintMode(paramMode);
    }
    else
    {
      MenuItemCompat.Api26Impl.OooOO0(paramMenuItem, paramMode);
    }
  }
  
  public static void OooO0oO(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    boolean bool = paramMenuItem instanceof SupportMenuItem;
    if (bool)
    {
      paramMenuItem = (SupportMenuItem)paramMenuItem;
      paramMenuItem.setTooltipText(paramCharSequence);
    }
    else
    {
      MenuItemCompat.Api26Impl.OooOOO0(paramMenuItem, paramCharSequence);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.MenuItemCompat
 * JD-Core Version:    0.7.0.1
 */