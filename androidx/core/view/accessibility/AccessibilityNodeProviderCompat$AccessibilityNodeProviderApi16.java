package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

class AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16
  extends AccessibilityNodeProvider
{
  public final AccessibilityNodeProviderCompat OooO00o;
  
  public AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
  {
    this.OooO00o = paramAccessibilityNodeProviderCompat;
  }
  
  public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    AccessibilityNodeProviderCompat localAccessibilityNodeProviderCompat = this.OooO00o;
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = localAccessibilityNodeProviderCompat.OooO0O0(paramInt);
    if (localAccessibilityNodeInfoCompat == null) {
      return null;
    }
    return localAccessibilityNodeInfoCompat.OooOOoo();
  }
  
  public List findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    AccessibilityNodeProviderCompat localAccessibilityNodeProviderCompat = this.OooO00o;
    paramString = localAccessibilityNodeProviderCompat.OooO0OO(paramString, paramInt);
    if (paramString == null) {
      return null;
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramString.size();
    int j = 0;
    while (j < i)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = ((AccessibilityNodeInfoCompat)paramString.get(j)).OooOOoo();
      localArrayList.add(localAccessibilityNodeInfo);
      j += 1;
    }
    return localArrayList;
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.OooO00o.OooO0o0(paramInt1, paramInt2, paramBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi16
 * JD-Core Version:    0.7.0.1
 */