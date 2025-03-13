package androidx.appcompat.app;

class TwilightCalculator
{
  public static TwilightCalculator OooO0Oo;
  public long OooO00o;
  public long OooO0O0;
  public int OooO0OO;
  
  public static TwilightCalculator getInstance()
  {
    TwilightCalculator localTwilightCalculator = OooO0Oo;
    if (localTwilightCalculator == null)
    {
      localTwilightCalculator = new androidx/appcompat/app/TwilightCalculator;
      localTwilightCalculator.<init>();
      OooO0Oo = localTwilightCalculator;
    }
    return OooO0Oo;
  }
  
  public void OooO00o(long paramLong, double paramDouble1, double paramDouble2)
  {
    TwilightCalculator localTwilightCalculator = this;
    long l1 = 946728000000L;
    long l2 = paramLong - l1;
    float f1 = (float)l2 / 86400000.0F;
    float f2 = 0.01720197F * f1;
    float f3 = 6.24006F;
    f2 += f3;
    double d1 = f2;
    double d2 = Math.sin(d1) * 0.03341960161924362D + d1;
    double d3 = Math.sin(2.0F * f2) * 0.0003490659873933D;
    d2 += d3;
    float f4 = 3.0F;
    d3 = Math.sin(f2 * f4) * 5.236000106378924E-006D;
    d2 = d2 + d3 + 1.796593063D + 3.141592653589793D;
    d3 = paramDouble2;
    d3 = -paramDouble2 / 360.0D;
    f2 = 0.0009F;
    long l3 = Math.round(f1 - f2 - d3);
    f1 = (float)l3 + f2;
    double d4 = f1 + d3;
    d1 = Math.sin(d1) * 0.0053D;
    d4 += d1;
    d1 = Math.sin(2.0D * d2) * -0.0069D;
    d4 += d1;
    d1 = Math.sin(d2);
    d3 = Math.sin(0.4092797040939331D);
    d1 = Math.asin(d1 * d3);
    d3 = 0.0174532923847437D * paramDouble1;
    long l4 = -4631161762379464704L;
    d2 = Math.sin(-0.1047197580337524D);
    double d5 = Math.sin(d3);
    double d6 = Math.sin(d1);
    d5 *= d6;
    d2 -= d5;
    d3 = Math.cos(d3);
    d1 = Math.cos(d1);
    d3 *= d1;
    d2 /= d3;
    d1 = 1.0D;
    boolean bool1 = d2 < d1;
    int i = 1;
    long l5 = -1;
    d3 = 0.0D / 0.0D;
    if (!bool1) {}
    for (this.OooO0OO = i;; this.OooO0OO = 0)
    {
      localTwilightCalculator.OooO00o = l5;
      localTwilightCalculator.OooO0O0 = l5;
      return;
      l3 = -4616189618054758400L;
      d5 = -1.0D;
      bool1 = d2 < d5;
      if (bool1) {
        break;
      }
    }
    f3 = (float)(Math.acos(d2) / 6.283185307179586D);
    d3 = f3;
    d2 = d4 + d3;
    double d7 = 86400000.0D;
    d2 *= d7;
    l4 = Math.round(d2) + l1;
    this.OooO00o = l4;
    d4 = (d4 - d3) * d7;
    l2 = Math.round(d4) + l1;
    this.OooO0O0 = l2;
    boolean bool2 = l2 < paramLong;
    if (bool2)
    {
      l1 = this.OooO00o;
      bool2 = l1 < paramLong;
      if (bool2)
      {
        this.OooO0OO = 0;
        return;
      }
    }
    localTwilightCalculator.OooO0OO = i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.TwilightCalculator
 * JD-Core Version:    0.7.0.1
 */