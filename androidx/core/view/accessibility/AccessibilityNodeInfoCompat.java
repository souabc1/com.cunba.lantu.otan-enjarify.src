package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo;
import androidx.core.os.BuildCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccessibilityNodeInfoCompat
{
  public final AccessibilityNodeInfo OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  
  public AccessibilityNodeInfoCompat(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    int i = -1;
    this.OooO0O0 = i;
    this.OooO0OO = i;
    this.OooO00o = paramAccessibilityNodeInfo;
  }
  
  public AccessibilityNodeInfoCompat(Object paramObject)
  {
    int i = -1;
    this.OooO0O0 = i;
    this.OooO0OO = i;
    paramObject = (AccessibilityNodeInfo)paramObject;
    this.OooO00o = paramObject;
  }
  
  public static ClickableSpan[] OooO(CharSequence paramCharSequence)
  {
    boolean bool = paramCharSequence instanceof Spanned;
    if (bool)
    {
      Object localObject = paramCharSequence;
      localObject = (Spanned)paramCharSequence;
      int i = ((CharSequence)paramCharSequence).length();
      return (ClickableSpan[])((Spanned)localObject).getSpans(0, i, ClickableSpan.class);
    }
    return null;
  }
  
  public static AccessibilityNodeInfoCompat OooOO0O()
  {
    return OooOo00(AccessibilityNodeInfo.obtain());
  }
  
  public static AccessibilityNodeInfoCompat OooOO0o(View paramView)
  {
    return OooOo00(AccessibilityNodeInfo.obtain(paramView));
  }
  
  public static AccessibilityNodeInfoCompat OooOOO0(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    return OooOo00(AccessibilityNodeInfo.obtain(paramAccessibilityNodeInfoCompat.OooO00o));
  }
  
  public static AccessibilityNodeInfoCompat OooOo0(Object paramObject)
  {
    if (paramObject != null)
    {
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat;
      localAccessibilityNodeInfoCompat.<init>(paramObject);
      return localAccessibilityNodeInfoCompat;
    }
    return null;
  }
  
  public static AccessibilityNodeInfoCompat OooOo00(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat;
    localAccessibilityNodeInfoCompat.<init>(paramAccessibilityNodeInfo);
    return localAccessibilityNodeInfoCompat;
  }
  
  private static String getActionSymbolicName(int paramInt)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i)
      {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            switch (paramInt)
            {
            default: 
              switch (paramInt)
              {
              default: 
                return "ACTION_UNKNOWN";
              case 16908375: 
                return "ACTION_DRAG_CANCEL";
              case 16908374: 
                return "ACTION_DRAG_DROP";
              case 16908373: 
                return "ACTION_DRAG_START";
              }
              return "ACTION_IME_ENTER";
            case 16908362: 
              return "ACTION_PRESS_AND_HOLD";
            case 16908361: 
              return "ACTION_PAGE_RIGHT";
            case 16908360: 
              return "ACTION_PAGE_LEFT";
            case 16908359: 
              return "ACTION_PAGE_DOWN";
            case 16908358: 
              return "ACTION_PAGE_UP";
            case 16908357: 
              return "ACTION_HIDE_TOOLTIP";
            }
            return "ACTION_SHOW_TOOLTIP";
          case 16908349: 
            return "ACTION_SET_PROGRESS";
          case 16908348: 
            return "ACTION_CONTEXT_CLICK";
          case 16908347: 
            return "ACTION_SCROLL_RIGHT";
          case 16908346: 
            return "ACTION_SCROLL_DOWN";
          case 16908345: 
            return "ACTION_SCROLL_LEFT";
          case 16908344: 
            return "ACTION_SCROLL_UP";
          case 16908343: 
            return "ACTION_SCROLL_TO_POSITION";
          }
          return "ACTION_SHOW_ON_SCREEN";
        case 16908354: 
          return "ACTION_MOVE_WINDOW";
        case 2097152: 
          return "ACTION_SET_TEXT";
        case 524288: 
          return "ACTION_COLLAPSE";
        case 262144: 
          return "ACTION_EXPAND";
        case 131072: 
          return "ACTION_SET_SELECTION";
        case 65536: 
          return "ACTION_CUT";
        case 32768: 
          return "ACTION_PASTE";
        case 16384: 
          return "ACTION_COPY";
        case 8192: 
          return "ACTION_SCROLL_BACKWARD";
        case 4096: 
          return "ACTION_SCROLL_FORWARD";
        case 2048: 
          return "ACTION_PREVIOUS_HTML_ELEMENT";
        case 1024: 
          return "ACTION_NEXT_HTML_ELEMENT";
        case 512: 
          return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        case 256: 
          return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        case 128: 
          return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        case 64: 
          return "ACTION_ACCESSIBILITY_FOCUS";
        case 32: 
          return "ACTION_LONG_CLICK";
        case 16: 
          return "ACTION_CLICK";
        case 8: 
          return "ACTION_CLEAR_SELECTION";
        }
        return "ACTION_SELECT";
      }
      return "ACTION_CLEAR_FOCUS";
    }
    return "ACTION_FOCUS";
  }
  
  private boolean getBooleanProperty(int paramInt)
  {
    Bundle localBundle = getExtras();
    boolean bool = false;
    if (localBundle == null) {
      return false;
    }
    String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    int i = localBundle.getInt(str, 0) & paramInt;
    if (i == paramInt) {
      bool = true;
    }
    return bool;
  }
  
  private void setBooleanProperty(int paramInt, boolean paramBoolean)
  {
    Bundle localBundle = getExtras();
    if (localBundle != null)
    {
      String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
      int i = localBundle.getInt(str, 0);
      int j = paramInt ^ 0xFFFFFFFF;
      i &= j;
      if (!paramBoolean) {
        paramInt = 0;
      }
      paramInt |= i;
      localBundle.putInt(str, paramInt);
    }
  }
  
  public void OooO00o(int paramInt)
  {
    this.OooO00o.addAction(paramInt);
  }
  
  public void OooO0O0(AccessibilityNodeInfoCompat.AccessibilityActionCompat paramAccessibilityActionCompat)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.OooO00o;
    paramAccessibilityActionCompat = (AccessibilityNodeInfo.AccessibilityAction)paramAccessibilityActionCompat.OooO00o;
    localAccessibilityNodeInfo.addAction(paramAccessibilityActionCompat);
  }
  
  public void OooO0OO(View paramView)
  {
    this.OooO00o.addChild(paramView);
  }
  
  public void OooO0Oo(View paramView, int paramInt)
  {
    this.OooO00o.addChild(paramView, paramInt);
  }
  
  public final List OooO0o(String paramString)
  {
    ArrayList localArrayList = this.OooO00o.getExtras().getIntegerArrayList(paramString);
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Bundle localBundle = this.OooO00o.getExtras();
      localBundle.putIntegerArrayList(paramString, localArrayList);
    }
    return localArrayList;
  }
  
  public void OooO0o0(CharSequence paramCharSequence, View paramView) {}
  
  public void OooO0oO(Rect paramRect)
  {
    this.OooO00o.getBoundsInParent(paramRect);
  }
  
  public void OooO0oo(Rect paramRect)
  {
    this.OooO00o.getBoundsInScreen(paramRect);
  }
  
  public final boolean OooOO0()
  {
    return OooO0o("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
  }
  
  public boolean OooOOO(int paramInt, Bundle paramBundle)
  {
    return this.OooO00o.performAction(paramInt, paramBundle);
  }
  
  public void OooOOOO()
  {
    this.OooO00o.recycle();
  }
  
  public boolean OooOOOo(AccessibilityNodeInfoCompat.AccessibilityActionCompat paramAccessibilityActionCompat)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.OooO00o;
    paramAccessibilityActionCompat = (AccessibilityNodeInfo.AccessibilityAction)paramAccessibilityActionCompat.OooO00o;
    return localAccessibilityNodeInfo.removeAction(paramAccessibilityActionCompat);
  }
  
  public void OooOOo(View paramView, int paramInt)
  {
    this.OooO0OO = paramInt;
    this.OooO00o.setSource(paramView, paramInt);
  }
  
  public void OooOOo0(View paramView, int paramInt)
  {
    this.OooO0O0 = paramInt;
    this.OooO00o.setParent(paramView, paramInt);
  }
  
  public AccessibilityNodeInfo OooOOoo()
  {
    return this.OooO00o;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    if (paramObject == null) {
      return false;
    }
    boolean bool2 = paramObject instanceof AccessibilityNodeInfoCompat;
    if (!bool2) {
      return false;
    }
    paramObject = (AccessibilityNodeInfoCompat)paramObject;
    AccessibilityNodeInfo localAccessibilityNodeInfo1 = this.OooO00o;
    if (localAccessibilityNodeInfo1 == null)
    {
      localAccessibilityNodeInfo1 = paramObject.OooO00o;
      if (localAccessibilityNodeInfo1 != null) {
        return false;
      }
    }
    else
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo2 = paramObject.OooO00o;
      bool2 = localAccessibilityNodeInfo1.equals(localAccessibilityNodeInfo2);
      if (!bool2) {
        return false;
      }
    }
    int i = this.OooO0OO;
    int j = paramObject.OooO0OO;
    if (i != j) {
      return false;
    }
    i = this.OooO0O0;
    int k = paramObject.OooO0O0;
    if (i != k) {
      return false;
    }
    return bool1;
  }
  
  public List getActionList()
  {
    List localList = this.OooO00o.getActionList();
    if (localList != null)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int i = localList.size();
      int j = 0;
      while (j < i)
      {
        Object localObject = localList.get(j);
        AccessibilityNodeInfoCompat.AccessibilityActionCompat localAccessibilityActionCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityActionCompat;
        localAccessibilityActionCompat.<init>(localObject);
        localArrayList.add(localAccessibilityActionCompat);
        j += 1;
      }
      return localArrayList;
    }
    return Collections.emptyList();
  }
  
  public int getActions()
  {
    return this.OooO00o.getActions();
  }
  
  public List getAvailableExtraData()
  {
    return this.OooO00o.getAvailableExtraData();
  }
  
  public AccessibilityNodeInfoCompat getChild(int paramInt)
  {
    return OooOo0(this.OooO00o.getChild(paramInt));
  }
  
  public int getChildCount()
  {
    return this.OooO00o.getChildCount();
  }
  
  public CharSequence getClassName()
  {
    return this.OooO00o.getClassName();
  }
  
  public AccessibilityNodeInfoCompat.CollectionInfoCompat getCollectionInfo()
  {
    AccessibilityNodeInfo.CollectionInfo localCollectionInfo = this.OooO00o.getCollectionInfo();
    if (localCollectionInfo != null)
    {
      AccessibilityNodeInfoCompat.CollectionInfoCompat localCollectionInfoCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;
      localCollectionInfoCompat.<init>(localCollectionInfo);
      return localCollectionInfoCompat;
    }
    return null;
  }
  
  public AccessibilityNodeInfoCompat.CollectionItemInfoCompat getCollectionItemInfo()
  {
    AccessibilityNodeInfo.CollectionItemInfo localCollectionItemInfo = this.OooO00o.getCollectionItemInfo();
    if (localCollectionItemInfo != null)
    {
      AccessibilityNodeInfoCompat.CollectionItemInfoCompat localCollectionItemInfoCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
      localCollectionItemInfoCompat.<init>(localCollectionItemInfo);
      return localCollectionItemInfoCompat;
    }
    return null;
  }
  
  public CharSequence getContentDescription()
  {
    return this.OooO00o.getContentDescription();
  }
  
  public int getDrawingOrder()
  {
    return this.OooO00o.getDrawingOrder();
  }
  
  public CharSequence getError()
  {
    return this.OooO00o.getError();
  }
  
  public AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j) {
      return AccessibilityNodeInfoCompat.Api33Impl.OooO00o(this.OooO00o);
    }
    return null;
  }
  
  public Bundle getExtras()
  {
    return this.OooO00o.getExtras();
  }
  
  public CharSequence getHintText()
  {
    return this.OooO00o.getHintText();
  }
  
  public Object getInfo()
  {
    return this.OooO00o;
  }
  
  public int getInputType()
  {
    return this.OooO00o.getInputType();
  }
  
  public AccessibilityNodeInfoCompat getLabelFor()
  {
    return OooOo0(this.OooO00o.getLabelFor());
  }
  
  public AccessibilityNodeInfoCompat getLabeledBy()
  {
    return OooOo0(this.OooO00o.getLabeledBy());
  }
  
  public int getLiveRegion()
  {
    return this.OooO00o.getLiveRegion();
  }
  
  public int getMaxTextLength()
  {
    return this.OooO00o.getMaxTextLength();
  }
  
  public int getMovementGranularities()
  {
    return this.OooO00o.getMovementGranularities();
  }
  
  public CharSequence getPackageName()
  {
    return this.OooO00o.getPackageName();
  }
  
  public CharSequence getPaneTitle()
  {
    return this.OooO00o.getPaneTitle();
  }
  
  public AccessibilityNodeInfoCompat getParent()
  {
    return OooOo0(this.OooO00o.getParent());
  }
  
  public AccessibilityNodeInfoCompat.RangeInfoCompat getRangeInfo()
  {
    AccessibilityNodeInfo.RangeInfo localRangeInfo = this.OooO00o.getRangeInfo();
    if (localRangeInfo != null)
    {
      AccessibilityNodeInfoCompat.RangeInfoCompat localRangeInfoCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat$RangeInfoCompat;
      localRangeInfoCompat.<init>(localRangeInfo);
      return localRangeInfoCompat;
    }
    return null;
  }
  
  public CharSequence getRoleDescription()
  {
    return this.OooO00o.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
  }
  
  public CharSequence getStateDescription()
  {
    boolean bool = BuildCompat.isAtLeastR();
    if (bool) {
      return OooOOO0.OooO00o(this.OooO00o);
    }
    return this.OooO00o.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
  }
  
  public CharSequence getText()
  {
    boolean bool = OooOO0();
    if (bool)
    {
      List localList1 = OooO0o("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      List localList2 = OooO0o("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      List localList3 = OooO0o("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      List localList4 = OooO0o("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      SpannableString localSpannableString = new android/text/SpannableString;
      Object localObject1 = this.OooO00o.getText();
      Object localObject2 = this.OooO00o.getText();
      int i = ((CharSequence)localObject2).length();
      int j = 0;
      localObject1 = TextUtils.substring((CharSequence)localObject1, 0, i);
      localSpannableString.<init>((CharSequence)localObject1);
      for (;;)
      {
        int k = localList1.size();
        if (j >= k) {
          break;
        }
        localObject1 = new androidx/core/view/accessibility/AccessibilityClickableSpanCompat;
        i = ((Integer)localList4.get(j)).intValue();
        int m = getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY");
        ((AccessibilityClickableSpanCompat)localObject1).<init>(i, this, m);
        localObject2 = (Integer)localList1.get(j);
        i = ((Integer)localObject2).intValue();
        Integer localInteger1 = (Integer)localList2.get(j);
        m = localInteger1.intValue();
        Integer localInteger2 = (Integer)localList3.get(j);
        int n = localInteger2.intValue();
        localSpannableString.setSpan(localObject1, i, m, n);
        j += 1;
      }
      return localSpannableString;
    }
    return this.OooO00o.getText();
  }
  
  public int getTextSelectionEnd()
  {
    return this.OooO00o.getTextSelectionEnd();
  }
  
  public int getTextSelectionStart()
  {
    return this.OooO00o.getTextSelectionStart();
  }
  
  public CharSequence getTooltipText()
  {
    return this.OooO00o.getTooltipText();
  }
  
  public AccessibilityNodeInfoCompat.TouchDelegateInfoCompat getTouchDelegateInfo()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      AccessibilityNodeInfo.TouchDelegateInfo localTouchDelegateInfo = OooO0OO.OooO00o(this.OooO00o);
      if (localTouchDelegateInfo != null)
      {
        AccessibilityNodeInfoCompat.TouchDelegateInfoCompat localTouchDelegateInfoCompat = new androidx/core/view/accessibility/AccessibilityNodeInfoCompat$TouchDelegateInfoCompat;
        localTouchDelegateInfoCompat.<init>(localTouchDelegateInfo);
        return localTouchDelegateInfoCompat;
      }
    }
    return null;
  }
  
  public AccessibilityNodeInfoCompat getTraversalAfter()
  {
    return OooOo0(this.OooO00o.getTraversalAfter());
  }
  
  public AccessibilityNodeInfoCompat getTraversalBefore()
  {
    return OooOo0(this.OooO00o.getTraversalBefore());
  }
  
  public String getUniqueId()
  {
    boolean bool = BuildCompat.isAtLeastT();
    if (bool) {
      return OooOO0.OooO00o(this.OooO00o);
    }
    return this.OooO00o.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
  }
  
  public String getViewIdResourceName()
  {
    return this.OooO00o.getViewIdResourceName();
  }
  
  public AccessibilityWindowInfoCompat getWindow()
  {
    return AccessibilityWindowInfoCompat.OooO0OO(this.OooO00o.getWindow());
  }
  
  public int getWindowId()
  {
    return this.OooO00o.getWindowId();
  }
  
  public int hashCode()
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.OooO00o;
    int i;
    if (localAccessibilityNodeInfo == null)
    {
      i = 0;
      localAccessibilityNodeInfo = null;
    }
    else
    {
      i = localAccessibilityNodeInfo.hashCode();
    }
    return i;
  }
  
  public boolean isAccessibilityFocused()
  {
    return this.OooO00o.isAccessibilityFocused();
  }
  
  public boolean isCheckable()
  {
    return this.OooO00o.isCheckable();
  }
  
  public boolean isChecked()
  {
    return this.OooO00o.isChecked();
  }
  
  public boolean isClickable()
  {
    return this.OooO00o.isClickable();
  }
  
  public boolean isContentInvalid()
  {
    return this.OooO00o.isContentInvalid();
  }
  
  public boolean isContextClickable()
  {
    return this.OooO00o.isContextClickable();
  }
  
  public boolean isDismissable()
  {
    return this.OooO00o.isDismissable();
  }
  
  public boolean isEditable()
  {
    return this.OooO00o.isEditable();
  }
  
  public boolean isEnabled()
  {
    return this.OooO00o.isEnabled();
  }
  
  public boolean isFocusable()
  {
    return this.OooO00o.isFocusable();
  }
  
  public boolean isFocused()
  {
    return this.OooO00o.isFocused();
  }
  
  public boolean isHeading()
  {
    return this.OooO00o.isHeading();
  }
  
  public boolean isImportantForAccessibility()
  {
    return this.OooO00o.isImportantForAccessibility();
  }
  
  public boolean isLongClickable()
  {
    return this.OooO00o.isLongClickable();
  }
  
  public boolean isMultiLine()
  {
    return this.OooO00o.isMultiLine();
  }
  
  public boolean isPassword()
  {
    return this.OooO00o.isPassword();
  }
  
  public boolean isScreenReaderFocusable()
  {
    return this.OooO00o.isScreenReaderFocusable();
  }
  
  public boolean isScrollable()
  {
    return this.OooO00o.isScrollable();
  }
  
  public boolean isSelected()
  {
    return this.OooO00o.isSelected();
  }
  
  public boolean isShowingHintText()
  {
    return this.OooO00o.isShowingHintText();
  }
  
  public boolean isTextEntryKey()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      return OooO.OooO00o(this.OooO00o);
    }
    return getBooleanProperty(8);
  }
  
  public boolean isTextSelectable()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j) {
      return AccessibilityNodeInfoCompat.Api33Impl.OooO0O0(this.OooO00o);
    }
    return false;
  }
  
  public boolean isVisibleToUser()
  {
    return this.OooO00o.isVisibleToUser();
  }
  
  public void setAccessibilityFocused(boolean paramBoolean)
  {
    this.OooO00o.setAccessibilityFocused(paramBoolean);
  }
  
  public void setAvailableExtraData(List paramList)
  {
    this.OooO00o.setAvailableExtraData(paramList);
  }
  
  public void setBoundsInParent(Rect paramRect)
  {
    this.OooO00o.setBoundsInParent(paramRect);
  }
  
  public void setBoundsInScreen(Rect paramRect)
  {
    this.OooO00o.setBoundsInScreen(paramRect);
  }
  
  public void setCanOpenPopup(boolean paramBoolean)
  {
    this.OooO00o.setCanOpenPopup(paramBoolean);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    this.OooO00o.setCheckable(paramBoolean);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    this.OooO00o.setChecked(paramBoolean);
  }
  
  public void setClassName(CharSequence paramCharSequence)
  {
    this.OooO00o.setClassName(paramCharSequence);
  }
  
  public void setClickable(boolean paramBoolean)
  {
    this.OooO00o.setClickable(paramBoolean);
  }
  
  public void setCollectionInfo(Object paramObject)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.OooO00o;
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = (AccessibilityNodeInfo.CollectionInfo)((AccessibilityNodeInfoCompat.CollectionInfoCompat)paramObject).OooO00o;
    }
    localAccessibilityNodeInfo.setCollectionInfo(paramObject);
  }
  
  public void setCollectionItemInfo(Object paramObject)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.OooO00o;
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = (AccessibilityNodeInfo.CollectionItemInfo)((AccessibilityNodeInfoCompat.CollectionItemInfoCompat)paramObject).OooO00o;
    }
    localAccessibilityNodeInfo.setCollectionItemInfo(paramObject);
  }
  
  public void setContentDescription(CharSequence paramCharSequence)
  {
    this.OooO00o.setContentDescription(paramCharSequence);
  }
  
  public void setContentInvalid(boolean paramBoolean)
  {
    this.OooO00o.setContentInvalid(paramBoolean);
  }
  
  public void setContextClickable(boolean paramBoolean)
  {
    this.OooO00o.setContextClickable(paramBoolean);
  }
  
  public void setDismissable(boolean paramBoolean)
  {
    this.OooO00o.setDismissable(paramBoolean);
  }
  
  public void setDrawingOrder(int paramInt)
  {
    this.OooO00o.setDrawingOrder(paramInt);
  }
  
  public void setEditable(boolean paramBoolean)
  {
    this.OooO00o.setEditable(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.OooO00o.setEnabled(paramBoolean);
  }
  
  public void setError(CharSequence paramCharSequence)
  {
    this.OooO00o.setError(paramCharSequence);
  }
  
  public void setFocusable(boolean paramBoolean)
  {
    this.OooO00o.setFocusable(paramBoolean);
  }
  
  public void setFocused(boolean paramBoolean)
  {
    this.OooO00o.setFocused(paramBoolean);
  }
  
  public void setHeading(boolean paramBoolean)
  {
    this.OooO00o.setHeading(paramBoolean);
  }
  
  public void setHintText(CharSequence paramCharSequence)
  {
    this.OooO00o.setHintText(paramCharSequence);
  }
  
  public void setImportantForAccessibility(boolean paramBoolean)
  {
    this.OooO00o.setImportantForAccessibility(paramBoolean);
  }
  
  public void setInputType(int paramInt)
  {
    this.OooO00o.setInputType(paramInt);
  }
  
  public void setLabelFor(View paramView)
  {
    this.OooO00o.setLabelFor(paramView);
  }
  
  public void setLabeledBy(View paramView)
  {
    this.OooO00o.setLabeledBy(paramView);
  }
  
  public void setLiveRegion(int paramInt)
  {
    this.OooO00o.setLiveRegion(paramInt);
  }
  
  public void setLongClickable(boolean paramBoolean)
  {
    this.OooO00o.setLongClickable(paramBoolean);
  }
  
  public void setMaxTextLength(int paramInt)
  {
    this.OooO00o.setMaxTextLength(paramInt);
  }
  
  public void setMovementGranularities(int paramInt)
  {
    this.OooO00o.setMovementGranularities(paramInt);
  }
  
  public void setMultiLine(boolean paramBoolean)
  {
    this.OooO00o.setMultiLine(paramBoolean);
  }
  
  public void setPackageName(CharSequence paramCharSequence)
  {
    this.OooO00o.setPackageName(paramCharSequence);
  }
  
  public void setPaneTitle(CharSequence paramCharSequence)
  {
    this.OooO00o.setPaneTitle(paramCharSequence);
  }
  
  public void setParent(View paramView)
  {
    this.OooO0O0 = -1;
    this.OooO00o.setParent(paramView);
  }
  
  public void setPassword(boolean paramBoolean)
  {
    this.OooO00o.setPassword(paramBoolean);
  }
  
  public void setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat paramRangeInfoCompat)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.OooO00o;
    paramRangeInfoCompat = (AccessibilityNodeInfo.RangeInfo)paramRangeInfoCompat.OooO00o;
    localAccessibilityNodeInfo.setRangeInfo(paramRangeInfoCompat);
  }
  
  public void setRoleDescription(CharSequence paramCharSequence)
  {
    this.OooO00o.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", paramCharSequence);
  }
  
  public void setScreenReaderFocusable(boolean paramBoolean)
  {
    this.OooO00o.setScreenReaderFocusable(paramBoolean);
  }
  
  public void setScrollable(boolean paramBoolean)
  {
    this.OooO00o.setScrollable(paramBoolean);
  }
  
  public void setSelected(boolean paramBoolean)
  {
    this.OooO00o.setSelected(paramBoolean);
  }
  
  public void setShowingHintText(boolean paramBoolean)
  {
    this.OooO00o.setShowingHintText(paramBoolean);
  }
  
  public void setSource(View paramView)
  {
    this.OooO0OO = -1;
    this.OooO00o.setSource(paramView);
  }
  
  public void setStateDescription(CharSequence paramCharSequence)
  {
    boolean bool = BuildCompat.isAtLeastR();
    Object localObject;
    if (bool)
    {
      localObject = this.OooO00o;
      OooOO0O.OooO00o((AccessibilityNodeInfo)localObject, paramCharSequence);
    }
    else
    {
      localObject = this.OooO00o.getExtras();
      String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
      ((Bundle)localObject).putCharSequence(str, paramCharSequence);
    }
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    this.OooO00o.setText(paramCharSequence);
  }
  
  public void setTextEntryKey(boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.OooO00o;
      OooO0O0.OooO00o(localAccessibilityNodeInfo, paramBoolean);
    }
    else
    {
      i = 8;
      setBooleanProperty(i, paramBoolean);
    }
  }
  
  public void setTextSelectable(boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.OooO00o;
      AccessibilityNodeInfoCompat.Api33Impl.OooO0OO(localAccessibilityNodeInfo, paramBoolean);
    }
  }
  
  public void setTextSelection(int paramInt1, int paramInt2)
  {
    this.OooO00o.setTextSelection(paramInt1, paramInt2);
  }
  
  public void setTooltipText(CharSequence paramCharSequence)
  {
    this.OooO00o.setTooltipText(paramCharSequence);
  }
  
  public void setTouchDelegateInfo(AccessibilityNodeInfoCompat.TouchDelegateInfoCompat paramTouchDelegateInfoCompat)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.OooO00o;
      paramTouchDelegateInfoCompat = paramTouchDelegateInfoCompat.OooO00o;
      OooO0o.OooO00o(localAccessibilityNodeInfo, paramTouchDelegateInfoCompat);
    }
  }
  
  public void setTraversalAfter(View paramView)
  {
    this.OooO00o.setTraversalAfter(paramView);
  }
  
  public void setTraversalBefore(View paramView)
  {
    this.OooO00o.setTraversalBefore(paramView);
  }
  
  public void setUniqueId(String paramString)
  {
    boolean bool = BuildCompat.isAtLeastT();
    Object localObject;
    if (bool)
    {
      localObject = this.OooO00o;
      OooO00o.OooO00o((AccessibilityNodeInfo)localObject, paramString);
    }
    else
    {
      localObject = this.OooO00o.getExtras();
      String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";
      ((BaseBundle)localObject).putString(str, paramString);
    }
  }
  
  public void setViewIdResourceName(String paramString)
  {
    this.OooO00o.setViewIdResourceName(paramString);
  }
  
  public void setVisibleToUser(boolean paramBoolean)
  {
    this.OooO00o.setVisibleToUser(paramBoolean);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = super.toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    OooO0oO((Rect)localObject1);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("; boundsInParent: ");
    ((StringBuilder)localObject2).append(localObject1);
    localObject2 = ((StringBuilder)localObject2).toString();
    localStringBuilder.append((String)localObject2);
    OooO0oo((Rect)localObject1);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = "; boundsInScreen: ";
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append(localObject1);
    localObject1 = ((StringBuilder)localObject2).toString();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append("; packageName: ");
    localObject1 = getPackageName();
    localStringBuilder.append((CharSequence)localObject1);
    localStringBuilder.append("; className: ");
    localObject1 = getClassName();
    localStringBuilder.append((CharSequence)localObject1);
    localStringBuilder.append("; text: ");
    localObject1 = getText();
    localStringBuilder.append((CharSequence)localObject1);
    localStringBuilder.append("; contentDescription: ");
    localObject1 = getContentDescription();
    localStringBuilder.append((CharSequence)localObject1);
    localStringBuilder.append("; viewId: ");
    localObject1 = getViewIdResourceName();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append("; uniqueId: ");
    localObject1 = getUniqueId();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append("; checkable: ");
    boolean bool1 = isCheckable();
    localStringBuilder.append(bool1);
    localStringBuilder.append("; checked: ");
    bool1 = isChecked();
    localStringBuilder.append(bool1);
    localStringBuilder.append("; focusable: ");
    bool1 = isFocusable();
    localStringBuilder.append(bool1);
    localStringBuilder.append("; focused: ");
    bool1 = isFocused();
    localStringBuilder.append(bool1);
    localStringBuilder.append("; selected: ");
    bool1 = isSelected();
    localStringBuilder.append(bool1);
    localStringBuilder.append("; clickable: ");
    bool1 = isClickable();
    localStringBuilder.append(bool1);
    localStringBuilder.append("; longClickable: ");
    bool1 = isLongClickable();
    localStringBuilder.append(bool1);
    localStringBuilder.append("; enabled: ");
    bool1 = isEnabled();
    localStringBuilder.append(bool1);
    localStringBuilder.append("; password: ");
    bool1 = isPassword();
    localStringBuilder.append(bool1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("; scrollable: ");
    int i = isScrollable();
    ((StringBuilder)localObject1).append(i);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append("; [");
    localObject1 = getActionList();
    i = 0;
    localObject2 = null;
    for (;;)
    {
      int k = ((List)localObject1).size();
      if (i >= k) {
        break;
      }
      localObject3 = (AccessibilityNodeInfoCompat.AccessibilityActionCompat)((List)localObject1).get(i);
      int n = ((AccessibilityNodeInfoCompat.AccessibilityActionCompat)localObject3).getId();
      String str = getActionSymbolicName(n);
      Object localObject4 = "ACTION_UNKNOWN";
      boolean bool2 = str.equals(localObject4);
      if (bool2)
      {
        localObject4 = ((AccessibilityNodeInfoCompat.AccessibilityActionCompat)localObject3).getLabel();
        if (localObject4 != null)
        {
          localObject3 = ((AccessibilityNodeInfoCompat.AccessibilityActionCompat)localObject3).getLabel();
          str = ((CharSequence)localObject3).toString();
        }
      }
      localStringBuilder.append(str);
      int m = ((List)localObject1).size() + -1;
      if (i != m)
      {
        localObject3 = ", ";
        localStringBuilder.append((String)localObject3);
      }
      int j;
      i += 1;
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat
 * JD-Core Version:    0.7.0.1
 */