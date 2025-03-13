package androidx.viewpager2.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.viewpager2.adapter.StatefulAdapter;

public final class ViewPager2
  extends ViewGroup
{
  public final Rect o00OoOoo;
  public CompositeOnPageChangeCallback o00Ooo0;
  public final Rect o00Ooo00;
  public int o00Ooo0O;
  public boolean o00Ooo0o;
  public LinearLayoutManager o00OooO;
  public RecyclerView.AdapterDataObserver o00OooO0;
  public int o00OooOO;
  public Parcelable o00OooOo;
  public PagerSnapHelper o00OoooO;
  public ScrollEventAdapter o00Ooooo;
  public boolean o00o00;
  public FakeDrag o00o000;
  public CompositeOnPageChangeCallback o00o0000;
  public PageTransformerAdapter o00o000O;
  public RecyclerView.ItemAnimator o00o000o;
  public int o00o00O0;
  public ViewPager2.AccessibilityProvider o00o00Oo;
  public RecyclerView o0O00o0;
  public boolean oo00oO;
  
  public final void OooO00o(RecyclerView.Adapter paramAdapter)
  {
    if (paramAdapter != null)
    {
      RecyclerView.AdapterDataObserver localAdapterDataObserver = this.o00OooO0;
      paramAdapter.registerAdapterDataObserver(localAdapterDataObserver);
    }
  }
  
  public void OooO0O0(ViewPager2.OnPageChangeCallback paramOnPageChangeCallback)
  {
    this.o00Ooo0.OooO00o(paramOnPageChangeCallback);
  }
  
  public void OooO0OO()
  {
    ViewPager2.PageTransformer localPageTransformer = this.o00o000O.getPageTransformer();
    if (localPageTransformer == null) {
      return;
    }
    double d1 = this.o00Ooooo.getRelativeScrollPosition();
    int i = (int)d1;
    double d2 = i;
    float f = (float)(d1 - d2);
    int j = Math.round(getPageSize() * f);
    this.o00o000O.onPageScrolled(i, f, j);
  }
  
  public final void OooO0Oo()
  {
    int i = this.o00OooOO;
    int j = -1;
    if (i == j) {
      return;
    }
    RecyclerView.Adapter localAdapter = getAdapter();
    if (localAdapter == null) {
      return;
    }
    Parcelable localParcelable = this.o00OooOo;
    if (localParcelable != null)
    {
      boolean bool = localAdapter instanceof StatefulAdapter;
      if (bool)
      {
        Object localObject = localAdapter;
        localObject = (StatefulAdapter)localAdapter;
        ((StatefulAdapter)localObject).OooO0OO(localParcelable);
      }
      k = 0;
      localParcelable = null;
      this.o00OooOo = null;
    }
    int k = this.o00OooOO;
    i = ((RecyclerView.Adapter)localAdapter).getItemCount() + -1;
    i = Math.min(k, i);
    i = Math.max(0, i);
    this.o00Ooo0O = i;
    this.o00OooOO = j;
    this.o0O00o0.scrollToPosition(i);
    this.o00o00Oo.OooOOO0();
  }
  
  public void OooO0o(ViewPager2.OnPageChangeCallback paramOnPageChangeCallback)
  {
    this.o00Ooo0.OooO0O0(paramOnPageChangeCallback);
  }
  
  public final void OooO0o0(RecyclerView.Adapter paramAdapter)
  {
    if (paramAdapter != null)
    {
      RecyclerView.AdapterDataObserver localAdapterDataObserver = this.o00OooO0;
      paramAdapter.unregisterAdapterDataObserver(localAdapterDataObserver);
    }
  }
  
  public void OooO0oO()
  {
    Object localObject1 = this.o00OoooO;
    if (localObject1 != null)
    {
      Object localObject2 = this.o00OooO;
      localObject1 = ((PagerSnapHelper)localObject1).OooO0oo((RecyclerView.LayoutManager)localObject2);
      if (localObject1 == null) {
        return;
      }
      localObject2 = this.o00OooO;
      int i = ((RecyclerView.LayoutManager)localObject2).getPosition((View)localObject1);
      int j = this.o00Ooo0O;
      if (i != j)
      {
        j = getScrollState();
        if (j == 0)
        {
          localObject2 = this.o00o0000;
          ((CompositeOnPageChangeCallback)localObject2).onPageSelected(i);
        }
      }
      this.o00Ooo0o = false;
      return;
    }
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("Design assumption violated.");
    throw ((Throwable)localObject1);
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    return this.o0O00o0.canScrollHorizontally(paramInt);
  }
  
  public boolean canScrollVertically(int paramInt)
  {
    return this.o0O00o0.canScrollVertically(paramInt);
  }
  
  public void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    int i = getId();
    Object localObject = (Parcelable)paramSparseArray.get(i);
    boolean bool = localObject instanceof ViewPager2.SavedState;
    if (bool)
    {
      localObject = (ViewPager2.SavedState)localObject;
      i = ((ViewPager2.SavedState)localObject).o00OoOoo;
      RecyclerView localRecyclerView = this.o0O00o0;
      int j = localRecyclerView.getId();
      Parcelable localParcelable = (Parcelable)paramSparseArray.get(i);
      paramSparseArray.put(j, localParcelable);
      paramSparseArray.remove(i);
    }
    super.dispatchRestoreInstanceState(paramSparseArray);
    OooO0Oo();
  }
  
  public CharSequence getAccessibilityClassName()
  {
    ViewPager2.AccessibilityProvider localAccessibilityProvider = this.o00o00Oo;
    boolean bool = localAccessibilityProvider.OooO00o();
    if (bool) {
      return this.o00o00Oo.OooO0oO();
    }
    return super.getAccessibilityClassName();
  }
  
  public RecyclerView.Adapter getAdapter()
  {
    return this.o0O00o0.getAdapter();
  }
  
  public int getCurrentItem()
  {
    return this.o00Ooo0O;
  }
  
  public RecyclerView.ItemDecoration getItemDecorationAt(int paramInt)
  {
    return this.o0O00o0.getItemDecorationAt(paramInt);
  }
  
  public int getItemDecorationCount()
  {
    return this.o0O00o0.getItemDecorationCount();
  }
  
  public int getOffscreenPageLimit()
  {
    return this.o00o00O0;
  }
  
  public int getOrientation()
  {
    LinearLayoutManager localLinearLayoutManager = this.o00OooO;
    int i = localLinearLayoutManager.getOrientation();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public int getPageSize()
  {
    RecyclerView localRecyclerView = this.o0O00o0;
    int i = getOrientation();
    int j;
    int k;
    if (i == 0)
    {
      i = localRecyclerView.getWidth();
      j = localRecyclerView.getPaddingLeft();
      i -= j;
      k = localRecyclerView.getPaddingRight();
    }
    else
    {
      i = localRecyclerView.getHeight();
      j = localRecyclerView.getPaddingTop();
      i -= j;
      k = localRecyclerView.getPaddingBottom();
    }
    return i - k;
  }
  
  public int getScrollState()
  {
    return this.o00Ooooo.getScrollState();
  }
  
  public boolean isFakeDragging()
  {
    return this.o00o000.isFakeDragging();
  }
  
  public boolean isRtl()
  {
    LinearLayoutManager localLinearLayoutManager = this.o00OooO;
    int i = localLinearLayoutManager.getLayoutDirection();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public boolean isUserInputEnabled()
  {
    return this.o00o00;
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    this.o00o00Oo.OooO0oo(paramAccessibilityNodeInfo);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = this.o0O00o0.getMeasuredWidth();
    RecyclerView localRecyclerView1 = this.o0O00o0;
    int i = localRecyclerView1.getMeasuredHeight();
    Rect localRect1 = this.o00OoOoo;
    int j = getPaddingLeft();
    localRect1.left = j;
    localRect1 = this.o00OoOoo;
    paramInt3 -= paramInt1;
    paramInt1 = getPaddingRight();
    paramInt3 -= paramInt1;
    localRect1.right = paramInt3;
    Rect localRect2 = this.o00OoOoo;
    paramInt3 = getPaddingTop();
    localRect2.top = paramInt3;
    localRect2 = this.o00OoOoo;
    paramInt4 -= paramInt2;
    paramInt2 = getPaddingBottom();
    paramInt4 -= paramInt2;
    localRect2.bottom = paramInt4;
    localRect2 = this.o00OoOoo;
    Rect localRect3 = this.o00Ooo00;
    Gravity.apply(8388659, paramBoolean, i, localRect2, localRect3);
    RecyclerView localRecyclerView2 = this.o0O00o0;
    localRect2 = this.o00Ooo00;
    paramInt2 = localRect2.left;
    paramInt3 = localRect2.top;
    paramInt4 = localRect2.right;
    paramInt1 = localRect2.bottom;
    localRecyclerView2.layout(paramInt2, paramInt3, paramInt4, paramInt1);
    paramBoolean = this.o00Ooo0o;
    if (paramBoolean) {
      OooO0oO();
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    RecyclerView localRecyclerView = this.o0O00o0;
    measureChild(localRecyclerView, paramInt1, paramInt2);
    int i = this.o0O00o0.getMeasuredWidth();
    int j = this.o0O00o0.getMeasuredHeight();
    int k = this.o0O00o0.getMeasuredState();
    int m = getPaddingLeft();
    int n = getPaddingRight();
    m += n;
    i += m;
    m = getPaddingTop();
    n = getPaddingBottom();
    m += n;
    j += m;
    m = getSuggestedMinimumWidth();
    i = Math.max(i, m);
    m = getSuggestedMinimumHeight();
    j = Math.max(j, m);
    paramInt1 = View.resolveSizeAndState(i, paramInt1, k);
    i = k << 16;
    paramInt2 = View.resolveSizeAndState(j, paramInt2, i);
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof ViewPager2.SavedState;
    if (!bool)
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (ViewPager2.SavedState)paramParcelable;
    Parcelable localParcelable = paramParcelable.getSuperState();
    super.onRestoreInstanceState(localParcelable);
    int i = paramParcelable.o00Ooo00;
    this.o00OooOO = i;
    paramParcelable = paramParcelable.o00Ooo0;
    this.o00OooOo = paramParcelable;
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object localObject = super.onSaveInstanceState();
    ViewPager2.SavedState localSavedState = new androidx/viewpager2/widget/ViewPager2$SavedState;
    localSavedState.<init>((Parcelable)localObject);
    localObject = this.o0O00o0;
    int i = ((View)localObject).getId();
    localSavedState.o00OoOoo = i;
    i = this.o00OooOO;
    int j = -1;
    if (i == j) {
      i = this.o00Ooo0O;
    }
    localSavedState.o00Ooo00 = i;
    localObject = this.o00OooOo;
    if (localObject != null) {}
    for (;;)
    {
      localSavedState.o00Ooo0 = ((Parcelable)localObject);
      break;
      localObject = this.o0O00o0.getAdapter();
      boolean bool = localObject instanceof StatefulAdapter;
      if (!bool) {
        break;
      }
      localObject = ((StatefulAdapter)localObject).OooO00o();
    }
    return localSavedState;
  }
  
  public void onViewAdded(View paramView)
  {
    paramView = new java/lang/IllegalStateException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = ViewPager2.class.getSimpleName();
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(" does not support direct child views");
    localObject = ((StringBuilder)localObject).toString();
    paramView.<init>((String)localObject);
    throw paramView;
  }
  
  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    ViewPager2.AccessibilityProvider localAccessibilityProvider = this.o00o00Oo;
    boolean bool = localAccessibilityProvider.OooO0OO(paramInt, paramBundle);
    if (bool) {
      return this.o00o00Oo.OooOO0o(paramInt, paramBundle);
    }
    return super.performAccessibilityAction(paramInt, paramBundle);
  }
  
  public void setAdapter(RecyclerView.Adapter paramAdapter)
  {
    RecyclerView.Adapter localAdapter = this.o0O00o0.getAdapter();
    this.o00o00Oo.OooO0o(localAdapter);
    OooO0o0(localAdapter);
    this.o0O00o0.setAdapter(paramAdapter);
    this.o00Ooo0O = 0;
    OooO0Oo();
    this.o00o00Oo.OooO0o0(paramAdapter);
    OooO00o(paramAdapter);
  }
  
  public void setCurrentItem(int paramInt)
  {
    setCurrentItem(paramInt, true);
  }
  
  public void setCurrentItem(int paramInt, boolean paramBoolean)
  {
    boolean bool = isFakeDragging();
    if (!bool)
    {
      setCurrentItemInternal(paramInt, paramBoolean);
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Cannot change current item when ViewPager2 is fake dragging");
    throw localIllegalStateException;
  }
  
  public void setCurrentItemInternal(int paramInt, boolean paramBoolean)
  {
    Object localObject = getAdapter();
    if (localObject == null)
    {
      paramBoolean = this.o00OooOO;
      boolean bool1 = true;
      if (paramBoolean != bool1)
      {
        paramInt = Math.max(paramInt, 0);
        this.o00OooOO = paramInt;
      }
      return;
    }
    int m = ((RecyclerView.Adapter)localObject).getItemCount();
    if (m <= 0) {
      return;
    }
    paramInt = Math.max(paramInt, 0);
    int i = ((RecyclerView.Adapter)localObject).getItemCount() + -1;
    paramInt = Math.min(paramInt, i);
    i = this.o00Ooo0O;
    if (paramInt == i)
    {
      localObject = this.o00Ooooo;
      boolean bool2 = ((ScrollEventAdapter)localObject).isIdle();
      if (bool2) {
        return;
      }
    }
    int j = this.o00Ooo0O;
    if ((paramInt == j) && (paramBoolean)) {
      return;
    }
    double d1 = j;
    this.o00Ooo0O = paramInt;
    this.o00o00Oo.OooOOo0();
    ScrollEventAdapter localScrollEventAdapter = this.o00Ooooo;
    boolean bool4 = localScrollEventAdapter.isIdle();
    if (!bool4)
    {
      localObject = this.o00Ooooo;
      d1 = ((ScrollEventAdapter)localObject).getRelativeScrollPosition();
    }
    localScrollEventAdapter = this.o00Ooooo;
    localScrollEventAdapter.OooO0o0(paramInt, paramBoolean);
    if (!paramBoolean)
    {
      this.o0O00o0.scrollToPosition(paramInt);
      return;
    }
    double d2 = paramInt;
    double d3 = Math.abs(d2 - d1);
    double d4 = 3.0D;
    paramBoolean = d3 < d4;
    RecyclerView localRecyclerView;
    if (paramBoolean)
    {
      localRecyclerView = this.o0O00o0;
      boolean bool3 = d2 < d1;
      int k;
      if (bool3) {
        k = paramInt + -3;
      } else {
        k = paramInt + 3;
      }
      localRecyclerView.scrollToPosition(k);
      localRecyclerView = this.o0O00o0;
      localObject = new androidx/viewpager2/widget/ViewPager2$SmoothScrollToPosition;
      ((ViewPager2.SmoothScrollToPosition)localObject).<init>(paramInt, localRecyclerView);
      localRecyclerView.post((Runnable)localObject);
    }
    else
    {
      localRecyclerView = this.o0O00o0;
      localRecyclerView.smoothScrollToPosition(paramInt);
    }
  }
  
  public void setLayoutDirection(int paramInt)
  {
    super.setLayoutDirection(paramInt);
    this.o00o00Oo.OooOOOo();
  }
  
  public void setOffscreenPageLimit(int paramInt)
  {
    int i = 1;
    if (paramInt < i)
    {
      i = -1;
      if (paramInt != i)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        throw localIllegalArgumentException;
      }
    }
    this.o00o00O0 = paramInt;
    this.o0O00o0.requestLayout();
  }
  
  public void setOrientation(int paramInt)
  {
    this.o00OooO.setOrientation(paramInt);
    this.o00o00Oo.OooOOo();
  }
  
  public void setPageTransformer(ViewPager2.PageTransformer paramPageTransformer)
  {
    ViewPager2.PageTransformer localPageTransformer = null;
    boolean bool = this.oo00oO;
    Object localObject;
    if (paramPageTransformer != null)
    {
      if (!bool)
      {
        localObject = this.o0O00o0.getItemAnimator();
        this.o00o000o = ((RecyclerView.ItemAnimator)localObject);
        bool = true;
        this.oo00oO = bool;
      }
      localObject = this.o0O00o0;
      ((RecyclerView)localObject).setItemAnimator(null);
    }
    else if (bool)
    {
      localObject = this.o0O00o0;
      RecyclerView.ItemAnimator localItemAnimator = this.o00o000o;
      ((RecyclerView)localObject).setItemAnimator(localItemAnimator);
      this.o00o000o = null;
      localPageTransformer = null;
      this.oo00oO = false;
    }
    localPageTransformer = this.o00o000O.getPageTransformer();
    if (paramPageTransformer == localPageTransformer) {
      return;
    }
    this.o00o000O.setPageTransformer(paramPageTransformer);
    OooO0OO();
  }
  
  public void setUserInputEnabled(boolean paramBoolean)
  {
    this.o00o00 = paramBoolean;
    this.o00o00Oo.OooOOoo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2
 * JD-Core Version:    0.7.0.1
 */