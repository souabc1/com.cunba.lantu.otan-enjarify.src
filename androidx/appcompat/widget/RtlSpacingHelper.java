package androidx.appcompat.widget;

class RtlSpacingHelper
{
  public int OooO00o = 0;
  public int OooO0O0 = 0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public boolean OooO0oO;
  public boolean OooO0oo;
  
  public RtlSpacingHelper()
  {
    int i = -1 << -1;
    this.OooO0OO = i;
    this.OooO0Oo = i;
    this.OooO0o0 = 0;
    this.OooO0o = 0;
    this.OooO0oO = false;
    this.OooO0oo = false;
  }
  
  public int getEnd()
  {
    boolean bool = this.OooO0oO;
    int i;
    if (bool) {
      i = this.OooO00o;
    } else {
      i = this.OooO0O0;
    }
    return i;
  }
  
  public int getLeft()
  {
    return this.OooO00o;
  }
  
  public int getRight()
  {
    return this.OooO0O0;
  }
  
  public int getStart()
  {
    boolean bool = this.OooO0oO;
    int i;
    if (bool) {
      i = this.OooO0O0;
    } else {
      i = this.OooO00o;
    }
    return i;
  }
  
  public void setAbsolute(int paramInt1, int paramInt2)
  {
    this.OooO0oo = false;
    int i = -1 << -1;
    if (paramInt1 != i)
    {
      this.OooO0o0 = paramInt1;
      this.OooO00o = paramInt1;
    }
    if (paramInt2 != i)
    {
      this.OooO0o = paramInt2;
      this.OooO0O0 = paramInt2;
    }
  }
  
  public void setDirection(boolean paramBoolean)
  {
    boolean bool1 = this.OooO0oO;
    if (paramBoolean == bool1) {
      return;
    }
    this.OooO0oO = paramBoolean;
    bool1 = this.OooO0oo;
    if (bool1)
    {
      boolean bool2 = -1 << -1;
      if (paramBoolean)
      {
        paramBoolean = this.OooO0Oo;
        if (paramBoolean == bool2) {
          paramBoolean = this.OooO0o0;
        }
        this.OooO00o = paramBoolean;
        paramBoolean = this.OooO0OO;
        if (paramBoolean != bool2) {
          break label120;
        }
      }
      else
      {
        paramBoolean = this.OooO0OO;
        if (paramBoolean == bool2) {
          paramBoolean = this.OooO0o0;
        }
        this.OooO00o = paramBoolean;
        paramBoolean = this.OooO0Oo;
        if (paramBoolean != bool2) {
          break label120;
        }
      }
    }
    else
    {
      paramBoolean = this.OooO0o0;
      this.OooO00o = paramBoolean;
    }
    paramBoolean = this.OooO0o;
    label120:
    this.OooO0O0 = paramBoolean;
  }
  
  public void setRelative(int paramInt1, int paramInt2)
  {
    this.OooO0OO = paramInt1;
    this.OooO0Oo = paramInt2;
    this.OooO0oo = true;
    boolean bool = this.OooO0oO;
    int i = -1 << -1;
    if (bool)
    {
      if (paramInt2 != i) {
        this.OooO00o = paramInt2;
      }
      if (paramInt1 != i) {
        this.OooO0O0 = paramInt1;
      }
    }
    else
    {
      if (paramInt1 != i) {
        this.OooO00o = paramInt1;
      }
      if (paramInt2 != i) {
        this.OooO0O0 = paramInt2;
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.RtlSpacingHelper
 * JD-Core Version:    0.7.0.1
 */