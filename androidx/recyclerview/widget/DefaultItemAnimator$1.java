package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$1
  implements Runnable
{
  public DefaultItemAnimator$1(DefaultItemAnimator paramDefaultItemAnimator, ArrayList paramArrayList) {}
  
  public void run()
  {
    Object localObject1 = this.o00OoOoo.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (DefaultItemAnimator.MoveInfo)((Iterator)localObject1).next();
      DefaultItemAnimator localDefaultItemAnimator = this.o00Ooo00;
      RecyclerView.ViewHolder localViewHolder = ((DefaultItemAnimator.MoveInfo)localObject2).OooO00o;
      int i = ((DefaultItemAnimator.MoveInfo)localObject2).OooO0O0;
      int j = ((DefaultItemAnimator.MoveInfo)localObject2).OooO0OO;
      int k = ((DefaultItemAnimator.MoveInfo)localObject2).OooO0Oo;
      int m = ((DefaultItemAnimator.MoveInfo)localObject2).OooO0o0;
      localDefaultItemAnimator.Oooo0oO(localViewHolder, i, j, k, m);
    }
    this.o00OoOoo.clear();
    localObject1 = this.o00Ooo00.OooOOO0;
    Object localObject2 = this.o00OoOoo;
    ((ArrayList)localObject1).remove(localObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.1
 * JD-Core Version:    0.7.0.1
 */