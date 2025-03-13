package androidx.constraintlayout.core.motion.utils;

class CurveFit$Constant
  extends CurveFit
{
  public double OooO00o;
  public double[] OooO0O0;
  
  public CurveFit$Constant(double paramDouble, double[] paramArrayOfDouble)
  {
    this.OooO00o = paramDouble;
    this.OooO0O0 = paramArrayOfDouble;
  }
  
  public double OooO0OO(double paramDouble, int paramInt)
  {
    return this.OooO0O0[paramInt];
  }
  
  public void OooO0Oo(double paramDouble, double[] paramArrayOfDouble)
  {
    double[] arrayOfDouble = this.OooO0O0;
    int i = arrayOfDouble.length;
    System.arraycopy(arrayOfDouble, 0, paramArrayOfDouble, 0, i);
  }
  
  public double OooO0o(double paramDouble, int paramInt)
  {
    return 0.0D;
  }
  
  public void OooO0o0(double paramDouble, float[] paramArrayOfFloat)
  {
    int i = 0;
    for (;;)
    {
      double[] arrayOfDouble = this.OooO0O0;
      int j = arrayOfDouble.length;
      if (i >= j) {
        break;
      }
      double d = arrayOfDouble[i];
      float f = (float)d;
      paramArrayOfFloat[i] = f;
      i += 1;
    }
  }
  
  public void OooO0oO(double paramDouble, double[] paramArrayOfDouble)
  {
    int i = 0;
    for (;;)
    {
      double[] arrayOfDouble = this.OooO0O0;
      int j = arrayOfDouble.length;
      if (i >= j) {
        break;
      }
      double d = 0.0D;
      paramArrayOfDouble[i] = d;
      i += 1;
    }
  }
  
  public double[] getTimePoints()
  {
    double[] arrayOfDouble = new double[1];
    double d = this.OooO00o;
    arrayOfDouble[0] = d;
    return arrayOfDouble;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.CurveFit.Constant
 * JD-Core Version:    0.7.0.1
 */