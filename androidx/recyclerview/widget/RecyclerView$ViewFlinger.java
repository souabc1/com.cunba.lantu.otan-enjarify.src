package androidx.recyclerview.widget;

import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

class RecyclerView$ViewFlinger
  implements Runnable
{
  public int o00OoOoo;
  public OverScroller o00Ooo0;
  public int o00Ooo00;
  public Interpolator o00Ooo0O;
  public boolean o00Ooo0o;
  public boolean o00OooO0;
  
  public RecyclerView$ViewFlinger(RecyclerView paramRecyclerView)
  {
    Interpolator localInterpolator = RecyclerView.sQuinticInterpolator;
    this.o00Ooo0O = localInterpolator;
    this.o00Ooo0o = false;
    this.o00OooO0 = false;
    OverScroller localOverScroller = new android/widget/OverScroller;
    paramRecyclerView = paramRecyclerView.getContext();
    localOverScroller.<init>(paramRecyclerView, localInterpolator);
    this.o00Ooo0 = localOverScroller;
  }
  
  public final int OooO00o(int paramInt1, int paramInt2)
  {
    paramInt1 = Math.abs(paramInt1);
    paramInt2 = Math.abs(paramInt2);
    int i;
    if (paramInt1 > paramInt2) {
      i = 1;
    } else {
      i = 0;
    }
    RecyclerView localRecyclerView = this.o00OooO;
    int j;
    if (i != 0) {
      j = localRecyclerView.getWidth();
    } else {
      j = localRecyclerView.getHeight();
    }
    if (i == 0) {
      paramInt1 = paramInt2;
    }
    float f1 = paramInt1;
    float f2 = j;
    return Math.min((int)((f1 / f2 + 1.0F) * 300.0F), 2000);
  }
  
  public void OooO0O0(int paramInt1, int paramInt2)
  {
    Object localObject = this.o00OooO;
    int i = 2;
    ((RecyclerView)localObject).setScrollState(i);
    this.o00Ooo00 = 0;
    this.o00OoOoo = 0;
    localObject = this.o00Ooo0O;
    Interpolator localInterpolator = RecyclerView.sQuinticInterpolator;
    if (localObject != localInterpolator)
    {
      this.o00Ooo0O = localInterpolator;
      localObject = new android/widget/OverScroller;
      Context localContext = this.o00OooO.getContext();
      ((OverScroller)localObject).<init>(localContext, localInterpolator);
      this.o00Ooo0 = ((OverScroller)localObject);
    }
    this.o00Ooo0.fling(0, 0, paramInt1, paramInt2, -1 << -1, -1 >>> 1, -1 << -1, -1 >>> 1);
    OooO0Oo();
  }
  
  public final void OooO0OO()
  {
    this.o00OooO.removeCallbacks(this);
    ViewCompat.o0OoOo0(this.o00OooO, this);
  }
  
  public void OooO0Oo()
  {
    boolean bool = this.o00Ooo0o;
    if (bool)
    {
      bool = true;
      this.o00OooO0 = bool;
    }
    else
    {
      OooO0OO();
    }
  }
  
  public void OooO0o()
  {
    this.o00OooO.removeCallbacks(this);
    this.o00Ooo0.abortAnimation();
  }
  
  public void OooO0o0(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    int i = -1 << -1;
    if (paramInt3 == i) {
      paramInt3 = OooO00o(paramInt1, paramInt2);
    }
    int j = paramInt3;
    if (paramInterpolator == null) {
      paramInterpolator = RecyclerView.sQuinticInterpolator;
    }
    Object localObject = this.o00Ooo0O;
    if (localObject != paramInterpolator)
    {
      this.o00Ooo0O = paramInterpolator;
      localObject = new android/widget/OverScroller;
      Context localContext = this.o00OooO.getContext();
      ((OverScroller)localObject).<init>(localContext, paramInterpolator);
      this.o00Ooo0 = ((OverScroller)localObject);
    }
    this.o00Ooo00 = 0;
    this.o00OoOoo = 0;
    this.o00OooO.setScrollState(2);
    this.o00Ooo0.startScroll(0, 0, paramInt1, paramInt2, j);
    OooO0Oo();
  }
  
  public void run()
  {
    ViewFlinger localViewFlinger = this;
    Object localObject1 = this.o00OooO;
    RecyclerView.LayoutManager localLayoutManager = ((RecyclerView)localObject1).mLayout;
    if (localLayoutManager == null)
    {
      OooO0o();
      return;
    }
    localLayoutManager = null;
    this.o00OooO0 = false;
    int i = 1;
    this.o00Ooo0o = i;
    ((RecyclerView)localObject1).consumePendingUpdateOperations();
    localObject1 = this.o00Ooo0;
    boolean bool1 = ((OverScroller)localObject1).computeScrollOffset();
    if (bool1)
    {
      int j = ((OverScroller)localObject1).getCurrX();
      int k = ((OverScroller)localObject1).getCurrY();
      int m = this.o00OoOoo;
      m = j - m;
      int i2 = this.o00Ooo00;
      i2 = k - i2;
      this.o00OoOoo = j;
      this.o00Ooo00 = k;
      Object localObject2 = this.o00OooO;
      j = ((RecyclerView)localObject2).consumeFlingInHorizontalStretch(m);
      RecyclerView localRecyclerView = this.o00OooO;
      k = localRecyclerView.consumeFlingInVerticalStretch(i2);
      Object localObject3 = this.o00OooO;
      Object localObject4 = ((RecyclerView)localObject3).mReusableIntPair;
      localObject4[0] = 0;
      localObject4[i] = 0;
      int i3 = 1;
      int i4 = j;
      int i5 = k;
      boolean bool3 = ((RecyclerView)localObject3).dispatchNestedPreScroll(j, k, (int[])localObject4, null, i3);
      if (bool3)
      {
        localObject5 = this.o00OooO.mReusableIntPair;
        i2 = localObject5[0];
        j -= i2;
        n = localObject5[i];
        k -= n;
      }
      Object localObject5 = localViewFlinger.o00OooO;
      int n = ((View)localObject5).getOverScrollMode();
      i2 = 2;
      if (n != i2)
      {
        localObject5 = localViewFlinger.o00OooO;
        ((RecyclerView)localObject5).considerReleasingGlowsOnScroll(j, k);
      }
      localObject5 = localViewFlinger.o00OooO;
      localObject3 = ((RecyclerView)localObject5).mAdapter;
      int i7;
      if (localObject3 != null)
      {
        localObject3 = ((RecyclerView)localObject5).mReusableIntPair;
        localObject3[0] = 0;
        localObject3[i] = 0;
        ((RecyclerView)localObject5).scrollStep(j, k, (int[])localObject3);
        localObject5 = localViewFlinger.o00OooO;
        localObject3 = ((RecyclerView)localObject5).mReusableIntPair;
        i4 = localObject3[0];
        i7 = localObject3[i];
        j -= i4;
        k -= i7;
        localObject5 = ((RecyclerView)localObject5).mLayout.mSmoothScroller;
        if (localObject5 != null)
        {
          boolean bool5 = ((RecyclerView.SmoothScroller)localObject5).isPendingInitialRun();
          if (!bool5)
          {
            bool5 = ((RecyclerView.SmoothScroller)localObject5).isRunning();
            if (bool5)
            {
              localObject6 = localViewFlinger.o00OooO.mState;
              i6 = ((RecyclerView.State)localObject6).getItemCount();
              if (i6 == 0)
              {
                ((RecyclerView.SmoothScroller)localObject5).stop();
              }
              else
              {
                i8 = ((RecyclerView.SmoothScroller)localObject5).getTargetPosition();
                if (i8 >= i6)
                {
                  i6 -= i;
                  ((RecyclerView.SmoothScroller)localObject5).setTargetPosition(i6);
                }
                ((RecyclerView.SmoothScroller)localObject5).onAnimation(i4, i7);
              }
            }
          }
        }
      }
      else
      {
        i7 = 0;
        localObject3 = null;
        i4 = 0;
      }
      localObject5 = localViewFlinger.o00OooO.mItemDecorations;
      boolean bool4 = ((ArrayList)localObject5).isEmpty();
      if (!bool4)
      {
        localObject5 = localViewFlinger.o00OooO;
        ((View)localObject5).invalidate();
      }
      localObject4 = localViewFlinger.o00OooO;
      localObject5 = ((RecyclerView)localObject4).mReusableIntPair;
      localObject5[0] = 0;
      localObject5[i] = 0;
      int i9 = 1;
      i3 = i7;
      ((RecyclerView)localObject4).dispatchNestedScroll(i4, i7, j, k, null, i9, (int[])localObject5);
      localObject5 = localViewFlinger.o00OooO;
      Object localObject6 = ((RecyclerView)localObject5).mReusableIntPair;
      int i8 = localObject6[0];
      j -= i8;
      int i6 = localObject6[i];
      k -= i6;
      if ((i4 != 0) || (i7 != 0)) {
        ((RecyclerView)localObject5).dispatchOnScrolled(i4, i7);
      }
      localObject5 = localViewFlinger.o00OooO;
      bool4 = RecyclerView.access$200((RecyclerView)localObject5);
      if (!bool4)
      {
        localObject5 = localViewFlinger.o00OooO;
        ((View)localObject5).invalidate();
      }
      int i1 = ((OverScroller)localObject1).getCurrX();
      i6 = ((OverScroller)localObject1).getFinalX();
      if (i1 == i6)
      {
        i1 = i;
      }
      else
      {
        i1 = 0;
        localObject5 = null;
      }
      i6 = ((OverScroller)localObject1).getCurrY();
      i8 = ((OverScroller)localObject1).getFinalY();
      if (i6 == i8)
      {
        i6 = i;
      }
      else
      {
        i6 = 0;
        localObject6 = null;
      }
      boolean bool7 = ((OverScroller)localObject1).isFinished();
      if ((!bool7) && (((i1 == 0) && (j == 0)) || ((i6 == 0) && (k == 0))))
      {
        i1 = 0;
        localObject5 = null;
      }
      else
      {
        i1 = i;
      }
      localObject6 = localViewFlinger.o00OooO.mLayout.mSmoothScroller;
      if (localObject6 != null)
      {
        bool6 = ((RecyclerView.SmoothScroller)localObject6).isPendingInitialRun();
        if (bool6)
        {
          bool6 = i;
          break label793;
        }
      }
      boolean bool6 = false;
      localObject6 = null;
      label793:
      if ((!bool6) && (i1 != 0))
      {
        localObject5 = localViewFlinger.o00OooO;
        i1 = ((View)localObject5).getOverScrollMode();
        if (i1 != i2)
        {
          float f = ((OverScroller)localObject1).getCurrVelocity();
          int i10 = (int)f;
          if (j < 0)
          {
            j = -i10;
          }
          else if (j > 0)
          {
            j = i10;
          }
          else
          {
            j = 0;
            localObject2 = null;
          }
          if (k < 0)
          {
            i10 = -i10;
          }
          else if (k <= 0)
          {
            i10 = 0;
            localObject1 = null;
            f = 0.0F;
          }
          localRecyclerView = localViewFlinger.o00OooO;
          localRecyclerView.absorbGlows(j, i10);
        }
        bool8 = RecyclerView.ALLOW_THREAD_GAP_WORK;
        if (bool8)
        {
          localObject1 = localViewFlinger.o00OooO.mPrefetchRegistry;
          ((GapWorker.LayoutPrefetchRegistryImpl)localObject1).OooO0O0();
        }
      }
      else
      {
        OooO0Oo();
        localObject1 = localViewFlinger.o00OooO;
        localObject2 = ((RecyclerView)localObject1).mGapWorker;
        if (localObject2 != null) {
          ((GapWorker)localObject2).OooO0o((RecyclerView)localObject1, i4, i7);
        }
      }
    }
    localObject1 = localViewFlinger.o00OooO.mLayout.mSmoothScroller;
    if (localObject1 != null)
    {
      boolean bool2 = ((RecyclerView.SmoothScroller)localObject1).isPendingInitialRun();
      if (bool2) {
        ((RecyclerView.SmoothScroller)localObject1).onAnimation(0, 0);
      }
    }
    localViewFlinger.o00Ooo0o = false;
    boolean bool8 = localViewFlinger.o00OooO0;
    if (bool8)
    {
      OooO0OO();
    }
    else
    {
      localViewFlinger.o00OooO.setScrollState(0);
      localObject1 = localViewFlinger.o00OooO;
      ((RecyclerView)localObject1).stopNestedScroll(i);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.ViewFlinger
 * JD-Core Version:    0.7.0.1
 */