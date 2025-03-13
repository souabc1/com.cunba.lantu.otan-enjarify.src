package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;

class ViewInfoStore
{
  public final SimpleArrayMap OooO00o;
  public final LongSparseArray OooO0O0;
  
  public ViewInfoStore()
  {
    Object localObject = new androidx/collection/SimpleArrayMap;
    ((SimpleArrayMap)localObject).<init>();
    this.OooO00o = ((SimpleArrayMap)localObject);
    localObject = new androidx/collection/LongSparseArray;
    ((LongSparseArray)localObject).<init>();
    this.OooO0O0 = ((LongSparseArray)localObject);
  }
  
  public boolean OooO(RecyclerView.ViewHolder paramViewHolder)
  {
    SimpleArrayMap localSimpleArrayMap = this.OooO00o;
    paramViewHolder = (ViewInfoStore.InfoRecord)localSimpleArrayMap.get(paramViewHolder);
    if (paramViewHolder != null)
    {
      i = paramViewHolder.OooO00o & 0x4;
      if (i != 0) {
        return 1;
      }
    }
    int i = 0;
    paramViewHolder = null;
    return i;
  }
  
  public void OooO00o(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.OooO00o.get(paramViewHolder);
    if (localInfoRecord == null)
    {
      localInfoRecord = ViewInfoStore.InfoRecord.OooO0O0();
      SimpleArrayMap localSimpleArrayMap = this.OooO00o;
      localSimpleArrayMap.put(paramViewHolder, localInfoRecord);
    }
    int i = localInfoRecord.OooO00o | 0x2;
    localInfoRecord.OooO00o = i;
    localInfoRecord.OooO0O0 = paramItemHolderInfo;
  }
  
  public void OooO0O0(RecyclerView.ViewHolder paramViewHolder)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.OooO00o.get(paramViewHolder);
    if (localInfoRecord == null)
    {
      localInfoRecord = ViewInfoStore.InfoRecord.OooO0O0();
      SimpleArrayMap localSimpleArrayMap = this.OooO00o;
      localSimpleArrayMap.put(paramViewHolder, localInfoRecord);
    }
    int i = localInfoRecord.OooO00o | 0x1;
    localInfoRecord.OooO00o = i;
  }
  
  public void OooO0OO(long paramLong, RecyclerView.ViewHolder paramViewHolder)
  {
    this.OooO0O0.OooOO0o(paramLong, paramViewHolder);
  }
  
  public void OooO0Oo(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.OooO00o.get(paramViewHolder);
    if (localInfoRecord == null)
    {
      localInfoRecord = ViewInfoStore.InfoRecord.OooO0O0();
      SimpleArrayMap localSimpleArrayMap = this.OooO00o;
      localSimpleArrayMap.put(paramViewHolder, localInfoRecord);
    }
    localInfoRecord.OooO0OO = paramItemHolderInfo;
    int i = localInfoRecord.OooO00o | 0x8;
    localInfoRecord.OooO00o = i;
  }
  
  public void OooO0o()
  {
    this.OooO00o.clear();
    this.OooO0O0.OooO0O0();
  }
  
  public void OooO0o0(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.OooO00o.get(paramViewHolder);
    if (localInfoRecord == null)
    {
      localInfoRecord = ViewInfoStore.InfoRecord.OooO0O0();
      SimpleArrayMap localSimpleArrayMap = this.OooO00o;
      localSimpleArrayMap.put(paramViewHolder, localInfoRecord);
    }
    localInfoRecord.OooO0O0 = paramItemHolderInfo;
    int i = localInfoRecord.OooO00o | 0x4;
    localInfoRecord.OooO00o = i;
  }
  
  public RecyclerView.ViewHolder OooO0oO(long paramLong)
  {
    return (RecyclerView.ViewHolder)this.OooO0O0.OooO0oo(paramLong);
  }
  
  public boolean OooO0oo(RecyclerView.ViewHolder paramViewHolder)
  {
    SimpleArrayMap localSimpleArrayMap = this.OooO00o;
    paramViewHolder = (ViewInfoStore.InfoRecord)localSimpleArrayMap.get(paramViewHolder);
    int j;
    if (paramViewHolder != null)
    {
      int i = paramViewHolder.OooO00o;
      j = 1;
      i &= j;
      if (i != 0) {}
    }
    else
    {
      j = 0;
      localSimpleArrayMap = null;
    }
    return j;
  }
  
  public void OooOO0() {}
  
  public void OooOO0O(RecyclerView.ViewHolder paramViewHolder)
  {
    OooOOOo(paramViewHolder);
  }
  
  public final RecyclerView.ItemAnimator.ItemHolderInfo OooOO0o(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = this.OooO00o.OooO0o(paramViewHolder);
    int j = 0;
    SimpleArrayMap localSimpleArrayMap = null;
    if (i < 0) {
      return null;
    }
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.OooO00o.OooOOO0(i);
    if (localInfoRecord != null)
    {
      int k = localInfoRecord.OooO00o;
      int m = k & paramInt;
      if (m != 0)
      {
        j = (paramInt ^ 0xFFFFFFFF) & k;
        localInfoRecord.OooO00o = j;
        k = 4;
        RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo;
        if (paramInt == k)
        {
          localItemHolderInfo = localInfoRecord.OooO0O0;
        }
        else
        {
          k = 8;
          if (paramInt != k) {
            break label141;
          }
          localItemHolderInfo = localInfoRecord.OooO0OO;
        }
        j &= 0xC;
        if (j == 0)
        {
          localSimpleArrayMap = this.OooO00o;
          localSimpleArrayMap.OooOO0O(i);
          ViewInfoStore.InfoRecord.OooO0OO(localInfoRecord);
        }
        return localItemHolderInfo;
        label141:
        paramViewHolder = new java/lang/IllegalArgumentException;
        paramViewHolder.<init>("Must provide flag PRE or POST");
        throw paramViewHolder;
      }
    }
    return null;
  }
  
  public RecyclerView.ItemAnimator.ItemHolderInfo OooOOO(RecyclerView.ViewHolder paramViewHolder)
  {
    return OooOO0o(paramViewHolder, 4);
  }
  
  public RecyclerView.ItemAnimator.ItemHolderInfo OooOOO0(RecyclerView.ViewHolder paramViewHolder)
  {
    return OooOO0o(paramViewHolder, 8);
  }
  
  public void OooOOOO(ViewInfoStore.ProcessCallback paramProcessCallback)
  {
    SimpleArrayMap localSimpleArrayMap = this.OooO00o;
    int i = localSimpleArrayMap.size() + -1;
    while (i >= 0)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)this.OooO00o.OooO(i);
      ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.OooO00o.OooOO0O(i);
      int j = localInfoRecord.OooO00o;
      int k = j & 0x3;
      int m = 3;
      if (k == m) {}
      RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo1;
      do
      {
        paramProcessCallback.OooO00o(localViewHolder);
        break label260;
        k = j & 0x1;
        if (k == 0) {
          break;
        }
        localItemHolderInfo1 = localInfoRecord.OooO0O0;
      } while (localItemHolderInfo1 == null);
      RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo2 = localInfoRecord.OooO0OO;
      paramProcessCallback.OooO0OO(localViewHolder, localItemHolderInfo1, localItemHolderInfo2);
      break label260;
      k = j & 0xE;
      m = 14;
      if (k == m) {}
      do
      {
        localItemHolderInfo1 = localInfoRecord.OooO0O0;
        localItemHolderInfo2 = localInfoRecord.OooO0OO;
        paramProcessCallback.OooO0O0(localViewHolder, localItemHolderInfo1, localItemHolderInfo2);
        break label260;
        k = j & 0xC;
        m = 12;
        if (k == m)
        {
          localItemHolderInfo1 = localInfoRecord.OooO0O0;
          localItemHolderInfo2 = localInfoRecord.OooO0OO;
          paramProcessCallback.OooO0Oo(localViewHolder, localItemHolderInfo1, localItemHolderInfo2);
          break label260;
        }
        k = j & 0x4;
        if (k != 0)
        {
          localItemHolderInfo1 = localInfoRecord.OooO0O0;
          k = 0;
          localItemHolderInfo2 = null;
          break;
        }
        j &= 0x8;
      } while (j != 0);
      label260:
      ViewInfoStore.InfoRecord.OooO0OO(localInfoRecord);
      i += -1;
    }
  }
  
  public void OooOOOo(RecyclerView.ViewHolder paramViewHolder)
  {
    SimpleArrayMap localSimpleArrayMap = this.OooO00o;
    paramViewHolder = (ViewInfoStore.InfoRecord)localSimpleArrayMap.get(paramViewHolder);
    if (paramViewHolder == null) {
      return;
    }
    int i = paramViewHolder.OooO00o & 0xFFFFFFFE;
    paramViewHolder.OooO00o = i;
  }
  
  public void OooOOo0(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject1 = this.OooO0O0;
    int i = ((LongSparseArray)localObject1).OooOOOO() + -1;
    while (i >= 0)
    {
      Object localObject2 = this.OooO0O0.OooOOOo(i);
      if (paramViewHolder == localObject2)
      {
        localObject2 = this.OooO0O0;
        ((LongSparseArray)localObject2).OooOOO(i);
        break;
      }
      i += -1;
    }
    localObject1 = this.OooO00o;
    paramViewHolder = (ViewInfoStore.InfoRecord)((SimpleArrayMap)localObject1).remove(paramViewHolder);
    if (paramViewHolder != null) {
      ViewInfoStore.InfoRecord.OooO0OO(paramViewHolder);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ViewInfoStore
 * JD-Core Version:    0.7.0.1
 */