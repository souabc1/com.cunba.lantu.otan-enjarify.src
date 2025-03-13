package androidx.recyclerview.widget;

import android.view.ViewGroup;

class NestedAdapterWrapper
{
  public final ViewTypeStorage.ViewTypeLookup OooO00o;
  public final StableIdStorage.StableIdLookup OooO0O0;
  public final RecyclerView.Adapter OooO0OO;
  public final NestedAdapterWrapper.Callback OooO0Oo;
  public int OooO0o0;
  
  public void OooO00o(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    this.OooO0OO.bindViewHolder(paramViewHolder, paramInt);
  }
  
  public RecyclerView.ViewHolder OooO0O0(ViewGroup paramViewGroup, int paramInt)
  {
    paramInt = this.OooO00o.OooO00o(paramInt);
    return this.OooO0OO.onCreateViewHolder(paramViewGroup, paramInt);
  }
  
  public int getCachedItemCount()
  {
    return this.OooO0o0;
  }
  
  public long getItemId(int paramInt)
  {
    long l = this.OooO0OO.getItemId(paramInt);
    return this.OooO0O0.OooO00o(l);
  }
  
  public int getItemViewType(int paramInt)
  {
    ViewTypeStorage.ViewTypeLookup localViewTypeLookup = this.OooO00o;
    paramInt = this.OooO0OO.getItemViewType(paramInt);
    return localViewTypeLookup.OooO0O0(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.NestedAdapterWrapper
 * JD-Core Version:    0.7.0.1
 */