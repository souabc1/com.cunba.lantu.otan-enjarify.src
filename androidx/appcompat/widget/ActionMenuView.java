package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder.ItemInvoker;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;

public class ActionMenuView
  extends LinearLayoutCompat
  implements MenuBuilder.ItemInvoker, MenuView
{
  public MenuBuilder o00OoOoo;
  public int o00Ooo0;
  public Context o00Ooo00;
  public boolean o00Ooo0O;
  public ActionMenuPresenter o00Ooo0o;
  public MenuBuilder.Callback o00OooO;
  public MenuPresenter.Callback o00OooO0;
  public boolean o00OooOO;
  public int o00OooOo;
  public int o00OoooO;
  public ActionMenuView.OnMenuItemClickListener o00Ooooo;
  public int o0O00o0;
  
  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = paramContext.getResources().getDisplayMetrics().density;
    int i = (int)(56.0F * f);
    this.o0O00o0 = i;
    int j = (int)(f * 4.0F);
    this.o00OoooO = j;
    this.o00Ooo00 = paramContext;
    this.o00Ooo0 = 0;
  }
  
  public static int OooOOO(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ActionMenuView.LayoutParams localLayoutParams = (ActionMenuView.LayoutParams)paramView.getLayoutParams();
    int i = View.MeasureSpec.getSize(paramInt3) - paramInt4;
    paramInt3 = View.MeasureSpec.getMode(paramInt3);
    paramInt3 = View.MeasureSpec.makeMeasureSpec(i, paramInt3);
    paramInt4 = paramView instanceof ActionMenuItemView;
    if (paramInt4 != 0)
    {
      localObject = paramView;
      localObject = (ActionMenuItemView)paramView;
    }
    else
    {
      paramInt4 = 0;
      localObject = null;
    }
    i = 1;
    if (localObject != null)
    {
      paramInt4 = ((ActionMenuItemView)localObject).OooO0o();
      if (paramInt4 != 0)
      {
        paramInt4 = i;
        break label92;
      }
    }
    paramInt4 = 0;
    Object localObject = null;
    label92:
    if (paramInt2 > 0)
    {
      j = 2;
      if ((paramInt4 == 0) || (paramInt2 >= j))
      {
        paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2 * paramInt1, -1 << -1);
        ((View)paramView).measure(paramInt2, paramInt3);
        paramInt2 = ((View)paramView).getMeasuredWidth();
        int k = paramInt2 / paramInt1;
        paramInt2 %= paramInt1;
        if (paramInt2 != 0) {
          k += 1;
        }
        if ((paramInt4 != 0) && (k < j)) {
          break label181;
        }
        j = k;
        break label181;
      }
    }
    int j = 0;
    label181:
    paramInt2 = localLayoutParams.OooO00o;
    if ((paramInt2 != 0) || (paramInt4 == 0)) {
      i = 0;
    }
    localLayoutParams.OooO0Oo = i;
    localLayoutParams.OooO0O0 = j;
    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1 * j, 1073741824);
    ((View)paramView).measure(paramInt1, paramInt3);
    return j;
  }
  
  public ActionMenuView.LayoutParams OooO(AttributeSet paramAttributeSet)
  {
    ActionMenuView.LayoutParams localLayoutParams = new androidx/appcompat/widget/ActionMenuView$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public boolean OooO00o(MenuItemImpl paramMenuItemImpl)
  {
    return this.o00OoOoo.performItemAction(paramMenuItemImpl, 0);
  }
  
  public void OooO0oO()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0o;
    if (localActionMenuPresenter != null) {
      localActionMenuPresenter.OooOOOo();
    }
  }
  
  public ActionMenuView.LayoutParams OooO0oo()
  {
    ActionMenuView.LayoutParams localLayoutParams = new androidx/appcompat/widget/ActionMenuView$LayoutParams;
    int i = -2;
    localLayoutParams.<init>(i, i);
    localLayoutParams.gravity = 16;
    return localLayoutParams;
  }
  
  public ActionMenuView.LayoutParams OooOO0(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      boolean bool = paramLayoutParams instanceof ActionMenuView.LayoutParams;
      ActionMenuView.LayoutParams localLayoutParams;
      if (bool)
      {
        localLayoutParams = new androidx/appcompat/widget/ActionMenuView$LayoutParams;
        paramLayoutParams = (ActionMenuView.LayoutParams)paramLayoutParams;
        localLayoutParams.<init>(paramLayoutParams);
      }
      else
      {
        localLayoutParams = new androidx/appcompat/widget/ActionMenuView$LayoutParams;
        localLayoutParams.<init>(paramLayoutParams);
      }
      int i = localLayoutParams.gravity;
      if (i <= 0)
      {
        i = 16;
        localLayoutParams.gravity = i;
      }
      return localLayoutParams;
    }
    return OooO0oo();
  }
  
  public ActionMenuView.LayoutParams OooOO0O()
  {
    ActionMenuView.LayoutParams localLayoutParams = OooO0oo();
    localLayoutParams.OooO00o = true;
    return localLayoutParams;
  }
  
  public boolean OooOO0o(int paramInt)
  {
    int i = 0;
    if (paramInt == 0) {
      return false;
    }
    int j = paramInt + -1;
    Object localObject1 = getChildAt(j);
    Object localObject2 = getChildAt(paramInt);
    int k = getChildCount();
    if (paramInt < k)
    {
      boolean bool2 = localObject1 instanceof ActionMenuView.ActionMenuChildView;
      if (bool2)
      {
        localObject1 = (ActionMenuView.ActionMenuChildView)localObject1;
        boolean bool1 = ((ActionMenuView.ActionMenuChildView)localObject1).OooO0O0();
        i = false | bool1;
      }
    }
    if (paramInt > 0)
    {
      paramInt = localObject2 instanceof ActionMenuView.ActionMenuChildView;
      if (paramInt != 0)
      {
        localObject2 = (ActionMenuView.ActionMenuChildView)localObject2;
        paramInt = ((ActionMenuView.ActionMenuChildView)localObject2).OooO0OO();
        i |= paramInt;
      }
    }
    return i;
  }
  
  public boolean OooOOO0()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0o;
    if (localActionMenuPresenter != null)
    {
      bool = localActionMenuPresenter.OooOOo();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localActionMenuPresenter = null;
    return bool;
  }
  
  public final void OooOOOO(int paramInt1, int paramInt2)
  {
    ActionMenuView localActionMenuView = this;
    int i = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getSize(paramInt2);
    int i10 = getPaddingLeft();
    int i11 = getPaddingRight();
    i10 += i11;
    i11 = getPaddingTop();
    int i14 = getPaddingBottom();
    i11 += i14;
    int i15 = paramInt2;
    i14 = ViewGroup.getChildMeasureSpec(paramInt2, i11, -2);
    m -= i10;
    i10 = this.o0O00o0;
    i15 = m / i10;
    int i17 = m % i10;
    int i19 = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    if (i15 == 0)
    {
      setMeasuredDimension(m, 0);
      return;
    }
    i17 /= i15;
    i10 += i18;
    int i18 = getChildCount();
    int i22 = 0;
    ActionMenuView.LayoutParams localLayoutParams1 = null;
    int i26 = 0;
    int i29 = 0;
    int i30 = 0;
    int i33 = 0;
    int i34 = 0;
    long l1 = 0L;
    View localView;
    int i36;
    Object localObject2;
    label353:
    int i31;
    int i37;
    long l2;
    int i27;
    while (i26 < i18)
    {
      localView = localActionMenuView.getChildAt(i26);
      i19 = localView.getVisibility();
      i35 = i3;
      i3 = 8;
      f2 = 1.121039E-044F;
      if (i19 != i3)
      {
        int i4 = localView instanceof ActionMenuItemView;
        i30 += 1;
        if (i4 != 0)
        {
          i19 = localActionMenuView.o00OoooO;
          i36 = i30;
          i30 = 0;
          localView.setPadding(i19, 0, i19, 0);
        }
        else
        {
          i36 = i30;
          i30 = 0;
        }
        localObject1 = (ActionMenuView.LayoutParams)localView.getLayoutParams();
        ((ActionMenuView.LayoutParams)localObject1).OooO0o = false;
        ((ActionMenuView.LayoutParams)localObject1).OooO0OO = 0;
        ((ActionMenuView.LayoutParams)localObject1).OooO0O0 = 0;
        ((ActionMenuView.LayoutParams)localObject1).OooO0Oo = false;
        ((LinearLayout.LayoutParams)localObject1).leftMargin = 0;
        ((LinearLayout.LayoutParams)localObject1).rightMargin = 0;
        if (i4 != 0)
        {
          localObject2 = localView;
          localObject2 = (ActionMenuItemView)localView;
          i4 = ((ActionMenuItemView)localObject2).OooO0o();
          if (i4 != 0)
          {
            i4 = 1;
            f2 = 1.4E-45F;
            break label353;
          }
        }
        i4 = 0;
        f2 = 0.0F;
        localObject2 = null;
        ((ActionMenuView.LayoutParams)localObject1).OooO0o0 = i4;
        i4 = ((ActionMenuView.LayoutParams)localObject1).OooO00o;
        if (i4 != 0)
        {
          i4 = 1;
          f2 = 1.4E-45F;
        }
        else
        {
          i4 = i15;
        }
        i5 = OooOOO(localView, i10, i4, i14, i11);
        i33 = Math.max(i33, i5);
        i31 = ((ActionMenuView.LayoutParams)localObject1).OooO0Oo;
        if (i31 != 0) {
          i34 += 1;
        }
        boolean bool6 = ((ActionMenuView.LayoutParams)localObject1).OooO00o;
        if (bool6) {
          i29 = 1;
        }
        i15 -= i5;
        i20 = localView.getMeasuredHeight();
        i22 = Math.max(i22, i20);
        i20 = 1;
        f1 = 1.4E-45F;
        if (i5 == i20)
        {
          i5 = i20 << i26;
          i37 = i22;
          l2 = i5;
          l2 = l1 | l2;
          l1 = l2;
        }
        else
        {
          i37 = i22;
        }
        i31 = i36;
      }
      i26 += 1;
      i5 = i35;
      i20 = 0;
      f1 = 0.0F;
      localObject1 = null;
    }
    int i35 = i5;
    int i5 = 2;
    float f2 = 2.802597E-045F;
    float f3;
    ActionMenuView.LayoutParams localLayoutParams2;
    if ((i29 != 0) && (i31 == i5))
    {
      i11 = 1;
      f3 = 1.4E-45F;
    }
    else
    {
      i11 = 0;
      f3 = 0.0F;
      localLayoutParams2 = null;
    }
    int i20 = 0;
    f1 = 0.0F;
    localObject1 = null;
    int i23;
    label1007:
    float f7;
    int i16;
    while ((i34 > 0) && (i15 > 0))
    {
      i36 = -1 >>> 1;
      i27 = i36;
      i5 = 0;
      f2 = 0.0F;
      localObject2 = null;
      i37 = 0;
      localView = null;
      long l3 = 0L;
      long l4;
      while (i37 < i18)
      {
        ViewGroup.LayoutParams localLayoutParams = localActionMenuView.getChildAt(i37).getLayoutParams();
        i39 = i20;
        f4 = f1;
        localObject1 = localLayoutParams;
        localObject1 = (ActionMenuView.LayoutParams)localLayoutParams;
        i40 = i22;
        i23 = ((ActionMenuView.LayoutParams)localObject1).OooO0Oo;
        if (i23 != 0)
        {
          i20 = ((ActionMenuView.LayoutParams)localObject1).OooO0O0;
          l4 = 1L;
          if (i20 < i27)
          {
            l3 = l4 << i37;
            i27 = i20;
            i5 = 1;
            f2 = 1.4E-45F;
          }
          else if (i20 == i27)
          {
            l2 = l4 << i37;
            l2 = l3 | l2;
            i5 += 1;
            l3 = l2;
          }
        }
        i37 += 1;
        i23 = i40;
        i20 = i39;
        f1 = f4;
      }
      i39 = i20;
      f4 = f1;
      i40 = i23;
      l1 |= l3;
      if (i5 > i15)
      {
        i38 = i;
        i41 = m;
        break label1114;
      }
      int i28;
      i27 += 1;
      i5 = 0;
      f2 = 0.0F;
      localObject2 = null;
      while (i5 < i18)
      {
        localObject1 = localActionMenuView.getChildAt(i5);
        localLayoutParams1 = (ActionMenuView.LayoutParams)((View)localObject1).getLayoutParams();
        i41 = m;
        m = 1 << i5;
        i38 = i;
        long l5 = m;
        l4 = l3 & l5;
        long l6 = 0L;
        boolean bool7 = l4 < l6;
        int i42;
        float f5;
        if (!bool7)
        {
          i20 = localLayoutParams1.OooO0O0;
          if (i20 == i28) {
            l1 |= l5;
          }
          i42 = i11;
          f5 = f3;
        }
        else
        {
          if (i11 != 0)
          {
            int j = localLayoutParams1.OooO0o0;
            if (j != 0)
            {
              j = 1;
              f6 = 1.4E-45F;
              if (i15 == j)
              {
                m = localActionMenuView.o00OoooO;
                k = m + i10;
                i42 = i11;
                f5 = f3;
                i11 = 0;
                f3 = 0.0F;
                localLayoutParams2 = null;
                ((View)localObject1).setPadding(k, 0, m, 0);
                break label1007;
              }
            }
          }
          i42 = i11;
          f5 = f3;
          k = localLayoutParams1.OooO0O0;
          m = 1;
          f7 = 1.4E-45F;
          k += m;
          localLayoutParams1.OooO0O0 = k;
          localLayoutParams1.OooO0o = m;
          i15 += -1;
        }
        i5 += 1;
        k = i38;
        m = i41;
        i11 = i42;
        f3 = f5;
      }
      i23 = i40;
      i5 = 2;
      f2 = 2.802597E-045F;
      i20 = 1;
      f1 = 1.4E-45F;
    }
    int i38 = k;
    int i41 = m;
    int i39 = i20;
    float f4 = f1;
    int i40 = i23;
    label1114:
    int k = 1;
    float f6 = 1.4E-45F;
    Object localObject3;
    if ((i29 == 0) && (i31 == k))
    {
      m = k;
      f7 = f6;
    }
    else
    {
      m = 0;
      f7 = 0.0F;
      localObject3 = null;
    }
    if (i16 > 0)
    {
      l2 = 0L;
      boolean bool2 = l1 < l2;
      if (bool2)
      {
        i31 -= k;
        if ((i16 < i32) || (m != 0) || (i33 > k))
        {
          k = Long.bitCount(l1);
          f6 = k;
          long l8;
          if (m == 0)
          {
            long l7 = l1 & 1L;
            l2 = 0L;
            boolean bool1 = l7 < l2;
            int i6 = 1056964608;
            f2 = 0.5F;
            i32 = 0;
            if (bool1)
            {
              localObject3 = (ActionMenuView.LayoutParams)localActionMenuView.getChildAt(0).getLayoutParams();
              bool1 = ((ActionMenuView.LayoutParams)localObject3).OooO0o0;
              if (!bool1) {
                f6 -= f2;
              }
            }
            int n = i18 + -1;
            f3 = 1.4E-45F;
            i20 = 1 << n;
            l2 = i20;
            l2 = l1 & l2;
            l8 = 0L;
            boolean bool4 = l2 < l8;
            if (bool4)
            {
              localObject3 = (ActionMenuView.LayoutParams)localActionMenuView.getChildAt(n).getLayoutParams();
              i1 = ((ActionMenuView.LayoutParams)localObject3).OooO0o0;
              if (i1 == 0) {
                f6 -= f2;
              }
            }
          }
          else
          {
            i32 = 0;
          }
          f7 = 0.0F;
          localObject3 = null;
          int i1 = f6 < 0.0F;
          if (i1 > 0)
          {
            i16 *= i10;
            f7 = i16 / f6;
            k = (int)f7;
          }
          else
          {
            k = 0;
            f6 = 0.0F;
          }
          i1 = 0;
          localObject3 = null;
          f7 = 0.0F;
          i20 = i39;
          f1 = f4;
          while (i1 < i18)
          {
            f2 = 1.4E-45F;
            int i12 = 1 << i1;
            l8 = i12;
            l8 = l1 & l8;
            long l9 = 0L;
            boolean bool3 = l8 < l9;
            if (!bool3)
            {
              bool3 = true;
              f2 = 1.4E-45F;
              i16 = 2;
            }
            else
            {
              localObject2 = localActionMenuView.getChildAt(i1);
              localLayoutParams2 = (ActionMenuView.LayoutParams)((View)localObject2).getLayoutParams();
              bool3 = localObject2 instanceof ActionMenuItemView;
              if (bool3)
              {
                localLayoutParams2.OooO0OO = k;
                bool3 = true;
                f2 = 1.4E-45F;
                localLayoutParams2.OooO0o = bool3;
                if (i1 == 0)
                {
                  bool3 = localLayoutParams2.OooO0o0;
                  if (!bool3)
                  {
                    i7 = -k;
                    i16 = 2;
                    i7 /= i16;
                    localLayoutParams2.leftMargin = i7;
                    break label1578;
                  }
                }
                i16 = 2;
                label1578:
                int i7 = 1;
                f2 = 1.4E-45F;
                i20 = 1;
                f1 = 1.4E-45F;
              }
              else
              {
                i16 = 2;
                int i8 = localLayoutParams2.OooO00o;
                if (i8 != 0)
                {
                  localLayoutParams2.OooO0OO = k;
                  i8 = 1;
                  f2 = 1.4E-45F;
                  localLayoutParams2.OooO0o = i8;
                  i20 = -k / i16;
                  localLayoutParams2.rightMargin = i20;
                  i20 = i8;
                  f1 = f2;
                }
                else
                {
                  i8 = 1;
                  f2 = 1.4E-45F;
                  if (i1 != 0)
                  {
                    i24 = k / 2;
                    localLayoutParams2.leftMargin = i24;
                  }
                  int i24 = i18 + -1;
                  if (i1 != i24)
                  {
                    int i25 = k / 2;
                    localLayoutParams2.rightMargin = i25;
                  }
                }
              }
            }
            i1 += 1;
          }
        }
      }
    }
    int i32 = 0;
    i20 = i39;
    f1 = f4;
    k = 1073741824;
    f6 = 2.0F;
    int i9;
    if (i20 != 0)
    {
      i20 = 0;
      localObject1 = null;
      f1 = 0.0F;
      while (i20 < i18)
      {
        localObject3 = localActionMenuView.getChildAt(i20);
        localObject2 = (ActionMenuView.LayoutParams)((View)localObject3).getLayoutParams();
        boolean bool5 = ((ActionMenuView.LayoutParams)localObject2).OooO0o;
        if (bool5)
        {
          int i13 = ((ActionMenuView.LayoutParams)localObject2).OooO0O0 * i10;
          i9 = ((ActionMenuView.LayoutParams)localObject2).OooO0OO;
          i13 += i9;
          i9 = View.MeasureSpec.makeMeasureSpec(i13, k);
          ((View)localObject3).measure(i9, i14);
        }
        int i21;
        i20 += 1;
      }
    }
    if (i38 != k) {
      i9 = i40;
    } else {
      i9 = i35;
    }
    int i2 = i41;
    localActionMenuView.setMeasuredDimension(i41, i9);
  }
  
  public MenuBuilder OooOOOo()
  {
    return this.o00OoOoo;
  }
  
  public boolean OooOOo()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0o;
    if (localActionMenuPresenter != null)
    {
      bool = localActionMenuPresenter.OooOo0();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localActionMenuPresenter = null;
    return bool;
  }
  
  public void OooOOo0(MenuPresenter.Callback paramCallback, MenuBuilder.Callback paramCallback1)
  {
    this.o00OooO0 = paramCallback;
    this.o00OooO = paramCallback1;
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ActionMenuView.LayoutParams;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public Menu getMenu()
  {
    Object localObject1 = this.o00OoOoo;
    if (localObject1 == null)
    {
      localObject1 = getContext();
      Object localObject2 = new androidx/appcompat/view/menu/MenuBuilder;
      ((MenuBuilder)localObject2).<init>((Context)localObject1);
      this.o00OoOoo = ((MenuBuilder)localObject2);
      Object localObject3 = new androidx/appcompat/widget/ActionMenuView$MenuBuilderCallback;
      ((ActionMenuView.MenuBuilderCallback)localObject3).<init>(this);
      ((MenuBuilder)localObject2).setCallback((MenuBuilder.Callback)localObject3);
      localObject2 = new androidx/appcompat/widget/ActionMenuPresenter;
      ((ActionMenuPresenter)localObject2).<init>((Context)localObject1);
      this.o00Ooo0o = ((ActionMenuPresenter)localObject2);
      boolean bool = true;
      ((ActionMenuPresenter)localObject2).setReserveOverflow(bool);
      localObject1 = this.o00Ooo0o;
      localObject2 = this.o00OooO0;
      if (localObject2 == null)
      {
        localObject2 = new androidx/appcompat/widget/ActionMenuView$ActionMenuPresenterCallback;
        ((ActionMenuView.ActionMenuPresenterCallback)localObject2).<init>();
      }
      ((BaseMenuPresenter)localObject1).setCallback((MenuPresenter.Callback)localObject2);
      localObject1 = this.o00OoOoo;
      localObject2 = this.o00Ooo0o;
      localObject3 = this.o00Ooo00;
      ((MenuBuilder)localObject1).addMenuPresenter((MenuPresenter)localObject2, (Context)localObject3);
      localObject1 = this.o00Ooo0o;
      ((ActionMenuPresenter)localObject1).setMenuView(this);
    }
    return this.o00OoOoo;
  }
  
  public Drawable getOverflowIcon()
  {
    getMenu();
    return this.o00Ooo0o.getOverflowIcon();
  }
  
  public int getPopupTheme()
  {
    return this.o00Ooo0;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public void initialize(MenuBuilder paramMenuBuilder)
  {
    this.o00OoOoo = paramMenuBuilder;
  }
  
  public boolean isOverflowMenuShowPending()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0o;
    if (localActionMenuPresenter != null)
    {
      bool = localActionMenuPresenter.isOverflowMenuShowPending();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localActionMenuPresenter = null;
    return bool;
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0o;
    if (localActionMenuPresenter != null)
    {
      bool = localActionMenuPresenter.isOverflowMenuShowing();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localActionMenuPresenter = null;
    return bool;
  }
  
  public boolean isOverflowReserved()
  {
    return this.o00Ooo0O;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = this.o00Ooo0o;
    if (paramConfiguration != null)
    {
      paramConfiguration.updateMenuView(false);
      paramConfiguration = this.o00Ooo0o;
      boolean bool = paramConfiguration.isOverflowMenuShowing();
      if (bool)
      {
        this.o00Ooo0o.OooOOo();
        paramConfiguration = this.o00Ooo0o;
        paramConfiguration.OooOo0();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    OooO0oO();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ActionMenuView localActionMenuView = this;
    boolean bool1 = this.o00OooOO;
    if (!bool1)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i = getChildCount();
    int j = (paramInt4 - paramInt2) / 2;
    int k = getDividerWidth();
    int m = paramInt3 - paramInt1;
    int n = getPaddingRight();
    n = m - n;
    int i1 = getPaddingLeft();
    n -= i1;
    boolean bool2 = ViewUtils.OooO0O0(this);
    int i3 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8;
    int i9;
    for (;;)
    {
      i8 = 8;
      i9 = 1;
      if (i3 >= i) {
        break;
      }
      View localView1 = localActionMenuView.getChildAt(i3);
      int i10 = localView1.getVisibility();
      if (i10 != i8)
      {
        ActionMenuView.LayoutParams localLayoutParams1 = (ActionMenuView.LayoutParams)localView1.getLayoutParams();
        boolean bool5 = localLayoutParams1.OooO00o;
        if (bool5)
        {
          i6 = localView1.getMeasuredWidth();
          bool5 = localActionMenuView.OooOO0o(i3);
          if (bool5) {
            i6 += k;
          }
          int i11 = localView1.getMeasuredHeight();
          int i12;
          if (bool2)
          {
            i12 = getPaddingLeft();
            i8 = localLayoutParams1.leftMargin;
            i12 += i8;
            i8 = i12 + i6;
          }
          else
          {
            i12 = getWidth();
            i13 = getPaddingRight();
            i12 -= i13;
            i8 = localLayoutParams1.rightMargin;
            i8 = i12 - i8;
            i12 = i8 - i6;
          }
          int i13 = i11 / 2;
          i14 = j - i13;
          i11 += i14;
          localView1.layout(i12, i14, i8, i11);
          n -= i6;
          i6 = i9;
        }
        else
        {
          i14 = localView1.getMeasuredWidth();
          i9 = localLayoutParams1.leftMargin;
          i14 += i9;
          i8 = localLayoutParams1.rightMargin;
          i14 += i8;
          n -= i14;
          localActionMenuView.OooOO0o(i3);
          i7 += 1;
        }
      }
      i3 += 1;
    }
    int i2;
    if ((i == i9) && (i6 == 0))
    {
      View localView2 = localActionMenuView.getChildAt(0);
      k = localView2.getMeasuredWidth();
      n = localView2.getMeasuredHeight();
      m /= 2;
      i2 = k / 2;
      m -= i2;
      i2 = n / 2;
      j -= i2;
      k += m;
      n += j;
      localView2.layout(m, j, k, n);
      return;
    }
    k = i6 ^ 0x1;
    i7 -= k;
    if (i7 > 0) {
      k = n / i7;
    } else {
      k = 0;
    }
    m = 0;
    View localView3 = null;
    k = Math.max(0, k);
    ActionMenuView.LayoutParams localLayoutParams2;
    int i4;
    if (i2 != 0)
    {
      n = getWidth();
      i2 = getPaddingRight();
      n -= i2;
      i14 = 0;
      while (i14 < i)
      {
        localView3 = localActionMenuView.getChildAt(i14);
        localLayoutParams2 = (ActionMenuView.LayoutParams)localView3.getLayoutParams();
        i3 = localView3.getVisibility();
        if (i3 != i8)
        {
          boolean bool3 = localLayoutParams2.OooO00o;
          if (!bool3)
          {
            i4 = localLayoutParams2.rightMargin;
            n -= i4;
            i4 = localView3.getMeasuredWidth();
            i6 = localView3.getMeasuredHeight();
            i7 = i6 / 2;
            i7 = j - i7;
            i9 = n - i4;
            i6 += i7;
            localView3.layout(i9, i7, n, i6);
            m = localLayoutParams2.leftMargin;
            i4 = i4 + m + k;
            n -= i4;
          }
        }
        i14 += 1;
      }
    }
    n = getPaddingLeft();
    int i14 = 0;
    while (i14 < i)
    {
      localView3 = localActionMenuView.getChildAt(i14);
      localLayoutParams2 = (ActionMenuView.LayoutParams)localView3.getLayoutParams();
      i4 = localView3.getVisibility();
      if (i4 != i8)
      {
        boolean bool4 = localLayoutParams2.OooO00o;
        if (!bool4)
        {
          int i5 = localLayoutParams2.leftMargin;
          n += i5;
          i5 = localView3.getMeasuredWidth();
          i6 = localView3.getMeasuredHeight();
          i7 = i6 / 2;
          i7 = j - i7;
          i9 = n + i5;
          i6 += i7;
          localView3.layout(n, i7, i9, i6);
          m = localLayoutParams2.rightMargin;
          i5 = i5 + m + k;
          n += i5;
        }
      }
      i14 += 1;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = this.o00OooOO;
    int k = View.MeasureSpec.getMode(paramInt1);
    int i1 = 1073741824;
    int i3 = 1;
    MenuBuilder localMenuBuilder;
    if (k == i1)
    {
      k = i3;
    }
    else
    {
      k = 0;
      localMenuBuilder = null;
    }
    this.o00OooOO = k;
    if (i != k) {
      this.o00OooOo = 0;
    }
    int j = View.MeasureSpec.getSize(paramInt1);
    int m = this.o00OooOO;
    if (m != 0)
    {
      localMenuBuilder = this.o00OoOoo;
      if (localMenuBuilder != null)
      {
        int i2 = this.o00OooOo;
        if (j != i2)
        {
          this.o00OooOo = j;
          localMenuBuilder.onItemsChanged(i3);
        }
      }
    }
    j = getChildCount();
    m = this.o00OooOO;
    if ((m != 0) && (j > 0))
    {
      OooOOOO(paramInt1, paramInt2);
    }
    else
    {
      m = 0;
      localMenuBuilder = null;
      while (m < j)
      {
        ActionMenuView.LayoutParams localLayoutParams = (ActionMenuView.LayoutParams)getChildAt(m).getLayoutParams();
        localLayoutParams.rightMargin = 0;
        localLayoutParams.leftMargin = 0;
        int n;
        m += 1;
      }
      super.onMeasure(paramInt1, paramInt2);
    }
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    this.o00Ooo0o.setExpandedActionViewsExclusive(paramBoolean);
  }
  
  public void setOnMenuItemClickListener(ActionMenuView.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.o00Ooooo = paramOnMenuItemClickListener;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    getMenu();
    this.o00Ooo0o.setOverflowIcon(paramDrawable);
  }
  
  public void setOverflowReserved(boolean paramBoolean)
  {
    this.o00Ooo0O = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt)
  {
    int i = this.o00Ooo0;
    if (i != paramInt)
    {
      this.o00Ooo0 = paramInt;
      if (paramInt == 0)
      {
        Context localContext1 = getContext();
        this.o00Ooo00 = localContext1;
      }
      else
      {
        ContextThemeWrapper localContextThemeWrapper = new android/view/ContextThemeWrapper;
        Context localContext2 = getContext();
        localContextThemeWrapper.<init>(localContext2, paramInt);
        this.o00Ooo00 = localContextThemeWrapper;
      }
    }
  }
  
  public void setPresenter(ActionMenuPresenter paramActionMenuPresenter)
  {
    this.o00Ooo0o = paramActionMenuPresenter;
    paramActionMenuPresenter.setMenuView(this);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionMenuView
 * JD-Core Version:    0.7.0.1
 */