package androidx.drawerlayout.widget;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

final class DrawerLayout$ChildAccessibilityDelegate
  extends AccessibilityDelegateCompat
{
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
    boolean bool = DrawerLayout.OooOoO0(paramView);
    if (!bool)
    {
      bool = false;
      paramView = null;
      paramAccessibilityNodeInfoCompat.setParent(null);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.ChildAccessibilityDelegate
 * JD-Core Version:    0.7.0.1
 */