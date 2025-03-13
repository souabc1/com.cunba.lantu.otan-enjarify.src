package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

class LinearLayoutManager$LayoutState
{
  public int OooO = 0;
  public boolean OooO00o = true;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  public int OooO0oo = 0;
  public boolean OooOO0 = false;
  public int OooOO0O;
  public List OooOO0o = null;
  public boolean OooOOO0;
  
  public void OooO00o()
  {
    OooO0O0(null);
  }
  
  public void OooO0O0(View paramView)
  {
    paramView = OooO0o(paramView);
    int i;
    if (paramView == null)
    {
      i = -1;
    }
    else
    {
      paramView = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      i = paramView.getViewLayoutPosition();
    }
    this.OooO0Oo = i;
  }
  
  public boolean OooO0OO(RecyclerView.State paramState)
  {
    int i = this.OooO0Oo;
    if (i >= 0)
    {
      j = paramState.getItemCount();
      if (i < j) {
        return 1;
      }
    }
    int j = 0;
    paramState = null;
    return j;
  }
  
  public View OooO0Oo(RecyclerView.Recycler paramRecycler)
  {
    List localList = this.OooOO0o;
    if (localList != null) {
      return OooO0o0();
    }
    int i = this.OooO0Oo;
    paramRecycler = paramRecycler.getViewForPosition(i);
    i = this.OooO0Oo;
    int j = this.OooO0o0;
    i += j;
    this.OooO0Oo = i;
    return paramRecycler;
  }
  
  public View OooO0o(View paramView)
  {
    List localList = this.OooOO0o;
    int i = localList.size();
    Object localObject = null;
    int j = -1 >>> 1;
    int k = 0;
    while (k < i)
    {
      View localView = ((RecyclerView.ViewHolder)this.OooOO0o.get(k)).itemView;
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
      if (localView != paramView)
      {
        boolean bool = localLayoutParams.isItemRemoved();
        if (!bool)
        {
          int n = localLayoutParams.getViewLayoutPosition();
          int m = this.OooO0Oo;
          n -= m;
          m = this.OooO0o0;
          n *= m;
          if ((n >= 0) && (n < j))
          {
            localObject = localView;
            if (n == 0) {
              break;
            }
            j = n;
          }
        }
      }
      k += 1;
    }
    return localObject;
  }
  
  public final View OooO0o0()
  {
    List localList = this.OooOO0o;
    int i = localList.size();
    int j = 0;
    while (j < i)
    {
      View localView = ((RecyclerView.ViewHolder)this.OooOO0o.get(j)).itemView;
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
      boolean bool = localLayoutParams.isItemRemoved();
      if (!bool)
      {
        int k = this.OooO0Oo;
        int m = localLayoutParams.getViewLayoutPosition();
        if (k == m)
        {
          OooO0O0(localView);
          return localView;
        }
      }
      j += 1;
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager.LayoutState
 * JD-Core Version:    0.7.0.1
 */