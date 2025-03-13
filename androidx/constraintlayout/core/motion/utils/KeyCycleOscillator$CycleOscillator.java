package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

class KeyCycleOscillator$CycleOscillator
{
  public float[] OooO;
  public final int OooO00o;
  public Oscillator OooO0O0;
  public final int OooO0OO;
  public final int OooO0Oo;
  public float[] OooO0o;
  public final int OooO0o0;
  public double[] OooO0oO;
  public float[] OooO0oo;
  public float[] OooOO0;
  public float[] OooOO0O;
  public int OooOO0o;
  public double[] OooOOO;
  public CurveFit OooOOO0;
  public double[] OooOOOO;
  public float OooOOOo;
  
  public KeyCycleOscillator$CycleOscillator(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    Oscillator localOscillator = new androidx/constraintlayout/core/motion/utils/Oscillator;
    localOscillator.<init>();
    this.OooO0O0 = localOscillator;
    this.OooO0OO = 0;
    this.OooO0Oo = 1;
    this.OooO0o0 = 2;
    this.OooOO0o = paramInt1;
    this.OooO00o = paramInt2;
    localOscillator.setType(paramInt1, paramString);
    Object localObject = new float[paramInt3];
    this.OooO0o = ((float[])localObject);
    localObject = new double[paramInt3];
    this.OooO0oO = ((double[])localObject);
    localObject = new float[paramInt3];
    this.OooO0oo = ((float[])localObject);
    localObject = new float[paramInt3];
    this.OooO = ((float[])localObject);
    localObject = new float[paramInt3];
    this.OooOO0 = ((float[])localObject);
    localObject = new float[paramInt3];
    this.OooOO0O = ((float[])localObject);
  }
  
  public double OooO00o(float paramFloat)
  {
    Object localObject = this.OooOOO0;
    int i = 2;
    int j = 1;
    double d1;
    if (localObject != null)
    {
      d1 = paramFloat;
      double[] arrayOfDouble1 = this.OooOOOO;
      ((CurveFit)localObject).OooO0oO(d1, arrayOfDouble1);
      localObject = this.OooOOO0;
      arrayOfDouble1 = this.OooOOO;
      ((CurveFit)localObject).OooO0Oo(d1, arrayOfDouble1);
    }
    else
    {
      localObject = this.OooOOOO;
      d1 = 0.0D;
      localObject[0] = d1;
      localObject[j] = d1;
      localObject[i] = d1;
    }
    localObject = this.OooO0O0;
    double d2 = paramFloat;
    double d3 = this.OooOOO[j];
    double d4 = ((Oscillator)localObject).OooO0o0(d2, d3);
    Oscillator localOscillator = this.OooO0O0;
    d3 = this.OooOOO[j];
    double d5 = this.OooOOOO[j];
    double d6 = localOscillator.OooO0Oo(d2, d3, d5);
    double[] arrayOfDouble2 = this.OooOOOO;
    double d7 = arrayOfDouble2[0];
    d2 = arrayOfDouble2[i];
    d4 *= d2;
    d7 += d4;
    d2 = this.OooOOO[i];
    d6 *= d2;
    return d7 + d6;
  }
  
  public double OooO0O0(float paramFloat)
  {
    Object localObject = this.OooOOO0;
    int i = 2;
    int j = 1;
    double d1;
    if (localObject != null)
    {
      d1 = paramFloat;
      double[] arrayOfDouble = this.OooOOO;
      ((CurveFit)localObject).OooO0Oo(d1, arrayOfDouble);
    }
    else
    {
      localObject = this.OooOOO;
      d1 = this.OooO[0];
      localObject[0] = d1;
      d1 = this.OooOO0[0];
      localObject[j] = d1;
      float[] arrayOfFloat = this.OooO0o;
      float f = arrayOfFloat[0];
      d1 = f;
      localObject[i] = d1;
    }
    localObject = this.OooOOO;
    double d2 = localObject[0];
    double d3 = localObject[j];
    localObject = this.OooO0O0;
    double d4 = paramFloat;
    d3 = ((Oscillator)localObject).OooO0o0(d4, d3);
    double d5 = this.OooOOO[i];
    d3 *= d5;
    return d2 + d3;
  }
  
  public void OooO0OO(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    double[] arrayOfDouble = this.OooO0oO;
    double d = paramInt2 / 100.0D;
    arrayOfDouble[paramInt1] = d;
    this.OooO0oo[paramInt1] = paramFloat1;
    this.OooO[paramInt1] = paramFloat2;
    this.OooOO0[paramInt1] = paramFloat3;
    this.OooO0o[paramInt1] = paramFloat4;
  }
  
  public double getLastPhase()
  {
    return this.OooOOO[1];
  }
  
  public void setup(float paramFloat)
  {
    this.OooOOOo = paramFloat;
    int i = this.OooO0oO.length;
    Object localObject1 = { i, 3 };
    localObject1 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject1);
    Object localObject2 = this.OooO0o;
    int j = localObject2.length;
    int k = 2;
    double[] arrayOfDouble = new double[j + k];
    this.OooOOO = arrayOfDouble;
    localObject2 = new double[localObject2.length + k];
    this.OooOOOO = ((double[])localObject2);
    localObject2 = this.OooO0oO;
    j = 0;
    arrayOfDouble = null;
    double d1 = localObject2[0];
    double d2 = 0.0D;
    int m = d1 < d2;
    Object localObject3;
    float f1;
    if (m > 0)
    {
      localObject2 = this.OooO0O0;
      localObject3 = this.OooO0oo;
      f1 = localObject3[0];
      ((Oscillator)localObject2).OooO00o(d2, f1);
    }
    localObject2 = this.OooO0oO;
    int i1 = localObject2.length;
    int i2 = 1;
    i1 -= i2;
    d2 = localObject2[i1];
    double d3 = 1.0D;
    m = d2 < d3;
    Object localObject4;
    if (m < 0)
    {
      localObject2 = this.OooO0O0;
      localObject4 = this.OooO0oo;
      f1 = localObject4[i1];
      ((Oscillator)localObject2).OooO00o(d3, f1);
    }
    m = 0;
    localObject2 = null;
    for (;;)
    {
      i1 = localObject1.length;
      if (m >= i1) {
        break;
      }
      localObject3 = localObject1[m];
      d2 = this.OooO[m];
      localObject3[0] = d2;
      d2 = this.OooOO0[m];
      localObject3[i2] = d2;
      float f2 = this.OooO0o[m];
      d2 = f2;
      localObject3[k] = d2;
      localObject3 = this.OooO0O0;
      localObject4 = this.OooO0oO;
      d2 = localObject4[m];
      float[] arrayOfFloat = this.OooO0oo;
      float f3 = arrayOfFloat[m];
      ((Oscillator)localObject3).OooO00o(d2, f3);
      int n;
      m += 1;
    }
    this.OooO0O0.OooO0o();
    localObject2 = this.OooO0oO;
    k = localObject2.length;
    if (k > i2)
    {
      localObject1 = CurveFit.OooO00o(0, (double[])localObject2, (double[][])localObject1);
    }
    else
    {
      i = 0;
      paramFloat = 0.0F;
      localObject1 = null;
    }
    this.OooOOO0 = ((CurveFit)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator
 * JD-Core Version:    0.7.0.1
 */