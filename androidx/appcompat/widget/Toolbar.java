package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.appcompat.app.ActionBar.LayoutParams;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Toolbar
  extends ViewGroup
  implements MenuHost
{
  private static final String TAG = "Toolbar";
  private MenuPresenter.Callback mActionMenuPresenterCallback;
  private OnBackInvokedCallback mBackInvokedCallback;
  private boolean mBackInvokedCallbackEnabled;
  private OnBackInvokedDispatcher mBackInvokedDispatcher;
  int mButtonGravity;
  ImageButton mCollapseButtonView;
  private CharSequence mCollapseDescription;
  private Drawable mCollapseIcon;
  private boolean mCollapsible;
  private int mContentInsetEndWithActions;
  private int mContentInsetStartWithNavigation;
  private RtlSpacingHelper mContentInsets;
  private boolean mEatingHover;
  private boolean mEatingTouch;
  View mExpandedActionView;
  private Toolbar.ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
  private int mGravity = 8388627;
  private final ArrayList mHiddenViews;
  private ImageView mLogoView;
  private int mMaxButtonHeight;
  MenuBuilder.Callback mMenuBuilderCallback;
  final MenuHostHelper mMenuHostHelper;
  ActionMenuView mMenuView;
  private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
  private ImageButton mNavButtonView;
  Toolbar.OnMenuItemClickListener mOnMenuItemClickListener;
  private ActionMenuPresenter mOuterActionMenuPresenter;
  private Context mPopupContext;
  private int mPopupTheme;
  private ArrayList mProvidedMenuItems;
  private final Runnable mShowOverflowMenuRunnable;
  private CharSequence mSubtitleText;
  private int mSubtitleTextAppearance;
  private ColorStateList mSubtitleTextColor;
  private TextView mSubtitleTextView;
  private final int[] mTempMargins;
  private final ArrayList mTempViews;
  private int mTitleMarginBottom;
  private int mTitleMarginEnd;
  private int mTitleMarginStart;
  private int mTitleMarginTop;
  private CharSequence mTitleText;
  private int mTitleTextAppearance;
  private ColorStateList mTitleTextColor;
  private TextView mTitleTextView;
  private ToolbarWidgetWrapper mWrapper;
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mTempViews = ((ArrayList)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mHiddenViews = ((ArrayList)localObject1);
    int i = 2;
    localObject1 = new int[i];
    this.mTempMargins = ((int[])localObject1);
    localObject1 = new androidx/core/view/MenuHostHelper;
    Object localObject2 = new androidx/appcompat/widget/OooOO0O;
    ((OooOO0O)localObject2).<init>(this);
    ((MenuHostHelper)localObject1).<init>((Runnable)localObject2);
    this.mMenuHostHelper = ((MenuHostHelper)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mProvidedMenuItems = ((ArrayList)localObject1);
    localObject1 = new androidx/appcompat/widget/Toolbar$1;
    ((Toolbar.1)localObject1).<init>(this);
    this.mMenuViewItemClickListener = ((ActionMenuView.OnMenuItemClickListener)localObject1);
    localObject1 = new androidx/appcompat/widget/Toolbar$2;
    ((Toolbar.2)localObject1).<init>(this);
    this.mShowOverflowMenuRunnable = ((Runnable)localObject1);
    localObject1 = getContext();
    localObject2 = R.styleable.Toolbar;
    localObject1 = TintTypedArray.OooOOOO((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    int[] arrayOfInt = R.styleable.Toolbar;
    TypedArray localTypedArray = ((TintTypedArray)localObject1).getWrappedTypeArray();
    Object localObject3 = paramContext;
    ViewCompat.o00ooo(this, paramContext, arrayOfInt, paramAttributeSet, localTypedArray, paramInt, 0);
    int j = R.styleable.Toolbar_titleTextAppearance;
    j = ((TintTypedArray)localObject1).OooOO0O(j, 0);
    this.mTitleTextAppearance = j;
    j = R.styleable.Toolbar_subtitleTextAppearance;
    j = ((TintTypedArray)localObject1).OooOO0O(j, 0);
    this.mSubtitleTextAppearance = j;
    j = R.styleable.Toolbar_android_gravity;
    int i1 = this.mGravity;
    j = ((TintTypedArray)localObject1).OooO(j, i1);
    this.mGravity = j;
    j = R.styleable.Toolbar_buttonGravity;
    j = ((TintTypedArray)localObject1).OooO(j, 48);
    this.mButtonGravity = j;
    j = R.styleable.Toolbar_titleMargin;
    j = ((TintTypedArray)localObject1).OooO0Oo(j, 0);
    i1 = R.styleable.Toolbar_titleMargins;
    boolean bool4 = ((TintTypedArray)localObject1).OooOO0o(i1);
    if (bool4)
    {
      i2 = R.styleable.Toolbar_titleMargins;
      j = ((TintTypedArray)localObject1).OooO0Oo(i2, j);
    }
    this.mTitleMarginBottom = j;
    this.mTitleMarginTop = j;
    this.mTitleMarginEnd = j;
    this.mTitleMarginStart = j;
    j = R.styleable.Toolbar_titleMarginStart;
    int i2 = -1;
    j = ((TintTypedArray)localObject1).OooO0Oo(j, i2);
    if (j >= 0) {
      this.mTitleMarginStart = j;
    }
    j = R.styleable.Toolbar_titleMarginEnd;
    j = ((TintTypedArray)localObject1).OooO0Oo(j, i2);
    if (j >= 0) {
      this.mTitleMarginEnd = j;
    }
    j = R.styleable.Toolbar_titleMarginTop;
    j = ((TintTypedArray)localObject1).OooO0Oo(j, i2);
    if (j >= 0) {
      this.mTitleMarginTop = j;
    }
    j = R.styleable.Toolbar_titleMarginBottom;
    j = ((TintTypedArray)localObject1).OooO0Oo(j, i2);
    if (j >= 0) {
      this.mTitleMarginBottom = j;
    }
    j = R.styleable.Toolbar_maxButtonHeight;
    j = ((TintTypedArray)localObject1).OooO0o0(j, i2);
    this.mMaxButtonHeight = j;
    j = R.styleable.Toolbar_contentInsetStart;
    i2 = -1 << -1;
    j = ((TintTypedArray)localObject1).OooO0Oo(j, i2);
    paramInt = R.styleable.Toolbar_contentInsetEnd;
    paramInt = ((TintTypedArray)localObject1).OooO0Oo(paramInt, i2);
    int i3 = R.styleable.Toolbar_contentInsetLeft;
    i3 = ((TintTypedArray)localObject1).OooO0o0(i3, 0);
    int i4 = R.styleable.Toolbar_contentInsetRight;
    i4 = ((TintTypedArray)localObject1).OooO0o0(i4, 0);
    OooO0OO();
    localObject3 = this.mContentInsets;
    ((RtlSpacingHelper)localObject3).setAbsolute(i3, i4);
    if ((j != i2) || (paramInt != i2))
    {
      localObject2 = this.mContentInsets;
      ((RtlSpacingHelper)localObject2).setRelative(j, paramInt);
    }
    j = R.styleable.Toolbar_contentInsetStartWithNavigation;
    j = ((TintTypedArray)localObject1).OooO0Oo(j, i2);
    this.mContentInsetStartWithNavigation = j;
    j = R.styleable.Toolbar_contentInsetEndWithActions;
    j = ((TintTypedArray)localObject1).OooO0Oo(j, i2);
    this.mContentInsetEndWithActions = j;
    j = R.styleable.Toolbar_collapseIcon;
    paramContext = ((TintTypedArray)localObject1).getDrawable(j);
    this.mCollapseIcon = paramContext;
    j = R.styleable.Toolbar_collapseContentDescription;
    paramContext = ((TintTypedArray)localObject1).getText(j);
    this.mCollapseDescription = paramContext;
    j = R.styleable.Toolbar_title;
    paramContext = ((TintTypedArray)localObject1).getText(j);
    boolean bool5 = TextUtils.isEmpty(paramContext);
    if (!bool5) {
      setTitle(paramContext);
    }
    j = R.styleable.Toolbar_subtitle;
    paramContext = ((TintTypedArray)localObject1).getText(j);
    bool5 = TextUtils.isEmpty(paramContext);
    if (!bool5) {
      setSubtitle(paramContext);
    }
    paramContext = getContext();
    this.mPopupContext = paramContext;
    j = R.styleable.Toolbar_popupTheme;
    j = ((TintTypedArray)localObject1).OooOO0O(j, 0);
    setPopupTheme(j);
    j = R.styleable.Toolbar_navigationIcon;
    paramContext = ((TintTypedArray)localObject1).getDrawable(j);
    if (paramContext != null) {
      setNavigationIcon(paramContext);
    }
    j = R.styleable.Toolbar_navigationContentDescription;
    paramContext = ((TintTypedArray)localObject1).getText(j);
    bool5 = TextUtils.isEmpty(paramContext);
    if (!bool5) {
      setNavigationContentDescription(paramContext);
    }
    j = R.styleable.Toolbar_logo;
    paramContext = ((TintTypedArray)localObject1).getDrawable(j);
    if (paramContext != null) {
      setLogo(paramContext);
    }
    j = R.styleable.Toolbar_logoDescription;
    paramContext = ((TintTypedArray)localObject1).getText(j);
    bool5 = TextUtils.isEmpty(paramContext);
    if (!bool5) {
      setLogoDescription(paramContext);
    }
    j = R.styleable.Toolbar_titleTextColor;
    boolean bool1 = ((TintTypedArray)localObject1).OooOO0o(j);
    if (bool1)
    {
      k = R.styleable.Toolbar_titleTextColor;
      paramContext = ((TintTypedArray)localObject1).getColorStateList(k);
      setTitleTextColor(paramContext);
    }
    int k = R.styleable.Toolbar_subtitleTextColor;
    boolean bool2 = ((TintTypedArray)localObject1).OooOO0o(k);
    if (bool2)
    {
      m = R.styleable.Toolbar_subtitleTextColor;
      paramContext = ((TintTypedArray)localObject1).getColorStateList(m);
      setSubtitleTextColor(paramContext);
    }
    int m = R.styleable.Toolbar_menu;
    boolean bool3 = ((TintTypedArray)localObject1).OooOO0o(m);
    if (bool3)
    {
      int n = R.styleable.Toolbar_menu;
      n = ((TintTypedArray)localObject1).OooOO0O(n, 0);
      inflateMenu(n);
    }
    ((TintTypedArray)localObject1).OooOOOo();
  }
  
  private int getChildHorizontalGravity(int paramInt)
  {
    int i = ViewCompat.OooOoOO(this);
    paramInt = GravityCompat.OooO0O0(paramInt, i) & 0x7;
    int j = 1;
    if (paramInt != j)
    {
      int k = 3;
      if (paramInt != k)
      {
        int m = 5;
        if (paramInt != m)
        {
          if (i == j) {
            k = m;
          }
          return k;
        }
      }
    }
    return paramInt;
  }
  
  private int getChildVerticalGravity(int paramInt)
  {
    paramInt &= 0x70;
    int i = 16;
    if (paramInt != i)
    {
      i = 48;
      if (paramInt != i)
      {
        i = 80;
        if (paramInt != i) {
          paramInt = this.mGravity & 0x70;
        }
      }
    }
    return paramInt;
  }
  
  private ArrayList getCurrentMenuItems()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Menu localMenu = getMenu();
    int i = 0;
    for (;;)
    {
      int j = localMenu.size();
      if (i >= j) {
        break;
      }
      MenuItem localMenuItem = localMenu.getItem(i);
      localArrayList.add(localMenuItem);
      i += 1;
    }
    return localArrayList;
  }
  
  private MenuInflater getMenuInflater()
  {
    SupportMenuInflater localSupportMenuInflater = new androidx/appcompat/view/SupportMenuInflater;
    Context localContext = getContext();
    localSupportMenuInflater.<init>(localContext);
    return localSupportMenuInflater;
  }
  
  public final int OooO(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = MarginLayoutParamsCompat.OooO0O0(paramView);
    int j = MarginLayoutParamsCompat.OooO00o(paramView);
    return i + j;
  }
  
  public final void OooO00o(List paramList, int paramInt)
  {
    int i = ViewCompat.OooOoOO(this);
    int j = 0;
    Toolbar.LayoutParams localLayoutParams1 = null;
    int k = 1;
    View localView;
    if (i == k)
    {
      i = k;
    }
    else
    {
      i = 0;
      localView = null;
    }
    int n = getChildCount();
    int i1 = ViewCompat.OooOoOO(this);
    paramInt = GravityCompat.OooO0O0(paramInt, i1);
    paramList.clear();
    if (i != 0)
    {
      n -= k;
      while (n >= 0)
      {
        localView = getChildAt(n);
        localLayoutParams1 = (Toolbar.LayoutParams)localView.getLayoutParams();
        k = localLayoutParams1.OooO0O0;
        if (k == 0)
        {
          boolean bool1 = OooOo00(localView);
          if (bool1)
          {
            j = localLayoutParams1.OooO00o;
            j = getChildHorizontalGravity(j);
            if (j == paramInt) {
              paramList.add(localView);
            }
          }
        }
        n += -1;
      }
    }
    while (j < n)
    {
      localView = getChildAt(j);
      Toolbar.LayoutParams localLayoutParams2 = (Toolbar.LayoutParams)localView.getLayoutParams();
      i1 = localLayoutParams2.OooO0O0;
      if (i1 == 0)
      {
        boolean bool2 = OooOo00(localView);
        if (bool2)
        {
          int m = localLayoutParams2.OooO00o;
          m = getChildHorizontalGravity(m);
          if (m == paramInt) {
            paramList.add(localView);
          }
        }
      }
      j += 1;
    }
  }
  
  public final void OooO0O0(View paramView, boolean paramBoolean)
  {
    Object localObject1 = paramView.getLayoutParams();
    if (localObject1 == null)
    {
      localObject1 = generateDefaultLayoutParams();
    }
    else
    {
      i = checkLayoutParams((ViewGroup.LayoutParams)localObject1);
      if (i == 0) {
        localObject1 = generateLayoutParams((ViewGroup.LayoutParams)localObject1);
      } else {
        localObject1 = (Toolbar.LayoutParams)localObject1;
      }
    }
    int i = 1;
    ((Toolbar.LayoutParams)localObject1).OooO0O0 = i;
    if (paramBoolean)
    {
      Object localObject2 = this.mExpandedActionView;
      if (localObject2 != null)
      {
        paramView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        localObject2 = this.mHiddenViews;
        ((ArrayList)localObject2).add(paramView);
        return;
      }
    }
    addView(paramView, (ViewGroup.LayoutParams)localObject1);
  }
  
  public final void OooO0OO()
  {
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    if (localRtlSpacingHelper == null)
    {
      localRtlSpacingHelper = new androidx/appcompat/widget/RtlSpacingHelper;
      localRtlSpacingHelper.<init>();
      this.mContentInsets = localRtlSpacingHelper;
    }
  }
  
  public final void OooO0Oo()
  {
    Object localObject = this.mLogoView;
    if (localObject == null)
    {
      localObject = new androidx/appcompat/widget/AppCompatImageView;
      Context localContext = getContext();
      ((AppCompatImageView)localObject).<init>(localContext);
      this.mLogoView = ((ImageView)localObject);
    }
  }
  
  public final void OooO0o()
  {
    Object localObject1 = this.mMenuView;
    if (localObject1 == null)
    {
      localObject1 = new androidx/appcompat/widget/ActionMenuView;
      Object localObject2 = getContext();
      ((ActionMenuView)localObject1).<init>((Context)localObject2);
      this.mMenuView = ((ActionMenuView)localObject1);
      int i = this.mPopupTheme;
      ((ActionMenuView)localObject1).setPopupTheme(i);
      localObject1 = this.mMenuView;
      localObject2 = this.mMenuViewItemClickListener;
      ((ActionMenuView)localObject1).setOnMenuItemClickListener((ActionMenuView.OnMenuItemClickListener)localObject2);
      localObject1 = this.mMenuView;
      localObject2 = this.mActionMenuPresenterCallback;
      Toolbar.3 local3 = new androidx/appcompat/widget/Toolbar$3;
      local3.<init>(this);
      ((ActionMenuView)localObject1).OooOOo0((MenuPresenter.Callback)localObject2, local3);
      localObject1 = generateDefaultLayoutParams();
      i = this.mButtonGravity & 0x70;
      int j = 8388613;
      i |= j;
      ((ActionBar.LayoutParams)localObject1).OooO00o = i;
      this.mMenuView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = this.mMenuView;
      i = 0;
      localObject2 = null;
      OooO0O0((View)localObject1, false);
    }
  }
  
  public final void OooO0o0()
  {
    OooO0o();
    MenuBuilder localMenuBuilder = this.mMenuView.OooOOOo();
    if (localMenuBuilder == null)
    {
      localMenuBuilder = (MenuBuilder)this.mMenuView.getMenu();
      Object localObject = this.mExpandedMenuPresenter;
      if (localObject == null)
      {
        localObject = new androidx/appcompat/widget/Toolbar$ExpandedActionViewMenuPresenter;
        ((Toolbar.ExpandedActionViewMenuPresenter)localObject).<init>(this);
        this.mExpandedMenuPresenter = ((Toolbar.ExpandedActionViewMenuPresenter)localObject);
      }
      localObject = this.mMenuView;
      boolean bool = true;
      ((ActionMenuView)localObject).setExpandedActionViewsExclusive(bool);
      localObject = this.mExpandedMenuPresenter;
      Context localContext = this.mPopupContext;
      localMenuBuilder.addMenuPresenter((MenuPresenter)localObject, localContext);
      updateBackInvokedCallbackState();
    }
  }
  
  public final void OooO0oO()
  {
    Object localObject1 = this.mNavButtonView;
    if (localObject1 == null)
    {
      localObject1 = new androidx/appcompat/widget/AppCompatImageButton;
      Object localObject2 = getContext();
      int i = R.attr.toolbarNavigationButtonStyle;
      ((AppCompatImageButton)localObject1).<init>((Context)localObject2, null, i);
      this.mNavButtonView = ((ImageButton)localObject1);
      localObject1 = generateDefaultLayoutParams();
      int j = this.mButtonGravity & 0x70;
      int k = 8388611;
      j |= k;
      ((ActionBar.LayoutParams)localObject1).OooO00o = j;
      localObject2 = this.mNavButtonView;
      ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
  }
  
  public final int OooO0oo(View paramView, int paramInt)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    int j = 0;
    if (paramInt > 0) {
      paramInt = (i - paramInt) / 2;
    } else {
      paramInt = 0;
    }
    int k = localLayoutParams.OooO00o;
    k = getChildVerticalGravity(k);
    int m = 48;
    if (k != m)
    {
      m = 80;
      if (k != m)
      {
        paramInt = getPaddingTop();
        k = getPaddingBottom();
        m = getHeight();
        int n = (m - paramInt - k - i) / 2;
        int i1 = localLayoutParams.topMargin;
        if (n < i1)
        {
          n = i1;
        }
        else
        {
          m = m - k - i - n - paramInt;
          i = localLayoutParams.bottomMargin;
          if (m < i)
          {
            i -= m;
            n -= i;
            n = Math.max(0, n);
          }
        }
        return paramInt + n;
      }
      j = getHeight();
      k = getPaddingBottom();
      j = j - k - i;
      i = localLayoutParams.bottomMargin;
      return j - i - paramInt;
    }
    return getPaddingTop() - paramInt;
  }
  
  public final int OooOO0(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = paramView.topMargin;
    int j = paramView.bottomMargin;
    return i + j;
  }
  
  public final int OooOO0O(List paramList, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    int k = paramList.size();
    int m = 0;
    int n = 0;
    while (m < k)
    {
      View localView = (View)paramList.get(m);
      Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)localView.getLayoutParams();
      int i1 = localLayoutParams.leftMargin - i;
      i = localLayoutParams.rightMargin - j;
      j = Math.max(0, i1);
      int i2 = Math.max(0, i);
      i1 = -i1;
      i1 = Math.max(0, i1);
      i = -i;
      i = Math.max(0, i);
      int i3 = localView.getMeasuredWidth();
      j = j + i3 + i2;
      n += j;
      m += 1;
      j = i;
      i = i1;
    }
    return n;
  }
  
  public final boolean OooOO0o(View paramView)
  {
    Object localObject = paramView.getParent();
    if (localObject != this)
    {
      localObject = this.mHiddenViews;
      bool = ((ArrayList)localObject).contains(paramView);
      if (!bool)
      {
        bool = false;
        paramView = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public final int OooOOO(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.rightMargin;
    int j = 1;
    int k = paramArrayOfInt[j];
    i -= k;
    int m = Math.max(0, i);
    paramInt1 -= m;
    i = -i;
    i = Math.max(0, i);
    paramArrayOfInt[j] = i;
    int n = OooO0oo(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    i = paramInt1 - paramInt2;
    j = paramView.getMeasuredHeight() + n;
    paramView.layout(i, n, paramInt1, j);
    int i1 = localLayoutParams.leftMargin;
    paramInt2 += i1;
    return paramInt1 - paramInt2;
  }
  
  public final int OooOOO0(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.leftMargin;
    int j = paramArrayOfInt[0];
    i -= j;
    j = Math.max(0, i);
    paramInt1 += j;
    i = -i;
    i = Math.max(0, i);
    paramArrayOfInt[0] = i;
    int k = OooO0oo(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    i = paramInt1 + paramInt2;
    int m = paramView.getMeasuredHeight() + k;
    paramView.layout(paramInt1, k, i, m);
    int n = localLayoutParams.rightMargin;
    paramInt2 += n;
    return paramInt1 + paramInt2;
  }
  
  public final int OooOOOO(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = localMarginLayoutParams.leftMargin;
    int j = paramArrayOfInt[0];
    i -= j;
    j = localMarginLayoutParams.rightMargin;
    int k = 1;
    int m = paramArrayOfInt[k];
    j -= m;
    m = Math.max(0, i);
    int n = Math.max(0, j);
    m += n;
    i = -i;
    i = Math.max(0, i);
    paramArrayOfInt[0] = i;
    i = -j;
    i = Math.max(0, i);
    paramArrayOfInt[k] = i;
    int i1 = getPaddingLeft();
    i = getPaddingRight();
    i1 = i1 + i + m + paramInt2;
    paramInt2 = localMarginLayoutParams.width;
    paramInt1 = ViewGroup.getChildMeasureSpec(paramInt1, i1, paramInt2);
    paramInt2 = getPaddingTop();
    i1 = getPaddingBottom();
    paramInt2 += i1;
    i1 = localMarginLayoutParams.topMargin;
    paramInt2 += i1;
    i1 = localMarginLayoutParams.bottomMargin;
    paramInt2 = paramInt2 + i1 + paramInt4;
    paramInt4 = localMarginLayoutParams.height;
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt3, paramInt2, paramInt4);
    paramView.measure(paramInt1, paramInt2);
    return paramView.getMeasuredWidth() + m;
  }
  
  public final void OooOOOo(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = getPaddingLeft();
    int j = getPaddingRight();
    i += j;
    j = localMarginLayoutParams.leftMargin;
    i += j;
    j = localMarginLayoutParams.rightMargin;
    i = i + j + paramInt2;
    paramInt2 = localMarginLayoutParams.width;
    paramInt1 = ViewGroup.getChildMeasureSpec(paramInt1, i, paramInt2);
    paramInt2 = getPaddingTop();
    i = getPaddingBottom();
    paramInt2 += i;
    i = localMarginLayoutParams.topMargin;
    paramInt2 += i;
    i = localMarginLayoutParams.bottomMargin;
    paramInt2 = paramInt2 + i + paramInt4;
    paramInt4 = localMarginLayoutParams.height;
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt3, paramInt2, paramInt4);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt4 = 1073741824;
    if ((paramInt3 != paramInt4) && (paramInt5 >= 0))
    {
      if (paramInt3 != 0)
      {
        paramInt2 = View.MeasureSpec.getSize(paramInt2);
        paramInt5 = Math.min(paramInt2, paramInt5);
      }
      paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt5, paramInt4);
    }
    paramView.measure(paramInt1, paramInt2);
  }
  
  public final void OooOOo()
  {
    Runnable localRunnable = this.mShowOverflowMenuRunnable;
    removeCallbacks(localRunnable);
    localRunnable = this.mShowOverflowMenuRunnable;
    post(localRunnable);
  }
  
  public final void OooOOo0()
  {
    Object localObject = getMenu();
    ArrayList localArrayList = getCurrentMenuItems();
    MenuHostHelper localMenuHostHelper = this.mMenuHostHelper;
    MenuInflater localMenuInflater = getMenuInflater();
    localMenuHostHelper.OooO0oo((Menu)localObject, localMenuInflater);
    localObject = getCurrentMenuItems();
    ((ArrayList)localObject).removeAll(localArrayList);
    this.mProvidedMenuItems = ((ArrayList)localObject);
  }
  
  public final boolean OooOOoo()
  {
    boolean bool1 = this.mCollapsible;
    if (!bool1) {
      return false;
    }
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      boolean bool2 = OooOo00(localView);
      if (bool2)
      {
        int k = localView.getMeasuredWidth();
        if (k > 0)
        {
          int m = localView.getMeasuredHeight();
          if (m > 0) {
            return false;
          }
        }
      }
      j += 1;
    }
    return true;
  }
  
  public final boolean OooOo00(View paramView)
  {
    if (paramView != null)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this)
      {
        i = paramView.getVisibility();
        int j = 8;
        if (i != j) {
          return 1;
        }
      }
    }
    int i = 0;
    paramView = null;
    return i;
  }
  
  public void addChildrenForExpandedActionView()
  {
    ArrayList localArrayList = this.mHiddenViews;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      View localView = (View)this.mHiddenViews.get(i);
      addView(localView);
      i += -1;
    }
    this.mHiddenViews.clear();
  }
  
  public void addMenuProvider(MenuProvider paramMenuProvider)
  {
    this.mMenuHostHelper.OooO0OO(paramMenuProvider);
  }
  
  public void addMenuProvider(MenuProvider paramMenuProvider, LifecycleOwner paramLifecycleOwner)
  {
    this.mMenuHostHelper.OooO0Oo(paramMenuProvider, paramLifecycleOwner);
  }
  
  public void addMenuProvider(MenuProvider paramMenuProvider, LifecycleOwner paramLifecycleOwner, Lifecycle.State paramState)
  {
    this.mMenuHostHelper.OooO0o0(paramMenuProvider, paramLifecycleOwner, paramState);
  }
  
  public boolean canShowOverflowMenu()
  {
    int i = getVisibility();
    if (i == 0)
    {
      localActionMenuView = this.mMenuView;
      if (localActionMenuView != null)
      {
        bool = localActionMenuView.isOverflowReserved();
        if (bool) {
          return true;
        }
      }
    }
    boolean bool = false;
    ActionMenuView localActionMenuView = null;
    return bool;
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool1 = super.checkLayoutParams(paramLayoutParams);
    if (bool1)
    {
      bool2 = paramLayoutParams instanceof Toolbar.LayoutParams;
      if (bool2) {
        return true;
      }
    }
    boolean bool2 = false;
    paramLayoutParams = null;
    return bool2;
  }
  
  public void collapseActionView()
  {
    Object localObject = this.mExpandedMenuPresenter;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Toolbar.ExpandedActionViewMenuPresenter)localObject).o00Ooo00;
    }
    if (localObject != null) {
      ((MenuItemImpl)localObject).collapseActionView();
    }
  }
  
  public void dismissPopupMenus()
  {
    ActionMenuView localActionMenuView = this.mMenuView;
    if (localActionMenuView != null) {
      localActionMenuView.OooO0oO();
    }
  }
  
  public void ensureCollapseButtonView()
  {
    Object localObject1 = this.mCollapseButtonView;
    if (localObject1 == null)
    {
      localObject1 = new androidx/appcompat/widget/AppCompatImageButton;
      Object localObject2 = getContext();
      int i = R.attr.toolbarNavigationButtonStyle;
      ((AppCompatImageButton)localObject1).<init>((Context)localObject2, null, i);
      this.mCollapseButtonView = ((ImageButton)localObject1);
      localObject2 = this.mCollapseIcon;
      ((ImageView)localObject1).setImageDrawable((Drawable)localObject2);
      localObject1 = this.mCollapseButtonView;
      localObject2 = this.mCollapseDescription;
      ((View)localObject1).setContentDescription((CharSequence)localObject2);
      localObject1 = generateDefaultLayoutParams();
      int j = this.mButtonGravity & 0x70;
      int k = 8388611;
      j |= k;
      ((ActionBar.LayoutParams)localObject1).OooO00o = j;
      j = 2;
      ((Toolbar.LayoutParams)localObject1).OooO0O0 = j;
      this.mCollapseButtonView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = this.mCollapseButtonView;
      localObject2 = new androidx/appcompat/widget/Toolbar$4;
      ((Toolbar.4)localObject2).<init>(this);
      ((View)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    }
  }
  
  public Toolbar.LayoutParams generateDefaultLayoutParams()
  {
    Toolbar.LayoutParams localLayoutParams = new androidx/appcompat/widget/Toolbar$LayoutParams;
    int i = -2;
    localLayoutParams.<init>(i, i);
    return localLayoutParams;
  }
  
  public Toolbar.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    Toolbar.LayoutParams localLayoutParams = new androidx/appcompat/widget/Toolbar$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public Toolbar.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof Toolbar.LayoutParams;
    if (bool)
    {
      localLayoutParams = new androidx/appcompat/widget/Toolbar$LayoutParams;
      paramLayoutParams = (Toolbar.LayoutParams)paramLayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
      return localLayoutParams;
    }
    bool = paramLayoutParams instanceof ActionBar.LayoutParams;
    if (bool)
    {
      localLayoutParams = new androidx/appcompat/widget/Toolbar$LayoutParams;
      paramLayoutParams = (ActionBar.LayoutParams)paramLayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
      return localLayoutParams;
    }
    bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
    if (bool)
    {
      localLayoutParams = new androidx/appcompat/widget/Toolbar$LayoutParams;
      paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
      return localLayoutParams;
    }
    Toolbar.LayoutParams localLayoutParams = new androidx/appcompat/widget/Toolbar$LayoutParams;
    localLayoutParams.<init>(paramLayoutParams);
    return localLayoutParams;
  }
  
  public CharSequence getCollapseContentDescription()
  {
    Object localObject = this.mCollapseButtonView;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public Drawable getCollapseIcon()
  {
    Object localObject = this.mCollapseButtonView;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public int getContentInsetEnd()
  {
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    int i;
    if (localRtlSpacingHelper != null)
    {
      i = localRtlSpacingHelper.getEnd();
    }
    else
    {
      i = 0;
      localRtlSpacingHelper = null;
    }
    return i;
  }
  
  public int getContentInsetEndWithActions()
  {
    int i = this.mContentInsetEndWithActions;
    int j = -1 << -1;
    if (i == j) {
      i = getContentInsetEnd();
    }
    return i;
  }
  
  public int getContentInsetLeft()
  {
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    int i;
    if (localRtlSpacingHelper != null)
    {
      i = localRtlSpacingHelper.getLeft();
    }
    else
    {
      i = 0;
      localRtlSpacingHelper = null;
    }
    return i;
  }
  
  public int getContentInsetRight()
  {
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    int i;
    if (localRtlSpacingHelper != null)
    {
      i = localRtlSpacingHelper.getRight();
    }
    else
    {
      i = 0;
      localRtlSpacingHelper = null;
    }
    return i;
  }
  
  public int getContentInsetStart()
  {
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    int i;
    if (localRtlSpacingHelper != null)
    {
      i = localRtlSpacingHelper.getStart();
    }
    else
    {
      i = 0;
      localRtlSpacingHelper = null;
    }
    return i;
  }
  
  public int getContentInsetStartWithNavigation()
  {
    int i = this.mContentInsetStartWithNavigation;
    int j = -1 << -1;
    if (i == j) {
      i = getContentInsetStart();
    }
    return i;
  }
  
  public int getCurrentContentInsetEnd()
  {
    Object localObject = this.mMenuView;
    int i = 0;
    if (localObject != null)
    {
      localObject = ((ActionMenuView)localObject).OooOOOo();
      if (localObject != null)
      {
        bool = ((MenuBuilder)localObject).hasVisibleItems();
        if (bool)
        {
          bool = true;
          break label38;
        }
      }
    }
    boolean bool = false;
    localObject = null;
    label38:
    int j;
    if (bool)
    {
      j = getContentInsetEnd();
      int k = this.mContentInsetEndWithActions;
      i = Math.max(k, 0);
      j = Math.max(j, i);
    }
    else
    {
      j = getContentInsetEnd();
    }
    return j;
  }
  
  public int getCurrentContentInsetLeft()
  {
    int i = ViewCompat.OooOoOO(this);
    int j = 1;
    if (i == j) {
      i = getCurrentContentInsetEnd();
    } else {
      i = getCurrentContentInsetStart();
    }
    return i;
  }
  
  public int getCurrentContentInsetRight()
  {
    int i = ViewCompat.OooOoOO(this);
    int j = 1;
    if (i == j) {
      i = getCurrentContentInsetStart();
    } else {
      i = getCurrentContentInsetEnd();
    }
    return i;
  }
  
  public int getCurrentContentInsetStart()
  {
    Drawable localDrawable = getNavigationIcon();
    int i;
    if (localDrawable != null)
    {
      i = getContentInsetStart();
      int j = Math.max(this.mContentInsetStartWithNavigation, 0);
      i = Math.max(i, j);
    }
    else
    {
      i = getContentInsetStart();
    }
    return i;
  }
  
  public Drawable getLogo()
  {
    Object localObject = this.mLogoView;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public CharSequence getLogoDescription()
  {
    Object localObject = this.mLogoView;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public Menu getMenu()
  {
    OooO0o0();
    return this.mMenuView.getMenu();
  }
  
  public View getNavButtonView()
  {
    return this.mNavButtonView;
  }
  
  public CharSequence getNavigationContentDescription()
  {
    Object localObject = this.mNavButtonView;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public Drawable getNavigationIcon()
  {
    Object localObject = this.mNavButtonView;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public ActionMenuPresenter getOuterActionMenuPresenter()
  {
    return this.mOuterActionMenuPresenter;
  }
  
  public Drawable getOverflowIcon()
  {
    OooO0o0();
    return this.mMenuView.getOverflowIcon();
  }
  
  Context getPopupContext()
  {
    return this.mPopupContext;
  }
  
  public int getPopupTheme()
  {
    return this.mPopupTheme;
  }
  
  public CharSequence getSubtitle()
  {
    return this.mSubtitleText;
  }
  
  public final TextView getSubtitleTextView()
  {
    return this.mSubtitleTextView;
  }
  
  public CharSequence getTitle()
  {
    return this.mTitleText;
  }
  
  public int getTitleMarginBottom()
  {
    return this.mTitleMarginBottom;
  }
  
  public int getTitleMarginEnd()
  {
    return this.mTitleMarginEnd;
  }
  
  public int getTitleMarginStart()
  {
    return this.mTitleMarginStart;
  }
  
  public int getTitleMarginTop()
  {
    return this.mTitleMarginTop;
  }
  
  public final TextView getTitleTextView()
  {
    return this.mTitleTextView;
  }
  
  public DecorToolbar getWrapper()
  {
    ToolbarWidgetWrapper localToolbarWidgetWrapper = this.mWrapper;
    if (localToolbarWidgetWrapper == null)
    {
      localToolbarWidgetWrapper = new androidx/appcompat/widget/ToolbarWidgetWrapper;
      boolean bool = true;
      localToolbarWidgetWrapper.<init>(this, bool);
      this.mWrapper = localToolbarWidgetWrapper;
    }
    return this.mWrapper;
  }
  
  public boolean hasExpandedActionView()
  {
    Object localObject = this.mExpandedMenuPresenter;
    if (localObject != null)
    {
      localObject = ((Toolbar.ExpandedActionViewMenuPresenter)localObject).o00Ooo00;
      if (localObject != null) {
        return true;
      }
    }
    boolean bool = false;
    localObject = null;
    return bool;
  }
  
  public boolean hideOverflowMenu()
  {
    ActionMenuView localActionMenuView = this.mMenuView;
    if (localActionMenuView != null)
    {
      bool = localActionMenuView.OooOOO0();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localActionMenuView = null;
    return bool;
  }
  
  public void inflateMenu(int paramInt)
  {
    MenuInflater localMenuInflater = getMenuInflater();
    Menu localMenu = getMenu();
    localMenuInflater.inflate(paramInt, localMenu);
  }
  
  public void invalidateMenu()
  {
    Iterator localIterator = this.mProvidedMenuItems.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MenuItem localMenuItem = (MenuItem)localIterator.next();
      Menu localMenu = getMenu();
      int i = localMenuItem.getItemId();
      localMenu.removeItem(i);
    }
    OooOOo0();
  }
  
  public boolean isBackInvokedCallbackEnabled()
  {
    return this.mBackInvokedCallbackEnabled;
  }
  
  public boolean isOverflowMenuShowPending()
  {
    ActionMenuView localActionMenuView = this.mMenuView;
    if (localActionMenuView != null)
    {
      bool = localActionMenuView.isOverflowMenuShowPending();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localActionMenuView = null;
    return bool;
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuView localActionMenuView = this.mMenuView;
    if (localActionMenuView != null)
    {
      bool = localActionMenuView.isOverflowMenuShowing();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localActionMenuView = null;
    return bool;
  }
  
  public boolean isTitleTruncated()
  {
    Object localObject = this.mTitleTextView;
    if (localObject == null) {
      return false;
    }
    localObject = ((TextView)localObject).getLayout();
    if (localObject == null) {
      return false;
    }
    int i = ((Layout)localObject).getLineCount();
    int j = 0;
    while (j < i)
    {
      int k = ((Layout)localObject).getEllipsisCount(j);
      if (k > 0) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    updateBackInvokedCallbackState();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Runnable localRunnable = this.mShowOverflowMenuRunnable;
    removeCallbacks(localRunnable);
    updateBackInvokedCallbackState();
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    int j = 9;
    if (i == j) {
      this.mEatingHover = false;
    }
    boolean bool1 = this.mEatingHover;
    boolean bool2 = true;
    if (!bool1)
    {
      boolean bool3 = super.onHoverEvent(paramMotionEvent);
      if ((i == j) && (!bool3)) {
        this.mEatingHover = bool2;
      }
    }
    int k = 10;
    if (i != k)
    {
      k = 3;
      if (i != k) {}
    }
    else
    {
      this.mEatingHover = false;
    }
    return bool2;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Toolbar localToolbar = this;
    int i = ViewCompat.OooOoOO(this);
    int j = 0;
    Object localObject1 = null;
    int k = 1;
    Object localObject2;
    if (i == k)
    {
      i = k;
    }
    else
    {
      i = 0;
      localObject2 = null;
    }
    int m = getWidth();
    int n = getHeight();
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    int i3 = getPaddingTop();
    int i4 = getPaddingBottom();
    int i5 = m - i2;
    int[] arrayOfInt = localToolbar.mTempMargins;
    arrayOfInt[k] = 0;
    arrayOfInt[0] = 0;
    int i6 = ViewCompat.OooOoo0(this);
    if (i6 >= 0)
    {
      int i7 = paramInt4 - paramInt2;
      i6 = Math.min(i6, i7);
    }
    else
    {
      i6 = 0;
    }
    Object localObject3 = localToolbar.mNavButtonView;
    boolean bool1 = localToolbar.OooOo00((View)localObject3);
    int i8;
    if (bool1)
    {
      localObject3 = localToolbar.mNavButtonView;
      if (i != 0)
      {
        i9 = localToolbar.OooOOO((View)localObject3, i5, arrayOfInt, i6);
        i8 = i1;
        break label212;
      }
      i8 = localToolbar.OooOOO0((View)localObject3, i1, arrayOfInt, i6);
    }
    else
    {
      i8 = i1;
    }
    int i9 = i5;
    label212:
    Object localObject4 = localToolbar.mCollapseButtonView;
    boolean bool4 = localToolbar.OooOo00((View)localObject4);
    if (bool4)
    {
      localObject4 = localToolbar.mCollapseButtonView;
      if (i != 0) {
        i9 = localToolbar.OooOOO((View)localObject4, i9, arrayOfInt, i6);
      } else {
        i8 = localToolbar.OooOOO0((View)localObject4, i8, arrayOfInt, i6);
      }
    }
    localObject4 = localToolbar.mMenuView;
    bool4 = localToolbar.OooOo00((View)localObject4);
    if (bool4)
    {
      localObject4 = localToolbar.mMenuView;
      if (i != 0) {
        i8 = localToolbar.OooOOO0((View)localObject4, i8, arrayOfInt, i6);
      } else {
        i9 = localToolbar.OooOOO((View)localObject4, i9, arrayOfInt, i6);
      }
    }
    int i10 = getCurrentContentInsetLeft();
    int i11 = getCurrentContentInsetRight();
    k = i10 - i8;
    k = Math.max(0, k);
    arrayOfInt[0] = k;
    k = i5 - i9;
    k = i11 - k;
    k = Math.max(0, k);
    int i12 = 1;
    arrayOfInt[i12] = k;
    k = Math.max(i8, i10);
    i5 -= i11;
    i5 = Math.min(i9, i5);
    localObject3 = localToolbar.mExpandedActionView;
    boolean bool2 = localToolbar.OooOo00((View)localObject3);
    if (bool2)
    {
      localObject3 = localToolbar.mExpandedActionView;
      if (i != 0) {
        i5 = localToolbar.OooOOO((View)localObject3, i5, arrayOfInt, i6);
      } else {
        k = localToolbar.OooOOO0((View)localObject3, k, arrayOfInt, i6);
      }
    }
    localObject3 = localToolbar.mLogoView;
    bool2 = localToolbar.OooOo00((View)localObject3);
    if (bool2)
    {
      localObject3 = localToolbar.mLogoView;
      if (i != 0) {
        i5 = localToolbar.OooOOO((View)localObject3, i5, arrayOfInt, i6);
      } else {
        k = localToolbar.OooOOO0((View)localObject3, k, arrayOfInt, i6);
      }
    }
    localObject3 = localToolbar.mTitleTextView;
    bool2 = localToolbar.OooOo00((View)localObject3);
    TextView localTextView1 = localToolbar.mSubtitleTextView;
    boolean bool3 = localToolbar.OooOo00(localTextView1);
    if (bool2)
    {
      localObject4 = (Toolbar.LayoutParams)localToolbar.mTitleTextView.getLayoutParams();
      j = ((ViewGroup.MarginLayoutParams)localObject4).topMargin;
      paramInt3 = i2;
      i2 = localToolbar.mTitleTextView.getMeasuredHeight();
      j += i2;
      i2 = ((ViewGroup.MarginLayoutParams)localObject4).bottomMargin;
      j += i2;
      i2 = 0;
      localObject5 = null;
      j += 0;
    }
    else
    {
      paramInt3 = i2;
      j = 0;
      localObject1 = null;
    }
    Object localObject6;
    if (bool3)
    {
      localObject5 = (Toolbar.LayoutParams)localToolbar.mSubtitleTextView.getLayoutParams();
      i10 = ((ViewGroup.MarginLayoutParams)localObject5).topMargin;
      i11 = m;
      localObject6 = localToolbar.mSubtitleTextView;
      m = ((View)localObject6).getMeasuredHeight();
      i10 += m;
      m = ((ViewGroup.MarginLayoutParams)localObject5).bottomMargin;
      i10 += m;
      j += i10;
    }
    else
    {
      i11 = m;
    }
    int i13;
    if ((!bool2) && (!bool3))
    {
      i13 = i1;
      paramInt2 = i6;
    }
    for (;;)
    {
      i = 0;
      localObject2 = null;
      break label1819;
      if (bool2) {
        localObject6 = localToolbar.mTitleTextView;
      } else {
        localObject6 = localToolbar.mSubtitleTextView;
      }
      if (bool3) {
        localObject5 = localToolbar.mSubtitleTextView;
      } else {
        localObject5 = localToolbar.mTitleTextView;
      }
      localObject6 = (Toolbar.LayoutParams)((View)localObject6).getLayoutParams();
      localObject5 = (Toolbar.LayoutParams)((View)localObject5).getLayoutParams();
      if (bool2)
      {
        localObject4 = localToolbar.mTitleTextView;
        i10 = ((View)localObject4).getMeasuredWidth();
        if (i10 > 0) {}
      }
      else
      {
        if (!bool3) {
          break label908;
        }
        localObject4 = localToolbar.mSubtitleTextView;
        i10 = ((View)localObject4).getMeasuredWidth();
        if (i10 <= 0) {
          break label908;
        }
      }
      i12 = 1;
      break label911;
      label908:
      i12 = 0;
      label911:
      i10 = localToolbar.mGravity & 0x70;
      i13 = i1;
      i1 = 48;
      if (i10 != i1)
      {
        i1 = 80;
        if (i10 != i1)
        {
          i1 = (n - i3 - i4 - j) / 2;
          i10 = ((ViewGroup.MarginLayoutParams)localObject6).topMargin;
          paramInt2 = i6;
          i6 = localToolbar.mTitleMarginTop;
          paramInt4 = k;
          k = i10 + i6;
          if (i1 < k)
          {
            i1 = i10 + i6;
          }
          else
          {
            n = n - i4 - j - i1 - i3;
            j = ((ViewGroup.MarginLayoutParams)localObject6).bottomMargin;
            k = localToolbar.mTitleMarginBottom;
            j += k;
            if (n < j)
            {
              j = ((ViewGroup.MarginLayoutParams)localObject5).bottomMargin + k - n;
              i1 -= j;
              j = 0;
              localObject1 = null;
              i1 = Math.max(0, i1);
            }
          }
          i3 += i1;
        }
        else
        {
          paramInt4 = k;
          paramInt2 = i6;
          n -= i4;
          k = ((ViewGroup.MarginLayoutParams)localObject5).bottomMargin;
          n -= k;
          k = localToolbar.mTitleMarginBottom;
          n -= k;
          i3 = n - j;
        }
      }
      else
      {
        paramInt4 = k;
        paramInt2 = i6;
        j = getPaddingTop();
        k = ((ViewGroup.MarginLayoutParams)localObject6).topMargin;
        j += k;
        k = localToolbar.mTitleMarginTop;
        i3 = j + k;
      }
      if (i == 0) {
        break;
      }
      if (i12 != 0)
      {
        i = localToolbar.mTitleMarginStart;
      }
      else
      {
        i = 0;
        localObject2 = null;
      }
      j = 1;
      k = arrayOfInt[j];
      i -= k;
      k = 0;
      TextView localTextView2 = null;
      m = Math.max(0, i);
      i5 -= m;
      i = -i;
      i = Math.max(0, i);
      arrayOfInt[j] = i;
      if (bool2)
      {
        localObject2 = (Toolbar.LayoutParams)localToolbar.mTitleTextView.getLayoutParams();
        localObject1 = localToolbar.mTitleTextView;
        j = ((View)localObject1).getMeasuredWidth();
        j = i5 - j;
        localTextView2 = localToolbar.mTitleTextView;
        k = localTextView2.getMeasuredHeight() + i3;
        localObject6 = localToolbar.mTitleTextView;
        ((View)localObject6).layout(j, i3, i5, k);
        m = localToolbar.mTitleMarginEnd;
        j -= m;
        i = ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin;
        i3 = k + i;
      }
      else
      {
        j = i5;
      }
      if (bool3)
      {
        i = ((Toolbar.LayoutParams)localToolbar.mSubtitleTextView.getLayoutParams()).topMargin;
        i3 += i;
        localObject2 = localToolbar.mSubtitleTextView;
        i = ((View)localObject2).getMeasuredWidth();
        i = i5 - i;
        localTextView2 = localToolbar.mSubtitleTextView;
        k = localTextView2.getMeasuredHeight() + i3;
        localObject6 = localToolbar.mSubtitleTextView;
        ((View)localObject6).layout(i, i3, i5, k);
        i = localToolbar.mTitleMarginEnd;
        i = i5 - i;
      }
      else
      {
        i = i5;
      }
      if (i12 != 0)
      {
        i = Math.min(j, i);
        i5 = i;
      }
      k = paramInt4;
    }
    if (i12 != 0)
    {
      i2 = localToolbar.mTitleMarginStart;
      i = 0;
      localObject2 = null;
    }
    else
    {
      i = 0;
      localObject2 = null;
      i2 = 0;
      localObject5 = null;
    }
    j = arrayOfInt[0];
    i2 -= j;
    j = Math.max(0, i2);
    k = paramInt4 + j;
    j = -i2;
    j = Math.max(0, j);
    arrayOfInt[0] = j;
    TextView localTextView3;
    TextView localTextView4;
    if (bool2)
    {
      localObject1 = (Toolbar.LayoutParams)localToolbar.mTitleTextView.getLayoutParams();
      localObject6 = localToolbar.mTitleTextView;
      m = ((View)localObject6).getMeasuredWidth() + k;
      localTextView3 = localToolbar.mTitleTextView;
      n = localTextView3.getMeasuredHeight() + i3;
      localTextView4 = localToolbar.mTitleTextView;
      localTextView4.layout(k, i3, m, n);
      i1 = localToolbar.mTitleMarginEnd;
      m += i1;
      j = ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin;
      i3 = n + j;
    }
    else
    {
      m = k;
    }
    if (bool3)
    {
      j = ((Toolbar.LayoutParams)localToolbar.mSubtitleTextView.getLayoutParams()).topMargin;
      i3 += j;
      localObject1 = localToolbar.mSubtitleTextView;
      j = ((View)localObject1).getMeasuredWidth() + k;
      localTextView3 = localToolbar.mSubtitleTextView;
      n = localTextView3.getMeasuredHeight() + i3;
      localTextView4 = localToolbar.mSubtitleTextView;
      localTextView4.layout(k, i3, j, n);
      n = localToolbar.mTitleMarginEnd;
      j += n;
    }
    else
    {
      j = k;
    }
    if (i12 != 0) {
      k = Math.max(m, j);
    }
    label1819:
    localObject1 = localToolbar.mTempViews;
    m = 3;
    localToolbar.OooO00o((List)localObject1, m);
    localObject1 = localToolbar.mTempViews;
    j = ((ArrayList)localObject1).size();
    i2 = 0;
    Object localObject5 = null;
    while (i2 < j)
    {
      localObject6 = (View)localToolbar.mTempViews.get(i2);
      i6 = paramInt2;
      k = localToolbar.OooOOO0((View)localObject6, k, arrayOfInt, paramInt2);
      i2 += 1;
    }
    i6 = paramInt2;
    localObject1 = localToolbar.mTempViews;
    m = 5;
    localToolbar.OooO00o((List)localObject1, m);
    localObject1 = localToolbar.mTempViews;
    j = ((ArrayList)localObject1).size();
    i2 = 0;
    localObject5 = null;
    while (i2 < j)
    {
      localObject6 = (View)localToolbar.mTempViews.get(i2);
      i5 = localToolbar.OooOOO((View)localObject6, i5, arrayOfInt, i6);
      i2 += 1;
    }
    localObject1 = localToolbar.mTempViews;
    localToolbar.OooO00o((List)localObject1, 1);
    localObject1 = localToolbar.mTempViews;
    j = localToolbar.OooOO0O((List)localObject1, arrayOfInt);
    m = (i11 - i13 - paramInt3) / 2;
    i1 = i13 + m;
    m = j / 2;
    i1 -= m;
    j += i1;
    if (i1 >= k) {
      if (j > i5)
      {
        j -= i5;
        k = i1 - j;
      }
      else
      {
        k = i1;
      }
    }
    localObject1 = localToolbar.mTempViews;
    j = ((ArrayList)localObject1).size();
    while (i < j)
    {
      localObject6 = (View)localToolbar.mTempViews.get(i);
      k = localToolbar.OooOOO0((View)localObject6, k, arrayOfInt, i6);
      i += 1;
    }
    localToolbar.mTempViews.clear();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Toolbar localToolbar = this;
    int[] arrayOfInt = this.mTempMargins;
    boolean bool1 = ViewUtils.OooO0O0(this);
    int j = 0;
    int k = bool1 ^ true;
    Object localObject1 = this.mNavButtonView;
    boolean bool2 = OooOo00((View)localObject1);
    int i6;
    int i7;
    Object localObject3;
    int i12;
    int i13;
    if (bool2)
    {
      localObject2 = this.mNavButtonView;
      i6 = 0;
      i7 = this.mMaxButtonHeight;
      i8 = 0;
      localObject1 = this;
      i9 = paramInt1;
      OooOOOo((View)localObject2, paramInt1, 0, paramInt2, 0, i7);
      localObject1 = this.mNavButtonView;
      m = ((View)localObject1).getMeasuredWidth();
      localObject2 = this.mNavButtonView;
      int i10 = OooO((View)localObject2);
      m += i10;
      localObject2 = this.mNavButtonView;
      i10 = ((View)localObject2).getMeasuredHeight();
      localObject3 = this.mNavButtonView;
      i9 = OooOO0((View)localObject3);
      i10 += i9;
      i10 = Math.max(0, i10);
      localObject3 = this.mNavButtonView;
      i9 = ((View)localObject3).getMeasuredState();
      i9 = View.combineMeasuredStates(0, i9);
      i12 = i10;
      i13 = i9;
    }
    else
    {
      m = 0;
      localObject1 = null;
      i12 = 0;
      i13 = 0;
    }
    Object localObject2 = localToolbar.mCollapseButtonView;
    boolean bool10 = localToolbar.OooOo00((View)localObject2);
    if (bool10)
    {
      localObject2 = localToolbar.mCollapseButtonView;
      i6 = 0;
      i7 = localToolbar.mMaxButtonHeight;
      i8 = 0;
      localObject1 = this;
      i9 = paramInt1;
      OooOOOo((View)localObject2, paramInt1, 0, paramInt2, 0, i7);
      localObject1 = localToolbar.mCollapseButtonView;
      m = ((View)localObject1).getMeasuredWidth();
      localObject2 = localToolbar.mCollapseButtonView;
      i11 = localToolbar.OooO((View)localObject2);
      m += i11;
      i11 = localToolbar.mCollapseButtonView.getMeasuredHeight();
      localObject3 = localToolbar.mCollapseButtonView;
      i9 = localToolbar.OooOO0((View)localObject3);
      i11 += i9;
      i12 = Math.max(i12, i11);
      localObject2 = localToolbar.mCollapseButtonView;
      i11 = ((View)localObject2).getMeasuredState();
      i13 = View.combineMeasuredStates(i13, i11);
    }
    int i11 = getCurrentContentInsetStart();
    int i9 = Math.max(i11, m);
    int i14 = 0 + i9;
    i11 -= m;
    int m = Math.max(0, i11);
    arrayOfInt[bool1] = m;
    localObject1 = localToolbar.mMenuView;
    boolean bool3 = localToolbar.OooOo00((View)localObject1);
    if (bool3)
    {
      localObject2 = localToolbar.mMenuView;
      i6 = 0;
      i7 = localToolbar.mMaxButtonHeight;
      localObject1 = this;
      i9 = paramInt1;
      i8 = i14;
      OooOOOo((View)localObject2, paramInt1, i14, paramInt2, 0, i7);
      localObject1 = localToolbar.mMenuView;
      n = ((View)localObject1).getMeasuredWidth();
      localObject2 = localToolbar.mMenuView;
      i11 = localToolbar.OooO((View)localObject2);
      n += i11;
      i11 = localToolbar.mMenuView.getMeasuredHeight();
      localObject3 = localToolbar.mMenuView;
      i9 = localToolbar.OooOO0((View)localObject3);
      i11 += i9;
      i12 = Math.max(i12, i11);
      localObject2 = localToolbar.mMenuView;
      i11 = ((View)localObject2).getMeasuredState();
      i13 = View.combineMeasuredStates(i13, i11);
    }
    else
    {
      n = 0;
      localObject1 = null;
    }
    i11 = getCurrentContentInsetEnd();
    i9 = Math.max(i11, n);
    i14 += i9;
    i11 -= n;
    int n = Math.max(0, i11);
    arrayOfInt[k] = n;
    localObject1 = localToolbar.mExpandedActionView;
    boolean bool4 = localToolbar.OooOo00((View)localObject1);
    if (bool4)
    {
      localObject2 = localToolbar.mExpandedActionView;
      i6 = 0;
      localObject1 = this;
      i9 = paramInt1;
      i8 = i14;
      int i1 = OooOOOO((View)localObject2, paramInt1, i14, paramInt2, 0, arrayOfInt);
      i14 += i1;
      i1 = localToolbar.mExpandedActionView.getMeasuredHeight();
      localObject2 = localToolbar.mExpandedActionView;
      i11 = localToolbar.OooOO0((View)localObject2);
      i1 += i11;
      i12 = Math.max(i12, i1);
      localObject1 = localToolbar.mExpandedActionView;
      i1 = ((View)localObject1).getMeasuredState();
      i13 = View.combineMeasuredStates(i13, i1);
    }
    localObject1 = localToolbar.mLogoView;
    boolean bool5 = localToolbar.OooOo00((View)localObject1);
    int i2;
    if (bool5)
    {
      localObject2 = localToolbar.mLogoView;
      i6 = 0;
      localObject1 = this;
      i9 = paramInt1;
      i8 = i14;
      i2 = OooOOOO((View)localObject2, paramInt1, i14, paramInt2, 0, arrayOfInt);
      i14 += i2;
      i2 = localToolbar.mLogoView.getMeasuredHeight();
      localObject2 = localToolbar.mLogoView;
      i11 = localToolbar.OooOO0((View)localObject2);
      i2 += i11;
      i12 = Math.max(i12, i2);
      localObject1 = localToolbar.mLogoView;
      i2 = ((View)localObject1).getMeasuredState();
      i13 = View.combineMeasuredStates(i13, i2);
    }
    int i = getChildCount();
    k = 0;
    View localView;
    while (k < i)
    {
      localView = localToolbar.getChildAt(k);
      localObject1 = (Toolbar.LayoutParams)localView.getLayoutParams();
      i2 = ((Toolbar.LayoutParams)localObject1).OooO0O0;
      if (i2 == 0)
      {
        boolean bool6 = localToolbar.OooOo00(localView);
        if (bool6)
        {
          i6 = 0;
          localObject1 = this;
          localObject2 = localView;
          i9 = paramInt1;
          i8 = i14;
          i3 = OooOOOO(localView, paramInt1, i14, paramInt2, 0, arrayOfInt);
          i14 += i3;
          i3 = localView.getMeasuredHeight();
          i11 = localToolbar.OooOO0(localView);
          i3 += i11;
          i3 = Math.max(i12, i3);
          i11 = localView.getMeasuredState();
          i11 = View.combineMeasuredStates(i13, i11);
          i12 = i3;
          i13 = i11;
        }
      }
      k += 1;
    }
    int i3 = localToolbar.mTitleMarginTop;
    i11 = localToolbar.mTitleMarginBottom;
    i = i3 + i11;
    i3 = localToolbar.mTitleMarginStart;
    i11 = localToolbar.mTitleMarginEnd;
    k = i3 + i11;
    localObject1 = localToolbar.mTitleTextView;
    boolean bool7 = localToolbar.OooOo00((View)localObject1);
    int i15;
    if (bool7)
    {
      localObject2 = localToolbar.mTitleTextView;
      i8 = i14 + k;
      localObject1 = this;
      i9 = paramInt1;
      i6 = i;
      OooOOOO((View)localObject2, paramInt1, i8, paramInt2, i, arrayOfInt);
      localObject1 = localToolbar.mTitleTextView;
      int i4 = ((View)localObject1).getMeasuredWidth();
      localObject2 = localToolbar.mTitleTextView;
      i11 = localToolbar.OooO((View)localObject2);
      i4 += i11;
      localObject2 = localToolbar.mTitleTextView;
      i11 = ((View)localObject2).getMeasuredHeight();
      localObject3 = localToolbar.mTitleTextView;
      i9 = localToolbar.OooOO0((View)localObject3);
      i11 += i9;
      localObject3 = localToolbar.mTitleTextView;
      i9 = ((View)localObject3).getMeasuredState();
      i13 = View.combineMeasuredStates(i13, i9);
      i15 = i11;
      i7 = i13;
      i13 = i4;
    }
    else
    {
      i15 = 0;
      localView = null;
      i7 = i13;
      i13 = 0;
    }
    localObject1 = localToolbar.mSubtitleTextView;
    boolean bool8 = localToolbar.OooOo00((View)localObject1);
    if (bool8)
    {
      localObject2 = localToolbar.mSubtitleTextView;
      i8 = i14 + k;
      i6 = i15 + i;
      localObject1 = this;
      i9 = paramInt1;
      i = i7;
      i5 = OooOOOO((View)localObject2, paramInt1, i8, paramInt2, i6, arrayOfInt);
      i13 = Math.max(i13, i5);
      i5 = localToolbar.mSubtitleTextView.getMeasuredHeight();
      localObject2 = localToolbar.mSubtitleTextView;
      i11 = localToolbar.OooOO0((View)localObject2);
      i5 += i11;
      i15 += i5;
      localObject1 = localToolbar.mSubtitleTextView;
      i5 = ((View)localObject1).getMeasuredState();
      i7 = View.combineMeasuredStates(i7, i5);
    }
    else
    {
      i = i7;
    }
    i14 += i13;
    int i5 = Math.max(i12, i15);
    i11 = getPaddingLeft();
    i9 = getPaddingRight();
    i11 += i9;
    i14 += i11;
    i11 = getPaddingTop();
    i9 = getPaddingBottom();
    i11 += i9;
    i5 += i11;
    i11 = getSuggestedMinimumWidth();
    i11 = Math.max(i14, i11);
    i9 = 0xFF000000 & i7;
    int i8 = paramInt1;
    i11 = View.resolveSizeAndState(i11, paramInt1, i9);
    i9 = getSuggestedMinimumHeight();
    i5 = Math.max(i5, i9);
    i9 = i7 << 16;
    i8 = paramInt2;
    i5 = View.resolveSizeAndState(i5, paramInt2, i9);
    boolean bool9 = OooOOoo();
    if (!bool9) {
      j = i5;
    }
    localToolbar.setMeasuredDimension(i11, j);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool1 = paramParcelable instanceof Toolbar.SavedState;
    if (!bool1)
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (Toolbar.SavedState)paramParcelable;
    Object localObject = paramParcelable.getSuperState();
    super.onRestoreInstanceState((Parcelable)localObject);
    localObject = this.mMenuView;
    if (localObject != null)
    {
      localObject = ((ActionMenuView)localObject).OooOOOo();
    }
    else
    {
      bool1 = false;
      localObject = null;
    }
    int i = paramParcelable.o00OoOoo;
    if (i != 0)
    {
      Toolbar.ExpandedActionViewMenuPresenter localExpandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
      if ((localExpandedActionViewMenuPresenter != null) && (localObject != null))
      {
        localObject = ((Menu)localObject).findItem(i);
        if (localObject != null) {
          ((MenuItem)localObject).expandActionView();
        }
      }
    }
    boolean bool2 = paramParcelable.o00Ooo00;
    if (bool2) {
      OooOOo();
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    super.onRtlPropertiesChanged(paramInt);
    OooO0OO();
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    int i = 1;
    if (paramInt != i) {
      i = 0;
    }
    localRtlSpacingHelper.setDirection(i);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Toolbar.SavedState localSavedState = new androidx/appcompat/widget/Toolbar$SavedState;
    Object localObject = super.onSaveInstanceState();
    localSavedState.<init>((Parcelable)localObject);
    localObject = this.mExpandedMenuPresenter;
    if (localObject != null)
    {
      localObject = ((Toolbar.ExpandedActionViewMenuPresenter)localObject).o00Ooo00;
      if (localObject != null)
      {
        int i = ((MenuItemImpl)localObject).getItemId();
        localSavedState.o00OoOoo = i;
      }
    }
    boolean bool = isOverflowMenuShowing();
    localSavedState.o00Ooo00 = bool;
    return localSavedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      this.mEatingTouch = false;
    }
    boolean bool1 = this.mEatingTouch;
    int j = 1;
    if (!bool1)
    {
      boolean bool2 = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool2)) {
        this.mEatingTouch = j;
      }
    }
    if (i != j)
    {
      int k = 3;
      if (i != k) {}
    }
    else
    {
      this.mEatingTouch = false;
    }
    return j;
  }
  
  public void removeChildrenForExpandedActionView()
  {
    int i = getChildCount() + -1;
    while (i >= 0)
    {
      View localView = getChildAt(i);
      Object localObject = (Toolbar.LayoutParams)localView.getLayoutParams();
      int j = ((Toolbar.LayoutParams)localObject).OooO0O0;
      int k = 2;
      if (j != k)
      {
        localObject = this.mMenuView;
        if (localView != localObject)
        {
          removeViewAt(i);
          localObject = this.mHiddenViews;
          ((ArrayList)localObject).add(localView);
        }
      }
      i += -1;
    }
  }
  
  public void removeMenuProvider(MenuProvider paramMenuProvider)
  {
    this.mMenuHostHelper.OooOO0o(paramMenuProvider);
  }
  
  public void setBackInvokedCallbackEnabled(boolean paramBoolean)
  {
    boolean bool = this.mBackInvokedCallbackEnabled;
    if (bool != paramBoolean)
    {
      this.mBackInvokedCallbackEnabled = paramBoolean;
      updateBackInvokedCallbackState();
    }
  }
  
  public void setCollapseContentDescription(int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0)
    {
      Context localContext = getContext();
      localCharSequence = localContext.getText(paramInt);
    }
    else
    {
      paramInt = 0;
      localCharSequence = null;
    }
    setCollapseContentDescription(localCharSequence);
  }
  
  public void setCollapseContentDescription(CharSequence paramCharSequence)
  {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (!bool) {
      ensureCollapseButtonView();
    }
    ImageButton localImageButton = this.mCollapseButtonView;
    if (localImageButton != null) {
      localImageButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setCollapseIcon(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getContext(), paramInt);
    setCollapseIcon(localDrawable);
  }
  
  public void setCollapseIcon(Drawable paramDrawable)
  {
    Object localObject;
    if (paramDrawable != null)
    {
      ensureCollapseButtonView();
      localObject = this.mCollapseButtonView;
      ((ImageView)localObject).setImageDrawable(paramDrawable);
    }
    else
    {
      paramDrawable = this.mCollapseButtonView;
      if (paramDrawable != null)
      {
        localObject = this.mCollapseIcon;
        paramDrawable.setImageDrawable((Drawable)localObject);
      }
    }
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    this.mCollapsible = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = -1 << -1;
    }
    int i = this.mContentInsetEndWithActions;
    if (paramInt != i)
    {
      this.mContentInsetEndWithActions = paramInt;
      Drawable localDrawable = getNavigationIcon();
      if (localDrawable != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetStartWithNavigation(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = -1 << -1;
    }
    int i = this.mContentInsetStartWithNavigation;
    if (paramInt != i)
    {
      this.mContentInsetStartWithNavigation = paramInt;
      Drawable localDrawable = getNavigationIcon();
      if (localDrawable != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetsAbsolute(int paramInt1, int paramInt2)
  {
    OooO0OO();
    this.mContentInsets.setAbsolute(paramInt1, paramInt2);
  }
  
  public void setContentInsetsRelative(int paramInt1, int paramInt2)
  {
    OooO0OO();
    this.mContentInsets.setRelative(paramInt1, paramInt2);
  }
  
  public void setLogo(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getContext(), paramInt);
    setLogo(localDrawable);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    boolean bool1;
    if (paramDrawable != null)
    {
      OooO0Oo();
      localObject = this.mLogoView;
      bool1 = OooOO0o((View)localObject);
      if (!bool1)
      {
        localObject = this.mLogoView;
        boolean bool2 = true;
        OooO0O0((View)localObject, bool2);
      }
    }
    else
    {
      localObject = this.mLogoView;
      if (localObject != null)
      {
        bool1 = OooOO0o((View)localObject);
        if (bool1)
        {
          localObject = this.mLogoView;
          removeView((View)localObject);
          localObject = this.mHiddenViews;
          ImageView localImageView = this.mLogoView;
          ((ArrayList)localObject).remove(localImageView);
        }
      }
    }
    Object localObject = this.mLogoView;
    if (localObject != null) {
      ((ImageView)localObject).setImageDrawable(paramDrawable);
    }
  }
  
  public void setLogoDescription(int paramInt)
  {
    CharSequence localCharSequence = getContext().getText(paramInt);
    setLogoDescription(localCharSequence);
  }
  
  public void setLogoDescription(CharSequence paramCharSequence)
  {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (!bool) {
      OooO0Oo();
    }
    ImageView localImageView = this.mLogoView;
    if (localImageView != null) {
      localImageView.setContentDescription(paramCharSequence);
    }
  }
  
  public void setMenu(MenuBuilder paramMenuBuilder, ActionMenuPresenter paramActionMenuPresenter)
  {
    if (paramMenuBuilder == null)
    {
      localObject1 = this.mMenuView;
      if (localObject1 == null) {
        return;
      }
    }
    OooO0o();
    Object localObject1 = this.mMenuView.OooOOOo();
    if (localObject1 == paramMenuBuilder) {
      return;
    }
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = this.mOuterActionMenuPresenter;
      ((MenuBuilder)localObject1).removeMenuPresenter((MenuPresenter)localObject2);
      localObject2 = this.mExpandedMenuPresenter;
      ((MenuBuilder)localObject1).removeMenuPresenter((MenuPresenter)localObject2);
    }
    localObject1 = this.mExpandedMenuPresenter;
    if (localObject1 == null)
    {
      localObject1 = new androidx/appcompat/widget/Toolbar$ExpandedActionViewMenuPresenter;
      ((Toolbar.ExpandedActionViewMenuPresenter)localObject1).<init>(this);
      this.mExpandedMenuPresenter = ((Toolbar.ExpandedActionViewMenuPresenter)localObject1);
    }
    boolean bool = true;
    paramActionMenuPresenter.setExpandedActionViewsExclusive(bool);
    if (paramMenuBuilder != null)
    {
      localObject1 = this.mPopupContext;
      paramMenuBuilder.addMenuPresenter(paramActionMenuPresenter, (Context)localObject1);
      localObject1 = this.mExpandedMenuPresenter;
      localObject2 = this.mPopupContext;
      paramMenuBuilder.addMenuPresenter((MenuPresenter)localObject1, (Context)localObject2);
    }
    else
    {
      paramMenuBuilder = this.mPopupContext;
      localObject2 = null;
      paramActionMenuPresenter.initForMenu(paramMenuBuilder, null);
      paramMenuBuilder = this.mExpandedMenuPresenter;
      Context localContext = this.mPopupContext;
      paramMenuBuilder.initForMenu(localContext, null);
      paramActionMenuPresenter.updateMenuView(bool);
      paramMenuBuilder = this.mExpandedMenuPresenter;
      paramMenuBuilder.updateMenuView(bool);
    }
    paramMenuBuilder = this.mMenuView;
    int i = this.mPopupTheme;
    paramMenuBuilder.setPopupTheme(i);
    this.mMenuView.setPresenter(paramActionMenuPresenter);
    this.mOuterActionMenuPresenter = paramActionMenuPresenter;
    updateBackInvokedCallbackState();
  }
  
  public void setMenuCallbacks(MenuPresenter.Callback paramCallback, MenuBuilder.Callback paramCallback1)
  {
    this.mActionMenuPresenterCallback = paramCallback;
    this.mMenuBuilderCallback = paramCallback1;
    ActionMenuView localActionMenuView = this.mMenuView;
    if (localActionMenuView != null) {
      localActionMenuView.OooOOo0(paramCallback, paramCallback1);
    }
  }
  
  public void setNavigationContentDescription(int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0)
    {
      Context localContext = getContext();
      localCharSequence = localContext.getText(paramInt);
    }
    else
    {
      paramInt = 0;
      localCharSequence = null;
    }
    setNavigationContentDescription(localCharSequence);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (!bool) {
      OooO0oO();
    }
    ImageButton localImageButton = this.mNavButtonView;
    if (localImageButton != null)
    {
      localImageButton.setContentDescription(paramCharSequence);
      localImageButton = this.mNavButtonView;
      TooltipCompat.OooO00o(localImageButton, paramCharSequence);
    }
  }
  
  public void setNavigationIcon(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getContext(), paramInt);
    setNavigationIcon(localDrawable);
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    boolean bool1;
    if (paramDrawable != null)
    {
      OooO0oO();
      localObject = this.mNavButtonView;
      bool1 = OooOO0o((View)localObject);
      if (!bool1)
      {
        localObject = this.mNavButtonView;
        boolean bool2 = true;
        OooO0O0((View)localObject, bool2);
      }
    }
    else
    {
      localObject = this.mNavButtonView;
      if (localObject != null)
      {
        bool1 = OooOO0o((View)localObject);
        if (bool1)
        {
          localObject = this.mNavButtonView;
          removeView((View)localObject);
          localObject = this.mHiddenViews;
          ImageButton localImageButton = this.mNavButtonView;
          ((ArrayList)localObject).remove(localImageButton);
        }
      }
    }
    Object localObject = this.mNavButtonView;
    if (localObject != null) {
      ((ImageView)localObject).setImageDrawable(paramDrawable);
    }
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    OooO0oO();
    this.mNavButtonView.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(Toolbar.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mOnMenuItemClickListener = paramOnMenuItemClickListener;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    OooO0o0();
    this.mMenuView.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt)
  {
    int i = this.mPopupTheme;
    if (i != paramInt)
    {
      this.mPopupTheme = paramInt;
      if (paramInt == 0)
      {
        Context localContext1 = getContext();
        this.mPopupContext = localContext1;
      }
      else
      {
        ContextThemeWrapper localContextThemeWrapper = new android/view/ContextThemeWrapper;
        Context localContext2 = getContext();
        localContextThemeWrapper.<init>(localContext2, paramInt);
        this.mPopupContext = localContextThemeWrapper;
      }
    }
  }
  
  public void setSubtitle(int paramInt)
  {
    CharSequence localCharSequence = getContext().getText(paramInt);
    setSubtitle(localCharSequence);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    Object localObject2;
    if (!bool)
    {
      localObject1 = this.mSubtitleTextView;
      int i;
      if (localObject1 == null)
      {
        localObject1 = getContext();
        localObject2 = new androidx/appcompat/widget/AppCompatTextView;
        ((AppCompatTextView)localObject2).<init>((Context)localObject1);
        this.mSubtitleTextView = ((TextView)localObject2);
        ((TextView)localObject2).setSingleLine();
        localObject2 = this.mSubtitleTextView;
        Object localObject3 = TextUtils.TruncateAt.END;
        ((TextView)localObject2).setEllipsize((TextUtils.TruncateAt)localObject3);
        i = this.mSubtitleTextAppearance;
        if (i != 0)
        {
          localObject3 = this.mSubtitleTextView;
          ((TextView)localObject3).setTextAppearance((Context)localObject1, i);
        }
        localObject1 = this.mSubtitleTextColor;
        if (localObject1 != null)
        {
          localObject2 = this.mSubtitleTextView;
          ((TextView)localObject2).setTextColor((ColorStateList)localObject1);
        }
      }
      localObject1 = this.mSubtitleTextView;
      bool = OooOO0o((View)localObject1);
      if (!bool)
      {
        localObject1 = this.mSubtitleTextView;
        i = 1;
        OooO0O0((View)localObject1, i);
      }
    }
    else
    {
      localObject1 = this.mSubtitleTextView;
      if (localObject1 != null)
      {
        bool = OooOO0o((View)localObject1);
        if (bool)
        {
          localObject1 = this.mSubtitleTextView;
          removeView((View)localObject1);
          localObject1 = this.mHiddenViews;
          localObject2 = this.mSubtitleTextView;
          ((ArrayList)localObject1).remove(localObject2);
        }
      }
    }
    Object localObject1 = this.mSubtitleTextView;
    if (localObject1 != null) {
      ((TextView)localObject1).setText(paramCharSequence);
    }
    this.mSubtitleText = paramCharSequence;
  }
  
  public void setSubtitleTextAppearance(Context paramContext, int paramInt)
  {
    this.mSubtitleTextAppearance = paramInt;
    TextView localTextView = this.mSubtitleTextView;
    if (localTextView != null) {
      localTextView.setTextAppearance(paramContext, paramInt);
    }
  }
  
  public void setSubtitleTextColor(int paramInt)
  {
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    setSubtitleTextColor(localColorStateList);
  }
  
  public void setSubtitleTextColor(ColorStateList paramColorStateList)
  {
    this.mSubtitleTextColor = paramColorStateList;
    TextView localTextView = this.mSubtitleTextView;
    if (localTextView != null) {
      localTextView.setTextColor(paramColorStateList);
    }
  }
  
  public void setTitle(int paramInt)
  {
    CharSequence localCharSequence = getContext().getText(paramInt);
    setTitle(localCharSequence);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    Object localObject2;
    if (!bool)
    {
      localObject1 = this.mTitleTextView;
      int i;
      if (localObject1 == null)
      {
        localObject1 = getContext();
        localObject2 = new androidx/appcompat/widget/AppCompatTextView;
        ((AppCompatTextView)localObject2).<init>((Context)localObject1);
        this.mTitleTextView = ((TextView)localObject2);
        ((TextView)localObject2).setSingleLine();
        localObject2 = this.mTitleTextView;
        Object localObject3 = TextUtils.TruncateAt.END;
        ((TextView)localObject2).setEllipsize((TextUtils.TruncateAt)localObject3);
        i = this.mTitleTextAppearance;
        if (i != 0)
        {
          localObject3 = this.mTitleTextView;
          ((TextView)localObject3).setTextAppearance((Context)localObject1, i);
        }
        localObject1 = this.mTitleTextColor;
        if (localObject1 != null)
        {
          localObject2 = this.mTitleTextView;
          ((TextView)localObject2).setTextColor((ColorStateList)localObject1);
        }
      }
      localObject1 = this.mTitleTextView;
      bool = OooOO0o((View)localObject1);
      if (!bool)
      {
        localObject1 = this.mTitleTextView;
        i = 1;
        OooO0O0((View)localObject1, i);
      }
    }
    else
    {
      localObject1 = this.mTitleTextView;
      if (localObject1 != null)
      {
        bool = OooOO0o((View)localObject1);
        if (bool)
        {
          localObject1 = this.mTitleTextView;
          removeView((View)localObject1);
          localObject1 = this.mHiddenViews;
          localObject2 = this.mTitleTextView;
          ((ArrayList)localObject1).remove(localObject2);
        }
      }
    }
    Object localObject1 = this.mTitleTextView;
    if (localObject1 != null) {
      ((TextView)localObject1).setText(paramCharSequence);
    }
    this.mTitleText = paramCharSequence;
  }
  
  public void setTitleMargin(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mTitleMarginStart = paramInt1;
    this.mTitleMarginTop = paramInt2;
    this.mTitleMarginEnd = paramInt3;
    this.mTitleMarginBottom = paramInt4;
    requestLayout();
  }
  
  public void setTitleMarginBottom(int paramInt)
  {
    this.mTitleMarginBottom = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt)
  {
    this.mTitleMarginEnd = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt)
  {
    this.mTitleMarginStart = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt)
  {
    this.mTitleMarginTop = paramInt;
    requestLayout();
  }
  
  public void setTitleTextAppearance(Context paramContext, int paramInt)
  {
    this.mTitleTextAppearance = paramInt;
    TextView localTextView = this.mTitleTextView;
    if (localTextView != null) {
      localTextView.setTextAppearance(paramContext, paramInt);
    }
  }
  
  public void setTitleTextColor(int paramInt)
  {
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    setTitleTextColor(localColorStateList);
  }
  
  public void setTitleTextColor(ColorStateList paramColorStateList)
  {
    this.mTitleTextColor = paramColorStateList;
    TextView localTextView = this.mTitleTextView;
    if (localTextView != null) {
      localTextView.setTextColor(paramColorStateList);
    }
  }
  
  public boolean showOverflowMenu()
  {
    ActionMenuView localActionMenuView = this.mMenuView;
    if (localActionMenuView != null)
    {
      bool = localActionMenuView.OooOOo();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localActionMenuView = null;
    return bool;
  }
  
  void updateBackInvokedCallbackState()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j)
    {
      OnBackInvokedDispatcher localOnBackInvokedDispatcher1 = Toolbar.Api33Impl.OooO00o(this);
      boolean bool = hasExpandedActionView();
      if ((bool) && (localOnBackInvokedDispatcher1 != null))
      {
        bool = ViewCompat.o000oOoO(this);
        if (bool)
        {
          bool = this.mBackInvokedCallbackEnabled;
          if (bool)
          {
            bool = true;
            break label58;
          }
        }
      }
      bool = false;
      Object localObject = null;
      label58:
      if (bool)
      {
        OnBackInvokedDispatcher localOnBackInvokedDispatcher2 = this.mBackInvokedDispatcher;
        if (localOnBackInvokedDispatcher2 == null)
        {
          localObject = this.mBackInvokedCallback;
          if (localObject == null)
          {
            localObject = new androidx/appcompat/widget/OooOOO0;
            ((OooOOO0)localObject).<init>(this);
            localObject = Toolbar.Api33Impl.OooO0O0((Runnable)localObject);
            this.mBackInvokedCallback = ((OnBackInvokedCallback)localObject);
          }
          localObject = this.mBackInvokedCallback;
          Toolbar.Api33Impl.OooO0OO(localOnBackInvokedDispatcher1, localObject);
          break label152;
        }
      }
      if (!bool)
      {
        localOnBackInvokedDispatcher1 = this.mBackInvokedDispatcher;
        if (localOnBackInvokedDispatcher1 != null)
        {
          localObject = this.mBackInvokedCallback;
          Toolbar.Api33Impl.OooO0Oo(localOnBackInvokedDispatcher1, localObject);
          i = 0;
          localOnBackInvokedDispatcher1 = null;
          label152:
          this.mBackInvokedDispatcher = localOnBackInvokedDispatcher1;
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.Toolbar
 * JD-Core Version:    0.7.0.1
 */