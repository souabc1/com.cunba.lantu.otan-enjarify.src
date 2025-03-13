package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

class AccessibilityManagerCompat$Api19Impl
{
  public static boolean OooO00o(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
  {
    AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper localTouchExplorationStateChangeListenerWrapper = new androidx/core/view/accessibility/AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper;
    localTouchExplorationStateChangeListenerWrapper.<init>(paramTouchExplorationStateChangeListener);
    return paramAccessibilityManager.addTouchExplorationStateChangeListener(localTouchExplorationStateChangeListenerWrapper);
  }
  
  public static boolean OooO0O0(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
  {
    AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper localTouchExplorationStateChangeListenerWrapper = new androidx/core/view/accessibility/AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper;
    localTouchExplorationStateChangeListenerWrapper.<init>(paramTouchExplorationStateChangeListener);
    return paramAccessibilityManager.removeTouchExplorationStateChangeListener(localTouchExplorationStateChangeListenerWrapper);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityManagerCompat.Api19Impl
 * JD-Core Version:    0.7.0.1
 */