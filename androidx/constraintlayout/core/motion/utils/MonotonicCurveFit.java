package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MonotonicCurveFit
  extends CurveFit
{
  public double[] OooO00o;
  public double[][] OooO0O0;
  public double[][] OooO0OO;
  public boolean OooO0Oo = true;
  public double[] OooO0o0;
  
  public MonotonicCurveFit(double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    int i = paramArrayOfDouble.length;
    double[] arrayOfDouble2 = paramArrayOfDouble1[0];
    int j = arrayOfDouble2.length;
    double[] arrayOfDouble3 = new double[j];
    this.OooO0o0 = arrayOfDouble3;
    int k = i + -1;
    Object localObject1 = { k, j };
    localObject1 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject1);
    Object localObject2 = { i, j };
    localObject2 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject2);
    int m = 0;
    int n;
    Object localObject3;
    double d1;
    double[] arrayOfDouble4;
    double d3;
    double d4;
    Object localObject5;
    while (m < j)
    {
      n = 0;
      localObject3 = null;
      while (n < k)
      {
        i1 = n + 1;
        d1 = arrayOfDouble1[i1];
        double d2 = arrayOfDouble1[n];
        d1 -= d2;
        Object localObject4 = localObject1[n];
        arrayOfDouble4 = arrayOfDouble[i1];
        d3 = arrayOfDouble4[m];
        double[] arrayOfDouble5 = arrayOfDouble[n];
        d4 = arrayOfDouble5[m];
        d3 = (d3 - d4) / d1;
        localObject4[m] = d3;
        if (n == 0)
        {
          localObject3 = localObject2[n];
          localObject3[m] = d3;
        }
        else
        {
          localObject5 = localObject2[n];
          n += -1;
          localObject3 = localObject1[n];
          double d5 = localObject3[m] + d3;
          d3 = 0.5D;
          d5 *= d3;
          localObject5[m] = d5;
        }
        n = i1;
      }
      localObject3 = localObject2[k];
      int i1 = i + -2;
      Object localObject6 = localObject1[i1];
      double d6 = localObject6[m];
      localObject3[m] = d6;
      m += 1;
    }
    i = 0;
    while (i < k)
    {
      m = 0;
      while (m < j)
      {
        localObject3 = localObject1[i];
        double d7 = localObject3[m];
        d1 = 0.0D;
        boolean bool1 = d7 < d1;
        if (!bool1)
        {
          localObject2[i][m] = d1;
          n = i + 1;
          localObject3 = localObject2[n];
          localObject3[m] = d1;
        }
        else
        {
          localObject5 = localObject2[i];
          d1 = localObject5[m] / d7;
          int i2 = i + 1;
          arrayOfDouble4 = localObject2[i2];
          d7 = arrayOfDouble4[m] / d7;
          d3 = Math.hypot(d1, d7);
          d4 = 9.0D;
          boolean bool2 = d3 < d4;
          if (bool2)
          {
            d4 = 3.0D / d3;
            arrayOfDouble4 = localObject2[i];
            d1 *= d4;
            Object localObject7 = localObject1[i];
            double d8 = localObject7[m];
            d1 *= d8;
            arrayOfDouble4[m] = d1;
            localObject5 = localObject2[i2];
            d4 *= d7;
            d7 = localObject7[m];
            d4 *= d7;
            localObject5[m] = d4;
          }
        }
        m += 1;
      }
      i += 1;
    }
    localMonotonicCurveFit.OooO00o = arrayOfDouble1;
    localMonotonicCurveFit.OooO0O0 = arrayOfDouble;
    localMonotonicCurveFit.OooO0OO = ((double[][])localObject2);
  }
  
  public static MonotonicCurveFit OooO(double[] paramArrayOfDouble)
  {
    Object localObject1 = paramArrayOfDouble;
    int i = paramArrayOfDouble.length * 3 + -2;
    int j = paramArrayOfDouble.length;
    int k = 1;
    j -= k;
    double d1 = j;
    double d2 = 1.0D;
    d1 = d2 / d1;
    Object localObject2 = { i, k };
    localObject2 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject2);
    double[] arrayOfDouble = new double[i];
    int m = 0;
    for (;;)
    {
      int n = localObject1.length;
      if (m >= n) {
        break;
      }
      double d3 = localObject1[m];
      int i1 = m + j;
      Object localObject3 = localObject2[i1];
      localObject3[0] = d3;
      double d4 = m * d1;
      arrayOfDouble[i1] = d4;
      if (m > 0)
      {
        i1 = j * 2 + m;
        Object localObject4 = localObject2[i1];
        double d5 = d3 + d2;
        localObject4[0] = d5;
        double d6 = d4 + d2;
        arrayOfDouble[i1] = d6;
        i1 = m + -1;
        localObject4 = localObject2[i1];
        d3 = d3 - d2 - d1;
        localObject4[0] = d3;
        d3 = -1.0D;
        d4 = d4 + d3 - d1;
        arrayOfDouble[i1] = d4;
      }
      m += 1;
    }
    localObject1 = new androidx/constraintlayout/core/motion/utils/MonotonicCurveFit;
    ((MonotonicCurveFit)localObject1).<init>(arrayOfDouble, (double[][])localObject2);
    return localObject1;
  }
  
  public static MonotonicCurveFit OooO0oo(String paramString)
  {
    int i = paramString.length() / 2;
    double[] arrayOfDouble = new double[i];
    int j = paramString.indexOf('(') + 1;
    int k = 44;
    int m = paramString.indexOf(k, j);
    int i1;
    for (int n = 0;; n = i1)
    {
      i1 = -1;
      if (m == i1) {
        break;
      }
      String str = paramString.substring(j, m).trim();
      i1 = n + 1;
      double d1 = Double.parseDouble(str);
      arrayOfDouble[n] = d1;
      j = m + 1;
      m = paramString.indexOf(k, j);
    }
    k = paramString.indexOf(')', j);
    paramString = paramString.substring(j, k).trim();
    j = n + 1;
    double d2 = Double.parseDouble(paramString);
    arrayOfDouble[n] = d2;
    return OooO(Arrays.copyOf(arrayOfDouble, j));
  }
  
  public static double OooOO0(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    double d1 = paramDouble2 * paramDouble2;
    double d2 = -6.0D * d1 * paramDouble4;
    double d3 = 6.0D;
    double d4 = paramDouble2 * d3;
    double d5 = d4 * paramDouble4;
    d2 += d5;
    d3 = d3 * d1 * paramDouble3;
    d2 += d3;
    d4 *= paramDouble3;
    d2 -= d4;
    d3 = 3.0D * paramDouble1;
    d4 = d3 * paramDouble6 * d1;
    d2 += d4;
    d3 = d3 * paramDouble5 * d1;
    d2 += d3;
    d1 = 2.0D * paramDouble1 * paramDouble6 * paramDouble2;
    d2 -= d1;
    d1 = 4.0D * paramDouble1 * paramDouble5 * paramDouble2;
    d2 -= d1;
    d1 = paramDouble1 * paramDouble5;
    return d2 + d1;
  }
  
  public static double OooOO0O(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    double d1 = paramDouble2 * paramDouble2;
    double d2 = d1 * paramDouble2;
    double d3 = -2.0D * d2 * paramDouble4;
    double d4 = 3.0D * d1;
    double d5 = d4 * paramDouble4;
    d3 += d5;
    d5 = 2.0D;
    double d6 = d2 * d5 * paramDouble3;
    d3 += d6;
    d4 *= paramDouble3;
    d3 = d3 - d4 + paramDouble3;
    d4 = paramDouble1 * paramDouble6;
    d6 = d4 * d2;
    d3 += d6;
    d6 = paramDouble1 * paramDouble5;
    d2 *= d6;
    d3 += d2;
    d4 *= d1;
    d3 -= d4;
    d2 = paramDouble1 * d5 * paramDouble5 * d1;
    d3 -= d2;
    d6 *= paramDouble2;
    return d3 + d6;
  }
  
  public double OooO0OO(double paramDouble, int paramInt)
  {
    MonotonicCurveFit localMonotonicCurveFit = this;
    int i = paramInt;
    Object localObject = this.OooO00o;
    int j = localObject.length;
    boolean bool1 = this.OooO0Oo;
    int i1 = 0;
    if (bool1)
    {
      d1 = localObject[0];
      bool1 = paramDouble < d1;
      if (!bool1) {
        localObject = this.OooO0O0[0];
      }
      for (double d2 = localObject[paramInt];; d2 = localObject[paramInt])
      {
        double d3 = paramDouble - d1;
        d1 = localMonotonicCurveFit.OooO0o(d1, i);
        d3 *= d1;
        return d2 + d3;
        int k = j + -1;
        d1 = localObject[k];
        bool4 = paramDouble < d1;
        if (bool4) {
          break;
        }
        localObject = this.OooO0O0[k];
      }
    }
    double d1 = localObject[0];
    boolean bool2 = paramDouble < d1;
    if (!bool2) {
      return this.OooO0O0[0][paramInt];
    }
    int m = j + -1;
    d1 = localObject[m];
    boolean bool4 = paramDouble < d1;
    if (!bool4) {
      return this.OooO0O0[m][paramInt];
    }
    for (;;)
    {
      int i2 = j + -1;
      if (i1 >= i2) {
        break;
      }
      localObject = localMonotonicCurveFit.OooO00o;
      d1 = localObject[i1];
      boolean bool3 = paramDouble < d1;
      if (!bool3) {
        return localMonotonicCurveFit.OooO0O0[i1][i];
      }
      int n = i1 + 1;
      double d4 = localObject[n];
      boolean bool5 = paramDouble < d4;
      if (bool5)
      {
        double d5 = d4 - d1;
        double d6 = (paramDouble - d1) / d5;
        localObject = localMonotonicCurveFit.OooO0O0;
        double d7 = localObject[i1][i];
        double d8 = localObject[n][i];
        localObject = localMonotonicCurveFit.OooO0OO;
        double d9 = localObject[i1][i];
        double d10 = localObject[n][i];
        return OooOO0O(d5, d6, d7, d8, d9, d10);
      }
      i1 = n;
    }
    return 0.0D;
  }
  
  public void OooO0Oo(double paramDouble, double[] paramArrayOfDouble)
  {
    MonotonicCurveFit localMonotonicCurveFit = this;
    double[] arrayOfDouble1 = this.OooO00o;
    int i = arrayOfDouble1.length;
    Object localObject1 = this.OooO0O0;
    int j = 0;
    localObject1 = localObject1[0];
    int k = localObject1.length;
    boolean bool1 = this.OooO0Oo;
    double d1;
    double d2;
    Object localObject2;
    double d3;
    double d4;
    int i5;
    double d5;
    double[] arrayOfDouble2;
    int n;
    if (bool1)
    {
      d1 = arrayOfDouble1[0];
      boolean bool3 = paramDouble < d1;
      if (!bool3)
      {
        arrayOfDouble1 = this.OooO0o0;
        OooO0oO(d1, arrayOfDouble1);
        int i3 = 0;
        arrayOfDouble1 = null;
        while (i3 < k)
        {
          d1 = localMonotonicCurveFit.OooO0O0[0][i3];
          d2 = localMonotonicCurveFit.OooO00o[0];
          d2 = paramDouble - d2;
          localObject2 = localMonotonicCurveFit.OooO0o0;
          d3 = localObject2[i3];
          d2 *= d3;
          d1 += d2;
          paramArrayOfDouble[i3] = d1;
          int i4;
          i3 += 1;
        }
        return;
      }
      int m = i + -1;
      d4 = arrayOfDouble1[m];
      i5 = paramDouble < d4;
      if (i5 >= 0)
      {
        arrayOfDouble1 = this.OooO0o0;
        OooO0oO(d4, arrayOfDouble1);
        while (j < k)
        {
          arrayOfDouble1 = localMonotonicCurveFit.OooO0O0[m];
          d5 = arrayOfDouble1[j];
          arrayOfDouble2 = localMonotonicCurveFit.OooO00o;
          d4 = arrayOfDouble2[m];
          d4 = paramDouble - d4;
          double[] arrayOfDouble3 = localMonotonicCurveFit.OooO0o0;
          double d6 = arrayOfDouble3[j];
          d4 *= d6;
          d5 += d4;
          paramArrayOfDouble[j] = d5;
          j += 1;
        }
      }
    }
    else
    {
      d1 = arrayOfDouble1[0];
      boolean bool2 = paramDouble < d1;
      if (!bool2)
      {
        i5 = 0;
        arrayOfDouble1 = null;
        while (i5 < k)
        {
          localObject2 = localMonotonicCurveFit.OooO0O0[0];
          d1 = localObject2[i5];
          paramArrayOfDouble[i5] = d1;
          int i6;
          i5 += 1;
        }
        return;
      }
      n = i + -1;
      d4 = arrayOfDouble1[n];
      i7 = paramDouble < d4;
      if (i7 >= 0)
      {
        while (j < k)
        {
          arrayOfDouble1 = localMonotonicCurveFit.OooO0O0[n];
          d5 = arrayOfDouble1[j];
          paramArrayOfDouble[j] = d5;
          j += 1;
        }
        return;
      }
    }
    int i7 = 0;
    arrayOfDouble1 = null;
    for (;;)
    {
      n = i + -1;
      if (i7 >= n) {
        break;
      }
      double[] arrayOfDouble4 = localMonotonicCurveFit.OooO00o;
      d1 = arrayOfDouble4[i7];
      int i1 = paramDouble < d1;
      if (i1 == 0)
      {
        i1 = 0;
        arrayOfDouble4 = null;
        while (i1 < k)
        {
          arrayOfDouble2 = localMonotonicCurveFit.OooO0O0[i7];
          d4 = arrayOfDouble2[i1];
          paramArrayOfDouble[i1] = d4;
          int i2;
          i1 += 1;
        }
      }
      arrayOfDouble4 = localMonotonicCurveFit.OooO00o;
      int i8 = i7 + 1;
      d2 = arrayOfDouble4[i8];
      boolean bool4 = paramDouble < d2;
      if (bool4)
      {
        d3 = arrayOfDouble4[i7];
        d2 -= d3;
        d3 = (paramDouble - d3) / d2;
        while (j < k)
        {
          localObject2 = localMonotonicCurveFit.OooO0O0;
          double d7 = localObject2[i7][j];
          double d8 = localObject2[i8][j];
          localObject2 = localMonotonicCurveFit.OooO0OO;
          arrayOfDouble4 = localObject2[i7];
          double d9 = arrayOfDouble4[j];
          localObject2 = localObject2[i8];
          double d10 = localObject2[j];
          double d11 = d2;
          d11 = OooOO0O(d2, d3, d7, d8, d9, d10);
          paramArrayOfDouble[j] = d11;
          j += 1;
        }
        return;
      }
      i7 = i8;
    }
  }
  
  public double OooO0o(double paramDouble, int paramInt)
  {
    MonotonicCurveFit localMonotonicCurveFit = this;
    Object localObject = this.OooO00o;
    int i = localObject.length;
    int j = 0;
    double d1 = localObject[0];
    boolean bool1 = paramDouble < d1;
    if (!bool1)
    {
      int m = i + -1;
      d1 = localObject[m];
      boolean bool2 = paramDouble < d1;
      if (bool2) {
        d1 = paramDouble;
      }
    }
    for (;;)
    {
      int n = i + -1;
      if (j >= n) {
        break;
      }
      localObject = localMonotonicCurveFit.OooO00o;
      int k = j + 1;
      double d2 = localObject[k];
      boolean bool3 = d1 < d2;
      if (!bool3)
      {
        double d3 = localObject[j];
        d2 -= d3;
        double d4 = (d1 - d3) / d2;
        localObject = localMonotonicCurveFit.OooO0O0;
        double d5 = localObject[j][paramInt];
        double d6 = localObject[k][paramInt];
        localObject = localMonotonicCurveFit.OooO0OO;
        double d7 = localObject[j][paramInt];
        double d8 = localObject[k][paramInt];
        return OooOO0(d2, d4, d5, d6, d7, d8) / d2;
      }
      j = k;
    }
    return 0.0D;
  }
  
  public void OooO0o0(double paramDouble, float[] paramArrayOfFloat)
  {
    MonotonicCurveFit localMonotonicCurveFit = this;
    double[] arrayOfDouble1 = this.OooO00o;
    int i = arrayOfDouble1.length;
    Object localObject1 = this.OooO0O0;
    int j = 0;
    localObject1 = localObject1[0];
    int k = localObject1.length;
    boolean bool1 = this.OooO0Oo;
    double d1;
    double d2;
    Object localObject2;
    double d3;
    float f2;
    double d4;
    int i5;
    double d5;
    double[] arrayOfDouble2;
    int n;
    if (bool1)
    {
      d1 = arrayOfDouble1[0];
      boolean bool3 = paramDouble < d1;
      if (!bool3)
      {
        arrayOfDouble1 = this.OooO0o0;
        OooO0oO(d1, arrayOfDouble1);
        int i3 = 0;
        arrayOfDouble1 = null;
        f1 = 0.0F;
        while (i3 < k)
        {
          d1 = localMonotonicCurveFit.OooO0O0[0][i3];
          d2 = localMonotonicCurveFit.OooO00o[0];
          d2 = paramDouble - d2;
          localObject2 = localMonotonicCurveFit.OooO0o0;
          d3 = localObject2[i3];
          d2 *= d3;
          d1 += d2;
          f2 = (float)d1;
          paramArrayOfFloat[i3] = f2;
          int i4;
          i3 += 1;
        }
        return;
      }
      int m = i + -1;
      d4 = arrayOfDouble1[m];
      i5 = paramDouble < d4;
      if (i5 >= 0)
      {
        arrayOfDouble1 = this.OooO0o0;
        OooO0oO(d4, arrayOfDouble1);
        while (j < k)
        {
          arrayOfDouble1 = localMonotonicCurveFit.OooO0O0[m];
          d5 = arrayOfDouble1[j];
          arrayOfDouble2 = localMonotonicCurveFit.OooO00o;
          d4 = arrayOfDouble2[m];
          d4 = paramDouble - d4;
          double[] arrayOfDouble3 = localMonotonicCurveFit.OooO0o0;
          double d6 = arrayOfDouble3[j];
          d4 *= d6;
          d5 += d4;
          f1 = (float)d5;
          paramArrayOfFloat[j] = f1;
          j += 1;
        }
      }
    }
    else
    {
      d1 = arrayOfDouble1[0];
      boolean bool2 = paramDouble < d1;
      if (!bool2)
      {
        i5 = 0;
        arrayOfDouble1 = null;
        f1 = 0.0F;
        while (i5 < k)
        {
          localObject2 = localMonotonicCurveFit.OooO0O0[0];
          d1 = localObject2[i5];
          f2 = (float)d1;
          paramArrayOfFloat[i5] = f2;
          int i6;
          i5 += 1;
        }
        return;
      }
      n = i + -1;
      d4 = arrayOfDouble1[n];
      i7 = paramDouble < d4;
      if (i7 >= 0)
      {
        while (j < k)
        {
          arrayOfDouble1 = localMonotonicCurveFit.OooO0O0[n];
          d5 = arrayOfDouble1[j];
          f1 = (float)d5;
          paramArrayOfFloat[j] = f1;
          j += 1;
        }
        return;
      }
    }
    int i7 = 0;
    arrayOfDouble1 = null;
    float f1 = 0.0F;
    for (;;)
    {
      n = i + -1;
      if (i7 >= n) {
        break;
      }
      double[] arrayOfDouble4 = localMonotonicCurveFit.OooO00o;
      d1 = arrayOfDouble4[i7];
      int i1 = paramDouble < d1;
      if (i1 == 0)
      {
        i1 = 0;
        arrayOfDouble4 = null;
        while (i1 < k)
        {
          arrayOfDouble2 = localMonotonicCurveFit.OooO0O0[i7];
          d4 = arrayOfDouble2[i1];
          float f3 = (float)d4;
          paramArrayOfFloat[i1] = f3;
          int i2;
          i1 += 1;
        }
      }
      arrayOfDouble4 = localMonotonicCurveFit.OooO00o;
      int i8 = i7 + 1;
      d2 = arrayOfDouble4[i8];
      boolean bool4 = paramDouble < d2;
      if (bool4)
      {
        d3 = arrayOfDouble4[i7];
        d2 -= d3;
        d3 = (paramDouble - d3) / d2;
        while (j < k)
        {
          localObject2 = localMonotonicCurveFit.OooO0O0;
          double d7 = localObject2[i7][j];
          double d8 = localObject2[i8][j];
          localObject2 = localMonotonicCurveFit.OooO0OO;
          arrayOfDouble4 = localObject2[i7];
          double d9 = arrayOfDouble4[j];
          localObject2 = localObject2[i8];
          double d10 = localObject2[j];
          double d11 = d2;
          d11 = OooOO0O(d2, d3, d7, d8, d9, d10);
          f2 = (float)d11;
          paramArrayOfFloat[j] = f2;
          j += 1;
        }
        return;
      }
      i7 = i8;
    }
  }
  
  public void OooO0oO(double paramDouble, double[] paramArrayOfDouble)
  {
    MonotonicCurveFit localMonotonicCurveFit = this;
    double[] arrayOfDouble1 = this.OooO00o;
    int i = arrayOfDouble1.length;
    Object localObject1 = this.OooO0O0;
    int j = 0;
    localObject1 = localObject1[0];
    int k = localObject1.length;
    double d1 = arrayOfDouble1[0];
    boolean bool1 = paramDouble < d1;
    if (bool1)
    {
      int n = i + -1;
      d1 = arrayOfDouble1[n];
      i1 = paramDouble < d1;
      if (i1 < 0) {
        d1 = paramDouble;
      }
    }
    int i1 = 0;
    arrayOfDouble1 = null;
    for (;;)
    {
      int m = i + -1;
      if (i1 >= m) {
        break;
      }
      double[] arrayOfDouble2 = localMonotonicCurveFit.OooO00o;
      int i2 = i1 + 1;
      double d2 = arrayOfDouble2[i2];
      boolean bool2 = d1 < d2;
      if (!bool2)
      {
        double d3 = arrayOfDouble2[i1];
        d2 -= d3;
        d1 = (d1 - d3) / d2;
        while (j < k)
        {
          Object localObject2 = localMonotonicCurveFit.OooO0O0;
          double d4 = localObject2[i1][j];
          double d5 = localObject2[i2][j];
          localObject2 = localMonotonicCurveFit.OooO0OO;
          arrayOfDouble2 = localObject2[i1];
          double d6 = arrayOfDouble2[j];
          localObject2 = localObject2[i2];
          double d7 = localObject2[j];
          d3 = OooOO0(d2, d1, d4, d5, d6, d7) / d2;
          paramArrayOfDouble[j] = d3;
          j += 1;
        }
      }
      i1 = i2;
    }
  }
  
  public double[] getTimePoints()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.MonotonicCurveFit
 * JD-Core Version:    0.7.0.1
 */