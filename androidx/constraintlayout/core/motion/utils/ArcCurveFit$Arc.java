package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

class ArcCurveFit$Arc
{
  public static double[] OooOOoo = new double[91];
  public double OooO;
  public double[] OooO00o;
  public double OooO0O0;
  public double OooO0OO;
  public double OooO0Oo;
  public double OooO0o;
  public double OooO0o0;
  public double OooO0oO;
  public double OooO0oo;
  public double OooOO0;
  public double OooOO0O;
  public double OooOO0o;
  public double OooOOO;
  public double OooOOO0;
  public double OooOOOO;
  public double OooOOOo;
  public boolean OooOOo;
  public boolean OooOOo0;
  
  public ArcCurveFit$Arc(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    int j = 0;
    this.OooOOo = false;
    int k = 1;
    if (paramInt == k) {
      j = k;
    }
    localArc.OooOOo0 = j;
    localArc.OooO0OO = d1;
    localArc.OooO0Oo = d2;
    double d7 = 1.0D;
    d1 = d2 - d1;
    d1 = d7 / d1;
    localArc.OooO = d1;
    int m = 3;
    if (m == i) {
      localArc.OooOOo = k;
    }
    double d8 = d5 - d3;
    double d9 = d6 - d4;
    boolean bool = localArc.OooOOo;
    if (!bool)
    {
      d7 = Math.abs(d8);
      double d10 = 0.001D;
      bool = d7 < d10;
      if (!bool)
      {
        d7 = Math.abs(d9);
        bool = d7 < d10;
        if (!bool)
        {
          double[] arrayOfDouble = new double[101];
          localArc.OooO00o = arrayOfDouble;
          bool = localArc.OooOOo0;
          if (bool) {
            j = -1;
          } else {
            j = k;
          }
          d6 = j;
          d8 *= d6;
          localArc.OooOO0 = d8;
          if (!bool) {
            k = -1;
          }
          d8 = k;
          d9 *= d8;
          localArc.OooOO0O = d9;
          if (bool) {
            d8 = d5;
          } else {
            d8 = d3;
          }
          localArc.OooOO0o = d8;
          if (bool) {
            d8 = d4;
          } else {
            d8 = paramDouble6;
          }
          localArc.OooOOO0 = d8;
          d1 = paramDouble3;
          d2 = paramDouble4;
          d3 = paramDouble5;
          d4 = paramDouble6;
          OooO00o(paramDouble3, paramDouble4, paramDouble5, paramDouble6);
          d8 = localArc.OooO0O0;
          d9 = localArc.OooO;
          d8 *= d9;
          localArc.OooOOO = d8;
          return;
        }
      }
    }
    localArc.OooOOo = k;
    localArc.OooO0o0 = d3;
    localArc.OooO0o = d5;
    localArc.OooO0oO = d4;
    double d11 = paramDouble6;
    localArc.OooO0oo = paramDouble6;
    d11 = Math.hypot(d9, d8);
    localArc.OooO0O0 = d11;
    double d12 = localArc.OooO;
    d11 *= d12;
    localArc.OooOOO = d11;
    d11 = localArc.OooO0Oo;
    d12 = localArc.OooO0OO;
    d5 = d11 - d12;
    d8 /= d5;
    localArc.OooOO0o = d8;
    d11 -= d12;
    d9 /= d11;
    localArc.OooOOO0 = d9;
  }
  
  public final void OooO00o(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    Arc localArc = this;
    double d1 = paramDouble3 - paramDouble1;
    double d2 = paramDouble2 - paramDouble4;
    int i = 0;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d7;
    for (;;)
    {
      double[] arrayOfDouble1 = OooOOoo;
      j = arrayOfDouble1.length;
      if (i >= j) {
        break;
      }
      double d6 = 90.0D;
      d7 = i * d6;
      j = arrayOfDouble1.length + -1;
      double d8 = d3;
      d3 = j;
      d7 = Math.toRadians(d7 / d3);
      d3 = Math.sin(d7);
      d7 = Math.cos(d7);
      d3 *= d1;
      d7 *= d2;
      if (i > 0)
      {
        d4 = d3 - d4;
        d5 = d7 - d5;
        d4 = Math.hypot(d4, d5);
        d5 = d8;
        d4 += d8;
        arrayOfDouble2 = OooOOoo;
        arrayOfDouble2[i] = d4;
      }
      else
      {
        d5 = d8;
        d4 = d8;
      }
      i += 1;
      d5 = d7;
      double d9 = d3;
      d3 = d4;
      d4 = d9;
    }
    d5 = d3;
    localArc.OooO0O0 = d3;
    int k = 0;
    double[] arrayOfDouble3 = null;
    double[] arrayOfDouble4;
    for (;;)
    {
      arrayOfDouble4 = OooOOoo;
      int m = arrayOfDouble4.length;
      if (k >= m) {
        break;
      }
      d2 = arrayOfDouble4[k] / d5;
      arrayOfDouble4[k] = d2;
      k += 1;
    }
    int j = 0;
    double[] arrayOfDouble2 = null;
    for (;;)
    {
      arrayOfDouble3 = localArc.OooO00o;
      int n = arrayOfDouble3.length;
      if (j >= n) {
        break;
      }
      double d10 = j;
      double d11 = arrayOfDouble3.length + -1;
      d10 /= d11;
      arrayOfDouble3 = OooOOoo;
      k = Arrays.binarySearch(arrayOfDouble3, d10);
      if (k >= 0)
      {
        arrayOfDouble4 = localArc.OooO00o;
        d2 = k;
        arrayOfDouble3 = OooOOoo;
        k = arrayOfDouble3.length + -1;
        d7 = k;
        d2 /= d7;
        arrayOfDouble4[j] = d2;
        d11 = 0.0D;
      }
      else
      {
        int i1 = -1;
        if (k == i1)
        {
          arrayOfDouble3 = localArc.OooO00o;
          d11 = 0.0D;
          arrayOfDouble3[j] = d11;
        }
        else
        {
          d11 = 0.0D;
          k = -k;
          int i2 = k + -2;
          k += -1;
          double d12 = i2;
          double[] arrayOfDouble5 = OooOOoo;
          d4 = arrayOfDouble5[i2];
          d10 -= d4;
          d5 = arrayOfDouble5[k] - d4;
          d10 /= d5;
          d12 += d10;
          k = arrayOfDouble5.length + -1;
          d1 = k;
          d12 /= d1;
          arrayOfDouble3 = localArc.OooO00o;
          arrayOfDouble3[j] = d12;
        }
      }
      j += 1;
    }
  }
  
