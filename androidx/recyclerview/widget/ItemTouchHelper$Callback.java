package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R.dimen;
import java.util.List;

public abstract class ItemTouchHelper$Callback
{
  public static final Interpolator OooO0O0;
  public static final Interpolator OooO0OO;
  public int OooO00o = -1;
  
  static
  {
    Object localObject = new androidx/recyclerview/widget/ItemTouchHelper$Callback$1;
    ((ItemTouchHelper.Callback.1)localObject).<init>();
    OooO0O0 = (Interpolator)localObject;
    localObject = new androidx/recyclerview/widget/ItemTouchHelper$Callback$2;
    ((ItemTouchHelper.Callback.2)localObject).<init>();
    OooO0OO = (Interpolator)localObject;
  }
  
  public static int OooO0o0(int paramInt1, int paramInt2)
  {
    int i = 789516;
    int j = paramInt1 & i;
    if (j == 0) {
      return paramInt1;
    }
    int k = j ^ 0xFFFFFFFF;
    paramInt1 &= k;
    if (paramInt2 == 0) {}
    for (paramInt2 = j << 2;; paramInt2 = (paramInt2 & i) << 2)
    {
      return paramInt1 | paramInt2;
      paramInt2 = j << 1;
      j = 0xFFF3F3F3 & paramInt2;
      paramInt1 |= j;
    }
  }
  
  public static int OooOOOo(int paramInt1, int paramInt2)
  {
    paramInt1 *= 8;
    return paramInt2 << paramInt1;
  }
  
  public static int OooOOo0(int paramInt1, int paramInt2)
  {
    int i = paramInt2 | paramInt1;
    int j = OooOOOo(0, i);
    paramInt2 = OooOOOo(1, paramInt2) | j;
    return OooOOOo(2, paramInt1) | paramInt2;
  }
  
  public static ItemTouchUIUtil getDefaultUIUtil()
  {
    return ItemTouchUIUtilImpl.OooO00o;
  }
  
  public float OooO(RecyclerView.ViewHolder paramViewHolder)
  {
    return 0.5F;
  }
  
  public boolean OooO00o(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2)
  {
    return true;
  }
  
  public RecyclerView.ViewHolder OooO0O0(RecyclerView.ViewHolder paramViewHolder, List paramList, int paramInt1, int paramInt2)
  {
    RecyclerView.ViewHolder localViewHolder1 = paramViewHolder;
    View localView1 = paramViewHolder.itemView;
    int i = localView1.getWidth();
    i = paramInt1 + i;
    View localView2 = paramViewHolder.itemView;
    int j = localView2.getHeight();
    j = paramInt2 + j;
    View localView3 = paramViewHolder.itemView;
    int k = localView3.getLeft();
    k = paramInt1 - k;
    View localView4 = paramViewHolder.itemView;
    int m = localView4.getTop();
    m = paramInt2 - m;
    int n = paramList.size();
    Object localObject = null;
    int i1 = -1;
    int i2 = 0;
    while (i2 < n)
    {
      RecyclerView.ViewHolder localViewHolder2 = (RecyclerView.ViewHolder)paramList.get(i2);
      View localView5;
      int i3;
      View localView6;
      int i4;
      View localView7;
      int i5;
      if (k > 0)
      {
        localView5 = localViewHolder2.itemView;
        i3 = localView5.getRight() - i;
        if (i3 < 0)
        {
          localView6 = localViewHolder2.itemView;
          i4 = localView6.getRight();
          localView7 = localViewHolder1.itemView;
          i5 = localView7.getRight();
          if (i4 > i5)
          {
            i3 = Math.abs(i3);
            if (i3 > i1)
            {
              localObject = localViewHolder2;
              i1 = i3;
            }
          }
        }
      }
      if (k < 0)
      {
        localView5 = localViewHolder2.itemView;
        i3 = localView5.getLeft() - paramInt1;
        if (i3 > 0)
        {
          localView6 = localViewHolder2.itemView;
          i4 = localView6.getLeft();
          localView7 = localViewHolder1.itemView;
          i5 = localView7.getLeft();
          if (i4 < i5)
          {
            i3 = Math.abs(i3);
            if (i3 > i1)
            {
              localObject = localViewHolder2;
              i1 = i3;
            }
          }
        }
      }
      if (m < 0)
      {
        localView5 = localViewHolder2.itemView;
        i3 = localView5.getTop() - paramInt2;
        if (i3 > 0)
        {
          localView6 = localViewHolder2.itemView;
          i4 = localView6.getTop();
          localView7 = localViewHolder1.itemView;
          i5 = localView7.getTop();
          if (i4 < i5)
          {
            i3 = Math.abs(i3);
            if (i3 > i1)
            {
              localObject = localViewHolder2;
              i1 = i3;
            }
          }
        }
      }
      if (m > 0)
      {
        localView5 = localViewHolder2.itemView;
        i3 = localView5.getBottom() - j;
        if (i3 < 0)
        {
          localView6 = localViewHolder2.itemView;
          i4 = localView6.getBottom();
          localView7 = localViewHolder1.itemView;
          i5 = localView7.getBottom();
          if (i4 > i5)
          {
            i3 = Math.abs(i3);
            if (i3 > i1)
            {
              localObject = localViewHolder2;
              i1 = i3;
            }
          }
        }
      }
      i2 += 1;
    }
    return localObject;
  }
  
