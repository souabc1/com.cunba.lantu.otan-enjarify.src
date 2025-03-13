package com.ernestoyaquello.dragdropswiperecyclerview;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class DragDropSwipeAdapter$setItemDragAndDropWithLongPress$longPressGestureListener$1
  extends GestureDetector.SimpleOnGestureListener
{
  public DragDropSwipeAdapter$setItemDragAndDropWithLongPress$longPressGestureListener$1(DragDropSwipeAdapter.ViewHolder paramViewHolder, DragDropSwipeAdapter paramDragDropSwipeAdapter) {}
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    String str = m54207b69.F54207b69_11("h95C505E5A51");
    Intrinsics.OooO0o(paramMotionEvent, str);
    paramMotionEvent = this.OooO00o;
    boolean bool = paramMotionEvent.isBeingSwiped$drag_drop_swipe_recyclerview_release();
    if (!bool)
    {
      paramMotionEvent = this.OooO00o;
      bool = paramMotionEvent.isBeingDragged$drag_drop_swipe_recyclerview_release();
      if (!bool) {
        return true;
      }
    }
    bool = false;
    paramMotionEvent = null;
    return bool;
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    Intrinsics.OooO0o(paramMotionEvent, "e");
    paramMotionEvent = DragDropSwipeAdapter.OooOO0O(this.OooO0O0);
    DragDropSwipeAdapter.ViewHolder localViewHolder = this.OooO00o;
    paramMotionEvent.OooOoo0(localViewHolder);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeAdapter.setItemDragAndDropWithLongPress.longPressGestureListener.1
 * JD-Core Version:    0.7.0.1
 */