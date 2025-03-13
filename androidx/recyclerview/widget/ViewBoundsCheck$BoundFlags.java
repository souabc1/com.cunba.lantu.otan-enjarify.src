package androidx.recyclerview.widget;

class ViewBoundsCheck$BoundFlags
{
  public int OooO00o = 0;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o0;
  
  public void OooO00o(int paramInt)
  {
    int i = this.OooO00o;
    paramInt |= i;
    this.OooO00o = paramInt;
  }
  
  public boolean OooO0O0()
  {
    int i = this.OooO00o;
    int j = i & 0x7;
    int k;
    if (j != 0)
    {
      j = this.OooO0Oo;
      k = this.OooO0O0;
      j = OooO0OO(j, k) << 0;
      i &= j;
      if (i == 0) {
        return false;
      }
    }
    i = this.OooO00o;
    j = i & 0x70;
    if (j != 0)
    {
      j = this.OooO0Oo;
      k = this.OooO0OO;
      j = OooO0OO(j, k) << 4;
      i &= j;
      if (i == 0) {
        return false;
      }
    }
    i = this.OooO00o;
    j = i & 0x700;
    if (j != 0)
    {
      j = this.OooO0o0;
      k = this.OooO0O0;
      j = OooO0OO(j, k) << 8;
      i &= j;
      if (i == 0) {
        return false;
      }
    }
    i = this.OooO00o;
    j = i & 0x7000;
    if (j != 0)
    {
      j = this.OooO0o0;
      k = this.OooO0OO;
      j = OooO0OO(j, k) << 12;
      i &= j;
      if (i == 0) {
        return false;
      }
    }
    return true;
  }
  
  public int OooO0OO(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {
      return 1;
    }
    if (paramInt1 == paramInt2) {
      return 2;
    }
    return 4;
  }
  
  public void OooO0Oo()
  {
    this.OooO00o = 0;
  }
  
  public void OooO0o0(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.OooO0O0 = paramInt1;
    this.OooO0OO = paramInt2;
    this.OooO0Oo = paramInt3;
    this.OooO0o0 = paramInt4;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ViewBoundsCheck.BoundFlags
 * JD-Core Version:    0.7.0.1
 */