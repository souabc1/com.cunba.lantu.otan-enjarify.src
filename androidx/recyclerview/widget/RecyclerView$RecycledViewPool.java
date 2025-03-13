package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import androidx.customview.poolingcontainer.PoolingContainer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RecyclerView$RecycledViewPool
{
  public SparseArray OooO00o;
  public int OooO0O0;
  public Set OooO0OO;
  
  public RecyclerView$RecycledViewPool()
  {
    Object localObject = new android/util/SparseArray;
    ((SparseArray)localObject).<init>();
    this.OooO00o = ((SparseArray)localObject);
    this.OooO0O0 = 0;
    localObject = new java/util/IdentityHashMap;
    ((IdentityHashMap)localObject).<init>();
    localObject = Collections.newSetFromMap((Map)localObject);
    this.OooO0OO = ((Set)localObject);
  }
  
  private RecyclerView.RecycledViewPool.ScrapData getScrapDataForType(int paramInt)
  {
    RecyclerView.RecycledViewPool.ScrapData localScrapData = (RecyclerView.RecycledViewPool.ScrapData)this.OooO00o.get(paramInt);
    if (localScrapData == null)
    {
      localScrapData = new androidx/recyclerview/widget/RecyclerView$RecycledViewPool$ScrapData;
      localScrapData.<init>();
      SparseArray localSparseArray = this.OooO00o;
      localSparseArray.put(paramInt, localScrapData);
    }
    return localScrapData;
  }
  
  public void OooO(RecyclerView.ViewHolder paramViewHolder)
  {
    int i = paramViewHolder.getItemViewType();
    ArrayList localArrayList = getScrapDataForType(i).OooO00o;
    SparseArray localSparseArray = this.OooO00o;
    RecyclerView.RecycledViewPool.ScrapData localScrapData = (RecyclerView.RecycledViewPool.ScrapData)localSparseArray.get(i);
    i = localScrapData.OooO0O0;
    int j = localArrayList.size();
    if (i <= j)
    {
      PoolingContainer.OooO00o(paramViewHolder.itemView);
      return;
    }
    boolean bool = RecyclerView.sDebugAssertionsEnabled;
    if (bool)
    {
      bool = localArrayList.contains(paramViewHolder);
      if (bool)
      {
        paramViewHolder = new java/lang/IllegalArgumentException;
        paramViewHolder.<init>("this scrap item already exists");
        throw paramViewHolder;
      }
    }
    paramViewHolder.resetInternal();
    localArrayList.add(paramViewHolder);
  }
  
  public void OooO00o()
  {
    int i = this.OooO0O0 + 1;
    this.OooO0O0 = i;
  }
  
  public void OooO0O0(RecyclerView.Adapter paramAdapter)
  {
    this.OooO0OO.add(paramAdapter);
  }
  
  public void OooO0OO()
  {
    int i = 0;
    for (;;)
    {
      Object localObject = this.OooO00o;
      int j = ((SparseArray)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (RecyclerView.RecycledViewPool.ScrapData)this.OooO00o.valueAt(i);
      Iterator localIterator = ((RecyclerView.RecycledViewPool.ScrapData)localObject).OooO00o.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        View localView = ((RecyclerView.ViewHolder)localIterator.next()).itemView;
        PoolingContainer.OooO00o(localView);
      }
      localObject = ((RecyclerView.RecycledViewPool.ScrapData)localObject).OooO00o;
      ((ArrayList)localObject).clear();
      i += 1;
    }
  }
  
  public void OooO0Oo()
  {
    int i = this.OooO0O0 + -1;
    this.OooO0O0 = i;
  }
  
  public void OooO0o(int paramInt, long paramLong)
  {
    RecyclerView.RecycledViewPool.ScrapData localScrapData = getScrapDataForType(paramInt);
    long l = localScrapData.OooO0Oo;
    paramLong = OooOO0(l, paramLong);
    localScrapData.OooO0Oo = paramLong;
  }
  
  public void OooO0o0(RecyclerView.Adapter paramAdapter, boolean paramBoolean)
  {
    Object localObject = this.OooO0OO;
    ((Set)localObject).remove(paramAdapter);
    paramAdapter = this.OooO0OO;
    int i = paramAdapter.size();
    if ((i == 0) && (!paramBoolean))
    {
      i = 0;
      paramAdapter = null;
      paramBoolean = false;
      for (;;)
      {
        localObject = this.OooO00o;
        boolean bool = ((SparseArray)localObject).size();
        if (paramBoolean >= bool) {
          break;
        }
        localObject = this.OooO00o;
        int j = ((SparseArray)localObject).keyAt(paramBoolean);
        localObject = ((RecyclerView.RecycledViewPool.ScrapData)((SparseArray)localObject).get(j)).OooO00o;
        j = 0;
        for (;;)
        {
          int k = ((ArrayList)localObject).size();
          if (j >= k) {
            break;
          }
          View localView = ((RecyclerView.ViewHolder)((ArrayList)localObject).get(j)).itemView;
          PoolingContainer.OooO00o(localView);
          j += 1;
        }
        paramBoolean += true;
      }
    }
  }
  
  public void OooO0oO(int paramInt, long paramLong)
  {
    RecyclerView.RecycledViewPool.ScrapData localScrapData = getScrapDataForType(paramInt);
    long l = localScrapData.OooO0OO;
    paramLong = OooOO0(l, paramLong);
    localScrapData.OooO0OO = paramLong;
  }
  
  public void OooO0oo(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2, boolean paramBoolean)
  {
    if (paramAdapter1 != null) {
      OooO0Oo();
    }
    if (!paramBoolean)
    {
      int i = this.OooO0O0;
      if (i == 0) {
        OooO0OO();
      }
    }
    if (paramAdapter2 != null) {
      OooO00o();
    }
  }
  
  public long OooOO0(long paramLong1, long paramLong2)
  {
    long l = 0L;
    boolean bool = paramLong1 < l;
    if (!bool) {
      return paramLong2;
    }
    l = 4;
    paramLong1 = paramLong1 / l * 3;
    paramLong2 /= l;
    return paramLong1 + paramLong2;
  }
  
  public boolean OooOO0O(int paramInt, long paramLong1, long paramLong2)
  {
    RecyclerView.RecycledViewPool.ScrapData localScrapData = getScrapDataForType(paramInt);
    long l1 = localScrapData.OooO0Oo;
    long l2 = 0L;
    paramInt = l1 < l2;
    if (paramInt != 0)
    {
      paramLong1 += l1;
      paramInt = paramLong1 < paramLong2;
      if (paramInt >= 0)
      {
        paramInt = 0;
        localScrapData = null;
        return paramInt;
      }
    }
    paramInt = 1;
    return paramInt;
  }
  
  public boolean OooOO0o(int paramInt, long paramLong1, long paramLong2)
  {
    RecyclerView.RecycledViewPool.ScrapData localScrapData = getScrapDataForType(paramInt);
    long l1 = localScrapData.OooO0OO;
    long l2 = 0L;
    paramInt = l1 < l2;
    if (paramInt != 0)
    {
      paramLong1 += l1;
      paramInt = paramLong1 < paramLong2;
      if (paramInt >= 0)
      {
        paramInt = 0;
        localScrapData = null;
        return paramInt;
      }
    }
    paramInt = 1;
    return paramInt;
  }
  
  public RecyclerView.ViewHolder getRecycledView(int paramInt)
  {
    Object localObject1 = this.OooO00o;
    Object localObject2 = (RecyclerView.RecycledViewPool.ScrapData)((SparseArray)localObject1).get(paramInt);
    if (localObject2 != null)
    {
      localObject1 = ((RecyclerView.RecycledViewPool.ScrapData)localObject2).OooO00o;
      boolean bool1 = ((ArrayList)localObject1).isEmpty();
      if (!bool1)
      {
        localObject2 = ((RecyclerView.RecycledViewPool.ScrapData)localObject2).OooO00o;
        int i = ((ArrayList)localObject2).size() + -1;
        while (i >= 0)
        {
          RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)((ArrayList)localObject2).get(i);
          boolean bool2 = localViewHolder.isAttachedToTransitionOverlay();
          if (!bool2) {
            return (RecyclerView.ViewHolder)((ArrayList)localObject2).remove(i);
          }
          i += -1;
        }
      }
    }
    return null;
  }
  
  public int getRecycledViewCount(int paramInt)
  {
    return getScrapDataForType(paramInt).OooO00o.size();
  }
  
  public void setMaxRecycledViews(int paramInt1, int paramInt2)
  {
    Object localObject = getScrapDataForType(paramInt1);
    ((RecyclerView.RecycledViewPool.ScrapData)localObject).OooO0O0 = paramInt2;
    localObject = ((RecyclerView.RecycledViewPool.ScrapData)localObject).OooO00o;
    for (;;)
    {
      int i = ((ArrayList)localObject).size();
      if (i <= paramInt2) {
        break;
      }
      i = ((ArrayList)localObject).size() + -1;
      ((ArrayList)localObject).remove(i);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.RecycledViewPool
 * JD-Core Version:    0.7.0.1
 */