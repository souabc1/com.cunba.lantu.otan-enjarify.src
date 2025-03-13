package androidx.recyclerview.widget;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

class ItemTouchHelper$ItemTouchHelperGestureListener
  extends GestureDetector.SimpleOnGestureListener
{
  public boolean OooO00o = true;
  
  public ItemTouchHelper$ItemTouchHelperGestureListener(ItemTouchHelper paramItemTouchHelper) {}
  
  public void OooO00o()
  {
    this.OooO00o = false;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.OooO00o;
    if (!bool1) {
      return;
    }
    Object localObject1 = this.OooO0O0.OooOOO(paramMotionEvent);
    if (localObject1 != null)
    {
      Object localObject2 = this.OooO0O0.OooOOo;
      localObject1 = ((RecyclerView)localObject2).getChildViewHolder((View)localObject1);
      if (localObject1 != null)
      {
        localObject2 = this.OooO0O0;
        Object localObject3 = ((ItemTouchHelper)localObject2).OooOOO0;
        localObject2 = ((ItemTouchHelper)localObject2).OooOOo;
        boolean bool2 = ((ItemTouchHelper.Callback)localObject3).OooOOO((RecyclerView)localObject2, (RecyclerView.ViewHolder)localObject1);
        if (!bool2) {
          return;
        }
        localObject2 = null;
        int i = paramMotionEvent.getPointerId(0);
        localObject3 = this.OooO0O0;
        int j = ((ItemTouchHelper)localObject3).OooOO0o;
        if (i == j)
        {
          i = paramMotionEvent.findPointerIndex(j);
          float f1 = paramMotionEvent.getX(i);
          float f2 = paramMotionEvent.getY(i);
          localObject2 = this.OooO0O0;
          ((ItemTouchHelper)localObject2).OooO0Oo = f1;
          ((ItemTouchHelper)localObject2).OooO0o0 = f2;
          f2 = 0.0F;
          ((ItemTouchHelper)localObject2).OooO = 0.0F;
          ((ItemTouchHelper)localObject2).OooO0oo = 0.0F;
          paramMotionEvent = ((ItemTouchHelper)localObject2).OooOOO0;
          boolean bool3 = paramMotionEvent.isLongPressDragEnabled();
          if (bool3)
          {
            paramMotionEvent = this.OooO0O0;
            i = 2;
            paramMotionEvent.OooOoO((RecyclerView.ViewHolder)localObject1, i);
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.ItemTouchHelperGestureListener
 * JD-Core Version:    0.7.0.1
 */