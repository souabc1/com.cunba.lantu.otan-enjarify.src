package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public class AccessibilityNodeInfoCompat$CollectionItemInfoCompat
{
  public final Object OooO00o;
  
  public AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object paramObject)
  {
    this.OooO00o = paramObject;
  }
  
  public static CollectionItemInfoCompat OooO00o(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    CollectionItemInfoCompat localCollectionItemInfoCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
    AccessibilityNodeInfo.CollectionItemInfo localCollectionItemInfo = AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramBoolean2);
    localCollectionItemInfoCompat.<init>(localCollectionItemInfo);
    return localCollectionItemInfoCompat;
  }
  
  public int getColumnIndex()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)this.OooO00o).getColumnIndex();
  }
  
  public int getColumnSpan()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)this.OooO00o).getColumnSpan();
  }
  
  public int getRowIndex()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)this.OooO00o).getRowIndex();
  }
  
  public int getRowSpan()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)this.OooO00o).getRowSpan();
  }
  
  public boolean isHeading()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)this.OooO00o).isHeading();
  }
  
  public boolean isSelected()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)this.OooO00o).isSelected();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat
 * JD-Core Version:    0.7.0.1
 */