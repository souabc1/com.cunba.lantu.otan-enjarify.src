package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager
  extends ViewGroup
{
  public static final Comparator o00oOO;
  public static final Interpolator o00oOOO0;
  public static final ViewPager.ViewPositionComparator o00oOOOO;
  public static final int[] o0ooOO = { 16842931 };
  public int o00OoOoo;
  public final ViewPager.ItemInfo o00Ooo0;
  public final ArrayList o00Ooo00;
  public final Rect o00Ooo0O;
  public PagerAdapter o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  public Parcelable o00OooOO;
  public ClassLoader o00OooOo;
  public boolean o00OoooO;
  public ViewPager.PagerObserver o00Ooooo;
  public ViewPager.OnPageChangeListener o00o;
  public boolean o00o0;
  public float o00o00;
  public Drawable o00o000;
  public int o00o0000;
  public int o00o000O;
  public int o00o000o;
  public int o00o00O0;
  public int o00o00Oo;
  public boolean o00o00o;
  public boolean o00o00o0;
  public boolean o00o00oO;
  public int o00o00oo;
  public int o00o0O0;
  public boolean o00o0O00;
  public int o00o0O0O;
  public float o00o0OO;
  public int o00o0OO0;
  public float o00o0OOO;
  public float o00o0OOo;
  public int o00o0Oo;
  public float o00o0Oo0;
  public VelocityTracker o00o0OoO;
  public int o00o0Ooo;
  public boolean o00o0o;
  public int o00o0o00;
  public int o00o0o0O;
  public int o00o0o0o;
  public EdgeEffect o00o0oO;
  public EdgeEffect o00o0oO0;
  public boolean o00o0oOO;
  public boolean o00o0oOo;
  public int o00o0oo;
  public boolean o00o0oo0;
  public List o00o0ooo;
  public ArrayList o00oO0;
  public List o00oO000;
  public ViewPager.PageTransformer o00oO00O;
  public int o00oO00o;
  public final Runnable o00oO0O0;
  public int o00oOo;
  public ViewPager.OnPageChangeListener o00oo000;
  public Scroller o0O00o0;
  public int o0oOOo;
  public float oo00oO;
  
  static
  {
    Object localObject = new androidx/viewpager/widget/ViewPager$1;
    ((ViewPager.1)localObject).<init>();
    o00oOO = (Comparator)localObject;
    localObject = new androidx/viewpager/widget/ViewPager$2;
    ((ViewPager.2)localObject).<init>();
    o00oOOO0 = (Interpolator)localObject;
    localObject = new androidx/viewpager/widget/ViewPager$ViewPositionComparator;
    ((ViewPager.ViewPositionComparator)localObject).<init>();
    o00oOOOO = (ViewPager.ViewPositionComparator)localObject;
  }
  
  public ViewPager(Context paramContext)
  {
    super(paramContext);
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.o00Ooo00 = paramContext;
    paramContext = new androidx/viewpager/widget/ViewPager$ItemInfo;
    paramContext.<init>();
    this.o00Ooo0 = paramContext;
    paramContext = new android/graphics/Rect;
    paramContext.<init>();
    this.o00Ooo0O = paramContext;
    int i = -1;
    this.o00OooO = i;
    this.o00OooOO = null;
    this.o00OooOo = null;
    this.oo00oO = -3.402824E+038F;
    this.o00o00 = 3.4028235E+38F;
    int j = 1;
    this.o00o00oo = j;
    this.o00o0Oo = i;
    this.o00o0oOO = j;
    this.o00o0oOo = false;
    ViewPager.3 local3 = new androidx/viewpager/widget/ViewPager$3;
    local3.<init>(this);
    this.o00oO0O0 = local3;
    this.o0oOOo = 0;
    OooOo0o();
  }
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.o00Ooo00 = paramContext;
    paramContext = new androidx/viewpager/widget/ViewPager$ItemInfo;
    paramContext.<init>();
    this.o00Ooo0 = paramContext;
    paramContext = new android/graphics/Rect;
    paramContext.<init>();
    this.o00Ooo0O = paramContext;
    int i = -1;
    this.o00OooO = i;
    this.o00OooOO = null;
    this.o00OooOo = null;
    this.oo00oO = -3.402824E+038F;
    this.o00o00 = 3.4028235E+38F;
    int j = 1;
    this.o00o00oo = j;
    this.o00o0Oo = i;
    this.o00o0oOO = j;
    this.o00o0oOo = false;
    paramAttributeSet = new androidx/viewpager/widget/ViewPager$3;
    paramAttributeSet.<init>(this);
    this.o00oO0O0 = paramAttributeSet;
    this.o0oOOo = 0;
    OooOo0o();
  }
  
  public static boolean OooOo(View paramView)
  {
    paramView = paramView.getClass();
    ViewPager.DecorView localDecorView = ViewPager.DecorView.class;
    paramView = paramView.getAnnotation(localDecorView);
    boolean bool;
    if (paramView != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramView = null;
    }
    return bool;
  }
  
  private int getClientWidth()
  {
    int i = getMeasuredWidth();
    int j = getPaddingLeft();
    i -= j;
    j = getPaddingRight();
    return i - j;
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    boolean bool = this.o00o00o;
    if (bool != paramBoolean) {
      this.o00o00o = paramBoolean;
    }
  }
  
  public void OooO()
  {
    Object localObject1 = this.o00Ooo0o;
    int i = ((PagerAdapter)localObject1).getCount();
    this.o00OoOoo = i;
    Object localObject2 = this.o00Ooo00;
    int j = ((ArrayList)localObject2).size();
    int k = this.o00o00oo * 2;
    int m = 1;
    k += m;
    if (j < k)
    {
      localObject2 = this.o00Ooo00;
      j = ((ArrayList)localObject2).size();
      if (j < i)
      {
        j = m;
        break label80;
      }
    }
    j = 0;
    localObject2 = null;
    label80:
    k = this.o00OooO0;
    int n = 0;
    Object localObject3 = null;
    boolean bool = false;
    for (;;)
    {
      Object localObject4 = this.o00Ooo00;
      int i2 = ((ArrayList)localObject4).size();
      if (n >= i2) {
        break;
      }
      localObject4 = (ViewPager.ItemInfo)this.o00Ooo00.get(n);
      PagerAdapter localPagerAdapter = this.o00Ooo0o;
      Object localObject5 = ((ViewPager.ItemInfo)localObject4).OooO00o;
      int i4 = localPagerAdapter.OooO0o0(localObject5);
      int i5 = -1;
      if (i4 != i5)
      {
        i5 = -2;
        if (i4 == i5)
        {
          localObject2 = this.o00Ooo00;
          ((ArrayList)localObject2).remove(n);
          n += -1;
          if (!bool)
          {
            localObject2 = this.o00Ooo0o;
            ((PagerAdapter)localObject2).OooOOOo(this);
            bool = m;
          }
          localObject2 = this.o00Ooo0o;
          i4 = ((ViewPager.ItemInfo)localObject4).OooO0O0;
          localObject5 = ((ViewPager.ItemInfo)localObject4).OooO00o;
          ((PagerAdapter)localObject2).OooO0O0(this, i4, localObject5);
          j = this.o00OooO0;
          int i3 = ((ViewPager.ItemInfo)localObject4).OooO0O0;
          if (j == i3)
          {
            k = i + -1;
            j = Math.min(j, k);
            j = Math.max(0, j);
            k = j;
          }
        }
        for (;;)
        {
          j = m;
          break;
          i5 = ((ViewPager.ItemInfo)localObject4).OooO0O0;
          if (i5 == i4) {
            break;
          }
          j = this.o00OooO0;
          if (i5 == j) {
            k = i4;
          }
          ((ViewPager.ItemInfo)localObject4).OooO0O0 = i4;
        }
      }
      int i1;
      n += m;
    }
    if (bool)
    {
      localObject1 = this.o00Ooo0o;
      ((PagerAdapter)localObject1).OooO0Oo(this);
    }
    localObject1 = this.o00Ooo00;
    localObject3 = o00oOO;
    Collections.sort((List)localObject1, (Comparator)localObject3);
    if (j != 0)
    {
      i = getChildCount();
      j = 0;
      localObject2 = null;
      while (j < i)
      {
        localObject3 = (ViewPager.LayoutParams)getChildAt(j).getLayoutParams();
        bool = ((ViewPager.LayoutParams)localObject3).OooO00o;
        if (!bool)
        {
          bool = false;
          ((ViewPager.LayoutParams)localObject3).OooO0OO = 0.0F;
        }
        j += 1;
      }
      Oooo0oo(k, false, m);
      requestLayout();
    }
  }
  
  public ViewPager.ItemInfo OooO00o(int paramInt1, int paramInt2)
  {
    ViewPager.ItemInfo localItemInfo = new androidx/viewpager/widget/ViewPager$ItemInfo;
    localItemInfo.<init>();
    localItemInfo.OooO0O0 = paramInt1;
    Object localObject = this.o00Ooo0o.OooO0oO(this, paramInt1);
    localItemInfo.OooO00o = localObject;
    localObject = this.o00Ooo0o;
    float f = ((PagerAdapter)localObject).getPageWidth(paramInt1);
    localItemInfo.OooO0Oo = f;
    if (paramInt2 >= 0)
    {
      localArrayList = this.o00Ooo00;
      paramInt1 = localArrayList.size();
      if (paramInt2 < paramInt1)
      {
        localArrayList = this.o00Ooo00;
        localArrayList.add(paramInt2, localItemInfo);
        return localItemInfo;
      }
    }
    ArrayList localArrayList = this.o00Ooo00;
    localArrayList.add(localItemInfo);
    return localItemInfo;
  }
  
  public void OooO0O0(ViewPager.OnAdapterChangeListener paramOnAdapterChangeListener)
  {
    Object localObject = this.o00oO000;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.o00oO000 = ((List)localObject);
    }
    this.o00oO000.add(paramOnAdapterChangeListener);
  }
  
  public void OooO0OO(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    Object localObject = this.o00o0ooo;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.o00o0ooo = ((List)localObject);
    }
    this.o00o0ooo.add(paramOnPageChangeListener);
  }
  
  public boolean OooO0Oo(int paramInt)
  {
    Object localObject1 = findFocus();
    int i = 1;
    int j = 0;
    Rect localRect1 = null;
    View localView = null;
    if (localObject1 == this) {}
    int k;
    for (;;)
    {
      k = 0;
      localObject1 = null;
      break;
      if (localObject1 == null) {
        break;
      }
      boolean bool2;
      for (Object localObject2 = ((View)localObject1).getParent();; localObject2 = ((ViewParent)localObject2).getParent())
      {
        bool2 = localObject2 instanceof ViewGroup;
        if (!bool2) {
          break;
        }
        if (localObject2 == this)
        {
          i1 = i;
          break label84;
        }
      }
      i1 = 0;
      localObject2 = null;
      label84:
      if (i1 != 0) {
        break;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = localObject1.getClass().getSimpleName();
      ((StringBuilder)localObject2).append(str);
      for (localObject1 = ((View)localObject1).getParent();; localObject1 = ((ViewParent)localObject1).getParent())
      {
        bool2 = localObject1 instanceof ViewGroup;
        if (!bool2) {
          break;
        }
        ((StringBuilder)localObject2).append(" => ");
        str = localObject1.getClass().getSimpleName();
        ((StringBuilder)localObject2).append(str);
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str = "arrowScroll tried to find focus based on non-child current focused view ";
      ((StringBuilder)localObject1).append(str);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localView = FocusFinder.getInstance().findNextFocus(this, (View)localObject1, paramInt);
    int i1 = 66;
    int n = 17;
    if ((localView != null) && (localView != localObject1))
    {
      Rect localRect2;
      if (paramInt == n)
      {
        localRect2 = this.o00Ooo0O;
        localRect2 = OooOOo(localRect2, localView);
        i = localRect2.left;
        localRect1 = this.o00Ooo0O;
        localRect1 = OooOOo(localRect1, (View)localObject1);
        j = localRect1.left;
        if ((localObject1 != null) && (i >= j)) {
          k = OooOoo0();
        }
      }
      for (k = localView.requestFocus();; k = OooOoo())
      {
        j = k;
        break label434;
        if (paramInt != i1) {
          break label434;
        }
        localRect2 = this.o00Ooo0O;
        localRect2 = OooOOo(localRect2, localView);
        i = localRect2.left;
        localRect1 = this.o00Ooo0O;
        localRect1 = OooOOo(localRect1, (View)localObject1);
        j = localRect1.left;
        if ((localObject1 == null) || (i > j)) {
          break;
        }
      }
    }
    boolean bool1;
    if ((paramInt != n) && (paramInt != i))
    {
      if (paramInt != i1)
      {
        int m = 2;
        if (paramInt != m) {}
      }
      else
      {
        bool1 = OooOoo();
      }
    }
    else {
      bool1 = OooOoo0();
    }
    label434:
    if (bool1)
    {
      paramInt = SoundEffectConstants.getContantForFocusDirection(paramInt);
      playSoundEffect(paramInt);
    }
    return bool1;
  }
  
  public boolean OooO0o(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = paramView instanceof ViewGroup;
    int j = 1;
    if (bool1)
    {
      Object localObject = paramView;
      localObject = (ViewGroup)paramView;
      int k = paramView.getScrollX();
      int m = paramView.getScrollY();
      int n = ((ViewGroup)localObject).getChildCount() - j;
      while (n >= 0)
      {
        View localView = ((ViewGroup)localObject).getChildAt(n);
        int i1 = paramInt2 + k;
        int i2 = localView.getLeft();
        if (i1 >= i2)
        {
          i2 = localView.getRight();
          if (i1 < i2)
          {
            i2 = paramInt3 + m;
            int i3 = localView.getTop();
            if (i2 >= i3)
            {
              int i4 = localView.getBottom();
              if (i2 < i4)
              {
                int i6 = localView.getLeft();
                i6 = i1 - i6;
                i1 = localView.getTop();
                int i7 = i2 - i1;
                i2 = 1;
                int i5 = paramInt1;
                boolean bool3 = OooO0o(localView, i2, paramInt1, i6, i7);
                if (bool3) {
                  return j;
                }
              }
            }
          }
        }
        n += -1;
      }
    }
    boolean bool2;
    if (paramBoolean)
    {
      int i = paramInt1;
      i = -paramInt1;
      boolean bool4 = paramView.canScrollHorizontally(i);
      if (bool4) {}
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  public final void OooO0o0(ViewPager.ItemInfo paramItemInfo1, int paramInt, ViewPager.ItemInfo paramItemInfo2)
  {
    PagerAdapter localPagerAdapter1 = this.o00Ooo0o;
    int i = localPagerAdapter1.getCount();
    int j = getClientWidth();
    int k;
    float f1;
    if (j > 0)
    {
      k = this.o00o0000;
      f1 = k;
      f2 = j;
      f1 /= f2;
    }
    else
    {
      k = 0;
      f1 = 0.0F;
    }
    j = 0;
    float f2 = 0.0F;
    Object localObject1;
    float f6;
    Object localObject3;
    if (paramItemInfo2 != null)
    {
      int m = paramItemInfo2.OooO0O0;
      n = paramItemInfo1.OooO0O0;
      float f4;
      Object localObject2;
      if (m < n)
      {
        f3 = paramItemInfo2.OooO0o0;
        f4 = paramItemInfo2.OooO0Oo;
        f3 = f3 + f4 + f1;
        m += 1;
        i1 = 0;
        paramItemInfo2 = null;
        f4 = 0.0F;
        for (;;)
        {
          i2 = paramItemInfo1.OooO0O0;
          if (m > i2) {
            break;
          }
          localObject1 = this.o00Ooo00;
          i2 = ((ArrayList)localObject1).size();
          if (i1 >= i2) {
            break;
          }
          for (;;)
          {
            localObject1 = (ViewPager.ItemInfo)this.o00Ooo00.get(i1);
            i3 = ((ViewPager.ItemInfo)localObject1).OooO0O0;
            if (m <= i3) {
              break;
            }
            localObject2 = this.o00Ooo00;
            i3 = ((ArrayList)localObject2).size() + -1;
            if (i1 >= i3) {
              break;
            }
            i1 += 1;
          }
          for (;;)
          {
            i3 = ((ViewPager.ItemInfo)localObject1).OooO0O0;
            if (m >= i3) {
              break;
            }
            localObject2 = this.o00Ooo0o;
            f5 = ((PagerAdapter)localObject2).getPageWidth(m) + f1;
            f3 += f5;
            m += 1;
          }
          ((ViewPager.ItemInfo)localObject1).OooO0o0 = f3;
          f6 = ((ViewPager.ItemInfo)localObject1).OooO0Oo + f1;
          f3 += f6;
          m += 1;
        }
      }
      if (m > n)
      {
        localObject3 = this.o00Ooo00;
        n = ((ArrayList)localObject3).size() + -1;
        f4 = paramItemInfo2.OooO0o0;
        m += -1;
        for (;;)
        {
          i2 = paramItemInfo1.OooO0O0;
          if ((m < i2) || (n < 0)) {
            break;
          }
          for (;;)
          {
            localObject1 = (ViewPager.ItemInfo)this.o00Ooo00.get(n);
            i3 = ((ViewPager.ItemInfo)localObject1).OooO0O0;
            if ((m >= i3) || (n <= 0)) {
              break;
            }
            n += -1;
          }
          for (;;)
          {
            i3 = ((ViewPager.ItemInfo)localObject1).OooO0O0;
            if (m <= i3) {
              break;
            }
            localObject2 = this.o00Ooo0o;
            f5 = ((PagerAdapter)localObject2).getPageWidth(m) + f1;
            f4 -= f5;
            m += -1;
          }
          f5 = ((ViewPager.ItemInfo)localObject1).OooO0Oo + f1;
          f4 -= f5;
          ((ViewPager.ItemInfo)localObject1).OooO0o0 = f4;
          m += -1;
        }
      }
    }
    paramItemInfo2 = this.o00Ooo00;
    int i1 = paramItemInfo2.size();
    float f7 = paramItemInfo1.OooO0o0;
    int n = paramItemInfo1.OooO0O0;
    int i2 = n + -1;
    if (n == 0)
    {
      f5 = f7;
    }
    else
    {
      i3 = -8388609;
      f5 = -3.402824E+038F;
    }
    this.oo00oO = f5;
    i += -1;
    int i3 = 1065353216;
    float f5 = 1.0F;
    if (n == i)
    {
      f3 = paramItemInfo1.OooO0Oo + f7 - f5;
    }
    else
    {
      n = 2139095039;
      f3 = 3.4028235E+38F;
    }
    this.o00o00 = f3;
    n = paramInt + -1;
    while (n >= 0)
    {
      ViewPager.ItemInfo localItemInfo = (ViewPager.ItemInfo)this.o00Ooo00.get(n);
      int i4;
      for (;;)
      {
        i4 = localItemInfo.OooO0O0;
        if (i2 <= i4) {
          break;
        }
        PagerAdapter localPagerAdapter2 = this.o00Ooo0o;
        int i5 = i2 + -1;
        f6 = localPagerAdapter2.getPageWidth(i2) + f1;
        f7 -= f6;
        i2 = i5;
      }
      float f8 = localItemInfo.OooO0Oo + f1;
      f7 -= f8;
      localItemInfo.OooO0o0 = f7;
      if (i4 == 0) {
        this.oo00oO = f7;
      }
      n += -1;
      i2 += -1;
    }
    f7 = paramItemInfo1.OooO0o0;
    float f3 = paramItemInfo1.OooO0Oo;
    f7 = f7 + f3 + f1;
    int i6 = paramItemInfo1.OooO0O0 + 1;
    paramInt += 1;
    while (paramInt < i1)
    {
      localObject3 = (ViewPager.ItemInfo)this.o00Ooo00.get(paramInt);
      for (;;)
      {
        i2 = ((ViewPager.ItemInfo)localObject3).OooO0O0;
        if (i6 >= i2) {
          break;
        }
        localObject1 = this.o00Ooo0o;
        int i7 = i6 + 1;
        float f9 = ((PagerAdapter)localObject1).getPageWidth(i6) + f1;
        f7 += f9;
        i6 = i7;
      }
      if (i2 == i)
      {
        f6 = ((ViewPager.ItemInfo)localObject3).OooO0Oo + f7 - f5;
        this.o00o00 = f6;
      }
      ((ViewPager.ItemInfo)localObject3).OooO0o0 = f7;
      f3 = ((ViewPager.ItemInfo)localObject3).OooO0Oo + f1;
      f7 += f3;
      paramInt += 1;
      i6 += 1;
    }
    this.o00o0oOo = false;
  }
  
  public void OooO0oO()
  {
    List localList = this.o00o0ooo;
    if (localList != null) {
      localList.clear();
    }
  }
  
  public final void OooO0oo(boolean paramBoolean)
  {
    int i = this.o0oOOo;
    int j = 2;
    int m = 1;
    if (i == j) {
      i = m;
    } else {
      i = 0;
    }
    int n;
    if (i != 0)
    {
      setScrollingCacheEnabled(false);
      localScroller1 = this.o0O00o0;
      boolean bool1 = localScroller1.isFinished() ^ m;
      if (bool1)
      {
        localScroller1 = this.o0O00o0;
        localScroller1.abortAnimation();
        k = getScrollX();
        n = getScrollY();
        Scroller localScroller2 = this.o0O00o0;
        int i1 = localScroller2.getCurrX();
        Scroller localScroller3 = this.o0O00o0;
        int i2 = localScroller3.getCurrY();
        if ((k != i1) || (n != i2))
        {
          scrollTo(i1, i2);
          if (i1 != k) {
            OooOooO(i1);
          }
        }
      }
    }
    this.o00o00oO = false;
    int k = 0;
    Scroller localScroller1 = null;
    for (;;)
    {
      Object localObject = this.o00Ooo00;
      n = ((ArrayList)localObject).size();
      if (k >= n) {
        break;
      }
      localObject = (ViewPager.ItemInfo)this.o00Ooo00.get(k);
      boolean bool2 = ((ViewPager.ItemInfo)localObject).OooO0OO;
      if (bool2)
      {
        ((ViewPager.ItemInfo)localObject).OooO0OO = false;
        i = m;
      }
      k += 1;
    }
    if (i != 0)
    {
      Runnable localRunnable;
      if (paramBoolean)
      {
        localRunnable = this.o00oO0O0;
        ViewCompat.o0OoOo0(this, localRunnable);
      }
      else
      {
        localRunnable = this.o00oO0O0;
        localRunnable.run();
      }
    }
  }
  
  public final int OooOO0(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    paramInt3 = Math.abs(paramInt3);
    int i = this.o00o0o0O;
    if (paramInt3 > i)
    {
      paramInt3 = Math.abs(paramInt2);
      i = this.o00o0Ooo;
      if (paramInt3 > i)
      {
        if (paramInt2 > 0) {
          break label98;
        }
        paramInt1 += 1;
        break label98;
      }
    }
    paramInt2 = this.o00OooO0;
    float f;
    if (paramInt1 >= paramInt2)
    {
      paramInt2 = 1053609165;
      f = 0.4F;
    }
    else
    {
      paramInt2 = 1058642330;
      f = 0.6F;
    }
    paramFloat += f;
    int j = (int)paramFloat;
    paramInt1 += j;
    label98:
    Object localObject1 = this.o00Ooo00;
    j = ((ArrayList)localObject1).size();
    if (j > 0)
    {
      localObject1 = this.o00Ooo00;
      f = 0.0F;
      localObject1 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(0);
      Object localObject2 = this.o00Ooo00;
      paramInt3 = ((ArrayList)localObject2).size() + -1;
      localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject2).get(paramInt3);
      j = ((ViewPager.ItemInfo)localObject1).OooO0O0;
      paramInt2 = ((ViewPager.ItemInfo)localObject2).OooO0O0;
      paramInt1 = Math.min(paramInt1, paramInt2);
      paramInt1 = Math.max(j, paramInt1);
    }
    return paramInt1;
  }
  
  public final void OooOO0O(int paramInt1, float paramFloat, int paramInt2)
  {
    Object localObject = this.o00o;
    if (localObject != null) {
      ((ViewPager.OnPageChangeListener)localObject).onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
    localObject = this.o00o0ooo;
    if (localObject != null)
    {
      int i = ((List)localObject).size();
      int j = 0;
      while (j < i)
      {
        ViewPager.OnPageChangeListener localOnPageChangeListener = (ViewPager.OnPageChangeListener)this.o00o0ooo.get(j);
        if (localOnPageChangeListener != null) {
          localOnPageChangeListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
        }
        j += 1;
      }
    }
    localObject = this.o00oo000;
    if (localObject != null) {
      ((ViewPager.OnPageChangeListener)localObject).onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
  }
  
  public final void OooOO0o(int paramInt)
  {
    Object localObject = this.o00o;
    if (localObject != null) {
      ((ViewPager.OnPageChangeListener)localObject).onPageSelected(paramInt);
    }
    localObject = this.o00o0ooo;
    if (localObject != null)
    {
      int i = ((List)localObject).size();
      int j = 0;
      while (j < i)
      {
        ViewPager.OnPageChangeListener localOnPageChangeListener = (ViewPager.OnPageChangeListener)this.o00o0ooo.get(j);
        if (localOnPageChangeListener != null) {
          localOnPageChangeListener.onPageSelected(paramInt);
        }
        j += 1;
      }
    }
    localObject = this.o00oo000;
    if (localObject != null) {
      ((ViewPager.OnPageChangeListener)localObject).onPageSelected(paramInt);
    }
  }
  
  public float OooOOO(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.4712389F);
  }
  
  public final void OooOOO0(int paramInt)
  {
    Object localObject = this.o00o;
    if (localObject != null) {
      ((ViewPager.OnPageChangeListener)localObject).onPageScrollStateChanged(paramInt);
    }
    localObject = this.o00o0ooo;
    if (localObject != null)
    {
      int i = ((List)localObject).size();
      int j = 0;
      while (j < i)
      {
        ViewPager.OnPageChangeListener localOnPageChangeListener = (ViewPager.OnPageChangeListener)this.o00o0ooo.get(j);
        if (localOnPageChangeListener != null) {
          localOnPageChangeListener.onPageScrollStateChanged(paramInt);
        }
        j += 1;
      }
    }
    localObject = this.o00oo000;
    if (localObject != null) {
      ((ViewPager.OnPageChangeListener)localObject).onPageScrollStateChanged(paramInt);
    }
  }
  
  public final void OooOOOO(boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      int k;
      if (paramBoolean) {
        k = this.o00oO00o;
      } else {
        k = 0;
      }
      View localView = getChildAt(j);
      localView.setLayerType(k, null);
      j += 1;
    }
  }
  
  public final void OooOOOo()
  {
    this.o00o0 = false;
    this.o00o0O00 = false;
    VelocityTracker localVelocityTracker = this.o00o0OoO;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      localVelocityTracker = null;
      this.o00o0OoO = null;
    }
  }
  
  public final Rect OooOOo(Rect paramRect, View paramView)
  {
    if (paramRect == null)
    {
      paramRect = new android/graphics/Rect;
      paramRect.<init>();
    }
    if (paramView == null)
    {
      paramRect.set(0, 0, 0, 0);
      return paramRect;
    }
    int i = paramView.getLeft();
    paramRect.left = i;
    i = paramView.getRight();
    paramRect.right = i;
    i = paramView.getTop();
    paramRect.top = i;
    i = paramView.getBottom();
    for (;;)
    {
      paramRect.bottom = i;
      paramView = paramView.getParent();
      boolean bool = paramView instanceof ViewGroup;
      if ((!bool) || (paramView == this)) {
        break;
      }
      paramView = (ViewGroup)paramView;
      int j = paramRect.left;
      int k = paramView.getLeft();
      j += k;
      paramRect.left = j;
      j = paramRect.right;
      k = paramView.getRight();
      j += k;
      paramRect.right = j;
      j = paramRect.top;
      k = paramView.getTop();
      j += k;
      paramRect.top = j;
      j = paramRect.bottom;
      k = paramView.getBottom();
      j += k;
    }
    return paramRect;
  }
  
  public boolean OooOOo0(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getAction();
    if (i == 0)
    {
      i = paramKeyEvent.getKeyCode();
      int k = 21;
      int m = 2;
      int i1;
      if (i != k)
      {
        k = 22;
        if (i != k)
        {
          k = 61;
          if (i != k) {
            break label154;
          }
          int j = paramKeyEvent.hasNoModifiers();
          if (j != 0)
          {
            bool1 = OooO0Oo(m);
            break label159;
          }
          j = 1;
          bool1 = paramKeyEvent.hasModifiers(j);
          if (!bool1) {
            break label154;
          }
          bool1 = OooO0Oo(j);
          break label159;
        }
        boolean bool1 = paramKeyEvent.hasModifiers(m);
        if (bool1)
        {
          bool1 = OooOoo();
          break label159;
        }
        int n = 66;
      }
      else
      {
        boolean bool2 = paramKeyEvent.hasModifiers(m);
        if (bool2)
        {
          bool2 = OooOoo0();
          break label159;
        }
        i1 = 17;
      }
      bool3 = OooO0Oo(i1);
      break label159;
    }
    label154:
    boolean bool3 = false;
    paramKeyEvent = null;
    label159:
    return bool3;
  }
  
  public ViewPager.ItemInfo OooOOoo(View paramView)
  {
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break label38;
      }
      if (localViewParent == null) {
        break;
      }
      boolean bool = localViewParent instanceof View;
      if (!bool) {
        break;
      }
      paramView = localViewParent;
      paramView = (View)localViewParent;
    }
    return null;
    label38:
    return OooOo00(paramView);
  }
  
  public final ViewPager.ItemInfo OooOo0()
  {
    int i = getClientWidth();
    float f1 = 0.0F;
    PagerAdapter localPagerAdapter = null;
    int j;
    float f2;
    float f3;
    if (i > 0)
    {
      j = getScrollX();
      f2 = j;
      f3 = i;
      f2 /= f3;
    }
    else
    {
      j = 0;
      f2 = 0.0F;
    }
    int k;
    if (i > 0)
    {
      k = this.o00o0000;
      f3 = k;
      f4 = i;
      f3 /= f4;
    }
    else
    {
      k = 0;
      f3 = 0.0F;
    }
    i = 0;
    float f4 = 0.0F;
    int m = 1;
    Object localObject1 = null;
    int n = 0;
    int i1 = m;
    Object localObject2 = null;
    float f5 = 0.0F;
    int i2 = -1;
    boolean bool2 = false;
    ArrayList localArrayList = null;
    float f6 = 0.0F;
    for (;;)
    {
      Object localObject3 = this.o00Ooo00;
      int i4 = ((ArrayList)localObject3).size();
      if (n >= i4) {
        break label349;
      }
      localObject3 = (ViewPager.ItemInfo)this.o00Ooo00.get(n);
      if (i1 == 0)
      {
        int i5 = ((ViewPager.ItemInfo)localObject3).OooO0O0;
        i2 += m;
        if (i5 != i2)
        {
          localObject3 = this.o00Ooo0;
          f1 = f1 + f6 + f3;
          ((ViewPager.ItemInfo)localObject3).OooO0o0 = f1;
          ((ViewPager.ItemInfo)localObject3).OooO0O0 = i2;
          localPagerAdapter = this.o00Ooo0o;
          f1 = localPagerAdapter.getPageWidth(i2);
          ((ViewPager.ItemInfo)localObject3).OooO0Oo = f1;
          n += -1;
        }
      }
      localObject1 = localObject3;
      f1 = ((ViewPager.ItemInfo)localObject3).OooO0o0;
      f6 = ((ViewPager.ItemInfo)localObject3).OooO0Oo + f1 + f3;
      if (i1 == 0)
      {
        bool1 = f2 < f1;
        if (bool1) {
          return localObject2;
        }
      }
      bool2 = f2 < f6;
      if (bool2) {
        break;
      }
      localArrayList = this.o00Ooo00;
      int i3 = localArrayList.size() - m;
      if (n == i3) {
        break;
      }
      i3 = localObject1.OooO0O0;
      f5 = localObject1.OooO0Oo;
      n += 1;
      boolean bool1 = false;
      i2 = i3;
      f6 = f5;
      localObject2 = localObject1;
    }
    return localObject1;
    label349:
    return localObject2;
  }
  
  public ViewPager.ItemInfo OooOo00(View paramView)
  {
    int i = 0;
    for (;;)
    {
      Object localObject1 = this.o00Ooo00;
      int j = ((ArrayList)localObject1).size();
      if (i >= j) {
        break;
      }
      localObject1 = (ViewPager.ItemInfo)this.o00Ooo00.get(i);
      PagerAdapter localPagerAdapter = this.o00Ooo0o;
      Object localObject2 = ((ViewPager.ItemInfo)localObject1).OooO00o;
      boolean bool = localPagerAdapter.OooO0oo(paramView, localObject2);
      if (bool) {
        return localObject1;
      }
      i += 1;
    }
    return null;
  }
  
  public ViewPager.ItemInfo OooOo0O(int paramInt)
  {
    int i = 0;
    for (;;)
    {
      Object localObject = this.o00Ooo00;
      int j = ((ArrayList)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (ViewPager.ItemInfo)this.o00Ooo00.get(i);
      int k = ((ViewPager.ItemInfo)localObject).OooO0O0;
      if (k == paramInt) {
        return localObject;
      }
      i += 1;
    }
    return null;
  }
  
  public void OooOo0o()
  {
    ViewPager.4 local4 = null;
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    int i = 1;
    setFocusable(i);
    Object localObject1 = getContext();
    Object localObject2 = new android/widget/Scroller;
    Object localObject3 = o00oOOO0;
    ((Scroller)localObject2).<init>((Context)localObject1, (Interpolator)localObject3);
    this.o0O00o0 = ((Scroller)localObject2);
    localObject2 = ViewConfiguration.get((Context)localObject1);
    localObject3 = ((Context)localObject1).getResources().getDisplayMetrics();
    float f1 = ((DisplayMetrics)localObject3).density;
    int j = ((ViewConfiguration)localObject2).getScaledPagingTouchSlop();
    this.o00o0OO0 = j;
    float f2 = 400.0F * f1;
    j = (int)f2;
    this.o00o0Ooo = j;
    int k = ((ViewConfiguration)localObject2).getScaledMaximumFlingVelocity();
    this.o00o0o00 = k;
    localObject2 = new android/widget/EdgeEffect;
    ((EdgeEffect)localObject2).<init>((Context)localObject1);
    this.o00o0oO0 = ((EdgeEffect)localObject2);
    localObject2 = new android/widget/EdgeEffect;
    ((EdgeEffect)localObject2).<init>((Context)localObject1);
    this.o00o0oO = ((EdgeEffect)localObject2);
    int m = (int)(25.0F * f1);
    this.o00o0o0O = m;
    m = (int)(2.0F * f1);
    this.o00o0o0o = m;
    float f3 = 16.0F;
    f1 *= f3;
    m = (int)f1;
    this.o00o0O0 = m;
    localObject1 = new androidx/viewpager/widget/ViewPager$MyAccessibilityDelegate;
    ((ViewPager.MyAccessibilityDelegate)localObject1).<init>(this);
    ViewCompat.o00oO0o(this, (AccessibilityDelegateCompat)localObject1);
    m = ViewCompat.OooOoO0(this);
    if (m == 0) {
      ViewCompat.o000000(this, i);
    }
    local4 = new androidx/viewpager/widget/ViewPager$4;
    local4.<init>(this);
    ViewCompat.o00000O0(this, local4);
  }
  
  public void OooOoO(int paramInt1, float paramFloat, int paramInt2)
  {
    int i = this.o00o0oo;
    int k = 0;
    int m = 1;
    int n;
    if (i > 0)
    {
      i = getScrollX();
      n = getPaddingLeft();
      int i1 = getPaddingRight();
      int i2 = getWidth();
      int i3 = getChildCount();
      int i4 = 0;
      while (i4 < i3)
      {
        View localView1 = getChildAt(i4);
        ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
        boolean bool2 = localLayoutParams1.OooO00o;
        if (bool2)
        {
          int i6 = localLayoutParams1.OooO0O0 & 0x7;
          if (i6 != m)
          {
            i5 = 3;
            if (i6 != i5)
            {
              i5 = 5;
              if (i6 != i5)
              {
                i6 = n;
                break label218;
              }
              i6 = i2 - i1;
              i5 = localView1.getMeasuredWidth();
              i6 -= i5;
              i5 = localView1.getMeasuredWidth();
              i1 += i5;
            }
            else
            {
              i6 = localView1.getWidth() + n;
              break label218;
            }
          }
          else
          {
            i6 = localView1.getMeasuredWidth();
            i6 = Math.max((i2 - i6) / 2, n);
          }
          int i7 = i6;
          i6 = n;
          n = i7;
          label218:
          n += i;
          int i5 = localView1.getLeft();
          n -= i5;
          if (n != 0) {
            localView1.offsetLeftAndRight(n);
          }
          n = i6;
        }
        i4 += 1;
      }
    }
    OooOO0O(paramInt1, paramFloat, paramInt2);
    ViewPager.PageTransformer localPageTransformer1 = this.o00oO00O;
    if (localPageTransformer1 != null)
    {
      paramInt1 = getScrollX();
      int i8 = getChildCount();
      while (k < i8)
      {
        View localView2 = getChildAt(k);
        ViewPager.LayoutParams localLayoutParams2 = (ViewPager.LayoutParams)localView2.getLayoutParams();
        boolean bool1 = localLayoutParams2.OooO00o;
        if (!bool1)
        {
          int j = localView2.getLeft() - paramInt1;
          float f1 = j;
          n = getClientWidth();
          float f2 = n;
          f1 /= f2;
          ViewPager.PageTransformer localPageTransformer2 = this.o00oO00O;
          localPageTransformer2.OooO00o(localView2, f1);
        }
        k += 1;
      }
    }
    this.o00o0oo0 = m;
  }
  
  public final boolean OooOoO0(float paramFloat1, float paramFloat2)
  {
    float f = this.o00o0O0O;
    boolean bool1 = paramFloat1 < f;
    if (bool1)
    {
      bool1 = paramFloat2 < 0.0F;
      if (bool1) {}
    }
    else
    {
      int i = getWidth();
      int j = this.o00o0O0O;
      i -= j;
      f = i;
      bool2 = paramFloat1 < f;
      if (!bool2) {
        break label78;
      }
      bool2 = paramFloat2 < 0.0F;
      if (!bool2) {
        break label78;
      }
    }
    boolean bool2 = true;
    paramFloat1 = 1.4E-45F;
    break label83;
    label78:
    bool2 = false;
    paramFloat1 = 0.0F;
    label83:
    return bool2;
  }
  
  public final void OooOoOO(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    int j = paramMotionEvent.getPointerId(i);
    int k = this.o00o0Oo;
    if (j == k)
    {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      float f = paramMotionEvent.getX(i);
      this.o00o0OO = f;
      int m = paramMotionEvent.getPointerId(i);
      this.o00o0Oo = m;
      paramMotionEvent = this.o00o0OoO;
      if (paramMotionEvent != null) {
        paramMotionEvent.clear();
      }
    }
  }
  
  public boolean OooOoo()
  {
    PagerAdapter localPagerAdapter = this.o00Ooo0o;
    if (localPagerAdapter != null)
    {
      int i = this.o00OooO0;
      int j = localPagerAdapter.getCount();
      int k = 1;
      j -= k;
      if (i < j)
      {
        j = this.o00OooO0 + k;
        setCurrentItem(j, k);
        return k;
      }
    }
    return false;
  }
  
  public boolean OooOoo0()
  {
    int i = this.o00OooO0;
    if (i > 0)
    {
      int j = 1;
      i -= j;
      setCurrentItem(i, j);
      return j;
    }
    return false;
  }
  
  public final boolean OooOooO(int paramInt)
  {
    Object localObject = this.o00Ooo00;
    int i = ((ArrayList)localObject).size();
    String str = "onPageScrolled did not call superclass implementation";
    if (i == 0)
    {
      paramInt = this.o00o0oOO;
      if (paramInt != 0) {
        return false;
      }
      this.o00o0oo0 = false;
      f1 = 0.0F;
      localIllegalStateException = null;
      OooOoO(0, 0.0F, 0);
      paramInt = this.o00o0oo0;
      if (paramInt != 0) {
        return false;
      }
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(str);
      throw localIllegalStateException;
    }
    localObject = OooOo0();
    int j = getClientWidth();
    int k = this.o00o0000;
    int m = j + k;
    float f2 = k;
    float f3 = j;
    f2 /= f3;
    int n = ((ViewPager.ItemInfo)localObject).OooO0O0;
    float f1 = paramInt / f3;
    f3 = ((ViewPager.ItemInfo)localObject).OooO0o0;
    f1 -= f3;
    float f4 = ((ViewPager.ItemInfo)localObject).OooO0Oo + f2;
    f1 /= f4;
    f4 = m * f1;
    i = (int)f4;
    this.o00o0oo0 = false;
    OooOoO(n, f1, i);
    paramInt = this.o00o0oo0;
    if (paramInt != 0) {
      return true;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>(str);
    throw localIllegalStateException;
  }
  
  public final boolean OooOooo(float paramFloat)
  {
    float f1 = this.o00o0OO - paramFloat;
    this.o00o0OO = paramFloat;
    int i = getScrollX();
    paramFloat = i + f1;
    int j = getClientWidth();
    f1 = j;
    float f2 = this.oo00oO * f1;
    float f3 = this.o00o00 * f1;
    Object localObject1 = this.o00Ooo00;
    boolean bool1 = false;
    localObject1 = (ViewPager.ItemInfo)((ArrayList)localObject1).get(0);
    Object localObject2 = this.o00Ooo00;
    int k = ((ArrayList)localObject2).size();
    int m = 1;
    k -= m;
    localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject2).get(k);
    k = ((ViewPager.ItemInfo)localObject1).OooO0O0;
    int n;
    if (k != 0)
    {
      f2 = ((ViewPager.ItemInfo)localObject1).OooO0o0 * f1;
      n = 0;
      localObject1 = null;
    }
    else
    {
      n = m;
    }
    k = ((ViewPager.ItemInfo)localObject2).OooO0O0;
    PagerAdapter localPagerAdapter = this.o00Ooo0o;
    int i1 = localPagerAdapter.getCount() - m;
    int i2;
    if (k != i1)
    {
      f3 = ((ViewPager.ItemInfo)localObject2).OooO0o0 * f1;
      i2 = 0;
      localObject2 = null;
    }
    else
    {
      i2 = m;
    }
    boolean bool2 = paramFloat < f2;
    if (bool2)
    {
      if (n != 0)
      {
        paramFloat = f2 - paramFloat;
        EdgeEffect localEdgeEffect1 = this.o00o0oO0;
        paramFloat = Math.abs(paramFloat) / f1;
        localEdgeEffect1.onPull(paramFloat);
        bool1 = m;
      }
      paramFloat = f2;
    }
    else
    {
      boolean bool3 = paramFloat < f3;
      if (bool3)
      {
        if (i2 != 0)
        {
          paramFloat -= f3;
          EdgeEffect localEdgeEffect2 = this.o00o0oO;
          paramFloat = Math.abs(paramFloat) / f1;
          localEdgeEffect2.onPull(paramFloat);
          bool1 = m;
        }
        paramFloat = f3;
      }
    }
    f1 = this.o00o0OO;
    int i3 = (int)paramFloat;
    f3 = i3;
    paramFloat -= f3;
    f1 += paramFloat;
    this.o00o0OO = f1;
    i = getScrollY();
    scrollTo(i3, i);
    OooOooO(i3);
    return bool1;
  }
  
  public void Oooo(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    PagerAdapter localPagerAdapter1 = this.o00Ooo0o;
    boolean bool = false;
    if (localPagerAdapter1 != null)
    {
      int i = localPagerAdapter1.getCount();
      if (i > 0)
      {
        if (!paramBoolean2)
        {
          paramBoolean2 = this.o00OooO0;
          if (paramBoolean2 == paramInt1)
          {
            ArrayList localArrayList = this.o00Ooo00;
            paramBoolean2 = localArrayList.size();
            if (paramBoolean2)
            {
              setScrollingCacheEnabled(false);
              return;
            }
          }
        }
        paramBoolean2 = true;
        PagerAdapter localPagerAdapter2;
        if (paramInt1 < 0)
        {
          paramInt1 = 0;
          localPagerAdapter2 = null;
        }
        else
        {
          localPagerAdapter1 = this.o00Ooo0o;
          i = localPagerAdapter1.getCount();
          if (paramInt1 >= i)
          {
            localPagerAdapter2 = this.o00Ooo0o;
            paramInt1 = localPagerAdapter2.getCount() - paramBoolean2;
          }
        }
        i = this.o00o00oo;
        int j = this.o00OooO0;
        int k = j + i;
        if (paramInt1 <= k)
        {
          j -= i;
          if (paramInt1 >= j) {}
        }
        else
        {
          i = 0;
          localPagerAdapter1 = null;
          for (;;)
          {
            Object localObject = this.o00Ooo00;
            j = ((ArrayList)localObject).size();
            if (i >= j) {
              break;
            }
            localObject = (ViewPager.ItemInfo)this.o00Ooo00.get(i);
            ((ViewPager.ItemInfo)localObject).OooO0OO = paramBoolean2;
            i += 1;
          }
        }
        i = this.o00OooO0;
        if (i != paramInt1) {
          bool = paramBoolean2;
        }
        paramBoolean2 = this.o00o0oOO;
        if (paramBoolean2)
        {
          this.o00OooO0 = paramInt1;
          if (bool) {
            OooOO0o(paramInt1);
          }
          requestLayout();
        }
        else
        {
          Oooo00O(paramInt1);
          Oooo0oO(paramInt1, paramBoolean1, paramInt2, bool);
        }
        return;
      }
    }
    setScrollingCacheEnabled(false);
  }
  
  public final void Oooo0()
  {
    int i = 0;
    for (;;)
    {
      int j = getChildCount();
      if (i >= j) {
        break;
      }
      ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)getChildAt(i).getLayoutParams();
      boolean bool = localLayoutParams.OooO00o;
      if (!bool)
      {
        removeViewAt(i);
        i += -1;
      }
      i += 1;
    }
  }
  
  public void Oooo000()
  {
    int i = this.o00OooO0;
    Oooo00O(i);
  }
  
  public void Oooo00O(int paramInt)
  {
    ViewPager localViewPager = this;
    int i = paramInt;
    int n = this.o00OooO0;
    if (n != paramInt)
    {
      localObject1 = OooOo0O(n);
      this.o00OooO0 = paramInt;
    }
    else
    {
      n = 0;
      localObject1 = null;
    }
    Object localObject2 = localViewPager.o00Ooo0o;
    if (localObject2 == null)
    {
      OoooOO0();
      return;
    }
    boolean bool1 = localViewPager.o00o00oO;
    if (bool1)
    {
      OoooOO0();
      return;
    }
    localObject2 = getWindowToken();
    if (localObject2 == null) {
      return;
    }
    localObject2 = localViewPager.o00Ooo0o;
    ((PagerAdapter)localObject2).OooOOOo(localViewPager);
    int j = localViewPager.o00o00oo;
    int i1 = localViewPager.o00OooO0 - j;
    int i2 = 0;
    float f1 = 0.0F;
    Object localObject3 = null;
    i1 = Math.max(0, i1);
    PagerAdapter localPagerAdapter1 = localViewPager.o00Ooo0o;
    int i6 = localPagerAdapter1.getCount();
    int i7 = i6 + -1;
    int i8 = localViewPager.o00OooO0 + j;
    j = Math.min(i7, i8);
    i7 = localViewPager.o00OoOoo;
    if (i6 == i7)
    {
      i7 = 0;
      int i10;
      for (;;)
      {
        localObject4 = localViewPager.o00Ooo00;
        i8 = ((ArrayList)localObject4).size();
        if (i7 >= i8) {
          break;
        }
        localObject4 = (ViewPager.ItemInfo)localViewPager.o00Ooo00.get(i7);
        i9 = ((ViewPager.ItemInfo)localObject4).OooO0O0;
        i10 = localViewPager.o00OooO0;
        if (i9 >= i10)
        {
          if (i9 != i10) {
            break;
          }
          break label252;
        }
        i7 += 1;
      }
      i8 = 0;
      Object localObject4 = null;
      label252:
      if ((localObject4 == null) && (i6 > 0))
      {
        i8 = localViewPager.o00OooO0;
        localObject4 = localViewPager.OooO00o(i8, i7);
      }
      int i9 = 0;
      float f6;
      int i16;
      if (localObject4 != null)
      {
        i10 = i7 + -1;
        Object localObject5;
        int i11;
        float f2;
        if (i10 >= 0)
        {
          localObject5 = (ViewPager.ItemInfo)localViewPager.o00Ooo00.get(i10);
        }
        else
        {
          i11 = 0;
          f2 = 0.0F;
          localObject5 = null;
        }
        int i12 = getClientWidth();
        float f3 = 2.0F;
        float f4;
        if (i12 <= 0)
        {
          f4 = 0.0F;
        }
        else
        {
          f4 = ((ViewPager.ItemInfo)localObject4).OooO0Oo;
          f4 = f3 - f4;
          i15 = getPaddingLeft();
          f5 = i15;
          f6 = i12;
          f5 /= f6;
          f4 += f5;
        }
        i16 = localViewPager.o00OooO0 + -1;
        int i15 = 0;
        float f5 = 0.0F;
        while (i16 >= 0)
        {
          boolean bool8 = f5 < f4;
          if ((!bool8) && (i16 < i1))
          {
            if (localObject5 == null) {
              break;
            }
            i2 = ((ViewPager.ItemInfo)localObject5).OooO0O0;
            if (i16 != i2) {
              break label632;
            }
            boolean bool4 = ((ViewPager.ItemInfo)localObject5).OooO0OO;
            if (bool4) {
              break label632;
            }
            localViewPager.o00Ooo00.remove(i10);
            localObject3 = localViewPager.o00Ooo0o;
            localObject5 = ((ViewPager.ItemInfo)localObject5).OooO00o;
            ((PagerAdapter)localObject3).OooO0O0(localViewPager, i16, localObject5);
            i10 += -1;
            i7 += -1;
            if (i10 < 0) {
              break label619;
            }
          }
          else
          {
            if (localObject5 != null)
            {
              i3 = ((ViewPager.ItemInfo)localObject5).OooO0O0;
              if (i16 == i3)
              {
                f1 = ((ViewPager.ItemInfo)localObject5).OooO0Oo;
                f5 += f1;
                i10 += -1;
                if (i10 < 0) {
                  break label619;
                }
                break label602;
              }
            }
            i3 = i10 + 1;
            localObject3 = localViewPager.OooO00o(i16, i3);
            f1 = ((ViewPager.ItemInfo)localObject3).OooO0Oo;
            f5 += f1;
            i7 += 1;
            if (i10 < 0) {
              break label619;
            }
          }
          label602:
          localObject3 = (ViewPager.ItemInfo)localViewPager.o00Ooo00.get(i10);
          break label628;
          label619:
          int i3 = 0;
          f1 = 0.0F;
          localObject3 = null;
          label628:
          localObject5 = localObject3;
          label632:
          i16 += -1;
          i3 = 0;
          f1 = 0.0F;
          localObject3 = null;
        }
        f6 = ((ViewPager.ItemInfo)localObject4).OooO0Oo;
        i1 = i7 + 1;
        boolean bool5 = f6 < f3;
        if (bool5)
        {
          localObject3 = localViewPager.o00Ooo00;
          int i4 = ((ArrayList)localObject3).size();
          if (i1 < i4)
          {
            localObject3 = (ViewPager.ItemInfo)localViewPager.o00Ooo00.get(i1);
          }
          else
          {
            i4 = 0;
            f1 = 0.0F;
            localObject3 = null;
          }
          float f7;
          if (i12 <= 0)
          {
            i10 = 0;
            f7 = 0.0F;
          }
          else
          {
            i10 = getPaddingRight();
            f7 = i10;
            f2 = i12;
            f7 = f7 / f2 + f3;
          }
          i11 = localViewPager.o00OooO0;
          label1029:
          for (;;)
          {
            i11 += 1;
            if (i11 >= i6) {
              break;
            }
            boolean bool6 = f6 < f7;
            if ((!bool6) && (i11 > j))
            {
              if (localObject3 == null) {
                break;
              }
              int i13 = ((ViewPager.ItemInfo)localObject3).OooO0O0;
              if (i11 != i13) {
                break label1029;
              }
              boolean bool7 = ((ViewPager.ItemInfo)localObject3).OooO0OO;
              if (bool7) {
                break label1029;
              }
              localViewPager.o00Ooo00.remove(i1);
              PagerAdapter localPagerAdapter2 = localViewPager.o00Ooo0o;
              localObject3 = ((ViewPager.ItemInfo)localObject3).OooO00o;
              localPagerAdapter2.OooO0O0(localViewPager, i11, localObject3);
              localObject3 = localViewPager.o00Ooo00;
              i4 = ((ArrayList)localObject3).size();
              if (i1 >= i4) {}
            }
            for (;;)
            {
              localObject3 = (ViewPager.ItemInfo)localViewPager.o00Ooo00.get(i1);
              break;
              do
              {
                do
                {
                  i4 = 0;
                  f1 = 0.0F;
                  localObject3 = null;
                  break label1029;
                  if (localObject3 == null) {
                    break;
                  }
                  int i14 = ((ViewPager.ItemInfo)localObject3).OooO0O0;
                  if (i11 != i14) {
                    break;
                  }
                  f1 = ((ViewPager.ItemInfo)localObject3).OooO0Oo;
                  f6 += f1;
                  i1 += 1;
                  localObject3 = localViewPager.o00Ooo00;
                  i4 = ((ArrayList)localObject3).size();
                } while (i1 >= i4);
                break;
                localObject3 = localViewPager.OooO00o(i11, i1);
                i1 += 1;
                f1 = ((ViewPager.ItemInfo)localObject3).OooO0Oo;
                f6 += f1;
                localObject3 = localViewPager.o00Ooo00;
                i4 = ((ArrayList)localObject3).size();
              } while (i1 >= i4);
            }
          }
        }
        localViewPager.OooO0o0((ViewPager.ItemInfo)localObject4, i7, (ViewPager.ItemInfo)localObject1);
        localObject2 = localViewPager.o00Ooo0o;
        n = localViewPager.o00OooO0;
        localObject6 = ((ViewPager.ItemInfo)localObject4).OooO00o;
        ((PagerAdapter)localObject2).OooOOO(localViewPager, n, localObject6);
      }
      localObject2 = localViewPager.o00Ooo0o;
      ((PagerAdapter)localObject2).OooO0Oo(localViewPager);
      j = getChildCount();
      n = 0;
      localObject1 = null;
      int i5;
      while (n < j)
      {
        localObject6 = localViewPager.getChildAt(n);
        ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)((View)localObject6).getLayoutParams();
        localLayoutParams.OooO0o = n;
        i5 = localLayoutParams.OooO00o;
        if (i5 == 0)
        {
          f1 = localLayoutParams.OooO0OO;
          i5 = f1 < 0.0F;
          if (i5 == 0)
          {
            localObject6 = localViewPager.OooOo00((View)localObject6);
            if (localObject6 != null)
            {
              f1 = ((ViewPager.ItemInfo)localObject6).OooO0Oo;
              localLayoutParams.OooO0OO = f1;
              i16 = ((ViewPager.ItemInfo)localObject6).OooO0O0;
              localLayoutParams.OooO0o0 = i16;
            }
          }
        }
        n += 1;
      }
      OoooOO0();
      boolean bool2 = hasFocus();
      if (bool2)
      {
        localObject2 = findFocus();
        if (localObject2 != null)
        {
          localObject6 = localViewPager.OooOOoo((View)localObject2);
        }
        else
        {
          i16 = 0;
          f6 = 0.0F;
          localObject6 = null;
        }
        int k;
        if (localObject6 != null)
        {
          k = ((ViewPager.ItemInfo)localObject6).OooO0O0;
          n = localViewPager.o00OooO0;
          if (k == n) {}
        }
        else
        {
          i5 = 0;
          f1 = 0.0F;
          localObject3 = null;
          for (;;)
          {
            k = getChildCount();
            if (i5 >= k) {
              break;
            }
            localObject2 = localViewPager.getChildAt(i5);
            localObject1 = localViewPager.OooOo00((View)localObject2);
            if (localObject1 != null)
            {
              n = ((ViewPager.ItemInfo)localObject1).OooO0O0;
              i16 = localViewPager.o00OooO0;
              if (n == i16)
              {
                n = 2;
                boolean bool3 = ((View)localObject2).requestFocus(n);
                if (bool3) {
                  break;
                }
              }
            }
            i5 += 1;
          }
        }
      }
      return;
    }
    try
    {
      localObject2 = getResources();
      n = getId();
      localObject2 = ((Resources)localObject2).getResourceName(n);
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      int m = getId();
      localObject2 = Integer.toHexString(m);
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject6 = new java/lang/StringBuilder;
    ((StringBuilder)localObject6).<init>();
    ((StringBuilder)localObject6).append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
    i1 = localViewPager.o00OoOoo;
    ((StringBuilder)localObject6).append(i1);
    ((StringBuilder)localObject6).append(", found: ");
    ((StringBuilder)localObject6).append(i6);
    ((StringBuilder)localObject6).append(" Pager id: ");
    ((StringBuilder)localObject6).append((String)localObject2);
    ((StringBuilder)localObject6).append(" Pager class: ");
    localObject2 = getClass();
    ((StringBuilder)localObject6).append(localObject2);
    ((StringBuilder)localObject6).append(" Problematic adapter: ");
    localObject2 = localViewPager.o00Ooo0o.getClass();
    ((StringBuilder)localObject6).append(localObject2);
    localObject2 = ((StringBuilder)localObject6).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public final void Oooo00o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1;
    float f2;
    float f3;
    if (paramInt2 > 0)
    {
      Object localObject = this.o00Ooo00;
      boolean bool = ((ArrayList)localObject).isEmpty();
      if (!bool)
      {
        localObject = this.o0O00o0;
        bool = ((Scroller)localObject).isFinished();
        if (!bool)
        {
          Scroller localScroller = this.o0O00o0;
          paramInt2 = getCurrentItem();
          paramInt3 = getClientWidth();
          paramInt2 *= paramInt3;
          localScroller.setFinalX(paramInt2);
          return;
        }
        int i = getPaddingLeft();
        paramInt1 -= i;
        i = getPaddingRight();
        paramInt1 = paramInt1 - i + paramInt3;
        paramInt3 = getPaddingLeft();
        paramInt2 -= paramInt3;
        paramInt3 = getPaddingRight();
        paramInt2 = paramInt2 - paramInt3 + paramInt4;
        paramInt3 = getScrollX();
        f1 = paramInt3;
        f2 = paramInt2;
        f1 /= f2;
        f3 = paramInt1;
        f1 *= f3;
        paramInt1 = (int)f1;
      }
    }
    for (;;)
    {
      paramInt2 = getScrollY();
      scrollTo(paramInt1, paramInt2);
      break;
      paramInt2 = this.o00OooO0;
      ViewPager.ItemInfo localItemInfo = OooOo0O(paramInt2);
      if (localItemInfo != null)
      {
        f2 = localItemInfo.OooO0o0;
        f1 = this.o00o00;
        f2 = Math.min(f2, f1);
      }
      else
      {
        paramInt2 = 0;
        f2 = 0.0F;
        localItemInfo = null;
      }
      paramInt3 = getPaddingLeft();
      paramInt1 -= paramInt3;
      paramInt3 = getPaddingRight();
      f3 = paramInt1 - paramInt3;
      f2 *= f3;
      paramInt1 = (int)f2;
      paramInt2 = getScrollX();
      if (paramInt1 == paramInt2) {
        break;
      }
      paramInt2 = 0;
      f2 = 0.0F;
      localItemInfo = null;
      OooO0oo(false);
    }
  }
  
  public void Oooo0O0(ViewPager.OnAdapterChangeListener paramOnAdapterChangeListener)
  {
    List localList = this.o00oO000;
    if (localList != null) {
      localList.remove(paramOnAdapterChangeListener);
    }
  }
  
  public void Oooo0OO(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    List localList = this.o00o0ooo;
    if (localList != null) {
      localList.remove(paramOnPageChangeListener);
    }
  }
  
  public final boolean Oooo0o()
  {
    this.o00o0Oo = -1;
    OooOOOo();
    this.o00o0oO0.onRelease();
    this.o00o0oO.onRelease();
    EdgeEffect localEdgeEffect = this.o00o0oO0;
    boolean bool = localEdgeEffect.isFinished();
    if (!bool)
    {
      localEdgeEffect = this.o00o0oO;
      bool = localEdgeEffect.isFinished();
      if (!bool)
      {
        bool = false;
        localEdgeEffect = null;
        return bool;
      }
    }
    bool = true;
    return bool;
  }
  
  public final void Oooo0o0(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  public final void Oooo0oO(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    ViewPager.ItemInfo localItemInfo = OooOo0O(paramInt1);
    float f3;
    int j;
    if (localItemInfo != null)
    {
      int i = getClientWidth();
      float f1 = i;
      float f2 = this.oo00oO;
      f3 = localItemInfo.OooO0o0;
      float f4 = this.o00o00;
      f3 = Math.min(f3, f4);
      f3 = Math.max(f2, f3);
      f1 *= f3;
      j = (int)f1;
    }
    else
    {
      j = 0;
      localItemInfo = null;
      f3 = 0.0F;
    }
    if (paramBoolean1)
    {
      OoooO(j, 0, paramInt2);
      if (paramBoolean2) {
        OooOO0o(paramInt1);
      }
    }
    else
    {
      if (paramBoolean2) {
        OooOO0o(paramInt1);
      }
      OooO0oo(false);
      scrollTo(j, 0);
      OooOooO(j);
    }
  }
  
  public void Oooo0oo(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    Oooo(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  public void OoooO(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getChildCount();
    if (i == 0)
    {
      setScrollingCacheEnabled(false);
      return;
    }
    Scroller localScroller1 = this.o0O00o0;
    boolean bool2 = true;
    float f1 = 1.4E-45F;
    if (localScroller1 != null)
    {
      bool1 = localScroller1.isFinished();
      if (!bool1)
      {
        bool1 = bool2;
        f2 = f1;
        break label67;
      }
    }
    boolean bool1 = false;
    localScroller1 = null;
    float f2 = 0.0F;
    label67:
    if (bool1)
    {
      bool1 = this.o00OoooO;
      if (bool1)
      {
        localScroller1 = this.o0O00o0;
        j = localScroller1.getCurrX();
      }
      else
      {
        localScroller1 = this.o0O00o0;
        j = localScroller1.getStartX();
      }
      Scroller localScroller2 = this.o0O00o0;
      localScroller2.abortAnimation();
      setScrollingCacheEnabled(false);
    }
    else
    {
      j = getScrollX();
    }
    int m = j;
    int n = getScrollY();
    int i1 = paramInt1 - j;
    int i2 = paramInt2 - n;
    if ((i1 == 0) && (i2 == 0))
    {
      OooO0oo(false);
      Oooo000();
      setScrollState(0);
      return;
    }
    setScrollingCacheEnabled(bool2);
    setScrollState(2);
    paramInt1 = getClientWidth();
    paramInt2 = paramInt1 / 2;
    int j = Math.abs(i1);
    f2 = j;
    int k = 1065353216;
    f1 = 1.0F;
    f2 *= f1;
    float f3 = paramInt1;
    f2 /= f3;
    f2 = Math.min(f1, f2);
    float f4 = paramInt2;
    f2 = OooOOO(f2) * f4;
    f4 += f2;
    paramInt3 = Math.abs(paramInt3);
    if (paramInt3 > 0)
    {
      f3 = paramInt3;
      f3 = Math.abs(f4 / f3);
      paramInt2 = 1148846080;
      f4 = 1000.0F;
      f3 *= f4;
      paramInt1 = Math.round(f3) * 4;
    }
    else
    {
      PagerAdapter localPagerAdapter = this.o00Ooo0o;
      paramInt3 = this.o00OooO0;
      f4 = localPagerAdapter.getPageWidth(paramInt3);
      f3 *= f4;
      paramInt2 = Math.abs(i1);
      f4 = paramInt2;
      paramInt3 = this.o00o0000;
      float f5 = paramInt3;
      f3 += f5;
      f4 = f4 / f3 + f1;
      f3 = 100.0F;
      f4 *= f3;
      paramInt1 = (int)f4;
    }
    int i3 = Math.min(paramInt1, 600);
    this.o00OoooO = false;
    this.o0O00o0.startScroll(m, n, i1, i2, i3);
    ViewCompat.Ooooooo(this);
  }
  
  public void OoooO0(boolean paramBoolean, ViewPager.PageTransformer paramPageTransformer)
  {
    OoooO0O(paramBoolean, paramPageTransformer, 2);
  }
  
  public ViewPager.OnPageChangeListener OoooO00(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    ViewPager.OnPageChangeListener localOnPageChangeListener = this.o00oo000;
    this.o00oo000 = paramOnPageChangeListener;
    return localOnPageChangeListener;
  }
  
  public void OoooO0O(boolean paramBoolean, ViewPager.PageTransformer paramPageTransformer, int paramInt)
  {
    int i = 1;
    int j;
    if (paramPageTransformer != null) {
      j = i;
    } else {
      j = 0;
    }
    ViewPager.PageTransformer localPageTransformer = this.o00oO00O;
    int k;
    if (localPageTransformer != null)
    {
      k = i;
    }
    else
    {
      k = 0;
      localPageTransformer = null;
    }
    int m;
    if (j != k)
    {
      k = i;
    }
    else
    {
      m = 0;
      localPageTransformer = null;
    }
    this.o00oO00O = paramPageTransformer;
    setChildrenDrawingOrderEnabled(j);
    if (j != 0)
    {
      if (paramBoolean) {
        i = 2;
      }
      this.o00oOo = i;
      this.o00oO00o = paramInt;
    }
    else
    {
      this.o00oOo = 0;
    }
    if (m != 0) {
      Oooo000();
    }
  }
  
  public final void OoooOO0()
  {
    int i = this.o00oOo;
    if (i != 0)
    {
      ArrayList localArrayList1 = this.o00oO0;
      if (localArrayList1 == null)
      {
        localArrayList1 = new java/util/ArrayList;
        localArrayList1.<init>();
        this.o00oO0 = localArrayList1;
      }
      else
      {
        localArrayList1.clear();
      }
      i = getChildCount();
      int j = 0;
      ViewPager.ViewPositionComparator localViewPositionComparator = null;
      while (j < i)
      {
        View localView = getChildAt(j);
        ArrayList localArrayList2 = this.o00oO0;
        localArrayList2.add(localView);
        j += 1;
      }
      localArrayList1 = this.o00oO0;
      localViewPositionComparator = o00oOOOO;
      Collections.sort(localArrayList1, localViewPositionComparator);
    }
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    int i = paramArrayList.size();
    int j = getDescendantFocusability();
    int k = 393216;
    if (j != k)
    {
      k = 0;
      for (;;)
      {
        int m = getChildCount();
        if (k >= m) {
          break;
        }
        View localView = getChildAt(k);
        int n = localView.getVisibility();
        if (n == 0)
        {
          ViewPager.ItemInfo localItemInfo = OooOo00(localView);
          if (localItemInfo != null)
          {
            n = localItemInfo.OooO0O0;
            int i1 = this.o00OooO0;
            if (n == i1) {
              localView.addFocusables(paramArrayList, paramInt1, paramInt2);
            }
          }
        }
        k += 1;
      }
    }
    paramInt1 = 262144;
    if (j == paramInt1)
    {
      paramInt1 = paramArrayList.size();
      if (i != paramInt1) {}
    }
    else
    {
      paramInt1 = isFocusable();
      if (paramInt1 == 0) {
        return;
      }
      paramInt1 = 1;
      paramInt2 &= paramInt1;
      if (paramInt2 == paramInt1)
      {
        paramInt1 = isInTouchMode();
        if (paramInt1 != 0)
        {
          paramInt1 = isFocusableInTouchMode();
          if (paramInt1 == 0) {
            return;
          }
        }
      }
      paramArrayList.add(this);
    }
  }
  
  public void addTouchables(ArrayList paramArrayList)
  {
    int i = 0;
    for (;;)
    {
      int j = getChildCount();
      if (i >= j) {
        break;
      }
      View localView = getChildAt(i);
      int k = localView.getVisibility();
      if (k == 0)
      {
        ViewPager.ItemInfo localItemInfo = OooOo00(localView);
        if (localItemInfo != null)
        {
          k = localItemInfo.OooO0O0;
          int m = this.o00OooO0;
          if (k == m) {
            localView.addTouchables(paramArrayList);
          }
        }
      }
      i += 1;
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool1 = checkLayoutParams(paramLayoutParams);
    if (!bool1) {
      paramLayoutParams = generateLayoutParams(paramLayoutParams);
    }
    Object localObject = paramLayoutParams;
    localObject = (ViewPager.LayoutParams)paramLayoutParams;
    boolean bool2 = ((ViewPager.LayoutParams)localObject).OooO00o;
    boolean bool3 = OooOo(paramView);
    bool2 |= bool3;
    ((ViewPager.LayoutParams)localObject).OooO00o = bool2;
    bool3 = this.o00o00o0;
    if (bool3)
    {
      if (!bool2)
      {
        bool2 = true;
        ((ViewPager.LayoutParams)localObject).OooO0Oo = bool2;
        addViewInLayout(paramView, paramInt, paramLayoutParams);
      }
      else
      {
        paramView = new java/lang/IllegalStateException;
        paramView.<init>("Cannot add pager decor view during layout");
        throw paramView;
      }
    }
    else {
      super.addView(paramView, paramInt, paramLayoutParams);
    }
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    PagerAdapter localPagerAdapter = this.o00Ooo0o;
    boolean bool1 = false;
    if (localPagerAdapter == null) {
      return false;
    }
    int i = getClientWidth();
    int j = getScrollX();
    boolean bool2 = true;
    float f1;
    float f2;
    if (paramInt < 0)
    {
      f1 = i;
      f2 = this.oo00oO;
      f1 *= f2;
      paramInt = (int)f1;
      if (j > paramInt) {
        bool1 = bool2;
      }
      return bool1;
    }
    if (paramInt > 0)
    {
      f1 = i;
      f2 = this.o00o00;
      f1 *= f2;
      paramInt = (int)f1;
      if (j < paramInt) {
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool1 = paramLayoutParams instanceof ViewPager.LayoutParams;
    if (bool1)
    {
      bool2 = super.checkLayoutParams((ViewGroup.LayoutParams)paramLayoutParams);
      if (bool2) {
        return true;
      }
    }
    boolean bool2 = false;
    paramLayoutParams = null;
    return bool2;
  }
  
  public void computeScroll()
  {
    int i = 1;
    this.o00OoooO = i;
    Scroller localScroller1 = this.o0O00o0;
    boolean bool2 = localScroller1.isFinished();
    boolean bool1;
    if (!bool2)
    {
      localScroller1 = this.o0O00o0;
      bool2 = localScroller1.computeScrollOffset();
      if (bool2)
      {
        i = getScrollX();
        int j = getScrollY();
        Scroller localScroller2 = this.o0O00o0;
        int k = localScroller2.getCurrX();
        Scroller localScroller3 = this.o0O00o0;
        int m = localScroller3.getCurrY();
        if ((i != k) || (j != m))
        {
          scrollTo(k, m);
          bool1 = OooOooO(k);
          if (!bool1)
          {
            this.o0O00o0.abortAnimation();
            bool1 = false;
            scrollTo(0, m);
          }
        }
        ViewCompat.Ooooooo(this);
        return;
      }
    }
    OooO0oo(bool1);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool1 = super.dispatchKeyEvent(paramKeyEvent);
    if (!bool1)
    {
      bool2 = OooOOo0(paramKeyEvent);
      if (!bool2)
      {
        bool2 = false;
        paramKeyEvent = null;
        return bool2;
      }
    }
    boolean bool2 = true;
    return bool2;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = paramAccessibilityEvent.getEventType();
    int j = 4096;
    if (i == j) {
      return super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
    }
    i = getChildCount();
    j = 0;
    int k = 0;
    while (k < i)
    {
      View localView = getChildAt(k);
      int m = localView.getVisibility();
      if (m == 0)
      {
        ViewPager.ItemInfo localItemInfo = OooOo00(localView);
        if (localItemInfo != null)
        {
          m = localItemInfo.OooO0O0;
          int n = this.o00OooO0;
          if (m == n)
          {
            boolean bool = localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
            if (bool) {
              return true;
            }
          }
        }
      }
      k += 1;
    }
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getOverScrollMode();
    boolean bool3 = false;
    int m;
    if (i != 0)
    {
      m = 1;
      if (i == m)
      {
        localObject = this.o00Ooo0o;
        if (localObject != null)
        {
          i = ((PagerAdapter)localObject).getCount();
          if (i > m) {
            break label70;
          }
        }
      }
      this.o00o0oO0.finish();
      paramCanvas = this.o00o0oO;
      paramCanvas.finish();
      break label372;
    }
    label70:
    Object localObject = this.o00o0oO0;
    boolean bool1 = ((EdgeEffect)localObject).isFinished();
    int i1;
    int i2;
    float f1;
    float f2;
    float f3;
    EdgeEffect localEdgeEffect1;
    EdgeEffect localEdgeEffect2;
    if (!bool1)
    {
      int j = paramCanvas.save();
      m = getHeight();
      i1 = getPaddingTop();
      m -= i1;
      i1 = getPaddingBottom();
      m -= i1;
      i1 = getWidth();
      paramCanvas.rotate(270.0F);
      i2 = -m;
      int i3 = getPaddingTop();
      i2 += i3;
      f1 = i2;
      f2 = this.oo00oO;
      f3 = i1;
      f2 *= f3;
      paramCanvas.translate(f1, f2);
      localEdgeEffect1 = this.o00o0oO0;
      localEdgeEffect1.setSize(m, i1);
      localEdgeEffect2 = this.o00o0oO0;
      boolean bool4 = localEdgeEffect2.draw(paramCanvas);
      bool3 = false | bool4;
      paramCanvas.restoreToCount(j);
    }
    localObject = this.o00o0oO;
    boolean bool2 = ((EdgeEffect)localObject).isFinished();
    if (!bool2)
    {
      int k = paramCanvas.save();
      int n = getWidth();
      i1 = getHeight();
      i2 = getPaddingTop();
      i1 -= i2;
      i2 = getPaddingBottom();
      i1 -= i2;
      paramCanvas.rotate(90.0F);
      i2 = -getPaddingTop();
      f1 = i2;
      f2 = -(this.o00o00 + 1.0F);
      f3 = n;
      f2 *= f3;
      paramCanvas.translate(f1, f2);
      localEdgeEffect1 = this.o00o0oO;
      localEdgeEffect1.setSize(i1, n);
      localEdgeEffect2 = this.o00o0oO;
      boolean bool5 = localEdgeEffect2.draw(paramCanvas);
      bool3 |= bool5;
      paramCanvas.restoreToCount(k);
    }
    label372:
    if (bool3) {
      ViewCompat.Ooooooo(this);
    }
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.o00o000;
    if (localDrawable != null)
    {
      boolean bool = localDrawable.isStateful();
      if (bool)
      {
        int[] arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    ViewPager.LayoutParams localLayoutParams = new androidx/viewpager/widget/ViewPager$LayoutParams;
    localLayoutParams.<init>();
    return localLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    ViewPager.LayoutParams localLayoutParams = new androidx/viewpager/widget/ViewPager$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }
  
  public PagerAdapter getAdapter()
  {
    return this.o00Ooo0o;
  }
  
  public int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i = this.o00oOo;
    int j = 2;
    if (i == j)
    {
      paramInt1 += -1;
      paramInt2 = paramInt1 - paramInt2;
    }
    return ((ViewPager.LayoutParams)((View)this.o00oO0.get(paramInt2)).getLayoutParams()).OooO0o;
  }
  
  public int getCurrentItem()
  {
    return this.o00OooO0;
  }
  
  public int getOffscreenPageLimit()
  {
    return this.o00o00oo;
  }
  
  public int getPageMargin()
  {
    return this.o00o0000;
  }
  
  public boolean isFakeDragging()
  {
    return this.o00o0o;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.o00o0oOO = true;
  }
  
  public void onDetachedFromWindow()
  {
    Object localObject = this.o00oO0O0;
    removeCallbacks((Runnable)localObject);
    localObject = this.o0O00o0;
    if (localObject != null)
    {
      boolean bool = ((Scroller)localObject).isFinished();
      if (!bool)
      {
        localObject = this.o0O00o0;
        ((Scroller)localObject).abortAnimation();
      }
    }
    super.onDetachedFromWindow();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    ViewPager localViewPager = this;
    super.onDraw(paramCanvas);
    int i = this.o00o0000;
    if (i > 0)
    {
      Object localObject1 = this.o00o000;
      if (localObject1 != null)
      {
        localObject1 = this.o00Ooo00;
        i = ((ArrayList)localObject1).size();
        if (i > 0)
        {
          localObject1 = this.o00Ooo0o;
          if (localObject1 != null)
          {
            i = getScrollX();
            int j = getWidth();
            int k = this.o00o0000;
            float f1 = k;
            float f2 = j;
            f1 /= f2;
            Object localObject2 = this.o00Ooo00;
            int m = 0;
            localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject2).get(0);
            float f3 = ((ViewPager.ItemInfo)localObject2).OooO0o0;
            ArrayList localArrayList = this.o00Ooo00;
            int n = localArrayList.size();
            int i1 = ((ViewPager.ItemInfo)localObject2).OooO0O0;
            Object localObject3 = this.o00Ooo00;
            int i2 = n + -1;
            localObject3 = (ViewPager.ItemInfo)((ArrayList)localObject3).get(i2);
            int i3 = ((ViewPager.ItemInfo)localObject3).OooO0O0;
            while (i1 < i3)
            {
              for (;;)
              {
                i2 = ((ViewPager.ItemInfo)localObject2).OooO0O0;
                if ((i1 <= i2) || (m >= n)) {
                  break;
                }
                localObject2 = localViewPager.o00Ooo00;
                m += 1;
                localObject2 = (ViewPager.ItemInfo)((ArrayList)localObject2).get(m);
              }
              float f5;
              Object localObject4;
              if (i1 == i2)
              {
                f3 = ((ViewPager.ItemInfo)localObject2).OooO0o0;
                f4 = ((ViewPager.ItemInfo)localObject2).OooO0Oo;
                f5 = (f3 + f4) * f2;
                f3 = f3 + f4 + f1;
              }
              else
              {
                localObject4 = localViewPager.o00Ooo0o;
                f4 = ((PagerAdapter)localObject4).getPageWidth(i1);
                f5 = (f3 + f4) * f2;
                f4 += f1;
                f3 += f4;
              }
              float f4 = localViewPager.o00o0000 + f5;
              float f6 = i;
              boolean bool2 = f4 < f6;
              float f8;
              if (bool2)
              {
                localObject4 = localViewPager.o00o000;
                int i4 = Math.round(f5);
                int i5 = localViewPager.o00o000O;
                float f7 = localViewPager.o00o0000 + f5;
                int i6 = Math.round(f7);
                f8 = f1;
                k = localViewPager.o00o000o;
                ((Drawable)localObject4).setBounds(i4, i5, i6, k);
                Drawable localDrawable = localViewPager.o00o000;
                localObject4 = paramCanvas;
                localDrawable.draw(paramCanvas);
              }
              else
              {
                localObject4 = paramCanvas;
                f8 = f1;
              }
              f1 = i + j;
              boolean bool1 = f5 < f1;
              if (bool1) {
                break;
              }
              i1 += 1;
              f1 = f8;
            }
          }
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    ViewPager localViewPager = this;
    MotionEvent localMotionEvent = paramMotionEvent;
    int i = paramMotionEvent.getAction() & 0xFF;
    int m = 3;
    float f1 = 4.203895E-045F;
    if (i != m)
    {
      int i2 = 1;
      if (i != i2)
      {
        if (i != 0)
        {
          boolean bool3 = this.o00o0;
          if (bool3) {
            return i2;
          }
          bool3 = this.o00o0O00;
          if (bool3) {
            return false;
          }
        }
        int n = 2;
        f1 = 2.802597E-045F;
        float f5;
        Object localObject2;
        int i1;
        if (i != 0)
        {
          if (i != n)
          {
            n = 6;
            f1 = 8.407791E-045F;
            if (i == n) {
              OooOoOO(paramMotionEvent);
            }
          }
          else
          {
            i = localViewPager.o00o0Oo;
            n = -1;
            f1 = 0.0F / 0.0F;
            if (i != n)
            {
              i = localMotionEvent.findPointerIndex(i);
              float f2 = localMotionEvent.getX(i);
              f1 = localViewPager.o00o0OO;
              f1 = f2 - f1;
              float f3 = Math.abs(f1);
              float f4 = localMotionEvent.getY(i);
              f5 = localViewPager.o00o0Oo0;
              float f6 = Math.abs(f4 - f5);
              i = 0;
              f5 = 0.0F;
              localObject1 = null;
              boolean bool5 = f1 < 0.0F;
              if (bool5)
              {
                f5 = localViewPager.o00o0OO;
                boolean bool1 = OooOoO0(f5, f1);
                if (!bool1)
                {
                  int i3 = (int)f1;
                  int i4 = (int)f2;
                  int i5 = (int)f4;
                  localObject1 = this;
                  localObject2 = this;
                  bool1 = OooO0o(this, false, i3, i4, i5);
                  if (bool1)
                  {
                    localViewPager.o00o0OO = f2;
                    localViewPager.o00o0OOO = f4;
                    localViewPager.o00o0O00 = i2;
                    return false;
                  }
                }
              }
              int j = localViewPager.o00o0OO0;
              f1 = j;
              boolean bool4 = f3 < f1;
              if (bool4)
              {
                f1 = 0.5F;
                f3 *= f1;
                bool4 = f3 < f6;
                if (bool4)
                {
                  localViewPager.o00o0 = i2;
                  Oooo0o0(i2);
                  setScrollState(i2);
                  f5 = localViewPager.o00o0OOo;
                  i1 = localViewPager.o00o0OO0;
                  f1 = i1;
                  if (bool5) {
                    f5 += f1;
                  } else {
                    f5 -= f1;
                  }
                  localViewPager.o00o0OO = f5;
                  localViewPager.o00o0OOO = f4;
                  setScrollingCacheEnabled(i2);
                  break label454;
                }
              }
              f5 = j;
              boolean bool2 = f6 < f5;
              if (bool2) {
                localViewPager.o00o0O00 = i2;
              }
              label454:
              bool2 = localViewPager.o00o0;
              if (bool2)
              {
                bool2 = OooOooo(f2);
                if (bool2) {
                  ViewCompat.Ooooooo(this);
                }
              }
            }
          }
        }
        else
        {
          f5 = paramMotionEvent.getX();
          localViewPager.o00o0OOo = f5;
          localViewPager.o00o0OO = f5;
          f5 = paramMotionEvent.getY();
          localViewPager.o00o0Oo0 = f5;
          localViewPager.o00o0OOO = f5;
          int k = localMotionEvent.getPointerId(0);
          localViewPager.o00o0Oo = k;
          localViewPager.o00o0O00 = false;
          localViewPager.o00OoooO = i2;
          localObject1 = localViewPager.o0O00o0;
          ((Scroller)localObject1).computeScrollOffset();
          k = localViewPager.o0oOOo;
          if (k == i1)
          {
            localObject1 = localViewPager.o0O00o0;
            k = ((Scroller)localObject1).getFinalX();
            localObject2 = localViewPager.o0O00o0;
            i1 = ((Scroller)localObject2).getCurrX();
            k = Math.abs(k - i1);
            i1 = localViewPager.o00o0o0o;
            if (k > i1)
            {
              localObject1 = localViewPager.o0O00o0;
              ((Scroller)localObject1).abortAnimation();
              localViewPager.o00o00oO = false;
              Oooo000();
              localViewPager.o00o0 = i2;
              Oooo0o0(i2);
              setScrollState(i2);
              break label670;
            }
          }
          OooO0oo(false);
          localViewPager.o00o0 = false;
        }
        label670:
        Object localObject1 = localViewPager.o00o0OoO;
        if (localObject1 == null)
        {
          localObject1 = VelocityTracker.obtain();
          localViewPager.o00o0OoO = ((VelocityTracker)localObject1);
        }
        localViewPager.o00o0OoO.addMovement(localMotionEvent);
        return localViewPager.o00o0;
      }
    }
    Oooo0o();
    return false;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewPager localViewPager = this;
    int i = getChildCount();
    int k = paramInt3 - paramInt1;
    int m = paramInt4 - paramInt2;
    int n = getPaddingLeft();
    int i1 = getPaddingTop();
    int i2 = getPaddingRight();
    int i3 = getPaddingBottom();
    int i4 = getScrollX();
    int i5 = 0;
    float f1 = 0.0F;
    ViewPager.ItemInfo localItemInfo = null;
    int i7 = 0;
    int i8;
    label261:
    int i15;
    for (;;)
    {
      i8 = 8;
      if (i5 >= i) {
        break;
      }
      View localView1 = localViewPager.getChildAt(i5);
      int i9 = localView1.getVisibility();
      if (i9 != i8)
      {
        ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
        boolean bool3 = localLayoutParams1.OooO00o;
        if (bool3)
        {
          i8 = localLayoutParams1.OooO0O0;
          int i10 = i8 & 0x7;
          i8 &= 0x70;
          int i12 = 1;
          if (i10 != i12)
          {
            i12 = 3;
            if (i10 != i12)
            {
              i12 = 5;
              if (i10 != i12)
              {
                i10 = n;
                break label261;
              }
              i10 = k - i2;
              i12 = localView1.getMeasuredWidth();
              i10 -= i12;
              i12 = localView1.getMeasuredWidth();
              i2 += i12;
            }
            else
            {
              i10 = localView1.getMeasuredWidth() + n;
              break label261;
            }
          }
          else
          {
            i10 = localView1.getMeasuredWidth();
            i10 = Math.max((k - i10) / 2, n);
          }
          int i13 = i10;
          i10 = n;
          n = i13;
          i12 = 16;
          if (i8 != i12)
          {
            i12 = 48;
            if (i8 != i12)
            {
              i12 = 80;
              if (i8 != i12)
              {
                i8 = i1;
                break label385;
              }
              i8 = m - i3;
              i12 = localView1.getMeasuredHeight();
              i8 -= i12;
              i12 = localView1.getMeasuredHeight();
              i3 += i12;
            }
            else
            {
              i8 = localView1.getMeasuredHeight() + i1;
              break label385;
            }
          }
          else
          {
            i8 = localView1.getMeasuredHeight();
            i8 = Math.max((m - i8) / 2, i1);
          }
          i13 = i8;
          i8 = i1;
          i1 = i13;
          label385:
          n += i4;
          i12 = localView1.getMeasuredWidth() + n;
          int i14 = localView1.getMeasuredHeight();
          i15 = i1 + i14;
          localView1.layout(n, i1, i12, i15);
          i7 += 1;
          i1 = i8;
          n = i10;
        }
      }
      i5 += 1;
    }
    k = k - n - i2;
    i2 = 0;
    while (i2 < i)
    {
      View localView2 = localViewPager.getChildAt(i2);
      i15 = localView2.getVisibility();
      if (i15 != i8)
      {
        ViewPager.LayoutParams localLayoutParams2 = (ViewPager.LayoutParams)localView2.getLayoutParams();
        boolean bool2 = localLayoutParams2.OooO00o;
        if (!bool2)
        {
          localItemInfo = localViewPager.OooOo00(localView2);
          if (localItemInfo != null)
          {
            float f2 = k;
            f1 = localItemInfo.OooO0o0 * f2;
            int i6 = (int)f1 + n;
            boolean bool4 = localLayoutParams2.OooO0Oo;
            if (bool4)
            {
              localLayoutParams2.OooO0Oo = false;
              float f3 = localLayoutParams2.OooO0OO;
              i15 = (int)(f2 * f3);
              i16 = 1073741824;
              f2 = 2.0F;
              i15 = View.MeasureSpec.makeMeasureSpec(i15, i16);
              int i11 = m - i1 - i3;
              i16 = View.MeasureSpec.makeMeasureSpec(i11, i16);
              localView2.measure(i15, i16);
            }
            i15 = localView2.getMeasuredWidth() + i6;
            int i16 = localView2.getMeasuredHeight() + i1;
            localView2.layout(i6, i1, i15, i16);
          }
        }
      }
      i2 += 1;
    }
    localViewPager.o00o000O = i1;
    m -= i3;
    localViewPager.o00o000o = m;
    localViewPager.o00o0oo = i7;
    boolean bool1 = localViewPager.o00o0oOO;
    if (bool1)
    {
      int j = localViewPager.o00OooO0;
      k = 0;
      localViewPager.Oooo0oO(j, false, 0, false);
    }
    else
    {
      k = 0;
    }
    localViewPager.o00o0oOO = false;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    paramInt1 = View.getDefaultSize(0, paramInt1);
    paramInt2 = View.getDefaultSize(0, paramInt2);
    setMeasuredDimension(paramInt1, paramInt2);
    paramInt1 = getMeasuredWidth();
    paramInt2 = paramInt1 / 10;
    int j = this.o00o0O0;
    paramInt2 = Math.min(paramInt2, j);
    this.o00o0O0O = paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 -= paramInt2;
    paramInt2 = getPaddingRight();
    paramInt1 -= paramInt2;
    paramInt2 = getMeasuredHeight();
    j = getPaddingTop();
    paramInt2 -= j;
    j = getPaddingBottom();
    paramInt2 -= j;
    j = getChildCount();
    int k = 0;
    ViewPager.LayoutParams localLayoutParams1 = null;
    float f1 = 0.0F;
    int m;
    int n;
    float f2;
    int i2;
    for (;;)
    {
      m = 8;
      n = 1;
      f2 = 1.4E-45F;
      i2 = 1073741824;
      float f3 = 2.0F;
      if (k >= j) {
        break;
      }
      View localView1 = getChildAt(k);
      int i3 = localView1.getVisibility();
      if (i3 != m)
      {
        ViewPager.LayoutParams localLayoutParams2 = (ViewPager.LayoutParams)localView1.getLayoutParams();
        if (localLayoutParams2 != null)
        {
          boolean bool = localLayoutParams2.OooO00o;
          if (bool)
          {
            int i4 = localLayoutParams2.OooO0O0;
            int i5 = i4 & 0x7;
            i4 &= 0x70;
            int i6 = 48;
            float f4 = 6.726233E-044F;
            if (i4 != i6)
            {
              i6 = 80;
              f4 = 1.121039E-043F;
              if (i4 != i6)
              {
                i4 = 0;
                break label251;
              }
            }
            i4 = n;
            label251:
            i6 = 3;
            f4 = 4.203895E-045F;
            if (i5 != i6)
            {
              i6 = 5;
              f4 = 7.006492E-045F;
              if (i5 != i6)
              {
                n = 0;
                f2 = 0.0F;
              }
            }
            i5 = -1 << -1;
            float f5 = -0.0F;
            if (i4 != 0)
            {
              i6 = i5;
              f4 = f5;
              i5 = i2;
              f5 = f3;
            }
            else if (n != 0)
            {
              i6 = i2;
              f4 = f3;
            }
            else
            {
              i6 = i5;
              f4 = f5;
            }
            int i7 = localLayoutParams2.width;
            int i8 = -1;
            int i9 = -2;
            if (i7 != i9)
            {
              if (i7 == i8) {
                i7 = paramInt1;
              }
              i5 = i2;
              f5 = f3;
            }
            else
            {
              i7 = paramInt1;
            }
            m = localLayoutParams2.height;
            if (m != i9)
            {
              if (m == i8) {
                m = paramInt2;
              }
            }
            else
            {
              m = paramInt2;
              i2 = i6;
              f3 = f4;
            }
            i5 = View.MeasureSpec.makeMeasureSpec(i7, i5);
            m = View.MeasureSpec.makeMeasureSpec(m, i2);
            localView1.measure(i5, m);
            if (i4 != 0)
            {
              m = localView1.getMeasuredHeight();
              paramInt2 -= m;
            }
            else if (n != 0)
            {
              m = localView1.getMeasuredWidth();
              paramInt1 -= m;
            }
          }
        }
      }
      k += 1;
    }
    j = View.MeasureSpec.makeMeasureSpec(paramInt1, i2);
    this.o00o00O0 = j;
    paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2, i2);
    this.o00o00Oo = paramInt2;
    this.o00o00o0 = n;
    Oooo000();
    this.o00o00o0 = false;
    paramInt2 = getChildCount();
    while (i < paramInt2)
    {
      View localView2 = getChildAt(i);
      k = localView2.getVisibility();
      if (k != m)
      {
        localLayoutParams1 = (ViewPager.LayoutParams)localView2.getLayoutParams();
        if (localLayoutParams1 != null)
        {
          n = localLayoutParams1.OooO00o;
          if (n != 0) {}
        }
        else
        {
          f2 = paramInt1;
          f1 = localLayoutParams1.OooO0OO;
          f2 *= f1;
          k = View.MeasureSpec.makeMeasureSpec((int)f2, i2);
          int i1 = this.o00o00Oo;
          localView2.measure(k, i1);
        }
      }
      i += 1;
    }
  }
  
  public boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i = getChildCount();
    int j = paramInt & 0x2;
    int k = 1;
    int m;
    if (j != 0)
    {
      j = i;
      i = 0;
      m = k;
    }
    else
    {
      i += -1;
      j = -1;
      m = j;
    }
    while (i != j)
    {
      View localView = getChildAt(i);
      int n = localView.getVisibility();
      if (n == 0)
      {
        ViewPager.ItemInfo localItemInfo = OooOo00(localView);
        if (localItemInfo != null)
        {
          n = localItemInfo.OooO0O0;
          int i1 = this.o00OooO0;
          if (n == i1)
          {
            boolean bool = localView.requestFocus(paramInt, paramRect);
            if (bool) {
              return k;
            }
          }
        }
      }
      i += m;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool1 = paramParcelable instanceof ViewPager.SavedState;
    if (!bool1)
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (ViewPager.SavedState)paramParcelable;
    Object localObject = paramParcelable.getSuperState();
    super.onRestoreInstanceState((Parcelable)localObject);
    localObject = this.o00Ooo0o;
    if (localObject != null)
    {
      Parcelable localParcelable = paramParcelable.o00Ooo00;
      ClassLoader localClassLoader = paramParcelable.o00Ooo0;
      ((PagerAdapter)localObject).OooOO0O(localParcelable, localClassLoader);
      int j = paramParcelable.o00OoOoo;
      bool1 = false;
      localObject = null;
      boolean bool2 = true;
      Oooo0oo(j, false, bool2);
    }
    else
    {
      int i = paramParcelable.o00OoOoo;
      this.o00OooO = i;
      localObject = paramParcelable.o00Ooo00;
      this.o00OooOO = ((Parcelable)localObject);
      paramParcelable = paramParcelable.o00Ooo0;
      this.o00OooOo = paramParcelable;
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object localObject = super.onSaveInstanceState();
    ViewPager.SavedState localSavedState = new androidx/viewpager/widget/ViewPager$SavedState;
    localSavedState.<init>((Parcelable)localObject);
    int i = this.o00OooO0;
    localSavedState.o00OoOoo = i;
    localObject = this.o00Ooo0o;
    if (localObject != null)
    {
      localObject = ((PagerAdapter)localObject).OooOO0o();
      localSavedState.o00Ooo00 = ((Parcelable)localObject);
    }
    return localSavedState;
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      paramInt2 = this.o00o0000;
      Oooo00o(paramInt1, paramInt3, paramInt2, paramInt2);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.o00o0o;
    int n = 1;
    if (bool1) {
      return n;
    }
    int i = paramMotionEvent.getAction();
    int i1 = 0;
    float f1 = 0.0F;
    if (i == 0)
    {
      i = paramMotionEvent.getEdgeFlags();
      if (i != 0) {
        return false;
      }
    }
    Object localObject = this.o00Ooo0o;
    if (localObject != null)
    {
      i = ((PagerAdapter)localObject).getCount();
      if (i != 0)
      {
        localObject = this.o00o0OoO;
        if (localObject == null)
        {
          localObject = VelocityTracker.obtain();
          this.o00o0OoO = ((VelocityTracker)localObject);
        }
        localObject = this.o00o0OoO;
        ((VelocityTracker)localObject).addMovement(paramMotionEvent);
        i = paramMotionEvent.getAction() & 0xFF;
        float f5;
        int i10;
        label747:
        boolean bool5;
        if (i != 0)
        {
          float f2;
          float f3;
          float f6;
          int i12;
          int i7;
          if (i != n)
          {
            int i2 = 2;
            f2 = 2.802597E-045F;
            if (i != i2)
            {
              int i3 = 3;
              f2 = 4.203895E-045F;
              if (i != i3)
              {
                int i4 = 5;
                f2 = 7.006492E-045F;
                if (i != i4)
                {
                  int i5 = 6;
                  f2 = 8.407791E-045F;
                  if (i != i5) {
                    break label825;
                  }
                  OooOoOO(paramMotionEvent);
                  i = this.o00o0Oo;
                  i = paramMotionEvent.findPointerIndex(i);
                  f3 = paramMotionEvent.getX(i);
                  this.o00o0OO = f3;
                  break label825;
                }
                i = paramMotionEvent.getActionIndex();
                f2 = paramMotionEvent.getX(i);
                this.o00o0OO = f2;
                int i8 = paramMotionEvent.getPointerId(i);
                break label819;
              }
              boolean bool7 = this.o00o0;
              if (!bool7) {
                break label825;
              }
              int i9 = this.o00OooO0;
              Oooo0oO(i9, n, 0, false);
            }
            else
            {
              boolean bool2 = this.o00o0;
              if (!bool2)
              {
                int j = this.o00o0Oo;
                j = paramMotionEvent.findPointerIndex(j);
                int i6 = -1;
                f2 = 0.0F / 0.0F;
                if (j == i6) {
                  break label747;
                }
                f2 = paramMotionEvent.getX(j);
                float f4 = this.o00o0OO;
                f4 = Math.abs(f2 - f4);
                f5 = paramMotionEvent.getY(j);
                f6 = this.o00o0OOO;
                f6 = Math.abs(f5 - f6);
                float f7 = this.o00o0OO0;
                boolean bool9 = f4 < f7;
                if (bool9)
                {
                  boolean bool10 = f4 < f6;
                  if (bool10)
                  {
                    this.o00o0 = n;
                    Oooo0o0(n);
                    f4 = this.o00o0OOo;
                    f2 -= f4;
                    i12 = 0;
                    f6 = 0.0F;
                    boolean bool6 = f2 < 0.0F;
                    if (bool6)
                    {
                      i7 = this.o00o0OO0;
                      f2 = i7;
                      f4 += f2;
                    }
                    else
                    {
                      i7 = this.o00o0OO0;
                      f2 = i7;
                      f4 -= f2;
                    }
                    this.o00o0OO = f4;
                    this.o00o0OOO = f5;
                    setScrollState(n);
                    setScrollingCacheEnabled(n);
                    localObject = getParent();
                    if (localObject != null) {
                      ((ViewParent)localObject).requestDisallowInterceptTouchEvent(n);
                    }
                  }
                }
              }
              boolean bool3 = this.o00o0;
              if (!bool3) {
                break label825;
              }
              int k = this.o00o0Oo;
              k = paramMotionEvent.findPointerIndex(k);
              f3 = paramMotionEvent.getX(k);
              boolean bool8 = OooOooo(f3);
              i1 = false | bool8;
              break label825;
            }
          }
          else
          {
            boolean bool4 = this.o00o0;
            if (!bool4) {
              break label825;
            }
            localObject = this.o00o0OoO;
            f1 = this.o00o0o00;
            ((VelocityTracker)localObject).computeCurrentVelocity(1000, f1);
            i1 = this.o00o0Oo;
            f5 = ((VelocityTracker)localObject).getXVelocity(i1);
            int m = (int)f5;
            this.o00o00oO = n;
            i1 = getClientWidth();
            i7 = getScrollX();
            ViewPager.ItemInfo localItemInfo = OooOo0();
            i12 = this.o00o0000;
            f6 = i12;
            f1 = i1;
            f6 /= f1;
            int i11 = localItemInfo.OooO0O0;
            f2 = i7 / f1;
            f1 = localItemInfo.OooO0o0;
            f2 -= f1;
            f1 = localItemInfo.OooO0Oo + f6;
            f2 /= f1;
            i1 = this.o00o0Oo;
            i1 = paramMotionEvent.findPointerIndex(i1);
            f3 = paramMotionEvent.getX(i1);
            f1 = this.o00o0OOo;
            f3 -= f1;
            i10 = (int)f3;
            i10 = OooOO0(i11, f2, m, i10);
            Oooo(i10, n, n, m);
          }
          bool5 = Oooo0o();
          break label825;
        }
        else
        {
          localObject = this.o0O00o0;
          ((Scroller)localObject).abortAnimation();
          this.o00o00oO = false;
          Oooo000();
          f5 = paramMotionEvent.getX();
          this.o00o0OOo = f5;
          this.o00o0OO = f5;
          f5 = paramMotionEvent.getY();
          this.o00o0Oo0 = f5;
          this.o00o0OOO = f5;
          i10 = paramMotionEvent.getPointerId(0);
        }
        label819:
        this.o00o0Oo = i10;
        label825:
        if (bool5) {
          ViewCompat.Ooooooo(this);
        }
        return n;
      }
    }
    return false;
  }
  
  public void removeView(View paramView)
  {
    boolean bool = this.o00o00o0;
    if (bool) {
      removeViewInLayout(paramView);
    } else {
      super.removeView(paramView);
    }
  }
  
  public void setAdapter(PagerAdapter paramPagerAdapter)
  {
    Object localObject1 = this.o00Ooo0o;
    boolean bool1 = false;
    List localList = null;
    int j = 0;
    Object localObject2;
    Object localObject3;
    int i1;
    if (localObject1 != null)
    {
      ((PagerAdapter)localObject1).setViewPagerObserver(null);
      this.o00Ooo0o.OooOOOo(this);
      int k = 0;
      localObject1 = null;
      for (;;)
      {
        localObject2 = this.o00Ooo00;
        int m = ((ArrayList)localObject2).size();
        if (k >= m) {
          break;
        }
        localObject2 = (ViewPager.ItemInfo)this.o00Ooo00.get(k);
        localObject3 = this.o00Ooo0o;
        i1 = ((ViewPager.ItemInfo)localObject2).OooO0O0;
        localObject2 = ((ViewPager.ItemInfo)localObject2).OooO00o;
        ((PagerAdapter)localObject3).OooO0O0(this, i1, localObject2);
        k += 1;
      }
      this.o00Ooo0o.OooO0Oo(this);
      localObject1 = this.o00Ooo00;
      ((ArrayList)localObject1).clear();
      Oooo0();
      this.o00OooO0 = 0;
      scrollTo(0, 0);
    }
    localObject1 = this.o00Ooo0o;
    this.o00Ooo0o = paramPagerAdapter;
    this.o00OoOoo = 0;
    if (paramPagerAdapter != null)
    {
      localObject2 = this.o00Ooooo;
      if (localObject2 == null)
      {
        localObject2 = new androidx/viewpager/widget/ViewPager$PagerObserver;
        ((ViewPager.PagerObserver)localObject2).<init>(this);
        this.o00Ooooo = ((ViewPager.PagerObserver)localObject2);
      }
      localObject2 = this.o00Ooo0o;
      localObject3 = this.o00Ooooo;
      ((PagerAdapter)localObject2).setViewPagerObserver((DataSetObserver)localObject3);
      this.o00o00oO = false;
      boolean bool2 = this.o00o0oOO;
      boolean bool3 = true;
      this.o00o0oOO = bool3;
      Object localObject4 = this.o00Ooo0o;
      i1 = ((PagerAdapter)localObject4).getCount();
      this.o00OoOoo = i1;
      i1 = this.o00OooO;
      int n;
      if (i1 >= 0)
      {
        localObject2 = this.o00Ooo0o;
        localObject4 = this.o00OooOO;
        ClassLoader localClassLoader = this.o00OooOo;
        ((PagerAdapter)localObject2).OooOO0O((Parcelable)localObject4, localClassLoader);
        n = this.o00OooO;
        Oooo0oo(n, false, bool3);
        n = -1;
        this.o00OooO = n;
        this.o00OooOO = null;
        this.o00OooOo = null;
      }
      else if (n == 0)
      {
        Oooo000();
      }
      else
      {
        requestLayout();
      }
    }
    localList = this.o00oO000;
    if (localList != null)
    {
      bool1 = localList.isEmpty();
      if (!bool1)
      {
        localList = this.o00oO000;
        int i = localList.size();
        while (j < i)
        {
          localObject2 = (ViewPager.OnAdapterChangeListener)this.o00oO000.get(j);
          ((ViewPager.OnAdapterChangeListener)localObject2).onAdapterChanged(this, (PagerAdapter)localObject1, paramPagerAdapter);
          j += 1;
        }
      }
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    this.o00o00oO = false;
    boolean bool = this.o00o0oOO ^ true;
    Oooo0oo(paramInt, bool, false);
  }
  
  public void setCurrentItem(int paramInt, boolean paramBoolean)
  {
    this.o00o00oO = false;
    Oooo0oo(paramInt, paramBoolean, false);
  }
  
  public void setOffscreenPageLimit(int paramInt)
  {
    int i = 1;
    if (paramInt < i)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str1 = "Requested offscreen page limit ";
      localStringBuilder.append(str1);
      localStringBuilder.append(paramInt);
      String str2 = " too small; defaulting to ";
      localStringBuilder.append(str2);
      localStringBuilder.append(i);
      paramInt = i;
    }
    i = this.o00o00oo;
    if (paramInt != i)
    {
      this.o00o00oo = paramInt;
      Oooo000();
    }
  }
  
  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.o00o = paramOnPageChangeListener;
  }
  
  public void setPageMargin(int paramInt)
  {
    int i = this.o00o0000;
    this.o00o0000 = paramInt;
    int j = getWidth();
    Oooo00o(j, j, paramInt, i);
    requestLayout();
  }
  
  public void setPageMarginDrawable(int paramInt)
  {
    Drawable localDrawable = ContextCompat.OooO0o0(getContext(), paramInt);
    setPageMarginDrawable(localDrawable);
  }
  
  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    this.o00o000 = paramDrawable;
    if (paramDrawable != null) {
      refreshDrawableState();
    }
    boolean bool;
    if (paramDrawable == null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramDrawable = null;
    }
    setWillNotDraw(bool);
    invalidate();
  }
  
  public void setScrollState(int paramInt)
  {
    int i = this.o0oOOo;
    if (i == paramInt) {
      return;
    }
    this.o0oOOo = paramInt;
    ViewPager.PageTransformer localPageTransformer = this.o00oO00O;
    if (localPageTransformer != null)
    {
      if (paramInt != 0)
      {
        i = 1;
      }
      else
      {
        i = 0;
        localPageTransformer = null;
      }
      OooOOOO(i);
    }
    OooOOO0(paramInt);
  }
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool1 = super.verifyDrawable(paramDrawable);
    if (!bool1)
    {
      Drawable localDrawable = this.o00o000;
      if (paramDrawable != localDrawable)
      {
        bool2 = false;
        paramDrawable = null;
        break label34;
      }
    }
    boolean bool2 = true;
    label34:
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager.widget.ViewPager
 * JD-Core Version:    0.7.0.1
 */