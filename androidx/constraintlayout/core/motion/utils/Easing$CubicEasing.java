package androidx.constraintlayout.core.motion.utils;

class Easing$CubicEasing
  extends Easing
{
  public static double OooO = 0.0001D;
  public static double OooO0oo = 0.01D;
  public double OooO0Oo;
  public double OooO0o;
  public double OooO0o0;
  public double OooO0oO;
  
  public Easing$CubicEasing(String paramString)
  {
    this.OooO00o = paramString;
    int i = paramString.indexOf('(');
    int j = 44;
    int k = paramString.indexOf(j, i);
    i += 1;
    double d1 = Double.parseDouble(paramString.substring(i, k).trim());
    this.OooO0Oo = d1;
    k += 1;
    i = paramString.indexOf(j, k);
    double d2 = Double.parseDouble(paramString.substring(k, i).trim());
    this.OooO0o0 = d2;
    i += 1;
    j = paramString.indexOf(j, i);
    d2 = Double.parseDouble(paramString.substring(i, j).trim());
    this.OooO0o = d2;
    j += 1;
    i = paramString.indexOf(')', j);
    double d3 = Double.parseDouble(paramString.substring(j, i).trim());
    this.OooO0oO = d3;
  }
  
  public double OooO00o(double paramDouble)
  {
    double d1 = 0.0D;
    boolean bool1 = paramDouble < d1;
    if (!bool1) {
      return d1;
    }
    d1 = 1.0D;
    bool1 = paramDouble < d1;
    if (!bool1) {
      return d1;
    }
    d1 = 0.5D;
    double d2 = d1;
    double d3 = d1;
    for (;;)
    {
      d4 = OooO0oo;
      boolean bool2 = d2 < d4;
      if (!bool2) {
        break;
      }
      d4 = OooO0Oo(d3);
      d2 *= d1;
      bool2 = d4 < paramDouble;
      if (bool2) {
        d3 += d2;
      } else {
        d3 -= d2;
      }
    }
    d1 = d3 - d2;
    double d4 = OooO0Oo(d1);
    d3 += d2;
    d2 = OooO0Oo(d3);
    d1 = OooO0o0(d1);
    d3 = OooO0o0(d3) - d1;
    paramDouble -= d4;
    d3 *= paramDouble;
    d2 -= d4;
    return d3 / d2 + d1;
  }
  
  public double OooO0O0(double paramDouble)
  {
    double d1 = 0.5D;
    double d2 = d1;
    double d3 = d1;
    for (;;)
    {
      double d4 = OooO;
      boolean bool = d2 < d4;
      if (!bool) {
        break;
      }
      d4 = OooO0Oo(d3);
      d2 *= d1;
      bool = d4 < paramDouble;
      if (bool) {
        d3 += d2;
      } else {
        d3 -= d2;
      }
    }
    paramDouble = d3 - d2;
    d1 = OooO0Oo(paramDouble);
    d3 += d2;
    d2 = OooO0Oo(d3);
    paramDouble = OooO0o0(paramDouble);
    d3 = OooO0o0(d3) - paramDouble;
    d2 -= d1;
    return d3 / d2;
  }
  
  public final double OooO0Oo(double paramDouble)
  {
    double d1 = 1.0D - paramDouble;
    double d2 = 3.0D * d1;
    d1 = d1 * d2 * paramDouble;
    d2 = d2 * paramDouble * paramDouble;
    double d3 = paramDouble * paramDouble * paramDouble;
    paramDouble = this.OooO0Oo * d1;
    d1 = this.OooO0o * d2;
    return paramDouble + d1 + d3;
  }
  
  public final double OooO0o0(double paramDouble)
  {
    double d1 = 1.0D - paramDouble;
    double d2 = 3.0D * d1;
    d1 = d1 * d2 * paramDouble;
    d2 = d2 * paramDouble * paramDouble;
    double d3 = paramDouble * paramDouble * paramDouble;
    paramDouble = this.OooO0o0 * d1;
    d1 = this.OooO0oO * d2;
    return paramDouble + d1 + d3;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.Easing.CubicEasing
 * JD-Core Version:    0.7.0.1
 */