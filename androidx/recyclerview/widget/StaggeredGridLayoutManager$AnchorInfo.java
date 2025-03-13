package androidx.recyclerview.widget;

import java.util.Arrays;

class StaggeredGridLayoutManager$AnchorInfo
{
  public int OooO00o;
  public int OooO0O0;
  public boolean OooO0OO;
  public boolean OooO0Oo;
  public int[] OooO0o;
  public boolean OooO0o0;
  
  public StaggeredGridLayoutManager$AnchorInfo(StaggeredGridLayoutManager paramStaggeredGridLayoutManager)
  {
    OooO0OO();
  }
  
  public void OooO00o()
  {
    boolean bool = this.OooO0OO;
    OrientationHelper localOrientationHelper;
    int i;
    if (bool)
    {
      localOrientationHelper = this.OooO0oO.OooO0OO;
      i = localOrientationHelper.getEndAfterPadding();
    }
    else
    {
      localOrientationHelper = this.OooO0oO.OooO0OO;
      i = localOrientationHelper.getStartAfterPadding();
    }
    this.OooO0O0 = i;
  }
  
  public void OooO0O0(int paramInt)
  {
    boolean bool = this.OooO0OO;
    OrientationHelper localOrientationHelper;
    int i;
    if (bool)
    {
      localOrientationHelper = this.OooO0oO.OooO0OO;
      i = localOrientationHelper.getEndAfterPadding() - paramInt;
    }
    else
    {
      localOrientationHelper = this.OooO0oO.OooO0OO;
      i = localOrientationHelper.getStartAfterPadding() + paramInt;
    }
    this.OooO0O0 = i;
  }
  
  public void OooO0OO()
  {
    int i = -1;
    this.OooO00o = i;
    this.OooO0O0 = (-1 << -1);
    this.OooO0OO = false;
    this.OooO0Oo = false;
    this.OooO0o0 = false;
    int[] arrayOfInt = this.OooO0o;
    if (arrayOfInt != null) {
      Arrays.fill(arrayOfInt, i);
    }
  }
  
  public void OooO0Oo(StaggeredGridLayoutManager.Span[] paramArrayOfSpan)
  {
    int i = paramArrayOfSpan.length;
    int[] arrayOfInt1 = this.OooO0o;
    if (arrayOfInt1 != null)
    {
      j = arrayOfInt1.length;
      if (j >= i) {}
    }
    else
    {
      j = this.OooO0oO.OooO0O0.length;
      arrayOfInt1 = new int[j];
      this.OooO0o = arrayOfInt1;
    }
    int j = 0;
    arrayOfInt1 = null;
    while (j < i)
    {
      int[] arrayOfInt2 = this.OooO0o;
      StaggeredGridLayoutManager.Span localSpan = paramArrayOfSpan[j];
      int k = -1 << -1;
      int m = localSpan.getStartLine(k);
      arrayOfInt2[j] = m;
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo
 * JD-Core Version:    0.7.0.1
 */