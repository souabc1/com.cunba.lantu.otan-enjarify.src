package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomVariable;
import java.lang.reflect.Array;

public class TimeCycleSplineSet$CustomVarSet
  extends TimeCycleSplineSet
{
  public KeyFrameArray.CustomVar OooOO0o;
  public float[] OooOOO;
  public KeyFrameArray.FloatArray OooOOO0;
  public float[] OooOOOO;
  
  public void setup(int paramInt)
  {
    KeyFrameArray.CustomVar localCustomVar = this.OooOO0o;
    int i = localCustomVar.OooO0o0();
    CustomVariable localCustomVariable = this.OooOO0o.OooO0o(0);
    int j = localCustomVariable.OooO0OO();
    double[] arrayOfDouble = new double[i];
    int k = j + 2;
    float[] arrayOfFloat1 = new float[k];
    this.OooOOO = arrayOfFloat1;
    arrayOfFloat1 = new float[j];
    this.OooOOOO = arrayOfFloat1;
    Object localObject1 = { i, k };
    localObject1 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject1);
    int m = 0;
    arrayOfFloat1 = null;
    while (m < i)
    {
      int n = this.OooOO0o.OooO0OO(m);
      Object localObject2 = this.OooOO0o.OooO0o(m);
      float[] arrayOfFloat2 = this.OooOOO0.OooO0O0(m);
      double d1 = n;
      double d2 = 0.01D;
      d1 *= d2;
      arrayOfDouble[m] = d1;
      float[] arrayOfFloat3 = this.OooOOO;
      ((CustomVariable)localObject2).OooO0O0(arrayOfFloat3);
      n = 0;
      arrayOfFloat3 = null;
      for (;;)
      {
        localObject2 = this.OooOOO;
        i1 = localObject2.length;
        if (n >= i1) {
          break;
        }
        Object localObject3 = localObject1[m];
        f = localObject2[n];
        double d3 = f;
        localObject3[n] = d3;
        n += 1;
      }
      arrayOfFloat3 = localObject1[m];
      d1 = arrayOfFloat2[0];
      arrayOfFloat3[j] = d1;
      int i2 = 1;
      int i1 = j + 1;
      float f = arrayOfFloat2[i2];
      double d4 = f;
      arrayOfFloat3[i1] = d4;
      m += 1;
    }
    CurveFit localCurveFit = CurveFit.OooO00o(paramInt, arrayOfDouble, (double[][])localObject1);
    this.OooO00o = localCurveFit;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.CustomVarSet
 * JD-Core Version:    0.7.0.1
 */