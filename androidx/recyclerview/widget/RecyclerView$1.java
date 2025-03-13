package androidx.recyclerview.widget;

import android.view.View;

class RecyclerView$1
  implements Runnable
{
  public RecyclerView$1(RecyclerView paramRecyclerView) {}
  
  public void run()
  {
    RecyclerView localRecyclerView = this.o00OoOoo;
    boolean bool1 = localRecyclerView.mFirstLayoutComplete;
    if (bool1)
    {
      boolean bool2 = localRecyclerView.isLayoutRequested();
      if (!bool2)
      {
        localRecyclerView = this.o00OoOoo;
        bool1 = localRecyclerView.mIsAttached;
        if (!bool1)
        {
          localRecyclerView.requestLayout();
          return;
        }
        bool1 = localRecyclerView.mLayoutSuppressed;
        if (bool1)
        {
          localRecyclerView.mLayoutWasDefered = true;
          return;
        }
        localRecyclerView.consumePendingUpdateOperations();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.1
 * JD-Core Version:    0.7.0.1
 */