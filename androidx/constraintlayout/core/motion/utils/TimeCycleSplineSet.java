package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.Format;

public abstract class TimeCycleSplineSet
{
  public static float OooOO0O = 6.283186F;
  public long OooO;
  public CurveFit OooO00o;
  public int OooO0O0 = 0;
  public int[] OooO0OO;
  public float[][] OooO0Oo;
  public String OooO0o;
  public int OooO0o0;
  public float[] OooO0oO;
  public boolean OooO0oo;
  public float OooOO0;
  
  public TimeCycleSplineSet()
  {
    int i = 10;
    int[] arrayOfInt = new int[i];
    this.OooO0OO = arrayOfInt;
    int j = 3;
    Object localObject = { i, j };
    localObject = (float[][])Array.newInstance(Float.TYPE, (int[])localObject);
    this.OooO0Oo = ((float[][])localObject);
    localObject = new float[j];
    this.OooO0oO = ((float[])localObject);
    this.OooO0oo = false;
    this.OooOO0 = (0.0F / 0.0F);
  }
  
  public float OooO00o(float paramFloat)
  {
    int i = this.OooO0O0;
    float f1 = 2.0F;
    float f2 = 1.0F;
    switch (i)
    {
    default: 
      f3 = OooOO0O;
      return (float)Math.sin(paramFloat * f3);
    case 6: 
      i = 1082130432;
      f3 = 4.0F;
      paramFloat = Math.abs(paramFloat * f3 % f3 - f1);
      paramFloat = f2 - paramFloat;
      paramFloat *= paramFloat;
    case 5: 
    case 4: 
    case 3: 
    case 2: 
      for (;;)
      {
        return f2 - paramFloat;
        f3 = OooOO0O;
        return (float)Math.cos(paramFloat * f3);
        paramFloat = (paramFloat * f1 + f2) % f1;
        continue;
        return (paramFloat * f1 + f2) % f1 - f2;
        paramFloat = Math.abs(paramFloat);
      }
    }
    float f3 = OooOO0O;
    return Math.signum(paramFloat * f3);
  }
  
  public void OooO0O0(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, float paramFloat3)
  {
    int[] arrayOfInt = this.OooO0OO;
    int i = this.OooO0o0;
    arrayOfInt[i] = paramInt1;
    float[] arrayOfFloat = this.OooO0Oo[i];
    arrayOfFloat[0] = paramFloat1;
    int j = 1;
    arrayOfFloat[j] = paramFloat2;
    arrayOfFloat[2] = paramFloat3;
    paramInt1 = Math.max(this.OooO0O0, paramInt2);
    this.OooO0O0 = paramInt1;
    paramInt1 = this.OooO0o0 + j;
    this.OooO0o0 = paramInt1;
  }
  
  public CurveFit getCurveFit()
  {
    return this.OooO00o;
  }
  
  public void setStartTime(long paramLong)
  {
    this.OooO = paramLong;
  }
  
  public void setType(String paramString)
  {
    this.OooO0o = paramString;
  }
  
  public void setup(int paramInt)
  {
    int i = this.OooO0o0;
    if (i == 0)
    {
      localObject1 = System.err;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Error no points added to ");
      localObject3 = this.OooO0o;
      ((StringBuilder)localObject2).append((String)localObject3);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((PrintStream)localObject1).println((String)localObject2);
      return;
    }
    Object localObject3 = this.OooO0OO;
    Object localObject4 = this.OooO0Oo;
    int j = 1;
    i -= j;
    TimeCycleSplineSet.Sort.OooO00o((int[])localObject3, (float[][])localObject4, 0, i);
    i = j;
    int k = 0;
    localObject3 = null;
    int n;
    for (;;)
    {
      localObject4 = this.OooO0OO;
      m = localObject4.length;
      if (i >= m) {
        break;
      }
      m = localObject4[i];
      n = i + -1;
      i1 = localObject4[n];
      if (m != i1) {
        k += 1;
      }
      i += 1;
    }
    if (k == 0) {
      k = j;
    }
    Object localObject2 = new double[k];
    localObject3 = new int[] { k, 3 };
    localObject3 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject3);
    int i1 = 0;
    localObject4 = null;
    int m = 0;
    for (;;)
    {
      n = this.OooO0o0;
      if (i1 >= n) {
        break;
      }
      int[] arrayOfInt;
      int i3;
      if (i1 > 0)
      {
        arrayOfInt = this.OooO0OO;
        int i2 = arrayOfInt[i1];
        i3 = i1 + -1;
        n = arrayOfInt[i3];
        if (i2 == n) {}
      }
      else
      {
        n = this.OooO0OO[i1];
        double d1 = n * 0.01D;
        localObject2[m] = d1;
        arrayOfInt = localObject3[m];
        float[] arrayOfFloat = this.OooO0Oo[i1];
        double d2 = arrayOfFloat[0];
        arrayOfInt[0] = d2;
        d2 = arrayOfFloat[j];
        arrayOfInt[j] = d2;
        i3 = 2;
        float f = arrayOfFloat[i3];
        double d3 = f;
        arrayOfInt[i3] = d3;
        m += 1;
      }
      i1 += 1;
    }
    Object localObject1 = CurveFit.OooO00o(paramInt, (double[])localObject2, (double[][])localObject3);
    this.OooO00o = ((CurveFit)localObject1);
  }
  
  public String toString()
  {
    Object localObject = this.OooO0o;
    DecimalFormat localDecimalFormat = new java/text/DecimalFormat;
    localDecimalFormat.<init>("##.##");
    int i = 0;
    for (;;)
    {
      int j = this.OooO0o0;
      if (i >= j) {
        break;
      }
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append((String)localObject);
      localStringBuilder.append("[");
      int k = this.OooO0OO[i];
      localStringBuilder.append(k);
      localStringBuilder.append(" , ");
      localObject = this.OooO0Oo[i];
      localObject = localDecimalFormat.format(localObject);
      localStringBuilder.append((String)localObject);
      localStringBuilder.append("] ");
      localObject = localStringBuilder.toString();
      i += 1;
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
 * JD-Core Version:    0.7.0.1
 */