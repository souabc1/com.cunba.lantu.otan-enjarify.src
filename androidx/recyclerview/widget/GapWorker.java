package androidx.recyclerview.widget;

import android.view.View;
import androidx.core.os.TraceCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class GapWorker
  implements Runnable
{
  public static final ThreadLocal o00Ooo0o;
  public static Comparator o00OooO0;
  public ArrayList o00OoOoo;
  public long o00Ooo0;
  public long o00Ooo00;
  public ArrayList o00Ooo0O;
  
  static
  {
    Object localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    o00Ooo0o = (ThreadLocal)localObject;
    localObject = new androidx/recyclerview/widget/GapWorker$1;
    ((GapWorker.1)localObject).<init>();
    o00OooO0 = (Comparator)localObject;
  }
  
  public GapWorker()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o00OoOoo = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o00Ooo0O = localArrayList;
  }
  
  public static boolean OooO0o0(RecyclerView paramRecyclerView, int paramInt)
  {
    ChildHelper localChildHelper = paramRecyclerView.mChildHelper;
    int i = localChildHelper.getUnfilteredChildCount();
    int j = 0;
    while (j < i)
    {
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramRecyclerView.mChildHelper.getUnfilteredChildAt(j));
      int k = localViewHolder.mPosition;
      if (k == paramInt)
      {
        boolean bool = localViewHolder.isInvalid();
        if (!bool) {
          return true;
        }
      }
      j += 1;
    }
    return false;
  }
  
  public final RecyclerView.ViewHolder OooO(RecyclerView paramRecyclerView, int paramInt, long paramLong)
  {
    boolean bool1 = OooO0o0(paramRecyclerView, paramInt);
    if (bool1) {
      return null;
    }
    RecyclerView.Recycler localRecycler = paramRecyclerView.mRecycler;
    try
    {
      paramRecyclerView.onEnterLayoutOrScroll();
      RecyclerView.ViewHolder localViewHolder = localRecycler.OooOooo(paramInt, false, paramLong);
      if (localViewHolder != null)
      {
        boolean bool2 = localViewHolder.isBound();
        if (bool2)
        {
          bool2 = localViewHolder.isInvalid();
          if (!bool2)
          {
            View localView = localViewHolder.itemView;
            localRecycler.OooOoOO(localView);
            break label88;
          }
        }
        localRecycler.OooO00o(localViewHolder, false);
      }
      label88:
      return localViewHolder;
    }
    finally
    {
      paramRecyclerView.onExitLayoutOrScroll(false);
    }
  }
  
  public void OooO00o(RecyclerView paramRecyclerView)
  {
    boolean bool = RecyclerView.sDebugAssertionsEnabled;
    if (bool)
    {
      ArrayList localArrayList = this.o00OoOoo;
      bool = localArrayList.contains(paramRecyclerView);
      if (bool)
      {
        paramRecyclerView = new java/lang/IllegalStateException;
        paramRecyclerView.<init>("RecyclerView already present in worker list!");
        throw paramRecyclerView;
      }
    }
    this.o00OoOoo.add(paramRecyclerView);
  }
  
  public final void OooO0O0()
  {
    ArrayList localArrayList = this.o00OoOoo;
    int i = localArrayList.size();
    Comparator localComparator = null;
    int j = 0;
    int k = 0;
    Object localObject1;
    int m;
    GapWorker.LayoutPrefetchRegistryImpl localLayoutPrefetchRegistryImpl;
    while (j < i)
    {
      localObject1 = (RecyclerView)this.o00OoOoo.get(j);
      m = ((View)localObject1).getWindowVisibility();
      if (m == 0)
      {
        localLayoutPrefetchRegistryImpl = ((RecyclerView)localObject1).mPrefetchRegistry;
        localLayoutPrefetchRegistryImpl.OooO0OO((RecyclerView)localObject1, false);
        localObject1 = ((RecyclerView)localObject1).mPrefetchRegistry;
        int n = ((GapWorker.LayoutPrefetchRegistryImpl)localObject1).OooO0Oo;
        k += n;
      }
      j += 1;
    }
    this.o00Ooo0O.ensureCapacity(k);
    j = 0;
    k = 0;
    while (j < i)
    {
      localObject1 = (RecyclerView)this.o00OoOoo.get(j);
      m = ((View)localObject1).getWindowVisibility();
      if (m == 0)
      {
        localLayoutPrefetchRegistryImpl = ((RecyclerView)localObject1).mPrefetchRegistry;
        int i1 = Math.abs(localLayoutPrefetchRegistryImpl.OooO00o);
        int i2 = Math.abs(localLayoutPrefetchRegistryImpl.OooO0O0);
        i1 += i2;
        i2 = 0;
        for (;;)
        {
          int i3 = localLayoutPrefetchRegistryImpl.OooO0Oo * 2;
          if (i2 >= i3) {
            break;
          }
          Object localObject2 = this.o00Ooo0O;
          i3 = ((ArrayList)localObject2).size();
          if (k >= i3)
          {
            localObject2 = new androidx/recyclerview/widget/GapWorker$Task;
            ((GapWorker.Task)localObject2).<init>();
            localObject3 = this.o00Ooo0O;
            ((ArrayList)localObject3).add(localObject2);
          }
          else
          {
            localObject2 = (GapWorker.Task)this.o00Ooo0O.get(k);
          }
          Object localObject3 = localLayoutPrefetchRegistryImpl.OooO0OO;
          int i4 = i2 + 1;
          i4 = localObject3[i4];
          boolean bool;
          if (i4 <= i1) {
            bool = true;
          } else {
            bool = false;
          }
          ((GapWorker.Task)localObject2).OooO00o = bool;
          ((GapWorker.Task)localObject2).OooO0O0 = i1;
          ((GapWorker.Task)localObject2).OooO0OO = i4;
          ((GapWorker.Task)localObject2).OooO0Oo = ((RecyclerView)localObject1);
          int i5 = localObject3[i2];
          ((GapWorker.Task)localObject2).OooO0o0 = i5;
          k += 1;
          i2 += 2;
        }
      }
      j += 1;
    }
    localArrayList = this.o00Ooo0O;
    localComparator = o00OooO0;
    Collections.sort(localArrayList, localComparator);
  }
  
  public final void OooO0OO(GapWorker.Task paramTask, long paramLong)
  {
    boolean bool = paramTask.OooO00o;
    long l;
    if (bool) {
      l = 9223372036854775807L;
    } else {
      l = paramLong;
    }
    RecyclerView localRecyclerView = paramTask.OooO0Oo;
    int i = paramTask.OooO0o0;
    paramTask = OooO(localRecyclerView, i, l);
    if (paramTask != null)
    {
      WeakReference localWeakReference = paramTask.mNestedRecyclerView;
      if (localWeakReference != null)
      {
        bool = paramTask.isBound();
        if (bool)
        {
          bool = paramTask.isInvalid();
          if (!bool)
          {
            paramTask = (RecyclerView)paramTask.mNestedRecyclerView.get();
            OooO0oo(paramTask, paramLong);
          }
        }
      }
    }
  }
  
  public final void OooO0Oo(long paramLong)
  {
    int i = 0;
    for (;;)
    {
      Object localObject = this.o00Ooo0O;
      int j = ((ArrayList)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (GapWorker.Task)this.o00Ooo0O.get(i);
      RecyclerView localRecyclerView = ((GapWorker.Task)localObject).OooO0Oo;
      if (localRecyclerView == null) {
        break;
      }
      OooO0OO((GapWorker.Task)localObject, paramLong);
      ((GapWorker.Task)localObject).OooO00o();
      i += 1;
    }
  }
  
  public void OooO0o(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    boolean bool = paramRecyclerView.isAttachedToWindow();
    if (bool)
    {
      bool = RecyclerView.sDebugAssertionsEnabled;
      if (bool)
      {
        ArrayList localArrayList = this.o00OoOoo;
        bool = localArrayList.contains(paramRecyclerView);
        if (!bool)
        {
          paramRecyclerView = new java/lang/IllegalStateException;
          paramRecyclerView.<init>("attempting to post unregistered view!");
          throw paramRecyclerView;
        }
      }
      long l1 = this.o00Ooo00;
      long l2 = 0L;
      bool = l1 < l2;
      if (!bool)
      {
        l1 = paramRecyclerView.getNanoTime();
        this.o00Ooo00 = l1;
        paramRecyclerView.post(this);
      }
    }
    paramRecyclerView.mPrefetchRegistry.setPrefetchVector(paramInt1, paramInt2);
  }
  
  public void OooO0oO(long paramLong)
  {
    OooO0O0();
    OooO0Oo(paramLong);
  }
  
  public final void OooO0oo(RecyclerView paramRecyclerView, long paramLong)
  {
    if (paramRecyclerView == null) {
      return;
    }
    boolean bool = paramRecyclerView.mDataSetHasChangedAfterLayout;
    if (bool)
    {
      localObject1 = paramRecyclerView.mChildHelper;
      int i = ((ChildHelper)localObject1).getUnfilteredChildCount();
      if (i != 0) {
        paramRecyclerView.removeAndRecycleViews();
      }
    }
    Object localObject1 = paramRecyclerView.mPrefetchRegistry;
    ((GapWorker.LayoutPrefetchRegistryImpl)localObject1).OooO0OO(paramRecyclerView, true);
    int j = ((GapWorker.LayoutPrefetchRegistryImpl)localObject1).OooO0Oo;
    if (j != 0)
    {
      Object localObject2 = "RV Nested Prefetch";
      try
      {
        TraceCompat.OooO00o((String)localObject2);
        localObject2 = paramRecyclerView.mState;
        Object localObject3 = paramRecyclerView.mAdapter;
        ((RecyclerView.State)localObject2).OooO0OO((RecyclerView.Adapter)localObject3);
        j = 0;
        localObject2 = null;
        for (;;)
        {
          int k = ((GapWorker.LayoutPrefetchRegistryImpl)localObject1).OooO0Oo * 2;
          if (j >= k) {
            break;
          }
          localObject3 = ((GapWorker.LayoutPrefetchRegistryImpl)localObject1).OooO0OO;
          k = localObject3[j];
          OooO(paramRecyclerView, k, paramLong);
          j += 2;
        }
      }
      finally
      {
        TraceCompat.OooO0O0();
      }
    }
  }
  
  public void OooOO0(RecyclerView paramRecyclerView)
  {
    ArrayList localArrayList = this.o00OoOoo;
    boolean bool1 = localArrayList.remove(paramRecyclerView);
    boolean bool2 = RecyclerView.sDebugAssertionsEnabled;
    if ((bool2) && (!bool1))
    {
      paramRecyclerView = new java/lang/IllegalStateException;
      paramRecyclerView.<init>("RecyclerView removal failed!");
      throw paramRecyclerView;
    }
  }
  
  public void run()
  {
    long l1 = 0L;
    Object localObject1 = "RV Prefetch";
    try
    {
      TraceCompat.OooO00o((String)localObject1);
      localObject1 = this.o00OoOoo;
      boolean bool1 = ((ArrayList)localObject1).isEmpty();
      if (bool1) {}
      boolean bool2;
      do
      {
        return;
        localObject1 = this.o00OoOoo;
        int i = ((ArrayList)localObject1).size();
        int j = 0;
        l2 = l1;
        while (j < i)
        {
          Object localObject3 = this.o00OoOoo;
          localObject3 = ((ArrayList)localObject3).get(j);
          localObject3 = (RecyclerView)localObject3;
          int k = ((View)localObject3).getWindowVisibility();
          if (k == 0)
          {
            long l3 = ((View)localObject3).getDrawingTime();
            l2 = Math.max(l3, l2);
          }
          j += 1;
        }
        bool2 = l2 < l1;
      } while (!bool2);
      localObject1 = TimeUnit.MILLISECONDS;
      long l4 = ((TimeUnit)localObject1).toNanos(l2);
      long l2 = this.o00Ooo0;
      l4 += l2;
      OooO0oO(l4);
      return;
    }
    finally
    {
      this.o00Ooo00 = l1;
      TraceCompat.OooO0O0();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.GapWorker
 * JD-Core Version:    0.7.0.1
 */