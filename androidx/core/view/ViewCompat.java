package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import androidx.core.R.id;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ViewCompat
{
  public static final AtomicInteger OooO00o;
  public static WeakHashMap OooO0O0;
  public static Field OooO0OO;
  public static boolean OooO0Oo;
  public static final int[] OooO0o;
  public static ThreadLocal OooO0o0;
  public static final OnReceiveContentViewBehavior OooO0oO;
  public static final ViewCompat.AccessibilityPaneVisibilityManager OooO0oo;
  
  static
  {
    Object localObject = new java/util/concurrent/atomic/AtomicInteger;
    int i = 1;
    ((AtomicInteger)localObject).<init>(i);
    OooO00o = (AtomicInteger)localObject;
    OooO0O0 = null;
    OooO0Oo = false;
    int[] arrayOfInt = new int[32];
    int j = R.id.accessibility_custom_action_0;
    arrayOfInt[0] = j;
    int k = R.id.accessibility_custom_action_1;
    arrayOfInt[i] = k;
    i = R.id.accessibility_custom_action_2;
    arrayOfInt[2] = i;
    i = R.id.accessibility_custom_action_3;
    arrayOfInt[3] = i;
    i = R.id.accessibility_custom_action_4;
    arrayOfInt[4] = i;
    i = R.id.accessibility_custom_action_5;
    arrayOfInt[5] = i;
    i = R.id.accessibility_custom_action_6;
    arrayOfInt[6] = i;
    i = R.id.accessibility_custom_action_7;
    arrayOfInt[7] = i;
    i = R.id.accessibility_custom_action_8;
    arrayOfInt[8] = i;
    i = R.id.accessibility_custom_action_9;
    arrayOfInt[9] = i;
    i = R.id.accessibility_custom_action_10;
    arrayOfInt[10] = i;
    i = R.id.accessibility_custom_action_11;
    arrayOfInt[11] = i;
    i = R.id.accessibility_custom_action_12;
    arrayOfInt[12] = i;
    i = R.id.accessibility_custom_action_13;
    arrayOfInt[13] = i;
    i = R.id.accessibility_custom_action_14;
    arrayOfInt[14] = i;
    i = R.id.accessibility_custom_action_15;
    arrayOfInt[15] = i;
    i = R.id.accessibility_custom_action_16;
    arrayOfInt[16] = i;
    i = R.id.accessibility_custom_action_17;
    arrayOfInt[17] = i;
    i = R.id.accessibility_custom_action_18;
    arrayOfInt[18] = i;
    i = R.id.accessibility_custom_action_19;
    arrayOfInt[19] = i;
    i = R.id.accessibility_custom_action_20;
    arrayOfInt[20] = i;
    i = R.id.accessibility_custom_action_21;
    arrayOfInt[21] = i;
    i = R.id.accessibility_custom_action_22;
    arrayOfInt[22] = i;
    i = R.id.accessibility_custom_action_23;
    arrayOfInt[23] = i;
    i = R.id.accessibility_custom_action_24;
    arrayOfInt[24] = i;
    i = R.id.accessibility_custom_action_25;
    arrayOfInt[25] = i;
    i = R.id.accessibility_custom_action_26;
    arrayOfInt[26] = i;
    i = R.id.accessibility_custom_action_27;
    arrayOfInt[27] = i;
    i = R.id.accessibility_custom_action_28;
    arrayOfInt[28] = i;
    i = R.id.accessibility_custom_action_29;
    arrayOfInt[29] = i;
    i = R.id.accessibility_custom_action_30;
    arrayOfInt[30] = i;
    i = R.id.accessibility_custom_action_31;
    arrayOfInt[31] = i;
    OooO0o = arrayOfInt;
    localObject = new androidx/core/view/o00O0O;
    ((o00O0O)localObject).<init>();
    OooO0oO = (OnReceiveContentViewBehavior)localObject;
    localObject = new androidx/core/view/ViewCompat$AccessibilityPaneVisibilityManager;
    ((ViewCompat.AccessibilityPaneVisibilityManager)localObject).<init>();
    OooO0oo = (ViewCompat.AccessibilityPaneVisibilityManager)localObject;
  }
  
  public static void OooO(View paramView)
  {
    AccessibilityDelegateCompat localAccessibilityDelegateCompat = OooOO0O(paramView);
    if (localAccessibilityDelegateCompat == null)
    {
      localAccessibilityDelegateCompat = new androidx/core/view/AccessibilityDelegateCompat;
      localAccessibilityDelegateCompat.<init>();
    }
    o00oO0o(paramView, localAccessibilityDelegateCompat);
  }
  
  public static ViewCompat.AccessibilityViewProperty OooO0O0()
  {
    ViewCompat.4 local4 = new androidx/core/view/ViewCompat$4;
    int i = R.id.tag_accessibility_heading;
    local4.<init>(i, Boolean.class, 28);
    return local4;
  }
  
  public static int OooO0OO(View paramView, CharSequence paramCharSequence, AccessibilityViewCommand paramAccessibilityViewCommand)
  {
    int i = OooOOo0(paramView, paramCharSequence);
    int j = -1;
    if (i != j)
    {
      AccessibilityNodeInfoCompat.AccessibilityActionCompat localAccessibilityActionCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityActionCompat;
      localAccessibilityActionCompat.<init>(i, paramCharSequence, paramAccessibilityViewCommand);
      OooO0Oo(paramView, localAccessibilityActionCompat);
    }
    return i;
  }
  
  public static void OooO0Oo(View paramView, AccessibilityNodeInfoCompat.AccessibilityActionCompat paramAccessibilityActionCompat)
  {
    OooO(paramView);
    o00Oo0(paramAccessibilityActionCompat.getId(), paramView);
    OooOOOo(paramView).add(paramAccessibilityActionCompat);
    Ooooo00(paramView, 0);
  }
  
  public static WindowInsetsCompat OooO0o(View paramView, WindowInsetsCompat paramWindowInsetsCompat, Rect paramRect)
  {
    return ViewCompat.Api21Impl.OooO0O0(paramView, paramWindowInsetsCompat, paramRect);
  }
  
  public static ViewPropertyAnimatorCompat OooO0o0(View paramView)
  {
    Object localObject = OooO0O0;
    if (localObject == null)
    {
      localObject = new java/util/WeakHashMap;
      ((WeakHashMap)localObject).<init>();
      OooO0O0 = (WeakHashMap)localObject;
    }
    localObject = (ViewPropertyAnimatorCompat)OooO0O0.get(paramView);
    if (localObject == null)
    {
      localObject = new androidx/core/view/ViewPropertyAnimatorCompat;
      ((ViewPropertyAnimatorCompat)localObject).<init>(paramView);
      WeakHashMap localWeakHashMap = OooO0O0;
      localWeakHashMap.put(paramView, localObject);
    }
    return localObject;
  }
  
  public static WindowInsetsCompat OooO0oO(View paramView, WindowInsetsCompat paramWindowInsetsCompat)
  {
    WindowInsets localWindowInsets1 = paramWindowInsetsCompat.OooO();
    if (localWindowInsets1 != null)
    {
      WindowInsets localWindowInsets2 = ViewCompat.Api20Impl.OooO00o(paramView, localWindowInsets1);
      boolean bool = localWindowInsets2.equals(localWindowInsets1);
      if (!bool) {
        return WindowInsetsCompat.OooOO0O(localWindowInsets2, paramView);
      }
    }
    return paramWindowInsetsCompat;
  }
  
  public static boolean OooO0oo(View paramView, KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public static int OooOO0()
  {
    return ViewCompat.Api17Impl.OooO00o();
  }
  
  public static AccessibilityDelegateCompat OooOO0O(View paramView)
  {
    paramView = OooOO0o(paramView);
    if (paramView == null) {
      return null;
    }
    boolean bool = paramView instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter;
    if (bool) {
      return ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter)paramView).OooO00o;
    }
    AccessibilityDelegateCompat localAccessibilityDelegateCompat = new androidx/core/view/AccessibilityDelegateCompat;
    localAccessibilityDelegateCompat.<init>(paramView);
    return localAccessibilityDelegateCompat;
  }
  
  public static View.AccessibilityDelegate OooOO0o(View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      return ViewCompat.Api29Impl.OooO00o(paramView);
    }
    return OooOOO0(paramView);
  }
  
  public static int OooOOO(View paramView)
  {
    return ViewCompat.Api19Impl.OooO00o(paramView);
  }
  
  public static View.AccessibilityDelegate OooOOO0(View paramView)
  {
    boolean bool1 = OooO0Oo;
    if (bool1) {
      return null;
    }
    Object localObject = OooO0OO;
    boolean bool2 = true;
    if (localObject == null)
    {
      localObject = View.class;
      String str = "mAccessibilityDelegate";
      try
      {
        localObject = ((Class)localObject).getDeclaredField(str);
        OooO0OO = (Field)localObject;
        ((AccessibleObject)localObject).setAccessible(bool2);
      }
      finally
      {
        OooO0Oo = bool2;
        return null;
      }
    }
    try
    {
      localObject = OooO0OO;
      paramView = ((Field)localObject).get(paramView);
      bool1 = paramView instanceof View.AccessibilityDelegate;
      if (bool1) {
        return (View.AccessibilityDelegate)paramView;
      }
      return null;
    }
    finally
    {
      OooO0Oo = bool2;
    }
    return null;
  }
  
  public static CharSequence OooOOOO(View paramView)
  {
    return (CharSequence)Oooooo0().OooO0o(paramView);
  }
  
  public static List OooOOOo(View paramView)
  {
    int i = R.id.tag_accessibility_actions;
    ArrayList localArrayList = (ArrayList)paramView.getTag(i);
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int j = R.id.tag_accessibility_actions;
      paramView.setTag(j, localArrayList);
    }
    return localArrayList;
  }
  
  public static ColorStateList OooOOo(View paramView)
  {
    return ViewCompat.Api21Impl.OooO0oO(paramView);
  }
  
  public static int OooOOo0(View paramView, CharSequence paramCharSequence)
  {
    paramView = OooOOOo(paramView);
    int i = 0;
    for (;;)
    {
      int j = paramView.size();
      if (i >= j) {
        break;
      }
      CharSequence localCharSequence = ((AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(i)).getLabel();
      k = TextUtils.equals(paramCharSequence, localCharSequence);
      if (k != 0) {
        return ((AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(i)).getId();
      }
      i += 1;
    }
    int m = -1;
    int k = m;
    i = 0;
    for (;;)
    {
      int[] arrayOfInt = OooO0o;
      int n = arrayOfInt.length;
      if ((i >= n) || (k != m)) {
        break;
      }
      int i1 = arrayOfInt[i];
      n = 1;
      int i2 = 0;
      int i3 = n;
      for (;;)
      {
        int i4 = paramView.size();
        if (i2 >= i4) {
          break;
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat localAccessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(i2);
        i4 = localAccessibilityActionCompat.getId();
        if (i4 != i1)
        {
          i4 = n;
        }
        else
        {
          i4 = 0;
          localAccessibilityActionCompat = null;
        }
        i3 &= i4;
        i2 += 1;
      }
      if (i3 != 0) {
        k = i1;
      }
      i += 1;
    }
    return k;
  }
  
  public static PorterDuff.Mode OooOOoo(View paramView)
  {
    return ViewCompat.Api21Impl.OooO0oo(paramView);
  }
  
  public static boolean OooOo(View paramView)
  {
    return ViewCompat.Api16Impl.OooO0O0(paramView);
  }
  
  public static Display OooOo0(View paramView)
  {
    return ViewCompat.Api17Impl.OooO0O0(paramView);
  }
  
  public static Rect OooOo00(View paramView)
  {
    return ViewCompat.Api18Impl.OooO00o(paramView);
  }
  
  public static float OooOo0O(View paramView)
  {
    return ViewCompat.Api21Impl.OooO(paramView);
  }
  
  public static OnReceiveContentViewBehavior OooOo0o(View paramView)
  {
    boolean bool = paramView instanceof OnReceiveContentViewBehavior;
    if (bool) {
      return (OnReceiveContentViewBehavior)paramView;
    }
    return OooO0oO;
  }
  
  public static int OooOoO(View paramView)
  {
    return ViewCompat.Api26Impl.OooO0O0(paramView);
  }
  
  public static int OooOoO0(View paramView)
  {
    return ViewCompat.Api16Impl.OooO0OO(paramView);
  }
  
  public static int OooOoOO(View paramView)
  {
    return ViewCompat.Api17Impl.OooO0Oo(paramView);
  }
  
  public static int OooOoo(View paramView)
  {
    return ViewCompat.Api16Impl.OooO0o0(paramView);
  }
  
  public static int OooOoo0(View paramView)
  {
    return ViewCompat.Api16Impl.OooO0Oo(paramView);
  }
  
  public static String[] OooOooO(View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    if (i >= j) {
      return ViewCompat.Api31Impl.OooO00o(paramView);
    }
    i = R.id.tag_on_receive_content_mime_types;
    return (String[])paramView.getTag(i);
  }
  
  public static int OooOooo(View paramView)
  {
    return ViewCompat.Api17Impl.OooO0o0(paramView);
  }
  
  public static float Oooo(View paramView)
  {
    return ViewCompat.Api21Impl.OooOOO0(paramView);
  }
  
  public static CharSequence Oooo0(View paramView)
  {
    return (CharSequence)o0000oo().OooO0o(paramView);
  }
  
  public static int Oooo000(View paramView)
  {
    return ViewCompat.Api17Impl.OooO0o(paramView);
  }
  
  public static ViewParent Oooo00O(View paramView)
  {
    return ViewCompat.Api16Impl.OooO0o(paramView);
  }
  
  public static WindowInsetsCompat Oooo00o(View paramView)
  {
    return ViewCompat.Api23Impl.OooO00o(paramView);
  }
  
  public static String Oooo0O0(View paramView)
  {
    return ViewCompat.Api21Impl.OooOO0O(paramView);
  }
  
  public static float Oooo0OO(View paramView)
  {
    return paramView.getTranslationX();
  }
  
  public static float Oooo0o(View paramView)
  {
    return ViewCompat.Api21Impl.OooOO0o(paramView);
  }
  
  public static float Oooo0o0(View paramView)
  {
    return paramView.getTranslationY();
  }
  
  public static WindowInsetsControllerCompat Oooo0oO(View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      return ViewCompat.Api30Impl.OooO0O0(paramView);
    }
    for (Object localObject = paramView.getContext();; localObject = ((ContextWrapper)localObject).getBaseContext())
    {
      boolean bool = localObject instanceof ContextWrapper;
      WindowInsetsControllerCompat localWindowInsetsControllerCompat = null;
      if (!bool) {
        break;
      }
      bool = localObject instanceof Activity;
      if (bool)
      {
        localObject = ((Activity)localObject).getWindow();
        if (localObject != null) {
          localWindowInsetsControllerCompat = WindowCompat.OooO00o((Window)localObject, paramView);
        }
        return localWindowInsetsControllerCompat;
      }
    }
    return null;
  }
  
  public static int Oooo0oo(View paramView)
  {
    return ViewCompat.Api16Impl.OooO0oO(paramView);
  }
  
  public static boolean OoooO(View paramView)
  {
    return ViewCompat.Api16Impl.OooO(paramView);
  }
  
  public static boolean OoooO0(View paramView)
  {
    return ViewCompat.Api15Impl.OooO00o(paramView);
  }
  
  public static boolean OoooO00(View paramView)
  {
    paramView = OooOO0o(paramView);
    boolean bool;
    if (paramView != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramView = null;
    }
    return bool;
  }
  
  public static boolean OoooO0O(View paramView)
  {
    return ViewCompat.Api16Impl.OooO0oo(paramView);
  }
  
  public static boolean OoooOO0(View paramView)
  {
    ViewCompat.AccessibilityViewProperty localAccessibilityViewProperty = OooO0O0();
    paramView = (Boolean)localAccessibilityViewProperty.OooO0o(paramView);
    if (paramView != null)
    {
      bool = paramView.booleanValue();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    paramView = null;
    return bool;
  }
  
  public static boolean OoooOOO(View paramView)
  {
    return ViewCompat.Api19Impl.OooO0OO(paramView);
  }
  
  public static boolean OoooOOo(View paramView)
  {
    return ViewCompat.Api21Impl.OooOOOo(paramView);
  }
  
  public static boolean OoooOo0(View paramView)
  {
    return ViewCompat.Api17Impl.OooO0oO(paramView);
  }
  
  public static boolean OoooOoO(View paramView)
  {
    ViewCompat.AccessibilityViewProperty localAccessibilityViewProperty = oo000o();
    paramView = (Boolean)localAccessibilityViewProperty.OooO0o(paramView);
    if (paramView != null)
    {
      bool = paramView.booleanValue();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    paramView = null;
    return bool;
  }
  
  public static void Ooooo00(View paramView, int paramInt)
  {
    Object localObject1 = paramView.getContext();
    Object localObject2 = "accessibility";
    localObject1 = (AccessibilityManager)((Context)localObject1).getSystemService((String)localObject2);
    boolean bool = ((AccessibilityManager)localObject1).isEnabled();
    if (!bool) {
      return;
    }
    localObject2 = OooOOOO(paramView);
    if (localObject2 != null)
    {
      bool = paramView.isShown();
      if (bool)
      {
        i = paramView.getWindowVisibility();
        if (i == 0)
        {
          i = 1;
          break label72;
        }
      }
    }
    int i = 0;
    localObject2 = null;
    label72:
    int j = OooOOO(paramView);
    int k = 32;
    Object localObject3;
    if ((j == 0) && (i == 0))
    {
      if (paramInt == k)
      {
        localObject2 = AccessibilityEvent.obtain();
        paramView.onInitializeAccessibilityEvent((AccessibilityEvent)localObject2);
        ((AccessibilityEvent)localObject2).setEventType(k);
        ViewCompat.Api19Impl.OooO0oO((AccessibilityEvent)localObject2, paramInt);
        ((AccessibilityRecord)localObject2).setSource(paramView);
        paramView.onPopulateAccessibilityEvent((AccessibilityEvent)localObject2);
        localObject3 = ((AccessibilityRecord)localObject2).getText();
        paramView = OooOOOO(paramView);
        ((List)localObject3).add(paramView);
        ((AccessibilityManager)localObject1).sendAccessibilityEvent((AccessibilityEvent)localObject2);
      }
      else
      {
        localObject1 = paramView.getParent();
        if (localObject1 != null)
        {
          localObject1 = paramView.getParent();
          try
          {
            ViewCompat.Api19Impl.OooO0o0((ViewParent)localObject1, paramView, paramView, paramInt);
          }
          catch (AbstractMethodError localAbstractMethodError)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            paramView = paramView.getParent().getClass().getSimpleName();
            ((StringBuilder)localObject3).append(paramView);
            paramView = " does not fully implement ViewParent";
            ((StringBuilder)localObject3).append(paramView);
          }
        }
      }
    }
    else
    {
      localObject1 = AccessibilityEvent.obtain();
      if (i == 0) {
        k = 2048;
      }
      ((AccessibilityEvent)localObject1).setEventType(k);
      ViewCompat.Api19Impl.OooO0oO((AccessibilityEvent)localObject1, paramInt);
      if (i != 0)
      {
        localObject3 = ((AccessibilityRecord)localObject1).getText();
        localObject2 = OooOOOO(paramView);
        ((List)localObject3).add(localObject2);
        setViewImportanceForAccessibilityIfNeeded(paramView);
      }
      paramView.sendAccessibilityEventUnchecked((AccessibilityEvent)localObject1);
    }
  }
  
  public static void Ooooo0o(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
  }
  
  public static void OooooO0(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
  }
  
  public static WindowInsetsCompat OooooOO(View paramView, WindowInsetsCompat paramWindowInsetsCompat)
  {
    WindowInsets localWindowInsets1 = paramWindowInsetsCompat.OooO();
    if (localWindowInsets1 != null)
    {
      WindowInsets localWindowInsets2 = ViewCompat.Api20Impl.OooO0O0(paramView, localWindowInsets1);
      boolean bool = localWindowInsets2.equals(localWindowInsets1);
      if (!bool) {
        return WindowInsetsCompat.OooOO0O(localWindowInsets2, paramView);
      }
    }
    return paramWindowInsetsCompat;
  }
  
  public static void OooooOo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    paramAccessibilityNodeInfoCompat = paramAccessibilityNodeInfoCompat.OooOOoo();
    paramView.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfoCompat);
  }
  
  public static boolean Oooooo(View paramView, int paramInt, Bundle paramBundle)
  {
    return ViewCompat.Api16Impl.OooOO0(paramView, paramInt, paramBundle);
  }
  
  public static ViewCompat.AccessibilityViewProperty Oooooo0()
  {
    ViewCompat.2 local2 = new androidx/core/view/ViewCompat$2;
    int i = R.id.tag_accessibility_pane_title;
    local2.<init>(i, CharSequence.class, 8, 28);
    return local2;
  }
  
  public static ContentInfoCompat OoooooO(View paramView, ContentInfoCompat paramContentInfoCompat)
  {
    Object localObject = "ViewCompat";
    int i = 3;
    boolean bool = Log.isLoggable((String)localObject, i);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("performReceiveContent: ");
      ((StringBuilder)localObject).append(paramContentInfoCompat);
      ((StringBuilder)localObject).append(", view=");
      String str = paramView.getClass().getSimpleName();
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("[");
      i = paramView.getId();
      ((StringBuilder)localObject).append(i);
      str = "]";
      ((StringBuilder)localObject).append(str);
    }
    int j = Build.VERSION.SDK_INT;
    i = 31;
    if (j >= i) {
      return ViewCompat.Api31Impl.OooO0O0(paramView, paramContentInfoCompat);
    }
    j = R.id.tag_on_receive_content_listener;
    localObject = (OnReceiveContentListener)paramView.getTag(j);
    if (localObject != null)
    {
      paramContentInfoCompat = ((OnReceiveContentListener)localObject).OooO00o(paramView, paramContentInfoCompat);
      if (paramContentInfoCompat == null) {
        paramView = null;
      } else {
        paramView = OooOo0o(paramView).onReceiveContent(paramContentInfoCompat);
      }
      return paramView;
    }
    return OooOo0o(paramView).onReceiveContent(paramContentInfoCompat);
  }
  
  public static void Ooooooo(View paramView)
  {
    ViewCompat.Api16Impl.OooOO0O(paramView);
  }
  
  private static Rect getEmptyTempRect()
  {
    Object localObject = OooO0o0;
    if (localObject == null)
    {
      localObject = new java/lang/ThreadLocal;
      ((ThreadLocal)localObject).<init>();
      OooO0o0 = (ThreadLocal)localObject;
    }
    localObject = (Rect)OooO0o0.get();
    if (localObject == null)
    {
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      ThreadLocal localThreadLocal = OooO0o0;
      localThreadLocal.set(localObject);
    }
    ((Rect)localObject).setEmpty();
    return localObject;
  }
  
  public static void o0000(View paramView, WindowInsetsAnimationCompat.Callback paramCallback)
  {
    WindowInsetsAnimationCompat.OooO00o(paramView, paramCallback);
  }
  
  public static void o00000(View paramView, Paint paramPaint)
  {
    ViewCompat.Api17Impl.OooO(paramView, paramPaint);
  }
  
  public static void o000000(View paramView, int paramInt)
  {
    ViewCompat.Api16Impl.OooOOoo(paramView, paramInt);
  }
  
  public static void o000000O(View paramView, int paramInt)
  {
    ViewCompat.Api26Impl.OooOO0o(paramView, paramInt);
  }
  
  public static void o000000o(View paramView, int paramInt)
  {
    ViewCompat.Api17Impl.OooO0oo(paramView, paramInt);
  }
  
  public static void o00000O(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewCompat.Api17Impl.OooOO0O(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void o00000O0(View paramView, OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
  {
    ViewCompat.Api21Impl.OooOo0(paramView, paramOnApplyWindowInsetsListener);
  }
  
  public static void o00000OO(View paramView, PointerIconCompat paramPointerIconCompat)
  {
    if (paramPointerIconCompat != null) {
      paramPointerIconCompat = paramPointerIconCompat.getPointerIcon();
    } else {
      paramPointerIconCompat = null;
    }
    paramPointerIconCompat = (PointerIcon)paramPointerIconCompat;
    ViewCompat.Api24Impl.OooO0Oo(paramView, paramPointerIconCompat);
  }
  
  public static void o00000Oo(View paramView, boolean paramBoolean)
  {
    ViewCompat.AccessibilityViewProperty localAccessibilityViewProperty = oo000o();
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localAccessibilityViewProperty.OooO0oO(paramView, localBoolean);
  }
  
  public static void o00000o0(View paramView, int paramInt1, int paramInt2)
  {
    ViewCompat.Api23Impl.OooO0Oo(paramView, paramInt1, paramInt2);
  }
  
  public static void o00000oO(View paramView, String paramString)
  {
    ViewCompat.Api21Impl.OooOo0O(paramView, paramString);
  }
  
  public static void o00000oo(View paramView, float paramFloat)
  {
    ViewCompat.Api21Impl.OooOo0o(paramView, paramFloat);
  }
  
  public static void o0000O00(View paramView, float paramFloat)
  {
    ViewCompat.Api21Impl.OooOo(paramView, paramFloat);
  }
  
  public static void o0000Ooo(View paramView, CharSequence paramCharSequence)
  {
    o0000oo().OooO0oO(paramView, paramCharSequence);
  }
  
  public static void o0000oO(View paramView)
  {
    ViewCompat.Api21Impl.OooOoO(paramView);
  }
  
  public static ViewCompat.AccessibilityViewProperty o0000oo()
  {
    ViewCompat.3 local3 = new androidx/core/view/ViewCompat$3;
    int i = R.id.tag_state_description;
    local3.<init>(i, CharSequence.class, 64, 30);
    return local3;
  }
  
  public static void o000OOo(View paramView, boolean paramBoolean)
  {
    ViewCompat.Api16Impl.OooOOo(paramView, paramBoolean);
  }
  
  public static boolean o000oOoO(View paramView)
  {
    return ViewCompat.Api19Impl.OooO0O0(paramView);
  }
  
  public static void o00O0O(View paramView, int paramInt)
  {
    o00Oo0(paramInt, paramView);
    Ooooo00(paramView, 0);
  }
  
  public static void o00Oo0(int paramInt, View paramView)
  {
    paramView = OooOOOo(paramView);
    int i = 0;
    for (;;)
    {
      int j = paramView.size();
      if (i >= j) {
        break;
      }
      AccessibilityNodeInfoCompat.AccessibilityActionCompat localAccessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(i);
      j = localAccessibilityActionCompat.getId();
      if (j == paramInt)
      {
        paramView.remove(i);
        break;
      }
      i += 1;
    }
  }
  
  public static void o00Ooo(View paramView, AccessibilityNodeInfoCompat.AccessibilityActionCompat paramAccessibilityActionCompat, CharSequence paramCharSequence, AccessibilityViewCommand paramAccessibilityViewCommand)
  {
    if ((paramAccessibilityViewCommand == null) && (paramCharSequence == null))
    {
      int i = paramAccessibilityActionCompat.getId();
      o00O0O(paramView, i);
    }
    else
    {
      paramAccessibilityActionCompat = paramAccessibilityActionCompat.OooO00o(paramCharSequence, paramAccessibilityViewCommand);
      OooO0Oo(paramView, paramAccessibilityActionCompat);
    }
  }
  
  public static void o00o0O(View paramView)
  {
    ViewCompat.Api20Impl.OooO0OO(paramView);
  }
  
  public static void o00oO0O(View paramView, boolean paramBoolean)
  {
    ViewCompat.AccessibilityViewProperty localAccessibilityViewProperty = OooO0O0();
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localAccessibilityViewProperty.OooO0oO(paramView, localBoolean);
  }
  
  public static void o00oO0o(View paramView, AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    if (paramAccessibilityDelegateCompat == null)
    {
      View.AccessibilityDelegate localAccessibilityDelegate = OooOO0o(paramView);
      boolean bool = localAccessibilityDelegate instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter;
      if (bool)
      {
        paramAccessibilityDelegateCompat = new androidx/core/view/AccessibilityDelegateCompat;
        paramAccessibilityDelegateCompat.<init>();
      }
    }
    if (paramAccessibilityDelegateCompat == null) {
      paramAccessibilityDelegateCompat = null;
    } else {
      paramAccessibilityDelegateCompat = paramAccessibilityDelegateCompat.getBridge();
    }
    paramView.setAccessibilityDelegate(paramAccessibilityDelegateCompat);
  }
  
  public static void o00ooo(View paramView, Context paramContext, int[] paramArrayOfInt, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      ViewCompat.Api29Impl.OooO0OO(paramView, paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
    }
  }
  
  public static void o0O0O00(View paramView, boolean paramBoolean)
  {
    paramView.setFitsSystemWindows(paramBoolean);
  }
  
  public static void o0OO00O(View paramView, Rect paramRect)
  {
    ViewCompat.Api18Impl.OooO0OO(paramView, paramRect);
  }
  
  public static void o0OOO0o(View paramView, ColorStateList paramColorStateList)
  {
    ViewCompat.Api21Impl.OooOOo0(paramView, paramColorStateList);
  }
  
  public static void o0Oo0oo(View paramView, PorterDuff.Mode paramMode)
  {
    ViewCompat.Api21Impl.OooOOo(paramView, paramMode);
  }
  
  public static void o0OoOo0(View paramView, Runnable paramRunnable)
  {
    ViewCompat.Api16Impl.OooOOO0(paramView, paramRunnable);
  }
  
  public static void o0ooOO0(View paramView, int paramInt)
  {
    ViewCompat.Api19Impl.OooO0o(paramView, paramInt);
  }
  
  public static void o0ooOOo(View paramView, CharSequence paramCharSequence)
  {
    ViewCompat.AccessibilityViewProperty localAccessibilityViewProperty = Oooooo0();
    localAccessibilityViewProperty.OooO0oO(paramView, paramCharSequence);
    if (paramCharSequence != null)
    {
      paramCharSequence = OooO0oo;
      paramCharSequence.OooO00o(paramView);
    }
    else
    {
      paramCharSequence = OooO0oo;
      paramCharSequence.OooO0OO(paramView);
    }
  }
  
  public static void o0ooOoO(View paramView, Drawable paramDrawable)
  {
    ViewCompat.Api16Impl.OooOOo0(paramView, paramDrawable);
  }
  
  public static ViewCompat.AccessibilityViewProperty oo000o()
  {
    ViewCompat.1 local1 = new androidx/core/view/ViewCompat$1;
    int i = R.id.tag_screen_reader_focusable;
    local1.<init>(i, Boolean.class, 28);
    return local1;
  }
  
  public static void oo0o0Oo(View paramView, float paramFloat)
  {
    ViewCompat.Api21Impl.OooOOoo(paramView, paramFloat);
  }
  
  public static void ooOO(View paramView, Runnable paramRunnable, long paramLong)
  {
    ViewCompat.Api16Impl.OooOOO(paramView, paramRunnable, paramLong);
  }
  
  private static void setViewImportanceForAccessibilityIfNeeded(View paramView)
  {
    int i = OooOoO0(paramView);
    if (i == 0)
    {
      i = 1;
      o000000(paramView, i);
    }
    for (ViewParent localViewParent = paramView.getParent();; localViewParent = ((ViewParent)localViewParent).getParent())
    {
      boolean bool = localViewParent instanceof View;
      if (!bool) {
        break;
      }
      Object localObject = localViewParent;
      localObject = (View)localViewParent;
      int j = OooOoO0((View)localObject);
      int k = 4;
      if (j == k)
      {
        i = 2;
        o000000(paramView, i);
        break;
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat
 * JD-Core Version:    0.7.0.1
 */