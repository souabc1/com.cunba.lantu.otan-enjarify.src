package androidx.core.widget;

import android.view.animation.AnimationUtils;

class AutoScrollHelper$ClampedScroller
{
  public long OooO = -1;
  public int OooO00o;
  public int OooO0O0;
  public float OooO0OO;
  public float OooO0Oo;
  public long OooO0o = 0L;
  public long OooO0o0 = -9223372036854775808L;
  public int OooO0oO = 0;
  public int OooO0oo = 0;
  public float OooOO0;
  public int OooOO0O;
  
  public void OooO00o()
  {
    long l1 = this.OooO0o;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      l1 = AnimationUtils.currentAnimationTimeMillis();
      float f1 = OooO0O0(l1);
      f1 = OooO0OO(f1);
      long l3 = this.OooO0o;
      l3 = l1 - l3;
      this.OooO0o = l1;
      float f2 = (float)l3 * f1;
      int j = (int)(this.OooO0OO * f2);
      this.OooO0oO = j;
      float f3 = this.OooO0Oo;
      int i = (int)(f2 * f3);
      this.OooO0oo = i;
      return;
    }
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    localRuntimeException.<init>("Cannot compute scroll delta before calling start()");
    throw localRuntimeException;
  }
  
  public final float OooO0O0(long paramLong)
  {
    long l1 = this.OooO0o0;
    boolean bool = paramLong < l1;
    if (bool) {
      return 0.0F;
    }
    long l2 = this.OooO;
    long l3 = 0L;
    bool = l2 < l3;
    float f1 = 1.0F;
    if (!bool)
    {
      bool = paramLong < l2;
      if (!bool)
      {
        paramLong -= l2;
        float f2 = this.OooOO0;
        float f3 = f1 - f2;
        f4 = (float)paramLong;
        f5 = this.OooOO0O;
        f4 = AutoScrollHelper.OooO0o0(f4 / f5, 0.0F, f1);
        f2 *= f4;
        return f3 + f2;
      }
    }
    float f4 = (float)(paramLong - l1);
    float f5 = this.OooO00o;
    return AutoScrollHelper.OooO0o0(f4 / f5, 0.0F, f1) * 0.5F;
  }
  
  public final float OooO0OO(float paramFloat)
  {
    float f = -4.0F * paramFloat * paramFloat;
    paramFloat *= 4.0F;
    return f + paramFloat;
  }
  
  public void OooO0Oo()
  {
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    long l2 = this.OooO0o0;
    int i = (int)(l1 - l2);
    int j = this.OooO0O0;
    i = AutoScrollHelper.OooO0o(i, 0, j);
    this.OooOO0O = i;
    float f = OooO0O0(l1);
    this.OooOO0 = f;
    this.OooO = l1;
  }
  
  public void OooO0o()
  {
    long l = AnimationUtils.currentAnimationTimeMillis();
    this.OooO0o0 = l;
    this.OooO = -1;
    this.OooO0o = l;
    this.OooOO0 = 0.5F;
    this.OooO0oO = 0;
    this.OooO0oo = 0;
  }
  
  public void OooO0o0(float paramFloat1, float paramFloat2)
  {
    this.OooO0OO = paramFloat1;
    this.OooO0Oo = paramFloat2;
  }
  
  public int getDeltaX()
  {
    return this.OooO0oO;
  }
  
  public int getDeltaY()
  {
    return this.OooO0oo;
  }
  
  public int getHorizontalDirection()
  {
    float f1 = this.OooO0OO;
    float f2 = Math.abs(f1);
    return (int)(f1 / f2);
  }
  
  public int getVerticalDirection()
  {
    float f1 = this.OooO0Oo;
    float f2 = Math.abs(f1);
    return (int)(f1 / f2);
  }
  
  public boolean isFinished()
  {
    long l1 = this.OooO;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      l1 = AnimationUtils.currentAnimationTimeMillis();
      l2 = this.OooO;
      int i = this.OooOO0O;
      long l3 = i;
      l2 += l3;
      bool = l1 < l2;
      if (bool)
      {
        bool = true;
        break label61;
      }
    }
    bool = false;
    label61:
    return bool;
  }
  
  public void setRampDownDuration(int paramInt)
  {
    this.OooO0O0 = paramInt;
  }
  
  public void setRampUpDuration(int paramInt)
  {
    this.OooO00o = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.AutoScrollHelper.ClampedScroller
 * JD-Core Version:    0.7.0.1
 */