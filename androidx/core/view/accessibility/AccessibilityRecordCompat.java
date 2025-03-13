package androidx.core.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

public class AccessibilityRecordCompat
{
  public final AccessibilityRecord OooO00o;
  
  public static int OooO00o(AccessibilityRecord paramAccessibilityRecord)
  {
    return AccessibilityRecordCompat.Api15Impl.OooO00o(paramAccessibilityRecord);
  }
  
  public static int OooO0O0(AccessibilityRecord paramAccessibilityRecord)
  {
    return AccessibilityRecordCompat.Api15Impl.OooO0O0(paramAccessibilityRecord);
  }
  
  public static void OooO0OO(AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    AccessibilityRecordCompat.Api15Impl.OooO0OO(paramAccessibilityRecord, paramInt);
  }
  
  public static void OooO0Oo(AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    AccessibilityRecordCompat.Api15Impl.OooO0Oo(paramAccessibilityRecord, paramInt);
  }
  
  public static void OooO0o0(AccessibilityRecord paramAccessibilityRecord, View paramView, int paramInt)
  {
    AccessibilityRecordCompat.Api16Impl.OooO00o(paramAccessibilityRecord, paramView, paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof AccessibilityRecordCompat;
    if (!bool2) {
      return false;
    }
    paramObject = (AccessibilityRecordCompat)paramObject;
    AccessibilityRecord localAccessibilityRecord = this.OooO00o;
    paramObject = paramObject.OooO00o;
    if (localAccessibilityRecord == null)
    {
      if (paramObject != null) {
        bool1 = false;
      }
      return bool1;
    }
    return localAccessibilityRecord.equals(paramObject);
  }
  
  public int getAddedCount()
  {
    return this.OooO00o.getAddedCount();
  }
  
  public CharSequence getBeforeText()
  {
    return this.OooO00o.getBeforeText();
  }
  
  public CharSequence getClassName()
  {
    return this.OooO00o.getClassName();
  }
  
  public CharSequence getContentDescription()
  {
    return this.OooO00o.getContentDescription();
  }
  
  public int getCurrentItemIndex()
  {
    return this.OooO00o.getCurrentItemIndex();
  }
  
  public int getFromIndex()
  {
    return this.OooO00o.getFromIndex();
  }
  
  public Object getImpl()
  {
    return this.OooO00o;
  }
  
  public int getItemCount()
  {
    return this.OooO00o.getItemCount();
  }
  
  public int getMaxScrollX()
  {
    return OooO00o(this.OooO00o);
  }
  
  public int getMaxScrollY()
  {
    return OooO0O0(this.OooO00o);
  }
  
  public Parcelable getParcelableData()
  {
    return this.OooO00o.getParcelableData();
  }
  
  public int getRemovedCount()
  {
    return this.OooO00o.getRemovedCount();
  }
  
  public int getScrollX()
  {
    return this.OooO00o.getScrollX();
  }
  
  public int getScrollY()
  {
    return this.OooO00o.getScrollY();
  }
  
  public AccessibilityNodeInfoCompat getSource()
  {
    return AccessibilityNodeInfoCompat.OooOo0(this.OooO00o.getSource());
  }
  
  public List getText()
  {
    return this.OooO00o.getText();
  }
  
  public int getToIndex()
  {
    return this.OooO00o.getToIndex();
  }
  
  public int getWindowId()
  {
    return this.OooO00o.getWindowId();
  }
  
  public int hashCode()
  {
    AccessibilityRecord localAccessibilityRecord = this.OooO00o;
    int i;
    if (localAccessibilityRecord == null)
    {
      i = 0;
      localAccessibilityRecord = null;
    }
    else
    {
      i = localAccessibilityRecord.hashCode();
    }
    return i;
  }
  
  public boolean isChecked()
  {
    return this.OooO00o.isChecked();
  }
  
  public boolean isEnabled()
  {
    return this.OooO00o.isEnabled();
  }
  
  public boolean isFullScreen()
  {
    return this.OooO00o.isFullScreen();
  }
  
  public boolean isPassword()
  {
    return this.OooO00o.isPassword();
  }
  
  public boolean isScrollable()
  {
    return this.OooO00o.isScrollable();
  }
  
  public void setAddedCount(int paramInt)
  {
    this.OooO00o.setAddedCount(paramInt);
  }
  
  public void setBeforeText(CharSequence paramCharSequence)
  {
    this.OooO00o.setBeforeText(paramCharSequence);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    this.OooO00o.setChecked(paramBoolean);
  }
  
  public void setClassName(CharSequence paramCharSequence)
  {
    this.OooO00o.setClassName(paramCharSequence);
  }
  
  public void setContentDescription(CharSequence paramCharSequence)
  {
    this.OooO00o.setContentDescription(paramCharSequence);
  }
  
  public void setCurrentItemIndex(int paramInt)
  {
    this.OooO00o.setCurrentItemIndex(paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.OooO00o.setEnabled(paramBoolean);
  }
  
  public void setFromIndex(int paramInt)
  {
    this.OooO00o.setFromIndex(paramInt);
  }
  
  public void setFullScreen(boolean paramBoolean)
  {
    this.OooO00o.setFullScreen(paramBoolean);
  }
  
  public void setItemCount(int paramInt)
  {
    this.OooO00o.setItemCount(paramInt);
  }
  
  public void setMaxScrollX(int paramInt)
  {
    OooO0OO(this.OooO00o, paramInt);
  }
  
  public void setMaxScrollY(int paramInt)
  {
    OooO0Oo(this.OooO00o, paramInt);
  }
  
  public void setParcelableData(Parcelable paramParcelable)
  {
    this.OooO00o.setParcelableData(paramParcelable);
  }
  
  public void setPassword(boolean paramBoolean)
  {
    this.OooO00o.setPassword(paramBoolean);
  }
  
  public void setRemovedCount(int paramInt)
  {
    this.OooO00o.setRemovedCount(paramInt);
  }
  
  public void setScrollX(int paramInt)
  {
    this.OooO00o.setScrollX(paramInt);
  }
  
  public void setScrollY(int paramInt)
  {
    this.OooO00o.setScrollY(paramInt);
  }
  
  public void setScrollable(boolean paramBoolean)
  {
    this.OooO00o.setScrollable(paramBoolean);
  }
  
  public void setSource(View paramView)
  {
    this.OooO00o.setSource(paramView);
  }
  
  public void setToIndex(int paramInt)
  {
    this.OooO00o.setToIndex(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityRecordCompat
 * JD-Core Version:    0.7.0.1
 */