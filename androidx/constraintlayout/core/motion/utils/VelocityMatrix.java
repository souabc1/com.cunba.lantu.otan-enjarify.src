package androidx.constraintlayout.core.motion.utils;

public class VelocityMatrix
{
  public float OooO00o;
  public float OooO0O0;
  public float OooO0OO;
  public float OooO0Oo;
  public float OooO0o;
  public float OooO0o0;
  
  public void OooO00o(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float[] paramArrayOfFloat)
  {
    float f1 = paramArrayOfFloat[0];
    int i = 1;
    float f2 = paramArrayOfFloat[i];
    float f3 = 0.5F;
    float f4 = paramFloat1 - f3;
    float f5 = 2.0F;
    f4 *= f5;
    f3 = (paramFloat2 - f3) * f5;
    f5 = this.OooO0OO;
    f1 += f5;
    f5 = this.OooO0Oo;
    f2 += f5;
    f5 = this.OooO00o * f4;
    f1 += f5;
    f5 = this.OooO0O0 * f3;
    f2 += f5;
    f5 = (float)Math.toRadians(this.OooO0o);
    float f6 = (float)Math.toRadians(this.OooO0o0);
    double d1 = -paramInt1 * f4;
    double d2 = f5;
    double d3 = Math.sin(d2);
    d1 *= d3;
    d3 = paramInt2 * f3;
    double d4 = Math.cos(d2) * d3;
    f3 = (float)(d1 - d4) * f6;
    f1 += f3;
    double d5 = paramInt1 * f4;
    d1 = Math.cos(d2);
    d5 *= d1;
    d1 = Math.sin(d2);
    d3 *= d1;
    float f7 = (float)(d5 - d3);
    f6 *= f7;
    f2 += f6;
    paramArrayOfFloat[0] = f1;
    paramArrayOfFloat[i] = f2;
  }
  
  public void OooO0O0()
  {
    this.OooO0o0 = 0.0F;
    this.OooO0Oo = 0.0F;
    this.OooO0OO = 0.0F;
    this.OooO0O0 = 0.0F;
    this.OooO00o = 0.0F;
  }
  
  public void OooO0OO(KeyCycleOscillator paramKeyCycleOscillator, float paramFloat)
  {
    if (paramKeyCycleOscillator != null)
    {
      float f = paramKeyCycleOscillator.OooO0O0(paramFloat);
      this.OooO0o0 = f;
    }
  }
  
  public void OooO0Oo(SplineSet paramSplineSet, float paramFloat)
  {
    if (paramSplineSet != null)
    {
      float f1 = paramSplineSet.OooO0O0(paramFloat);
      this.OooO0o0 = f1;
      float f2 = paramSplineSet.OooO00o(paramFloat);
      this.OooO0o = f2;
    }
  }
  
  public void OooO0o(SplineSet paramSplineSet1, SplineSet paramSplineSet2, float paramFloat)
  {
    float f;
    if (paramSplineSet1 != null)
    {
      f = paramSplineSet1.OooO0O0(paramFloat);
      this.OooO00o = f;
    }
    if (paramSplineSet2 != null)
    {
      f = paramSplineSet2.OooO0O0(paramFloat);
      this.OooO0O0 = f;
    }
  }
  
  public void OooO0o0(KeyCycleOscillator paramKeyCycleOscillator1, KeyCycleOscillator paramKeyCycleOscillator2, float paramFloat)
  {
    float f;
    if (paramKeyCycleOscillator1 != null)
    {
      f = paramKeyCycleOscillator1.OooO0O0(paramFloat);
      this.OooO00o = f;
    }
    if (paramKeyCycleOscillator2 != null)
    {
      f = paramKeyCycleOscillator2.OooO0O0(paramFloat);
      this.OooO0O0 = f;
    }
  }
  
  public void OooO0oO(KeyCycleOscillator paramKeyCycleOscillator1, KeyCycleOscillator paramKeyCycleOscillator2, float paramFloat)
  {
    float f;
    if (paramKeyCycleOscillator1 != null)
    {
      f = paramKeyCycleOscillator1.OooO0O0(paramFloat);
      this.OooO0OO = f;
    }
    if (paramKeyCycleOscillator2 != null)
    {
      f = paramKeyCycleOscillator2.OooO0O0(paramFloat);
      this.OooO0Oo = f;
    }
  }
  
  public void OooO0oo(SplineSet paramSplineSet1, SplineSet paramSplineSet2, float paramFloat)
  {
    float f;
    if (paramSplineSet1 != null)
    {
      f = paramSplineSet1.OooO0O0(paramFloat);
      this.OooO0OO = f;
    }
    if (paramSplineSet2 != null)
    {
      f = paramSplineSet2.OooO0O0(paramFloat);
      this.OooO0Oo = f;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.VelocityMatrix
 * JD-Core Version:    0.7.0.1
 */