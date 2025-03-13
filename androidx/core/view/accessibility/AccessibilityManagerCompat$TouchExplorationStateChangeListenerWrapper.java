package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

final class AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper
  implements AccessibilityManager.TouchExplorationStateChangeListener
{
  public final AccessibilityManagerCompat.TouchExplorationStateChangeListener OooO00o;
  
  public AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper(AccessibilityManagerCompat.TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
  {
    this.OooO00o = paramTouchExplorationStateChangeListener;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    boolean bool = paramObject instanceof TouchExplorationStateChangeListenerWrapper;
    if (!bool) {
      return false;
    }
    paramObject = (TouchExplorationStateChangeListenerWrapper)paramObject;
    AccessibilityManagerCompat.TouchExplorationStateChangeListener localTouchExplorationStateChangeListener = this.OooO00o;
    paramObject = paramObject.OooO00o;
    return localTouchExplorationStateChangeListener.equals(paramObject);
  }
  
  public int hashCode()
  {
    return this.OooO00o.hashCode();
  }
  
  public void onTouchExplorationStateChanged(boolean paramBoolean)
  {
    this.OooO00o.onTouchExplorationStateChanged(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper
 * JD-Core Version:    0.7.0.1
 */