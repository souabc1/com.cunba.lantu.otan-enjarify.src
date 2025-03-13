package androidx.customview.widget;

import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;

class ExploreByTouchHelper$MyNodeProvider
  extends AccessibilityNodeProviderCompat
{
  public ExploreByTouchHelper$MyNodeProvider(ExploreByTouchHelper paramExploreByTouchHelper) {}
  
  public AccessibilityNodeInfoCompat OooO0O0(int paramInt)
  {
    return AccessibilityNodeInfoCompat.OooOOO0(this.OooO0O0.obtainAccessibilityNodeInfo(paramInt));
  }
  
  public AccessibilityNodeInfoCompat OooO0Oo(int paramInt)
  {
    int i = 2;
    ExploreByTouchHelper localExploreByTouchHelper;
    if (paramInt == i)
    {
      localExploreByTouchHelper = this.OooO0O0;
      paramInt = localExploreByTouchHelper.mAccessibilityFocusedVirtualViewId;
    }
    else
    {
      localExploreByTouchHelper = this.OooO0O0;
      paramInt = localExploreByTouchHelper.mKeyboardFocusedVirtualViewId;
    }
    i = -1 << -1;
    if (paramInt == i) {
      return null;
    }
    return OooO0O0(paramInt);
  }
  
  public boolean OooO0o0(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.OooO0O0.performAction(paramInt1, paramInt2, paramBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.customview.widget.ExploreByTouchHelper.MyNodeProvider
 * JD-Core Version:    0.7.0.1
 */