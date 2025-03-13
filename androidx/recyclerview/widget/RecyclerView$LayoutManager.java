package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.recyclerview.R.styleable;
import java.util.ArrayList;

public abstract class RecyclerView$LayoutManager
{
  boolean mAutoMeasure;
  ChildHelper mChildHelper;
  private int mHeight;
  private int mHeightMode;
  ViewBoundsCheck mHorizontalBoundCheck;
  private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
  boolean mIsAttachedToWindow;
  private boolean mItemPrefetchEnabled;
  private boolean mMeasurementCacheEnabled;
  int mPrefetchMaxCountObserved;
  boolean mPrefetchMaxObservedInInitialPrefetch;
  RecyclerView mRecyclerView;
  boolean mRequestedSimpleAnimations;
  RecyclerView.SmoothScroller mSmoothScroller;
  ViewBoundsCheck mVerticalBoundCheck;
  private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
  private int mWidth;
  private int mWidthMode;
  
  public RecyclerView$LayoutManager()
  {
    Object localObject = new androidx/recyclerview/widget/RecyclerView$LayoutManager$1;
    ((RecyclerView.LayoutManager.1)localObject).<init>(this);
    this.mHorizontalBoundCheckCallback = ((ViewBoundsCheck.Callback)localObject);
    RecyclerView.LayoutManager.2 local2 = new androidx/recyclerview/widget/RecyclerView$LayoutManager$2;
    local2.<init>(this);
    this.mVerticalBoundCheckCallback = local2;
    ViewBoundsCheck localViewBoundsCheck = new androidx/recyclerview/widget/ViewBoundsCheck;
    localViewBoundsCheck.<init>((ViewBoundsCheck.Callback)localObject);
    this.mHorizontalBoundCheck = localViewBoundsCheck;
    localObject = new androidx/recyclerview/widget/ViewBoundsCheck;
    ((ViewBoundsCheck)localObject).<init>(local2);
    this.mVerticalBoundCheck = ((ViewBoundsCheck)localObject);
    this.mRequestedSimpleAnimations = false;
    this.mIsAttachedToWindow = false;
    this.mAutoMeasure = false;
    boolean bool = true;
    this.mMeasurementCacheEnabled = bool;
    this.mItemPrefetchEnabled = bool;
  }
  
  public static boolean OooO0o0(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    boolean bool1 = false;
    if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {
      return false;
    }
    paramInt3 = -1 << -1;
    boolean bool2 = true;
    if (i != paramInt3)
    {
      if (i != 0)
      {
        paramInt3 = 1073741824;
        if (i != paramInt3) {
          return false;
        }
        if (paramInt2 == paramInt1) {
          bool1 = bool2;
        }
        return bool1;
      }
      return bool2;
    }
    if (paramInt2 >= paramInt1) {
      bool1 = bool2;
    }
    return bool1;
  }
  
  public static int chooseSize(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = -1 << -1;
    if (i != j)
    {
      j = 1073741824;
      if (i != j) {
        paramInt1 = Math.max(paramInt2, paramInt3);
      }
      return paramInt1;
    }
    paramInt2 = Math.max(paramInt2, paramInt3);
    return Math.min(paramInt1, paramInt2);
  }
  
  public static int getChildMeasureSpec(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    paramInt1 -= paramInt3;
    paramInt3 = 0;
    paramInt1 = Math.max(0, paramInt1);
    int i = -2;
    int j = -1;
    int k = -1 << -1;
    int m = 1073741824;
    if (paramBoolean)
    {
      if (paramInt4 < 0)
      {
        if (paramInt4 != j) {
          break label122;
        }
        if (paramInt2 == k) {
          break label81;
        }
        if (paramInt2 == 0) {
          break label122;
        }
        if (paramInt2 == m) {
          break label81;
        }
        break label122;
      }
    }
    else {
      if (paramInt4 < 0) {
        break label75;
      }
    }
    paramInt2 = m;
    break label126;
    label75:
    if (paramInt4 == j)
    {
      label81:
      paramInt4 = paramInt1;
    }
    else if (paramInt4 == i)
    {
      if ((paramInt2 != k) && (paramInt2 != m))
      {
        paramInt4 = paramInt1;
        paramInt2 = 0;
      }
      else
      {
        paramInt4 = paramInt1;
        paramInt2 = k;
      }
    }
    else
    {
      label122:
      paramInt2 = 0;
      paramInt4 = 0;
    }
    label126:
    return View.MeasureSpec.makeMeasureSpec(paramInt4, paramInt2);
  }
  
  public static int getChildMeasureSpec(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    paramInt1 -= paramInt2;
    paramInt2 = 0;
    paramInt1 = Math.max(0, paramInt1);
    int i = 1073741824;
    if (paramBoolean) {
      if (paramInt3 >= 0) {
        break label36;
      }
    }
    label36:
    do
    {
      paramInt3 = 0;
      break;
      if (paramInt3 >= 0) {}
      for (;;)
      {
        paramInt2 = i;
        break label68;
        paramBoolean = true;
        if (paramInt3 != paramBoolean) {
          break;
        }
        paramInt3 = paramInt1;
      }
      paramBoolean = true;
    } while (paramInt3 != paramBoolean);
    paramInt2 = -1 << -1;
    paramInt3 = paramInt1;
    label68:
    return View.MeasureSpec.makeMeasureSpec(paramInt3, paramInt2);
  }
  
