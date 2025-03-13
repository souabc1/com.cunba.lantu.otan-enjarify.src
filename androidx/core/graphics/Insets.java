package androidx.core.graphics;

import android.graphics.Rect;
import androidx.appcompat.widget.OooO;
import androidx.appcompat.widget.OooO0OO;
import androidx.appcompat.widget.OooO0o;
import androidx.appcompat.widget.OooOO0;

public final class Insets
{
  public static final Insets OooO0o0;
  public final int OooO00o;
  public final int OooO0O0;
  public final int OooO0OO;
  public final int OooO0Oo;
  
  static
  {
    Insets localInsets = new androidx/core/graphics/Insets;
    localInsets.<init>(0, 0, 0, 0);
    OooO0o0 = localInsets;
  }
  
  public Insets(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.OooO00o = paramInt1;
    this.OooO0O0 = paramInt2;
    this.OooO0OO = paramInt3;
    this.OooO0Oo = paramInt4;
  }
  
  public static Insets OooO00o(Insets paramInsets1, Insets paramInsets2)
  {
    int i = paramInsets1.OooO00o;
    int j = paramInsets2.OooO00o;
    i = Math.max(i, j);
    j = paramInsets1.OooO0O0;
    int k = paramInsets2.OooO0O0;
    j = Math.max(j, k);
    k = paramInsets1.OooO0OO;
    int m = paramInsets2.OooO0OO;
    k = Math.max(k, m);
    int n = paramInsets1.OooO0Oo;
    int i1 = paramInsets2.OooO0Oo;
    n = Math.max(n, i1);
    return OooO0O0(i, j, k, n);
  }
  
  public static Insets OooO0O0(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0)) {
      return OooO0o0;
    }
    Insets localInsets = new androidx/core/graphics/Insets;
    localInsets.<init>(paramInt1, paramInt2, paramInt3, paramInt4);
    return localInsets;
  }
  
  public static Insets OooO0OO(Rect paramRect)
  {
    int i = paramRect.left;
    int j = paramRect.top;
    int k = paramRect.right;
    int m = paramRect.bottom;
    return OooO0O0(i, j, k, m);
  }
  
  public static Insets OooO0Oo(android.graphics.Insets paramInsets)
  {
    int i = OooO0OO.OooO00o(paramInsets);
    int j = OooO0o.OooO00o(paramInsets);
    int k = OooO.OooO00o(paramInsets);
    int m = OooOO0.OooO00o(paramInsets);
    return OooO0O0(i, j, k, m);
  }
  
  public android.graphics.Insets OooO0o0()
  {
    int i = this.OooO00o;
    int j = this.OooO0O0;
    int k = this.OooO0OO;
    int m = this.OooO0Oo;
    return Insets.Api29Impl.OooO00o(i, j, k, m);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return bool;
    }
    if (paramObject != null)
    {
      Insets localInsets = Insets.class;
      Class localClass = paramObject.getClass();
      if (localInsets == localClass)
      {
        paramObject = (Insets)paramObject;
        int i = this.OooO0Oo;
        int j = paramObject.OooO0Oo;
        if (i != j) {
          return false;
        }
        i = this.OooO00o;
        j = paramObject.OooO00o;
        if (i != j) {
          return false;
        }
        i = this.OooO0OO;
        j = paramObject.OooO0OO;
        if (i != j) {
          return false;
        }
        i = this.OooO0O0;
        int k = paramObject.OooO0O0;
        if (i != k) {
          return false;
        }
        return bool;
      }
    }
    return false;
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
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Insets{left=");
    int i = this.OooO00o;
    localStringBuilder.append(i);
    localStringBuilder.append(", top=");
    i = this.OooO0O0;
    localStringBuilder.append(i);
    localStringBuilder.append(", right=");
    i = this.OooO0OO;
    localStringBuilder.append(i);
    localStringBuilder.append(", bottom=");
    i = this.OooO0Oo;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.Insets
 * JD-Core Version:    0.7.0.1
 */