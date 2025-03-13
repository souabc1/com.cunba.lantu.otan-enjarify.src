package androidx.drawerlayout.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import java.util.List;

class DrawerLayout$AccessibilityDelegate
  extends AccessibilityDelegateCompat
{
  public final Rect OooO00o;
  
  public final void OooO0OO(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat, ViewGroup paramViewGroup)
  {
    int i = paramViewGroup.getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = paramViewGroup.getChildAt(j);
      boolean bool = DrawerLayout.OooOoO0(localView);
      if (bool) {
        paramAccessibilityNodeInfoCompat.OooO0OO(localView);
      }
      j += 1;
    }
  }
  
  public final void OooO0Oo(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat1, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat2)
  {
    Object localObject = this.OooO00o;
    paramAccessibilityNodeInfoCompat2.OooO0oo((Rect)localObject);
    paramAccessibilityNodeInfoCompat1.setBoundsInScreen((Rect)localObject);
    boolean bool = paramAccessibilityNodeInfoCompat2.isVisibleToUser();
    paramAccessibilityNodeInfoCompat1.setVisibleToUser(bool);
    localObject = paramAccessibilityNodeInfoCompat2.getPackageName();
    paramAccessibilityNodeInfoCompat1.setPackageName((CharSequence)localObject);
    localObject = paramAccessibilityNodeInfoCompat2.getClassName();
    paramAccessibilityNodeInfoCompat1.setClassName((CharSequence)localObject);
    localObject = paramAccessibilityNodeInfoCompat2.getContentDescription();
    paramAccessibilityNodeInfoCompat1.setContentDescription((CharSequence)localObject);
    bool = paramAccessibilityNodeInfoCompat2.isEnabled();
    paramAccessibilityNodeInfoCompat1.setEnabled(bool);
    bool = paramAccessibilityNodeInfoCompat2.isFocused();
    paramAccessibilityNodeInfoCompat1.setFocused(bool);
    bool = paramAccessibilityNodeInfoCompat2.isAccessibilityFocused();
    paramAccessibilityNodeInfoCompat1.setAccessibilityFocused(bool);
    bool = paramAccessibilityNodeInfoCompat2.isSelected();
    paramAccessibilityNodeInfoCompat1.setSelected(bool);
    int i = paramAccessibilityNodeInfoCompat2.getActions();
    paramAccessibilityNodeInfoCompat1.OooO00o(i);
  }
  
  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    int i = paramAccessibilityEvent.getEventType();
    int j = 32;
    if (i == j)
    {
      paramView = paramAccessibilityEvent.getText();
      paramAccessibilityEvent = this.OooO0O0.OooOOOo();
      if (paramAccessibilityEvent != null)
      {
        int k = this.OooO0O0.OooOOo(paramAccessibilityEvent);
        DrawerLayout localDrawerLayout = this.OooO0O0;
        paramAccessibilityEvent = localDrawerLayout.getDrawerTitle(k);
        if (paramAccessibilityEvent != null) {
          paramView.add(paramAccessibilityEvent);
        }
      }
      return true;
    }
    return super.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    boolean bool1 = DrawerLayout.o00o0o;
    if (bool1)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
    }
    else
    {
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.OooOOO0(paramAccessibilityNodeInfoCompat);
      super.onInitializeAccessibilityNodeInfo(paramView, localAccessibilityNodeInfoCompat);
      paramAccessibilityNodeInfoCompat.setSource(paramView);
      Object localObject = ViewCompat.Oooo00O(paramView);
      boolean bool2 = localObject instanceof View;
      if (bool2)
      {
        localObject = (View)localObject;
        paramAccessibilityNodeInfoCompat.setParent((View)localObject);
      }
      OooO0Oo(paramAccessibilityNodeInfoCompat, localAccessibilityNodeInfoCompat);
      localAccessibilityNodeInfoCompat.OooOOOO();
      paramView = (ViewGroup)paramView;
      OooO0OO(paramAccessibilityNodeInfoCompat, paramView);
    }
    paramAccessibilityNodeInfoCompat.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    paramAccessibilityNodeInfoCompat.setFocusable(false);
    paramAccessibilityNodeInfoCompat.setFocused(false);
    paramView = AccessibilityNodeInfoCompat.AccessibilityActionCompat.OooO0o0;
    paramAccessibilityNodeInfoCompat.OooOOOo(paramView);
    paramView = AccessibilityNodeInfoCompat.AccessibilityActionCompat.OooO0o;
    paramAccessibilityNodeInfoCompat.OooOOOo(paramView);
  }
  
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = DrawerLayout.o00o0o;
    if (!bool)
    {
      bool = DrawerLayout.OooOoO0(paramView);
      if (!bool) {
        return false;
      }
    }
    return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.AccessibilityDelegate
 * JD-Core Version:    0.7.0.1
 */