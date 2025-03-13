package androidx.core.graphics;

import android.graphics.Color;

public final class ColorUtils
{
  public static final ThreadLocal OooO00o;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    OooO00o = localThreadLocal;
  }
  
  public static int OooO(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 >= paramInt2) {
      paramInt2 = Math.min(paramInt1, paramInt3);
    }
    return paramInt2;
  }
  
  public static void OooO00o(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble)
  {
    Object localObject = paramArrayOfDouble;
    int i = paramArrayOfDouble.length;
    int j = 3;
    if (i == j)
    {
      i = paramInt1;
      double d1 = paramInt1;
      double d2 = 255.0D;
      d1 /= d2;
      double d3 = 0.04045D;
      boolean bool1 = d1 < d3;
      double d4 = 12.92D;
      double d5 = 2.4D;
      double d6 = 1.055D;
      double d7 = 0.055D;
      if (bool1) {
        d1 /= d4;
      } else {
        d1 = Math.pow((d1 + d7) / d6, d5);
      }
      int k = paramInt2;
      d5 = paramInt2 / d2;
      boolean bool2 = d5 < d3;
      if (bool2)
      {
        d5 /= d4;
      }
      else
      {
        d5 = (d5 + d7) / d6;
        d6 = 2.4D;
        d5 = Math.pow(d5, d6);
      }
      int m = paramInt3;
      d6 = paramInt3 / d2;
      boolean bool3 = d6 < d3;
      if (bool3)
      {
        d6 /= d4;
      }
      else
      {
        d6 = (d6 + d7) / 1.055D;
        d2 = 2.4D;
        d6 = Math.pow(d6, d2);
      }
      d2 = 0.4124D * d1;
      d3 = 0.3576D * d5;
      d2 += d3;
      d3 = 0.1805D * d6;
      d2 += d3;
      d3 = 100.0D;
      d2 *= d3;
      localObject[0] = d2;
      d2 = 0.2126D * d1;
      double d8 = 0.7152D * d5;
      d2 += d8;
      d8 = 0.0722D * d6;
      d2 = (d2 + d8) * d3;
      localObject[1] = d2;
      d1 *= 0.0193D;
      d5 *= 0.1192D;
      d1 += d5;
      d6 *= 0.9505D;
      d1 = (d1 + d6) * d3;
      localObject[2] = d1;
      return;
    }
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("outXyz must have a length of 3.");
    throw ((Throwable)localObject);
  }
  
  public static int OooO0O0(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d1 = 3.2406D * paramDouble1;
    double d2 = -1.5372D * paramDouble2;
    d1 += d2;
    d2 = -0.4986D * paramDouble3;
    d1 += d2;
    d2 = 100.0D;
    d1 /= d2;
    double d3 = -0.9689D * paramDouble1;
    double d4 = 1.8758D * paramDouble2;
    d3 += d4;
    d4 = 0.0415D * paramDouble3;
    d3 = (d3 + d4) / d2;
    d4 = 0.0557D * paramDouble1;
    double d5 = -0.204D * paramDouble2;
    d4 += d5;
    d5 = 1.057D * paramDouble3;
    d4 = (d4 + d5) / d2;
    d2 = 0.0031308D;
    boolean bool1 = d1 < d2;
    double d6 = 0.055D;
    double d7 = 0.4166666666666667D;
    double d8 = 1.055D;
    double d9 = 12.92D;
    if (bool1) {
      d1 = Math.pow(d1, d7) * d8 - d6;
    } else {
      d1 *= d9;
    }
    bool1 = d3 < d2;
    if (bool1) {
      d3 = Math.pow(d3, d7) * d8 - d6;
    } else {
      d3 *= d9;
    }
    boolean bool2 = d4 < d2;
    if (bool2) {
      d2 = Math.pow(d4, d7) * d8 - d6;
    } else {
      d2 = d4 * d9;
    }
    d4 = 255.0D;
    int j = (int)Math.round(d1 * d4);
    int i = 255;
    j = OooO(j, 0, i);
    int k = OooO((int)Math.round(d3 * d4), 0, i);
    int m = OooO((int)Math.round(d2 * d4), 0, i);
    return Color.rgb(j, k, m);
  }
  
  public static int OooO0OO(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = Color.alpha(paramInt1) * f1;
    float f3 = Color.alpha(paramInt2) * paramFloat;
    f2 += f3;
    f3 = Color.red(paramInt1) * f1;
    float f4 = Color.red(paramInt2) * paramFloat;
    f3 += f4;
    f4 = Color.green(paramInt1) * f1;
    float f5 = Color.green(paramInt2) * paramFloat;
    f4 += f5;
    float f6 = Color.blue(paramInt1) * f1;
    float f7 = Color.blue(paramInt2) * paramFloat;
    f6 += f7;
    paramInt2 = (int)f2;
    int i = (int)f3;
    int j = (int)f4;
    paramInt1 = (int)f6;
    return Color.argb(paramInt2, i, j, paramInt1);
  }
  
  public static double OooO0Oo(int paramInt)
  {
    double[] arrayOfDouble = getTempDouble3Array();
    OooO0o0(paramInt, arrayOfDouble);
    return arrayOfDouble[1] / 100.0D;
  }
  
  public static int OooO0o(int paramInt1, int paramInt2)
  {
    paramInt2 = 255 - paramInt2;
    paramInt1 = 255 - paramInt1;
    paramInt2 = paramInt2 * paramInt1 / 255;
    return 255 - paramInt2;
  }
  
  public static void OooO0o0(int paramInt, double[] paramArrayOfDouble)
  {
    int i = Color.red(paramInt);
    int j = Color.green(paramInt);
    paramInt = Color.blue(paramInt);
    OooO00o(i, j, paramInt, paramArrayOfDouble);
  }
  
  public static int OooO0oO(int paramInt1, int paramInt2)
  {
    int i = Color.alpha(paramInt2);
    int j = Color.alpha(paramInt1);
    int k = OooO0o(j, i);
    int m = Color.red(paramInt1);
    int n = Color.red(paramInt2);
    m = OooO0oo(m, j, n, i, k);
    n = Color.green(paramInt1);
    int i1 = Color.green(paramInt2);
    n = OooO0oo(n, j, i1, i, k);
    paramInt1 = Color.blue(paramInt1);
    paramInt2 = Color.blue(paramInt2);
    paramInt1 = OooO0oo(paramInt1, j, paramInt2, i, k);
    return Color.argb(k, m, n, paramInt1);
  }
  
  public static int OooO0oo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      return 0;
    }
    paramInt1 = paramInt1 * 255 * paramInt2;
    paramInt3 *= paramInt4;
    paramInt2 = 255 - paramInt2;
    paramInt3 *= paramInt2;
    paramInt1 += paramInt3;
    paramInt5 *= 255;
    return paramInt1 / paramInt5;
  }
  
  public static int OooOO0(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
    {
      int i = 255;
      if (paramInt2 <= i)
      {
        paramInt1 &= 0xFFFFFF;
        paramInt2 <<= 24;
        return paramInt1 | paramInt2;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("alpha must be between 0 and 255.");
    throw localIllegalArgumentException;
  }
  
  private static double[] getTempDouble3Array()
  {
    ThreadLocal localThreadLocal = OooO00o;
    double[] arrayOfDouble = (double[])localThreadLocal.get();
    if (arrayOfDouble == null)
    {
      int i = 3;
      arrayOfDouble = new double[i];
      localThreadLocal.set(arrayOfDouble);
    }
    return arrayOfDouble;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.ColorUtils
 * JD-Core Version:    0.7.0.1
 */