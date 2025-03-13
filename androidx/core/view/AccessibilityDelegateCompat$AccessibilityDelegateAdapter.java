package androidx.core.view;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.List;

final class AccessibilityDelegateCompat$AccessibilityDelegateAdapter
  extends View.AccessibilityDelegate
{
  public final AccessibilityDelegateCompat OooO00o;
  
  public AccessibilityDelegateCompat$AccessibilityDelegateAdapter(AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    this.OooO00o = paramAccessibilityDelegateCompat;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.OooO00o.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
  {
    AccessibilityDelegateCompat localAccessibilityDelegateCompat = this.OooO00o;
    paramView = localAccessibilityDelegateCompat.getAccessibilityNodeProvider(paramView);
    if (paramView != null) {
      paramView = (AccessibilityNodeProvider)paramView.getProvider();
    } else {
      paramView = null;
    }
    return paramView;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.OooO00o.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.OooOo00(paramAccessibilityNodeInfo);
    boolean bool = ViewCompat.OoooOoO(paramView);
    localAccessibilityNodeInfoCompat.setScreenReaderFocusable(bool);
    bool = ViewCompat.OoooOO0(paramView);
    localAccessibilityNodeInfoCompat.setHeading(bool);
    Object localObject = ViewCompat.OooOOOO(paramView);
    localAccessibilityNodeInfoCompat.setPaneTitle((CharSequence)localObject);
    localObject = ViewCompat.Oooo0(paramView);
    localAccessibilityNodeInfoCompat.setStateDescription((CharSequence)localObject);
    localObject = this.OooO00o;
    ((AccessibilityDelegateCompat)localObject).onInitializeAccessibilityNodeInfo(paramView, localAccessibilityNodeInfoCompat);
    paramAccessibilityNodeInfo = paramAccessibilityNodeInfo.getText();
    localAccessibilityNodeInfoCompat.OooO0o0(paramAccessibilityNodeInfo, paramView);
    paramView = AccessibilityDelegateCompat.getActionList(paramView);
    int j = 0;
    paramAccessibilityNodeInfo = null;
    for (;;)
    {
      int i = paramView.size();
      if (j >= i) {
        break;
      }
      localObject = (AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(j);
      localAccessibilityNodeInfoCompat.OooO0O0((AccessibilityNodeInfoCompat.AccessibilityActionCompat)localObject);
      j += 1;
    }
  }
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.OooO00o.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.OooO00o.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return this.OooO00o.performAccessibilityAction(paramView, paramInt, paramBundle);
  }
  
  public void sendAccessibilityEvent(View paramView, int paramInt)
  {
    this.OooO00o.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.OooO00o.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter
 * JD-Core Version:    0.7.0.1
 */