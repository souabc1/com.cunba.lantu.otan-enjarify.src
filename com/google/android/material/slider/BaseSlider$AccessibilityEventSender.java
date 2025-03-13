package com.google.android.material.slider;

import androidx.customview.widget.ExploreByTouchHelper;

class BaseSlider$AccessibilityEventSender
  implements Runnable
{
  int virtualViewId = -1;
  
  private BaseSlider$AccessibilityEventSender(BaseSlider paramBaseSlider) {}
  
  public void run()
  {
    BaseSlider.AccessibilityHelper localAccessibilityHelper = BaseSlider.access$200(this.this$0);
    int i = this.virtualViewId;
    localAccessibilityHelper.sendEventForVirtualView(i, 4);
  }
  
  public void setVirtualViewId(int paramInt)
  {
    this.virtualViewId = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.slider.BaseSlider.AccessibilityEventSender
 * JD-Core Version:    0.7.0.1
 */