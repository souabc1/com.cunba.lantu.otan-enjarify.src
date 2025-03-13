package androidx.navigation;

public final class NavOptions$Builder
{
  public int OooO;
  public boolean OooO00o;
  public boolean OooO0O0;
  public int OooO0OO;
  public String OooO0Oo;
  public boolean OooO0o;
  public boolean OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  public int OooOO0;
  
  public NavOptions$Builder()
  {
    int i = -1;
    this.OooO0OO = i;
    this.OooO0oO = i;
    this.OooO0oo = i;
    this.OooO = i;
    this.OooOO0 = i;
  }
  
  public final NavOptions OooO00o()
  {
    String str = this.OooO0Oo;
    NavOptions localNavOptions = new androidx/navigation/NavOptions;
    boolean bool1;
    if (str != null)
    {
      bool1 = this.OooO00o;
      boolean bool2 = this.OooO0O0;
      boolean bool3 = this.OooO0o0;
      boolean bool4 = this.OooO0o;
      int m = this.OooO0oO;
      int n = this.OooO0oo;
      int i1 = this.OooO;
      int i2 = this.OooOO0;
      localNavOptions.<init>(bool1, bool2, str, bool3, bool4, m, n, i1, i2);
    }
    else
    {
      boolean bool5 = this.OooO00o;
      boolean bool6 = this.OooO0O0;
      int i3 = this.OooO0OO;
      boolean bool7 = this.OooO0o0;
      bool1 = this.OooO0o;
      int i = this.OooO0oO;
      int i4 = this.OooO0oo;
      int j = this.OooO;
      int k = this.OooOO0;
      localNavOptions.<init>(bool5, bool6, i3, bool7, bool1, i, i4, j, k);
    }
    return localNavOptions;
  }
  
  public final Builder OooO0O0(int paramInt)
  {
    this.OooO0oO = paramInt;
    return this;
  }
  
  public final Builder OooO0OO(int paramInt)
  {
    this.OooO0oo = paramInt;
    return this;
  }
  
  public final Builder OooO0Oo(boolean paramBoolean)
  {
    this.OooO00o = paramBoolean;
    return this;
  }
  
  public final Builder OooO0o(int paramInt)
  {
    this.OooOO0 = paramInt;
    return this;
  }
  
  public final Builder OooO0o0(int paramInt)
  {
    this.OooO = paramInt;
    return this;
  }
  
  public final Builder OooO0oO(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.OooO0OO = paramInt;
    this.OooO0Oo = null;
    this.OooO0o0 = paramBoolean1;
    this.OooO0o = paramBoolean2;
    return this;
  }
  
  public final Builder OooO0oo(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.OooO0Oo = paramString;
    this.OooO0OO = -1;
    this.OooO0o0 = paramBoolean1;
    this.OooO0o = paramBoolean2;
    return this;
  }
  
  public final Builder OooOO0(boolean paramBoolean)
  {
    this.OooO0O0 = paramBoolean;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavOptions.Builder
 * JD-Core Version:    0.7.0.1
 */