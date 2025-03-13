package androidx.recyclerview.widget;

import android.database.Observable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.TraceCompat;
import androidx.core.view.ViewCompat;
import java.util.List;

public abstract class RecyclerView$Adapter
{
  private boolean mHasStableIds;
  private final RecyclerView.AdapterDataObservable mObservable;
  private RecyclerView.Adapter.StateRestorationPolicy mStateRestorationPolicy;
  
  public RecyclerView$Adapter()
  {
    Object localObject = new androidx/recyclerview/widget/RecyclerView$AdapterDataObservable;
    ((RecyclerView.AdapterDataObservable)localObject).<init>();
    this.mObservable = ((RecyclerView.AdapterDataObservable)localObject);
    this.mHasStableIds = false;
    localObject = RecyclerView.Adapter.StateRestorationPolicy.o00OoOoo;
    this.mStateRestorationPolicy = ((RecyclerView.Adapter.StateRestorationPolicy)localObject);
  }
  
  public final void bindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    Object localObject1 = paramViewHolder.mBindingAdapter;
    int i = 1;
    int j;
    if (localObject1 == null)
    {
      j = i;
    }
    else
    {
      j = 0;
      localObject1 = null;
    }
    if (j != 0)
    {
      paramViewHolder.mPosition = paramInt;
      boolean bool2 = hasStableIds();
      if (bool2)
      {
        long l = getItemId(paramInt);
        paramViewHolder.mItemId = l;
      }
      int k = 519;
      paramViewHolder.setFlags(i, k);
      localObject2 = "RV OnBindView";
      TraceCompat.OooO00o((String)localObject2);
    }
    paramViewHolder.mBindingAdapter = this;
    boolean bool3 = RecyclerView.sDebugAssertionsEnabled;
    boolean bool1;
    if (bool3)
    {
      localObject2 = paramViewHolder.itemView.getParent();
      IllegalStateException localIllegalStateException;
      if (localObject2 == null)
      {
        localObject2 = paramViewHolder.itemView;
        bool3 = ViewCompat.o000oOoO((View)localObject2);
        boolean bool4 = paramViewHolder.isTmpDetached();
        if (bool3 != bool4)
        {
          localIllegalStateException = new java/lang/IllegalStateException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Temp-detached state out of sync with reality. holder.isTmpDetached(): ");
          bool1 = paramViewHolder.isTmpDetached();
          ((StringBuilder)localObject1).append(bool1);
          ((StringBuilder)localObject1).append(", attached to window: ");
          bool1 = ViewCompat.o000oOoO(paramViewHolder.itemView);
          ((StringBuilder)localObject1).append(bool1);
          ((StringBuilder)localObject1).append(", holder: ");
          ((StringBuilder)localObject1).append(paramViewHolder);
          paramViewHolder = ((StringBuilder)localObject1).toString();
          localIllegalStateException.<init>(paramViewHolder);
          throw localIllegalStateException;
        }
      }
      localObject2 = paramViewHolder.itemView.getParent();
      if (localObject2 == null)
      {
        localObject2 = paramViewHolder.itemView;
        bool3 = ViewCompat.o000oOoO((View)localObject2);
        if (bool3)
        {
          localIllegalStateException = new java/lang/IllegalStateException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Attempting to bind attached holder with no parent (AKA temp detached): ");
          ((StringBuilder)localObject1).append(paramViewHolder);
          paramViewHolder = ((StringBuilder)localObject1).toString();
          localIllegalStateException.<init>(paramViewHolder);
          throw localIllegalStateException;
        }
      }
    }
    Object localObject2 = paramViewHolder.getUnmodifiedPayloads();
    onBindViewHolder(paramViewHolder, paramInt, (List)localObject2);
    if (j != 0)
    {
      paramViewHolder.clearPayload();
      paramViewHolder = paramViewHolder.itemView.getLayoutParams();
      paramInt = paramViewHolder instanceof RecyclerView.LayoutParams;
      if (paramInt != 0)
      {
        paramViewHolder = (RecyclerView.LayoutParams)paramViewHolder;
        paramViewHolder.OooO0OO = bool1;
      }
      TraceCompat.OooO0O0();
    }
  }
  
  public boolean canRestoreState()
  {
    int[] arrayOfInt = RecyclerView.7.OooO00o;
    int i = this.mStateRestorationPolicy.ordinal();
    int j = arrayOfInt[i];
    i = 0;
    int k = 1;
    if (j != k)
    {
      int m = 2;
      if (j != m) {
        return k;
      }
      j = getItemCount();
      if (j > 0) {
        i = k;
      }
    }
    return i;
  }
  
  public final RecyclerView.ViewHolder createViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject = "RV CreateView";
    try
    {
      TraceCompat.OooO00o((String)localObject);
      paramViewGroup = onCreateViewHolder(paramViewGroup, paramInt);
      localObject = paramViewGroup.itemView;
      localObject = ((View)localObject).getParent();
      if (localObject == null)
      {
        paramViewGroup.mItemViewType = paramInt;
        return paramViewGroup;
      }
      paramViewGroup = new java/lang/IllegalStateException;
      String str = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)";
      paramViewGroup.<init>(str);
      throw paramViewGroup;
    }
    finally
    {
      TraceCompat.OooO0O0();
    }
  }
  
  public int findRelativeAdapterPositionIn(Adapter paramAdapter, RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    if (paramAdapter == this) {
      return paramInt;
    }
    return -1;
  }
  
  public abstract int getItemCount();
  
  public long getItemId(int paramInt)
  {
    return -1;
  }
  
  public int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public final RecyclerView.Adapter.StateRestorationPolicy getStateRestorationPolicy()
  {
    return this.mStateRestorationPolicy;
  }
  
  public final boolean hasObservers()
  {
    return this.mObservable.OooO00o();
  }
  
  public final boolean hasStableIds()
  {
    return this.mHasStableIds;
  }
  
  public final void notifyDataSetChanged()
  {
    this.mObservable.OooO0O0();
  }
  
  public final void notifyItemChanged(int paramInt)
  {
    this.mObservable.OooO0Oo(paramInt, 1);
  }
  
  public final void notifyItemChanged(int paramInt, Object paramObject)
  {
    this.mObservable.OooO0o0(paramInt, 1, paramObject);
  }
  
  public final void notifyItemInserted(int paramInt)
  {
    this.mObservable.OooO0o(paramInt, 1);
  }
  
  public final void notifyItemMoved(int paramInt1, int paramInt2)
  {
    this.mObservable.OooO0OO(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeChanged(int paramInt1, int paramInt2)
  {
    this.mObservable.OooO0Oo(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    this.mObservable.OooO0o0(paramInt1, paramInt2, paramObject);
  }
  
  public final void notifyItemRangeInserted(int paramInt1, int paramInt2)
  {
    this.mObservable.OooO0o(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeRemoved(int paramInt1, int paramInt2)
  {
    this.mObservable.OooO0oO(paramInt1, paramInt2);
  }
  
  public final void notifyItemRemoved(int paramInt)
  {
    this.mObservable.OooO0oO(paramInt, 1);
  }
  
  public void onAttachedToRecyclerView(RecyclerView paramRecyclerView) {}
  
  public abstract void onBindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt);
  
  public void onBindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt, List paramList)
  {
    onBindViewHolder(paramViewHolder, paramInt);
  }
  
  public abstract RecyclerView.ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt);
  
  public void onDetachedFromRecyclerView(RecyclerView paramRecyclerView) {}
  
  public boolean onFailedToRecycleView(RecyclerView.ViewHolder paramViewHolder)
  {
    return false;
  }
  
  public void onViewAttachedToWindow(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onViewDetachedFromWindow(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onViewRecycled(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver paramAdapterDataObserver)
  {
    this.mObservable.registerObserver(paramAdapterDataObserver);
  }
  
  public void setHasStableIds(boolean paramBoolean)
  {
    boolean bool = hasObservers();
    if (!bool)
    {
      this.mHasStableIds = paramBoolean;
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    throw localIllegalStateException;
  }
  
  public void setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy paramStateRestorationPolicy)
  {
    this.mStateRestorationPolicy = paramStateRestorationPolicy;
    this.mObservable.OooO0oo();
  }
  
  public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver paramAdapterDataObserver)
  {
    this.mObservable.unregisterObserver(paramAdapterDataObserver);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.Adapter
 * JD-Core Version:    0.7.0.1
 */