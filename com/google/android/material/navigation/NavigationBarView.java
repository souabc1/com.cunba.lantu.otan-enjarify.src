package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;

public abstract class NavigationBarView
  extends FrameLayout
{
  public static final int LABEL_VISIBILITY_AUTO = 255;
  public static final int LABEL_VISIBILITY_LABELED = 1;
  public static final int LABEL_VISIBILITY_SELECTED = 0;
  public static final int LABEL_VISIBILITY_UNLABELED = 2;
  private static final int MENU_PRESENTER_ID = 1;
  private final NavigationBarMenu menu;
  private MenuInflater menuInflater;
  private final NavigationBarMenuView menuView;
  private final NavigationBarPresenter presenter;
  private NavigationBarView.OnItemReselectedListener reselectedListener;
  private NavigationBarView.OnItemSelectedListener selectedListener;
  
  public NavigationBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    paramContext = new com/google/android/material/navigation/NavigationBarPresenter;
    paramContext.<init>();
    this.presenter = paramContext;
    Context localContext = getContext();
    Object localObject1 = R.styleable.NavigationBarView;
    int i = R.styleable.NavigationBarView_itemTextAppearanceInactive;
    int k = R.styleable.NavigationBarView_itemTextAppearanceActive;
    int[] arrayOfInt = { i, k };
    Object localObject2 = localContext;
    Object localObject3 = paramAttributeSet;
    paramAttributeSet = ThemeEnforcement.obtainTintedStyledAttributes(localContext, paramAttributeSet, (int[])localObject1, paramInt1, paramInt2, arrayOfInt);
    NavigationBarMenu localNavigationBarMenu = new com/google/android/material/navigation/NavigationBarMenu;
    Object localObject4 = getClass();
    i = getMaxItemCount();
    localNavigationBarMenu.<init>(localContext, (Class)localObject4, i);
    this.menu = localNavigationBarMenu;
    localObject4 = createNavigationBarMenuView(localContext);
    this.menuView = ((NavigationBarMenuView)localObject4);
    paramContext.setMenuView((NavigationBarMenuView)localObject4);
    i = 1;
    paramContext.setId(i);
    ((NavigationBarMenuView)localObject4).setPresenter(paramContext);
    localNavigationBarMenu.addMenuPresenter(paramContext);
    localObject3 = getContext();
    paramContext.initForMenu((Context)localObject3, localNavigationBarMenu);
    int m = R.styleable.NavigationBarView_itemIconTint;
    boolean bool1 = paramAttributeSet.OooOO0o(m);
    float f;
    if (bool1)
    {
      n = R.styleable.NavigationBarView_itemIconTint;
      paramContext = paramAttributeSet.getColorStateList(n);
    }
    else
    {
      n = 16842808;
      f = 2.369372E-038F;
      paramContext = ((NavigationBarMenuView)localObject4).createDefaultColorStateList(n);
    }
    ((NavigationBarMenuView)localObject4).setIconTintList(paramContext);
    int n = R.styleable.NavigationBarView_itemIconSize;
    localObject3 = getResources();
    int i9 = R.dimen.mtrl_navigation_bar_item_default_icon_size;
    k = ((Resources)localObject3).getDimensionPixelSize(i9);
    n = paramAttributeSet.OooO0o0(n, k);
    setItemIconSize(n);
    n = R.styleable.NavigationBarView_itemTextAppearanceInactive;
    boolean bool2 = paramAttributeSet.OooOO0o(n);
    k = 0;
    localObject3 = null;
    if (bool2)
    {
      i1 = R.styleable.NavigationBarView_itemTextAppearanceInactive;
      i1 = paramAttributeSet.OooOO0O(i1, 0);
      setItemTextAppearanceInactive(i1);
    }
    int i1 = R.styleable.NavigationBarView_itemTextAppearanceActive;
    boolean bool3 = paramAttributeSet.OooOO0o(i1);
    if (bool3)
    {
      i2 = R.styleable.NavigationBarView_itemTextAppearanceActive;
      i2 = paramAttributeSet.OooOO0O(i2, 0);
      setItemTextAppearanceActive(i2);
    }
    int i2 = R.styleable.NavigationBarView_itemTextColor;
    boolean bool4 = paramAttributeSet.OooOO0o(i2);
    if (bool4)
    {
      int i3 = R.styleable.NavigationBarView_itemTextColor;
      paramContext = paramAttributeSet.getColorStateList(i3);
      setItemTextColor(paramContext);
    }
    paramContext = getBackground();
    if (paramContext != null)
    {
      paramContext = getBackground();
      boolean bool5 = paramContext instanceof ColorDrawable;
      if (!bool5) {}
    }
    else
    {
      paramContext = createMaterialShapeDrawableBackground(localContext);
      ViewCompat.o0ooOoO(this, paramContext);
    }
    int i4 = R.styleable.NavigationBarView_itemPaddingTop;
    boolean bool6 = paramAttributeSet.OooOO0o(i4);
    if (bool6)
    {
      i5 = R.styleable.NavigationBarView_itemPaddingTop;
      i5 = paramAttributeSet.OooO0o0(i5, 0);
      setItemPaddingTop(i5);
    }
    int i5 = R.styleable.NavigationBarView_itemPaddingBottom;
    boolean bool7 = paramAttributeSet.OooOO0o(i5);
    if (bool7)
    {
      i6 = R.styleable.NavigationBarView_itemPaddingBottom;
      i6 = paramAttributeSet.OooO0o0(i6, 0);
      setItemPaddingBottom(i6);
    }
    int i6 = R.styleable.NavigationBarView_elevation;
    boolean bool8 = paramAttributeSet.OooOO0o(i6);
    if (bool8)
    {
      i7 = R.styleable.NavigationBarView_elevation;
      i7 = paramAttributeSet.OooO0o0(i7, 0);
      f = i7;
      setElevation(f);
    }
    int i7 = R.styleable.NavigationBarView_backgroundTint;
    paramContext = MaterialResources.getColorStateList(localContext, paramAttributeSet, i7);
    localObject1 = getBackground().mutate();
    DrawableCompat.OooOOOO((Drawable)localObject1, paramContext);
    i7 = R.styleable.NavigationBarView_labelVisibilityMode;
    i9 = -1;
    i7 = paramAttributeSet.OooO(i7, i9);
    setLabelVisibilityMode(i7);
    i7 = R.styleable.NavigationBarView_itemBackground;
    i7 = paramAttributeSet.OooOO0O(i7, 0);
    if (i7 != 0)
    {
      ((NavigationBarMenuView)localObject4).setItemBackgroundRes(i7);
    }
    else
    {
      i7 = R.styleable.NavigationBarView_itemRippleColor;
      paramContext = MaterialResources.getColorStateList(localContext, paramAttributeSet, i7);
      setItemRippleColor(paramContext);
    }
    i7 = R.styleable.NavigationBarView_itemActiveIndicatorStyle;
    i7 = paramAttributeSet.OooOO0O(i7, 0);
    if (i7 != 0)
    {
      setItemActiveIndicatorEnabled(i);
      localObject2 = R.styleable.NavigationBarActiveIndicator;
      paramContext = localContext.obtainStyledAttributes(i7, (int[])localObject2);
      int j = R.styleable.NavigationBarActiveIndicator_android_width;
      j = paramContext.getDimensionPixelSize(j, 0);
      setItemActiveIndicatorWidth(j);
      j = R.styleable.NavigationBarActiveIndicator_android_height;
      j = paramContext.getDimensionPixelSize(j, 0);
      setItemActiveIndicatorHeight(j);
      j = R.styleable.NavigationBarActiveIndicator_marginHorizontal;
      j = paramContext.getDimensionPixelOffset(j, 0);
      setItemActiveIndicatorMarginHorizontal(j);
      j = R.styleable.NavigationBarActiveIndicator_android_color;
      localObject2 = MaterialResources.getColorStateList(localContext, paramContext, j);
      setItemActiveIndicatorColor((ColorStateList)localObject2);
      j = R.styleable.NavigationBarActiveIndicator_shapeAppearance;
      j = paramContext.getResourceId(j, 0);
      localObject2 = ShapeAppearanceModel.builder(localContext, j, 0).build();
      setItemActiveIndicatorShapeAppearance((ShapeAppearanceModel)localObject2);
      paramContext.recycle();
    }
    i7 = R.styleable.NavigationBarView_menu;
    boolean bool9 = paramAttributeSet.OooOO0o(i7);
    if (bool9)
    {
      int i8 = R.styleable.NavigationBarView_menu;
      i8 = paramAttributeSet.OooOO0O(i8, 0);
      inflateMenu(i8);
    }
    paramAttributeSet.OooOOOo();
    addView((View)localObject4);
    paramContext = new com/google/android/material/navigation/NavigationBarView$1;
    paramContext.<init>(this);
    localNavigationBarMenu.setCallback(paramContext);
  }
  
  private MaterialShapeDrawable createMaterialShapeDrawableBackground(Context paramContext)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = new com/google/android/material/shape/MaterialShapeDrawable;
    localMaterialShapeDrawable.<init>();
    Object localObject = getBackground();
    boolean bool = localObject instanceof ColorDrawable;
    if (bool)
    {
      int i = ((ColorDrawable)localObject).getColor();
      localObject = ColorStateList.valueOf(i);
      localMaterialShapeDrawable.setFillColor((ColorStateList)localObject);
    }
    localMaterialShapeDrawable.initializeElevationOverlay(paramContext);
    return localMaterialShapeDrawable;
  }
  
  private MenuInflater getMenuInflater()
  {
    Object localObject = this.menuInflater;
    if (localObject == null)
    {
      localObject = new androidx/appcompat/view/SupportMenuInflater;
      Context localContext = getContext();
      ((SupportMenuInflater)localObject).<init>(localContext);
      this.menuInflater = ((MenuInflater)localObject);
    }
    return this.menuInflater;
  }
  
  public abstract NavigationBarMenuView createNavigationBarMenuView(Context paramContext);
  
  public BadgeDrawable getBadge(int paramInt)
  {
    return this.menuView.getBadge(paramInt);
  }
  
  public ColorStateList getItemActiveIndicatorColor()
  {
    return this.menuView.getItemActiveIndicatorColor();
  }
  
  public int getItemActiveIndicatorHeight()
  {
    return this.menuView.getItemActiveIndicatorHeight();
  }
  
  public int getItemActiveIndicatorMarginHorizontal()
  {
    return this.menuView.getItemActiveIndicatorMarginHorizontal();
  }
  
  public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance()
  {
    return this.menuView.getItemActiveIndicatorShapeAppearance();
  }
  
  public int getItemActiveIndicatorWidth()
  {
    return this.menuView.getItemActiveIndicatorWidth();
  }
  
  public Drawable getItemBackground()
  {
    return this.menuView.getItemBackground();
  }
  
  public int getItemBackgroundResource()
  {
    return this.menuView.getItemBackgroundRes();
  }
  
  public int getItemIconSize()
  {
    return this.menuView.getItemIconSize();
  }
  
  public ColorStateList getItemIconTintList()
  {
    return this.menuView.getIconTintList();
  }
  
  public int getItemPaddingBottom()
  {
    return this.menuView.getItemPaddingBottom();
  }
  
  public int getItemPaddingTop()
  {
    return this.menuView.getItemPaddingTop();
  }
  
  public ColorStateList getItemRippleColor()
  {
    return this.menuView.getItemRippleColor();
  }
  
  public int getItemTextAppearanceActive()
  {
    return this.menuView.getItemTextAppearanceActive();
  }
  
  public int getItemTextAppearanceInactive()
  {
    return this.menuView.getItemTextAppearanceInactive();
  }
  
  public ColorStateList getItemTextColor()
  {
    return this.menuView.getItemTextColor();
  }
  
  public int getLabelVisibilityMode()
  {
    return this.menuView.getLabelVisibilityMode();
  }
  
  public abstract int getMaxItemCount();
  
  public Menu getMenu()
  {
    return this.menu;
  }
  
  public MenuView getMenuView()
  {
    return this.menuView;
  }
  
  public BadgeDrawable getOrCreateBadge(int paramInt)
  {
    return this.menuView.getOrCreateBadge(paramInt);
  }
  
  public NavigationBarPresenter getPresenter()
  {
    return this.presenter;
  }
  
  public int getSelectedItemId()
  {
    return this.menuView.getSelectedItemId();
  }
  
  public void inflateMenu(int paramInt)
  {
    Object localObject = this.presenter;
    boolean bool = true;
    ((NavigationBarPresenter)localObject).setUpdateSuspended(bool);
    localObject = getMenuInflater();
    NavigationBarMenu localNavigationBarMenu = this.menu;
    ((MenuInflater)localObject).inflate(paramInt, localNavigationBarMenu);
    this.presenter.setUpdateSuspended(false);
    this.presenter.updateMenuView(bool);
  }
  
  public boolean isItemActiveIndicatorEnabled()
  {
    return this.menuView.getItemActiveIndicatorEnabled();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    MaterialShapeUtils.setParentAbsoluteElevation(this);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof NavigationBarView.SavedState;
    if (!bool)
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (NavigationBarView.SavedState)paramParcelable;
    Object localObject = paramParcelable.getSuperState();
    super.onRestoreInstanceState((Parcelable)localObject);
    localObject = this.menu;
    paramParcelable = paramParcelable.menuPresenterState;
    ((MenuBuilder)localObject).restorePresenterStates(paramParcelable);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object localObject = super.onSaveInstanceState();
    NavigationBarView.SavedState localSavedState = new com/google/android/material/navigation/NavigationBarView$SavedState;
    localSavedState.<init>((Parcelable)localObject);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    localSavedState.menuPresenterState = ((Bundle)localObject);
    this.menu.savePresenterStates((Bundle)localObject);
    return localSavedState;
  }
  
  public void removeBadge(int paramInt)
  {
    this.menuView.removeBadge(paramInt);
  }
  
  public void setElevation(float paramFloat)
  {
    super.setElevation(paramFloat);
    MaterialShapeUtils.setElevation(this, paramFloat);
  }
  
  public void setItemActiveIndicatorColor(ColorStateList paramColorStateList)
  {
    this.menuView.setItemActiveIndicatorColor(paramColorStateList);
  }
  
  public void setItemActiveIndicatorEnabled(boolean paramBoolean)
  {
    this.menuView.setItemActiveIndicatorEnabled(paramBoolean);
  }
  
  public void setItemActiveIndicatorHeight(int paramInt)
  {
    this.menuView.setItemActiveIndicatorHeight(paramInt);
  }
  
  public void setItemActiveIndicatorMarginHorizontal(int paramInt)
  {
    this.menuView.setItemActiveIndicatorMarginHorizontal(paramInt);
  }
  
  public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel paramShapeAppearanceModel)
  {
    this.menuView.setItemActiveIndicatorShapeAppearance(paramShapeAppearanceModel);
  }
  
  public void setItemActiveIndicatorWidth(int paramInt)
  {
    this.menuView.setItemActiveIndicatorWidth(paramInt);
  }
  
  public void setItemBackground(Drawable paramDrawable)
  {
    this.menuView.setItemBackground(paramDrawable);
  }
  
  public void setItemBackgroundResource(int paramInt)
  {
    this.menuView.setItemBackgroundRes(paramInt);
  }
  
  public void setItemIconSize(int paramInt)
  {
    this.menuView.setItemIconSize(paramInt);
  }
  
  public void setItemIconSizeRes(int paramInt)
  {
    paramInt = getResources().getDimensionPixelSize(paramInt);
    setItemIconSize(paramInt);
  }
  
  public void setItemIconTintList(ColorStateList paramColorStateList)
  {
    this.menuView.setIconTintList(paramColorStateList);
  }
  
  public void setItemOnTouchListener(int paramInt, View.OnTouchListener paramOnTouchListener)
  {
    this.menuView.setItemOnTouchListener(paramInt, paramOnTouchListener);
  }
  
  public void setItemPaddingBottom(int paramInt)
  {
    this.menuView.setItemPaddingBottom(paramInt);
  }
  
  public void setItemPaddingTop(int paramInt)
  {
    this.menuView.setItemPaddingTop(paramInt);
  }
  
  public void setItemRippleColor(ColorStateList paramColorStateList)
  {
    this.menuView.setItemRippleColor(paramColorStateList);
  }
  
  public void setItemTextAppearanceActive(int paramInt)
  {
    this.menuView.setItemTextAppearanceActive(paramInt);
  }
  
  public void setItemTextAppearanceInactive(int paramInt)
  {
    this.menuView.setItemTextAppearanceInactive(paramInt);
  }
  
  public void setItemTextColor(ColorStateList paramColorStateList)
  {
    this.menuView.setItemTextColor(paramColorStateList);
  }
  
  public void setLabelVisibilityMode(int paramInt)
  {
    NavigationBarMenuView localNavigationBarMenuView = this.menuView;
    int i = localNavigationBarMenuView.getLabelVisibilityMode();
    if (i != paramInt)
    {
      this.menuView.setLabelVisibilityMode(paramInt);
      NavigationBarPresenter localNavigationBarPresenter = this.presenter;
      i = 0;
      localNavigationBarMenuView = null;
      localNavigationBarPresenter.updateMenuView(false);
    }
  }
  
  public void setOnItemReselectedListener(NavigationBarView.OnItemReselectedListener paramOnItemReselectedListener)
  {
    this.reselectedListener = paramOnItemReselectedListener;
  }
  
  public void setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.selectedListener = paramOnItemSelectedListener;
  }
  
  public void setSelectedItemId(int paramInt)
  {
    NavigationBarMenu localNavigationBarMenu = this.menu;
    MenuItem localMenuItem = localNavigationBarMenu.findItem(paramInt);
    if (localMenuItem != null)
    {
      localNavigationBarMenu = this.menu;
      NavigationBarPresenter localNavigationBarPresenter = this.presenter;
      boolean bool = localNavigationBarMenu.performItemAction(localMenuItem, localNavigationBarPresenter, 0);
      if (!bool)
      {
        bool = true;
        localMenuItem.setChecked(bool);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.navigation.NavigationBarView
 * JD-Core Version:    0.7.0.1
 */