package androidx.core.view;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

class WindowInsetsAnimationCompat$Impl
{
  public final int OooO00o;
  public float OooO0O0;
  public final Interpolator OooO0OO;
  public final long OooO0Oo;
  public float OooO0o0;
  
  public WindowInsetsAnimationCompat$Impl(int paramInt, Interpolator paramInterpolator, long paramLong)
  {
    this.OooO00o = paramInt;
    this.OooO0OO = paramInterpolator;
    this.OooO0Oo = paramLong;
  }
  
  public float getAlpha()
  {
    return this.OooO0o0;
  }
  
  public long getDurationMillis()
  {
    return this.OooO0Oo;
  }
  
  public float getFraction()
  {
    return this.OooO0O0;
  }
  
  public float getInterpolatedFraction()
  {
    Interpolator localInterpolator = this.OooO0OO;
    if (localInterpolator != null)
    {
      float f = this.OooO0O0;
      return localInterpolator.getInterpolation(f);
    }
    return this.OooO0O0;
  }
  
  public Interpolator getInterpolator()
  {
    return this.OooO0OO;
  }
  
  public int getTypeMask()
  {
    return this.OooO00o;
  }
  
  public void setAlpha(float paramFloat)
  {
    this.OooO0o0 = paramFloat;
  }
  
  public void setFraction(float paramFloat)
  {
    this.OooO0O0 = paramFloat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl
 * JD-Core Version:    0.7.0.1
 */