package androidx.constraintlayout.core.motion.utils;

public class HyperSpline$Cubic
{
  public double OooO00o;
  public double OooO0O0;
  public double OooO0OO;
  public double OooO0Oo;
  
  public HyperSpline$Cubic(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    this.OooO00o = paramDouble1;
    this.OooO0O0 = paramDouble2;
    this.OooO0OO = paramDouble3;
    this.OooO0Oo = paramDouble4;
  }
  
  public double OooO00o(double paramDouble)
  {
    double d1 = this.OooO0Oo * paramDouble;
    double d2 = this.OooO0OO;
    d1 = (d1 + d2) * paramDouble;
    d2 = this.OooO0O0;
    d1 = (d1 + d2) * paramDouble;
    paramDouble = this.OooO00o;
    return d1 + paramDouble;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic
 * JD-Core Version:    0.7.0.1
 */