package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsSpinner;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.R.attr;
import androidx.appcompat.app.ActionBar.Tab;
import androidx.appcompat.view.ActionBarPolicy;

public class ScrollingTabContainerView
  extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  public static final Interpolator o00Ooooo;
  public Runnable o00OoOoo;
  public LinearLayoutCompat o00Ooo0;
  public ScrollingTabContainerView.TabClickListener o00Ooo00;
  public Spinner o00Ooo0O;
  public boolean o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  public final ScrollingTabContainerView.VisibilityAnimListener o00OoooO;
  public ViewPropertyAnimator o0O00o0;
  
  static
  {
    DecelerateInterpolator localDecelerateInterpolator = new android/view/animation/DecelerateInterpolator;
    localDecelerateInterpolator.<init>();
    o00Ooooo = localDecelerateInterpolator;
  }
  
  public ScrollingTabContainerView(Context paramContext)
  {
    super(paramContext);
    Object localObject = new androidx/appcompat/widget/ScrollingTabContainerView$VisibilityAnimListener;
    ((ScrollingTabContainerView.VisibilityAnimListener)localObject).<init>(this);
    this.o00OoooO = ((ScrollingTabContainerView.VisibilityAnimListener)localObject);
    setHorizontalScrollBarEnabled(false);
    paramContext = ActionBarPolicy.OooO0O0(paramContext);
    int i = paramContext.getTabContainerHeight();
    setContentHeight(i);
    int j = paramContext.getStackedTabMaxWidth();
    this.o00OooO = j;
    paramContext = OooO0OO();
    this.o00Ooo0 = paramContext;
    localObject = new android/view/ViewGroup$LayoutParams;
    ((ViewGroup.LayoutParams)localObject).<init>(-2, -1);
    addView(paramContext, (ViewGroup.LayoutParams)localObject);
  }
  
  private boolean isCollapsed()
  {
    Object localObject = this.o00Ooo0O;
    if (localObject != null)
    {
      localObject = ((View)localObject).getParent();
      if (localObject == this) {
        return true;
      }
    }
    boolean bool = false;
    localObject = null;
    return bool;
  }
  
  public void OooO00o(int paramInt)
  {
    View localView = this.o00Ooo0.getChildAt(paramInt);
    Object localObject = this.o00OoOoo;
    if (localObject != null) {
      removeCallbacks((Runnable)localObject);
    }
    localObject = new androidx/appcompat/widget/ScrollingTabContainerView$1;
    ((ScrollingTabContainerView.1)localObject).<init>(this, localView);
    this.o00OoOoo = ((Runnable)localObject);
    post((Runnable)localObject);
  }
  
  public final Spinner OooO0O0()
  {
    AppCompatSpinner localAppCompatSpinner = new androidx/appcompat/widget/AppCompatSpinner;
    Object localObject = getContext();
    int i = R.attr.actionDropDownStyle;
    localAppCompatSpinner.<init>((Context)localObject, null, i);
    localObject = new androidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
    ((LinearLayoutCompat.LayoutParams)localObject).<init>(-2, -1);
    localAppCompatSpinner.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localAppCompatSpinner.setOnItemSelectedListener(this);
    return localAppCompatSpinner;
  }
  
  public final LinearLayoutCompat OooO0OO()
  {
    LinearLayoutCompat localLinearLayoutCompat = new androidx/appcompat/widget/LinearLayoutCompat;
    Object localObject = getContext();
    int i = R.attr.actionBarTabBarStyle;
    localLinearLayoutCompat.<init>((Context)localObject, null, i);
    localLinearLayoutCompat.setMeasureWithLargestChildEnabled(true);
    localLinearLayoutCompat.setGravity(17);
    localObject = new androidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
    ((LinearLayoutCompat.LayoutParams)localObject).<init>(-2, -1);
    localLinearLayoutCompat.setLayoutParams((ViewGroup.LayoutParams)localObject);
    return localLinearLayoutCompat;
  }
  
  public ScrollingTabContainerView.TabView OooO0Oo(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    ScrollingTabContainerView.TabView localTabView = new androidx/appcompat/widget/ScrollingTabContainerView$TabView;
    Context localContext = getContext();
    localTabView.<init>(this, localContext, paramTab, paramBoolean);
    boolean bool;
    if (paramBoolean)
    {
      bool = false;
      localTabView.setBackgroundDrawable(null);
      paramTab = new android/widget/AbsListView$LayoutParams;
      paramBoolean = true;
      int i = this.o00OooOO;
      paramTab.<init>(paramBoolean, i);
      localTabView.setLayoutParams(paramTab);
    }
    else
    {
      bool = true;
      localTabView.setFocusable(bool);
      paramTab = this.o00Ooo00;
      if (paramTab == null)
      {
        paramTab = new androidx/appcompat/widget/ScrollingTabContainerView$TabClickListener;
        paramTab.<init>(this);
        this.o00Ooo00 = paramTab;
      }
      paramTab = this.o00Ooo00;
      localTabView.setOnClickListener(paramTab);
    }
    return localTabView;
  }
  
  public final boolean OooO0o()
  {
    boolean bool = isCollapsed();
    if (!bool) {
      return false;
    }
    Object localObject = this.o00Ooo0O;
    removeView((View)localObject);
    localObject = this.o00Ooo0;
    ViewGroup.LayoutParams localLayoutParams = new android/view/ViewGroup$LayoutParams;
    localLayoutParams.<init>(-2, -1);
    addView((View)localObject, localLayoutParams);
    int i = this.o00Ooo0O.getSelectedItemPosition();
    setTabSelected(i);
    return false;
  }
  
  public final void OooO0o0()
  {
    boolean bool = isCollapsed();
    if (bool) {
      return;
    }
    Object localObject1 = this.o00Ooo0O;
    if (localObject1 == null)
    {
      localObject1 = OooO0O0();
      this.o00Ooo0O = ((Spinner)localObject1);
    }
    localObject1 = this.o00Ooo0;
    removeView((View)localObject1);
    localObject1 = this.o00Ooo0O;
    Object localObject2 = new android/view/ViewGroup$LayoutParams;
    int i = -2;
    int j = -1;
    ((ViewGroup.LayoutParams)localObject2).<init>(i, j);
    addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    localObject1 = this.o00Ooo0O.getAdapter();
    if (localObject1 == null)
    {
      localObject1 = this.o00Ooo0O;
      localObject2 = new androidx/appcompat/widget/ScrollingTabContainerView$TabAdapter;
      ((ScrollingTabContainerView.TabAdapter)localObject2).<init>(this);
      ((Spinner)localObject1).setAdapter((SpinnerAdapter)localObject2);
    }
    localObject1 = this.o00OoOoo;
    if (localObject1 != null)
    {
      removeCallbacks((Runnable)localObject1);
      bool = false;
      localObject1 = null;
      this.o00OoOoo = null;
    }
    localObject1 = this.o00Ooo0O;
    int k = this.o00OooOo;
    ((AdapterView)localObject1).setSelection(k);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Runnable localRunnable = this.o00OoOoo;
    if (localRunnable != null) {
      post(localRunnable);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = ActionBarPolicy.OooO0O0(getContext());
    int i = paramConfiguration.getTabContainerHeight();
    setContentHeight(i);
    int j = paramConfiguration.getStackedTabMaxWidth();
    this.o00OooO = j;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Runnable localRunnable = this.o00OoOoo;
    if (localRunnable != null) {
      removeCallbacks(localRunnable);
    }
  }
  
  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ((ScrollingTabContainerView.TabView)paramView).getTab().OooO00o();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = View.MeasureSpec.getMode(paramInt1);
    int i = 1;
    int j = 0;
    int k = 1073741824;
    int m;
    if (paramInt2 == k) {
      m = i;
    } else {
      m = 0;
    }
    setFillViewport(m);
    LinearLayoutCompat localLinearLayoutCompat1 = this.o00Ooo0;
    int n = localLinearLayoutCompat1.getChildCount();
    if (n > i) {
      if (paramInt2 != k)
      {
        int i1 = -1 << -1;
        if (paramInt2 != i1) {}
      }
      else
      {
        paramInt2 = 2;
        f1 = 2.802597E-045F;
        if (n > paramInt2)
        {
          f1 = View.MeasureSpec.getSize(paramInt1);
          n = 1053609165;
          float f2 = 0.4F;
          f1 *= f2;
          paramInt2 = (int)f1;
          this.o00OooO0 = paramInt2;
        }
        else
        {
          n = View.MeasureSpec.getSize(paramInt1) / paramInt2;
          this.o00OooO0 = n;
        }
        paramInt2 = this.o00OooO0;
        n = this.o00OooO;
        paramInt2 = Math.min(paramInt2, n);
        break label159;
      }
    }
    paramInt2 = -1;
    float f1 = 0.0F / 0.0F;
    label159:
    this.o00OooO0 = paramInt2;
    paramInt2 = View.MeasureSpec.makeMeasureSpec(this.o00OooOO, k);
    LinearLayoutCompat localLinearLayoutCompat2;
    if (m == 0)
    {
      boolean bool = this.o00Ooo0o;
      if (bool) {}
    }
    else
    {
      i = 0;
      localLinearLayoutCompat2 = null;
    }
    if (i != 0)
    {
      this.o00Ooo0.measure(0, paramInt2);
      localLinearLayoutCompat2 = this.o00Ooo0;
      i = localLinearLayoutCompat2.getMeasuredWidth();
      j = View.MeasureSpec.getSize(paramInt1);
      if (i > j)
      {
        OooO0o0();
        break label247;
      }
    }
    OooO0o();
    label247:
    i = getMeasuredWidth();
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = getMeasuredWidth();
    if ((m != 0) && (i != paramInt1))
    {
      paramInt1 = this.o00OooOo;
      setTabSelected(paramInt1);
    }
  }
  
  public void onNothingSelected(AdapterView paramAdapterView) {}
  
  public void setAllowCollapse(boolean paramBoolean)
  {
    this.o00Ooo0o = paramBoolean;
  }
  
  public void setContentHeight(int paramInt)
  {
    this.o00OooOO = paramInt;
    requestLayout();
  }
  
  public void setTabSelected(int paramInt)
  {
    this.o00OooOo = paramInt;
    Object localObject = this.o00Ooo0;
    int i = ((ViewGroup)localObject).getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = this.o00Ooo0.getChildAt(j);
      boolean bool;
      if (j == paramInt) {
        bool = true;
      } else {
        bool = false;
      }
      localView.setSelected(bool);
      if (bool) {
        OooO00o(paramInt);
      }
      j += 1;
    }
    localObject = this.o00Ooo0O;
    if ((localObject != null) && (paramInt >= 0)) {
      ((AdapterView)localObject).setSelection(paramInt);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView
 * JD-Core Version:    0.7.0.1
 */