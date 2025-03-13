package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;

class ViewPager2$SmoothScrollToPosition
  implements Runnable
{
  public final int o00OoOoo;
  public final RecyclerView o00Ooo00;
  
  public ViewPager2$SmoothScrollToPosition(int paramInt, RecyclerView paramRecyclerView)
  {
    this.o00OoOoo = paramInt;
    this.o00Ooo00 = paramRecyclerView;
  }
  
  public void run()
  {
    RecyclerView localRecyclerView = this.o00Ooo00;
    int i = this.o00OoOoo;
    localRecyclerView.smoothScrollToPosition(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.SmoothScrollToPosition
 * JD-Core Version:    0.7.0.1
 */