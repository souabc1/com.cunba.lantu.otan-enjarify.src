package androidx.recyclerview.widget;

class RecyclerView$2
  implements Runnable
{
  public RecyclerView$2(RecyclerView paramRecyclerView) {}
  
  public void run()
  {
    RecyclerView.ItemAnimator localItemAnimator = this.o00OoOoo.mItemAnimator;
    if (localItemAnimator != null) {
      localItemAnimator.OooOOo0();
    }
    this.o00OoOoo.mPostedAnimatorRunner = false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.2
 * JD-Core Version:    0.7.0.1
 */