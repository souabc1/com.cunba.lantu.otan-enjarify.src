package androidx.recyclerview.widget;

import android.view.View;

class ItemTouchHelper$4
  implements Runnable
{
  public ItemTouchHelper$4(ItemTouchHelper paramItemTouchHelper, ItemTouchHelper.RecoverAnimation paramRecoverAnimation, int paramInt) {}
  
  public void run()
  {
    Object localObject = this.o00Ooo0.OooOOo;
    if (localObject != null)
    {
      boolean bool1 = ((RecyclerView)localObject).isAttachedToWindow();
      if (bool1)
      {
        localObject = this.o00OoOoo;
        boolean bool3 = ((ItemTouchHelper.RecoverAnimation)localObject).o00Ooooo;
        if (!bool3)
        {
          localObject = ((ItemTouchHelper.RecoverAnimation)localObject).o00Ooo0o;
          int i = ((RecyclerView.ViewHolder)localObject).getAbsoluteAdapterPosition();
          int j = -1;
          if (i != j)
          {
            localObject = this.o00Ooo0.OooOOo.getItemAnimator();
            RecyclerView.ViewHolder localViewHolder;
            boolean bool2;
            if (localObject != null)
            {
              j = 0;
              localViewHolder = null;
              bool2 = ((RecyclerView.ItemAnimator)localObject).OooOO0o(null);
              if (bool2) {}
            }
            else
            {
              localObject = this.o00Ooo0;
              bool2 = ((ItemTouchHelper)localObject).OooOOo();
              if (!bool2)
              {
                localObject = this.o00Ooo0.OooOOO0;
                localViewHolder = this.o00OoOoo.o00Ooo0o;
                int k = this.o00Ooo00;
                ((ItemTouchHelper.Callback)localObject).OooOoO0(localViewHolder, k);
                return;
              }
            }
            localObject = this.o00Ooo0.OooOOo;
            ((View)localObject).post(this);
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.4
 * JD-Core Version:    0.7.0.1
 */