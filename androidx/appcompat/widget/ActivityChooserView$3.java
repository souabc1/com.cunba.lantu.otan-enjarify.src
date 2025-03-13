package androidx.appcompat.widget;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

class ActivityChooserView$3
  extends View.AccessibilityDelegate
{
  public ActivityChooserView$3(ActivityChooserView paramActivityChooserView) {}
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfo);
    AccessibilityNodeInfoCompat.OooOo00(paramAccessibilityNodeInfo).setCanOpenPopup(true);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.3
 * JD-Core Version:    0.7.0.1
 */