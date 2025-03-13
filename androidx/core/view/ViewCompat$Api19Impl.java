package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

class ViewCompat$Api19Impl
{
  public static int OooO00o(View paramView)
  {
    return paramView.getAccessibilityLiveRegion();
  }
  
  public static boolean OooO0O0(View paramView)
  {
    return paramView.isAttachedToWindow();
  }
  
  public static boolean OooO0OO(View paramView)
  {
    return paramView.isLaidOut();
  }
  
  public static boolean OooO0Oo(View paramView)
  {
    return paramView.isLayoutDirectionResolved();
  }
  
  public static void OooO0o(View paramView, int paramInt)
  {
    paramView.setAccessibilityLiveRegion(paramInt);
  }
  
  public static void OooO0o0(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    paramViewParent.notifySubtreeAccessibilityStateChanged(paramView1, paramView2, paramInt);
  }
  
  public static void OooO0oO(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    paramAccessibilityEvent.setContentChangeTypes(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api19Impl
 * JD-Core Version:    0.7.0.1
 */