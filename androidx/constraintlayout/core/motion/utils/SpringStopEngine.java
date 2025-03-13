package androidx.constraintlayout.core.motion.utils;

public class SpringStopEngine
  implements StopEngine
{
  public float OooO;
  public double OooO00o = 0.5D;
  public boolean OooO0O0 = false;
  public double OooO0OO;
  public double OooO0Oo;
  public float OooO0o;
  public double OooO0o0;
  public float OooO0oO;
  public float OooO0oo;
  public float OooOO0;
  public int OooOO0O = 0;
  
  public final void OooO00o(double paramDouble)
  {
    SpringStopEngine localSpringStopEngine = this;
    double d1 = this.OooO0OO;
    double d2 = this.OooO00o;
    float f1 = this.OooO;
    double d3 = f1;
    d3 = Math.sqrt(d1 / d3) * paramDouble * 4.0D;
    double d4 = 9.0D / d3;
    d3 = 1.0D;
    d4 += d3;
    int i = (int)d4;
    double d5 = i;
    d5 = paramDouble / d5;
    int j = 0;
    while (j < i)
    {
      float f2 = localSpringStopEngine.OooO0oO;
      double d6 = f2;
      double d7 = localSpringStopEngine.OooO0Oo;
      d6 -= d7;
      double d8 = -d1 * d6;
      float f3 = localSpringStopEngine.OooO0oo;
      double d9 = d1;
      d1 = f3 * d2;
      d8 -= d1;
      float f4 = localSpringStopEngine.OooO;
      double d10 = d2;
      double d11 = f4;
      d8 /= d11;
      d11 = f3;
      d8 *= d5;
      double d12 = 2.0D;
      d8 /= d12;
      d11 += d8;
      d8 = f2;
      double d13 = d5 * d11 / d12;
      d8 = d8 + d13 - d7;
      double d14 = -d8 * d9;
      d11 *= d2;
      d14 -= d11;
      d1 = f4;
      d14 = d14 / d1 * d5;
      d1 = f3;
      d2 = d14 / d12;
      d1 += d2;
      d2 = f3 + d14;
      float f5 = (float)d2;
      localSpringStopEngine.OooO0oo = f5;
      double d15 = f2;
      d1 *= d5;
      d15 += d1;
      f4 = (float)d15;
      localSpringStopEngine.OooO0oO = f4;
      int k = localSpringStopEngine.OooOO0O;
      if (k > 0)
      {
        boolean bool1 = f4 < 0.0F;
        if (bool1)
        {
          bool1 = k & 0x1;
          boolean bool2 = true;
          f2 = 1.4E-45F;
          if (bool1 == bool2)
          {
            f4 = -f4;
            localSpringStopEngine.OooO0oO = f4;
            f4 = -f5;
            localSpringStopEngine.OooO0oo = f4;
          }
        }
        f4 = localSpringStopEngine.OooO0oO;
        f5 = 1.0F;
        boolean bool3 = f4 < f5;
        if (bool3)
        {
          k &= 0x2;
          int m = 2;
          f5 = 2.802597E-045F;
          if (k == m)
          {
            k = 1073741824;
            float f6 = 2.0F - f4;
            localSpringStopEngine.OooO0oO = f6;
            f4 = -localSpringStopEngine.OooO0oo;
            localSpringStopEngine.OooO0oo = f4;
          }
        }
      }
      j += 1;
      d1 = d9;
      d2 = d10;
    }
  }
  
  public void OooO0O0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, int paramInt)
  {
    double d1 = paramFloat2;
    this.OooO0Oo = d1;
    d1 = paramFloat6;
    this.OooO00o = d1;
    this.OooO0O0 = false;
    this.OooO0oO = paramFloat1;
    double d2 = paramFloat3;
    this.OooO0o0 = d2;
    d2 = paramFloat5;
    this.OooO0OO = d2;
    this.OooO = paramFloat4;
    this.OooOO0 = paramFloat7;
    this.OooOO0O = paramInt;
    this.OooO0o = 0.0F;
  }
  
  public float getAcceleration()
  {
    double d1 = this.OooO0OO;
    double d2 = this.OooO00o;
    double d3 = this.OooO0oO;
    double d4 = this.OooO0Oo;
    d3 -= d4;
    d1 = -d1 * d3;
    d3 = this.OooO0oo;
    d2 *= d3;
    float f1 = (float)(d1 - d2);
    float f2 = this.OooO;
    return f1 / f2;
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f = this.OooO0o;
    double d = paramFloat - f;
    OooO00o(d);
    this.OooO0o = paramFloat;
    return this.OooO0oO;
  }
  
  public float getVelocity()
  {
    return 0.0F;
  }
  
  public boolean isStopped()
  {
    float f1 = this.OooO0oO;
    double d1 = f1;
    double d2 = this.OooO0Oo;
    d1 -= d2;
    d2 = this.OooO0OO;
    float f2 = this.OooO0oo;
    double d3 = f2;
    float f3 = this.OooO;
    double d4 = f3;
    d3 = d3 * d3 * d4;
    d4 = d2 * d1 * d1;
    d3 = (d3 + d4) / d2;
    d1 = Math.sqrt(d3);
    float f4 = this.OooOO0;
    d2 = f4;
    boolean bool = d1 < d2;
    if (!bool)
    {
      bool = true;
      f1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      f1 = 0.0F;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.SpringStopEngine
 * JD-Core Version:    0.7.0.1
 */