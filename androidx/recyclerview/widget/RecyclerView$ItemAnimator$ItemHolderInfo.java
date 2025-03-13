package androidx.recyclerview.widget;

import android.view.View;

public class RecyclerView$ItemAnimator$ItemHolderInfo
{
  public int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  
  public ItemHolderInfo OooO00o(RecyclerView.ViewHolder paramViewHolder)
  {
    return OooO0O0(paramViewHolder, 0);
  }
  
  public ItemHolderInfo OooO0O0(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    paramViewHolder = paramViewHolder.itemView;
    paramInt = paramViewHolder.getLeft();
    this.OooO00o = paramInt;
    paramInt = paramViewHolder.getTop();
    this.OooO0O0 = paramInt;
    paramInt = paramViewHolder.getRight();
    this.OooO0OO = paramInt;
    int i = paramViewHolder.getBottom();
    this.OooO0Oo = i;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo
 * JD-Core Version:    0.7.0.1
 */