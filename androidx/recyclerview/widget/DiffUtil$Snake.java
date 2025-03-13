package androidx.recyclerview.widget;

class DiffUtil$Snake
{
  public int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public boolean OooO0o0;
  
  public int OooO00o()
  {
    int i = this.OooO0OO;
    int j = this.OooO00o;
    i -= j;
    j = this.OooO0Oo;
    int k = this.OooO0O0;
    j -= k;
    return Math.min(i, j);
  }
  
  public boolean OooO0O0()
  {
    int i = this.OooO0Oo;
    int j = this.OooO0O0;
    i -= j;
    int k = this.OooO0OO;
    int m = this.OooO00o;
    k -= m;
    if (i != k) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public DiffUtil.Diagonal OooO0OO()
  {
    boolean bool = OooO0O0();
    if (bool)
    {
      bool = this.OooO0o0;
      if (bool)
      {
        localDiagonal = new androidx/recyclerview/widget/DiffUtil$Diagonal;
        i = this.OooO00o;
        j = this.OooO0O0;
        k = OooO00o();
        localDiagonal.<init>(i, j, k);
        return localDiagonal;
      }
      bool = isAddition();
      if (bool)
      {
        localDiagonal = new androidx/recyclerview/widget/DiffUtil$Diagonal;
        i = this.OooO00o;
        j = this.OooO0O0 + 1;
        k = OooO00o();
        localDiagonal.<init>(i, j, k);
        return localDiagonal;
      }
      localDiagonal = new androidx/recyclerview/widget/DiffUtil$Diagonal;
      i = this.OooO00o + 1;
      j = this.OooO0O0;
      k = OooO00o();
      localDiagonal.<init>(i, j, k);
      return localDiagonal;
    }
    DiffUtil.Diagonal localDiagonal = new androidx/recyclerview/widget/DiffUtil$Diagonal;
    int i = this.OooO00o;
    int j = this.OooO0O0;
    int k = this.OooO0OO - i;
    localDiagonal.<init>(i, j, k);
    return localDiagonal;
  }
  
  public boolean isAddition()
  {
    int i = this.OooO0Oo;
    int j = this.OooO0O0;
    i -= j;
    int k = this.OooO0OO;
    int m = this.OooO00o;
    k -= m;
    if (i > k) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.Snake
 * JD-Core Version:    0.7.0.1
 */