package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

public final class NavOptions
{
  public final int OooO;
  public final boolean OooO00o;
  public final boolean OooO0O0;
  public final int OooO0OO;
  public final boolean OooO0Oo;
  public final int OooO0o;
  public final boolean OooO0o0;
  public final int OooO0oO;
  public final int OooO0oo;
  public String OooOO0;
  
  public NavOptions(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, boolean paramBoolean3, boolean paramBoolean4, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.OooO00o = paramBoolean1;
    this.OooO0O0 = paramBoolean2;
    this.OooO0OO = paramInt1;
    this.OooO0Oo = paramBoolean3;
    this.OooO0o0 = paramBoolean4;
    this.OooO0o = paramInt2;
    this.OooO0oO = paramInt3;
    this.OooO0oo = paramInt4;
    this.OooO = paramInt5;
  }
  
  public NavOptions(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, boolean paramBoolean4, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramBoolean1, paramBoolean2, i, paramBoolean3, paramBoolean4, paramInt1, paramInt2, paramInt3, paramInt4);
    this.OooOO0 = paramString;
  }
  
  public final boolean OooO00o()
  {
    return this.OooO00o;
  }
  
  public final boolean OooO0O0()
  {
    return this.OooO0o0;
  }
  
  public final boolean OooO0OO()
  {
    return this.OooO0O0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    if (paramObject != null)
    {
      Object localObject1 = NavOptions.class;
      Object localObject2 = paramObject.getClass();
      boolean bool2 = Intrinsics.OooO00o(localObject1, localObject2);
      if (bool2)
      {
        paramObject = (NavOptions)paramObject;
        bool2 = this.OooO00o;
        boolean bool4 = paramObject.OooO00o;
        if (bool2 == bool4)
        {
          bool2 = this.OooO0O0;
          bool4 = paramObject.OooO0O0;
          if (bool2 == bool4)
          {
            int i = this.OooO0OO;
            int k = paramObject.OooO0OO;
            if (i == k)
            {
              localObject1 = this.OooOO0;
              localObject2 = paramObject.OooOO0;
              boolean bool3 = Intrinsics.OooO00o(localObject1, localObject2);
              if (bool3)
              {
                bool3 = this.OooO0Oo;
                boolean bool5 = paramObject.OooO0Oo;
                if (bool3 == bool5)
                {
                  bool3 = this.OooO0o0;
                  bool5 = paramObject.OooO0o0;
                  if (bool3 == bool5)
                  {
                    int j = this.OooO0o;
                    int m = paramObject.OooO0o;
                    if (j == m)
                    {
                      j = this.OooO0oO;
                      m = paramObject.OooO0oO;
                      if (j == m)
                      {
                        j = this.OooO0oo;
                        m = paramObject.OooO0oo;
                        if (j == m)
                        {
                          j = this.OooO;
                          int n = paramObject.OooO;
                          if (j == n) {
                            break label243;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        bool1 = false;
        label243:
        return bool1;
      }
    }
    return false;
  }
  
  public final int getEnterAnim()
  {
    return this.OooO0o;
  }
  
  public final int getExitAnim()
  {
    return this.OooO0oO;
  }
  
  public final int getPopEnterAnim()
  {
    return this.OooO0oo;
  }
  
  public final int getPopExitAnim()
  {
    return this.OooO;
  }
  
  public final int getPopUpTo()
  {
    return this.OooO0OO;
  }
  
  public final int getPopUpToId()
  {
    return this.OooO0OO;
  }
  
  public final String getPopUpToRoute()
  {
    return this.OooOO0;
  }
  
  public int hashCode()
  {
    int i = OooO00o() * true;
    int j = OooO0OO();
    i = (i + j) * 31;
    int k = this.OooO0OO;
    i = (i + k) * 31;
    String str = this.OooOO0;
    int m;
    if (str != null)
    {
      m = str.hashCode();
    }
    else
    {
      m = 0;
      str = null;
    }
    i = (i + m) * 31;
    int n = isPopUpToInclusive();
    i = (i + n) * 31;
    int i1 = OooO0O0();
    i = (i + i1) * 31;
    int i2 = this.OooO0o;
    i = (i + i2) * 31;
    int i3 = this.OooO0oO;
    i = (i + i3) * 31;
    int i4 = this.OooO0oo;
    i = (i + i4) * 31;
    int i5 = this.OooO;
    return i + i5;
  }
  
  public final boolean isPopUpToInclusive()
  {
    return this.OooO0Oo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavOptions
 * JD-Core Version:    0.7.0.1
 */