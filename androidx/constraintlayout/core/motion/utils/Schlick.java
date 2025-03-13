package androidx.constraintlayout.core.motion.utils;

public class Schlick
  extends Easing
{
  public double OooO0Oo;
  public double OooO0o0;
  
  public Schlick(String paramString)
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
  }
  
  public double OooO00o(double paramDouble)
  {
    return OooO0o0(paramDouble);
  }
  
  public double OooO0O0(double paramDouble)
  {
    return OooO0Oo(paramDouble);
  }
  
  public final double OooO0Oo(double paramDouble)
  {
    double d1 = this.OooO0o0;
    boolean bool = paramDouble < d1;
    if (bool)
    {
      d2 = this.OooO0Oo;
      d3 = d2 * d1 * d1;
      d4 = (d1 - paramDouble) * d2 + paramDouble;
      d1 -= paramDouble;
      d2 = d2 * d1 + paramDouble;
      d4 *= d2;
      return d3 / d4;
    }
    double d2 = this.OooO0Oo;
    double d3 = 1.0D;
    double d4 = (d1 - d3) * d2;
    double d5 = d1 - d3;
    d4 *= d5;
    d5 = -d2;
    double d6 = d1 - paramDouble;
    d5 = d5 * d6 - paramDouble + d3;
    d2 = -d2;
    d1 -= paramDouble;
    d2 = d2 * d1 - paramDouble + d3;
    d5 *= d2;
    return d4 / d5;
  }
  
  public final double OooO0o0(double paramDouble)
  {
    double d1 = this.OooO0o0;
    boolean bool = paramDouble < d1;
    if (bool)
    {
      d2 = d1 * paramDouble;
      d3 = this.OooO0Oo;
      d1 -= paramDouble;
      d3 *= d1;
      paramDouble += d3;
      return d2 / paramDouble;
    }
    double d2 = 1.0D;
    double d3 = d2 - d1;
    double d4 = paramDouble - d2;
    d3 *= d4;
    d2 -= paramDouble;
    d4 = this.OooO0Oo;
    d1 -= paramDouble;
    d4 *= d1;
    d2 -= d4;
    return d3 / d2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.Schlick
 * JD-Core Version:    0.7.0.1
 */