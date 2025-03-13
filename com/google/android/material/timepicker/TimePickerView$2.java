package com.google.android.material.timepicker;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

class TimePickerView$2
  extends GestureDetector.SimpleOnGestureListener
{
  public TimePickerView$2(TimePickerView paramTimePickerView) {}
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    paramMotionEvent = TimePickerView.access$100(this.this$0);
    if (paramMotionEvent != null)
    {
      paramMotionEvent.onDoubleTap();
      return true;
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.TimePickerView.2
 * JD-Core Version:    0.7.0.1
 */