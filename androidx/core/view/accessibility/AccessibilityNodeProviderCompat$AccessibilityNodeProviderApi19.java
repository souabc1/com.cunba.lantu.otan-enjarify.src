package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19
  extends AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi16
{
  public AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
  {
    super(paramAccessibilityNodeProviderCompat);
  }
  
  public AccessibilityNodeInfo findFocus(int paramInt)
  {
    AccessibilityNodeProviderCompat localAccessibilityNodeProviderCompat = this.OooO00o;
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = localAccessibilityNodeProviderCompat.OooO0Oo(paramInt);
    if (localAccessibilityNodeInfoCompat == null) {
      return null;
    }
    return localAccessibilityNodeInfoCompat.OooOOoo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi19
 * JD-Core Version:    0.7.0.1
 */