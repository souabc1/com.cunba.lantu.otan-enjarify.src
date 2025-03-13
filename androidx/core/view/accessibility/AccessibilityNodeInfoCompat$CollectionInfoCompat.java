package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;

public class AccessibilityNodeInfoCompat$CollectionInfoCompat
{
  public final Object OooO00o;
  
  public AccessibilityNodeInfoCompat$CollectionInfoCompat(Object paramObject)
  {
    this.OooO00o = paramObject;
  }
  
  public static CollectionInfoCompat OooO00o(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    CollectionInfoCompat localCollectionInfoCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;
    AccessibilityNodeInfo.CollectionInfo localCollectionInfo = AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean);
    localCollectionInfoCompat.<init>(localCollectionInfo);
    return localCollectionInfoCompat;
  }
  
  public static CollectionInfoCompat OooO0O0(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    CollectionInfoCompat localCollectionInfoCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;
    AccessibilityNodeInfo.CollectionInfo localCollectionInfo = AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean, paramInt3);
    localCollectionInfoCompat.<init>(localCollectionInfo);
    return localCollectionInfoCompat;
  }
  
  public int getColumnCount()
  {
    return ((AccessibilityNodeInfo.CollectionInfo)this.OooO00o).getColumnCount();
  }
  
  public int getRowCount()
  {
    return ((AccessibilityNodeInfo.CollectionInfo)this.OooO00o).getRowCount();
  }
  
  public int getSelectionMode()
  {
    return ((AccessibilityNodeInfo.CollectionInfo)this.OooO00o).getSelectionMode();
  }
  
  public boolean isHierarchical()
  {
    return ((AccessibilityNodeInfo.CollectionInfo)this.OooO00o).isHierarchical();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat
 * JD-Core Version:    0.7.0.1
 */