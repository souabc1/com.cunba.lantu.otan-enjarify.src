package androidx.customview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import java.util.ArrayList;
import java.util.List;

public abstract class ExploreByTouchHelper
  extends AccessibilityDelegateCompat
{
  private static final String DEFAULT_CLASS_NAME = "android.view.View";
  public static final int HOST_ID = 255;
  public static final int INVALID_ID = -2147483648;
  private static final Rect INVALID_PARENT_BOUNDS;
  private static final FocusStrategy.BoundsAdapter NODE_ADAPTER;
  private static final FocusStrategy.CollectionAdapter SPARSE_VALUES_ADAPTER;
  int mAccessibilityFocusedVirtualViewId;
  private final View mHost;
  private int mHoveredVirtualViewId;
  int mKeyboardFocusedVirtualViewId;
  private final AccessibilityManager mManager;
  private ExploreByTouchHelper.MyNodeProvider mNodeProvider;
  private final int[] mTempGlobalRect;
  private final Rect mTempParentRect;
  private final Rect mTempScreenRect;
  private final Rect mTempVisibleRect;
  
  static
  {
    Object localObject = new android/graphics/Rect;
    int i = -1 >>> 1;
    int j = -1 << -1;
    ((Rect)localObject).<init>(i, i, j, j);
    INVALID_PARENT_BOUNDS = (Rect)localObject;
    localObject = new androidx/customview/widget/ExploreByTouchHelper$1;
    ((ExploreByTouchHelper.1)localObject).<init>();
    NODE_ADAPTER = (FocusStrategy.BoundsAdapter)localObject;
    localObject = new androidx/customview/widget/ExploreByTouchHelper$2;
    ((ExploreByTouchHelper.2)localObject).<init>();
    SPARSE_VALUES_ADAPTER = (FocusStrategy.CollectionAdapter)localObject;
  }
  
  public ExploreByTouchHelper(View paramView)
  {
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mTempScreenRect = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mTempParentRect = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mTempVisibleRect = ((Rect)localObject);
    localObject = new int[2];
    this.mTempGlobalRect = ((int[])localObject);
    int i = -1 << -1;
    this.mAccessibilityFocusedVirtualViewId = i;
    this.mKeyboardFocusedVirtualViewId = i;
    this.mHoveredVirtualViewId = i;
    if (paramView != null)
    {
      this.mHost = paramView;
      localObject = paramView.getContext();
      String str = "accessibility";
      localObject = (AccessibilityManager)((Context)localObject).getSystemService(str);
      this.mManager = ((AccessibilityManager)localObject);
      i = 1;
      paramView.setFocusable(i);
      int j = ViewCompat.OooOoO0(paramView);
      if (j == 0) {
        ViewCompat.o000000(paramView, i);
      }
      return;
    }
    paramView = new java/lang/IllegalArgumentException;
    paramView.<init>("View may not be null");
    throw paramView;
  }
  
  public static Rect OooOO0O(View paramView, int paramInt, Rect paramRect)
  {
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    int k = 17;
    if (paramInt != k)
    {
      k = 33;
      if (paramInt != k)
      {
        k = 66;
        int m = -1;
        if (paramInt != k)
        {
          j = 130;
          if (paramInt == j)
          {
            paramRect.set(0, m, i, m);
          }
          else
          {
            paramView = new java/lang/IllegalArgumentException;
            paramView.<init>("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            throw paramView;
          }
        }
        else
        {
          paramRect.set(m, 0, m, j);
        }
      }
      else
      {
        paramRect.set(0, j, i, j);
      }
    }
    else
    {
      paramRect.set(i, 0, i, j);
    }
    return paramRect;
  }
  
  public static int OooOOO0(int paramInt)
  {
    int i = 19;
    if (paramInt != i)
    {
      i = 21;
      if (paramInt != i)
      {
        i = 22;
        if (paramInt != i) {
          return 130;
        }
        return 66;
      }
      return 17;
    }
    return 33;
  }
  
  private SparseArrayCompat getAllNodes()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    getVisibleVirtualViews(localArrayList);
    SparseArrayCompat localSparseArrayCompat = new androidx/collection/SparseArrayCompat;
    localSparseArrayCompat.<init>();
    int i = 0;
    for (;;)
    {
      int j = localArrayList.size();
      if (i >= j) {
        break;
      }
      j = ((Integer)localArrayList.get(i)).intValue();
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = OooO0oo(j);
      Integer localInteger = (Integer)localArrayList.get(i);
      int k = localInteger.intValue();
      localSparseArrayCompat.OooOO0o(k, localAccessibilityNodeInfoCompat);
      i += 1;
    }
    return localSparseArrayCompat;
  }
  
  public final AccessibilityNodeInfoCompat OooO()
  {
    Object localObject = AccessibilityNodeInfoCompat.OooOO0o(this.mHost);
    ViewCompat.OooooOo(this.mHost, (AccessibilityNodeInfoCompat)localObject);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    getVisibleVirtualViews(localArrayList);
    int i = ((AccessibilityNodeInfoCompat)localObject).getChildCount();
    if (i > 0)
    {
      i = localArrayList.size();
      if (i > 0)
      {
        localObject = new java/lang/RuntimeException;
        ((RuntimeException)localObject).<init>("Views cannot have both real and virtual children");
        throw ((Throwable)localObject);
      }
    }
    i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      View localView = this.mHost;
      Integer localInteger = (Integer)localArrayList.get(j);
      int k = localInteger.intValue();
      ((AccessibilityNodeInfoCompat)localObject).OooO0Oo(localView, k);
      j += 1;
    }
    return localObject;
  }
  
  public final boolean OooO0OO(int paramInt)
  {
    int i = this.mAccessibilityFocusedVirtualViewId;
    if (i == paramInt)
    {
      this.mAccessibilityFocusedVirtualViewId = (-1 << -1);
      this.mHost.invalidate();
      sendEventForVirtualView(paramInt, 65536);
      return true;
    }
    return false;
  }
  
  public final boolean OooO0Oo()
  {
    int i = this.mKeyboardFocusedVirtualViewId;
    int j = -1 << -1;
    if (i != j)
    {
      j = 16;
      bool = onPerformActionForVirtualView(i, j, null);
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final AccessibilityEvent OooO0o(int paramInt1, int paramInt2)
  {
    AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(paramInt2);
    Object localObject1 = obtainAccessibilityNodeInfo(paramInt1);
    Object localObject2 = localAccessibilityEvent.getText();
    CharSequence localCharSequence = ((AccessibilityNodeInfoCompat)localObject1).getText();
    ((List)localObject2).add(localCharSequence);
    localObject2 = ((AccessibilityNodeInfoCompat)localObject1).getContentDescription();
    localAccessibilityEvent.setContentDescription((CharSequence)localObject2);
    boolean bool = ((AccessibilityNodeInfoCompat)localObject1).isScrollable();
    localAccessibilityEvent.setScrollable(bool);
    bool = ((AccessibilityNodeInfoCompat)localObject1).isPassword();
    localAccessibilityEvent.setPassword(bool);
    bool = ((AccessibilityNodeInfoCompat)localObject1).isEnabled();
    localAccessibilityEvent.setEnabled(bool);
    bool = ((AccessibilityNodeInfoCompat)localObject1).isChecked();
    localAccessibilityEvent.setChecked(bool);
    onPopulateEventForVirtualView(paramInt1, localAccessibilityEvent);
    localObject2 = localAccessibilityEvent.getText();
    bool = ((List)localObject2).isEmpty();
    if (bool)
    {
      localObject2 = localAccessibilityEvent.getContentDescription();
      if (localObject2 == null)
      {
        localObject3 = new java/lang/RuntimeException;
        ((RuntimeException)localObject3).<init>("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        throw ((Throwable)localObject3);
      }
    }
    localObject1 = ((AccessibilityNodeInfoCompat)localObject1).getClassName();
    localAccessibilityEvent.setClassName((CharSequence)localObject1);
    localObject1 = this.mHost;
    AccessibilityRecordCompat.OooO0o0(localAccessibilityEvent, (View)localObject1, paramInt1);
    Object localObject3 = this.mHost.getContext().getPackageName();
    localAccessibilityEvent.setPackageName((CharSequence)localObject3);
    return localAccessibilityEvent;
  }
  
  public final AccessibilityEvent OooO0o0(int paramInt1, int paramInt2)
  {
    int i = -1;
    if (paramInt1 != i) {
      return OooO0o(paramInt1, paramInt2);
    }
    return OooO0oO(paramInt2);
  }
  
  public final AccessibilityEvent OooO0oO(int paramInt)
  {
    AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(paramInt);
    this.mHost.onInitializeAccessibilityEvent(localAccessibilityEvent);
    return localAccessibilityEvent;
  }
  
  public final AccessibilityNodeInfoCompat OooO0oo(int paramInt)
  {
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.OooOO0O();
    int i = 1;
    localAccessibilityNodeInfoCompat.setEnabled(i);
    localAccessibilityNodeInfoCompat.setFocusable(i);
    localAccessibilityNodeInfoCompat.setClassName("android.view.View");
    Object localObject1 = INVALID_PARENT_BOUNDS;
    localAccessibilityNodeInfoCompat.setBoundsInParent((Rect)localObject1);
    localAccessibilityNodeInfoCompat.setBoundsInScreen((Rect)localObject1);
    Object localObject2 = this.mHost;
    localAccessibilityNodeInfoCompat.setParent((View)localObject2);
    onPopulateNodeForVirtualView(paramInt, localAccessibilityNodeInfoCompat);
    localObject2 = localAccessibilityNodeInfoCompat.getText();
    if (localObject2 == null)
    {
      localObject2 = localAccessibilityNodeInfoCompat.getContentDescription();
      if (localObject2 == null)
      {
        localObject3 = new java/lang/RuntimeException;
        ((RuntimeException)localObject3).<init>("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        throw ((Throwable)localObject3);
      }
    }
    localObject2 = this.mTempParentRect;
    localAccessibilityNodeInfoCompat.OooO0oO((Rect)localObject2);
    localObject2 = this.mTempParentRect;
    boolean bool1 = ((Rect)localObject2).equals(localObject1);
    if (!bool1)
    {
      int j = localAccessibilityNodeInfoCompat.getActions();
      int m = j & 0x40;
      if (m == 0)
      {
        m = 128;
        j &= m;
        if (j == 0)
        {
          localObject2 = this.mHost.getContext().getPackageName();
          localAccessibilityNodeInfoCompat.setPackageName((CharSequence)localObject2);
          localObject2 = this.mHost;
          localAccessibilityNodeInfoCompat.OooOOo((View)localObject2, paramInt);
          j = this.mAccessibilityFocusedVirtualViewId;
          if (j == paramInt)
          {
            localAccessibilityNodeInfoCompat.setAccessibilityFocused(i);
            localAccessibilityNodeInfoCompat.OooO00o(m);
          }
          else
          {
            localAccessibilityNodeInfoCompat.setAccessibilityFocused(false);
            j = 64;
            localAccessibilityNodeInfoCompat.OooO00o(j);
          }
          j = this.mKeyboardFocusedVirtualViewId;
          if (j == paramInt)
          {
            paramInt = i;
          }
          else
          {
            paramInt = 0;
            localObject3 = null;
          }
          if (paramInt != 0)
          {
            j = 2;
            localAccessibilityNodeInfoCompat.OooO00o(j);
          }
          else
          {
            boolean bool2 = localAccessibilityNodeInfoCompat.isFocusable();
            if (bool2) {
              localAccessibilityNodeInfoCompat.OooO00o(i);
            }
          }
          localAccessibilityNodeInfoCompat.setFocused(paramInt);
          localObject3 = this.mHost;
          localObject2 = this.mTempGlobalRect;
          ((View)localObject3).getLocationOnScreen((int[])localObject2);
          localObject3 = this.mTempScreenRect;
          localAccessibilityNodeInfoCompat.OooO0oo((Rect)localObject3);
          localObject3 = this.mTempScreenRect;
          paramInt = ((Rect)localObject3).equals(localObject1);
          int n;
          int k;
          Object localObject4;
          if (paramInt != 0)
          {
            localObject3 = this.mTempScreenRect;
            localAccessibilityNodeInfoCompat.OooO0oO((Rect)localObject3);
            paramInt = localAccessibilityNodeInfoCompat.OooO0O0;
            n = -1;
            if (paramInt != n)
            {
              localObject3 = AccessibilityNodeInfoCompat.OooOO0O();
              for (k = localAccessibilityNodeInfoCompat.OooO0O0; k != n; k = ((AccessibilityNodeInfoCompat)localObject3).OooO0O0)
              {
                localObject4 = this.mHost;
                ((AccessibilityNodeInfoCompat)localObject3).OooOOo0((View)localObject4, n);
                localObject4 = INVALID_PARENT_BOUNDS;
                ((AccessibilityNodeInfoCompat)localObject3).setBoundsInParent((Rect)localObject4);
                onPopulateNodeForVirtualView(k, (AccessibilityNodeInfoCompat)localObject3);
                localObject2 = this.mTempParentRect;
                ((AccessibilityNodeInfoCompat)localObject3).OooO0oO((Rect)localObject2);
                localObject2 = this.mTempScreenRect;
                localObject4 = this.mTempParentRect;
                int i1 = ((Rect)localObject4).left;
                m = ((Rect)localObject4).top;
                ((Rect)localObject2).offset(i1, m);
              }
              ((AccessibilityNodeInfoCompat)localObject3).OooOOOO();
            }
            localObject3 = this.mTempScreenRect;
            localObject1 = this.mTempGlobalRect;
            n = localObject1[0];
            k = this.mHost.getScrollX();
            n -= k;
            localObject2 = this.mTempGlobalRect;
            k = localObject2[i];
            localObject4 = this.mHost;
            m = ((View)localObject4).getScrollY();
            k -= m;
            ((Rect)localObject3).offset(n, k);
          }
          localObject3 = this.mHost;
          localObject1 = this.mTempVisibleRect;
          paramInt = ((View)localObject3).getLocalVisibleRect((Rect)localObject1);
          if (paramInt != 0)
          {
            localObject3 = this.mTempVisibleRect;
            n = this.mTempGlobalRect[0];
            k = this.mHost.getScrollX();
            n -= k;
            localObject2 = this.mTempGlobalRect;
            k = localObject2[i];
            localObject4 = this.mHost;
            m = ((View)localObject4).getScrollY();
            k -= m;
            ((Rect)localObject3).offset(n, k);
            localObject3 = this.mTempScreenRect;
            localObject1 = this.mTempVisibleRect;
            paramInt = ((Rect)localObject3).intersect((Rect)localObject1);
            if (paramInt != 0)
            {
              localObject3 = this.mTempScreenRect;
              localAccessibilityNodeInfoCompat.setBoundsInScreen((Rect)localObject3);
              localObject3 = this.mTempScreenRect;
              paramInt = OooOO0o((Rect)localObject3);
              if (paramInt != 0) {
                localAccessibilityNodeInfoCompat.setVisibleToUser(i);
              }
            }
          }
          return localAccessibilityNodeInfoCompat;
        }
        localObject3 = new java/lang/RuntimeException;
        ((RuntimeException)localObject3).<init>("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        throw ((Throwable)localObject3);
      }
      localObject3 = new java/lang/RuntimeException;
      ((RuntimeException)localObject3).<init>("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new java/lang/RuntimeException;
    ((RuntimeException)localObject3).<init>("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    throw ((Throwable)localObject3);
  }
  
  public final void OooOO0(int paramInt, Rect paramRect)
  {
    obtainAccessibilityNodeInfo(paramInt).OooO0oO(paramRect);
  }
  
  public final boolean OooOO0o(Rect paramRect)
  {
    boolean bool1 = false;
    if (paramRect != null)
    {
      boolean bool2 = paramRect.isEmpty();
      if (!bool2)
      {
        paramRect = this.mHost;
        int i = paramRect.getWindowVisibility();
        if (i != 0) {
          return false;
        }
        paramRect = this.mHost;
        int j;
        do
        {
          paramRect = paramRect.getParent();
          boolean bool3 = paramRect instanceof View;
          if (!bool3) {
            break label90;
          }
          paramRect = (View)paramRect;
          float f = paramRect.getAlpha();
          bool3 = f < 0.0F;
          if (!bool3) {
            break;
          }
          j = paramRect.getVisibility();
        } while (j == 0);
        return false;
        label90:
        if (paramRect != null) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final boolean OooOOO(int paramInt, Rect paramRect)
  {
    SparseArrayCompat localSparseArrayCompat = getAllNodes();
    int i = this.mKeyboardFocusedVirtualViewId;
    int j = -1 << -1;
    if (i == j)
    {
      i = 0;
      localObject1 = null;
    }
    else
    {
      localObject1 = (AccessibilityNodeInfoCompat)localSparseArrayCompat.get(i);
    }
    Object localObject2 = localObject1;
    i = 1;
    int m;
    if (paramInt != i)
    {
      int k = 2;
      if (paramInt != k)
      {
        i = 17;
        if (paramInt != i)
        {
          i = 33;
          if (paramInt != i)
          {
            i = 66;
            if (paramInt != i)
            {
              i = 130;
              if (paramInt != i)
              {
                localObject3 = new java/lang/IllegalArgumentException;
                ((IllegalArgumentException)localObject3).<init>("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                throw ((Throwable)localObject3);
              }
            }
          }
        }
        Rect localRect = new android/graphics/Rect;
        localRect.<init>();
        i = this.mKeyboardFocusedVirtualViewId;
        if (i != j)
        {
          OooOO0(i, localRect);
        }
        else if (paramRect != null)
        {
          localRect.set(paramRect);
        }
        else
        {
          paramRect = this.mHost;
          OooOO0O(paramRect, paramInt, localRect);
        }
        localCollectionAdapter = SPARSE_VALUES_ADAPTER;
        localBoundsAdapter = NODE_ADAPTER;
        localObject1 = localSparseArrayCompat;
        m = paramInt;
        localObject3 = FocusStrategy.OooO0OO(localSparseArrayCompat, localCollectionAdapter, localBoundsAdapter, localObject2, localRect, paramInt);
        break label281;
      }
    }
    paramRect = this.mHost;
    int n = ViewCompat.OooOoOO(paramRect);
    if (n == i)
    {
      m = i;
    }
    else
    {
      n = 0;
      paramRect = null;
      m = 0;
    }
    FocusStrategy.CollectionAdapter localCollectionAdapter = SPARSE_VALUES_ADAPTER;
    FocusStrategy.BoundsAdapter localBoundsAdapter = NODE_ADAPTER;
    Object localObject1 = localSparseArrayCompat;
    Object localObject3 = FocusStrategy.OooO0Oo(localSparseArrayCompat, localCollectionAdapter, localBoundsAdapter, localObject2, paramInt, m, false);
    label281:
    localObject3 = (AccessibilityNodeInfoCompat)localObject3;
    if (localObject3 != null)
    {
      paramInt = localSparseArrayCompat.OooOO0(localObject3);
      j = localSparseArrayCompat.OooOO0O(paramInt);
    }
    return requestKeyboardFocusForVirtualView(j);
  }
  
  public final boolean OooOOOO(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    int i = 1;
    if (paramInt2 != i)
    {
      i = 2;
      if (paramInt2 != i)
      {
        i = 64;
        if (paramInt2 != i)
        {
          i = 128;
          if (paramInt2 != i) {
            return onPerformActionForVirtualView(paramInt1, paramInt2, paramBundle);
          }
          return OooO0OO(paramInt1);
        }
        return OooOOo0(paramInt1);
      }
      return clearKeyboardFocusForVirtualView(paramInt1);
    }
    return requestKeyboardFocusForVirtualView(paramInt1);
  }
  
  public final boolean OooOOOo(int paramInt, Bundle paramBundle)
  {
    return ViewCompat.Oooooo(this.mHost, paramInt, paramBundle);
  }
  
  public final void OooOOo(int paramInt)
  {
    int i = this.mHoveredVirtualViewId;
    if (i == paramInt) {
      return;
    }
    this.mHoveredVirtualViewId = paramInt;
    sendEventForVirtualView(paramInt, 128);
    sendEventForVirtualView(i, 256);
  }
  
  public final boolean OooOOo0(int paramInt)
  {
    AccessibilityManager localAccessibilityManager = this.mManager;
    boolean bool = localAccessibilityManager.isEnabled();
    int j = 0;
    if (bool)
    {
      localAccessibilityManager = this.mManager;
      bool = localAccessibilityManager.isTouchExplorationEnabled();
      if (bool)
      {
        int i = this.mAccessibilityFocusedVirtualViewId;
        if (i != paramInt)
        {
          j = -1 << -1;
          if (i != j) {
            OooO0OO(i);
          }
          this.mAccessibilityFocusedVirtualViewId = paramInt;
          this.mHost.invalidate();
          sendEventForVirtualView(paramInt, 32768);
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean clearKeyboardFocusForVirtualView(int paramInt)
  {
    int i = this.mKeyboardFocusedVirtualViewId;
    if (i != paramInt) {
      return false;
    }
    this.mKeyboardFocusedVirtualViewId = (-1 << -1);
    onVirtualViewKeyboardFocusChanged(paramInt, false);
    sendEventForVirtualView(paramInt, 8);
    return true;
  }
  
  public final boolean dispatchHoverEvent(MotionEvent paramMotionEvent)
  {
    AccessibilityManager localAccessibilityManager = this.mManager;
    boolean bool1 = localAccessibilityManager.isEnabled();
    boolean bool2 = false;
    if (bool1)
    {
      localAccessibilityManager = this.mManager;
      bool1 = localAccessibilityManager.isTouchExplorationEnabled();
      if (bool1)
      {
        int i = paramMotionEvent.getAction();
        int j = 7;
        boolean bool3 = true;
        int k = -1 << -1;
        if (i != j)
        {
          j = 9;
          if (i != j)
          {
            m = 10;
            f1 = 1.401299E-044F;
            if (i != m) {
              return false;
            }
            m = this.mHoveredVirtualViewId;
            if (m != k)
            {
              OooOOo(k);
              return bool3;
            }
            return false;
          }
        }
        float f2 = paramMotionEvent.getX();
        float f1 = paramMotionEvent.getY();
        int m = getVirtualViewAt(f2, f1);
        OooOOo(m);
        if (m != k) {
          bool2 = bool3;
        }
      }
    }
    return bool2;
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getAction();
    int j = 0;
    int k = 1;
    float f = 1.4E-45F;
    boolean bool2;
    if (i != k)
    {
      i = paramKeyEvent.getKeyCode();
      int m = 61;
      int i1;
      boolean bool1;
      if (i != m)
      {
        m = 66;
        if (i != m)
        {
          switch (i)
          {
          default: 
            break;
          case 19: 
          case 20: 
          case 21: 
          case 22: 
            int n = paramKeyEvent.hasNoModifiers();
            if (n == 0) {
              break;
            }
            i = OooOOO0(i);
            i1 = paramKeyEvent.getRepeatCount() + k;
            for (n = 0; j < i1; n = k)
            {
              boolean bool4 = OooOOO(i, null);
              if (!bool4) {
                break;
              }
              j += 1;
            }
            j = n;
            break;
          }
        }
        else
        {
          bool1 = paramKeyEvent.hasNoModifiers();
          if (bool1)
          {
            i1 = paramKeyEvent.getRepeatCount();
            if (i1 == 0)
            {
              OooO0Oo();
              j = k;
            }
          }
        }
      }
      else
      {
        bool1 = paramKeyEvent.hasNoModifiers();
        if (bool1)
        {
          i1 = 2;
          bool2 = OooOOO(i1, null);
        }
        else
        {
          boolean bool3 = paramKeyEvent.hasModifiers(k);
          if (bool3) {
            bool2 = OooOOO(k, null);
          }
        }
      }
    }
    return bool2;
  }
  
  public final int getAccessibilityFocusedVirtualViewId()
  {
    return this.mAccessibilityFocusedVirtualViewId;
  }
  
  public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View paramView)
  {
    paramView = this.mNodeProvider;
    if (paramView == null)
    {
      paramView = new androidx/customview/widget/ExploreByTouchHelper$MyNodeProvider;
      paramView.<init>(this);
      this.mNodeProvider = paramView;
    }
    return this.mNodeProvider;
  }
  
  public int getFocusedVirtualView()
  {
    return getAccessibilityFocusedVirtualViewId();
  }
  
  public final int getKeyboardFocusedVirtualViewId()
  {
    return this.mKeyboardFocusedVirtualViewId;
  }
  
  public abstract int getVirtualViewAt(float paramFloat1, float paramFloat2);
  
  public abstract void getVisibleVirtualViews(List paramList);
  
  public final void invalidateRoot()
  {
    invalidateVirtualView(-1, 1);
  }
  
  public final void invalidateVirtualView(int paramInt)
  {
    invalidateVirtualView(paramInt, 0);
  }
  
  public final void invalidateVirtualView(int paramInt1, int paramInt2)
  {
    int i = -1 << -1;
    if (paramInt1 != i)
    {
      Object localObject = this.mManager;
      boolean bool = ((AccessibilityManager)localObject).isEnabled();
      if (bool)
      {
        localObject = this.mHost.getParent();
        if (localObject != null)
        {
          int j = 2048;
          AccessibilityEvent localAccessibilityEvent = OooO0o0(paramInt1, j);
          AccessibilityEventCompat.OooO0O0(localAccessibilityEvent, paramInt2);
          View localView = this.mHost;
          ((ViewParent)localObject).requestSendAccessibilityEvent(localView, localAccessibilityEvent);
        }
      }
    }
  }
  
  public AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int paramInt)
  {
    int i = -1;
    if (paramInt == i) {
      return OooO();
    }
    return OooO0oo(paramInt);
  }
  
  public final void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    int i = this.mKeyboardFocusedVirtualViewId;
    int j = -1 << -1;
    if (i != j) {
      clearKeyboardFocusForVirtualView(i);
    }
    if (paramBoolean) {
      OooOOO(paramInt, paramRect);
    }
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    onPopulateEventForHost(paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
    onPopulateNodeForHost(paramAccessibilityNodeInfoCompat);
  }
  
  public abstract boolean onPerformActionForVirtualView(int paramInt1, int paramInt2, Bundle paramBundle);
  
  public void onPopulateEventForHost(AccessibilityEvent paramAccessibilityEvent) {}
  
  public void onPopulateEventForVirtualView(int paramInt, AccessibilityEvent paramAccessibilityEvent) {}
  
  public void onPopulateNodeForHost(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat) {}
  
  public abstract void onPopulateNodeForVirtualView(int paramInt, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat);
  
  public void onVirtualViewKeyboardFocusChanged(int paramInt, boolean paramBoolean) {}
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    int i = -1;
    if (paramInt1 != i) {
      return OooOOOO(paramInt1, paramInt2, paramBundle);
    }
    return OooOOOo(paramInt2, paramBundle);
  }
  
  public final boolean requestKeyboardFocusForVirtualView(int paramInt)
  {
    View localView = this.mHost;
    boolean bool = localView.isFocused();
    if (!bool)
    {
      localView = this.mHost;
      bool = localView.requestFocus();
      if (!bool) {
        return false;
      }
    }
    int i = this.mKeyboardFocusedVirtualViewId;
    if (i == paramInt) {
      return false;
    }
    int j = -1 << -1;
    if (i != j) {
      clearKeyboardFocusForVirtualView(i);
    }
    if (paramInt == j) {
      return false;
    }
    this.mKeyboardFocusedVirtualViewId = paramInt;
    i = 1;
    onVirtualViewKeyboardFocusChanged(paramInt, i);
    sendEventForVirtualView(paramInt, 8);
    return i;
  }
  
  public final boolean sendEventForVirtualView(int paramInt1, int paramInt2)
  {
    int i = -1 << -1;
    if (paramInt1 != i)
    {
      Object localObject = this.mManager;
      boolean bool = ((AccessibilityManager)localObject).isEnabled();
      if (bool)
      {
        localObject = this.mHost.getParent();
        if (localObject == null) {
          return false;
        }
        AccessibilityEvent localAccessibilityEvent = OooO0o0(paramInt1, paramInt2);
        View localView = this.mHost;
        return ((ViewParent)localObject).requestSendAccessibilityEvent(localView, localAccessibilityEvent);
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.customview.widget.ExploreByTouchHelper
 * JD-Core Version:    0.7.0.1
 */