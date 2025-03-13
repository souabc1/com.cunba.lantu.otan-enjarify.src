package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import java.lang.reflect.Array;

public class SplineSet$CustomSet
  extends SplineSet
{
  public KeyFrameArray.CustomArray OooO0o;
  public float[] OooO0oO;
  
  public void setPoint(int paramInt, float paramFloat)
  {
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    localRuntimeException.<init>("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    throw localRuntimeException;
  }
  
  public void setPoint(int paramInt, CustomAttribute paramCustomAttribute)
  {
    this.OooO0o.OooO00o(paramInt, paramCustomAttribute);
  }
  
  public void setup(int paramInt)
  {
    KeyFrameArray.CustomArray localCustomArray = this.OooO0o;
    int i = localCustomArray.OooO0o0();
    int j = this.OooO0o.OooO0o(0).OooO0Oo();
    double[] arrayOfDouble = new double[i];
    float[] arrayOfFloat1 = new float[j];
    this.OooO0oO = arrayOfFloat1;
    Object localObject1 = { i, j };
    localObject1 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject1);
    int k = 0;
    arrayOfFloat1 = null;
    while (k < i)
    {
      int m = this.OooO0o.OooO0OO(k);
      Object localObject2 = this.OooO0o.OooO0o(k);
      double d1 = m;
      double d2 = 0.01D;
      d1 *= d2;
      arrayOfDouble[k] = d1;
      float[] arrayOfFloat2 = this.OooO0oO;
      ((CustomAttribute)localObject2).OooO0O0(arrayOfFloat2);
      m = 0;
      arrayOfFloat2 = null;
      for (;;)
      {
        localObject2 = this.OooO0oO;
        int n = localObject2.length;
        if (m >= n) {
          break;
        }
        Object localObject3 = localObject1[k];
        float f = localObject2[m];
        double d3 = f;
        localObject3[m] = d3;
        m += 1;
      }
      k += 1;
    }
    CurveFit localCurveFit = CurveFit.OooO00o(paramInt, arrayOfDouble, (double[][])localObject1);
    this.OooO00o = localCurveFit;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.SplineSet.CustomSet
 * JD-Core Version:    0.7.0.1
 */