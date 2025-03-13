package com.google.android.material.textfield;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;

class IndicatorViewController$2
  extends View.AccessibilityDelegate
{
  public IndicatorViewController$2(IndicatorViewController paramIndicatorViewController) {}
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfo);
    paramView = IndicatorViewController.access$300(this.this$0).getEditText();
    if (paramView != null) {
      paramAccessibilityNodeInfo.setLabeledBy(paramView);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.IndicatorViewController.2
 * JD-Core Version:    0.7.0.1
 */