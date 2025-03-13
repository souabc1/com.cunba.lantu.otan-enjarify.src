package androidx.recyclerview.widget;

class DiffUtil$Diagonal
{
  public final int OooO00o;
  public final int OooO0O0;
  public final int OooO0OO;
  
  public DiffUtil$Diagonal(int paramInt1, int paramInt2, int paramInt3)
  {
    this.OooO00o = paramInt1;
    this.OooO0O0 = paramInt2;
    this.OooO0OO = paramInt3;
  }
  
  public int OooO00o()
  {
    int i = this.OooO00o;
    int j = this.OooO0OO;
    return i + j;
  }
  
  public int OooO0O0()
  {
    int i = this.OooO0O0;
    int j = this.OooO0OO;
    return i + j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.Diagonal
 * JD-Core Version:    0.7.0.1
 */