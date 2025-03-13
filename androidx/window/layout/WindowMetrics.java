package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import kotlin.jvm.internal.Intrinsics;

public final class WindowMetrics
{
  public final Bounds OooO00o;
  
  public WindowMetrics(Rect paramRect)
  {
    this(localBounds);
  }
  
  public WindowMetrics(Bounds paramBounds)
  {
    this.OooO00o = paramBounds;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      Object localObject = WindowMetrics.class;
      Class localClass = paramObject.getClass();
      boolean bool = Intrinsics.OooO00o(localObject, localClass);
      if (bool)
      {
        paramObject = (WindowMetrics)paramObject;
        localObject = this.OooO00o;
        paramObject = paramObject.OooO00o;
        return Intrinsics.OooO00o(localObject, paramObject);
      }
    }
    return false;
  }
  
  public final Rect getBounds()
  {
    return this.OooO00o.OooO00o();
  }
  
  public int hashCode()
  {
    return this.OooO00o.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("WindowMetrics { bounds: ");
    Rect localRect = getBounds();
    localStringBuilder.append(localRect);
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.WindowMetrics
 * JD-Core Version:    0.7.0.1
 */