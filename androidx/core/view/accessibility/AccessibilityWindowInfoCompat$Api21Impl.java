package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

class AccessibilityWindowInfoCompat$Api21Impl
{
  public static boolean OooO(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.isAccessibilityFocused();
  }
  
  public static void OooO00o(AccessibilityWindowInfo paramAccessibilityWindowInfo, Rect paramRect)
  {
    paramAccessibilityWindowInfo.getBoundsInScreen(paramRect);
  }
  
  public static AccessibilityWindowInfo OooO0O0(AccessibilityWindowInfo paramAccessibilityWindowInfo, int paramInt)
  {
    return paramAccessibilityWindowInfo.getChild(paramInt);
  }
  
  public static int OooO0OO(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getChildCount();
  }
  
  public static int OooO0Oo(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getId();
  }
  
  public static AccessibilityWindowInfo OooO0o(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getParent();
  }
  
  public static int OooO0o0(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getLayer();
  }
  
  public static AccessibilityNodeInfo OooO0oO(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getRoot();
  }
  
  public static int OooO0oo(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getType();
  }
  
  public static boolean OooOO0(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.isActive();
  }
  
  public static boolean OooOO0O(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.isFocused();
  }
  
  public static AccessibilityWindowInfo OooOO0o()
  {
    return AccessibilityWindowInfo.obtain();
  }
  
  public static void OooOOO(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    paramAccessibilityWindowInfo.recycle();
  }
  
  public static AccessibilityWindowInfo OooOOO0(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return AccessibilityWindowInfo.obtain(paramAccessibilityWindowInfo);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */