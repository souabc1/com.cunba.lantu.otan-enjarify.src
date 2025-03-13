package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.OnMenuItemClickListener;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

class ToolbarActionBar
  extends ActionBar
{
  public final Toolbar.OnMenuItemClickListener OooO;
  public final DecorToolbar OooO00o;
  public final Window.Callback OooO0O0;
  public final AppCompatDelegateImpl.ActionBarMenuCallback OooO0OO;
  public boolean OooO0Oo;
  public boolean OooO0o;
  public boolean OooO0o0;
  public ArrayList OooO0oO;
  public final Runnable OooO0oo;
  
  public ToolbarActionBar(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0oO = ((ArrayList)localObject);
    localObject = new androidx/appcompat/app/ToolbarActionBar$1;
    ((ToolbarActionBar.1)localObject).<init>(this);
    this.OooO0oo = ((Runnable)localObject);
    localObject = new androidx/appcompat/app/ToolbarActionBar$2;
    ((ToolbarActionBar.2)localObject).<init>(this);
    this.OooO = ((Toolbar.OnMenuItemClickListener)localObject);
    Preconditions.OooO0oo(paramToolbar);
    ToolbarWidgetWrapper localToolbarWidgetWrapper = new androidx/appcompat/widget/ToolbarWidgetWrapper;
    localToolbarWidgetWrapper.<init>(paramToolbar, false);
    this.OooO00o = localToolbarWidgetWrapper;
    Window.Callback localCallback = (Window.Callback)Preconditions.OooO0oo(paramCallback);
    this.OooO0O0 = localCallback;
    localToolbarWidgetWrapper.setWindowCallback(paramCallback);
    paramToolbar.setOnMenuItemClickListener((Toolbar.OnMenuItemClickListener)localObject);
    localToolbarWidgetWrapper.setWindowTitle(paramCharSequence);
    paramToolbar = new androidx/appcompat/app/ToolbarActionBar$ToolbarMenuCallback;
    paramToolbar.<init>(this);
    this.OooO0OO = paramToolbar;
  }
  
  private Menu getMenu()
  {
    boolean bool = this.OooO0o0;
    if (!bool)
    {
      DecorToolbar localDecorToolbar = this.OooO00o;
      ToolbarActionBar.ActionMenuPresenterCallback localActionMenuPresenterCallback = new androidx/appcompat/app/ToolbarActionBar$ActionMenuPresenterCallback;
      localActionMenuPresenterCallback.<init>(this);
      ToolbarActionBar.MenuBuilderCallback localMenuBuilderCallback = new androidx/appcompat/app/ToolbarActionBar$MenuBuilderCallback;
      localMenuBuilderCallback.<init>(this);
      localDecorToolbar.OooO(localActionMenuPresenterCallback, localMenuBuilderCallback);
      bool = true;
      this.OooO0o0 = bool;
    }
    return this.OooO00o.getMenu();
  }
  
  public void OooO(boolean paramBoolean)
  {
    boolean bool = this.OooO0o;
    if (paramBoolean == bool) {
      return;
    }
    this.OooO0o = paramBoolean;
    ArrayList localArrayList = this.OooO0oO;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      ActionBar.OnMenuVisibilityListener localOnMenuVisibilityListener = (ActionBar.OnMenuVisibilityListener)this.OooO0oO.get(j);
      localOnMenuVisibilityListener.OooO00o(paramBoolean);
      j += 1;
    }
  }
  
  public boolean OooO0oO()
  {
    return this.OooO00o.OooO0Oo();
  }
  
  public boolean OooO0oo()
  {
    DecorToolbar localDecorToolbar = this.OooO00o;
    boolean bool = localDecorToolbar.OooO0oO();
    if (bool)
    {
      this.OooO00o.collapseActionView();
      return true;
    }
    return false;
  }
  
  public boolean OooOO0()
  {
    ViewGroup localViewGroup = this.OooO00o.getViewGroup();
    Runnable localRunnable = this.OooO0oo;
    localViewGroup.removeCallbacks(localRunnable);
    localViewGroup = this.OooO00o.getViewGroup();
    localRunnable = this.OooO0oo;
    ViewCompat.o0OoOo0(localViewGroup, localRunnable);
    return true;
  }
  
  public void OooOO0O(Configuration paramConfiguration)
  {
    super.OooOO0O(paramConfiguration);
  }
  
  public void OooOO0o()
  {
    ViewGroup localViewGroup = this.OooO00o.getViewGroup();
    Runnable localRunnable = this.OooO0oo;
    localViewGroup.removeCallbacks(localRunnable);
  }
  
  public boolean OooOOO(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getAction();
    int j = 1;
    if (i == j) {
      OooOOOO();
    }
    return j;
  }
  
  public boolean OooOOO0(int paramInt, KeyEvent paramKeyEvent)
  {
    Menu localMenu = getMenu();
    if (localMenu != null)
    {
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      }
      KeyCharacterMap localKeyCharacterMap = KeyCharacterMap.load(i);
      int i = localKeyCharacterMap.getKeyboardType();
      int j = 1;
      if (i == j) {
        j = 0;
      }
      localMenu.setQwertyMode(j);
      return localMenu.performShortcut(paramInt, paramKeyEvent, 0);
    }
    return false;
  }
  
  public boolean OooOOOO()
  {
    return this.OooO00o.OooO0o0();
  }
  
  public void OooOOo(View paramView, ActionBar.LayoutParams paramLayoutParams)
  {
    if (paramView != null) {
      paramView.setLayoutParams(paramLayoutParams);
    }
    this.OooO00o.setCustomView(paramView);
  }
  
  public void OooOOo0()
  {
    Menu localMenu = getMenu();
    boolean bool1 = localMenu instanceof MenuBuilder;
    boolean bool2 = false;
    Object localObject2;
    if (bool1)
    {
      localObject2 = localMenu;
      localObject2 = (MenuBuilder)localMenu;
    }
    else
    {
      bool1 = false;
      localObject2 = null;
    }
    if (localObject2 != null) {
      ((MenuBuilder)localObject2).stopDispatchingItemsChanged();
    }
    try
    {
      localMenu.clear();
      Window.Callback localCallback = this.OooO0O0;
      boolean bool3 = localCallback.onCreatePanelMenu(0, localMenu);
      if (bool3)
      {
        localCallback = this.OooO0O0;
        bool2 = localCallback.onPreparePanel(0, null, localMenu);
        if (bool2) {}
      }
      else
      {
        localMenu.clear();
      }
      return;
    }
    finally
    {
      if (localObject2 != null) {
        ((MenuBuilder)localObject2).startDispatchingItemsChanged();
      }
    }
  }
  
  public View getCustomView()
  {
    return this.OooO00o.getCustomView();
  }
  
  public int getDisplayOptions()
  {
    return this.OooO00o.getDisplayOptions();
  }
  
  public float getElevation()
  {
    return ViewCompat.OooOo0O(this.OooO00o.getViewGroup());
  }
  
  public int getHeight()
  {
    return this.OooO00o.getHeight();
  }
  
  public int getNavigationItemCount()
  {
    return 0;
  }
  
  public int getNavigationMode()
  {
    return 0;
  }
  
  public int getSelectedNavigationIndex()
  {
    return -1;
  }
  
  public ActionBar.Tab getSelectedTab()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public CharSequence getSubtitle()
  {
    return this.OooO00o.getSubtitle();
  }
  
  public ActionBar.Tab getTabAt(int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public int getTabCount()
  {
    return 0;
  }
  
  public Context getThemedContext()
  {
    return this.OooO00o.getContext();
  }
  
  public CharSequence getTitle()
  {
    return this.OooO00o.getTitle();
  }
  
  public boolean isShowing()
  {
    DecorToolbar localDecorToolbar = this.OooO00o;
    int i = localDecorToolbar.getVisibility();
    if (i == 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localDecorToolbar = null;
    }
    return i;
  }
  
  public boolean isTitleTruncated()
  {
    return super.isTitleTruncated();
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.OooO00o.setBackgroundDrawable(paramDrawable);
  }
  
  public void setCustomView(int paramInt)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.OooO00o.getContext());
    ViewGroup localViewGroup = this.OooO00o.getViewGroup();
    View localView = localLayoutInflater.inflate(paramInt, localViewGroup, false);
    setCustomView(localView);
  }
  
  public void setCustomView(View paramView)
  {
    ActionBar.LayoutParams localLayoutParams = new androidx/appcompat/app/ActionBar$LayoutParams;
    int i = -2;
    localLayoutParams.<init>(i, i);
    OooOOo(paramView, localLayoutParams);
  }
  
  public void setDefaultDisplayHomeAsUpEnabled(boolean paramBoolean) {}
  
  public void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    setDisplayOptions(paramBoolean, bool);
  }
  
  public void setDisplayOptions(int paramInt)
  {
    setDisplayOptions(paramInt, -1);
  }
  
  public void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = this.OooO00o.getDisplayOptions();
    DecorToolbar localDecorToolbar = this.OooO00o;
    paramInt1 &= paramInt2;
    paramInt2 = (paramInt2 ^ 0xFFFFFFFF) & i;
    paramInt1 |= paramInt2;
    localDecorToolbar.setDisplayOptions(paramInt1);
  }
  
  public void setDisplayShowCustomEnabled(boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    setDisplayOptions(paramBoolean, bool);
  }
  
  public void setDisplayShowHomeEnabled(boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    setDisplayOptions(paramBoolean, bool);
  }
  
  public void setDisplayShowTitleEnabled(boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    setDisplayOptions(paramBoolean, bool);
  }
  
  public void setDisplayUseLogoEnabled(boolean paramBoolean)
  {
    setDisplayOptions(paramBoolean, 1);
  }
  
  public void setElevation(float paramFloat)
  {
    ViewCompat.oo0o0Oo(this.OooO00o.getViewGroup(), paramFloat);
  }
  
  public void setHomeActionContentDescription(int paramInt)
  {
    this.OooO00o.setNavigationContentDescription(paramInt);
  }
  
  public void setHomeActionContentDescription(CharSequence paramCharSequence)
  {
    this.OooO00o.setNavigationContentDescription(paramCharSequence);
  }
  
  public void setHomeAsUpIndicator(int paramInt)
  {
    this.OooO00o.setNavigationIcon(paramInt);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    this.OooO00o.setNavigationIcon(paramDrawable);
  }
  
  public void setHomeButtonEnabled(boolean paramBoolean) {}
  
  public void setIcon(int paramInt)
  {
    this.OooO00o.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.OooO00o.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt)
  {
    this.OooO00o.setLogo(paramInt);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    this.OooO00o.setLogo(paramDrawable);
  }
  
  public void setNavigationMode(int paramInt)
  {
    int i = 2;
    if (paramInt != i)
    {
      this.OooO00o.setNavigationMode(paramInt);
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Tabs not supported in this configuration");
    throw localIllegalArgumentException;
  }
  
  public void setSelectedNavigationItem(int paramInt)
  {
    DecorToolbar localDecorToolbar = this.OooO00o;
    int i = localDecorToolbar.getNavigationMode();
    int j = 1;
    if (i == j)
    {
      this.OooO00o.setDropdownSelectedPosition(paramInt);
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("setSelectedNavigationIndex not valid for current navigation mode");
    throw localIllegalStateException;
  }
  
  public void setShowHideAnimationEnabled(boolean paramBoolean) {}
  
  public void setSplitBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setStackedBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setSubtitle(int paramInt)
  {
    DecorToolbar localDecorToolbar = this.OooO00o;
    CharSequence localCharSequence;
    if (paramInt != 0)
    {
      Context localContext = localDecorToolbar.getContext();
      localCharSequence = localContext.getText(paramInt);
    }
    else
    {
      paramInt = 0;
      localCharSequence = null;
    }
    localDecorToolbar.setSubtitle(localCharSequence);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.OooO00o.setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    DecorToolbar localDecorToolbar = this.OooO00o;
    CharSequence localCharSequence;
    if (paramInt != 0)
    {
      Context localContext = localDecorToolbar.getContext();
      localCharSequence = localContext.getText(paramInt);
    }
    else
    {
      paramInt = 0;
      localCharSequence = null;
    }
    localDecorToolbar.setTitle(localCharSequence);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.OooO00o.setTitle(paramCharSequence);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    this.OooO00o.setWindowTitle(paramCharSequence);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.ToolbarActionBar
 * JD-Core Version:    0.7.0.1
 */