package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet.Layout;
import androidx.constraintlayout.widget.ConstraintSet.Motion;
import androidx.constraintlayout.widget.ConstraintSet.PropertySet;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

class MotionPaths
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
  public MotionController o00o000;
  public float o00o0000;
  public LinkedHashMap o00o000O;
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
    int i = Key.OooO0o;
    this.o00OoooO = i;
    this.o00Ooooo = i;
    this.o00o0000 = f;
    this.o00o000 = null;
    Object localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.o00o000O = ((LinkedHashMap)localObject);
    this.o00o000o = 0;
    int j = 18;
    localObject = new double[j];
    this.o00o00 = ((double[])localObject);
    double[] arrayOfDouble = new double[j];
    this.o00o00O0 = arrayOfDouble;
  }
  
  public MotionPaths(int paramInt1, int paramInt2, KeyPosition paramKeyPosition, MotionPaths paramMotionPaths1, MotionPaths paramMotionPaths2)
  {
    float f = 0.0F / 0.0F;
    this.o00OooOo = f;
    this.o0O00o0 = f;
    int i = Key.OooO0o;
    this.o00OoooO = i;
    this.o00Ooooo = i;
    this.o00o0000 = f;
    f = 0.0F;
    this.o00o000 = null;
    Object localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.o00o000O = ((LinkedHashMap)localObject);
    this.o00o000o = 0;
    int j = 18;
    localObject = new double[j];
    this.o00o00 = ((double[])localObject);
    double[] arrayOfDouble = new double[j];
    this.o00o00O0 = arrayOfDouble;
    j = paramMotionPaths1.o00Ooooo;
    int k = Key.OooO0o;
    if (j != k)
    {
      OooOOOO(paramInt1, paramInt2, paramKeyPosition, paramMotionPaths1, paramMotionPaths2);
      return;
    }
    j = paramKeyPosition.OooOOo0;
    k = 1;
    f = 1.4E-45F;
    if (j != k)
    {
      k = 2;
      f = 2.802597E-045F;
      if (j != k)
      {
        OooOOO0(paramKeyPosition, paramMotionPaths1, paramMotionPaths2);
        return;
      }
      OooOOOo(paramInt1, paramInt2, paramKeyPosition, paramMotionPaths1, paramMotionPaths2);
      return;
    }
    OooOOO(paramKeyPosition, paramMotionPaths1, paramMotionPaths2);
  }
  
  public int OooO(String paramString, double[] paramArrayOfDouble, int paramInt)
  {
    paramString = (ConstraintAttribute)this.o00o000O.get(paramString);
    int i = 0;
    if (paramString == null) {
      return 0;
    }
    int j = paramString.OooO0o0();
    int k = 1;
    if (j == k)
    {
      double d1 = paramString.getValueToInterpolate();
      paramArrayOfDouble[paramInt] = d1;
      return k;
    }
    j = paramString.OooO0o0();
    float[] arrayOfFloat = new float[j];
    paramString.OooO0Oo(arrayOfFloat);
    while (i < j)
    {
      int m = paramInt + 1;
      float f = arrayOfFloat[i];
      double d2 = f;
      paramArrayOfDouble[paramInt] = d2;
      i += 1;
      paramInt = m;
    }
    return j;
  }
  
  public void OooO0O0(ConstraintSet.Constraint paramConstraint)
  {
    Object localObject = Easing.OooO0OO(paramConstraint.OooO0Oo.OooO0Oo);
    this.o00OoOoo = ((Easing)localObject);
    localObject = paramConstraint.OooO0Oo;
    int i = ((ConstraintSet.Motion)localObject).OooO0o0;
    this.o00OoooO = i;
    i = ((ConstraintSet.Motion)localObject).OooO0O0;
    this.o00Ooooo = i;
    float f1 = ((ConstraintSet.Motion)localObject).OooO;
    this.o00OooOo = f1;
    i = ((ConstraintSet.Motion)localObject).OooO0o;
    this.o00Ooo00 = i;
    int j = ((ConstraintSet.Motion)localObject).OooO0OO;
    this.oo00oO = j;
    float f2 = paramConstraint.OooO0OO.OooO0o0;
    this.o0O00o0 = f2;
    f2 = paramConstraint.OooO0o0.OooOooO;
    this.o00o0000 = f2;
    localObject = paramConstraint.OooO0oO.keySet().iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject).hasNext();
      if (!bool1) {
        break;
      }
      String str = (String)((Iterator)localObject).next();
      ConstraintAttribute localConstraintAttribute = (ConstraintAttribute)paramConstraint.OooO0oO.get(str);
      if (localConstraintAttribute != null)
      {
        boolean bool2 = localConstraintAttribute.isContinuous();
        if (bool2)
        {
          LinkedHashMap localLinkedHashMap = this.o00o000O;
          localLinkedHashMap.put(str, localConstraintAttribute);
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
  
  public final boolean OooO0Oo(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = Float.isNaN(paramFloat1);
    boolean bool2 = true;
    if (!bool1)
    {
      bool1 = Float.isNaN(paramFloat2);
      if (!bool1)
      {
        paramFloat1 = Math.abs(paramFloat1 - paramFloat2);
        int i = 897988541;
        paramFloat2 = 1.0E-006F;
        bool4 = paramFloat1 < paramFloat2;
        if (!bool4) {
          bool2 = false;
        }
        return bool2;
      }
    }
    boolean bool4 = Float.isNaN(paramFloat1);
    boolean bool3 = Float.isNaN(paramFloat2);
    if (bool4 == bool3) {
      bool2 = false;
    }
    return bool2;
  }
  
  public void OooO0o(double[] paramArrayOfDouble, int[] paramArrayOfInt)
  {
    int i = 6;
    float[] arrayOfFloat = new float[i];
    float f1 = this.o00Ooo0O;
    int j = 0;
    arrayOfFloat[0] = f1;
    float f2 = this.o00Ooo0o;
    arrayOfFloat[1] = f2;
    f2 = this.o00OooO0;
    arrayOfFloat[2] = f2;
    f2 = this.o00OooO;
    arrayOfFloat[3] = f2;
    f2 = this.o00OooOO;
    arrayOfFloat[4] = f2;
    f2 = this.o00OooOo;
    arrayOfFloat[5] = f2;
    int k = 0;
    f1 = 0.0F;
    for (;;)
    {
      int m = paramArrayOfInt.length;
      if (j >= m) {
        break;
      }
      m = paramArrayOfInt[j];
      if (m < i)
      {
        int n = k + 1;
        f2 = arrayOfFloat[m];
        double d = f2;
        paramArrayOfDouble[k] = d;
        k = n;
      }
      j += 1;
    }
  }
  
  public void OooO0o0(MotionPaths paramMotionPaths, boolean[] paramArrayOfBoolean, String[] paramArrayOfString, boolean paramBoolean)
  {
    float f1 = this.o00Ooo0o;
    float f2 = paramMotionPaths.o00Ooo0o;
    int i = OooO0Oo(f1, f2);
    f2 = this.o00OooO0;
    float f3 = paramMotionPaths.o00OooO0;
    boolean bool1 = OooO0Oo(f2, f3);
    int m = paramArrayOfBoolean[0];
    float f4 = this.o00Ooo0O;
    float f5 = paramMotionPaths.o00Ooo0O;
    int n = OooO0Oo(f4, f5);
    m |= n;
    paramArrayOfBoolean[0] = m;
    int i1 = 1;
    m = paramArrayOfBoolean[i1];
    i = i | bool1 | paramBoolean;
    paramBoolean = m | i;
    paramArrayOfBoolean[i1] = paramBoolean;
    paramBoolean = true;
    int k = paramArrayOfBoolean[paramBoolean];
    i |= k;
    paramArrayOfBoolean[paramBoolean] = i;
    int j = 3;
    paramBoolean = paramArrayOfBoolean[j];
    f2 = this.o00OooO;
    f3 = paramMotionPaths.o00OooO;
    boolean bool2 = OooO0Oo(f2, f3);
    paramBoolean |= bool2;
    paramArrayOfBoolean[j] = paramBoolean;
    j = 4;
    paramBoolean = paramArrayOfBoolean[j];
    f2 = this.o00OooOO;
    float f6 = paramMotionPaths.o00OooOO;
    boolean bool3 = OooO0Oo(f2, f6) | paramBoolean;
    paramArrayOfBoolean[j] = bool3;
  }
  
  public void OooO0oO(double paramDouble, int[] paramArrayOfInt, double[] paramArrayOfDouble, float[] paramArrayOfFloat, int paramInt)
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
      ((MotionController)localObject).OooO0oo(paramDouble, arrayOfFloat1, arrayOfFloat2);
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
  
  public void OooO0oo(double paramDouble, int[] paramArrayOfInt, double[] paramArrayOfDouble1, float[] paramArrayOfFloat1, double[] paramArrayOfDouble2, float[] paramArrayOfFloat2)
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
    MotionController localMotionController = localMotionPaths.o00o000;
    float f13;
    if (localMotionController != null)
    {
      n = 2;
      arrayOfFloat1 = new float[n];
      float[] arrayOfFloat2 = new float[n];
      double d3 = paramDouble;
      localMotionController.OooO0oo(paramDouble, arrayOfFloat1, arrayOfFloat2);
      localMotionController = null;
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
  
  public int OooOO0(String paramString)
  {
    LinkedHashMap localLinkedHashMap = this.o00o000O;
    paramString = (ConstraintAttribute)localLinkedHashMap.get(paramString);
    if (paramString == null) {
      return 0;
    }
    return paramString.OooO0o0();
  }
  
  public void OooOO0O(int[] paramArrayOfInt, double[] paramArrayOfDouble, float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = this.o00Ooo0o;
    float f2 = this.o00OooO0;
    float f3 = this.o00OooO;
    float f4 = this.o00OooOO;
    int i = 0;
    float f5 = 0.0F;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      if (i >= j) {
        break;
      }
      double d1 = paramArrayOfDouble[i];
      f6 = (float)d1;
      int k = paramArrayOfInt[i];
      int m = 1;
      if (k != m)
      {
        m = 2;
        if (k != m)
        {
          m = 3;
          if (k != m)
          {
            m = 4;
            if (k == m) {
              f4 = f6;
            }
          }
          else
          {
            f3 = f6;
          }
        }
        else
        {
          f2 = f6;
        }
      }
      else
      {
        f1 = f6;
      }
      i += 1;
    }
    paramArrayOfInt = this.o00o000;
    if (paramArrayOfInt != null)
    {
      f7 = paramArrayOfInt.getCenterX();
      paramArrayOfDouble = this.o00o000;
      f8 = paramArrayOfDouble.getCenterY();
      double d2 = f7;
      double d3 = f1;
      double d4 = f2;
      double d5 = Math.sin(d4) * d3;
      d2 += d5;
      n = 1073741824;
      f7 = 2.0F;
      float f9 = f3 / f7;
      d5 = f9;
      d2 -= d5;
      f5 = (float)d2;
      d5 = f8;
      d4 = Math.cos(d4);
      d3 *= d4;
      d5 -= d3;
      f7 = f4 / f7;
      double d6 = f7;
      d5 -= d6;
      f2 = (float)d5;
      f1 = f5;
    }
    f3 += f1;
    f4 += f2;
    float f7 = 0.0F / 0.0F;
    Float.isNaN(f7);
    Float.isNaN(f7);
    float f8 = f1 + 0.0F;
    f5 = f2 + 0.0F;
    float f6 = f3 + 0.0F;
    f2 += 0.0F;
    f3 += 0.0F;
    float f10 = f4 + 0.0F;
    f1 += 0.0F;
    f4 += 0.0F;
    int n = paramInt + 1;
    paramArrayOfFloat[paramInt] = f8;
    int i1 = n + 1;
    paramArrayOfFloat[n] = f5;
    n = i1 + 1;
    paramArrayOfFloat[i1] = f6;
    i1 = n + 1;
    paramArrayOfFloat[n] = f2;
    n = i1 + 1;
    paramArrayOfFloat[i1] = f3;
    i1 = n + 1;
    paramArrayOfFloat[n] = f10;
    n = i1 + 1;
    paramArrayOfFloat[i1] = f1;
    paramArrayOfFloat[n] = f4;
  }
  
  public boolean OooOO0o(String paramString)
  {
    return this.o00o000O.containsKey(paramString);
  }
  
  public void OooOOO(KeyPosition paramKeyPosition, MotionPaths paramMotionPaths1, MotionPaths paramMotionPaths2)
  {
    MotionPaths localMotionPaths1 = this;
    Object localObject = paramKeyPosition;
    MotionPaths localMotionPaths2 = paramMotionPaths1;
    MotionPaths localMotionPaths3 = paramMotionPaths2;
    int i = paramKeyPosition.OooO00o;
    float f1 = i / 100.0F;
    this.o00Ooo0 = f1;
    int j = paramKeyPosition.OooOO0;
    this.o00Ooo00 = j;
    float f2 = paramKeyPosition.OooOO0O;
    boolean bool1 = Float.isNaN(f2);
    if (bool1) {
      f2 = f1;
    } else {
      f2 = paramKeyPosition.OooOO0O;
    }
    float f3 = ((KeyPosition)localObject).OooOO0o;
    boolean bool2 = Float.isNaN(f3);
    if (bool2) {
      f3 = f1;
    } else {
      f3 = ((KeyPosition)localObject).OooOO0o;
    }
    float f4 = localMotionPaths3.o00OooO;
    float f5 = localMotionPaths2.o00OooO;
    f4 -= f5;
    f5 = localMotionPaths3.o00OooOO;
    float f6 = localMotionPaths2.o00OooOO;
    f5 -= f6;
    f6 = localMotionPaths1.o00Ooo0;
    localMotionPaths1.o00Ooo0O = f6;
    f6 = ((KeyPosition)localObject).OooOOO0;
    boolean bool3 = Float.isNaN(f6);
    if (!bool3) {
      f1 = ((KeyPosition)localObject).OooOOO0;
    }
    f6 = localMotionPaths2.o00Ooo0o;
    float f7 = localMotionPaths2.o00OooO;
    float f8 = 2.0F;
    float f9 = f7 / f8 + f6;
    float f10 = localMotionPaths2.o00OooO0;
    float f11 = localMotionPaths2.o00OooOO;
    float f12 = f11 / f8 + f10;
    float f13 = localMotionPaths3.o00Ooo0o;
    float f14 = localMotionPaths3.o00OooO / f8;
    f13 += f14;
    f14 = localMotionPaths3.o00OooO0;
    float f15 = localMotionPaths3.o00OooOO / f8;
    f14 += f15;
    f13 -= f9;
    f14 -= f12;
    f15 = f13 * f1;
    f6 += f15;
    f4 *= f2;
    f2 = f4 / f8;
    f6 = (int)(f6 - f2);
    localMotionPaths1.o00Ooo0o = f6;
    f1 *= f14;
    f10 += f1;
    f5 *= f3;
    f3 = f5 / f8;
    f10 -= f3;
    int k = (int)f10;
    f6 = k;
    localMotionPaths1.o00OooO0 = f6;
    f7 += f4;
    f4 = (int)f7;
    localMotionPaths1.o00OooO = f4;
    f11 += f5;
    int m = (int)f11;
    f4 = m;
    localMotionPaths1.o00OooOO = f4;
    KeyPosition localKeyPosition = paramKeyPosition;
    f5 = paramKeyPosition.OooOOO;
    boolean bool4 = Float.isNaN(f5);
    if (bool4)
    {
      bool4 = false;
      f5 = 0.0F;
    }
    else
    {
      f5 = paramKeyPosition.OooOOO;
    }
    f14 = -f14 * f5;
    f13 *= f5;
    localMotionPaths1.o00o000o = 1;
    f15 = (int)(paramMotionPaths1.o00Ooo0o + f15 - f2);
    f1 = (int)(paramMotionPaths1.o00OooO0 + f1 - f3);
    f15 += f14;
    localMotionPaths1.o00Ooo0o = f15;
    f1 += f13;
    localMotionPaths1.o00OooO0 = f1;
    int n = localMotionPaths1.o00Ooooo;
    localMotionPaths1.o00Ooooo = n;
    localObject = Easing.OooO0OO(localKeyPosition.OooO0oo);
    localMotionPaths1.o00OoOoo = ((Easing)localObject);
    n = localKeyPosition.OooO;
    localMotionPaths1.o00OoooO = n;
  }
  
  public void OooOOO0(KeyPosition paramKeyPosition, MotionPaths paramMotionPaths1, MotionPaths paramMotionPaths2)
  {
    MotionPaths localMotionPaths1 = this;
    KeyPosition localKeyPosition = paramKeyPosition;
    Object localObject = paramMotionPaths1;
    MotionPaths localMotionPaths2 = paramMotionPaths2;
    int i = paramKeyPosition.OooO00o;
    float f1 = i / 100.0F;
    this.o00Ooo0 = f1;
    int j = paramKeyPosition.OooOO0;
    this.o00Ooo00 = j;
    float f2 = paramKeyPosition.OooOO0O;
    boolean bool1 = Float.isNaN(f2);
    if (bool1) {
      f2 = f1;
    } else {
      f2 = paramKeyPosition.OooOO0O;
    }
    float f3 = localKeyPosition.OooOO0o;
    boolean bool2 = Float.isNaN(f3);
    if (bool2) {
      f3 = f1;
    } else {
      f3 = localKeyPosition.OooOO0o;
    }
    float f4 = localMotionPaths2.o00OooO;
    float f5 = ((MotionPaths)localObject).o00OooO;
    float f6 = f4 - f5;
    float f7 = localMotionPaths2.o00OooOO;
    float f8 = ((MotionPaths)localObject).o00OooOO;
    float f9 = f7 - f8;
    float f10 = localMotionPaths1.o00Ooo0;
    localMotionPaths1.o00Ooo0O = f10;
    f10 = ((MotionPaths)localObject).o00Ooo0o;
    float f11 = 2.0F;
    float f12 = f5 / f11 + f10;
    float f13 = ((MotionPaths)localObject).o00OooO0;
    float f14 = f8 / f11;
    f14 = f13 + f14;
    float f15 = localMotionPaths2.o00Ooo0o;
    f4 /= f11;
    f15 += f4;
    float f16 = localMotionPaths2.o00OooO0;
    f7 /= f11;
    f16 += f7;
    f15 -= f12;
    f16 -= f14;
    f4 = f15 * f1;
    f10 += f4;
    f6 *= f2;
    f2 = f6 / f11;
    f10 -= f2;
    f4 = (int)f10;
    localMotionPaths1.o00Ooo0o = f4;
    f4 = f16 * f1;
    f13 += f4;
    f9 *= f3;
    f3 = f9 / f11;
    f13 = (int)(f13 - f3);
    localMotionPaths1.o00OooO0 = f13;
    f5 += f6;
    f13 = (int)f5;
    localMotionPaths1.o00OooO = f13;
    f8 += f9;
    int k = (int)f8;
    f13 = k;
    localMotionPaths1.o00OooOO = f13;
    localKeyPosition = paramKeyPosition;
    f4 = paramKeyPosition.OooOOO0;
    boolean bool3 = Float.isNaN(f4);
    if (bool3) {
      f4 = f1;
    } else {
      f4 = paramKeyPosition.OooOOO0;
    }
    f5 = localKeyPosition.OooOOOo;
    boolean bool4 = Float.isNaN(f5);
    f6 = 0.0F;
    if (bool4)
    {
      bool4 = false;
      f5 = 0.0F;
    }
    else
    {
      f5 = localKeyPosition.OooOOOo;
    }
    f7 = localKeyPosition.OooOOO;
    boolean bool5 = Float.isNaN(f7);
    if (!bool5) {
      f1 = localKeyPosition.OooOOO;
    }
    f7 = localKeyPosition.OooOOOO;
    bool5 = Float.isNaN(f7);
    if (!bool5) {
      f6 = localKeyPosition.OooOOOO;
    }
    localMotionPaths1.o00o000o = 0;
    f8 = paramMotionPaths1.o00Ooo0o;
    f4 *= f15;
    f8 += f4;
    f6 *= f16;
    f2 = (int)(f8 + f6 - f2);
    localMotionPaths1.o00Ooo0o = f2;
    f2 = paramMotionPaths1.o00OooO0;
    f15 *= f5;
    f2 += f15;
    f16 *= f1;
    f15 = (int)(f2 + f16 - f3);
    localMotionPaths1.o00OooO0 = f15;
    localObject = Easing.OooO0OO(localKeyPosition.OooO0oo);
    localMotionPaths1.o00OoOoo = ((Easing)localObject);
    k = localKeyPosition.OooO;
    localMotionPaths1.o00OoooO = k;
  }
  
  public void OooOOOO(int paramInt1, int paramInt2, KeyPosition paramKeyPosition, MotionPaths paramMotionPaths1, MotionPaths paramMotionPaths2)
  {
    paramInt1 = paramKeyPosition.OooO00o;
    float f1 = paramInt1 / 100.0F;
    this.o00Ooo0 = f1;
    paramInt2 = paramKeyPosition.OooOO0;
    this.o00Ooo00 = paramInt2;
    paramInt2 = paramKeyPosition.OooOOo0;
    this.o00o000o = paramInt2;
    float f2 = paramKeyPosition.OooOO0O;
    paramInt2 = Float.isNaN(f2);
    if (paramInt2 != 0) {
      f2 = f1;
    } else {
      f2 = paramKeyPosition.OooOO0O;
    }
    float f3 = paramKeyPosition.OooOO0o;
    boolean bool1 = Float.isNaN(f3);
    if (bool1) {
      f3 = f1;
    } else {
      f3 = paramKeyPosition.OooOO0o;
    }
    float f4 = paramMotionPaths2.o00OooO;
    float f5 = paramMotionPaths1.o00OooO;
    f4 -= f5;
    float f6 = paramMotionPaths2.o00OooOO;
    float f7 = paramMotionPaths1.o00OooOO;
    f6 -= f7;
    float f8 = this.o00Ooo0;
    this.o00Ooo0O = f8;
    f4 *= f2;
    f4 = (int)(f5 + f4);
    this.o00OooO = f4;
    f6 *= f3;
    f7 += f6;
    f4 = (int)f7;
    this.o00OooOO = f4;
    int i = paramKeyPosition.OooOOo0;
    int j = 1;
    f5 = 1.4E-45F;
    if (i != j)
    {
      j = 2;
      f5 = 2.802597E-045F;
      if (i != j)
      {
        f2 = paramKeyPosition.OooOOO0;
        paramInt2 = Float.isNaN(f2);
        if (paramInt2 != 0) {
          f2 = f1;
        } else {
          f2 = paramKeyPosition.OooOOO0;
        }
        f3 = paramMotionPaths2.o00Ooo0o;
        f4 = paramMotionPaths1.o00Ooo0o;
        f3 -= f4;
        f2 = f2 * f3 + f4;
        this.o00Ooo0o = f2;
        f2 = paramKeyPosition.OooOOO;
        paramInt2 = Float.isNaN(f2);
        if (paramInt2 == 0) {
          f1 = paramKeyPosition.OooOOO;
        }
      }
    }
    for (;;)
    {
      f2 = paramMotionPaths2.o00OooO0;
      float f9 = paramMotionPaths1.o00OooO0;
      f2 -= f9;
      for (f1 = f1 * f2 + f9;; f1 = paramKeyPosition.OooOOO)
      {
        this.o00OooO0 = f1;
        break label551;
        f4 = paramKeyPosition.OooOOO0;
        boolean bool2 = Float.isNaN(f4);
        if (bool2)
        {
          f2 = paramMotionPaths2.o00Ooo0o;
          f3 = paramMotionPaths1.o00Ooo0o;
          f2 = (f2 - f3) * f1 + f3;
        }
        else
        {
          f4 = paramKeyPosition.OooOOO0;
          f2 = Math.min(f3, f2) * f4;
        }
        this.o00Ooo0o = f2;
        f2 = paramKeyPosition.OooOOO;
        paramInt2 = Float.isNaN(f2);
        if (paramInt2 != 0) {
          break;
        }
      }
      f2 = paramKeyPosition.OooOOO0;
      paramInt2 = Float.isNaN(f2);
      if (paramInt2 != 0) {
        f2 = f1;
      } else {
        f2 = paramKeyPosition.OooOOO0;
      }
      f3 = paramMotionPaths2.o00Ooo0o;
      f4 = paramMotionPaths1.o00Ooo0o;
      f3 -= f4;
      f2 = f2 * f3 + f4;
      this.o00Ooo0o = f2;
      f2 = paramKeyPosition.OooOOO;
      paramInt2 = Float.isNaN(f2);
      if (paramInt2 == 0) {
        break;
      }
    }
    label551:
    paramInt1 = paramMotionPaths1.o00Ooooo;
    this.o00Ooooo = paramInt1;
    Easing localEasing = Easing.OooO0OO(paramKeyPosition.OooO0oo);
    this.o00OoOoo = localEasing;
    paramInt1 = paramKeyPosition.OooO;
    this.o00OoooO = paramInt1;
  }
  
  public void OooOOOo(int paramInt1, int paramInt2, KeyPosition paramKeyPosition, MotionPaths paramMotionPaths1, MotionPaths paramMotionPaths2)
  {
    MotionPaths localMotionPaths1 = this;
    KeyPosition localKeyPosition = paramKeyPosition;
    Object localObject = paramMotionPaths1;
    MotionPaths localMotionPaths2 = paramMotionPaths2;
    int i = paramKeyPosition.OooO00o;
    float f1 = i / 100.0F;
    this.o00Ooo0 = f1;
    int j = paramKeyPosition.OooOO0;
    this.o00Ooo00 = j;
    float f2 = paramKeyPosition.OooOO0O;
    boolean bool1 = Float.isNaN(f2);
    if (bool1) {
      f2 = f1;
    } else {
      f2 = paramKeyPosition.OooOO0O;
    }
    float f3 = localKeyPosition.OooOO0o;
    boolean bool2 = Float.isNaN(f3);
    if (bool2) {
      f3 = f1;
    } else {
      f3 = localKeyPosition.OooOO0o;
    }
    float f4 = localMotionPaths2.o00OooO;
    float f5 = ((MotionPaths)localObject).o00OooO;
    float f6 = f4 - f5;
    float f7 = localMotionPaths2.o00OooOO;
    float f8 = ((MotionPaths)localObject).o00OooOO;
    float f9 = f7 - f8;
    float f10 = localMotionPaths1.o00Ooo0;
    localMotionPaths1.o00Ooo0O = f10;
    f10 = ((MotionPaths)localObject).o00Ooo0o;
    float f11 = 2.0F;
    float f12 = f5 / f11 + f10;
    float f13 = ((MotionPaths)localObject).o00OooO0;
    float f14 = f8 / f11;
    f14 = f13 + f14;
    float f15 = localMotionPaths2.o00Ooo0o;
    f4 /= f11;
    f15 += f4;
    float f16 = localMotionPaths2.o00OooO0;
    f7 /= f11;
    f16 += f7;
    f15 -= f12;
    f16 -= f14;
    f15 *= f1;
    f10 += f15;
    f6 *= f2;
    f15 = f6 / f11;
    f10 -= f15;
    f15 = (int)f10;
    localMotionPaths1.o00Ooo0o = f15;
    f16 *= f1;
    f13 += f16;
    f9 *= f3;
    f15 = f9 / f11;
    f15 = (int)(f13 - f15);
    localMotionPaths1.o00OooO0 = f15;
    f5 += f6;
    f15 = (int)f5;
    localMotionPaths1.o00OooO = f15;
    f8 += f9;
    f15 = (int)f8;
    localMotionPaths1.o00OooOO = f15;
    int k = 2;
    f15 = 2.802597E-045F;
    localMotionPaths1.o00o000o = k;
    localKeyPosition = paramKeyPosition;
    f13 = paramKeyPosition.OooOOO0;
    boolean bool3 = Float.isNaN(f13);
    if (!bool3)
    {
      int m = paramInt1;
      f13 = paramInt1;
      f16 = localMotionPaths1.o00OooO;
      m = (int)(f13 - f16);
      f16 = paramKeyPosition.OooOOO0;
      f13 = m;
      f16 *= f13;
      m = (int)f16;
      f13 = m;
      localMotionPaths1.o00Ooo0o = f13;
    }
    f13 = localKeyPosition.OooOOO;
    boolean bool4 = Float.isNaN(f13);
    if (!bool4)
    {
      n = paramInt2;
      f13 = paramInt2;
      f16 = localMotionPaths1.o00OooOO;
      n = (int)(f13 - f16);
      f16 = localKeyPosition.OooOOO;
      f13 = n;
      f16 *= f13;
      n = (int)f16;
      f13 = n;
      localMotionPaths1.o00OooO0 = f13;
    }
    int n = localMotionPaths1.o00Ooooo;
    localMotionPaths1.o00Ooooo = n;
    localObject = Easing.OooO0OO(localKeyPosition.OooO0oo);
    localMotionPaths1.o00OoOoo = ((Easing)localObject);
    k = localKeyPosition.OooO;
    localMotionPaths1.o00OoooO = k;
  }
  
  public void OooOOo(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat, int[] paramArrayOfInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    int[] arrayOfInt = paramArrayOfInt;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    int i = 0;
    float f5 = 0.0F;
    int k;
    for (;;)
    {
      int j = arrayOfInt.length;
      k = 1;
      if (i >= j) {
        break;
      }
      float f6 = (float)paramArrayOfDouble1[i];
      paramArrayOfDouble2[i];
      int m = arrayOfInt[i];
      if (m != k)
      {
        k = 2;
        if (m != k)
        {
          k = 3;
          if (m != k)
          {
            k = 4;
            if (m == k) {
              f4 = f6;
            }
          }
          else
          {
            f2 = f6;
          }
        }
        else
        {
          f3 = f6;
        }
      }
      else
      {
        f1 = f6;
      }
      i += 1;
    }
    float f7 = 0.0F * f2;
    f5 = 2.0F;
    f7 /= f5;
    f1 -= f7;
    f7 = 0.0F * f4 / f5;
    f3 -= f7;
    f7 = 1.0F;
    f2 *= f7;
    f4 *= f7;
    f2 += f1;
    f4 += f3;
    f5 = f7 - paramFloat1;
    f1 *= f5;
    f2 *= paramFloat1;
    f1 = f1 + f2 + 0.0F;
    paramArrayOfFloat[0] = f1;
    f7 -= paramFloat2;
    f3 *= f7;
    f4 *= paramFloat2;
    f3 = f3 + f4 + 0.0F;
    paramArrayOfFloat[k] = f3;
  }
  
  public void OooOOo0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.o00Ooo0o = paramFloat1;
    this.o00OooO0 = paramFloat2;
    this.o00OooO = paramFloat3;
    this.o00OooOO = paramFloat4;
  }
  
  public void OooOOoo(float paramFloat, View paramView, int[] paramArrayOfInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double[] paramArrayOfDouble3, boolean paramBoolean)
  {
    Object localObject1 = this;
    View localView = paramView;
    Object localObject2 = paramArrayOfInt;
    double[] arrayOfDouble1 = paramArrayOfDouble2;
    float f1 = this.o00Ooo0o;
    float f2 = this.o00OooO0;
    float f3 = this.o00OooO;
    float f4 = this.o00OooOO;
    int i = paramArrayOfInt.length;
    int j = 1;
    float f5 = 1.4E-45F;
    if (i != 0)
    {
      localObject3 = this.o00o00;
      i = localObject3.length;
      k = paramArrayOfInt.length - j;
      k = paramArrayOfInt[k];
      if (i <= k)
      {
        i = paramArrayOfInt.length - j;
        i = paramArrayOfInt[i] + j;
        localObject4 = new double[i];
        this.o00o00 = ((double[])localObject4);
        localObject3 = new double[i];
        this.o00o00O0 = ((double[])localObject3);
      }
    }
    Object localObject3 = ((MotionPaths)localObject1).o00o00;
    double d1 = 0.0D / 0.0D;
    Arrays.fill((double[])localObject3, d1);
    int k = 0;
    float f6 = 0.0F;
    Object localObject4 = null;
    double d2;
    for (;;)
    {
      m = localObject2.length;
      if (k >= m) {
        break;
      }
      localObject5 = ((MotionPaths)localObject1).o00o00;
      n = localObject2[k];
      d2 = paramArrayOfDouble1[k];
      localObject5[n] = d2;
      localObject5 = ((MotionPaths)localObject1).o00o00O0;
      d2 = arrayOfDouble1[k];
      localObject5[n] = d2;
      k += 1;
    }
    k = 2143289344;
    f6 = 0.0F / 0.0F;
    int m = 0;
    float f7 = 0.0F;
    Object localObject5 = null;
    int n = 0;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    int i1 = 0;
    float f11 = 0.0F;
    double d3;
    double d5;
    float f13;
    double[] arrayOfDouble2;
    float f14;
    for (;;)
    {
      localObject2 = ((MotionPaths)localObject1).o00o00;
      i = localObject2.length;
      if (m >= i) {
        break;
      }
      boolean bool1 = Double.isNaN(localObject2[m]);
      d3 = 0.0D;
      if (bool1) {
        if (paramArrayOfDouble3 != null)
        {
          d4 = paramArrayOfDouble3[m];
          bool1 = d4 < d3;
          if (bool1) {}
        }
        else
        {
          f12 = f6;
          break label490;
        }
      }
      if (paramArrayOfDouble3 != null) {
        d3 = paramArrayOfDouble3[m];
      }
      localObject2 = ((MotionPaths)localObject1).o00o00;
      double d4 = localObject2[m];
      bool1 = Double.isNaN(d4);
      if (!bool1)
      {
        localObject2 = ((MotionPaths)localObject1).o00o00;
        d4 = localObject2[m];
        d3 = d4 + d3;
      }
      f12 = f6;
      d5 = d3;
      f13 = (float)d3;
      arrayOfDouble2 = ((MotionPaths)localObject1).o00o00O0;
      d5 = arrayOfDouble2[m];
      f5 = (float)d5;
      k = 1;
      f6 = 1.4E-45F;
      if (m != k)
      {
        i2 = 2;
        f14 = 2.802597E-045F;
        if (m != i2)
        {
          i2 = 3;
          f14 = 4.203895E-045F;
          if (m != i2)
          {
            i2 = 4;
            f14 = 5.605194E-045F;
            if (m != i2)
            {
              i2 = 5;
              f14 = 7.006492E-045F;
              if (m != i2) {
                label490:
                f6 = f12;
              } else {
                f6 = f13;
              }
            }
            else
            {
              f6 = f12;
              f4 = f13;
              f11 = f5;
            }
          }
          else
          {
            f6 = f12;
            f3 = f13;
            f10 = f5;
          }
        }
        else
        {
          f6 = f12;
          f2 = f13;
          f9 = f5;
        }
      }
      else
      {
        f6 = f12;
        f1 = f13;
        f8 = f5;
      }
      m += 1;
      j = 1;
      f5 = 1.4E-45F;
    }
    float f12 = f6;
    localObject3 = ((MotionPaths)localObject1).o00o000;
    double d8;
    float f16;
    float f17;
    int i5;
    if (localObject3 != null)
    {
      i2 = 2;
      localObject4 = new float[i2];
      localObject5 = new float[i2];
      f10 = paramFloat;
      double d6 = paramFloat;
      ((MotionController)localObject3).OooO0oo(d6, (float[])localObject4, (float[])localObject5);
      i = 0;
      localObject3 = null;
      f10 = localObject4[0];
      i1 = 1;
      f11 = 1.4E-45F;
      f6 = localObject4[i1];
      f14 = localObject5[0];
      f13 = localObject5[i1];
      d6 = f10;
      paramFloat = f6;
      d5 = f1;
      double d7 = f2;
      d3 = Math.sin(d7) * d5;
      d6 += d3;
      m = 1073741824;
      d8 = f3 / 2.0F;
      f15 = (float)(d6 - d8);
      f7 = f6;
      d8 = f6;
      d6 = Math.cos(d7) * d5;
      d8 -= d6;
      f10 = f4 / 2.0F;
      d6 = f10;
      f7 = (float)(d8 - d6);
      d6 = f14;
      f14 = f7;
      d8 = f8;
      d3 = Math.sin(d7) * d8;
      d6 += d3;
      d3 = Math.cos(d7) * d5;
      f16 = f3;
      f17 = f4;
      double d9 = f9;
      d3 *= d9;
      f9 = (float)(d6 + d3);
      d6 = f13;
      d3 = Math.cos(d7);
      d8 *= d3;
      d6 -= d8;
      d7 = Math.sin(d7);
      d5 = d5 * d7 * d9;
      d6 += d5;
      f1 = (float)d6;
      i3 = arrayOfDouble1.length;
      i4 = 2;
      f3 = 2.802597E-045F;
      double d10;
      if (i3 >= i4)
      {
        d10 = f9;
        i5 = 0;
        f4 = 0.0F;
        arrayOfDouble1[0] = d10;
        d10 = f1;
        i = 1;
        f13 = 1.4E-45F;
        arrayOfDouble1[i] = d10;
      }
      else
      {
        i5 = 0;
        f4 = 0.0F;
        i = 1;
        f13 = 1.4E-45F;
      }
      boolean bool2 = Float.isNaN(f12);
      if (!bool2)
      {
        f6 = f12;
        d10 = f12;
        double d11 = f1;
        d5 = f9;
        d11 = Math.toDegrees(Math.atan2(d11, d5));
        d10 += d11;
        float f18 = (float)d10;
        localView.setRotation(f18);
      }
      f1 = f15;
      f2 = f14;
    }
    else
    {
      f16 = f3;
      f17 = f4;
      i5 = 0;
      f4 = 0.0F;
      i = 1;
      f13 = 1.4E-45F;
      bool3 = Float.isNaN(f6);
      if (!bool3)
      {
        f15 = 2.0F;
        f10 /= f15;
        f8 += f10;
        f11 /= f15;
        f9 += f11;
        bool3 = false;
        localObject1 = null;
        double d12 = 0.0F;
        d5 = f6;
        d2 = f9;
        d8 = f8;
        d8 = Math.toDegrees(Math.atan2(d2, d8));
        d5 += d8;
        d12 += d5;
        f15 = (float)d12;
        localView.setRotation(f15);
      }
    }
    boolean bool3 = localView instanceof FloatLayout;
    if (bool3)
    {
      f3 = f1 + f16;
      f4 = f2 + f17;
      localObject1 = localView;
      ((FloatLayout)localView).OooO00o(f1, f2, f3, f4);
      return;
    }
    float f15 = 0.5F;
    f1 += f15;
    int i2 = (int)f1;
    f2 += f15;
    int i7 = (int)f2;
    f1 += f16;
    int i6 = (int)f1;
    f2 += f17;
    int i8 = (int)f2;
    int i3 = i6 - i2;
    int i4 = i8 - i7;
    j = paramView.getMeasuredWidth();
    if (i3 == j)
    {
      j = paramView.getMeasuredHeight();
      if (i4 == j)
      {
        j = 0;
        arrayOfDouble2 = null;
        f5 = 0.0F;
        break label1327;
      }
    }
    j = i;
    f5 = f13;
    label1327:
    if ((j != 0) || (paramBoolean))
    {
      i5 = 1073741824;
      f4 = 2.0F;
      i3 = View.MeasureSpec.makeMeasureSpec(i3, i5);
      i4 = View.MeasureSpec.makeMeasureSpec(i4, i5);
      localView.measure(i3, i4);
    }
    localView.layout(i2, i7, i6, i8);
  }
  
  public void OooOo00(MotionController paramMotionController, MotionPaths paramMotionPaths)
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
    this.o00o000 = paramMotionController;
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
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionPaths
 * JD-Core Version:    0.7.0.1
 */