package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;

class AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper
  implements AccessibilityManager.AccessibilityStateChangeListener
{
  public AccessibilityManagerCompat.AccessibilityStateChangeListener o00OoOoo;
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    boolean bool = paramObject instanceof AccessibilityStateChangeListenerWrapper;
    if (!bool) {
      return false;
    }
    paramObject = (AccessibilityStateChangeListenerWrapper)paramObject;
    AccessibilityManagerCompat.AccessibilityStateChangeListener localAccessibilityStateChangeListener = this.o00OoOoo;
    paramObject = paramObject.o00OoOoo;
    return localAccessibilityStateChangeListener.equals(paramObject);
  }
  
  public int hashCode()
  {
    return this.o00OoOoo.hashCode();
  }
  
  public void onAccessibilityStateChanged(boolean paramBoolean)
  {
    this.o00OoOoo.onAccessibilityStateChanged(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper
 * JD-Core Version:    0.7.0.1
 */