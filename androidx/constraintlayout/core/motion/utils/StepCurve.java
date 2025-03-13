package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StepCurve
  extends Easing
{
  public MonotonicCurveFit OooO0Oo;
  
  public StepCurve(String paramString)
  {
    this.OooO00o = paramString;
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
    paramString = OooO0Oo(Arrays.copyOf(arrayOfDouble, j));
    this.OooO0Oo = paramString;
  }
  
  public static MonotonicCurveFit OooO0Oo(double[] paramArrayOfDouble)
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
    Object localObject3 = new double[i];
    int m = 0;
    for (;;)
    {
      int n = localObject1.length;
      if (m >= n) {
        break;
      }
      double d3 = localObject1[m];
      int i1 = m + j;
      Object localObject4 = localObject2[i1];
      localObject4[0] = d3;
      double d4 = m * d1;
      localObject3[i1] = d4;
      if (m > 0)
      {
        i1 = j * 2 + m;
        Object localObject5 = localObject2[i1];
        double d5 = d3 + d2;
        localObject5[0] = d5;
        double d6 = d4 + d2;
        localObject3[i1] = d6;
        i1 = m + -1;
        localObject5 = localObject2[i1];
        d3 = d3 - d2 - d1;
        localObject5[0] = d3;
        d3 = -1.0D;
        d4 = d4 + d3 - d1;
        localObject3[i1] = d4;
      }
      m += 1;
    }
    localObject1 = new androidx/constraintlayout/core/motion/utils/MonotonicCurveFit;
    ((MonotonicCurveFit)localObject1).<init>((double[])localObject3, (double[][])localObject2);
    localObject3 = System.out;
    Object localObject6 = new java/lang/StringBuilder;
    ((StringBuilder)localObject6).<init>();
    ((StringBuilder)localObject6).append(" 0 ");
    double d7 = ((MonotonicCurveFit)localObject1).OooO0OO(0.0D, 0);
    ((StringBuilder)localObject6).append(d7);
    localObject6 = ((StringBuilder)localObject6).toString();
    ((PrintStream)localObject3).println((String)localObject6);
    localObject3 = System.out;
    localObject6 = new java/lang/StringBuilder;
    ((StringBuilder)localObject6).<init>();
    ((StringBuilder)localObject6).append(" 1 ");
    d7 = ((MonotonicCurveFit)localObject1).OooO0OO(d2, 0);
    ((StringBuilder)localObject6).append(d7);
    localObject6 = ((StringBuilder)localObject6).toString();
    ((PrintStream)localObject3).println((String)localObject6);
    return localObject1;
  }
  
  public double OooO00o(double paramDouble)
  {
    return this.OooO0Oo.OooO0OO(paramDouble, 0);
  }
  
  public double OooO0O0(double paramDouble)
  {
    return this.OooO0Oo.OooO0o(paramDouble, 0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.StepCurve
 * JD-Core Version:    0.7.0.1
 */