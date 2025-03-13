package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class Oscillator
{
  public float[] OooO00o;
  public double[] OooO0O0;
  public double[] OooO0OO;
  public String OooO0Oo;
  public int OooO0o;
  public MonotonicCurveFit OooO0o0;
  public double OooO0oO;
  public boolean OooO0oo;
  
  public Oscillator()
  {
    Object localObject = new float[0];
    this.OooO00o = ((float[])localObject);
    localObject = new double[0];
    this.OooO0O0 = ((double[])localObject);
    this.OooO0oO = 6.283185307179586D;
    this.OooO0oo = false;
  }
  
  public void OooO00o(double paramDouble, float paramFloat)
  {
    float[] arrayOfFloat = this.OooO00o;
    int i = arrayOfFloat.length + 1;
    double[] arrayOfDouble = this.OooO0O0;
    int j = Arrays.binarySearch(arrayOfDouble, paramDouble);
    if (j < 0) {
      j = -j + -1;
    }
    Object localObject = Arrays.copyOf(this.OooO0O0, i);
    this.OooO0O0 = ((double[])localObject);
    localObject = Arrays.copyOf(this.OooO00o, i);
    this.OooO00o = ((float[])localObject);
    localObject = new double[i];
    this.OooO0OO = ((double[])localObject);
    localObject = this.OooO0O0;
    int k = j + 1;
    i = i - j + -1;
    System.arraycopy(localObject, j, localObject, k, i);
    this.OooO0O0[j] = paramDouble;
    this.OooO00o[j] = paramFloat;
    this.OooO0oo = false;
  }
  
  public double OooO0O0(double paramDouble)
  {
    double d1 = 0.0D;
    boolean bool = paramDouble < d1;
    double d2;
    if (!bool)
    {
      paramDouble = 1.E-005D;
    }
    else
    {
      d2 = 1.0D;
      bool = paramDouble < d2;
      if (!bool) {
        paramDouble = 0.999999D;
      }
    }
    double[] arrayOfDouble = this.OooO0O0;
    int i = Arrays.binarySearch(arrayOfDouble, paramDouble);
    if (i > 0) {
      return d1;
    }
    if (i != 0)
    {
      int j = -i + -1;
      float[] arrayOfFloat = this.OooO00o;
      float f1 = arrayOfFloat[j];
      int k = j + -1;
      float f2 = arrayOfFloat[k];
      f1 -= f2;
      double d3 = f1;
      arrayOfDouble = this.OooO0O0;
      double d4 = arrayOfDouble[j];
      d2 = arrayOfDouble[k];
      d4 -= d2;
      d3 /= d4;
      paramDouble *= d3;
      d1 = f2;
      d3 *= d2;
      d1 = d1 - d3 + paramDouble;
    }
    return d1;
  }
  
  public double OooO0OO(double paramDouble)
  {
    double d1 = 0.0D;
    boolean bool = paramDouble < d1;
    long l = 4607182418800017408L;
    double d2 = 1.0D;
    if (bool)
    {
      paramDouble = d1;
    }
    else
    {
      bool = paramDouble < d2;
      if (bool) {
        paramDouble = d2;
      }
    }
    double[] arrayOfDouble1 = this.OooO0O0;
    int i = Arrays.binarySearch(arrayOfDouble1, paramDouble);
    if (i > 0)
    {
      d1 = d2;
    }
    else if (i != 0)
    {
      int j = -i + -1;
      float[] arrayOfFloat = this.OooO00o;
      float f1 = arrayOfFloat[j];
      int k = j + -1;
      float f2 = arrayOfFloat[k];
      f1 -= f2;
      double d3 = f1;
      arrayOfDouble1 = this.OooO0O0;
      double d4 = arrayOfDouble1[j];
      double d5 = arrayOfDouble1[k];
      d4 -= d5;
      d3 /= d4;
      double[] arrayOfDouble2 = this.OooO0OO;
      double d6 = arrayOfDouble2[k];
      d1 = f2;
      d4 = d3 * d5;
      d1 -= d4;
      d4 = paramDouble - d5;
      d1 *= d4;
      d6 += d1;
      paramDouble *= paramDouble;
      d5 *= d5;
      paramDouble -= d5;
      d3 *= paramDouble;
      paramDouble = 2.0D;
      d3 /= paramDouble;
      d1 = d6 + d3;
    }
    return d1;
  }
  
  public double OooO0Oo(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d1 = OooO0OO(paramDouble1);
    paramDouble2 += d1;
    paramDouble1 = OooO0O0(paramDouble1) + paramDouble3;
    int i = this.OooO0o;
    d1 = 2.0D;
    double d2 = 4.0D;
    switch (i)
    {
    default: 
      paramDouble3 = this.OooO0oO;
      paramDouble1 *= paramDouble3;
      paramDouble2 = Math.cos(paramDouble3 * paramDouble2);
      return paramDouble1 * paramDouble2;
    case 7: 
      MonotonicCurveFit localMonotonicCurveFit = this.OooO0o0;
      paramDouble2 %= 1.0D;
      return localMonotonicCurveFit.OooO0o(paramDouble2, 0);
    case 6: 
      paramDouble1 *= d2;
      paramDouble2 = (paramDouble2 * d2 + d1) % d2 - d1;
      return paramDouble1 * paramDouble2;
    case 5: 
      paramDouble3 = this.OooO0oO;
      d1 = -paramDouble3 * paramDouble1;
      paramDouble1 = Math.sin(paramDouble3 * paramDouble2);
      return d1 * paramDouble1;
    case 4: 
      return -paramDouble1 * d1;
    case 3: 
      return paramDouble1 * d1;
    case 2: 
      paramDouble1 *= d2;
      paramDouble2 = Math.signum((paramDouble2 * d2 + 3.0D) % d2 - d1);
      return paramDouble1 * paramDouble2;
    }
    return 0.0D;
  }
  
  public void OooO0o()
  {
    Oscillator localOscillator = this;
    double d1 = 0.0D;
    int i = 0;
    double d2 = d1;
    int j = 0;
    float f1 = 0.0F;
    for (;;)
    {
      arrayOfFloat = localOscillator.OooO00o;
      int k = arrayOfFloat.length;
      if (j >= k) {
        break;
      }
      f2 = arrayOfFloat[j];
      double d3 = f2;
      d2 += d3;
      j += 1;
    }
    j = 1;
    f1 = 1.4E-45F;
    double d4 = d1;
    int m = j;
    float f2 = f1;
    Object localObject1;
    int n;
    float f3;
    double d6;
    for (;;)
    {
      localObject1 = localOscillator.OooO00o;
      n = localObject1.length;
      f3 = 2.0F;
      if (m >= n) {
        break;
      }
      n = m + -1;
      float f4 = localObject1[n];
      float f5 = localObject1[m];
      f4 = (f4 + f5) / f3;
      localObject1 = localOscillator.OooO0O0;
      double d5 = localObject1[m];
      d6 = localObject1[n];
      d5 -= d6;
      d6 = f4;
      d5 *= d6;
      d4 += d5;
      m += 1;
    }
    m = 0;
    float[] arrayOfFloat = null;
    f2 = 0.0F;
    for (;;)
    {
      localObject1 = localOscillator.OooO00o;
      n = localObject1.length;
      if (m >= n) {
        break;
      }
      double d7 = localObject1[m];
      double d8 = d2 / d4;
      d7 *= d8;
      float f6 = (float)d7;
      localObject1[m] = f6;
      m += 1;
    }
    double[] arrayOfDouble = localOscillator.OooO0OO;
    arrayOfDouble[0] = d1;
    int i1 = j;
    for (;;)
    {
      Object localObject2 = localOscillator.OooO00o;
      i = localObject2.length;
      if (i1 >= i) {
        break;
      }
      i = i1 + -1;
      float f7 = localObject2[i];
      float f8 = localObject2[i1];
      f7 = (f7 + f8) / f3;
      localObject2 = localOscillator.OooO0O0;
      double d9 = localObject2[i1];
      d4 = localObject2[i];
      d9 -= d4;
      localObject2 = localOscillator.OooO0OO;
      d4 = localObject2[i];
      d6 = f7;
      d9 *= d6;
      d4 += d9;
      localObject2[i1] = d4;
      i1 += 1;
    }
    localOscillator.OooO0oo = j;
  }
  
  public double OooO0o0(double paramDouble1, double paramDouble2)
  {
    paramDouble1 = OooO0OO(paramDouble1) + paramDouble2;
    int i = this.OooO0o;
    double d1 = 4.0D;
    double d2 = 2.0D;
    double d3 = 1.0D;
    switch (i)
    {
    default: 
      return Math.sin(this.OooO0oO * paramDouble1);
    case 7: 
      MonotonicCurveFit localMonotonicCurveFit = this.OooO0o0;
      paramDouble1 %= d3;
      return localMonotonicCurveFit.OooO0OO(paramDouble1, 0);
    case 6: 
      paramDouble1 = Math.abs(paramDouble1 * d1 % d1 - d2);
      paramDouble1 = d3 - paramDouble1;
      paramDouble1 *= paramDouble1;
    case 5: 
    case 4: 
    case 3: 
    case 2: 
      for (;;)
      {
        return d3 - paramDouble1;
        double d4 = this.OooO0oO;
        paramDouble2 += paramDouble1;
        return Math.cos(d4 * paramDouble2);
        paramDouble1 = (paramDouble1 * d2 + d3) % d2;
        continue;
        return (paramDouble1 * d2 + d3) % d2 - d3;
        paramDouble1 = Math.abs((paramDouble1 * d1 + d3) % d1 - d2);
      }
    }
    paramDouble1 %= d3;
    return Math.signum(0.5D - paramDouble1);
  }
  
  public void setType(int paramInt, String paramString)
  {
    this.OooO0o = paramInt;
    this.OooO0Oo = paramString;
    if (paramString != null)
    {
      MonotonicCurveFit localMonotonicCurveFit = MonotonicCurveFit.OooO0oo(paramString);
      this.OooO0o0 = localMonotonicCurveFit;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("pos =");
    String str = Arrays.toString(this.OooO0O0);
    localStringBuilder.append(str);
    localStringBuilder.append(" period=");
    str = Arrays.toString(this.OooO00o);
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.Oscillator
 * JD-Core Version:    0.7.0.1
 */