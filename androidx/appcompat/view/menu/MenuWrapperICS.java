package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenu;

public class MenuWrapperICS
  extends BaseMenuWrapper
  implements Menu
{
  public final SupportMenu OooO0Oo;
  
  public MenuWrapperICS(Context paramContext, SupportMenu paramSupportMenu)
  {
    super(paramContext);
    if (paramSupportMenu != null)
    {
      this.OooO0Oo = paramSupportMenu;
      return;
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramContext.<init>("Wrapped Object can not be null.");
    throw paramContext;
  }
  
  public MenuItem add(int paramInt)
  {
    MenuItem localMenuItem = this.OooO0Oo.add(paramInt);
    return OooO0O0(localMenuItem);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    MenuItem localMenuItem = this.OooO0Oo.add(paramInt1, paramInt2, paramInt3, paramInt4);
    return OooO0O0(localMenuItem);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    MenuItem localMenuItem = this.OooO0Oo.add(paramInt1, paramInt2, paramInt3, paramCharSequence);
    return OooO0O0(localMenuItem);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    paramCharSequence = this.OooO0Oo.add(paramCharSequence);
    return OooO0O0(paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    MenuWrapperICS localMenuWrapperICS = this;
    MenuItem[] arrayOfMenuItem1 = paramArrayOfMenuItem;
    int i;
    MenuItem[] arrayOfMenuItem2;
    if (paramArrayOfMenuItem != null)
    {
      i = paramArrayOfMenuItem.length;
      arrayOfMenuItem2 = new MenuItem[i];
    }
    else
    {
      i = 0;
      arrayOfMenuItem2 = null;
    }
    SupportMenu localSupportMenu = localMenuWrapperICS.OooO0Oo;
    int j = paramInt1;
    int k = paramInt2;
    int m = localSupportMenu.addIntentOptions(paramInt1, paramInt2, paramInt3, paramComponentName, paramArrayOfIntent, paramIntent, paramInt4, arrayOfMenuItem2);
    if (arrayOfMenuItem2 != null)
    {
      j = arrayOfMenuItem2.length;
      k = 0;
      while (k < j)
      {
        MenuItem localMenuItem = arrayOfMenuItem2[k];
        localMenuItem = OooO0O0(localMenuItem);
        arrayOfMenuItem1[k] = localMenuItem;
        k += 1;
      }
    }
    return m;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    SubMenu localSubMenu = this.OooO0Oo.addSubMenu(paramInt);
    return OooO0OO(localSubMenu);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    SubMenu localSubMenu = this.OooO0Oo.addSubMenu(paramInt1, paramInt2, paramInt3, paramInt4);
    return OooO0OO(localSubMenu);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    SubMenu localSubMenu = this.OooO0Oo.addSubMenu(paramInt1, paramInt2, paramInt3, paramCharSequence);
    return OooO0OO(localSubMenu);
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    paramCharSequence = this.OooO0Oo.addSubMenu(paramCharSequence);
    return OooO0OO(paramCharSequence);
  }
  
  public void clear()
  {
    OooO0Oo();
    this.OooO0Oo.clear();
  }
  
  public void close()
  {
    this.OooO0Oo.close();
  }
  
  public MenuItem findItem(int paramInt)
  {
    MenuItem localMenuItem = this.OooO0Oo.findItem(paramInt);
    return OooO0O0(localMenuItem);
  }
  
  public MenuItem getItem(int paramInt)
  {
    MenuItem localMenuItem = this.OooO0Oo.getItem(paramInt);
    return OooO0O0(localMenuItem);
  }
  
  public boolean hasVisibleItems()
  {
    return this.OooO0Oo.hasVisibleItems();
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return this.OooO0Oo.isShortcutKey(paramInt, paramKeyEvent);
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return this.OooO0Oo.performIdentifierAction(paramInt1, paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    return this.OooO0Oo.performShortcut(paramInt1, paramKeyEvent, paramInt2);
  }
  
  public void removeGroup(int paramInt)
  {
    OooO0o0(paramInt);
    this.OooO0Oo.removeGroup(paramInt);
  }
  
  public void removeItem(int paramInt)
  {
    OooO0o(paramInt);
    this.OooO0Oo.removeItem(paramInt);
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.OooO0Oo.setGroupCheckable(paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    this.OooO0Oo.setGroupEnabled(paramInt, paramBoolean);
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    this.OooO0Oo.setGroupVisible(paramInt, paramBoolean);
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    this.OooO0Oo.setQwertyMode(paramBoolean);
  }
  
  public int size()
  {
    return this.OooO0Oo.size();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuWrapperICS
 * JD-Core Version:    0.7.0.1
 */