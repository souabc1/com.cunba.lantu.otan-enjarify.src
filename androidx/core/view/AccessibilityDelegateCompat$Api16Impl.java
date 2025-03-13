package androidx.core.view;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;

class AccessibilityDelegateCompat$Api16Impl
{
  public static AccessibilityNodeProvider OooO00o(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView)
  {
    return paramAccessibilityDelegate.getAccessibilityNodeProvider(paramView);
  }
  
  public static boolean OooO0O0(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView, int paramInt, Bundle paramBundle)
  {
    return paramAccessibilityDelegate.performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.AccessibilityDelegateCompat.Api16Impl
 * JD-Core Version:    0.7.0.1
 */