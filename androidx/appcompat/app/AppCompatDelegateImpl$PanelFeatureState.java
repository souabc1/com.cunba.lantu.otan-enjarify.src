package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.style;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;

public final class AppCompatDelegateImpl$PanelFeatureState
{
  public View OooO;
  public int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public ViewGroup OooO0oO;
  public View OooO0oo;
  public MenuBuilder OooOO0;
  public ListMenuPresenter OooOO0O;
  public Context OooOO0o;
  public boolean OooOOO;
  public boolean OooOOO0;
  public boolean OooOOOO;
  public boolean OooOOOo;
  public boolean OooOOo;
  public boolean OooOOo0;
  public Bundle OooOOoo;
  
  public AppCompatDelegateImpl$PanelFeatureState(int paramInt)
  {
    this.OooO00o = paramInt;
    this.OooOOo0 = false;
  }
  
  public MenuView OooO00o(MenuPresenter.Callback paramCallback)
  {
    Object localObject = this.OooOO0;
    if (localObject == null) {
      return null;
    }
    localObject = this.OooOO0O;
    if (localObject == null)
    {
      localObject = new androidx/appcompat/view/menu/ListMenuPresenter;
      Context localContext = this.OooOO0o;
      int i = R.layout.abc_list_menu_item_layout;
      ((ListMenuPresenter)localObject).<init>(localContext, i);
      this.OooOO0O = ((ListMenuPresenter)localObject);
      ((ListMenuPresenter)localObject).setCallback(paramCallback);
      paramCallback = this.OooOO0;
      localObject = this.OooOO0O;
      paramCallback.addMenuPresenter((MenuPresenter)localObject);
    }
    paramCallback = this.OooOO0O;
    localObject = this.OooO0oO;
    return paramCallback.OooO00o((ViewGroup)localObject);
  }
  
  public boolean OooO0O0()
  {
    Object localObject = this.OooO0oo;
    boolean bool1 = false;
    if (localObject == null) {
      return false;
    }
    localObject = this.OooO;
    boolean bool2 = true;
    if (localObject != null) {
      return bool2;
    }
    localObject = this.OooOO0O.getAdapter();
    int i = ((Adapter)localObject).getCount();
    if (i > 0) {
      bool1 = bool2;
    }
    return bool1;
  }
  
  public void setMenu(MenuBuilder paramMenuBuilder)
  {
    Object localObject = this.OooOO0;
    if (paramMenuBuilder == localObject) {
      return;
    }
    if (localObject != null)
    {
      ListMenuPresenter localListMenuPresenter = this.OooOO0O;
      ((MenuBuilder)localObject).removeMenuPresenter(localListMenuPresenter);
    }
    this.OooOO0 = paramMenuBuilder;
    if (paramMenuBuilder != null)
    {
      localObject = this.OooOO0O;
      if (localObject != null) {
        paramMenuBuilder.addMenuPresenter((MenuPresenter)localObject);
      }
    }
  }
  
  public void setStyle(Context paramContext)
  {
    Object localObject = new android/util/TypedValue;
    ((TypedValue)localObject).<init>();
    Resources.Theme localTheme1 = paramContext.getResources().newTheme();
    Resources.Theme localTheme2 = paramContext.getTheme();
    localTheme1.setTo(localTheme2);
    int i = R.attr.actionBarPopupTheme;
    boolean bool = true;
    localTheme1.resolveAttribute(i, (TypedValue)localObject, bool);
    i = ((TypedValue)localObject).resourceId;
    if (i != 0) {
      localTheme1.applyStyle(i, bool);
    }
    i = R.attr.panelMenuListTheme;
    localTheme1.resolveAttribute(i, (TypedValue)localObject, bool);
    int j = ((TypedValue)localObject).resourceId;
    if (j == 0) {
      j = R.style.Theme_AppCompat_CompactMenu;
    }
    localTheme1.applyStyle(j, bool);
    localObject = new androidx/appcompat/view/ContextThemeWrapper;
    ((ContextThemeWrapper)localObject).<init>(paramContext, 0);
    ((Context)localObject).getTheme().setTo(localTheme1);
    this.OooOO0o = ((Context)localObject);
    paramContext = R.styleable.AppCompatTheme;
    paramContext = ((Context)localObject).obtainStyledAttributes(paramContext);
    j = R.styleable.AppCompatTheme_panelBackground;
    j = paramContext.getResourceId(j, 0);
    this.OooO0O0 = j;
    j = R.styleable.AppCompatTheme_android_windowAnimationStyle;
    j = paramContext.getResourceId(j, 0);
    this.OooO0o = j;
    paramContext.recycle();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState
 * JD-Core Version:    0.7.0.1
 */