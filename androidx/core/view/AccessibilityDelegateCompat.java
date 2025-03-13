package androidx.core.view;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.R.id;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class AccessibilityDelegateCompat
{
  private static final View.AccessibilityDelegate DEFAULT_DELEGATE;
  private final View.AccessibilityDelegate mBridge;
  private final View.AccessibilityDelegate mOriginalDelegate;
  
  static
  {
    View.AccessibilityDelegate localAccessibilityDelegate = new android/view/View$AccessibilityDelegate;
    localAccessibilityDelegate.<init>();
    DEFAULT_DELEGATE = localAccessibilityDelegate;
  }
  
  public AccessibilityDelegateCompat()
  {
    this(localAccessibilityDelegate);
  }
  
  public AccessibilityDelegateCompat(View.AccessibilityDelegate paramAccessibilityDelegate)
  {
    this.mOriginalDelegate = paramAccessibilityDelegate;
    paramAccessibilityDelegate = new androidx/core/view/AccessibilityDelegateCompat$AccessibilityDelegateAdapter;
    paramAccessibilityDelegate.<init>(this);
    this.mBridge = paramAccessibilityDelegate;
  }
  
  public static List getActionList(View paramView)
  {
    int i = R.id.tag_accessibility_actions;
    paramView = (List)paramView.getTag(i);
    if (paramView == null) {
      paramView = Collections.emptyList();
    }
    return paramView;
  }
  
  public final boolean OooO00o(ClickableSpan paramClickableSpan, View paramView)
  {
    if (paramClickableSpan != null)
    {
      paramView = AccessibilityNodeInfoCompat.OooO(paramView.createAccessibilityNodeInfo().getText());
      int i = 0;
      while (paramView != null)
      {
        int j = paramView.length;
        if (i >= j) {
          break;
        }
        Object localObject = paramView[i];
        boolean bool = paramClickableSpan.equals(localObject);
        if (bool) {
          return true;
        }
        i += 1;
      }
    }
    return false;
  }
  
  public final boolean OooO0O0(int paramInt, View paramView)
  {
    int i = R.id.tag_accessibility_clickable_spans;
    SparseArray localSparseArray = (SparseArray)paramView.getTag(i);
    if (localSparseArray != null)
    {
      Object localObject = (WeakReference)localSparseArray.get(paramInt);
      if (localObject != null)
      {
        localObject = (ClickableSpan)((Reference)localObject).get();
        boolean bool = OooO00o((ClickableSpan)localObject, paramView);
        if (bool)
        {
          ((ClickableSpan)localObject).onClick(paramView);
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View paramView)
  {
    Object localObject = this.mOriginalDelegate;
    paramView = AccessibilityDelegateCompat.Api16Impl.OooO00o((View.AccessibilityDelegate)localObject, paramView);
    if (paramView != null)
    {
      localObject = new androidx/core/view/accessibility/AccessibilityNodeProviderCompat;
      ((AccessibilityNodeProviderCompat)localObject).<init>(paramView);
      return localObject;
    }
    return null;
  }
  
  public View.AccessibilityDelegate getBridge()
  {
    return this.mBridge;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.mOriginalDelegate.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    View.AccessibilityDelegate localAccessibilityDelegate = this.mOriginalDelegate;
    paramAccessibilityNodeInfoCompat = paramAccessibilityNodeInfoCompat.OooOOoo();
    localAccessibilityDelegate.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
  }
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.mOriginalDelegate.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.mOriginalDelegate.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    Object localObject = getActionList(paramView);
    boolean bool = false;
    int i = 0;
    for (;;)
    {
      int j = ((List)localObject).size();
      if (i >= j) {
        break;
      }
      AccessibilityNodeInfoCompat.AccessibilityActionCompat localAccessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat)((List)localObject).get(i);
      int k = localAccessibilityActionCompat.getId();
      if (k == paramInt)
      {
        bool = localAccessibilityActionCompat.OooO0O0(paramView, paramBundle);
        break;
      }
      i += 1;
    }
    if (!bool)
    {
      localObject = this.mOriginalDelegate;
      bool = AccessibilityDelegateCompat.Api16Impl.OooO0O0((View.AccessibilityDelegate)localObject, paramView, paramInt, paramBundle);
    }
    if (!bool)
    {
      int m = R.id.accessibility_action_clickable_span;
      if ((paramInt == m) && (paramBundle != null))
      {
        String str = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
        m = -1;
        paramInt = paramBundle.getInt(str, m);
        bool = OooO0O0(paramInt, paramView);
      }
    }
    return bool;
  }
  
  public void sendAccessibilityEvent(View paramView, int paramInt)
  {
    this.mOriginalDelegate.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.mOriginalDelegate.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.AccessibilityDelegateCompat
 * JD-Core Version:    0.7.0.1
 */