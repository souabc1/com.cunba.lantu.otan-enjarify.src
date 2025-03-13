package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public abstract class SplineSet
{
  public CurveFit OooO00o;
  public int[] OooO0O0;
  public float[] OooO0OO;
  public int OooO0Oo;
  public String OooO0o0;
  
  public SplineSet()
  {
    int i = 10;
    int[] arrayOfInt = new int[i];
    this.OooO0O0 = arrayOfInt;
    float[] arrayOfFloat = new float[i];
    this.OooO0OO = arrayOfFloat;
  }
  
  public float OooO00o(float paramFloat)
  {
    CurveFit localCurveFit = this.OooO00o;
    double d = paramFloat;
    return (float)localCurveFit.OooO0OO(d, 0);
  }
  
  public float OooO0O0(float paramFloat)
  {
    CurveFit localCurveFit = this.OooO00o;
    double d = paramFloat;
    return (float)localCurveFit.OooO0o(d, 0);
  }
  
  public CurveFit getCurveFit()
  {
    return this.OooO00o;
  }
  
  public void setPoint(int paramInt, float paramFloat)
  {
    Object localObject = this.OooO0O0;
    int i = localObject.length;
    int j = this.OooO0Oo + 1;
    if (i < j)
    {
      i = localObject.length * 2;
      localObject = Arrays.copyOf((int[])localObject, i);
      this.OooO0O0 = ((int[])localObject);
      localObject = this.OooO0OO;
      i = localObject.length * 2;
      localObject = Arrays.copyOf((float[])localObject, i);
      this.OooO0OO = ((float[])localObject);
    }
    localObject = this.OooO0O0;
    i = this.OooO0Oo;
    localObject[i] = paramInt;
    this.OooO0OO[i] = paramFloat;
    i += 1;
    this.OooO0Oo = i;
  }
  
  public void setType(String paramString)
  {
    this.OooO0o0 = paramString;
  }
  
  public void setup(int paramInt)
  {
    int i = this.OooO0Oo;
    if (i == 0) {
      return;
    }
    Object localObject1 = this.OooO0O0;
    Object localObject2 = this.OooO0OO;
    int j = 1;
    i -= j;
    SplineSet.Sort.OooO00o((int[])localObject1, (float[])localObject2, 0, i);
    i = j;
    int k = j;
    int n;
    for (;;)
    {
      m = this.OooO0Oo;
      if (i >= m) {
        break;
      }
      localObject2 = this.OooO0O0;
      n = i + -1;
      n = localObject2[n];
      m = localObject2[i];
      if (n != m) {
        k += 1;
      }
      i += 1;
    }
    double[] arrayOfDouble = new double[k];
    localObject1 = new int[] { k, j };
    localObject1 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject1);
    int m = 0;
    localObject2 = null;
    j = 0;
    for (;;)
    {
      n = this.OooO0Oo;
      if (m >= n) {
        break;
      }
      int[] arrayOfInt;
      if (m > 0)
      {
        arrayOfInt = this.OooO0O0;
        int i1 = arrayOfInt[m];
        int i2 = m + -1;
        n = arrayOfInt[i2];
        if (i1 == n) {}
      }
      else
      {
        n = this.OooO0O0[m];
        double d1 = n;
        double d2 = 0.01D;
        d1 *= d2;
        arrayOfDouble[j] = d1;
        arrayOfInt = localObject1[j];
        float[] arrayOfFloat = this.OooO0OO;
        float f = arrayOfFloat[m];
        double d3 = f;
        arrayOfInt[0] = d3;
        j += 1;
      }
      m += 1;
    }
    CurveFit localCurveFit = CurveFit.OooO00o(paramInt, arrayOfDouble, (double[][])localObject1);
    this.OooO00o = localCurveFit;
  }
  
  public String toString()
  {
    String str = this.OooO0o0;
    DecimalFormat localDecimalFormat = new java/text/DecimalFormat;
    localDecimalFormat.<init>("##.##");
    int i = 0;
    for (;;)
    {
      int j = this.OooO0Oo;
      if (i >= j) {
        break;
      }
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str);
      localStringBuilder.append("[");
      int k = this.OooO0O0[i];
      localStringBuilder.append(k);
      localStringBuilder.append(" , ");
      float f = this.OooO0OO[i];
      double d = f;
      str = localDecimalFormat.format(d);
      localStringBuilder.append(str);
      localStringBuilder.append("] ");
      str = localStringBuilder.toString();
      i += 1;
    }
    return str;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.SplineSet
 * JD-Core Version:    0.7.0.1
 */