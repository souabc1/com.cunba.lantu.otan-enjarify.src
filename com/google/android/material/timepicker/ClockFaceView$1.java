package com.google.android.material.timepicker;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

class ClockFaceView$1
  implements ViewTreeObserver.OnPreDrawListener
{
  public ClockFaceView$1(ClockFaceView paramClockFaceView) {}
  
  public boolean onPreDraw()
  {
    ClockFaceView localClockFaceView = this.this$0;
    boolean bool1 = localClockFaceView.isShown();
    boolean bool2 = true;
    if (!bool1) {
      return bool2;
    }
    this.this$0.getViewTreeObserver().removeOnPreDrawListener(this);
    int i = this.this$0.getHeight() / 2;
    int j = ClockFaceView.access$000(this.this$0).getSelectorRadius();
    i -= j;
    j = ClockFaceView.access$100(this.this$0);
    i -= j;
    this.this$0.setRadius(i);
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.ClockFaceView.1
 * JD-Core Version:    0.7.0.1
 */