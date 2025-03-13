package com.cunba.lantu.otan.filepicker.adapter;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import m54207b69;

public final class RecyclerViewListener$ItemTouchHelperGestureListener
  extends GestureDetector.SimpleOnGestureListener
{
  public RecyclerViewListener$ItemTouchHelperGestureListener(RecyclerViewListener paramRecyclerViewListener) {}
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    m54207b69.F54207b69_00(220, arrayOfObject);
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(221, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.filepicker.adapter.RecyclerViewListener.ItemTouchHelperGestureListener
 * JD-Core Version:    0.7.0.1
 */