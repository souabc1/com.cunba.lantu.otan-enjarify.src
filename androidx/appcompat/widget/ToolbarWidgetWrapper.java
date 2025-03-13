package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;
import android.widget.AdapterView;
import android.widget.Spinner;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.styleable;
import androidx.appcompat.app.ActionBar.LayoutParams;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

public class ToolbarWidgetWrapper
  implements DecorToolbar
{
  public boolean OooO;
  public Toolbar OooO00o;
  public int OooO0O0;
  public View OooO0OO;
  public Spinner OooO0Oo;
  public Drawable OooO0o;
  public View OooO0o0;
  public Drawable OooO0oO;
  public Drawable OooO0oo;
  public CharSequence OooOO0;
  public CharSequence OooOO0O;
  public CharSequence OooOO0o;
  public boolean OooOOO;
  public Window.Callback OooOOO0;
  public ActionMenuPresenter OooOOOO;
  public int OooOOOo;
  public Drawable OooOOo;
  public int OooOOo0;
  
  public ToolbarWidgetWrapper(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, paramBoolean, i, j);
  }
  
  public ToolbarWidgetWrapper(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    Toolbar localToolbar = null;
    this.OooOOOo = 0;
    this.OooOOo0 = 0;
    this.OooO00o = paramToolbar;
    Object localObject1 = paramToolbar.getTitle();
    this.OooOO0 = ((CharSequence)localObject1);
    localObject1 = paramToolbar.getSubtitle();
    this.OooOO0O = ((CharSequence)localObject1);
    localObject1 = this.OooOO0;
    if (localObject1 != null)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    this.OooO = i;
    localObject1 = paramToolbar.getNavigationIcon();
    this.OooO0oo = ((Drawable)localObject1);
    paramToolbar = paramToolbar.getContext();
    localObject1 = R.styleable.ActionBar;
    int k = R.attr.actionBarStyle;
    paramToolbar = TintTypedArray.OooOOOO(paramToolbar, null, (int[])localObject1, k, 0);
    int i = R.styleable.ActionBar_homeAsUpIndicator;
    localObject1 = paramToolbar.getDrawable(i);
    this.OooOOo = ((Drawable)localObject1);
    if (paramBoolean)
    {
      paramBoolean = R.styleable.ActionBar_title;
      localObject2 = paramToolbar.getText(paramBoolean);
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool) {
        setTitle((CharSequence)localObject2);
      }
      paramBoolean = R.styleable.ActionBar_subtitle;
      localObject2 = paramToolbar.getText(paramBoolean);
      bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool) {
        setSubtitle((CharSequence)localObject2);
      }
      paramBoolean = R.styleable.ActionBar_logo;
      localObject2 = paramToolbar.getDrawable(paramBoolean);
      if (localObject2 != null) {
        setLogo((Drawable)localObject2);
      }
      paramBoolean = R.styleable.ActionBar_icon;
      localObject2 = paramToolbar.getDrawable(paramBoolean);
      if (localObject2 != null) {
        setIcon((Drawable)localObject2);
      }
      localObject2 = this.OooO0oo;
      if (localObject2 == null)
      {
        localObject2 = this.OooOOo;
        if (localObject2 != null) {
          setNavigationIcon((Drawable)localObject2);
        }
      }
      paramBoolean = R.styleable.ActionBar_displayOptions;
      paramBoolean = paramToolbar.OooO0oo(paramBoolean, 0);
      setDisplayOptions(paramBoolean);
      paramBoolean = R.styleable.ActionBar_customNavigationLayout;
      paramBoolean = paramToolbar.OooOO0O(paramBoolean, 0);
      Object localObject3;
      if (paramBoolean)
      {
        localObject1 = LayoutInflater.from(this.OooO00o.getContext());
        localObject3 = this.OooO00o;
        localObject2 = ((LayoutInflater)localObject1).inflate(paramBoolean, (ViewGroup)localObject3, false);
        setCustomView((View)localObject2);
        paramBoolean = this.OooO0O0 | 0x10;
        setDisplayOptions(paramBoolean);
      }
      paramBoolean = R.styleable.ActionBar_height;
      paramBoolean = paramToolbar.OooOO0(paramBoolean, 0);
      if (paramBoolean)
      {
        localObject1 = this.OooO00o.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject1).height = paramBoolean;
        localObject2 = this.OooO00o;
        ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
      paramBoolean = R.styleable.ActionBar_contentInsetStart;
      int j = -1;
      paramBoolean = paramToolbar.OooO0Oo(paramBoolean, j);
      k = R.styleable.ActionBar_contentInsetEnd;
      j = paramToolbar.OooO0Oo(k, j);
      if ((!paramBoolean) || (j >= 0))
      {
        localObject3 = this.OooO00o;
        paramBoolean = Math.max(paramBoolean, 0);
        j = Math.max(j, 0);
        ((Toolbar)localObject3).setContentInsetsRelative(paramBoolean, j);
      }
      paramBoolean = R.styleable.ActionBar_titleTextStyle;
      paramBoolean = paramToolbar.OooOO0O(paramBoolean, 0);
      if (paramBoolean)
      {
        localObject1 = this.OooO00o;
        localObject3 = ((View)localObject1).getContext();
        ((Toolbar)localObject1).setTitleTextAppearance((Context)localObject3, paramBoolean);
      }
      paramBoolean = R.styleable.ActionBar_subtitleTextStyle;
      paramBoolean = paramToolbar.OooOO0O(paramBoolean, 0);
      if (paramBoolean)
      {
        localObject1 = this.OooO00o;
        localObject3 = ((View)localObject1).getContext();
        ((Toolbar)localObject1).setSubtitleTextAppearance((Context)localObject3, paramBoolean);
      }
      paramBoolean = R.styleable.ActionBar_popupTheme;
      paramBoolean = paramToolbar.OooOO0O(paramBoolean, 0);
      if (paramBoolean)
      {
        localToolbar = this.OooO00o;
        localToolbar.setPopupTheme(paramBoolean);
      }
    }
    else
    {
      paramBoolean = OooOO0o();
      this.OooO0O0 = paramBoolean;
    }
    paramToolbar.OooOOOo();
    setDefaultNavigationContentDescription(paramInt1);
    paramToolbar = this.OooO00o.getNavigationContentDescription();
    this.OooOO0o = paramToolbar;
    paramToolbar = this.OooO00o;
    Object localObject2 = new androidx/appcompat/widget/ToolbarWidgetWrapper$1;
    ((ToolbarWidgetWrapper.1)localObject2).<init>(this);
    paramToolbar.setNavigationOnClickListener((View.OnClickListener)localObject2);
  }
  
  private void setTitleInt(CharSequence paramCharSequence)
  {
    this.OooOO0 = paramCharSequence;
    int i = this.OooO0O0 & 0x8;
    if (i != 0)
    {
      Object localObject = this.OooO00o;
      ((Toolbar)localObject).setTitle(paramCharSequence);
      boolean bool = this.OooO;
      if (bool)
      {
        localObject = this.OooO00o.getRootView();
        ViewCompat.o0ooOOo((View)localObject, paramCharSequence);
      }
    }
  }
  
  public void OooO(MenuPresenter.Callback paramCallback, MenuBuilder.Callback paramCallback1)
  {
    this.OooO00o.setMenuCallbacks(paramCallback, paramCallback1);
  }
  
  public void OooO00o(Menu paramMenu, MenuPresenter.Callback paramCallback)
  {
    ActionMenuPresenter localActionMenuPresenter = this.OooOOOO;
    if (localActionMenuPresenter == null)
    {
      localActionMenuPresenter = new androidx/appcompat/widget/ActionMenuPresenter;
      Context localContext = this.OooO00o.getContext();
      localActionMenuPresenter.<init>(localContext);
      this.OooOOOO = localActionMenuPresenter;
      int i = R.id.action_menu_presenter;
      localActionMenuPresenter.setId(i);
    }
    this.OooOOOO.setCallback(paramCallback);
    paramCallback = this.OooO00o;
    paramMenu = (MenuBuilder)paramMenu;
    localActionMenuPresenter = this.OooOOOO;
    paramCallback.setMenu(paramMenu, localActionMenuPresenter);
  }
  
  public void OooO0O0()
  {
    this.OooOOO = true;
  }
  
  public boolean OooO0OO()
  {
    return this.OooO00o.canShowOverflowMenu();
  }
  
  public boolean OooO0Oo()
  {
    return this.OooO00o.hideOverflowMenu();
  }
  
  public void OooO0o()
  {
    this.OooO00o.dismissPopupMenus();
  }
  
  public boolean OooO0o0()
  {
    return this.OooO00o.showOverflowMenu();
  }
  
  public boolean OooO0oO()
  {
    return this.OooO00o.hasExpandedActionView();
  }
  
  public ViewPropertyAnimatorCompat OooO0oo(int paramInt, long paramLong)
  {
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat1 = ViewCompat.OooO0o0(this.OooO00o);
    float f;
    if (paramInt == 0) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat2 = localViewPropertyAnimatorCompat1.OooO0O0(f).OooO0o0(paramLong);
    ToolbarWidgetWrapper.2 local2 = new androidx/appcompat/widget/ToolbarWidgetWrapper$2;
    local2.<init>(this, paramInt);
    return localViewPropertyAnimatorCompat2.OooO0oO(local2);
  }
  
  public void OooOO0() {}
  
  public void OooOO0O() {}
  
  public final int OooOO0o()
  {
    Drawable localDrawable = this.OooO00o.getNavigationIcon();
    int i;
    if (localDrawable != null)
    {
      localDrawable = this.OooO00o.getNavigationIcon();
      this.OooOOo = localDrawable;
      i = 15;
    }
    else
    {
      i = 11;
    }
    return i;
  }
  
  public final void OooOOO()
  {
    int i = this.OooO0O0 & 0x4;
    if (i != 0)
    {
      Object localObject = this.OooOO0o;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject);
      if (bool)
      {
        localObject = this.OooO00o;
        int j = this.OooOOo0;
        ((Toolbar)localObject).setNavigationContentDescription(j);
      }
      else
      {
        localObject = this.OooO00o;
        CharSequence localCharSequence = this.OooOO0o;
        ((Toolbar)localObject).setNavigationContentDescription(localCharSequence);
      }
    }
  }
  
  public final void OooOOO0()
  {
    Object localObject1 = this.OooO0Oo;
    if (localObject1 == null)
    {
      localObject1 = new androidx/appcompat/widget/AppCompatSpinner;
      Object localObject2 = getContext();
      int i = R.attr.actionDropDownStyle;
      ((AppCompatSpinner)localObject1).<init>((Context)localObject2, null, i);
      this.OooO0Oo = ((Spinner)localObject1);
      localObject1 = new androidx/appcompat/widget/Toolbar$LayoutParams;
      int j = 8388627;
      int k = -2;
      ((Toolbar.LayoutParams)localObject1).<init>(k, k, j);
      localObject2 = this.OooO0Oo;
      ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
  }
  
  public final void OooOOOO()
  {
    int i = this.OooO0O0 & 0x4;
    Toolbar localToolbar;
    Drawable localDrawable;
    if (i != 0)
    {
      localToolbar = this.OooO00o;
      localDrawable = this.OooO0oo;
      if (localDrawable == null) {
        localDrawable = this.OooOOo;
      }
    }
    else
    {
      localToolbar = this.OooO00o;
      localDrawable = null;
    }
    localToolbar.setNavigationIcon(localDrawable);
  }
  
  public final void OooOOOo()
  {
    int i = this.OooO0O0;
    int j = i & 0x2;
    Drawable localDrawable;
    if (j != 0)
    {
      i &= 0x1;
      if (i != 0)
      {
        localDrawable = this.OooO0oO;
        if (localDrawable != null) {}
      }
      else
      {
        localDrawable = this.OooO0o;
      }
    }
    else
    {
      i = 0;
      localDrawable = null;
    }
    this.OooO00o.setLogo(localDrawable);
  }
  
  public void collapseActionView()
  {
    this.OooO00o.collapseActionView();
  }
  
  public Context getContext()
  {
    return this.OooO00o.getContext();
  }
  
  public View getCustomView()
  {
    return this.OooO0o0;
  }
  
  public int getDisplayOptions()
  {
    return this.OooO0O0;
  }
  
  public int getDropdownItemCount()
  {
    Spinner localSpinner = this.OooO0Oo;
    int i;
    if (localSpinner != null)
    {
      i = localSpinner.getCount();
    }
    else
    {
      i = 0;
      localSpinner = null;
    }
    return i;
  }
  
  public int getDropdownSelectedPosition()
  {
    Spinner localSpinner = this.OooO0Oo;
    int i;
    if (localSpinner != null)
    {
      i = localSpinner.getSelectedItemPosition();
    }
    else
    {
      i = 0;
      localSpinner = null;
    }
    return i;
  }
  
  public int getHeight()
  {
    return this.OooO00o.getHeight();
  }
  
  public Menu getMenu()
  {
    return this.OooO00o.getMenu();
  }
  
  public int getNavigationMode()
  {
    return this.OooOOOo;
  }
  
  public CharSequence getSubtitle()
  {
    return this.OooO00o.getSubtitle();
  }
  
  public CharSequence getTitle()
  {
    return this.OooO00o.getTitle();
  }
  
  public ViewGroup getViewGroup()
  {
    return this.OooO00o;
  }
  
  public int getVisibility()
  {
    return this.OooO00o.getVisibility();
  }
  
  public boolean isOverflowMenuShowPending()
  {
    return this.OooO00o.isOverflowMenuShowPending();
  }
  
  public boolean isOverflowMenuShowing()
  {
    return this.OooO00o.isOverflowMenuShowing();
  }
  
  public boolean isTitleTruncated()
  {
    return this.OooO00o.isTitleTruncated();
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    ViewCompat.o0ooOoO(this.OooO00o, paramDrawable);
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    this.OooO00o.setCollapsible(paramBoolean);
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = this.OooO0o0;
    if (localObject != null)
    {
      int i = this.OooO0O0 & 0x10;
      if (i != 0)
      {
        Toolbar localToolbar = this.OooO00o;
        localToolbar.removeView((View)localObject);
      }
    }
    this.OooO0o0 = paramView;
    if (paramView != null)
    {
      int j = this.OooO0O0 & 0x10;
      if (j != 0)
      {
        localObject = this.OooO00o;
        ((ViewGroup)localObject).addView(paramView);
      }
    }
  }
  
  public void setDefaultNavigationContentDescription(int paramInt)
  {
    int i = this.OooOOo0;
    if (paramInt == i) {
      return;
    }
    this.OooOOo0 = paramInt;
    CharSequence localCharSequence = this.OooO00o.getNavigationContentDescription();
    paramInt = TextUtils.isEmpty(localCharSequence);
    if (paramInt != 0)
    {
      paramInt = this.OooOOo0;
      setNavigationContentDescription(paramInt);
    }
  }
  
  public void setDefaultNavigationIcon(Drawable paramDrawable)
  {
    Drawable localDrawable = this.OooOOo;
    if (localDrawable != paramDrawable)
    {
      this.OooOOo = paramDrawable;
      OooOOOO();
    }
  }
  
  public void setDisplayOptions(int paramInt)
  {
    int i = this.OooO0O0 ^ paramInt;
    this.OooO0O0 = paramInt;
    if (i != 0)
    {
      int j = i & 0x4;
      if (j != 0)
      {
        j = paramInt & 0x4;
        if (j != 0) {
          OooOOO();
        }
        OooOOOO();
      }
      j = i & 0x3;
      if (j != 0) {
        OooOOOo();
      }
      j = i & 0x8;
      if (j != 0)
      {
        j = paramInt & 0x8;
        Toolbar localToolbar1;
        CharSequence localCharSequence;
        if (j != 0)
        {
          localToolbar1 = this.OooO00o;
          localCharSequence = this.OooOO0;
          localToolbar1.setTitle(localCharSequence);
          localToolbar1 = this.OooO00o;
          localCharSequence = this.OooOO0O;
        }
        else
        {
          localToolbar1 = this.OooO00o;
          localCharSequence = null;
          localToolbar1.setTitle(null);
          localToolbar1 = this.OooO00o;
        }
        localToolbar1.setSubtitle(localCharSequence);
      }
      i &= 0x10;
      if (i != 0)
      {
        View localView = this.OooO0o0;
        if (localView != null)
        {
          paramInt &= 0x10;
          Toolbar localToolbar2;
          if (paramInt != 0)
          {
            localToolbar2 = this.OooO00o;
            localToolbar2.addView(localView);
          }
          else
          {
            localToolbar2 = this.OooO00o;
            localToolbar2.removeView(localView);
          }
        }
      }
    }
  }
  
  public void setDropdownSelectedPosition(int paramInt)
  {
    Spinner localSpinner = this.OooO0Oo;
    if (localSpinner != null)
    {
      localSpinner.setSelection(paramInt);
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Can't set dropdown selected position without an adapter");
    throw localIllegalStateException;
  }
  
  public void setEmbeddedTabView(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    Object localObject = this.OooO0OO;
    Toolbar localToolbar;
    if (localObject != null)
    {
      localObject = ((View)localObject).getParent();
      localToolbar = this.OooO00o;
      if (localObject == localToolbar)
      {
        localObject = this.OooO0OO;
        localToolbar.removeView((View)localObject);
      }
    }
    this.OooO0OO = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null)
    {
      int i = this.OooOOOo;
      int j = 2;
      if (i == j)
      {
        localObject = this.OooO00o;
        localToolbar = null;
        ((ViewGroup)localObject).addView(paramScrollingTabContainerView, 0);
        localObject = (Toolbar.LayoutParams)this.OooO0OO.getLayoutParams();
        int k = -2;
        ((ViewGroup.MarginLayoutParams)localObject).width = k;
        ((ViewGroup.MarginLayoutParams)localObject).height = k;
        k = 8388691;
        ((ActionBar.LayoutParams)localObject).OooO00o = k;
        i = 1;
        paramScrollingTabContainerView.setAllowCollapse(i);
      }
    }
  }
  
  public void setHomeButtonEnabled(boolean paramBoolean) {}
  
  public void setIcon(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0)
    {
      Context localContext = getContext();
      localDrawable = AppCompatResources.OooO0O0(localContext, paramInt);
    }
    else
    {
      paramInt = 0;
      localDrawable = null;
    }
    setIcon(localDrawable);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.OooO0o = paramDrawable;
    OooOOOo();
  }
  
  public void setLogo(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0)
    {
      Context localContext = getContext();
      localDrawable = AppCompatResources.OooO0O0(localContext, paramInt);
    }
    else
    {
      paramInt = 0;
      localDrawable = null;
    }
    setLogo(localDrawable);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    this.OooO0oO = paramDrawable;
    OooOOOo();
  }
  
  public void setNavigationContentDescription(int paramInt)
  {
    String str;
    if (paramInt == 0)
    {
      paramInt = 0;
      str = null;
    }
    else
    {
      Context localContext = getContext();
      str = localContext.getString(paramInt);
    }
    setNavigationContentDescription(str);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    this.OooOO0o = paramCharSequence;
    OooOOO();
  }
  
  public void setNavigationIcon(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0)
    {
      Context localContext = getContext();
      localDrawable = AppCompatResources.OooO0O0(localContext, paramInt);
    }
    else
    {
      paramInt = 0;
      localDrawable = null;
    }
    setNavigationIcon(localDrawable);
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    this.OooO0oo = paramDrawable;
    OooOOOO();
  }
  
  public void setNavigationMode(int paramInt)
  {
    int i = this.OooOOOo;
    if (paramInt != i)
    {
      int j = 2;
      int k = 1;
      Object localObject1;
      Toolbar localToolbar;
      if (i != k)
      {
        if (i != j) {
          break label113;
        }
        localObject1 = this.OooO0OO;
        if (localObject1 == null) {
          break label113;
        }
        localObject1 = ((View)localObject1).getParent();
        localToolbar = this.OooO00o;
        if (localObject1 != localToolbar) {
          break label113;
        }
        localObject1 = this.OooO0OO;
      }
      else
      {
        localObject1 = this.OooO0Oo;
        if (localObject1 == null) {
          break label113;
        }
        localObject1 = ((View)localObject1).getParent();
        localToolbar = this.OooO00o;
        if (localObject1 != localToolbar) {
          break label113;
        }
        localObject1 = this.OooO0Oo;
      }
      localToolbar.removeView((View)localObject1);
      label113:
      this.OooOOOo = paramInt;
      if (paramInt != 0)
      {
        i = 0;
        localObject1 = null;
        Object localObject2;
        Object localObject3;
        if (paramInt != k)
        {
          if (paramInt == j)
          {
            localObject2 = this.OooO0OO;
            if (localObject2 != null)
            {
              localObject3 = this.OooO00o;
              ((ViewGroup)localObject3).addView((View)localObject2, 0);
              localObject2 = (Toolbar.LayoutParams)this.OooO0OO.getLayoutParams();
              i = -2;
              ((ViewGroup.MarginLayoutParams)localObject2).width = i;
              ((ViewGroup.MarginLayoutParams)localObject2).height = i;
              i = 8388691;
              ((ActionBar.LayoutParams)localObject2).OooO00o = i;
            }
          }
          else
          {
            localObject1 = new java/lang/IllegalArgumentException;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((StringBuilder)localObject3).append("Invalid navigation mode ");
            ((StringBuilder)localObject3).append(paramInt);
            localObject2 = ((StringBuilder)localObject3).toString();
            ((IllegalArgumentException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        else
        {
          OooOOO0();
          localObject2 = this.OooO00o;
          localObject3 = this.OooO0Oo;
          ((ViewGroup)localObject2).addView((View)localObject3, 0);
        }
      }
    }
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.OooOO0O = paramCharSequence;
    int i = this.OooO0O0 & 0x8;
    if (i != 0)
    {
      Toolbar localToolbar = this.OooO00o;
      localToolbar.setSubtitle(paramCharSequence);
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.OooO = true;
    setTitleInt(paramCharSequence);
  }
  
  public void setVisibility(int paramInt)
  {
    this.OooO00o.setVisibility(paramInt);
  }
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    this.OooOOO0 = paramCallback;
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    boolean bool = this.OooO;
    if (!bool) {
      setTitleInt(paramCharSequence);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ToolbarWidgetWrapper
 * JD-Core Version:    0.7.0.1
 */