  public static RecyclerView.LayoutManager.Properties getProperties(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutManager.Properties localProperties = new androidx/recyclerview/widget/RecyclerView$LayoutManager$Properties;
    localProperties.<init>();
    int[] arrayOfInt = R.styleable.RecyclerView;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt1, paramInt2);
    int i = R.styleable.RecyclerView_android_orientation;
    paramInt1 = 1;
    i = paramContext.getInt(i, paramInt1);
    localProperties.OooO00o = i;
    i = R.styleable.RecyclerView_spanCount;
    i = paramContext.getInt(i, paramInt1);
    localProperties.OooO0O0 = i;
    i = R.styleable.RecyclerView_reverseLayout;
    boolean bool1 = paramContext.getBoolean(i, false);
    localProperties.OooO0OO = bool1;
    int j = R.styleable.RecyclerView_stackFromEnd;
    boolean bool2 = paramContext.getBoolean(j, false);
    localProperties.OooO0Oo = bool2;
    paramContext.recycle();
    return localProperties;
  }
  
  public final void OooO00o(View paramView, int paramInt, boolean paramBoolean)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    if (!paramBoolean)
    {
      paramBoolean = localViewHolder.isRemoved();
      if (!paramBoolean)
      {
        localObject1 = this.mRecyclerView.mViewInfoStore;
        ((ViewInfoStore)localObject1).OooOOOo(localViewHolder);
        break label58;
      }
    }
    Object localObject1 = this.mRecyclerView.mViewInfoStore;
    ((ViewInfoStore)localObject1).OooO0O0(localViewHolder);
    label58:
    localObject1 = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    boolean bool1 = localViewHolder.wasReturnedFromScrap();
    Object localObject4;
    if (!bool1)
    {
      bool1 = localViewHolder.isScrap();
      if (!bool1)
      {
        localObject2 = paramView.getParent();
        localObject3 = this.mRecyclerView;
        if (localObject2 == localObject3)
        {
          localObject2 = this.mChildHelper;
          int i = ((ChildHelper)localObject2).OooO0oo(paramView);
          int j = -1;
          if (paramInt == j)
          {
            localObject4 = this.mChildHelper;
            paramInt = ((ChildHelper)localObject4).getChildCount();
          }
          if (i != j)
          {
            if (i == paramInt) {
              break label355;
            }
            paramView = this.mRecyclerView.mLayout;
            paramView.moveView(i, paramInt);
            break label355;
          }
          localObject4 = new java/lang/IllegalStateException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
          int k = this.mRecyclerView.indexOfChild(paramView);
          ((StringBuilder)localObject1).append(k);
          paramView = this.mRecyclerView.exceptionLabel();
          ((StringBuilder)localObject1).append(paramView);
          paramView = ((StringBuilder)localObject1).toString();
          ((IllegalStateException)localObject4).<init>(paramView);
          throw ((Throwable)localObject4);
        }
        localObject2 = this.mChildHelper;
        ((ChildHelper)localObject2).OooO00o(paramView, paramInt, false);
        paramInt = 1;
        ((RecyclerView.LayoutParams)localObject1).OooO0OO = paramInt;
        localObject4 = this.mSmoothScroller;
        if (localObject4 == null) {
          break label355;
        }
        paramInt = ((RecyclerView.SmoothScroller)localObject4).isRunning();
        if (paramInt == 0) {
          break label355;
        }
        localObject4 = this.mSmoothScroller;
        ((RecyclerView.SmoothScroller)localObject4).onChildAttachedToWindow(paramView);
        break label355;
      }
    }
    boolean bool2 = localViewHolder.isScrap();
    if (bool2) {
      localViewHolder.unScrap();
    } else {
      localViewHolder.clearReturnedFromScrapFlag();
    }
    Object localObject2 = this.mChildHelper;
    Object localObject3 = paramView.getLayoutParams();
    ((ChildHelper)localObject2).OooO0OO(paramView, paramInt, (ViewGroup.LayoutParams)localObject3, false);
    label355:
    boolean bool3 = ((RecyclerView.LayoutParams)localObject1).OooO0Oo;
    if (bool3)
    {
      bool3 = RecyclerView.sVerboseLoggingEnabled;
      if (bool3)
      {
        paramView = new java/lang/StringBuilder;
        paramView.<init>();
        paramView.append("consuming pending invalidate on child ");
        localObject4 = ((RecyclerView.LayoutParams)localObject1).OooO00o;
        paramView.append(localObject4);
      }
      paramView = localViewHolder.itemView;
      paramView.invalidate();
      ((RecyclerView.LayoutParams)localObject1).OooO0Oo = false;
    }
  }
  
  public final void OooO0O0(int paramInt, View paramView)
  {
    this.mChildHelper.OooO0Oo(paramInt);
  }
  
  public final int[] OooO0OO(View paramView, Rect paramRect)
  {
    int i = 2;
    int[] arrayOfInt = new int[i];
    int j = getPaddingLeft();
    int k = getPaddingTop();
    int m = getWidth();
    int n = getPaddingRight();
    m -= n;
    n = getHeight();
    int i1 = getPaddingBottom();
    n -= i1;
    i1 = paramView.getLeft();
    int i2 = paramRect.left;
    i1 += i2;
    i2 = paramView.getScrollX();
    i1 -= i2;
    i2 = paramView.getTop();
    int i3 = paramRect.top;
    i2 += i3;
    int i4 = paramView.getScrollY();
    i2 -= i4;
    i4 = paramRect.width() + i1;
    int i5 = paramRect.height() + i2;
    i1 -= j;
    j = 0;
    i3 = Math.min(0, i1);
    i2 -= k;
    k = Math.min(0, i2);
    i4 -= m;
    m = Math.max(0, i4);
    i5 -= n;
    i5 = Math.max(0, i5);
    n = getLayoutDirection();
    int i6 = 1;
    if (n == i6)
    {
      if (m == 0) {
        m = Math.max(i3, i4);
      }
    }
    else
    {
      if (i3 == 0) {
        i3 = Math.min(i1, m);
      }
      m = i3;
    }
    if (k == 0) {
      k = Math.min(i2, i5);
    }
    arrayOfInt[0] = m;
    arrayOfInt[i6] = k;
    return arrayOfInt;
  }
  
  public final boolean OooO0Oo(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    paramRecyclerView = paramRecyclerView.getFocusedChild();
    if (paramRecyclerView == null) {
      return false;
    }
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = getWidth();
    int m = getPaddingRight();
    k -= m;
    m = getHeight();
    int n = getPaddingBottom();
    m -= n;
    Rect localRect = this.mRecyclerView.mTempRect;
    getDecoratedBoundsWithMargins(paramRecyclerView, localRect);
    int i1 = localRect.left - paramInt1;
    if (i1 < k)
    {
      i1 = localRect.right - paramInt1;
      if (i1 > i)
      {
        i1 = localRect.top - paramInt2;
        if (i1 < m)
        {
          i1 = localRect.bottom - paramInt2;
          if (i1 > j) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public final void OooO0o(RecyclerView.Recycler paramRecycler, int paramInt, View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    boolean bool1 = localViewHolder.shouldIgnore();
    if (bool1)
    {
      boolean bool2 = RecyclerView.sVerboseLoggingEnabled;
      if (bool2)
      {
        paramRecycler = new java/lang/StringBuilder;
        paramRecycler.<init>();
        String str = "ignoring view ";
        paramRecycler.append(str);
        paramRecycler.append(localViewHolder);
      }
      return;
    }
    bool1 = localViewHolder.isInvalid();
    if (bool1)
    {
      bool1 = localViewHolder.isRemoved();
      if (!bool1)
      {
        RecyclerView.Adapter localAdapter = this.mRecyclerView.mAdapter;
        bool1 = localAdapter.hasStableIds();
        if (!bool1)
        {
          removeViewAt(paramInt);
          paramRecycler.OooOoo0(localViewHolder);
          return;
        }
      }
    }
    detachViewAt(paramInt);
    paramRecycler.OooOoo(paramView);
    paramRecycler = this.mRecyclerView.mViewInfoStore;
    paramRecycler.OooOO0O(localViewHolder);
  }
  
  public void addDisappearingView(View paramView)
  {
    addDisappearingView(paramView, -1);
  }
  
  public void addDisappearingView(View paramView, int paramInt)
  {
    OooO00o(paramView, paramInt, true);
  }
  
  public void addView(View paramView)
  {
    addView(paramView, -1);
  }
  
  public void addView(View paramView, int paramInt)
  {
    OooO00o(paramView, paramInt, false);
  }
  
  public void assertInLayoutOrScroll(String paramString)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null) {
      localRecyclerView.assertInLayoutOrScroll(paramString);
    }
  }
  
  public void assertNotInLayoutOrScroll(String paramString)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null) {
      localRecyclerView.assertNotInLayoutOrScroll(paramString);
    }
  }
  
  public void attachView(View paramView)
  {
    attachView(paramView, -1);
  }
  
  public void attachView(View paramView, int paramInt)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    attachView(paramView, paramInt, localLayoutParams);
  }
  
  public void attachView(View paramView, int paramInt, RecyclerView.LayoutParams paramLayoutParams)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    boolean bool1 = localViewHolder.isRemoved();
    if (bool1)
    {
      localObject = this.mRecyclerView.mViewInfoStore;
      ((ViewInfoStore)localObject).OooO0O0(localViewHolder);
    }
    else
    {
      localObject = this.mRecyclerView.mViewInfoStore;
      ((ViewInfoStore)localObject).OooOOOo(localViewHolder);
    }
    Object localObject = this.mChildHelper;
    boolean bool2 = localViewHolder.isRemoved();
    ((ChildHelper)localObject).OooO0OO(paramView, paramInt, paramLayoutParams, bool2);
  }
  
  public void calculateItemDecorationsForChild(View paramView, Rect paramRect)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView == null)
    {
      paramRect.set(0, 0, 0, 0);
      return;
    }
    paramView = localRecyclerView.getItemDecorInsetsForChild(paramView);
    paramRect.set(paramView);
  }
  
  public boolean canScrollHorizontally()
  {
    return false;
  }
  
  public boolean canScrollVertically()
  {
    return false;
  }
  
  public boolean checkLayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (paramLayoutParams != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramLayoutParams = null;
    }
    return bool;
  }
  
  public void collectAdjacentPrefetchPositions(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry) {}
  
  public void collectInitialPrefetchPositions(int paramInt, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry) {}
  
  public int computeHorizontalScrollExtent(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeHorizontalScrollOffset(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeHorizontalScrollRange(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeVerticalScrollExtent(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeVerticalScrollOffset(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeVerticalScrollRange(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public void detachAndScrapAttachedViews(RecyclerView.Recycler paramRecycler)
  {
    int i = getChildCount() + -1;
    while (i >= 0)
    {
      View localView = getChildAt(i);
      OooO0o(paramRecycler, i, localView);
      i += -1;
    }
  }
  
  public void detachAndScrapView(View paramView, RecyclerView.Recycler paramRecycler)
  {
    int i = this.mChildHelper.OooO0oo(paramView);
    OooO0o(paramRecycler, i, paramView);
  }
  
  public void detachAndScrapViewAt(int paramInt, RecyclerView.Recycler paramRecycler)
  {
    View localView = getChildAt(paramInt);
    OooO0o(paramRecycler, paramInt, localView);
  }
  
  public void detachView(View paramView)
  {
    ChildHelper localChildHelper = this.mChildHelper;
    int i = localChildHelper.OooO0oo(paramView);
    if (i >= 0) {
      OooO0O0(i, paramView);
    }
  }
  
  public void detachViewAt(int paramInt)
  {
    View localView = getChildAt(paramInt);
    OooO0O0(paramInt, localView);
  }
  
  public void dispatchAttachedToWindow(RecyclerView paramRecyclerView)
  {
    this.mIsAttachedToWindow = true;
    onAttachedToWindow(paramRecyclerView);
  }
  
  public void dispatchDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    this.mIsAttachedToWindow = false;
    onDetachedFromWindow(paramRecyclerView, paramRecycler);
  }
  
  public void endAnimation(View paramView)
  {
    RecyclerView.ItemAnimator localItemAnimator = this.mRecyclerView.mItemAnimator;
    if (localItemAnimator != null)
    {
      paramView = RecyclerView.getChildViewHolderInt(paramView);
      localItemAnimator.OooOO0(paramView);
    }
  }
  
  public View findContainingItemView(View paramView)
  {
    Object localObject = this.mRecyclerView;
    if (localObject == null) {
      return null;
    }
    paramView = ((RecyclerView)localObject).findContainingItemView(paramView);
    if (paramView == null) {
      return null;
    }
    localObject = this.mChildHelper;
    boolean bool = ((ChildHelper)localObject).OooO(paramView);
    if (bool) {
      return null;
    }
    return paramView;
  }
  
  public View findViewByPosition(int paramInt)
  {
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(localView);
      if (localViewHolder != null)
      {
        int k = localViewHolder.getLayoutPosition();
        if (k == paramInt)
        {
          boolean bool1 = localViewHolder.shouldIgnore();
          if (!bool1)
          {
            RecyclerView.State localState = this.mRecyclerView.mState;
            bool1 = localState.isPreLayout();
            if (!bool1)
            {
              boolean bool2 = localViewHolder.isRemoved();
              if (bool2) {}
            }
            else
            {
              return localView;
            }
          }
        }
      }
      j += 1;
    }
    return null;
  }
  
  public abstract RecyclerView.LayoutParams generateDefaultLayoutParams();
  
  public RecyclerView.LayoutParams generateLayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    RecyclerView.LayoutParams localLayoutParams = new androidx/recyclerview/widget/RecyclerView$LayoutParams;
    localLayoutParams.<init>(paramContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof RecyclerView.LayoutParams;
    if (bool)
    {
      localLayoutParams = new androidx/recyclerview/widget/RecyclerView$LayoutParams;
      paramLayoutParams = (RecyclerView.LayoutParams)paramLayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
      return localLayoutParams;
    }
    bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
    if (bool)
    {
      localLayoutParams = new androidx/recyclerview/widget/RecyclerView$LayoutParams;
      paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
      return localLayoutParams;
    }
    RecyclerView.LayoutParams localLayoutParams = new androidx/recyclerview/widget/RecyclerView$LayoutParams;
    localLayoutParams.<init>(paramLayoutParams);
    return localLayoutParams;
  }
  
  public int getBaseline()
  {
    return -1;
  }
  
  public int getBottomDecorationHeight(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).OooO0O0.bottom;
  }
  
  public View getChildAt(int paramInt)
  {
    ChildHelper localChildHelper = this.mChildHelper;
    View localView;
    if (localChildHelper != null)
    {
      localView = localChildHelper.getChildAt(paramInt);
    }
    else
    {
      paramInt = 0;
      localView = null;
    }
    return localView;
  }
  
  public int getChildCount()
  {
    ChildHelper localChildHelper = this.mChildHelper;
    int i;
    if (localChildHelper != null)
    {
      i = localChildHelper.getChildCount();
    }
    else
    {
      i = 0;
      localChildHelper = null;
    }
    return i;
  }
  
  public boolean getClipToPadding()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null)
    {
      bool = localRecyclerView.mClipToPadding;
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localRecyclerView = null;
    return bool;
  }
  
  public int getColumnCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return -1;
  }
  
  public int getDecoratedBottom(View paramView)
  {
    int i = paramView.getBottom();
    int j = getBottomDecorationHeight(paramView);
    return i + j;
  }
  
  public void getDecoratedBoundsWithMargins(View paramView, Rect paramRect)
  {
    RecyclerView.getDecoratedBoundsWithMarginsInt(paramView, paramRect);
  }
  
  public int getDecoratedLeft(View paramView)
  {
    int i = paramView.getLeft();
    int j = getLeftDecorationWidth(paramView);
    return i - j;
  }
  
  public int getDecoratedMeasuredHeight(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).OooO0O0;
    int i = paramView.getMeasuredHeight();
    int j = localRect.top;
    i += j;
    int k = localRect.bottom;
    return i + k;
  }
  
  public int getDecoratedMeasuredWidth(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).OooO0O0;
    int i = paramView.getMeasuredWidth();
    int j = localRect.left;
    i += j;
    int k = localRect.right;
    return i + k;
  }
  
  public int getDecoratedRight(View paramView)
  {
    int i = paramView.getRight();
    int j = getRightDecorationWidth(paramView);
    return i + j;
  }
  
  public int getDecoratedTop(View paramView)
  {
    int i = paramView.getTop();
    int j = getTopDecorationHeight(paramView);
    return i - j;
  }
  
  public View getFocusedChild()
  {
    Object localObject = this.mRecyclerView;
    if (localObject == null) {
      return null;
    }
    localObject = ((ViewGroup)localObject).getFocusedChild();
    if (localObject != null)
    {
      ChildHelper localChildHelper = this.mChildHelper;
      boolean bool = localChildHelper.OooO((View)localObject);
      if (!bool) {
        return localObject;
      }
    }
    return null;
  }
  
  public int getHeight()
  {
    return this.mHeight;
  }
  
  public int getHeightMode()
  {
    return this.mHeightMode;
  }
  
  public int getItemCount()
  {
    Object localObject = this.mRecyclerView;
    int i;
    if (localObject != null)
    {
      localObject = ((RecyclerView)localObject).getAdapter();
    }
    else
    {
      i = 0;
      localObject = null;
    }
    if (localObject != null)
    {
      i = ((RecyclerView.Adapter)localObject).getItemCount();
    }
    else
    {
      i = 0;
      localObject = null;
    }
    return i;
  }
  
  public int getItemViewType(View paramView)
  {
    return RecyclerView.getChildViewHolderInt(paramView).getItemViewType();
  }
  
  public int getLayoutDirection()
  {
    return ViewCompat.OooOoOO(this.mRecyclerView);
  }
  
  public int getLeftDecorationWidth(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).OooO0O0.left;
  }
  
  public int getMinimumHeight()
  {
    return ViewCompat.OooOoo0(this.mRecyclerView);
  }
  
  public int getMinimumWidth()
  {
    return ViewCompat.OooOoo(this.mRecyclerView);
  }
  
  public int getPaddingBottom()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      i = localRecyclerView.getPaddingBottom();
    }
    else
    {
      i = 0;
      localRecyclerView = null;
    }
    return i;
  }
  
  public int getPaddingEnd()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      i = ViewCompat.OooOooo(localRecyclerView);
    }
    else
    {
      i = 0;
      localRecyclerView = null;
    }
    return i;
  }
  
  public int getPaddingLeft()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      i = localRecyclerView.getPaddingLeft();
    }
    else
    {
      i = 0;
      localRecyclerView = null;
    }
    return i;
  }
  
  public int getPaddingRight()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      i = localRecyclerView.getPaddingRight();
    }
    else
    {
      i = 0;
      localRecyclerView = null;
    }
    return i;
  }
  
  public int getPaddingStart()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      i = ViewCompat.Oooo000(localRecyclerView);
    }
    else
    {
      i = 0;
      localRecyclerView = null;
    }
    return i;
  }
  
  public int getPaddingTop()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      i = localRecyclerView.getPaddingTop();
    }
    else
    {
      i = 0;
      localRecyclerView = null;
    }
    return i;
  }
  
  public int getPosition(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).getViewLayoutPosition();
  }
  
  public int getRightDecorationWidth(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).OooO0O0.right;
  }
  
  public int getRowCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return -1;
  }
  
  public int getSelectionModeForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int getTopDecorationHeight(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).OooO0O0.top;
  }
  
  public void getTransformedBoundingBox(View paramView, boolean paramBoolean, Rect paramRect)
  {
    int i;
    int k;
    int m;
    float f1;
    if (paramBoolean)
    {
      localObject = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).OooO0O0;
      i = -((Rect)localObject).left;
      k = -((Rect)localObject).top;
      m = paramView.getWidth();
      boolean bool2 = ((Rect)localObject).right;
      m += bool2;
      bool2 = paramView.getHeight();
      paramBoolean = ((Rect)localObject).bottom;
      int n;
      bool2 += paramBoolean;
      paramRect.set(i, k, m, n);
    }
    else
    {
      paramBoolean = paramView.getWidth();
      i = paramView.getHeight();
      k = 0;
      f1 = 0.0F;
      paramRect.set(0, 0, paramBoolean, i);
    }
    Object localObject = this.mRecyclerView;
    if (localObject != null)
    {
      localObject = paramView.getMatrix();
      if (localObject != null)
      {
        boolean bool1 = ((Matrix)localObject).isIdentity();
        if (!bool1)
        {
          RectF localRectF = this.mRecyclerView.mTempRectF;
          localRectF.set(paramRect);
          ((Matrix)localObject).mapRect(localRectF);
          float f2 = localRectF.left;
          paramBoolean = (int)Math.floor(f2);
          f1 = localRectF.top;
          double d1 = Math.floor(f1);
          k = (int)d1;
          float f3 = localRectF.right;
          double d2 = Math.ceil(f3);
          m = (int)d2;
          float f4 = localRectF.bottom;
          double d3 = Math.ceil(f4);
          int j = (int)d3;
          paramRect.set(paramBoolean, k, m, j);
        }
      }
    }
    paramBoolean = paramView.getLeft();
    int i1 = paramView.getTop();
    paramRect.offset(paramBoolean, i1);
  }
  
  public int getWidth()
  {
    return this.mWidth;
  }
  
  public int getWidthMode()
  {
    return this.mWidthMode;
  }
  
  public boolean hasFlexibleChildInBothOrientations()
  {
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      ViewGroup.LayoutParams localLayoutParams = getChildAt(j).getLayoutParams();
      int k = localLayoutParams.width;
      if (k < 0)
      {
        int m = localLayoutParams.height;
        if (m < 0) {
          return true;
        }
      }
      j += 1;
    }
    return false;
  }
  
  public boolean hasFocus()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null)
    {
      bool = localRecyclerView.hasFocus();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localRecyclerView = null;
    return bool;
  }
  
  public void ignoreView(View paramView)
  {
    Object localObject1 = paramView.getParent();
    Object localObject2 = this.mRecyclerView;
    if (localObject1 == localObject2)
    {
      int i = ((ViewGroup)localObject2).indexOfChild(paramView);
      int j = -1;
      if (i != j)
      {
        paramView = RecyclerView.getChildViewHolderInt(paramView);
        paramView.addFlags(128);
        this.mRecyclerView.mViewInfoStore.OooOOo0(paramView);
        return;
      }
    }
    paramView = new java/lang/IllegalArgumentException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("View should be fully attached to be ignored");
    localObject2 = this.mRecyclerView.exceptionLabel();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    paramView.<init>((String)localObject1);
    throw paramView;
  }
  
  public boolean isAttachedToWindow()
  {
    return this.mIsAttachedToWindow;
  }
  
  public boolean isAutoMeasureEnabled()
  {
    return this.mAutoMeasure;
  }
  
  public boolean isFocused()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null)
    {
      bool = localRecyclerView.isFocused();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localRecyclerView = null;
    return bool;
  }
  
  public final boolean isItemPrefetchEnabled()
  {
    return this.mItemPrefetchEnabled;
  }
  
  public boolean isLayoutHierarchical(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return false;
  }
  
  public boolean isMeasurementCacheEnabled()
  {
    return this.mMeasurementCacheEnabled;
  }
  
  public boolean isSmoothScrolling()
  {
    RecyclerView.SmoothScroller localSmoothScroller = this.mSmoothScroller;
    if (localSmoothScroller != null)
    {
      bool = localSmoothScroller.isRunning();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localSmoothScroller = null;
    return bool;
  }
  
  public boolean isViewPartiallyVisible(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    ViewBoundsCheck localViewBoundsCheck = this.mHorizontalBoundCheck;
    int i = 24579;
    paramBoolean2 = localViewBoundsCheck.OooO0O0(paramView, i);
    boolean bool1 = true;
    if (paramBoolean2)
    {
      localViewBoundsCheck = this.mVerticalBoundCheck;
      bool2 = localViewBoundsCheck.OooO0O0(paramView, i);
      if (bool2)
      {
        bool2 = bool1;
        break label60;
      }
    }
    boolean bool2 = false;
    paramView = null;
    label60:
    if (paramBoolean1) {
      return bool2;
    }
    return bool2 ^ bool1;
  }
  
  public void layoutDecorated(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).OooO0O0;
    int i = localRect.left;
    paramInt1 += i;
    i = localRect.top;
    paramInt2 += i;
    i = localRect.right;
    paramInt3 -= i;
    int j = localRect.bottom;
    paramInt4 -= j;
    paramView.layout(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void layoutDecoratedWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = localLayoutParams.OooO0O0;
    int i = localRect.left;
    paramInt1 += i;
    i = localLayoutParams.leftMargin;
    paramInt1 += i;
    i = localRect.top;
    paramInt2 += i;
    i = localLayoutParams.topMargin;
    paramInt2 += i;
    i = localRect.right;
    paramInt3 -= i;
    i = localLayoutParams.rightMargin;
    paramInt3 -= i;
    int j = localRect.bottom;
    paramInt4 -= j;
    int k = localLayoutParams.bottomMargin;
    paramInt4 -= k;
    paramView.layout(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = this.mRecyclerView.getItemDecorInsetsForChild(paramView);
    int i = localRect.left;
    int j = localRect.right;
    i += j;
    paramInt1 += i;
    i = localRect.top;
    int k = localRect.bottom;
    i += k;
    paramInt2 += i;
    k = getWidth();
    i = getWidthMode();
    j = getPaddingLeft();
    int m = getPaddingRight();
    j = j + m + paramInt1;
    paramInt1 = localLayoutParams.width;
    boolean bool1 = canScrollHorizontally();
    paramInt1 = getChildMeasureSpec(k, i, j, paramInt1, bool1);
    k = getHeight();
    i = getHeightMode();
    j = getPaddingTop();
    int n = getPaddingBottom();
    j = j + n + paramInt2;
    paramInt2 = localLayoutParams.height;
    boolean bool2 = canScrollVertically();
    paramInt2 = getChildMeasureSpec(k, i, j, paramInt2, bool2);
    boolean bool3 = shouldMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams);
    if (bool3) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  public void measureChildWithMargins(View paramView, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = this.mRecyclerView.getItemDecorInsetsForChild(paramView);
    int i = localRect.left;
    int j = localRect.right;
    i += j;
    paramInt1 += i;
    i = localRect.top;
    int k = localRect.bottom;
    i += k;
    paramInt2 += i;
    k = getWidth();
    i = getWidthMode();
    j = getPaddingLeft();
    int m = getPaddingRight();
    j += m;
    m = localLayoutParams.leftMargin;
    j += m;
    m = localLayoutParams.rightMargin;
    j = j + m + paramInt1;
    paramInt1 = localLayoutParams.width;
    boolean bool1 = canScrollHorizontally();
    paramInt1 = getChildMeasureSpec(k, i, j, paramInt1, bool1);
    k = getHeight();
    i = getHeightMode();
    j = getPaddingTop();
    int n = getPaddingBottom();
    j += n;
    n = localLayoutParams.topMargin;
    j += n;
    n = localLayoutParams.bottomMargin;
    j = j + n + paramInt2;
    paramInt2 = localLayoutParams.height;
    boolean bool2 = canScrollVertically();
    paramInt2 = getChildMeasureSpec(k, i, j, paramInt2, bool2);
    boolean bool3 = shouldMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams);
    if (bool3) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  public void moveView(int paramInt1, int paramInt2)
  {
    Object localObject = getChildAt(paramInt1);
    if (localObject != null)
    {
      detachViewAt(paramInt1);
      attachView((View)localObject, paramInt2);
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("Cannot move a child from non-existing index:");
    ((StringBuilder)localObject).append(paramInt1);
    String str = this.mRecyclerView.toString();
    ((StringBuilder)localObject).append(str);
    str = ((StringBuilder)localObject).toString();
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public void offsetChildrenHorizontal(int paramInt)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null) {
      localRecyclerView.offsetChildrenHorizontal(paramInt);
    }
  }
  
  public void offsetChildrenVertical(int paramInt)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null) {
      localRecyclerView.offsetChildrenVertical(paramInt);
    }
  }
  
  public void onAdapterChanged(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2) {}
  
  public boolean onAddFocusables(RecyclerView paramRecyclerView, ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public void onAttachedToWindow(RecyclerView paramRecyclerView) {}
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView) {}
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    onDetachedFromWindow(paramRecyclerView);
  }
  
  public View onFocusSearchFailed(View paramView, int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return null;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    Object localObject = this.mRecyclerView;
    RecyclerView.Recycler localRecycler = ((RecyclerView)localObject).mRecycler;
    localObject = ((RecyclerView)localObject).mState;
    onInitializeAccessibilityEvent(localRecycler, (RecyclerView.State)localObject, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityEvent(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, AccessibilityEvent paramAccessibilityEvent)
  {
    paramRecycler = this.mRecyclerView;
    if ((paramRecycler != null) && (paramAccessibilityEvent != null))
    {
      int i = 1;
      boolean bool = paramRecycler.canScrollVertically(i);
      if (!bool)
      {
        paramRecycler = this.mRecyclerView;
        int k = -1;
        bool = paramRecycler.canScrollVertically(k);
        if (!bool)
        {
          paramRecycler = this.mRecyclerView;
          bool = paramRecycler.canScrollHorizontally(k);
          if (!bool)
          {
            paramRecycler = this.mRecyclerView;
            bool = paramRecycler.canScrollHorizontally(i);
            if (!bool) {
              i = 0;
            }
          }
        }
      }
      paramAccessibilityEvent.setScrollable(i);
      paramRecycler = this.mRecyclerView.mAdapter;
      if (paramRecycler != null)
      {
        int j = paramRecycler.getItemCount();
        paramAccessibilityEvent.setItemCount(j);
      }
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    Object localObject = this.mRecyclerView;
    RecyclerView.Recycler localRecycler = ((RecyclerView)localObject).mRecycler;
    localObject = ((RecyclerView)localObject).mState;
    onInitializeAccessibilityNodeInfo(localRecycler, (RecyclerView.State)localObject, paramAccessibilityNodeInfoCompat);
  }
  
  public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i = -1;
    boolean bool1 = localRecyclerView.canScrollVertically(i);
    int m = 1;
    if (!bool1)
    {
      localRecyclerView = this.mRecyclerView;
      bool1 = localRecyclerView.canScrollHorizontally(i);
      if (!bool1) {}
    }
    else
    {
      int j = 8192;
      paramAccessibilityNodeInfoCompat.OooO00o(j);
      paramAccessibilityNodeInfoCompat.setScrollable(m);
    }
    localRecyclerView = this.mRecyclerView;
    boolean bool2 = localRecyclerView.canScrollVertically(m);
    if (!bool2)
    {
      localRecyclerView = this.mRecyclerView;
      bool2 = localRecyclerView.canScrollHorizontally(m);
      if (!bool2) {}
    }
    else
    {
      k = 4096;
      paramAccessibilityNodeInfoCompat.OooO00o(k);
      paramAccessibilityNodeInfoCompat.setScrollable(m);
    }
    int k = getRowCountForAccessibility(paramRecycler, paramState);
    i = getColumnCountForAccessibility(paramRecycler, paramState);
    boolean bool3 = isLayoutHierarchical(paramRecycler, paramState);
    int n = getSelectionModeForAccessibility(paramRecycler, paramState);
    paramRecycler = AccessibilityNodeInfoCompat.CollectionInfoCompat.OooO0O0(k, i, bool3, n);
    paramAccessibilityNodeInfoCompat.setCollectionInfo(paramRecycler);
  }
  
  public void onInitializeAccessibilityNodeInfoForItem(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    Object localObject1 = RecyclerView.getChildViewHolderInt(paramView);
    if (localObject1 != null)
    {
      boolean bool1 = ((RecyclerView.ViewHolder)localObject1).isRemoved();
      if (!bool1)
      {
        Object localObject2 = this.mChildHelper;
        localObject1 = ((RecyclerView.ViewHolder)localObject1).itemView;
        boolean bool2 = ((ChildHelper)localObject2).OooO((View)localObject1);
        if (!bool2)
        {
          localObject1 = this.mRecyclerView;
          localObject2 = ((RecyclerView)localObject1).mRecycler;
          localObject1 = ((RecyclerView)localObject1).mState;
          onInitializeAccessibilityNodeInfoForItem((RecyclerView.Recycler)localObject2, (RecyclerView.State)localObject1, paramView, paramAccessibilityNodeInfoCompat);
        }
      }
    }
  }
  
  public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat) {}
  
  public View onInterceptFocusSearch(View paramView, int paramInt)
  {
    return null;
  }
  
  public void onItemsAdded(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void onItemsChanged(RecyclerView paramRecyclerView) {}
  
  public void onItemsMoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onItemsRemoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    onItemsUpdated(paramRecyclerView, paramInt1, paramInt2);
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState) {}
  
  public void onLayoutCompleted(RecyclerView.State paramState) {}
  
  public void onMeasure(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt1, int paramInt2)
  {
    this.mRecyclerView.defaultOnMeasure(paramInt1, paramInt2);
  }
  
  public boolean onRequestChildFocus(RecyclerView paramRecyclerView, View paramView1, View paramView2)
  {
    boolean bool1 = isSmoothScrolling();
    if (!bool1)
    {
      bool2 = paramRecyclerView.isComputingLayout();
      if (!bool2)
      {
        bool2 = false;
        paramRecyclerView = null;
        break label36;
      }
    }
    boolean bool2 = true;
    label36:
    return bool2;
  }
  
  public boolean onRequestChildFocus(RecyclerView paramRecyclerView, RecyclerView.State paramState, View paramView1, View paramView2)
  {
    return onRequestChildFocus(paramRecyclerView, paramView1, paramView2);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  public void onScrollStateChanged(int paramInt) {}
  
  public void onSmoothScrollerStopped(RecyclerView.SmoothScroller paramSmoothScroller)
  {
    RecyclerView.SmoothScroller localSmoothScroller = this.mSmoothScroller;
    if (localSmoothScroller == paramSmoothScroller)
    {
      paramSmoothScroller = null;
      this.mSmoothScroller = null;
    }
  }
  
  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    Object localObject = this.mRecyclerView;
    RecyclerView.Recycler localRecycler = ((RecyclerView)localObject).mRecycler;
    localObject = ((RecyclerView)localObject).mState;
    return performAccessibilityAction(localRecycler, (RecyclerView.State)localObject, paramInt, paramBundle);
  }
  
  public boolean performAccessibilityAction(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt, Bundle paramBundle)
  {
    paramRecycler = this.mRecyclerView;
    if (paramRecycler == null) {
      return false;
    }
    int i = getHeight();
    int j = getWidth();
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    Object localObject = this.mRecyclerView.getMatrix();
    int k = ((Matrix)localObject).isIdentity();
    if (k != 0)
    {
      localObject = this.mRecyclerView;
      k = ((View)localObject).getGlobalVisibleRect(localRect);
      if (k != 0)
      {
        i = localRect.height();
        j = localRect.width();
      }
    }
    int m = 4096;
    k = 1;
    RecyclerView localRecyclerView;
    if (paramInt != m)
    {
      m = 8192;
      if (paramInt != m)
      {
        n = 0;
        i1 = 0;
        break label325;
      }
      localRecyclerView = this.mRecyclerView;
      m = -1;
      paramInt = localRecyclerView.canScrollVertically(m);
      if (paramInt != 0)
      {
        paramInt = getPaddingTop();
        i -= paramInt;
        paramInt = getPaddingBottom();
        i = -(i - paramInt);
      }
      else
      {
        i = 0;
        paramRecycler = null;
      }
      localRecyclerView = this.mRecyclerView;
      paramInt = localRecyclerView.canScrollHorizontally(m);
      if (paramInt == 0) {
        break label318;
      }
      paramInt = getPaddingLeft();
      j -= paramInt;
      paramInt = getPaddingRight();
      j -= paramInt;
      paramInt = -j;
    }
    else
    {
      localRecyclerView = this.mRecyclerView;
      paramInt = localRecyclerView.canScrollVertically(k);
      if (paramInt != 0)
      {
        paramInt = getPaddingTop();
        i -= paramInt;
        paramInt = getPaddingBottom();
        i -= paramInt;
      }
      else
      {
        i = 0;
        paramRecycler = null;
      }
      localRecyclerView = this.mRecyclerView;
      paramInt = localRecyclerView.canScrollHorizontally(k);
      if (paramInt == 0) {
        break label318;
      }
      paramInt = getPaddingLeft();
      j -= paramInt;
      paramInt = getPaddingRight();
      paramInt = j - paramInt;
    }
    int i1 = i;
    int n = paramInt;
    break label325;
    label318:
    i1 = i;
    n = 0;
    label325:
    if ((i1 == 0) && (n == 0)) {
      return false;
    }
    this.mRecyclerView.smoothScrollBy(n, i1, null, -1 << -1, true);
    return k;
  }
  
  public boolean performAccessibilityActionForItem(View paramView, int paramInt, Bundle paramBundle)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    RecyclerView.Recycler localRecycler = localRecyclerView.mRecycler;
    RecyclerView.State localState = localRecyclerView.mState;
    return performAccessibilityActionForItem(localRecycler, localState, paramView, paramInt, paramBundle);
  }
  
  public boolean performAccessibilityActionForItem(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, View paramView, int paramInt, Bundle paramBundle)
  {
    return false;
  }
  
  public void postOnAnimation(Runnable paramRunnable)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null) {
      ViewCompat.o0OoOo0(localRecyclerView, paramRunnable);
    }
  }
  
  public void removeAllViews()
  {
    int i = getChildCount() + -1;
    while (i >= 0)
    {
      ChildHelper localChildHelper = this.mChildHelper;
      localChildHelper.OooOO0o(i);
      i += -1;
    }
  }
  
  public void removeAndRecycleAllViews(RecyclerView.Recycler paramRecycler)
  {
    int i = getChildCount() + -1;
    while (i >= 0)
    {
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(getChildAt(i));
      boolean bool = localViewHolder.shouldIgnore();
      if (!bool) {
        removeAndRecycleViewAt(i, paramRecycler);
      }
      i += -1;
    }
  }
  
  public void removeAndRecycleScrapInt(RecyclerView.Recycler paramRecycler)
  {
    int i = paramRecycler.getScrapCount();
    int j = i + -1;
    while (j >= 0)
    {
      View localView = paramRecycler.getScrapViewAt(j);
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(localView);
      boolean bool1 = localViewHolder.shouldIgnore();
      if (!bool1)
      {
        bool1 = false;
        RecyclerView.ItemAnimator localItemAnimator = null;
        localViewHolder.setIsRecyclable(false);
        boolean bool2 = localViewHolder.isTmpDetached();
        if (bool2)
        {
          RecyclerView localRecyclerView = this.mRecyclerView;
          localRecyclerView.removeDetachedView(localView, false);
        }
        localItemAnimator = this.mRecyclerView.mItemAnimator;
        if (localItemAnimator != null) {
          localItemAnimator.OooOO0(localViewHolder);
        }
        bool1 = true;
        localViewHolder.setIsRecyclable(bool1);
        paramRecycler.OooOo(localView);
      }
      j += -1;
    }
    paramRecycler.OooO0o0();
    if (i > 0)
    {
      paramRecycler = this.mRecyclerView;
      paramRecycler.invalidate();
    }
  }
  
  public void removeAndRecycleView(View paramView, RecyclerView.Recycler paramRecycler)
  {
    removeView(paramView);
    paramRecycler.OooOoOO(paramView);
  }
  
  public void removeAndRecycleViewAt(int paramInt, RecyclerView.Recycler paramRecycler)
  {
    View localView = getChildAt(paramInt);
    removeViewAt(paramInt);
    paramRecycler.OooOoOO(localView);
  }
  
  public boolean removeCallbacks(Runnable paramRunnable)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null) {
      return localRecyclerView.removeCallbacks(paramRunnable);
    }
    return false;
  }
  
  public void removeDetachedView(View paramView)
  {
    this.mRecyclerView.removeDetachedView(paramView, false);
  }
  
  public void removeView(View paramView)
  {
    this.mChildHelper.OooOO0O(paramView);
  }
  
  public void removeViewAt(int paramInt)
  {
    Object localObject = getChildAt(paramInt);
    if (localObject != null)
    {
      localObject = this.mChildHelper;
      ((ChildHelper)localObject).OooOO0o(paramInt);
    }
  }
  
  public boolean requestChildRectangleOnScreen(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean)
  {
    return requestChildRectangleOnScreen(paramRecyclerView, paramView, paramRect, paramBoolean, false);
  }
  
  public boolean requestChildRectangleOnScreen(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramView = OooO0OO(paramView, paramRect);
    paramRect = null;
    int i = paramView[0];
    boolean bool = true;
    int j = paramView[bool];
    if (paramBoolean2)
    {
      paramBoolean2 = OooO0Oo(paramRecyclerView, i, j);
      if (!paramBoolean2) {}
    }
    else
    {
      if ((i != 0) || (j != 0)) {
        break label59;
      }
    }
    return false;
    label59:
    if (paramBoolean1) {
      paramRecyclerView.scrollBy(i, j);
    } else {
      paramRecyclerView.smoothScrollBy(i, j);
    }
    return bool;
  }
  
  public void requestLayout()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null) {
      localRecyclerView.requestLayout();
    }
  }
  
  public void requestSimpleAnimationsInNextLayout()
  {
    this.mRequestedSimpleAnimations = true;
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return 0;
  }
  
  public void scrollToPosition(int paramInt) {}
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return 0;
  }
  
  public void setAutoMeasureEnabled(boolean paramBoolean)
  {
    this.mAutoMeasure = paramBoolean;
  }
  
  public void setExactMeasureSpecsFrom(RecyclerView paramRecyclerView)
  {
    int i = paramRecyclerView.getWidth();
    int j = 1073741824;
    i = View.MeasureSpec.makeMeasureSpec(i, j);
    int k = View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), j);
    setMeasureSpecs(i, k);
  }
  
  public final void setItemPrefetchEnabled(boolean paramBoolean)
  {
    boolean bool = this.mItemPrefetchEnabled;
    if (paramBoolean != bool)
    {
      this.mItemPrefetchEnabled = paramBoolean;
      paramBoolean = false;
      this.mPrefetchMaxCountObserved = 0;
      Object localObject = this.mRecyclerView;
      if (localObject != null)
      {
        localObject = ((RecyclerView)localObject).mRecycler;
        ((RecyclerView.Recycler)localObject).Oooo00O();
      }
    }
  }
  
  public void setMeasureSpecs(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    this.mWidth = i;
    paramInt1 = View.MeasureSpec.getMode(paramInt1);
    this.mWidthMode = paramInt1;
    i = 0;
    if (paramInt1 == 0)
    {
      paramInt1 = RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
      if (paramInt1 == 0) {
        this.mWidth = 0;
      }
    }
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    this.mHeight = paramInt1;
    paramInt1 = View.MeasureSpec.getMode(paramInt2);
    this.mHeightMode = paramInt1;
    if (paramInt1 == 0)
    {
      paramInt1 = RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
      if (paramInt1 == 0) {
        this.mHeight = 0;
      }
    }
  }
  
  public void setMeasuredDimension(int paramInt1, int paramInt2)
  {
    RecyclerView.access$500(this.mRecyclerView, paramInt1, paramInt2);
  }
  
  public void setMeasuredDimension(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = paramRect.width();
    int j = getPaddingLeft();
    i += j;
    j = getPaddingRight();
    i += j;
    int k = paramRect.height();
    j = getPaddingTop();
    k += j;
    j = getPaddingBottom();
    k += j;
    j = getMinimumWidth();
    paramInt1 = chooseSize(paramInt1, i, j);
    i = getMinimumHeight();
    k = chooseSize(paramInt2, k, i);
    setMeasuredDimension(paramInt1, k);
  }
  
  public void setMeasuredDimensionFromChildren(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    if (i == 0)
    {
      this.mRecyclerView.defaultOnMeasure(paramInt1, paramInt2);
      return;
    }
    int j = -1 << -1;
    int k = -1 >>> 1;
    int m = 0;
    int n = j;
    int i1 = k;
    while (m < i)
    {
      View localView = getChildAt(m);
      Rect localRect1 = this.mRecyclerView.mTempRect;
      getDecoratedBoundsWithMargins(localView, localRect1);
      int i2 = localRect1.left;
      if (i2 < i1) {
        i1 = i2;
      }
      i2 = localRect1.right;
      if (i2 > j) {
        j = i2;
      }
      i2 = localRect1.top;
      if (i2 < k) {
        k = i2;
      }
      i2 = localRect1.bottom;
      if (i2 > n) {
        n = i2;
      }
      m += 1;
    }
    this.mRecyclerView.mTempRect.set(i1, k, j, n);
    Rect localRect2 = this.mRecyclerView.mTempRect;
    setMeasuredDimension(localRect2, paramInt1, paramInt2);
  }
  
  public void setMeasurementCacheEnabled(boolean paramBoolean)
  {
    this.mMeasurementCacheEnabled = paramBoolean;
  }
  
  public void setRecyclerView(RecyclerView paramRecyclerView)
  {
    if (paramRecyclerView == null)
    {
      this.mRecyclerView = null;
      this.mChildHelper = null;
      i = 0;
      paramRecyclerView = null;
      this.mWidth = 0;
    }
    else
    {
      this.mRecyclerView = paramRecyclerView;
      ChildHelper localChildHelper = paramRecyclerView.mChildHelper;
      this.mChildHelper = localChildHelper;
      int j = paramRecyclerView.getWidth();
      this.mWidth = j;
      i = paramRecyclerView.getHeight();
    }
    this.mHeight = i;
    int i = 1073741824;
    this.mWidthMode = i;
    this.mHeightMode = i;
  }
  
  public boolean shouldMeasureChild(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
  {
    boolean bool1 = paramView.isLayoutRequested();
    if (!bool1)
    {
      bool1 = this.mMeasurementCacheEnabled;
      if (bool1)
      {
        int i = paramView.getWidth();
        int j = paramLayoutParams.width;
        paramInt1 = OooO0o0(i, paramInt1, j);
        if (paramInt1 != 0)
        {
          int k = paramView.getHeight();
          paramInt1 = paramLayoutParams.height;
          bool2 = OooO0o0(k, paramInt2, paramInt1);
          if (bool2)
          {
            bool2 = false;
            paramView = null;
            break label88;
          }
        }
      }
    }
    boolean bool2 = true;
    label88:
    return bool2;
  }
  
  public boolean shouldMeasureTwice()
  {
    return false;
  }
  
  public boolean shouldReMeasureChild(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
  {
    boolean bool1 = this.mMeasurementCacheEnabled;
    if (bool1)
    {
      int i = paramView.getMeasuredWidth();
      int j = paramLayoutParams.width;
      paramInt1 = OooO0o0(i, paramInt1, j);
      if (paramInt1 != 0)
      {
        int k = paramView.getMeasuredHeight();
        paramInt1 = paramLayoutParams.height;
        bool2 = OooO0o0(k, paramInt2, paramInt1);
        if (bool2)
        {
          bool2 = false;
          paramView = null;
          break label77;
        }
      }
    }
    boolean bool2 = true;
    label77:
    return bool2;
  }
  
  public void smoothScrollToPosition(RecyclerView paramRecyclerView, RecyclerView.State paramState, int paramInt) {}
  
  public void startSmoothScroll(RecyclerView.SmoothScroller paramSmoothScroller)
  {
    Object localObject = this.mSmoothScroller;
    if ((localObject != null) && (paramSmoothScroller != localObject))
    {
      boolean bool = ((RecyclerView.SmoothScroller)localObject).isRunning();
      if (bool)
      {
        localObject = this.mSmoothScroller;
        ((RecyclerView.SmoothScroller)localObject).stop();
      }
    }
    this.mSmoothScroller = paramSmoothScroller;
    localObject = this.mRecyclerView;
    paramSmoothScroller.start((RecyclerView)localObject, this);
  }
  
  public void stopIgnoringView(View paramView)
  {
    paramView = RecyclerView.getChildViewHolderInt(paramView);
    paramView.stopIgnoring();
    paramView.resetInternal();
    paramView.addFlags(4);
  }
  
  public void stopSmoothScroller()
  {
    RecyclerView.SmoothScroller localSmoothScroller = this.mSmoothScroller;
    if (localSmoothScroller != null) {
      localSmoothScroller.stop();
    }
  }
  
  public boolean supportsPredictiveItemAnimations()
  {
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.LayoutManager
 * JD-Core Version:    0.7.0.1
 */