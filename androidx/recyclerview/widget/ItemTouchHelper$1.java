package androidx.recyclerview.widget;

import android.view.View;
import androidx.core.view.ViewCompat;

class ItemTouchHelper$1
  implements Runnable
{
  public ItemTouchHelper$1(ItemTouchHelper paramItemTouchHelper) {}
  
  public void run()
  {
    Object localObject1 = this.o00OoOoo;
    Object localObject2 = ((ItemTouchHelper)localObject1).OooO0OO;
    if (localObject2 != null)
    {
      boolean bool = ((ItemTouchHelper)localObject1).OooOoO0();
      if (bool)
      {
        localObject1 = this.o00OoOoo;
        localObject2 = ((ItemTouchHelper)localObject1).OooO0OO;
        if (localObject2 != null) {
          ((ItemTouchHelper)localObject1).OooOo00((RecyclerView.ViewHolder)localObject2);
        }
        localObject1 = this.o00OoOoo;
        localObject2 = ((ItemTouchHelper)localObject1).OooOOo;
        localObject1 = ((ItemTouchHelper)localObject1).OooOOoo;
        ((View)localObject2).removeCallbacks((Runnable)localObject1);
        localObject1 = this.o00OoOoo.OooOOo;
        ViewCompat.o0OoOo0((View)localObject1, this);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.1
 * JD-Core Version:    0.7.0.1
 */