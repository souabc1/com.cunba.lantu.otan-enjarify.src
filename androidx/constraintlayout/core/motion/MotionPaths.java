package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MotionPaths
  implements Comparable
{
  public static String[] o00o00Oo = tmp28_15;
  public Easing o00OoOoo;
  public float o00Ooo0;
  public int o00Ooo00 = 0;
  public float o00Ooo0O;
  public float o00Ooo0o;
  public float o00OooO;
  public float o00OooO0;
  public float o00OooOO;
  public float o00OooOo;
  public int o00OoooO;
  public int o00Ooooo;
  public double[] o00o00;
  public Motion o00o000;
  public float o00o0000;
  public HashMap o00o000O;
  public int o00o000o;
  public double[] o00o00O0;
  public float o0O00o0;
  public int oo00oO;
  
  static
  {
    String[] tmp5_2 = new String[6];
    String[] tmp6_5 = tmp5_2;
    String[] tmp6_5 = tmp5_2;
    tmp6_5[0] = "position";
    tmp6_5[1] = "x";
    String[] tmp15_6 = tmp6_5;
    String[] tmp15_6 = tmp6_5;
    tmp15_6[2] = "y";
    tmp15_6[3] = "width";
    tmp15_6[4] = "height";
    String[] tmp28_15 = tmp15_6;
    tmp28_15[5] = "pathRotate";
  }
  
  public MotionPaths()
  {
    float f = 0.0F / 0.0F;
    this.o00OooOo = f;
    this.o0O00o0 = f;
    int i = -1;
    this.o00OoooO = i;
    this.o00Ooooo = i;
    this.o00o0000 = f;
    this.o00o000 = null;
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.o00o000O = ((HashMap)localObject);
    this.o00o000o = 0;
    int j = 18;
    localObject = new double[j];
    this.o00o00 = ((double[])localObject);
    double[] arrayOfDouble = new double[j];
    this.o00o00O0 = arrayOfDouble;
  }
  
  public void OooO0O0(MotionWidget paramMotionWidget)
  {
    Object localObject = Easing.OooO0OO(paramMotionWidget.OooO0O0.OooO0OO);
    this.o00OoOoo = ((Easing)localObject);
    localObject = paramMotionWidget.OooO0O0;
    int i = ((MotionWidget.Motion)localObject).OooO0Oo;
    this.o00OoooO = i;
    i = ((MotionWidget.Motion)localObject).OooO00o;
    this.o00Ooooo = i;
    float f1 = ((MotionWidget.Motion)localObject).OooO0oo;
    this.o00OooOo = f1;
    i = ((MotionWidget.Motion)localObject).OooO0o0;
    this.o00Ooo00 = i;
    int j = ((MotionWidget.Motion)localObject).OooO0O0;
    this.oo00oO = j;
    float f2 = paramMotionWidget.OooO0OO.OooO0Oo;
    this.o0O00o0 = f2;
    j = 0;
    f2 = 0.0F;
    this.o00o0000 = 0.0F;
    localObject = paramMotionWidget.getCustomAttributeNames().iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject).hasNext();
      if (!bool1) {
        break;
      }
      String str = (String)((Iterator)localObject).next();
      CustomVariable localCustomVariable = paramMotionWidget.OooO0o0(str);
      if (localCustomVariable != null)
      {
        boolean bool2 = localCustomVariable.isContinuous();
        if (bool2)
        {
          HashMap localHashMap = this.o00o000O;
          localHashMap.put(str, localCustomVariable);
        }
      }
    }
  }
  
  public int OooO0OO(MotionPaths paramMotionPaths)
  {
    float f1 = this.o00Ooo0O;
    float f2 = paramMotionPaths.o00Ooo0O;
    return Float.compare(f1, f2);
  }
  
  public void OooO0Oo(double paramDouble, int[] paramArrayOfInt, double[] paramArrayOfDouble, float[] paramArrayOfFloat, int paramInt)
  {
    MotionPaths localMotionPaths = this;
    Object localObject = paramArrayOfInt;
    float f1 = this.o00Ooo0o;
    float f2 = this.o00OooO0;
    float f3 = this.o00OooO;
    float f4 = this.o00OooOO;
    float f5 = 0.0F;
    int i = 0;
    float f6 = 0.0F;
    int k;
    int m;
    double d1;
    for (;;)
    {
      int j = localObject.length;
      k = 2;
      m = 1;
      if (i >= j) {
        break;
      }
      d1 = paramArrayOfDouble[i];
      float f7 = (float)d1;
      int n = localObject[i];
      if (n != m)
      {
        if (n != k)
        {
          k = 3;
          if (n != k)
          {
            k = 4;
            if (n == k) {
              f4 = f7;
            }
          }
          else
          {
            f3 = f7;
          }
        }
        else
        {
          f2 = f7;
        }
      }
      else {
        f1 = f7;
      }
      i += 1;
    }
    localObject = localMotionPaths.o00o000;
    i = 1073741824;
    f6 = 2.0F;
    if (localObject != null)
    {
      float[] arrayOfFloat1 = new float[k];
      float[] arrayOfFloat2 = new float[k];
      d1 = paramDouble;
      ((Motion)localObject).OooO0o(paramDouble, arrayOfFloat1, arrayOfFloat2);
      float f8 = arrayOfFloat1[0];
      f5 = arrayOfFloat1[m];
      double d2 = f8;
      double d3 = f1;
      d1 = f2;
      double d4 = Math.sin(d1) * d3;
      d2 += d4;
      d4 = f3 / f6;
      f2 = (float)(d2 - d4);
      d2 = f5;
      d1 = Math.cos(d1);
      d3 *= d1;
      d2 -= d3;
      d3 = f4 / f6;
      d2 -= d3;
      f8 = (float)d2;
      f1 = f2;
      f2 = f8;
    }
    f3 /= f6;
    f1 = f1 + f3 + 0.0F;
    paramArrayOfFloat[paramInt] = f1;
    int i1 = paramInt + 1;
    f4 /= f6;
    f2 = f2 + f4 + 0.0F;
    paramArrayOfFloat[i1] = f2;
  }
  
  public void OooO0o(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.o00Ooo0o = paramFloat1;
    this.o00OooO0 = paramFloat2;
    this.o00OooO = paramFloat3;
    this.o00OooOO = paramFloat4;
  }
  
  public void OooO0o0(double paramDouble, int[] paramArrayOfInt, double[] paramArrayOfDouble1, float[] paramArrayOfFloat1, double[] paramArrayOfDouble2, float[] paramArrayOfFloat2)
  {
    MotionPaths localMotionPaths = this;
    int[] arrayOfInt = paramArrayOfInt;
    float f1 = this.o00Ooo0o;
    float f2 = this.o00OooO0;
    float f3 = this.o00OooO;
    float f4 = this.o00OooOO;
    int i = 0;
    float f5 = 0.0F;
    float[] arrayOfFloat1 = null;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    int k;
    double d1;
    float f10;
    double d2;
    int n;
    for (;;)
    {
      int j = arrayOfInt.length;
      k = 1;
      if (i >= j) {
        break;
      }
      d1 = paramArrayOfDouble1[i];
      f10 = (float)d1;
      d2 = paramArrayOfDouble2[i];
      float f11 = (float)d2;
      int m = arrayOfInt[i];
      if (m != k)
      {
        n = 2;
        if (m != n)
        {
          n = 3;
          if (m != n)
          {
            n = 4;
            if (m == n)
            {
              f4 = f10;
              f9 = f11;
            }
          }
          else
          {
            f3 = f10;
            f7 = f11;
          }
        }
        else
        {
          f2 = f10;
          f8 = f11;
        }
      }
      else
      {
        f1 = f10;
        f6 = f11;
      }
      i += 1;
    }
    float f12 = 2.0F;
    f7 = f7 / f12 + f6;
    f9 = f9 / f12 + f8;
    Motion localMotion = localMotionPaths.o00o000;
    float f13;
    if (localMotion != null)
    {
      n = 2;
      arrayOfFloat1 = new float[n];
      float[] arrayOfFloat2 = new float[n];
      double d3 = paramDouble;
      localMotion.OooO0o(paramDouble, arrayOfFloat1, arrayOfFloat2);
      localMotion = null;
      f7 = arrayOfFloat1[0];
      f5 = arrayOfFloat1[k];
      f9 = arrayOfFloat2[0];
      f10 = arrayOfFloat2[k];
      d2 = f7;
      double d4 = f1;
      d1 = f2;
      double d5 = Math.sin(d1) * d4;
      d2 += d5;
      f7 = f3 / 2.0F;
      f13 = f3;
      double d6 = f7;
      f2 = (float)(d2 - d6);
      d2 = f5;
      double d7 = Math.cos(d1);
      d4 *= d7;
      d2 -= d4;
      d4 = f4 / 2.0F;
      d2 -= d4;
      f12 = (float)d2;
      d3 = f9;
      double d8 = f6;
      d7 = Math.sin(d1) * d8;
      d3 += d7;
      d7 = Math.cos(d1);
      double d9 = f8;
      d7 *= d9;
      f1 = (float)(d3 + d7);
      f3 = f10;
      d3 = f10;
      d7 = Math.cos(d1);
      d8 *= d7;
      d3 -= d8;
      d1 = Math.sin(d1) * d9;
      d3 += d1;
      f9 = (float)d3;
      f7 = f1;
      f1 = f2;
      f2 = f12;
      f12 = 2.0F;
    }
    else
    {
      f13 = f3;
    }
    f3 = f13 / f12;
    f1 = f1 + f3 + 0.0F;
    paramArrayOfFloat1[0] = f1;
    f4 /= f12;
    f2 = f2 + f4 + 0.0F;
    paramArrayOfFloat1[k] = f2;
    paramArrayOfFloat2[0] = f7;
    paramArrayOfFloat2[k] = f9;
  }
  
  public void OooO0oO(Motion paramMotion, MotionPaths paramMotionPaths)
  {
    float f1 = this.o00Ooo0o;
    float f2 = this.o00OooO;
    float f3 = 2.0F;
    f2 /= f3;
    f1 += f2;
    f2 = paramMotionPaths.o00Ooo0o;
    f1 -= f2;
    f2 = paramMotionPaths.o00OooO / f3;
    f1 -= f2;
    double d1 = f1;
    float f4 = this.o00OooO0;
    float f5 = this.o00OooOO / f3;
    f4 += f5;
    f5 = paramMotionPaths.o00OooO0;
    f4 -= f5;
    float f6 = paramMotionPaths.o00OooOO / f3;
    f4 -= f6;
    double d2 = f4;
    this.o00o000 = paramMotion;
    double d3 = Math.hypot(d2, d1);
    float f7 = (float)d3;
    this.o00Ooo0o = f7;
    f7 = this.o00o0000;
    boolean bool = Float.isNaN(f7);
    if (bool)
    {
      d3 = Math.atan2(d2, d1);
      d1 = 1.570796326794897D;
      d3 += d1;
    }
    else
    {
      f7 = this.o00o0000;
      d3 = Math.toRadians(f7);
    }
    f7 = (float)d3;
    this.o00OooO0 = f7;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.MotionPaths
 * JD-Core Version:    0.7.0.1
 */