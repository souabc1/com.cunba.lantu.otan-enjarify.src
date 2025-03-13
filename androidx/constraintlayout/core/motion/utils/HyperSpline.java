package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

public class HyperSpline
{
  public int OooO00o;
  public HyperSpline.Cubic[][] OooO0O0;
  public int OooO0OO;
  public double[] OooO0Oo;
  public double[][] OooO0o;
  public double OooO0o0;
  
  public static HyperSpline.Cubic[] OooO0O0(int paramInt, double[] paramArrayOfDouble)
  {
    int i = paramInt;
    Object localObject1 = new double[paramInt];
    Object localObject2 = new double[paramInt];
    double[] arrayOfDouble = new double[paramInt];
    i = paramInt + -1;
    double d1 = 0.5D;
    int j = 0;
    localObject1[0] = d1;
    int k = 1;
    int m = k;
    for (;;)
    {
      d2 = 1.0D;
      if (m >= i) {
        break;
      }
      int n = m + -1;
      d3 = localObject1[n];
      d4 = 4.0D - d3;
      d2 /= d4;
      localObject1[m] = d2;
      m += 1;
    }
    m = i + -1;
    double d3 = localObject1[m];
    double d4 = 2.0D;
    d3 = d4 - d3;
    d2 /= d3;
    localObject1[i] = d2;
    double d2 = paramArrayOfDouble[k];
    d3 = paramArrayOfDouble[0];
    d2 -= d3;
    d3 = 3.0D;
    d2 *= d3;
    double d5 = localObject1[0];
    d2 *= d5;
    localObject2[0] = d2;
    int i1;
    double d6;
    while (k < i)
    {
      i1 = k + 1;
      d5 = paramArrayOfDouble[i1];
      int i2 = k + -1;
      d6 = paramArrayOfDouble[i2];
      d5 = (d5 - d6) * d3;
      d6 = localObject2[i2];
      d5 -= d6;
      d6 = localObject1[k];
      d5 *= d6;
      localObject2[k] = d5;
      k = i1;
    }
    d2 = paramArrayOfDouble[i];
    d5 = paramArrayOfDouble[m];
    d2 = (d2 - d5) * d3;
    d5 = localObject2[m];
    d2 -= d5;
    d5 = localObject1[i];
    d2 *= d5;
    localObject2[i] = d2;
    arrayOfDouble[i] = d2;
    while (m >= 0)
    {
      d2 = localObject2[m];
      d5 = localObject1[m];
      k = m + 1;
      d6 = arrayOfDouble[k];
      d5 *= d6;
      d2 -= d5;
      arrayOfDouble[m] = d2;
      m += -1;
    }
    localObject1 = new HyperSpline.Cubic[i];
    while (j < i)
    {
      localObject2 = new androidx/constraintlayout/core/motion/utils/HyperSpline$Cubic;
      d1 = paramArrayOfDouble[j];
      float f = (float)d1;
      double d7 = f;
      double d8 = arrayOfDouble[j];
      i1 = j + 1;
      double d9 = paramArrayOfDouble[i1];
      double d10 = (d9 - d1) * d3;
      double d11 = d8 * d4;
      d10 -= d11;
      d11 = arrayOfDouble[i1];
      d10 -= d11;
      d1 = (d1 - d9) * d4 + d8 + d11;
      d9 = d10;
      d10 = d1;
      ((HyperSpline.Cubic)localObject2).<init>(d7, d8, d9, d1);
      localObject1[j] = localObject2;
      j = i1;
    }
    return localObject1;
  }
  
