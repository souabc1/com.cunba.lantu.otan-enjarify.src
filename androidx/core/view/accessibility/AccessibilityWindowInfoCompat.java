package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityWindowInfo;

public class AccessibilityWindowInfoCompat
{
  public final Object OooO00o;
  
  public AccessibilityWindowInfoCompat(Object paramObject)
  {
    this.OooO00o = paramObject;
  }
  
  public static String OooO0O0(int paramInt)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i)
      {
        i = 3;
        if (paramInt != i)
        {
          i = 4;
          if (paramInt != i) {
            return "<UNKNOWN>";
          }
          return "TYPE_ACCESSIBILITY_OVERLAY";
        }
        return "TYPE_SYSTEM";
      }
      return "TYPE_INPUT_METHOD";
    }
    return "TYPE_APPLICATION";
  }
  
  public static AccessibilityWindowInfoCompat OooO0OO(Object paramObject)
  {
    if (paramObject != null)
    {
      AccessibilityWindowInfoCompat localAccessibilityWindowInfoCompat = new androidx/core/view/accessibility/AccessibilityWindowInfoCompat;
      localAccessibilityWindowInfoCompat.<init>(paramObject);
      return localAccessibilityWindowInfoCompat;
    }
    return null;
  }
  
  public void OooO00o(Rect paramRect)
  {
    AccessibilityWindowInfoCompat.Api21Impl.OooO00o((AccessibilityWindowInfo)this.OooO00o, paramRect);
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
    boolean bool2 = paramObject instanceof AccessibilityWindowInfoCompat;
    if (!bool2) {
      return false;
    }
    paramObject = (AccessibilityWindowInfoCompat)paramObject;
    Object localObject = this.OooO00o;
    paramObject = paramObject.OooO00o;
    if (localObject == null)
    {
      if (paramObject != null) {
        bool1 = false;
      }
      return bool1;
    }
    return localObject.equals(paramObject);
  }
  
  public AccessibilityNodeInfoCompat getAnchor()
  {
    return AccessibilityNodeInfoCompat.OooOo0(AccessibilityWindowInfoCompat.Api24Impl.OooO00o((AccessibilityWindowInfo)this.OooO00o));
  }
  
  public AccessibilityWindowInfoCompat getChild(int paramInt)
  {
    return OooO0OO(AccessibilityWindowInfoCompat.Api21Impl.OooO0O0((AccessibilityWindowInfo)this.OooO00o, paramInt));
  }
  
  public int getChildCount()
  {
    return AccessibilityWindowInfoCompat.Api21Impl.OooO0OO((AccessibilityWindowInfo)this.OooO00o);
  }
  
  public int getDisplayId()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j) {
      return AccessibilityWindowInfoCompat.Api33Impl.OooO00o((AccessibilityWindowInfo)this.OooO00o);
    }
    return 0;
  }
  
  public int getId()
  {
    return AccessibilityWindowInfoCompat.Api21Impl.OooO0Oo((AccessibilityWindowInfo)this.OooO00o);
  }
  
  public int getLayer()
  {
    return AccessibilityWindowInfoCompat.Api21Impl.OooO0o0((AccessibilityWindowInfo)this.OooO00o);
  }
  
  public AccessibilityWindowInfoCompat getParent()
  {
    return OooO0OO(AccessibilityWindowInfoCompat.Api21Impl.OooO0o((AccessibilityWindowInfo)this.OooO00o));
  }
  
  public AccessibilityNodeInfoCompat getRoot()
  {
    return AccessibilityNodeInfoCompat.OooOo0(AccessibilityWindowInfoCompat.Api21Impl.OooO0oO((AccessibilityWindowInfo)this.OooO00o));
  }
  
  public CharSequence getTitle()
  {
    return AccessibilityWindowInfoCompat.Api24Impl.OooO0O0((AccessibilityWindowInfo)this.OooO00o);
  }
  
  public int getType()
  {
    return AccessibilityWindowInfoCompat.Api21Impl.OooO0oo((AccessibilityWindowInfo)this.OooO00o);
  }
  
  public int hashCode()
  {
    Object localObject = this.OooO00o;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    else
    {
      i = localObject.hashCode();
    }
    return i;
  }
  
  public boolean isAccessibilityFocused()
  {
    return AccessibilityWindowInfoCompat.Api21Impl.OooO((AccessibilityWindowInfo)this.OooO00o);
  }
  
  public boolean isActive()
  {
    return AccessibilityWindowInfoCompat.Api21Impl.OooOO0((AccessibilityWindowInfo)this.OooO00o);
  }
  
  public boolean isFocused()
  {
    return AccessibilityWindowInfoCompat.Api21Impl.OooOO0O((AccessibilityWindowInfo)this.OooO00o);
  }
  
  public boolean isInPictureInPictureMode()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j) {
      return AccessibilityWindowInfoCompat.Api33Impl.OooO0OO((AccessibilityWindowInfo)this.OooO00o);
    }
    return false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    OooO00o((Rect)localObject);
    localStringBuilder.append("AccessibilityWindowInfo[");
    localStringBuilder.append("id=");
    int i = getId();
    localStringBuilder.append(i);
    localStringBuilder.append(", type=");
    String str = OooO0O0(getType());
    localStringBuilder.append(str);
    localStringBuilder.append(", layer=");
    i = getLayer();
    localStringBuilder.append(i);
    str = ", bounds=";
    localStringBuilder.append(str);
    localStringBuilder.append(localObject);
    localStringBuilder.append(", focused=");
    boolean bool = isFocused();
    localStringBuilder.append(bool);
    localStringBuilder.append(", active=");
    bool = isActive();
    localStringBuilder.append(bool);
    localStringBuilder.append(", hasParent=");
    localObject = getParent();
    i = 1;
    if (localObject != null)
    {
      bool = i;
    }
    else
    {
      bool = false;
      localObject = null;
    }
    localStringBuilder.append(bool);
    localObject = ", hasChildren=";
    localStringBuilder.append((String)localObject);
    int j = getChildCount();
    if (j <= 0)
    {
      i = 0;
      str = null;
    }
    localStringBuilder.append(i);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityWindowInfoCompat
 * JD-Core Version:    0.7.0.1
 */