package androidx.core.view;

import android.os.Build.VERSION;
import android.view.DisplayCutout;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import java.util.List;

public final class DisplayCutoutCompat
{
  public final DisplayCutout OooO00o;
  
  public DisplayCutoutCompat(DisplayCutout paramDisplayCutout)
  {
    this.OooO00o = paramDisplayCutout;
  }
  
  public static DisplayCutoutCompat OooO0O0(DisplayCutout paramDisplayCutout)
  {
    if (paramDisplayCutout == null)
    {
      paramDisplayCutout = null;
    }
    else
    {
      DisplayCutoutCompat localDisplayCutoutCompat = new androidx/core/view/DisplayCutoutCompat;
      localDisplayCutoutCompat.<init>(paramDisplayCutout);
      paramDisplayCutout = localDisplayCutoutCompat;
    }
    return paramDisplayCutout;
  }
  
  public DisplayCutout OooO00o()
  {
    return this.OooO00o;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      Object localObject = DisplayCutoutCompat.class;
      Class localClass = paramObject.getClass();
      if (localObject == localClass)
      {
        paramObject = (DisplayCutoutCompat)paramObject;
        localObject = this.OooO00o;
        paramObject = paramObject.OooO00o;
        return ObjectsCompat.OooO00o(localObject, paramObject);
      }
    }
    return false;
  }
  
  public List getBoundingRects()
  {
    return DisplayCutoutCompat.Api28Impl.OooO0O0(this.OooO00o);
  }
  
  public int getSafeInsetBottom()
  {
    return DisplayCutoutCompat.Api28Impl.OooO0OO(this.OooO00o);
  }
  
  public int getSafeInsetLeft()
  {
    return DisplayCutoutCompat.Api28Impl.OooO0Oo(this.OooO00o);
  }
  
  public int getSafeInsetRight()
  {
    return DisplayCutoutCompat.Api28Impl.OooO0o0(this.OooO00o);
  }
  
  public int getSafeInsetTop()
  {
    return DisplayCutoutCompat.Api28Impl.OooO0o(this.OooO00o);
  }
  
  public Insets getWaterfallInsets()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      return Insets.OooO0Oo(DisplayCutoutCompat.Api30Impl.OooO0O0(this.OooO00o));
    }
    return Insets.OooO0o0;
  }
  
  public int hashCode()
  {
    DisplayCutout localDisplayCutout = this.OooO00o;
    int i;
    if (localDisplayCutout == null)
    {
      i = 0;
      localDisplayCutout = null;
    }
    else
    {
      i = localDisplayCutout.hashCode();
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("DisplayCutoutCompat{");
    DisplayCutout localDisplayCutout = this.OooO00o;
    localStringBuilder.append(localDisplayCutout);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.DisplayCutoutCompat
 * JD-Core Version:    0.7.0.1
 */