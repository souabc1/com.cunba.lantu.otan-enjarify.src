package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;

public class AccessibilityNodeInfoCompat$RangeInfoCompat
{
  public final Object OooO00o;
  
  public AccessibilityNodeInfoCompat$RangeInfoCompat(Object paramObject)
  {
    this.OooO00o = paramObject;
  }
  
  public static RangeInfoCompat OooO00o(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    RangeInfoCompat localRangeInfoCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat$RangeInfoCompat;
    AccessibilityNodeInfo.RangeInfo localRangeInfo = AccessibilityNodeInfo.RangeInfo.obtain(paramInt, paramFloat1, paramFloat2, paramFloat3);
    localRangeInfoCompat.<init>(localRangeInfo);
    return localRangeInfoCompat;
  }
  
  public float getCurrent()
  {
    return ((AccessibilityNodeInfo.RangeInfo)this.OooO00o).getCurrent();
  }
  
  public float getMax()
  {
    return ((AccessibilityNodeInfo.RangeInfo)this.OooO00o).getMax();
  }
  
  public float getMin()
  {
    return ((AccessibilityNodeInfo.RangeInfo)this.OooO00o).getMin();
  }
  
  public int getType()
  {
    return ((AccessibilityNodeInfo.RangeInfo)this.OooO00o).getType();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat
 * JD-Core Version:    0.7.0.1
 */