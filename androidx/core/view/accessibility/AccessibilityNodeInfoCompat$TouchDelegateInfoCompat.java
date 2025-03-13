package androidx.core.view.accessibility;

import android.graphics.Region;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo;

public final class AccessibilityNodeInfoCompat$TouchDelegateInfoCompat
{
  public final AccessibilityNodeInfo.TouchDelegateInfo OooO00o;
  
  public AccessibilityNodeInfoCompat$TouchDelegateInfoCompat(AccessibilityNodeInfo.TouchDelegateInfo paramTouchDelegateInfo)
  {
    this.OooO00o = paramTouchDelegateInfo;
  }
  
  public Region getRegionAt(int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      return o00Ooo.OooO00o(this.OooO00o, paramInt);
    }
    return null;
  }
  
  public int getRegionCount()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      return oo000o.OooO00o(this.OooO00o);
    }
    return 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat
 * JD-Core Version:    0.7.0.1
 */