package androidx.constraintlayout.core.motion.utils;

public abstract class CurveFit
{
  public static CurveFit OooO00o(int paramInt, double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    int i = paramArrayOfDouble.length;
    int j = 1;
    int k = 2;
    if (i == j) {
      paramInt = k;
    }
    if (paramInt != 0)
    {
      if (paramInt != k)
      {
        localObject = new androidx/constraintlayout/core/motion/utils/LinearCurveFit;
        ((LinearCurveFit)localObject).<init>(paramArrayOfDouble, paramArrayOfDouble1);
        return localObject;
      }
      localObject = new androidx/constraintlayout/core/motion/utils/CurveFit$Constant;
      double d = paramArrayOfDouble[0];
      paramArrayOfDouble = paramArrayOfDouble1[0];
      ((CurveFit.Constant)localObject).<init>(d, paramArrayOfDouble);
      return localObject;
    }
    Object localObject = new androidx/constraintlayout/core/motion/utils/MonotonicCurveFit;
    ((MonotonicCurveFit)localObject).<init>(paramArrayOfDouble, paramArrayOfDouble1);
    return localObject;
  }
  
  public static CurveFit OooO0O0(int[] paramArrayOfInt, double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    ArcCurveFit localArcCurveFit = new androidx/constraintlayout/core/motion/utils/ArcCurveFit;
    localArcCurveFit.<init>(paramArrayOfInt, paramArrayOfDouble, paramArrayOfDouble1);
    return localArcCurveFit;
  }
  
  public abstract double OooO0OO(double paramDouble, int paramInt);
  
  public abstract void OooO0Oo(double paramDouble, double[] paramArrayOfDouble);
  
  public abstract double OooO0o(double paramDouble, int paramInt);
  
  public abstract void OooO0o0(double paramDouble, float[] paramArrayOfFloat);
  
  public abstract void OooO0oO(double paramDouble, double[] paramArrayOfDouble);
  
  public abstract double[] getTimePoints();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.CurveFit
 * JD-Core Version:    0.7.0.1
 */