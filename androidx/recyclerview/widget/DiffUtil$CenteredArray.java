package androidx.recyclerview.widget;

class DiffUtil$CenteredArray
{
  public final int[] OooO00o;
  public final int OooO0O0;
  
  public DiffUtil$CenteredArray(int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    this.OooO00o = arrayOfInt;
    paramInt = arrayOfInt.length / 2;
    this.OooO0O0 = paramInt;
  }
  
  public int[] OooO00o()
  {
    return this.OooO00o;
  }
  
  public int get(int paramInt)
  {
    int[] arrayOfInt = this.OooO00o;
    int i = this.OooO0O0;
    paramInt += i;
    return arrayOfInt[paramInt];
  }
  
  public void set(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = this.OooO00o;
    int i = this.OooO0O0;
    paramInt1 += i;
    arrayOfInt[paramInt1] = paramInt2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.CenteredArray
 * JD-Core Version:    0.7.0.1
 */