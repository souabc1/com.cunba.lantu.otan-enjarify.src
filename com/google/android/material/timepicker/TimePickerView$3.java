package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Checkable;

class TimePickerView$3
  implements View.OnTouchListener
{
  public TimePickerView$3(TimePickerView paramTimePickerView, GestureDetector paramGestureDetector) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    paramView = (Checkable)paramView;
    boolean bool = paramView.isChecked();
    if (bool) {
      return this.val$gestureDetector.onTouchEvent(paramMotionEvent);
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.TimePickerView.3
 * JD-Core Version:    0.7.0.1
 */