  public void OooO0OO(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
  {
    paramRecyclerView = ItemTouchUIUtilImpl.OooO00o;
    paramViewHolder = paramViewHolder.itemView;
    paramRecyclerView.OooO00o(paramViewHolder);
  }
  
  public int OooO0Oo(int paramInt1, int paramInt2)
  {
    int i = 3158064;
    int j = paramInt1 & i;
    if (j == 0) {
      return paramInt1;
    }
    int k = j ^ 0xFFFFFFFF;
    paramInt1 &= k;
    if (paramInt2 == 0) {}
    for (paramInt2 = j >> 2;; paramInt2 = (paramInt2 & i) >> 2)
    {
      return paramInt1 | paramInt2;
      paramInt2 = j >> 1;
      j = 0xFFCFCFCF & paramInt2;
      paramInt1 |= j;
    }
  }
  
  public final int OooO0o(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
  {
    int i = OooOO0(paramRecyclerView, paramViewHolder);
    int j = ViewCompat.OooOoOO(paramRecyclerView);
    return OooO0Oo(i, j);
  }
  
  public long OooO0oO(RecyclerView paramRecyclerView, int paramInt, float paramFloat1, float paramFloat2)
  {
    paramRecyclerView = paramRecyclerView.getItemAnimator();
    int i = 8;
    long l;
    if (paramRecyclerView == null)
    {
      if (paramInt == i) {
        l = 200L;
      } else {
        l = 250L;
      }
      return l;
    }
    if (paramInt == i) {
      l = paramRecyclerView.getMoveDuration();
    } else {
      l = paramRecyclerView.getRemoveDuration();
    }
    return l;
  }
  
  public final int OooO0oo(RecyclerView paramRecyclerView)
  {
    int i = this.OooO00o;
    int j = -1;
    if (i == j)
    {
      paramRecyclerView = paramRecyclerView.getResources();
      i = R.dimen.item_touch_helper_max_drag_scroll_per_frame;
      int k = paramRecyclerView.getDimensionPixelSize(i);
      this.OooO00o = k;
    }
    return this.OooO00o;
  }
  
  public abstract int OooOO0(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder);
  
  public float OooOO0O(float paramFloat)
  {
    return paramFloat;
  }
  
  public float OooOO0o(RecyclerView.ViewHolder paramViewHolder)
  {
    return 0.5F;
  }
  
  public boolean OooOOO(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
  {
    int i = OooO0o(paramRecyclerView, paramViewHolder);
    int j = 16711680;
    i &= j;
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramRecyclerView = null;
    }
    return i;
  }
  
  public float OooOOO0(float paramFloat)
  {
    return paramFloat;
  }
  
  public int OooOOOO(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    int i = OooO0oo(paramRecyclerView);
    paramInt3 = Math.abs(paramInt2);
    float f1 = Math.signum(paramInt2);
    int j = (int)f1;
    float f2 = paramInt3;
    float f3 = 1.0F;
    f2 *= f3;
    float f4 = paramInt1;
    f2 /= f4;
    f4 = Math.min(f3, f2);
    j *= i;
    float f5 = j;
    Interpolator localInterpolator1 = OooO0OO;
    f4 = localInterpolator1.getInterpolation(f4);
    f5 *= f4;
    i = (int)f5;
    long l = 2000L;
    paramInt1 = paramLong < l;
    if (paramInt1 <= 0)
    {
      f4 = (float)paramLong;
      paramInt3 = 1157234688;
      f2 = 2000.0F;
      f3 = f4 / f2;
    }
    f5 = i;
    Interpolator localInterpolator2 = OooO0O0;
    f4 = localInterpolator2.getInterpolation(f3);
    f5 *= f4;
    i = (int)f5;
    if (i == 0) {
      if (paramInt2 > 0)
      {
        i = 1;
        f5 = 1.4E-45F;
      }
      else
      {
        i = -1;
        f5 = 0.0F / 0.0F;
      }
    }
    return i;
  }
  
  public void OooOOo(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    ItemTouchUIUtil localItemTouchUIUtil = ItemTouchUIUtilImpl.OooO00o;
    View localView = paramViewHolder.itemView;
    localItemTouchUIUtil.OooO0Oo(paramCanvas, paramRecyclerView, localView, paramFloat1, paramFloat2, paramInt, paramBoolean);
  }
  
  public void OooOOoo(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    ItemTouchUIUtil localItemTouchUIUtil = ItemTouchUIUtilImpl.OooO00o;
    View localView = paramViewHolder.itemView;
    localItemTouchUIUtil.OooO0OO(paramCanvas, paramRecyclerView, localView, paramFloat1, paramFloat2, paramInt, paramBoolean);
  }
  
  public void OooOo(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    if (paramViewHolder != null)
    {
      ItemTouchUIUtil localItemTouchUIUtil = ItemTouchUIUtilImpl.OooO00o;
      paramViewHolder = paramViewHolder.itemView;
      localItemTouchUIUtil.OooO0O0(paramViewHolder);
    }
  }
  
  public void OooOo0(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, List paramList, int paramInt, float paramFloat1, float paramFloat2)
  {
    List localList = paramList;
    int i = paramList.size();
    int j = 0;
    int k = 0;
    Object localObject1;
    RecyclerView.ViewHolder localViewHolder;
    float f1;
    float f2;
    int n;
    boolean bool1;
    Object localObject2;
    while (k < i)
    {
      localObject1 = (ItemTouchHelper.RecoverAnimation)localList.get(k);
      int m = paramCanvas.save();
      localViewHolder = ((ItemTouchHelper.RecoverAnimation)localObject1).o00Ooo0o;
      f1 = ((ItemTouchHelper.RecoverAnimation)localObject1).o0O00o0;
      f2 = ((ItemTouchHelper.RecoverAnimation)localObject1).o00OoooO;
      n = ((ItemTouchHelper.RecoverAnimation)localObject1).o00OooO0;
      bool1 = false;
      localObject1 = this;
      localObject2 = paramCanvas;
      OooOOoo(paramCanvas, paramRecyclerView, localViewHolder, f1, f2, n, false);
      paramCanvas.restoreToCount(m);
      k += 1;
    }
    if (paramViewHolder != null)
    {
      k = paramCanvas.save();
      bool1 = true;
      localObject1 = this;
      localObject2 = paramCanvas;
      localViewHolder = paramViewHolder;
      f1 = paramFloat1;
      f2 = paramFloat2;
      n = paramInt;
      OooOOoo(paramCanvas, paramRecyclerView, paramViewHolder, paramFloat1, paramFloat2, paramInt, bool1);
      paramCanvas.restoreToCount(k);
    }
    int i1 = 1;
    i -= i1;
    while (i >= 0)
    {
      localObject2 = (ItemTouchHelper.RecoverAnimation)localList.get(i);
      boolean bool2 = ((ItemTouchHelper.RecoverAnimation)localObject2).o00o0000;
      if (bool2)
      {
        boolean bool3 = ((ItemTouchHelper.RecoverAnimation)localObject2).o00OooOo;
        if (!bool3)
        {
          localList.remove(i);
          break label243;
        }
      }
      if (!bool2) {
        j = i1;
      }
      label243:
      i += -1;
    }
    if (j != 0) {
      paramRecyclerView.invalidate();
    }
  }
  
  public void OooOo00(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, List paramList, int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = paramList.size();
    Object localObject = null;
    int j = 0;
    RecyclerView.ViewHolder localViewHolder;
    float f1;
    float f2;
    int m;
    boolean bool;
    while (j < i)
    {
      localObject = (ItemTouchHelper.RecoverAnimation)paramList.get(j);
      ((ItemTouchHelper.RecoverAnimation)localObject).OooO0OO();
      int k = paramCanvas.save();
      localViewHolder = ((ItemTouchHelper.RecoverAnimation)localObject).o00Ooo0o;
      f1 = ((ItemTouchHelper.RecoverAnimation)localObject).o0O00o0;
      f2 = ((ItemTouchHelper.RecoverAnimation)localObject).o00OoooO;
      m = ((ItemTouchHelper.RecoverAnimation)localObject).o00OooO0;
      bool = false;
      localObject = this;
      OooOOo(paramCanvas, paramRecyclerView, localViewHolder, f1, f2, m, false);
      paramCanvas.restoreToCount(k);
      j += 1;
    }
    if (paramViewHolder != null)
    {
      i = paramCanvas.save();
      bool = true;
      localObject = this;
      localViewHolder = paramViewHolder;
      f1 = paramFloat1;
      f2 = paramFloat2;
      m = paramInt;
      OooOOo(paramCanvas, paramRecyclerView, paramViewHolder, paramFloat1, paramFloat2, paramInt, bool);
      paramCanvas.restoreToCount(i);
    }
  }
  
  public abstract boolean OooOo0O(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2);
  
  public void OooOo0o(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder1, int paramInt1, RecyclerView.ViewHolder paramViewHolder2, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = paramRecyclerView.getLayoutManager();
    boolean bool1 = localObject instanceof ItemTouchHelper.ViewDropHandler;
    if (bool1)
    {
      localObject = (ItemTouchHelper.ViewDropHandler)localObject;
      paramRecyclerView = paramViewHolder1.itemView;
      paramViewHolder1 = paramViewHolder2.itemView;
      ((ItemTouchHelper.ViewDropHandler)localObject).prepareForDrop(paramRecyclerView, paramViewHolder1, paramInt3, paramInt4);
      return;
    }
    boolean bool2 = ((RecyclerView.LayoutManager)localObject).canScrollHorizontally();
    if (bool2)
    {
      paramViewHolder1 = paramViewHolder2.itemView;
      int i = ((RecyclerView.LayoutManager)localObject).getDecoratedLeft(paramViewHolder1);
      paramInt3 = paramRecyclerView.getPaddingLeft();
      if (i <= paramInt3) {
        paramRecyclerView.scrollToPosition(paramInt2);
      }
      paramViewHolder1 = paramViewHolder2.itemView;
      i = ((RecyclerView.LayoutManager)localObject).getDecoratedRight(paramViewHolder1);
      paramInt3 = paramRecyclerView.getWidth();
      paramInt4 = paramRecyclerView.getPaddingRight();
      paramInt3 -= paramInt4;
      if (i >= paramInt3) {
        paramRecyclerView.scrollToPosition(paramInt2);
      }
    }
    boolean bool3 = ((RecyclerView.LayoutManager)localObject).canScrollVertically();
    if (bool3)
    {
      paramViewHolder1 = paramViewHolder2.itemView;
      int j = ((RecyclerView.LayoutManager)localObject).getDecoratedTop(paramViewHolder1);
      paramInt3 = paramRecyclerView.getPaddingTop();
      if (j <= paramInt3) {
        paramRecyclerView.scrollToPosition(paramInt2);
      }
      paramViewHolder1 = paramViewHolder2.itemView;
      j = ((RecyclerView.LayoutManager)localObject).getDecoratedBottom(paramViewHolder1);
      paramInt1 = paramRecyclerView.getHeight();
      int k = paramRecyclerView.getPaddingBottom();
      paramInt1 -= k;
      if (j >= paramInt1) {
        paramRecyclerView.scrollToPosition(paramInt2);
      }
    }
  }
  
  public abstract void OooOoO0(RecyclerView.ViewHolder paramViewHolder, int paramInt);
  
  public int getBoundingBoxMargin()
  {
    return 0;
  }
  
  public boolean isItemViewSwipeEnabled()
  {
    return true;
  }
  
  public boolean isLongPressDragEnabled()
  {
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.Callback
 * JD-Core Version:    0.7.0.1
 */