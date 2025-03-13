package androidx.core.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.widget.ScrollView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;

class NestedScrollView$AccessibilityDelegate
  extends AccessibilityDelegateCompat
{
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramView = (NestedScrollView)paramView;
    String str = ScrollView.class.getName();
    paramAccessibilityEvent.setClassName(str);
    int i = paramView.getScrollRange();
    if (i > 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      str = null;
    }
    paramAccessibilityEvent.setScrollable(i);
    int j = paramView.getScrollX();
    paramAccessibilityEvent.setScrollX(j);
    j = paramView.getScrollY();
    paramAccessibilityEvent.setScrollY(j);
    j = paramView.getScrollX();
    AccessibilityRecordCompat.OooO0OO(paramAccessibilityEvent, j);
    int k = paramView.getScrollRange();
    AccessibilityRecordCompat.OooO0Oo(paramAccessibilityEvent, k);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
    paramView = (NestedScrollView)paramView;
    String str = ScrollView.class.getName();
    paramAccessibilityNodeInfoCompat.setClassName(str);
    boolean bool = paramView.isEnabled();
    if (bool)
    {
      int i = paramView.getScrollRange();
      if (i > 0)
      {
        paramAccessibilityNodeInfoCompat.setScrollable(true);
        int j = paramView.getScrollY();
        if (j > 0)
        {
          AccessibilityNodeInfoCompat.AccessibilityActionCompat localAccessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.OooOOo;
          paramAccessibilityNodeInfoCompat.OooO0O0(localAccessibilityActionCompat);
          localAccessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.OooOoo;
          paramAccessibilityNodeInfoCompat.OooO0O0(localAccessibilityActionCompat);
        }
        int k = paramView.getScrollY();
        if (k < i)
        {
          paramView = AccessibilityNodeInfoCompat.AccessibilityActionCompat.OooOOo0;
          paramAccessibilityNodeInfoCompat.OooO0O0(paramView);
          paramView = AccessibilityNodeInfoCompat.AccessibilityActionCompat.OooOooo;
          paramAccessibilityNodeInfoCompat.OooO0O0(paramView);
        }
      }
    }
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool1 = super.performAccessibilityAction(paramView, paramInt, paramBundle);
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    paramView = (NestedScrollView)paramView;
    bool1 = paramView.isEnabled();
    if (!bool1) {
      return false;
    }
    int i = paramView.getHeight();
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    Matrix localMatrix = paramView.getMatrix();
    boolean bool3 = localMatrix.isIdentity();
    if (bool3)
    {
      bool3 = paramView.getGlobalVisibleRect(localRect);
      if (bool3) {
        i = localRect.height();
      }
    }
    int j = 4096;
    if (paramInt != j)
    {
      j = 8192;
      if (paramInt != j)
      {
        j = 16908344;
        if (paramInt != j)
        {
          j = 16908346;
          if (paramInt == j) {
            break label195;
          }
          return false;
        }
      }
      paramInt = paramView.getPaddingBottom();
      i -= paramInt;
      paramInt = paramView.getPaddingTop();
      i -= paramInt;
      paramInt = Math.max(paramView.getScrollY() - i, 0);
      i = paramView.getScrollY();
      if (paramInt != i)
      {
        paramView.Oooo0oO(0, paramInt, bool2);
        return bool2;
      }
      return false;
    }
    label195:
    paramInt = paramView.getPaddingBottom();
    i -= paramInt;
    paramInt = paramView.getPaddingTop();
    i -= paramInt;
    paramInt = paramView.getScrollY() + i;
    i = paramView.getScrollRange();
    paramInt = Math.min(paramInt, i);
    i = paramView.getScrollY();
    if (paramInt != i)
    {
      paramView.Oooo0oO(0, paramInt, bool2);
      return bool2;
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.NestedScrollView.AccessibilityDelegate
 * JD-Core Version:    0.7.0.1
 */