  public double OooO0O0(double paramDouble)
  {
    return this.OooOO0o;
  }
  
  public double OooO0OO(double paramDouble)
  {
    return this.OooOOO0;
  }
  
  public double OooO0Oo(double paramDouble)
  {
    double d1 = this.OooO0OO;
    paramDouble -= d1;
    d1 = this.OooO;
    paramDouble *= d1;
    d1 = this.OooO0o0;
    double d2 = this.OooO0o - d1;
    paramDouble *= d2;
    return d1 + paramDouble;
  }
  
  public double OooO0o(double paramDouble)
  {
    double d1 = 0.0D;
    boolean bool = paramDouble < d1;
    if (!bool) {
      return d1;
    }
    d1 = 1.0D;
    bool = paramDouble < d1;
    if (!bool) {
      return d1;
    }
    double[] arrayOfDouble = this.OooO00o;
    double d2 = arrayOfDouble.length + -1;
    paramDouble *= d2;
    int i = (int)paramDouble;
    double d3 = i;
    paramDouble -= d3;
    d3 = arrayOfDouble[i];
    i += 1;
    d1 = arrayOfDouble[i] - d3;
    paramDouble *= d1;
    return d3 + paramDouble;
  }
  
  public double OooO0o0(double paramDouble)
  {
    double d1 = this.OooO0OO;
    paramDouble -= d1;
    d1 = this.OooO;
    paramDouble *= d1;
    d1 = this.OooO0oO;
    double d2 = this.OooO0oo - d1;
    paramDouble *= d2;
    return d1 + paramDouble;
  }
  
  public double getDX()
  {
    double d1 = this.OooOO0;
    double d2 = this.OooOOOo;
    d1 *= d2;
    d2 = -this.OooOO0O;
    double d3 = this.OooOOOO;
    d2 *= d3;
    d3 = this.OooOOO;
    d2 = Math.hypot(d1, d2);
    d3 /= d2;
    boolean bool = this.OooOOo0;
    if (bool) {
      d1 = -d1;
    }
    return d1 * d3;
  }
  
  public double getDY()
  {
    double d1 = this.OooOO0;
    double d2 = this.OooOOOo;
    d1 *= d2;
    d2 = -this.OooOO0O;
    double d3 = this.OooOOOO;
    d2 *= d3;
    d3 = this.OooOOO;
    d1 = Math.hypot(d1, d2);
    d3 /= d1;
    boolean bool = this.OooOOo0;
    if (bool) {
      d1 = -d2 * d3;
    } else {
      d1 = d2 * d3;
    }
    return d1;
  }
  
  public double getX()
  {
    double d1 = this.OooOO0o;
    double d2 = this.OooOO0;
    double d3 = this.OooOOOO;
    d2 *= d3;
    return d1 + d2;
  }
  
  public double getY()
  {
    double d1 = this.OooOOO0;
    double d2 = this.OooOO0O;
    double d3 = this.OooOOOo;
    d2 *= d3;
    return d1 + d2;
  }
  
  public void setPoint(double paramDouble)
  {
    boolean bool = this.OooOOo0;
    if (bool)
    {
      d = this.OooO0Oo - paramDouble;
    }
    else
    {
      d = this.OooO0OO;
      d = paramDouble - d;
    }
    paramDouble = this.OooO;
    d *= paramDouble;
    double d = OooO0o(d) * 1.570796326794897D;
    paramDouble = Math.sin(d);
    this.OooOOOO = paramDouble;
    paramDouble = Math.cos(d);
    this.OooOOOo = paramDouble;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc
 * JD-Core Version:    0.7.0.1
 */