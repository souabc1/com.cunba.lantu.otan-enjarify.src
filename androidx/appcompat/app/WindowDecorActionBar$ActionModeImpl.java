package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class WindowDecorActionBar$ActionModeImpl
  extends ActionMode
  implements MenuBuilder.Callback
{
  public final Context o00Ooo0;
  public final MenuBuilder o00Ooo0O;
  public ActionMode.Callback o00Ooo0o;
  public WeakReference o00OooO0;
  
  public WindowDecorActionBar$ActionModeImpl(WindowDecorActionBar paramWindowDecorActionBar, Context paramContext, ActionMode.Callback paramCallback)
  {
    this.o00Ooo0 = paramContext;
    this.o00Ooo0o = paramCallback;
    paramWindowDecorActionBar = new androidx/appcompat/view/menu/MenuBuilder;
    paramWindowDecorActionBar.<init>(paramContext);
    paramWindowDecorActionBar = paramWindowDecorActionBar.setDefaultShowAsAction(1);
    this.o00Ooo0O = paramWindowDecorActionBar;
    paramWindowDecorActionBar.setCallback(this);
  }
  
  public void OooO00o()
  {
    Object localObject1 = this.o00OooO;
    Object localObject2 = ((WindowDecorActionBar)localObject1).OooOOO;
    if (localObject2 != this) {
      return;
    }
    boolean bool1 = ((WindowDecorActionBar)localObject1).OooOo0O;
    boolean bool2 = ((WindowDecorActionBar)localObject1).OooOo0o;
    ActionBarOverlayLayout localActionBarOverlayLayout = null;
    bool2 = WindowDecorActionBar.OooOOo(bool1, bool2, false);
    if (!bool2)
    {
      localObject1 = this.o00OooO;
      ((WindowDecorActionBar)localObject1).OooOOOO = this;
      localObject2 = this.o00Ooo0o;
      ((WindowDecorActionBar)localObject1).OooOOOo = ((ActionMode.Callback)localObject2);
    }
    else
    {
      localObject1 = this.o00Ooo0o;
      ((ActionMode.Callback)localObject1).OooO00o(this);
    }
    this.o00Ooo0o = null;
    this.o00OooO.OooOOo0(false);
    this.o00OooO.OooO0oO.OooO0oo();
    localObject2 = this.o00OooO;
    localActionBarOverlayLayout = ((WindowDecorActionBar)localObject2).OooO0Oo;
    bool1 = ((WindowDecorActionBar)localObject2).OooOoo0;
    localActionBarOverlayLayout.setHideOnContentScrollEnabled(bool1);
    this.o00OooO.OooOOO = null;
  }
  
  public void OooO0O0()
  {
    Object localObject1 = this.o00OooO.OooOOO;
    if (localObject1 != this) {
      return;
    }
    localObject1 = this.o00Ooo0O;
    ((MenuBuilder)localObject1).stopDispatchingItemsChanged();
    try
    {
      localObject1 = this.o00Ooo0o;
      MenuBuilder localMenuBuilder = this.o00Ooo0O;
      ((ActionMode.Callback)localObject1).OooO0OO(this, localMenuBuilder);
      return;
    }
    finally
    {
      this.o00Ooo0O.startDispatchingItemsChanged();
    }
  }
  
  public boolean OooO0OO()
  {
    Object localObject1 = this.o00Ooo0O;
    ((MenuBuilder)localObject1).stopDispatchingItemsChanged();
    try
    {
      localObject1 = this.o00Ooo0o;
      MenuBuilder localMenuBuilder = this.o00Ooo0O;
      boolean bool = ((ActionMode.Callback)localObject1).OooO0O0(this, localMenuBuilder);
      return bool;
    }
    finally
    {
      this.o00Ooo0O.startDispatchingItemsChanged();
    }
  }
  
  public View getCustomView()
  {
    Object localObject = this.o00OooO0;
    if (localObject != null) {
      localObject = (View)((Reference)localObject).get();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public Menu getMenu()
  {
    return this.o00Ooo0O;
  }
  
  public MenuInflater getMenuInflater()
  {
    SupportMenuInflater localSupportMenuInflater = new androidx/appcompat/view/SupportMenuInflater;
    Context localContext = this.o00Ooo0;
    localSupportMenuInflater.<init>(localContext);
    return localSupportMenuInflater;
  }
  
  public CharSequence getSubtitle()
  {
    return this.o00OooO.OooO0oO.getSubtitle();
  }
  
  public CharSequence getTitle()
  {
    return this.o00OooO.OooO0oO.getTitle();
  }
  
  public boolean isTitleOptional()
  {
    return this.o00OooO.OooO0oO.isTitleOptional();
  }
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    paramMenuBuilder = this.o00Ooo0o;
    if (paramMenuBuilder != null) {
      return paramMenuBuilder.OooO0Oo(this, paramMenuItem);
    }
    return false;
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    paramMenuBuilder = this.o00Ooo0o;
    if (paramMenuBuilder == null) {
      return;
    }
    OooO0O0();
    this.o00OooO.OooO0oO.OooO0oO();
  }
  
  public void setCustomView(View paramView)
  {
    this.o00OooO.OooO0oO.setCustomView(paramView);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    this.o00OooO0 = localWeakReference;
  }
  
  public void setSubtitle(int paramInt)
  {
    String str = this.o00OooO.OooO00o.getResources().getString(paramInt);
    setSubtitle(str);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.o00OooO.OooO0oO.setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    String str = this.o00OooO.OooO00o.getResources().getString(paramInt);
    setTitle(str);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.o00OooO.OooO0oO.setTitle(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    super.setTitleOptionalHint(paramBoolean);
    this.o00OooO.OooO0oO.setTitleOptional(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl
 * JD-Core Version:    0.7.0.1
 */