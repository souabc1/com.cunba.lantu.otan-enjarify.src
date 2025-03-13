package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

public class RecyclerView$SmoothScroller$Action
{
  public int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo = -1;
  public boolean OooO0o = false;
  public Interpolator OooO0o0;
  public int OooO0oO = 0;
  
  public RecyclerView$SmoothScroller$Action(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, -1 << -1, null);
  }
  
  public RecyclerView$SmoothScroller$Action(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    this.OooO00o = paramInt1;
    this.OooO0O0 = paramInt2;
    this.OooO0OO = paramInt3;
    this.OooO0o0 = paramInterpolator;
  }
  
  public boolean OooO00o()
  {
    int i = this.OooO0Oo;
    if (i >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void OooO0O0(int paramInt)
  {
    this.OooO0Oo = paramInt;
  }
  
  public void OooO0OO(RecyclerView paramRecyclerView)
  {
    int i = this.OooO0Oo;
    if (i >= 0)
    {
      this.OooO0Oo = -1;
      paramRecyclerView.jumpToPositionForSmoothScroller(i);
      this.OooO0o = false;
      return;
    }
    boolean bool = this.OooO0o;
    if (bool)
    {
      OooO0o0();
      paramRecyclerView = paramRecyclerView.mViewFlinger;
      int j = this.OooO00o;
      int k = this.OooO0O0;
      int m = this.OooO0OO;
      Interpolator localInterpolator = this.OooO0o0;
      paramRecyclerView.OooO0o0(j, k, m, localInterpolator);
      int n = this.OooO0oO + 1;
      this.OooO0oO = n;
      this.OooO0o = false;
    }
    else
    {
      this.OooO0oO = 0;
    }
  }
  
  public void OooO0Oo(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    this.OooO00o = paramInt1;
    this.OooO0O0 = paramInt2;
    this.OooO0OO = paramInt3;
    this.OooO0o0 = paramInterpolator;
    this.OooO0o = true;
  }
  
  public final void OooO0o0()
  {
    Object localObject = this.OooO0o0;
    int i = 1;
    if (localObject != null)
    {
      j = this.OooO0OO;
      if (j < i)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("If you provide an interpolator, you must set a positive duration");
        throw ((Throwable)localObject);
      }
    }
    int j = this.OooO0OO;
    if (j >= i) {
      return;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Scroll duration must be a positive number");
    throw ((Throwable)localObject);
  }
  
  public int getDuration()
  {
    return this.OooO0OO;
  }
  
  public int getDx()
  {
    return this.OooO00o;
  }
  
  public int getDy()
  {
    return this.OooO0O0;
  }
  
  public Interpolator getInterpolator()
  {
    return this.OooO0o0;
  }
  
  public void setDuration(int paramInt)
  {
    this.OooO0o = true;
    this.OooO0OO = paramInt;
  }
  
  public void setDx(int paramInt)
  {
    this.OooO0o = true;
    this.OooO00o = paramInt;
  }
  
  public void setDy(int paramInt)
  {
    this.OooO0o = true;
    this.OooO0O0 = paramInt;
  }
  
  public void setInterpolator(Interpolator paramInterpolator)
  {
    this.OooO0o = true;
    this.OooO0o0 = paramInterpolator;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
 * JD-Core Version:    0.7.0.1
 */