  public double OooO00o(HyperSpline.Cubic[] paramArrayOfCubic)
  {
    HyperSpline.Cubic[] arrayOfCubic = paramArrayOfCubic;
    int i = paramArrayOfCubic.length;
    i = paramArrayOfCubic.length;
    double[] arrayOfDouble = new double[i];
    double d1 = 0.0D;
    double d2 = d1;
    double d3 = d1;
    double d4;
    int k;
    double d5;
    HyperSpline.Cubic localCubic;
    for (;;)
    {
      d4 = 1.0D;
      boolean bool1 = d2 < d4;
      k = 0;
      if (!bool1) {
        break;
      }
      d4 = d1;
      for (;;)
      {
        int j = arrayOfCubic.length;
        if (k >= j) {
          break;
        }
        d5 = arrayOfDouble[k];
        localCubic = arrayOfCubic[k];
        double d6 = localCubic.OooO00o(d2);
        arrayOfDouble[k] = d6;
        d5 -= d6;
        d5 *= d5;
        d4 += d5;
        k += 1;
      }
      boolean bool2 = d2 < d1;
      if (bool2)
      {
        d4 = Math.sqrt(d4);
        d3 += d4;
      }
      d4 = 0.1D;
      d2 += d4;
    }
    for (;;)
    {
      int m = arrayOfCubic.length;
      if (k >= m) {
        break;
      }
      d2 = arrayOfDouble[k];
      localCubic = arrayOfCubic[k];
      d5 = localCubic.OooO00o(d4);
      arrayOfDouble[k] = d5;
      d2 -= d5;
      d2 *= d2;
      d1 += d2;
      k += 1;
    }
    double d7 = Math.sqrt(d1);
    return d3 + d7;
  }
  
  public void setup(double[][] paramArrayOfDouble)
  {
    int i = paramArrayOfDouble[0].length;
    this.OooO0OO = i;
    int j = paramArrayOfDouble.length;
    this.OooO00o = j;
    Object localObject1 = { i, j };
    Object localObject2 = Double.TYPE;
    localObject1 = (double[][])Array.newInstance((Class)localObject2, (int[])localObject1);
    this.OooO0o = ((double[][])localObject1);
    localObject1 = new HyperSpline.Cubic[this.OooO0OO][];
    this.OooO0O0 = ((HyperSpline.Cubic[][])localObject1);
    i = 0;
    localObject1 = null;
    int k;
    Object localObject3;
    double[] arrayOfDouble;
    for (;;)
    {
      j = this.OooO0OO;
      if (i >= j) {
        break;
      }
      j = 0;
      localObject2 = null;
      for (;;)
      {
        k = this.OooO00o;
        if (j >= k) {
          break;
        }
        localObject3 = this.OooO0o[i];
        arrayOfDouble = paramArrayOfDouble[j];
        double d1 = arrayOfDouble[i];
        localObject3[j] = d1;
        j += 1;
      }
      i += 1;
    }
    int m = 0;
    paramArrayOfDouble = null;
    for (;;)
    {
      i = this.OooO0OO;
      if (m >= i) {
        break;
      }
      localObject1 = this.OooO0O0;
      localObject2 = this.OooO0o[m];
      k = localObject2.length;
      localObject2 = OooO0O0(k, (double[])localObject2);
      localObject1[m] = localObject2;
      m += 1;
    }
    m = this.OooO00o + -1;
    paramArrayOfDouble = new double[m];
    this.OooO0Oo = paramArrayOfDouble;
    double d2 = 0.0D;
    this.OooO0o0 = d2;
    paramArrayOfDouble = new HyperSpline.Cubic[i];
    i = 0;
    localObject1 = null;
    for (;;)
    {
      localObject2 = this.OooO0Oo;
      j = localObject2.length;
      if (i >= j) {
        break;
      }
      j = 0;
      localObject2 = null;
      for (;;)
      {
        k = this.OooO0OO;
        if (j >= k) {
          break;
        }
        localObject3 = this.OooO0O0[j][i];
        paramArrayOfDouble[j] = localObject3;
        j += 1;
      }
      d2 = this.OooO0o0;
      arrayOfDouble = this.OooO0Oo;
      double d3 = OooO00o(paramArrayOfDouble);
      arrayOfDouble[i] = d3;
      d2 += d3;
      this.OooO0o0 = d2;
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.HyperSpline
 * JD-Core Version:    0.7.0.1
 */