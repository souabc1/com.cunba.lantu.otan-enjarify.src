package androidx.constraintlayout.core.motion.utils;

public class LinearCurveFit
  extends CurveFit
{
  public double[] OooO00o;
  public double[][] OooO0O0;
  public double OooO0OO;
  public boolean OooO0Oo;
  public double[] OooO0o0;
  
  public LinearCurveFit(double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    double d1 = 0.0D / 0.0D;
    this.OooO0OO = d1;
    this.OooO0Oo = true;
    paramArrayOfDouble.length;
    double[] arrayOfDouble1 = paramArrayOfDouble1[0];
    int i = arrayOfDouble1.length;
    double[] arrayOfDouble2 = new double[i];
    this.OooO0o0 = arrayOfDouble2;
    this.OooO00o = paramArrayOfDouble;
    this.OooO0O0 = paramArrayOfDouble1;
    int j = 2;
    if (i > j)
    {
      double d2 = 0.0D;
      int k = 0;
      double d5;
      for (double d3 = d2;; d3 = d5)
      {
        double d4 = d3;
        int m = paramArrayOfDouble.length;
        if (k >= m) {
          break;
        }
        double[] arrayOfDouble3 = paramArrayOfDouble1[k];
        d5 = arrayOfDouble3[0];
        if (k > 0)
        {
          d3 = d5 - d3;
          d4 = d5 - d4;
          Math.hypot(d3, d4);
        }
        k += 1;
      }
      this.OooO0OO = d2;
    }
  }
  
  public double OooO0OO(double paramDouble, int paramInt)
  {
    Object localObject = this.OooO00o;
    int i = localObject.length;
    boolean bool1 = this.OooO0Oo;
    int n = 0;
    double d2;
    if (bool1)
    {
      d1 = localObject[0];
      bool1 = paramDouble < d1;
      if (!bool1) {
        localObject = this.OooO0O0[0];
      }
      for (d2 = localObject[paramInt];; d2 = localObject[paramInt])
      {
        paramDouble -= d1;
        double d3 = OooO0o(d1, paramInt);
        paramDouble *= d3;
        return d2 + paramDouble;
        int j = i + -1;
        d1 = localObject[j];
        bool4 = paramDouble < d1;
        if (bool4) {
          break;
        }
        localObject = this.OooO0O0[j];
      }
    }
    double d1 = localObject[0];
    boolean bool2 = paramDouble < d1;
    if (!bool2) {
      return this.OooO0O0[0][paramInt];
    }
    int k = i + -1;
    d1 = localObject[k];
    boolean bool4 = paramDouble < d1;
    if (!bool4) {
      return this.OooO0O0[k][paramInt];
    }
    for (;;)
    {
      int i1 = i + -1;
      if (n >= i1) {
        break;
      }
      localObject = this.OooO00o;
      d1 = localObject[n];
      boolean bool3 = paramDouble < d1;
      if (!bool3) {
        return this.OooO0O0[n][paramInt];
      }
      int m = n + 1;
      double d4 = localObject[m];
      boolean bool5 = paramDouble < d4;
      if (bool5)
      {
        d4 -= d1;
        paramDouble = (paramDouble - d1) / d4;
        localObject = this.OooO0O0;
        double d5 = localObject[n][paramInt];
        d2 = localObject[m][paramInt];
        double d6 = 1.0D - paramDouble;
        d5 *= d6;
        d2 *= paramDouble;
        return d5 + d2;
      }
      n = m;
    }
    return 0.0D;
  }
  
  public void OooO0Oo(double paramDouble, double[] paramArrayOfDouble)
  {
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
          d1 = this.OooO0O0[0][i3];
          d2 = this.OooO00o[0];
          d2 = paramDouble - d2;
          localObject2 = this.OooO0o0;
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
          arrayOfDouble1 = this.OooO0O0[m];
          d5 = arrayOfDouble1[j];
          arrayOfDouble2 = this.OooO00o;
          d4 = arrayOfDouble2[m];
          d4 = paramDouble - d4;
          double[] arrayOfDouble3 = this.OooO0o0;
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
      double[] arrayOfDouble4;
      if (!bool2)
      {
        int i6 = 0;
        arrayOfDouble4 = null;
        while (i6 < k)
        {
          double[] arrayOfDouble5 = this.OooO0O0[0];
          d5 = arrayOfDouble5[i6];
          paramArrayOfDouble[i6] = d5;
          int i7;
          i6 += 1;
        }
        return;
      }
      n = i + -1;
      d4 = arrayOfDouble1[n];
      i5 = paramDouble < d4;
      if (i5 >= 0)
      {
        while (j < k)
        {
          arrayOfDouble4 = this.OooO0O0[n];
          paramDouble = arrayOfDouble4[j];
          paramArrayOfDouble[j] = paramDouble;
          j += 1;
        }
        return;
      }
    }
    int i5 = 0;
    arrayOfDouble1 = null;
    for (;;)
    {
      n = i + -1;
      if (i5 >= n) {
        break;
      }
      double[] arrayOfDouble6 = this.OooO00o;
      d1 = arrayOfDouble6[i5];
      int i1 = paramDouble < d1;
      if (i1 == 0)
      {
        i1 = 0;
        arrayOfDouble6 = null;
        while (i1 < k)
        {
          arrayOfDouble2 = this.OooO0O0[i5];
          d4 = arrayOfDouble2[i1];
          paramArrayOfDouble[i1] = d4;
          int i2;
          i1 += 1;
        }
      }
      arrayOfDouble6 = this.OooO00o;
      int i8 = i5 + 1;
      d2 = arrayOfDouble6[i8];
      boolean bool4 = paramDouble < d2;
      if (bool4)
      {
        d3 = arrayOfDouble6[i5];
        d2 -= d3;
        paramDouble = (paramDouble - d3) / d2;
        while (j < k)
        {
          localObject2 = this.OooO0O0;
          arrayOfDouble6 = localObject2[i5];
          d2 = arrayOfDouble6[j];
          localObject2 = localObject2[i8];
          d3 = localObject2[j];
          double d7 = 1.0D - paramDouble;
          d2 *= d7;
          d3 *= paramDouble;
          d2 += d3;
          paramArrayOfDouble[j] = d2;
          j += 1;
        }
        return;
      }
      i5 = i8;
    }
  }
  
  public double OooO0o(double paramDouble, int paramInt)
  {
    double[] arrayOfDouble = this.OooO00o;
    int i = arrayOfDouble.length;
    int j = 0;
    double d1 = arrayOfDouble[0];
    boolean bool1 = paramDouble < d1;
    if (bool1) {}
    int k;
    boolean bool2;
    do
    {
      paramDouble = d1;
      break;
      k = i + -1;
      d1 = arrayOfDouble[k];
      bool2 = paramDouble < d1;
    } while (!bool2);
    for (;;)
    {
      int m = i + -1;
      if (j >= m) {
        break;
      }
      arrayOfDouble = this.OooO00o;
      k = j + 1;
      double d2 = arrayOfDouble[k];
      boolean bool3 = paramDouble < d2;
      if (!bool3)
      {
        paramDouble = arrayOfDouble[j];
        d2 -= paramDouble;
        double[][] arrayOfDouble1 = this.OooO0O0;
        double d3 = arrayOfDouble1[j][paramInt];
        return (arrayOfDouble1[k][paramInt] - d3) / d2;
      }
      j = k;
    }
    return 0.0D;
  }
  
  public void OooO0o0(double paramDouble, float[] paramArrayOfFloat)
  {
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
          d1 = this.OooO0O0[0][i3];
          d2 = this.OooO00o[0];
          d2 = paramDouble - d2;
          localObject2 = this.OooO0o0;
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
          arrayOfDouble1 = this.OooO0O0[m];
          d5 = arrayOfDouble1[j];
          arrayOfDouble2 = this.OooO00o;
          d4 = arrayOfDouble2[m];
          d4 = paramDouble - d4;
          double[] arrayOfDouble3 = this.OooO0o0;
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
      double[] arrayOfDouble4;
      float f3;
      if (!bool2)
      {
        int i6 = 0;
        arrayOfDouble4 = null;
        f3 = 0.0F;
        while (i6 < k)
        {
          double[] arrayOfDouble5 = this.OooO0O0[0];
          d5 = arrayOfDouble5[i6];
          float f4 = (float)d5;
          paramArrayOfFloat[i6] = f4;
          int i7;
          i6 += 1;
        }
        return;
      }
      n = i + -1;
      d4 = arrayOfDouble1[n];
      i5 = paramDouble < d4;
      if (i5 >= 0)
      {
        while (j < k)
        {
          arrayOfDouble4 = this.OooO0O0[n];
          paramDouble = arrayOfDouble4[j];
          f3 = (float)paramDouble;
          paramArrayOfFloat[j] = f3;
          j += 1;
        }
        return;
      }
    }
    int i5 = 0;
    arrayOfDouble1 = null;
    float f1 = 0.0F;
    for (;;)
    {
      n = i + -1;
      if (i5 >= n) {
        break;
      }
      double[] arrayOfDouble6 = this.OooO00o;
      d1 = arrayOfDouble6[i5];
      int i1 = paramDouble < d1;
      if (i1 == 0)
      {
        i1 = 0;
        arrayOfDouble6 = null;
        while (i1 < k)
        {
          arrayOfDouble2 = this.OooO0O0[i5];
          d4 = arrayOfDouble2[i1];
          float f5 = (float)d4;
          paramArrayOfFloat[i1] = f5;
          int i2;
          i1 += 1;
        }
      }
      arrayOfDouble6 = this.OooO00o;
      int i8 = i5 + 1;
      d2 = arrayOfDouble6[i8];
      boolean bool4 = paramDouble < d2;
      if (bool4)
      {
        d3 = arrayOfDouble6[i5];
        d2 -= d3;
        paramDouble = (paramDouble - d3) / d2;
        while (j < k)
        {
          localObject2 = this.OooO0O0;
          arrayOfDouble6 = localObject2[i5];
          d2 = arrayOfDouble6[j];
          localObject2 = localObject2[i8];
          d3 = localObject2[j];
          double d7 = 1.0D - paramDouble;
          d2 *= d7;
          d3 *= paramDouble;
          d2 += d3;
          f2 = (float)d2;
          paramArrayOfFloat[j] = f2;
          j += 1;
        }
        return;
      }
      i5 = i8;
    }
  }
  
  public void OooO0oO(double paramDouble, double[] paramArrayOfDouble)
  {
    double[] arrayOfDouble1 = this.OooO00o;
    int i = arrayOfDouble1.length;
    Object localObject1 = this.OooO0O0;
    int j = 0;
    localObject1 = localObject1[0];
    int k = localObject1.length;
    double d1 = arrayOfDouble1[0];
    boolean bool1 = paramDouble < d1;
    if (!bool1) {}
    int m;
    do
    {
      paramDouble = d1;
      break;
      m = i + -1;
      d1 = arrayOfDouble1[m];
      n = paramDouble < d1;
    } while (n >= 0);
    int n = 0;
    arrayOfDouble1 = null;
    for (;;)
    {
      m = i + -1;
      if (n >= m) {
        break;
      }
      double[] arrayOfDouble2 = this.OooO00o;
      int i1 = n + 1;
      double d2 = arrayOfDouble2[i1];
      boolean bool2 = paramDouble < d2;
      if (!bool2)
      {
        paramDouble = arrayOfDouble2[n];
        d2 -= paramDouble;
        while (j < k)
        {
          Object localObject2 = this.OooO0O0;
          Object localObject3 = localObject2[n];
          double d3 = localObject3[j];
          localObject2 = localObject2[i1];
          paramDouble = (localObject2[j] - d3) / d2;
          paramArrayOfDouble[j] = paramDouble;
          j += 1;
        }
      }
      n = i1;
    }
  }
  
  public double[] getTimePoints()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.LinearCurveFit
 * JD-Core Version:    0.7.0.1
 */