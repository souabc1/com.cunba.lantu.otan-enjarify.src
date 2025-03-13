package androidx.core.view.accessibility;

import android.graphics.Region;
import android.view.accessibility.AccessibilityWindowInfo;

class AccessibilityWindowInfoCompat$Api33Impl
{
  public static int OooO00o(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getDisplayId();
  }
  
  public static void OooO0O0(AccessibilityWindowInfo paramAccessibilityWindowInfo, Region paramRegion)
  {
    paramAccessibilityWindowInfo.getRegionInScreen(paramRegion);
  }
  
  public static boolean OooO0OO(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.isInPictureInPictureMode();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl
 * JD-Core Version:    0.7.0.1
 */