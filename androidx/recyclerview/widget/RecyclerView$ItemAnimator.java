package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;

public abstract class RecyclerView$ItemAnimator
{
  public RecyclerView.ItemAnimator.ItemAnimatorListener OooO00o = null;
  public ArrayList OooO0O0;
  public long OooO0OO;
  public long OooO0Oo;
  public long OooO0o;
  public long OooO0o0;
  
  public RecyclerView$ItemAnimator()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0O0 = localArrayList;
    long l = 120;
    this.OooO0OO = l;
    this.OooO0Oo = l;
    l = 250L;
    this.OooO0o0 = l;
    this.OooO0o = l;
  }
  
  public static int OooO0o0(RecyclerView.ViewHolder paramViewHolder)
  {
    int i = paramViewHolder.mFlags & 0xE;
    boolean bool = paramViewHolder.isInvalid();
    if (bool) {
      return 4;
    }
    int j = i & 0x4;
    if (j == 0)
    {
      j = paramViewHolder.getOldPosition();
      int k = paramViewHolder.getAbsoluteAdapterPosition();
      int m = -1;
      if ((j != m) && (k != m) && (j != k)) {
        i |= 0x800;
      }
    }
    return i;
  }
  
  public final void OooO()
  {
    ArrayList localArrayList = this.OooO0O0;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      RecyclerView.ItemAnimator.ItemAnimatorFinishedListener localItemAnimatorFinishedListener = (RecyclerView.ItemAnimator.ItemAnimatorFinishedListener)this.OooO0O0.get(j);
      localItemAnimatorFinishedListener.OooO00o();
      j += 1;
    }
    this.OooO0O0.clear();
  }
  
  public abstract boolean OooO00o(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public abstract boolean OooO0O0(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public abstract boolean OooO0OO(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public abstract boolean OooO0Oo(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public boolean OooO0o(RecyclerView.ViewHolder paramViewHolder)
  {
    return true;
  }
  
  public boolean OooO0oO(RecyclerView.ViewHolder paramViewHolder, List paramList)
  {
    return OooO0o(paramViewHolder);
  }
  
  public final void OooO0oo(RecyclerView.ViewHolder paramViewHolder)
  {
    OooOOO(paramViewHolder);
    RecyclerView.ItemAnimator.ItemAnimatorListener localItemAnimatorListener = this.OooO00o;
    if (localItemAnimatorListener != null) {
      localItemAnimatorListener.OooO00o(paramViewHolder);
    }
  }
  
  public abstract void OooOO0(RecyclerView.ViewHolder paramViewHolder);
  
  public abstract void OooOO0O();
  
  public final boolean OooOO0o(RecyclerView.ItemAnimator.ItemAnimatorFinishedListener paramItemAnimatorFinishedListener)
  {
    boolean bool = isRunning();
    if (paramItemAnimatorFinishedListener != null) {
      if (!bool)
      {
        paramItemAnimatorFinishedListener.OooO00o();
      }
      else
      {
        ArrayList localArrayList = this.OooO0O0;
        localArrayList.add(paramItemAnimatorFinishedListener);
      }
    }
    return bool;
  }
  
  public void OooOOO(RecyclerView.ViewHolder paramViewHolder) {}
  
  public RecyclerView.ItemAnimator.ItemHolderInfo OooOOO0()
  {
    RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo = new androidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;
    localItemHolderInfo.<init>();
    return localItemHolderInfo;
  }
  
  public RecyclerView.ItemAnimator.ItemHolderInfo OooOOOO(RecyclerView.State paramState, RecyclerView.ViewHolder paramViewHolder)
  {
    return OooOOO0().OooO00o(paramViewHolder);
  }
  
  public RecyclerView.ItemAnimator.ItemHolderInfo OooOOOo(RecyclerView.State paramState, RecyclerView.ViewHolder paramViewHolder, int paramInt, List paramList)
  {
    return OooOOO0().OooO00o(paramViewHolder);
  }
  
  public abstract void OooOOo0();
  
  public long getAddDuration()
  {
    return this.OooO0OO;
  }
  
  public long getChangeDuration()
  {
    return this.OooO0o;
  }
  
  public long getMoveDuration()
  {
    return this.OooO0o0;
  }
  
  public long getRemoveDuration()
  {
    return this.OooO0Oo;
  }
  
  public abstract boolean isRunning();
  
  public void setAddDuration(long paramLong)
  {
    this.OooO0OO = paramLong;
  }
  
  public void setChangeDuration(long paramLong)
  {
    this.OooO0o = paramLong;
  }
  
  public void setListener(RecyclerView.ItemAnimator.ItemAnimatorListener paramItemAnimatorListener)
  {
    this.OooO00o = paramItemAnimatorListener;
  }
  
  public void setMoveDuration(long paramLong)
  {
    this.OooO0o0 = paramLong;
  }
  
  public void setRemoveDuration(long paramLong)
  {
    this.OooO0Oo = paramLong;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.ItemAnimator
 * JD-Core Version:    0.7.0.1
 */