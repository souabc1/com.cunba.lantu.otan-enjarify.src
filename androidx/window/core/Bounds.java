package androidx.window.core;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

public final class Bounds
{
  public final int OooO00o;
  public final int OooO0O0;
  public final int OooO0OO;
  public final int OooO0Oo;
  
  public Bounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.OooO00o = paramInt1;
    this.OooO0O0 = paramInt2;
    this.OooO0OO = paramInt3;
    this.OooO0Oo = paramInt4;
  }
  
  public Bounds(Rect paramRect)
  {
    this(i, j, k, m);
  }
  
  public final Rect OooO00o()
  {
    Rect localRect = new android/graphics/Rect;
    int i = this.OooO00o;
    int j = this.OooO0O0;
    int k = this.OooO0OO;
    int m = this.OooO0Oo;
    localRect.<init>(i, j, k, m);
    return localRect;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    Bounds localBounds = Bounds.class;
    if (paramObject == null) {
      localClass = null;
    } else {
      localClass = paramObject.getClass();
    }
    boolean bool2 = Intrinsics.OooO00o(localBounds, localClass);
    Class localClass = null;
    if (!bool2) {
      return false;
    }
    if (paramObject != null)
    {
      paramObject = (Bounds)paramObject;
      int i = this.OooO00o;
      int j = paramObject.OooO00o;
      if (i != j) {
        return false;
      }
      i = this.OooO0O0;
      j = paramObject.OooO0O0;
      if (i != j) {
        return false;
      }
      i = this.OooO0OO;
      j = paramObject.OooO0OO;
      if (i != j) {
        return false;
      }
      i = this.OooO0Oo;
      int k = paramObject.OooO0Oo;
      if (i != k) {
        return false;
      }
      return bool1;
    }
    paramObject = new java/lang/NullPointerException;
    paramObject.<init>("null cannot be cast to non-null type androidx.window.core.Bounds");
    throw paramObject;
  }
  
  public final int getBottom()
  {
    return this.OooO0Oo;
  }
  
  public final int getHeight()
  {
    int i = this.OooO0Oo;
    int j = this.OooO0O0;
    return i - j;
  }
  
  public final int getLeft()
  {
    return this.OooO00o;
  }
  
  public final int getRight()
  {
    return this.OooO0OO;
  }
  
  public final int getTop()
  {
    return this.OooO0O0;
  }
  
  public final int getWidth()
  {
    int i = this.OooO0OO;
    int j = this.OooO00o;
    return i - j;
  }
  
  public int hashCode()
  {
    int i = this.OooO00o * 31;
    int j = this.OooO0O0;
    i = (i + j) * 31;
    j = this.OooO0OO;
    i = (i + j) * 31;
    j = this.OooO0Oo;
    return i + j;
  }
  
  public final boolean isEmpty()
  {
    int i = getHeight();
    if (i != 0)
    {
      i = getWidth();
      if (i != 0) {
        return 0;
      }
    }
    i = 1;
    return i;
  }
  
  public final boolean isZero()
  {
    int i = getHeight();
    if (i == 0)
    {
      i = getWidth();
      if (i == 0) {
        return 1;
      }
    }
    i = 0;
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = Bounds.class.getSimpleName();
    localStringBuilder.append(str);
    localStringBuilder.append(" { [");
    int i = this.OooO00o;
    localStringBuilder.append(i);
    i = 44;
    localStringBuilder.append(i);
    int k = this.OooO0O0;
    localStringBuilder.append(k);
    localStringBuilder.append(i);
    k = this.OooO0OO;
    localStringBuilder.append(k);
    localStringBuilder.append(i);
    int j = this.OooO0Oo;
    localStringBuilder.append(j);
    localStringBuilder.append("] }");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.core.Bounds
 * JD-Core Version:    0.7.0.1
 */