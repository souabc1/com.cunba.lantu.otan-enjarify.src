package androidx.constraintlayout.motion.widget;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewSpline.PathRotate;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet.Motion;
import androidx.constraintlayout.widget.ConstraintSet.Transform;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MotionController
{
  public MotionConstrainedPoint OooO;
  public Rect OooO00o;
  public View OooO0O0;
  public int OooO0OO;
  public boolean OooO0Oo;
  public int OooO0o;
  public String OooO0o0;
  public MotionPaths OooO0oO;
  public MotionPaths OooO0oo;
  public MotionConstrainedPoint OooOO0;
  public CurveFit[] OooOO0O;
  public CurveFit OooOO0o;
  public float OooOOO;
  public float OooOOO0;
  public float OooOOOO;
  public float OooOOOo;
  public int[] OooOOo;
  public float OooOOo0;
  public double[] OooOOoo;
  public float[] OooOo;
  public String[] OooOo0;
  public double[] OooOo00;
  public int[] OooOo0O;
  public int OooOo0o;
  public float[] OooOoO;
  public ArrayList OooOoO0;
  public ArrayList OooOoOO;
  public HashMap OooOoo;
  public HashMap OooOoo0;
  public HashMap OooOooO;
  public KeyTrigger[] OooOooo;
  public int Oooo0;
  public int Oooo000;
  public int Oooo00O;
  public View Oooo00o;
  public float Oooo0O0;
  public Interpolator Oooo0OO;
  public boolean Oooo0o0;
  
  public MotionController(View paramView)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.OooO00o = localRect;
    this.OooO0Oo = false;
    this.OooO0o = -1;
    Object localObject1 = new androidx/constraintlayout/motion/widget/MotionPaths;
    ((MotionPaths)localObject1).<init>();
    this.OooO0oO = ((MotionPaths)localObject1);
    localObject1 = new androidx/constraintlayout/motion/widget/MotionPaths;
    ((MotionPaths)localObject1).<init>();
    this.OooO0oo = ((MotionPaths)localObject1);
    localObject1 = new androidx/constraintlayout/motion/widget/MotionConstrainedPoint;
    ((MotionConstrainedPoint)localObject1).<init>();
    this.OooO = ((MotionConstrainedPoint)localObject1);
    localObject1 = new androidx/constraintlayout/motion/widget/MotionConstrainedPoint;
    ((MotionConstrainedPoint)localObject1).<init>();
    this.OooOO0 = ((MotionConstrainedPoint)localObject1);
    float f = 0.0F / 0.0F;
    this.OooOOO0 = f;
    this.OooOOO = 0.0F;
    this.OooOOOO = 1.0F;
    int i = 4;
    this.OooOo0o = i;
    Object localObject2 = new float[i];
    this.OooOo = ((float[])localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.OooOoO0 = ((ArrayList)localObject2);
    localObject2 = new float[1];
    this.OooOoO = ((float[])localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.OooOoOO = ((ArrayList)localObject2);
    i = Key.OooO0o;
    this.Oooo000 = i;
    this.Oooo00O = i;
    this.Oooo00o = null;
    this.Oooo0 = i;
    this.Oooo0O0 = f;
    this.Oooo0OO = null;
    this.Oooo0o0 = false;
    setView(paramView);
  }
  
  public static Interpolator OooOO0(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    int i = -2;
    if (paramInt1 != i)
    {
      int j = -1;
      if (paramInt1 != j)
      {
        if (paramInt1 != 0)
        {
          j = 1;
          if (paramInt1 != j)
          {
            j = 2;
            if (paramInt1 != j)
            {
              j = 4;
              if (paramInt1 != j)
              {
                j = 5;
                if (paramInt1 != j) {
                  return null;
                }
                paramContext = new android/view/animation/OvershootInterpolator;
                paramContext.<init>();
                return paramContext;
              }
              paramContext = new android/view/animation/BounceInterpolator;
              paramContext.<init>();
              return paramContext;
            }
            paramContext = new android/view/animation/DecelerateInterpolator;
            paramContext.<init>();
            return paramContext;
          }
          paramContext = new android/view/animation/AccelerateInterpolator;
          paramContext.<init>();
          return paramContext;
        }
        paramContext = new android/view/animation/AccelerateDecelerateInterpolator;
        paramContext.<init>();
        return paramContext;
      }
      paramContext = Easing.OooO0OO(paramString);
      MotionController.1 local1 = new androidx/constraintlayout/motion/widget/MotionController$1;
      local1.<init>(paramContext);
      return local1;
    }
    return AnimationUtils.loadInterpolator(paramContext, paramInt2);
  }
  
  private float getPreCycleDistance()
  {
    MotionController localMotionController = this;
    int i = 2;
    float[] arrayOfFloat = new float[i];
    int j = 99;
    float f1 = j;
    float f2 = 1.0F;
    float f3 = f2 / f1;
    double d1 = 0.0D;
    double d2 = d1;
    double d3 = d1;
    float f4 = 0.0F;
    int k = 0;
    float f5 = 0.0F;
    for (;;)
    {
      j = 100;
      f1 = 1.401299E-043F;
      if (k >= j) {
        break;
      }
      f1 = k * f3;
      double d4 = f1;
      Object localObject1 = localMotionController.OooO0oO.o00OoOoo;
      Object localObject2 = localMotionController.OooOoO0.iterator();
      float f6 = 0.0F / 0.0F;
      float f7 = 0.0F;
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        Object localObject3 = ((Iterator)localObject2).next();
        localObject4 = localObject3;
        localObject4 = (MotionPaths)localObject3;
        Easing localEasing = ((MotionPaths)localObject4).o00OoOoo;
        if (localEasing != null)
        {
          float f8 = ((MotionPaths)localObject4).o00Ooo0;
          boolean bool2 = f8 < f1;
          if (bool2)
          {
            localObject1 = localEasing;
            f7 = f8;
          }
          else
          {
            boolean bool3 = Float.isNaN(f6);
            if (bool3)
            {
              f2 = ((MotionPaths)localObject4).o00Ooo0;
              f6 = f2;
            }
          }
        }
        f2 = 1.0F;
      }
      if (localObject1 != null)
      {
        boolean bool4 = Float.isNaN(f6);
        if (bool4) {
          f6 = 1.0F;
        }
        f1 -= f7;
        f6 -= f7;
        d1 = f1 / f6;
        f1 = (float)((Easing)localObject1).OooO00o(d1) * f6 + f7;
        d1 = f1;
        d4 = d1;
      }
      Object localObject5 = localMotionController.OooOO0O;
      float f9 = 0.0F;
      localObject5 = localObject5[0];
      localObject1 = localMotionController.OooOOoo;
      ((CurveFit)localObject5).OooO0Oo(d4, (double[])localObject1);
      localObject5 = localMotionController.OooO0oO;
      localObject1 = localMotionController.OooOOo;
      localObject2 = localMotionController.OooOOoo;
      f2 = 0.0F;
      Object localObject4 = null;
      f10 = f4;
      int m = k;
      k = 0;
      f5 = 0.0F;
      ((MotionPaths)localObject5).OooO0oO(d4, (int[])localObject1, (double[])localObject2, arrayOfFloat, 0);
      j = 1;
      f1 = 1.4E-45F;
      float f11;
      if (m > 0)
      {
        d4 = f4;
        f9 = arrayOfFloat[j];
        double d5 = f9;
        d5 = d3 - d5;
        f4 = 0.0F;
        f5 = arrayOfFloat[0];
        double d6 = f5;
        d2 -= d6;
        d5 = Math.hypot(d5, d2);
        d4 += d5;
        f11 = (float)d4;
      }
      else
      {
        f4 = 0.0F;
        f11 = f10;
      }
      float f12 = arrayOfFloat[0];
      d2 = f12;
      f1 = arrayOfFloat[j];
      double d7 = f1;
      k = m + 1;
      f4 = f11;
      d3 = d7;
      f2 = 1.0F;
    }
    float f10 = f4;
    return f4;
  }
  
  public void OooO(float paramFloat1, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat)
  {
    Object localObject1 = this.OooOoO;
    paramFloat1 = OooO0oO(paramFloat1, (float[])localObject1);
    localObject1 = this.OooOO0O;
    int i = 0;
    if (localObject1 != null)
    {
      localObject1 = localObject1[0];
      double d1 = paramFloat1;
      localObject2 = this.OooOo00;
      ((CurveFit)localObject1).OooO0oO(d1, (double[])localObject2);
      localObject2 = this.OooOO0O[0];
      localObject1 = this.OooOOoo;
      ((CurveFit)localObject2).OooO0Oo(d1, (double[])localObject1);
      localObject2 = this.OooOoO;
      paramFloat1 = localObject2[0];
      double[] arrayOfDouble1;
      for (;;)
      {
        arrayOfDouble1 = this.OooOo00;
        int j = arrayOfDouble1.length;
        if (i >= j) {
          break;
        }
        double d2 = arrayOfDouble1[i];
        double d3 = paramFloat1;
        d2 *= d3;
        arrayOfDouble1[i] = d2;
        i += 1;
      }
      localObject2 = this.OooOO0o;
      if (localObject2 != null)
      {
        localObject1 = this.OooOOoo;
        i = localObject1.length;
        if (i > 0)
        {
          ((CurveFit)localObject2).OooO0Oo(d1, (double[])localObject1);
          localObject2 = this.OooOO0o;
          localObject1 = this.OooOo00;
          ((CurveFit)localObject2).OooO0oO(d1, (double[])localObject1);
          localMotionPaths1 = this.OooO0oO;
          arrayOfInt = this.OooOOo;
          arrayOfDouble1 = this.OooOo00;
          arrayOfDouble2 = this.OooOOoo;
          f1 = paramFloat2;
          localMotionPaths1.OooOOo(paramFloat2, paramFloat3, paramArrayOfFloat, arrayOfInt, arrayOfDouble1, arrayOfDouble2);
        }
        return;
      }
      MotionPaths localMotionPaths1 = this.OooO0oO;
      int[] arrayOfInt = this.OooOOo;
      double[] arrayOfDouble2 = this.OooOOoo;
      f1 = paramFloat2;
      localMotionPaths1.OooOOo(paramFloat2, paramFloat3, paramArrayOfFloat, arrayOfInt, arrayOfDouble1, arrayOfDouble2);
      return;
    }
    Object localObject2 = this.OooO0oo;
    float f2 = ((MotionPaths)localObject2).o00Ooo0o;
    MotionPaths localMotionPaths2 = this.OooO0oO;
    float f3 = localMotionPaths2.o00Ooo0o;
    f2 -= f3;
    f3 = ((MotionPaths)localObject2).o00OooO0;
    float f4 = localMotionPaths2.o00OooO0;
    f3 -= f4;
    f4 = ((MotionPaths)localObject2).o00OooO;
    float f1 = localMotionPaths2.o00OooO;
    f4 -= f1;
    paramFloat1 = ((MotionPaths)localObject2).o00OooOO;
    float f5 = localMotionPaths2.o00OooOO;
    paramFloat1 -= f5;
    f4 += f2;
    paramFloat1 += f3;
    f5 = 1.0F;
    f1 = f5 - paramFloat2;
    f2 *= f1;
    f4 *= paramFloat2;
    f2 += f4;
    paramArrayOfFloat[0] = f2;
    f5 -= paramFloat3;
    f3 *= f5;
    paramFloat1 *= paramFloat3;
    f3 += paramFloat1;
    paramArrayOfFloat[1] = f3;
  }
  
  public void OooO00o(Key paramKey)
  {
    this.OooOoOO.add(paramKey);
  }
  
  public void OooO0O0(ArrayList paramArrayList)
  {
    this.OooOoOO.addAll(paramArrayList);
  }
  
  public int OooO0OO(float[] paramArrayOfFloat, int[] paramArrayOfInt)
  {
    if (paramArrayOfFloat != null)
    {
      double[] arrayOfDouble1 = this.OooOO0O[0].getTimePoints();
      Object localObject1;
      if (paramArrayOfInt != null)
      {
        localObject1 = this.OooOoO0.iterator();
        int k;
        for (int i = 0;; i = k)
        {
          boolean bool = ((Iterator)localObject1).hasNext();
          if (!bool) {
            break;
          }
          MotionPaths localMotionPaths = (MotionPaths)((Iterator)localObject1).next();
          k = i + 1;
          int j = localMotionPaths.o00o000o;
          paramArrayOfInt[i] = j;
        }
      }
      int m = 0;
      paramArrayOfInt = null;
      int n = 0;
      for (;;)
      {
        int i1 = arrayOfDouble1.length;
        if (m >= i1) {
          break;
        }
        localObject1 = this.OooOO0O[0];
        double d = arrayOfDouble1[m];
        Object localObject2 = this.OooOOoo;
        ((CurveFit)localObject1).OooO0Oo(d, (double[])localObject2);
        localObject1 = this.OooO0oO;
        d = arrayOfDouble1[m];
        localObject2 = this.OooOOo;
        double[] arrayOfDouble2 = this.OooOOoo;
        ((MotionPaths)localObject1).OooO0oO(d, (int[])localObject2, arrayOfDouble2, paramArrayOfFloat, n);
        n += 2;
        m += 1;
      }
      return n / 2;
    }
    return 0;
  }
  
  public void OooO0Oo(float[] paramArrayOfFloat, int paramInt)
  {
    MotionController localMotionController = this;
    int i = paramInt;
    int j = paramInt + -1;
    float f1 = j;
    float f2 = 1.0F;
    float f3 = f2 / f1;
    Object localObject1 = this.OooOoo;
    String str = "translationX";
    boolean bool2 = false;
    float f4 = 0.0F;
    Object localObject2 = null;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject3 = null;
    }
    else
    {
      localObject1 = (SplineSet)((HashMap)localObject1).get(str);
      localObject3 = localObject1;
    }
    localObject1 = localMotionController.OooOoo;
    Object localObject4 = "translationY";
    Object localObject5;
    if (localObject1 == null)
    {
      localObject5 = null;
    }
    else
    {
      localObject1 = (SplineSet)((HashMap)localObject1).get(localObject4);
      localObject5 = localObject1;
    }
    localObject1 = localMotionController.OooOooO;
    Object localObject6;
    if (localObject1 == null)
    {
      localObject6 = null;
    }
    else
    {
      localObject1 = (ViewOscillator)((HashMap)localObject1).get(str);
      localObject6 = localObject1;
    }
    localObject1 = localMotionController.OooOooO;
    if (localObject1 != null)
    {
      localObject1 = ((HashMap)localObject1).get(localObject4);
      localObject2 = localObject1;
      localObject2 = (ViewOscillator)localObject1;
    }
    Object localObject7 = localObject2;
    int k = 0;
    while (k < i)
    {
      f1 = k * f3;
      float f5 = localMotionController.OooOOOO;
      bool2 = f5 < f2;
      float f6 = 0.0F;
      localObject4 = null;
      if (bool2)
      {
        f4 = localMotionController.OooOOO;
        boolean bool3 = f1 < f4;
        if (bool3)
        {
          j = 0;
          localObject1 = null;
          f1 = 0.0F;
        }
        bool3 = f1 < f4;
        if (bool3)
        {
          double d1 = f1;
          double d2 = 1.0D;
          bool3 = d1 < d2;
          if (bool3) {
            f1 = Math.min((f1 - f4) * f5, f2);
          }
        }
      }
      float f7 = f1;
      double d3 = f1;
      localObject2 = localMotionController.OooO0oO.o00OoOoo;
      Object localObject8 = localMotionController.OooOoO0.iterator();
      int n = 2143289344;
      float f8 = 0.0F / 0.0F;
      boolean bool1;
      for (;;)
      {
        boolean bool4 = ((Iterator)localObject8).hasNext();
        if (!bool4) {
          break;
        }
        Object localObject9 = ((Iterator)localObject8).next();
        localObject10 = localObject9;
        localObject10 = (MotionPaths)localObject9;
        Easing localEasing = ((MotionPaths)localObject10).o00OoOoo;
        d4 = d3;
        if (localEasing != null)
        {
          f1 = ((MotionPaths)localObject10).o00Ooo0;
          boolean bool5 = f1 < f7;
          if (bool5)
          {
            f6 = f1;
            localObject2 = localEasing;
          }
          else
          {
            bool1 = Float.isNaN(f8);
            if (bool1)
            {
              f1 = ((MotionPaths)localObject10).o00Ooo0;
              f8 = f1;
            }
          }
        }
        d3 = d4;
        f2 = 1.0F;
      }
      double d4 = d3;
      double d5;
      if (localObject2 != null)
      {
        bool1 = Float.isNaN(f8);
        if (bool1)
        {
          n = 1065353216;
          f8 = 1.0F;
        }
        f1 = f7 - f6;
        f8 -= f6;
        d3 = f1 / f8;
        f1 = (float)((Easing)localObject2).OooO00o(d3) * f8 + f6;
        d3 = f1;
        d5 = d3;
      }
      else
      {
        d5 = d3;
      }
      localObject1 = localMotionController.OooOO0O;
      f2 = 0.0F;
      Object localObject10 = null;
      localObject1 = localObject1[0];
      localObject4 = localMotionController.OooOOoo;
      ((CurveFit)localObject1).OooO0Oo(d5, (double[])localObject4);
      localObject1 = localMotionController.OooOO0o;
      if (localObject1 != null)
      {
        localObject4 = localMotionController.OooOOoo;
        int m = localObject4.length;
        if (m > 0) {
          ((CurveFit)localObject1).OooO0Oo(d5, (double[])localObject4);
        }
      }
      localObject1 = localMotionController.OooO0oO;
      localObject4 = localMotionController.OooOOo;
      localObject8 = localMotionController.OooOOoo;
      int i1 = k * 2;
      f2 = f7;
      n = k;
      k = i1;
      ((MotionPaths)localObject1).OooO0oO(d5, (int[])localObject4, (double[])localObject8, paramArrayOfFloat, i1);
      if (localObject6 != null)
      {
        f1 = paramArrayOfFloat[i1];
        f5 = localObject6.OooO00o(f7);
        f1 += f5;
        paramArrayOfFloat[i1] = f1;
      }
      else if (localObject3 != null)
      {
        f1 = paramArrayOfFloat[i1];
        f5 = localObject3.OooO00o(f7);
        f1 += f5;
        paramArrayOfFloat[i1] = f1;
      }
      if (localObject7 != null)
      {
        i1 += 1;
        f1 = paramArrayOfFloat[i1];
        f5 = localObject7.OooO00o(f2);
        f1 += f5;
        paramArrayOfFloat[i1] = f1;
      }
      else if (localObject5 != null)
      {
        i1 += 1;
        f1 = paramArrayOfFloat[i1];
        f5 = localObject5.OooO00o(f2);
        f1 += f5;
        paramArrayOfFloat[i1] = f1;
      }
      k = n + 1;
      f2 = 1.0F;
    }
  }
  
  public void OooO0o(boolean paramBoolean)
  {
    Object localObject1 = Debug.OooO0O0(this.OooO0O0);
    Object localObject2 = "button";
    int i = ((String)localObject2).equals(localObject1);
    if (i != 0)
    {
      localObject1 = this.OooOooo;
      if (localObject1 != null)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.OooOooo;
          int k = localObject2.length;
          if (i >= k) {
            break;
          }
          localObject2 = localObject2[i];
          int m;
          float f;
          if (paramBoolean)
          {
            m = -1027080192;
            f = -100.0F;
          }
          else
          {
            m = 1120403456;
            f = 100.0F;
          }
          View localView = this.OooO0O0;
          ((KeyTrigger)localObject2).OooOo0o(f, localView);
          int j;
          i += 1;
        }
      }
    }
  }
  
  public void OooO0o0(float paramFloat, float[] paramArrayOfFloat, int paramInt)
  {
    paramFloat = OooO0oO(paramFloat, null);
    Object localObject1 = this.OooOO0O[0];
    double d = paramFloat;
    Object localObject2 = this.OooOOoo;
    ((CurveFit)localObject1).OooO0Oo(d, (double[])localObject2);
    localObject2 = this.OooO0oO;
    localObject1 = this.OooOOo;
    double[] arrayOfDouble = this.OooOOoo;
    ((MotionPaths)localObject2).OooOO0O((int[])localObject1, arrayOfDouble, paramArrayOfFloat, paramInt);
  }
  
  public final float OooO0oO(float paramFloat, float[] paramArrayOfFloat)
  {
    float f1 = 0.0F;
    float f2 = 1.0F;
    double d1;
    double d2;
    boolean bool1;
    if (paramArrayOfFloat != null)
    {
      paramArrayOfFloat[0] = f2;
    }
    else
    {
      float f3 = this.OooOOOO;
      d1 = f3;
      d2 = 1.0D;
      bool1 = d1 < d2;
      if (bool1)
      {
        float f4 = this.OooOOO;
        boolean bool2 = paramFloat < f4;
        if (bool2) {
          paramFloat = 0.0F;
        }
        bool2 = paramFloat < f4;
        if (bool2)
        {
          double d3 = paramFloat;
          bool2 = d3 < d2;
          if (bool2) {
            paramFloat = Math.min((paramFloat - f4) * f3, f2);
          }
        }
      }
    }
    Object localObject = this.OooO0oO.o00OoOoo;
    Iterator localIterator = this.OooOoO0.iterator();
    int i = 2143289344;
    float f5 = 0.0F / 0.0F;
    for (;;)
    {
      boolean bool3 = localIterator.hasNext();
      if (!bool3) {
        break;
      }
      MotionPaths localMotionPaths = (MotionPaths)localIterator.next();
      Easing localEasing = localMotionPaths.o00OoOoo;
      if (localEasing != null)
      {
        float f6 = localMotionPaths.o00Ooo0;
        boolean bool4 = f6 < paramFloat;
        if (bool4)
        {
          localObject = localEasing;
          f1 = f6;
        }
        else
        {
          boolean bool5 = Float.isNaN(f5);
          if (bool5) {
            f5 = localMotionPaths.o00Ooo0;
          }
        }
      }
    }
    if (localObject != null)
    {
      bool1 = Float.isNaN(f5);
      if (!bool1) {
        f2 = f5;
      }
      paramFloat -= f1;
      f2 -= f1;
      d1 = paramFloat / f2;
      d2 = ((Easing)localObject).OooO00o(d1);
      paramFloat = (float)d2 * f2 + f1;
      if (paramArrayOfFloat != null)
      {
        double d4 = ((Easing)localObject).OooO0O0(d1);
        f1 = (float)d4;
        paramArrayOfFloat[0] = f1;
      }
    }
    return paramFloat;
  }
  
  public void OooO0oo(double paramDouble, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    int i = 4;
    double[] arrayOfDouble1 = new double[i];
    double[] arrayOfDouble2 = new double[i];
    this.OooOO0O[0].OooO0Oo(paramDouble, arrayOfDouble1);
    this.OooOO0O[0].OooO0oO(paramDouble, arrayOfDouble2);
    Arrays.fill(paramArrayOfFloat2, 0.0F);
    MotionPaths localMotionPaths = this.OooO0oO;
    int[] arrayOfInt = this.OooOOo;
    localMotionPaths.OooO0oo(paramDouble, arrayOfInt, arrayOfDouble1, paramArrayOfFloat1, arrayOfDouble2, paramArrayOfFloat2);
  }
  
  public void OooOO0O(float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat)
  {
    MotionController localMotionController = this;
    Object localObject1 = this.OooOoO;
    float f1 = OooO0oO(paramFloat1, (float[])localObject1);
    Object localObject2 = this.OooOoo;
    Object localObject3 = "translationX";
    float f2 = 0.0F;
    Object localObject4 = null;
    int i;
    if (localObject2 == null)
    {
      i = 0;
      localObject2 = null;
    }
    else
    {
      localObject2 = (SplineSet)((HashMap)localObject2).get(localObject3);
    }
    Object localObject5 = localMotionController.OooOoo;
    Object localObject6 = "translationY";
    if (localObject5 == null) {
      localObject5 = null;
    } else {
      localObject5 = (SplineSet)((HashMap)localObject5).get(localObject6);
    }
    Object localObject7 = localMotionController.OooOoo;
    Object localObject8 = "rotation";
    if (localObject7 == null) {
      localObject7 = null;
    } else {
      localObject7 = (SplineSet)((HashMap)localObject7).get(localObject8);
    }
    Object localObject9 = localMotionController.OooOoo;
    Object localObject10 = "scaleX";
    if (localObject9 == null) {
      localObject9 = null;
    } else {
      localObject9 = (SplineSet)((HashMap)localObject9).get(localObject10);
    }
    Object localObject11 = localMotionController.OooOoo;
    Object localObject12 = "scaleY";
    if (localObject11 == null) {
      localObject11 = null;
    } else {
      localObject11 = (SplineSet)((HashMap)localObject11).get(localObject12);
    }
    Object localObject13 = localMotionController.OooOooO;
    int j;
    if (localObject13 == null)
    {
      j = 0;
      localObject3 = null;
    }
    else
    {
      localObject3 = (ViewOscillator)((HashMap)localObject13).get(localObject3);
    }
    localObject13 = localMotionController.OooOooO;
    if (localObject13 == null) {
      localObject6 = null;
    } else {
      localObject6 = (ViewOscillator)((HashMap)localObject13).get(localObject6);
    }
    localObject13 = localMotionController.OooOooO;
    if (localObject13 == null) {
      localObject8 = null;
    } else {
      localObject8 = (ViewOscillator)((HashMap)localObject13).get(localObject8);
    }
    localObject13 = localMotionController.OooOooO;
    if (localObject13 == null)
    {
      localObject10 = null;
      f3 = 0.0F;
    }
    else
    {
      localObject10 = (ViewOscillator)((HashMap)localObject13).get(localObject10);
    }
    localObject13 = localMotionController.OooOooO;
    if (localObject13 != null) {
      localObject4 = (ViewOscillator)((HashMap)localObject13).get(localObject12);
    }
    localObject12 = new androidx/constraintlayout/core/motion/utils/VelocityMatrix;
    ((VelocityMatrix)localObject12).<init>();
    ((VelocityMatrix)localObject12).OooO0O0();
    ((VelocityMatrix)localObject12).OooO0Oo((SplineSet)localObject7, f1);
    ((VelocityMatrix)localObject12).OooO0oo((SplineSet)localObject2, (SplineSet)localObject5, f1);
    ((VelocityMatrix)localObject12).OooO0o((SplineSet)localObject9, (SplineSet)localObject11, f1);
    ((VelocityMatrix)localObject12).OooO0OO((KeyCycleOscillator)localObject8, f1);
    ((VelocityMatrix)localObject12).OooO0oO((KeyCycleOscillator)localObject3, (KeyCycleOscillator)localObject6, f1);
    ((VelocityMatrix)localObject12).OooO0o0((KeyCycleOscillator)localObject10, (KeyCycleOscillator)localObject4, f1);
    localObject13 = localMotionController.OooOO0o;
    double d1;
    if (localObject13 != null)
    {
      localObject2 = localMotionController.OooOOoo;
      j = localObject2.length;
      if (j > 0)
      {
        d1 = f1;
        ((CurveFit)localObject13).OooO0Oo(d1, (double[])localObject2);
        localObject1 = localMotionController.OooOO0o;
        localObject2 = localMotionController.OooOo00;
        ((CurveFit)localObject1).OooO0oO(d1, (double[])localObject2);
        localObject1 = localMotionController.OooO0oO;
        localObject5 = localMotionController.OooOOo;
        localObject6 = localMotionController.OooOo00;
        localObject7 = localMotionController.OooOOoo;
        localObject4 = paramArrayOfFloat;
        ((MotionPaths)localObject1).OooOOo(paramFloat2, paramFloat3, paramArrayOfFloat, (int[])localObject5, (double[])localObject6, (double[])localObject7);
      }
      localObject1 = localObject12;
      localObject6 = paramArrayOfFloat;
      ((VelocityMatrix)localObject12).OooO00o(paramFloat2, paramFloat3, paramInt1, paramInt2, paramArrayOfFloat);
      return;
    }
    localObject13 = localMotionController.OooOO0O;
    int k = 0;
    float f4 = 0.0F;
    MotionPaths localMotionPaths = null;
    if (localObject13 != null)
    {
      localObject2 = localMotionController.OooOoO;
      f1 = localMotionController.OooO0oO(f1, (float[])localObject2);
      localObject2 = localMotionController.OooOO0O[0];
      d1 = f1;
      localObject1 = localMotionController.OooOo00;
      ((CurveFit)localObject2).OooO0oO(d1, (double[])localObject1);
      localObject1 = localMotionController.OooOO0O[0];
      localObject2 = localMotionController.OooOOoo;
      ((CurveFit)localObject1).OooO0Oo(d1, (double[])localObject2);
      localObject1 = localMotionController.OooOoO;
      f1 = localObject1[0];
      for (;;)
      {
        localObject6 = localMotionController.OooOo00;
        i = localObject6.length;
        if (k >= i) {
          break;
        }
        double d2 = localObject6[k];
        double d3 = f1;
        d2 *= d3;
        localObject6[k] = d2;
        k += 1;
      }
      localObject1 = localMotionController.OooO0oO;
      localObject5 = localMotionController.OooOOo;
      localObject7 = localMotionController.OooOOoo;
      localObject4 = paramArrayOfFloat;
      ((MotionPaths)localObject1).OooOOo(paramFloat2, paramFloat3, paramArrayOfFloat, (int[])localObject5, (double[])localObject6, (double[])localObject7);
      localObject1 = localObject12;
      localObject6 = paramArrayOfFloat;
      ((VelocityMatrix)localObject12).OooO00o(paramFloat2, paramFloat3, paramInt1, paramInt2, paramArrayOfFloat);
      return;
    }
    localObject13 = localMotionController.OooO0oo;
    float f5 = ((MotionPaths)localObject13).o00Ooo0o;
    localMotionPaths = localMotionController.OooO0oO;
    float f6 = localMotionPaths.o00Ooo0o;
    f5 -= f6;
    f6 = ((MotionPaths)localObject13).o00OooO0;
    f2 = localMotionPaths.o00OooO0;
    f6 -= f2;
    f2 = ((MotionPaths)localObject13).o00OooO;
    float f3 = localMotionPaths.o00OooO;
    f2 -= f3;
    f3 = ((MotionPaths)localObject13).o00OooOO;
    float f7 = localMotionPaths.o00OooOO;
    f3 -= f7;
    f2 += f5;
    f3 += f6;
    f7 = 1.0F;
    f4 = f7 - paramFloat2;
    f5 *= f4;
    f2 *= paramFloat2;
    f5 += f2;
    paramArrayOfFloat[0] = f5;
    f7 -= paramFloat3;
    f6 *= f7;
    f3 *= paramFloat3;
    f6 += f3;
    paramArrayOfFloat[1] = f6;
    ((VelocityMatrix)localObject12).OooO0O0();
    ((VelocityMatrix)localObject12).OooO0Oo((SplineSet)localObject7, f1);
    ((VelocityMatrix)localObject12).OooO0oo((SplineSet)localObject2, (SplineSet)localObject5, f1);
    ((VelocityMatrix)localObject12).OooO0o((SplineSet)localObject9, (SplineSet)localObject11, f1);
    ((VelocityMatrix)localObject12).OooO0OO((KeyCycleOscillator)localObject8, f1);
    ((VelocityMatrix)localObject12).OooO0oO((KeyCycleOscillator)localObject3, (KeyCycleOscillator)localObject6, f1);
    ((VelocityMatrix)localObject12).OooO0o0((KeyCycleOscillator)localObject10, (KeyCycleOscillator)localObject4, f1);
    localObject1 = localObject12;
    localObject6 = paramArrayOfFloat;
    ((VelocityMatrix)localObject12).OooO00o(paramFloat2, paramFloat3, paramInt1, paramInt2, paramArrayOfFloat);
  }
  
  public final void OooOO0o(MotionPaths paramMotionPaths)
  {
    ArrayList localArrayList = this.OooOoO0;
    int i = Collections.binarySearch(localArrayList, paramMotionPaths);
    if (i == 0)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(" KeyPath position \"");
      float f = paramMotionPaths.o00Ooo0O;
      ((StringBuilder)localObject).append(f);
      String str = "\" outside of range";
      ((StringBuilder)localObject).append(str);
    }
    Object localObject = this.OooOoO0;
    i = -i + -1;
    ((ArrayList)localObject).add(i, paramMotionPaths);
  }
  
  public final void OooOOO(MotionPaths paramMotionPaths)
  {
    float f1 = (int)this.OooO0O0.getX();
    float f2 = (int)this.OooO0O0.getY();
    float f3 = this.OooO0O0.getWidth();
    float f4 = this.OooO0O0.getHeight();
    paramMotionPaths.OooOOo0(f1, f2, f3, f4);
  }
  
  public boolean OooOOO0(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
  {
    MotionController localMotionController = this;
    View localView = paramView;
    boolean bool1 = false;
    float f1 = 0.0F;
    Object localObject1 = null;
    float f2 = paramFloat;
    f2 = OooO0oO(paramFloat, null);
    int m = this.Oooo0;
    int i3 = Key.OooO0o;
    int i4 = 1065353216;
    float f3 = 1.0F;
    float f4;
    double d1;
    float f5;
    float f6;
    boolean bool6;
    Object localObject2;
    double d3;
    boolean bool7;
    if (m != i3)
    {
      f4 = m;
      f4 = f3 / f4;
      d1 = Math.floor(f2 / f4);
      f5 = (float)d1 * f4;
      f2 = f2 % f4 / f4;
      f6 = this.Oooo0O0;
      bool6 = Float.isNaN(f6);
      if (!bool6)
      {
        f6 = this.Oooo0O0;
        f2 = (f2 + f6) % f3;
      }
      localObject2 = localMotionController.Oooo0OO;
      if (localObject2 != null)
      {
        f2 = ((TimeInterpolator)localObject2).getInterpolation(f2);
      }
      else
      {
        double d2 = f2;
        d3 = 0.5D;
        bool7 = d2 < d3;
        if (bool7)
        {
          bool7 = i4;
          f2 = f3;
        }
        else
        {
          bool7 = false;
          f2 = 0.0F;
          localObject3 = null;
        }
      }
      f2 = f2 * f4 + f5;
    }
    float f7 = f2;
    Object localObject3 = localMotionController.OooOoo;
    Object localObject4;
    if (localObject3 != null)
    {
      localObject3 = ((HashMap)localObject3).values().iterator();
      for (;;)
      {
        boolean bool5 = ((Iterator)localObject3).hasNext();
        if (!bool5) {
          break;
        }
        localObject4 = (ViewSpline)((Iterator)localObject3).next();
        ((ViewSpline)localObject4).OooO0o0(localView, f7);
      }
    }
    localObject3 = localMotionController.OooOoo0;
    Iterator localIterator;
    int i8;
    Object localObject5;
    float f8;
    boolean bool11;
    Object localObject6;
    float f9;
    Object localObject7;
    boolean bool12;
    if (localObject3 != null)
    {
      localObject3 = ((HashMap)localObject3).values();
      localIterator = ((Collection)localObject3).iterator();
      i8 = 0;
      localObject5 = null;
      f8 = 0.0F;
      bool11 = false;
      localObject6 = null;
      f9 = 0.0F;
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (ViewTimeCycle)localIterator.next();
        bool7 = localObject1 instanceof ViewTimeCycle.PathRotate;
        if (bool7)
        {
          localObject5 = localObject1;
          localObject5 = (ViewTimeCycle.PathRotate)localObject1;
        }
        else
        {
          localObject3 = paramView;
          f4 = f7;
          localObject7 = paramKeyCache;
          bool1 = ((ViewTimeCycle)localObject1).OooO0o(paramView, f7, paramLong, paramKeyCache);
          bool11 |= bool1;
        }
      }
      bool12 = bool11;
      localObject6 = localObject5;
    }
    else
    {
      bool11 = false;
      localObject6 = null;
      f9 = 0.0F;
      bool12 = false;
    }
    localObject1 = localMotionController.OooOO0O;
    int i10 = 1;
    float f10 = 1.4E-45F;
    int i11;
    float f11;
    int i2;
    double d5;
    int i12;
    float f12;
    int i7;
    if (localObject1 != null)
    {
      localObject1 = localObject1[0];
      d3 = f7;
      localObject3 = localMotionController.OooOOoo;
      ((CurveFit)localObject1).OooO0Oo(d3, (double[])localObject3);
      localObject1 = localMotionController.OooOO0O[0];
      localObject3 = localMotionController.OooOo00;
      ((CurveFit)localObject1).OooO0oO(d3, (double[])localObject3);
      localObject1 = localMotionController.OooOO0o;
      if (localObject1 != null)
      {
        localObject3 = localMotionController.OooOOoo;
        int n = localObject3.length;
        if (n > 0)
        {
          ((CurveFit)localObject1).OooO0Oo(d3, (double[])localObject3);
          localObject1 = localMotionController.OooOO0o;
          localObject3 = localMotionController.OooOo00;
          ((CurveFit)localObject1).OooO0oO(d3, (double[])localObject3);
        }
      }
      bool1 = localMotionController.Oooo0o0;
      Object localObject8;
      double d4;
      if (!bool1)
      {
        localObject1 = localMotionController.OooO0oO;
        localObject8 = localMotionController.OooOOo;
        localObject2 = localMotionController.OooOOoo;
        localObject7 = localMotionController.OooOo00;
        int i1 = localMotionController.OooO0Oo;
        f2 = f7;
        localObject4 = paramView;
        d4 = d3;
        i11 = 0;
        localIterator = null;
        f11 = 0.0F;
        i8 = i1;
        ((MotionPaths)localObject1).OooOOoo(f7, paramView, (int[])localObject8, (double[])localObject2, (double[])localObject7, null, i1);
        localMotionController.OooO0Oo = false;
      }
      else
      {
        d4 = d3;
      }
      int i = localMotionController.Oooo00O;
      int i5 = Key.OooO0o;
      if (i != i5)
      {
        localObject1 = localMotionController.Oooo00o;
        if (localObject1 == null)
        {
          localObject1 = (View)paramView.getParent();
          i5 = localMotionController.Oooo00O;
          localObject1 = ((View)localObject1).findViewById(i5);
          localMotionController.Oooo00o = ((View)localObject1);
        }
        localObject1 = localMotionController.Oooo00o;
        if (localObject1 != null)
        {
          i = ((View)localObject1).getTop();
          localObject3 = localMotionController.Oooo00o;
          i5 = ((View)localObject3).getBottom();
          i += i5;
          f1 = i;
          f2 = 2.0F;
          f1 /= f2;
          localObject4 = localMotionController.Oooo00o;
          i2 = ((View)localObject4).getLeft();
          localObject8 = localMotionController.Oooo00o;
          i3 = ((View)localObject8).getRight();
          i2 += i3;
          f4 = i2 / f2;
          i5 = paramView.getRight();
          i3 = paramView.getLeft();
          i5 -= i3;
          if (i5 > 0)
          {
            i5 = paramView.getBottom();
            i3 = paramView.getTop();
            i5 -= i3;
            if (i5 > 0)
            {
              f2 = paramView.getLeft();
              f4 -= f2;
              i5 = paramView.getTop();
              f2 = i5;
              f1 -= f2;
              localView.setPivotX(f4);
              localView.setPivotY(f1);
            }
          }
        }
      }
      localObject1 = localMotionController.OooOoo;
      boolean bool2;
      if (localObject1 != null)
      {
        localObject1 = ((HashMap)localObject1).values();
        localObject5 = ((Collection)localObject1).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject5).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (SplineSet)((Iterator)localObject5).next();
          boolean bool8 = localObject1 instanceof ViewSpline.PathRotate;
          if (bool8)
          {
            localObject3 = localMotionController.OooOo00;
            i2 = localObject3.length;
            if (i2 > i10)
            {
              localObject1 = (ViewSpline.PathRotate)localObject1;
              d1 = localObject3[0];
              d5 = localObject3[i10];
              localObject3 = paramView;
              f4 = f7;
              ((ViewSpline.PathRotate)localObject1).OooO0o(paramView, f7, d1, d5);
            }
          }
        }
      }
      if (localObject6 != null)
      {
        localObject1 = localMotionController.OooOo00;
        d3 = localObject1[0];
        double d6 = localObject1[i10];
        localObject1 = localObject6;
        localObject3 = paramView;
        localObject4 = paramKeyCache;
        f5 = f7;
        i12 = i10;
        f12 = f10;
        bool2 = localObject6.OooO0oO(paramView, paramKeyCache, f7, paramLong, d3, d6);
        bool2 = bool12 | bool2;
        bool12 = bool2;
      }
      else
      {
        i12 = i10;
        f12 = f10;
      }
      i10 = i12;
      f10 = f12;
      for (;;)
      {
        localObject1 = localMotionController.OooOO0O;
        i6 = localObject1.length;
        if (i10 >= i6) {
          break;
        }
        localObject1 = localObject1[i10];
        localObject3 = localMotionController.OooOo;
        ((CurveFit)localObject1).OooO0o0(d4, (float[])localObject3);
        localObject1 = localMotionController.OooO0oO.o00o000O;
        localObject3 = localMotionController.OooOo0;
        i2 = i10 + -1;
        localObject3 = localObject3[i2];
        localObject1 = (ConstraintAttribute)((LinkedHashMap)localObject1).get(localObject3);
        localObject3 = localMotionController.OooOo;
        CustomSupport.OooO0O0((ConstraintAttribute)localObject1, localView, (float[])localObject3);
        i10 += 1;
      }
      localObject1 = localMotionController.OooO;
      int i6 = ((MotionConstrainedPoint)localObject1).o00Ooo00;
      int j;
      if (i6 == 0)
      {
        f2 = 0.0F;
        localObject3 = null;
        boolean bool9 = f7 < 0.0F;
        if (!bool9) {}
        for (;;)
        {
          j = ((MotionConstrainedPoint)localObject1).o00Ooo0;
          localView.setVisibility(j);
          break label1360;
          f2 = 1.0F;
          bool9 = f7 < f2;
          if (bool9) {
            break;
          }
          localObject1 = localMotionController.OooOO0;
        }
        localObject3 = localMotionController.OooOO0;
        i7 = ((MotionConstrainedPoint)localObject3).o00Ooo0;
        j = ((MotionConstrainedPoint)localObject1).o00Ooo0;
        if (i7 != j) {
          localView.setVisibility(0);
        }
      }
      label1360:
      localObject1 = localMotionController.OooOooo;
      if (localObject1 != null)
      {
        j = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject3 = localMotionController.OooOooo;
          i2 = localObject3.length;
          if (j >= i2) {
            break;
          }
          localObject3 = localObject3[j];
          ((KeyTrigger)localObject3).OooOo0o(f7, localView);
          j += 1;
        }
      }
    }
    else
    {
      i12 = i10;
      f12 = f10;
      localObject1 = localMotionController.OooO0oO;
      f2 = ((MotionPaths)localObject1).o00Ooo0o;
      localObject4 = localMotionController.OooO0oo;
      f5 = (((MotionPaths)localObject4).o00Ooo0o - f2) * f7;
      f2 += f5;
      f5 = ((MotionPaths)localObject1).o00OooO0;
      f6 = (((MotionPaths)localObject4).o00OooO0 - f5) * f7;
      f5 += f6;
      f6 = ((MotionPaths)localObject1).o00OooO;
      float f13 = ((MotionPaths)localObject4).o00OooO;
      f11 = (f13 - f6) * f7 + f6;
      f1 = ((MotionPaths)localObject1).o00OooOO;
      f4 = ((MotionPaths)localObject4).o00OooOO;
      f8 = (f4 - f1) * f7 + f1;
      f9 = 0.5F;
      f2 += f9;
      i10 = (int)f2;
      f5 += f9;
      int i9 = (int)f5;
      f2 += f11;
      i7 = (int)f2;
      f5 += f8;
      i3 = (int)f5;
      i11 = i7 - i10;
      i8 = i3 - i9;
      bool6 = f13 < f6;
      if (!bool6)
      {
        boolean bool3 = f4 < f1;
        if (!bool3)
        {
          bool3 = localMotionController.OooO0Oo;
          if (!bool3) {
            break label1701;
          }
        }
      }
      int k = 1073741824;
      f1 = 2.0F;
      i2 = View.MeasureSpec.makeMeasureSpec(i11, k);
      k = View.MeasureSpec.makeMeasureSpec(i8, k);
      localView.measure(i2, k);
      localMotionController.OooO0Oo = false;
      label1701:
      localView.layout(i10, i9, i7, i3);
    }
    localObject1 = localMotionController.OooOooO;
    if (localObject1 != null)
    {
      localObject1 = ((HashMap)localObject1).values();
      localObject5 = ((Collection)localObject1).iterator();
      for (;;)
      {
        boolean bool4 = ((Iterator)localObject5).hasNext();
        if (!bool4) {
          break;
        }
        localObject1 = (ViewOscillator)((Iterator)localObject5).next();
        boolean bool10 = localObject1 instanceof ViewOscillator.PathRotateSet;
        if (bool10)
        {
          localObject1 = (ViewOscillator.PathRotateSet)localObject1;
          localObject3 = localMotionController.OooOo00;
          d1 = localObject3[0];
          d5 = localObject3[i12];
          localObject3 = paramView;
          f4 = f7;
          ((ViewOscillator.PathRotateSet)localObject1).OooO0oo(paramView, f7, d1, d5);
        }
        else
        {
          ((ViewOscillator)localObject1).OooO0oO(localView, f7);
        }
      }
    }
    return bool12;
  }
  
  public void OooOOOO()
  {
    this.OooO0Oo = true;
  }
  
  public void OooOOOo(Rect paramRect1, Rect paramRect2, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    int j = 2;
    if (paramInt1 != i)
    {
      if (paramInt1 != j)
      {
        i = 3;
        if (paramInt1 != i)
        {
          paramInt3 = 4;
          if (paramInt1 != paramInt3) {
            return;
          }
          paramInt1 = paramRect1.left;
          paramInt3 = paramRect1.right;
          paramInt1 += paramInt3;
          paramInt3 = paramRect1.bottom;
          i = paramRect1.top;
        }
        else
        {
          paramInt1 = paramRect1.left;
          paramInt2 = paramRect1.right;
          paramInt1 += paramInt2;
          paramInt2 = paramRect1.height() / j;
          i = paramRect1.top;
          paramInt2 += i;
          i = paramInt1 / 2;
          paramInt2 -= i;
          break label260;
        }
      }
      else
      {
        paramInt1 = paramRect1.left;
        paramInt3 = paramRect1.right;
        paramInt1 += paramInt3;
        paramInt3 = paramRect1.top;
        i = paramRect1.bottom;
      }
      paramInt3 += i;
      i = paramRect1.width();
      paramInt3 = (paramInt3 + i) / j;
      paramInt2 -= paramInt3;
      paramRect2.left = paramInt2;
      paramInt2 = paramRect1.height();
      paramInt1 = (paramInt1 - paramInt2) / j;
      paramRect2.top = paramInt1;
      break label292;
    }
    else
    {
      paramInt1 = paramRect1.left;
      paramInt2 = paramRect1.right;
      paramInt1 += paramInt2;
      paramInt2 = paramRect1.top;
      i = paramRect1.bottom;
      paramInt2 += i;
      i = paramRect1.width();
      paramInt2 = (paramInt2 - i) / j;
    }
    label260:
    paramRect2.left = paramInt2;
    paramInt2 = paramRect1.height();
    paramInt1 = (paramInt1 + paramInt2) / j;
    paramInt3 -= paramInt1;
    paramRect2.top = paramInt3;
    label292:
    paramInt1 = paramRect2.left;
    paramInt2 = paramRect1.width();
    paramInt1 += paramInt2;
    paramRect2.right = paramInt1;
    paramInt1 = paramRect2.top;
    int k = paramRect1.height();
    paramInt1 += k;
    paramRect2.bottom = paramInt1;
  }
  
  public void OooOOo(Rect paramRect, ConstraintSet paramConstraintSet, int paramInt1, int paramInt2)
  {
    int i = paramConstraintSet.OooO0Oo;
    if (i != 0)
    {
      Rect localRect = this.OooO00o;
      OooOOOo(paramRect, localRect, i, paramInt1, paramInt2);
    }
    Object localObject1 = this.OooO0oO;
    ((MotionPaths)localObject1).o00Ooo0 = 0.0F;
    ((MotionPaths)localObject1).o00Ooo0O = 0.0F;
    OooOOO((MotionPaths)localObject1);
    localObject1 = this.OooO0oO;
    float f1 = paramRect.left;
    float f2 = paramRect.top;
    float f3 = paramRect.width();
    float f4 = paramRect.height();
    ((MotionPaths)localObject1).OooOOo0(f1, f2, f3, f4);
    paramInt1 = this.OooO0OO;
    localObject1 = paramConstraintSet.getParameters(paramInt1);
    this.OooO0oO.OooO0O0((ConstraintSet.Constraint)localObject1);
    f1 = ((ConstraintSet.Constraint)localObject1).OooO0Oo.OooO0oO;
    this.OooOOO0 = f1;
    Object localObject2 = this.OooO;
    int j = this.OooO0OO;
    ((MotionConstrainedPoint)localObject2).OooOO0(paramRect, paramConstraintSet, i, j);
    int k = ((ConstraintSet.Constraint)localObject1).OooO0o.OooO;
    this.Oooo00O = k;
    paramRect = ((ConstraintSet.Constraint)localObject1).OooO0Oo;
    int m = paramRect.OooOO0O;
    this.Oooo0 = m;
    float f5 = paramRect.OooOO0;
    this.Oooo0O0 = f5;
    paramRect = this.OooO0O0.getContext();
    paramConstraintSet = ((ConstraintSet.Constraint)localObject1).OooO0Oo;
    paramInt1 = paramConstraintSet.OooOOO0;
    localObject2 = paramConstraintSet.OooOO0o;
    m = paramConstraintSet.OooOOO;
    paramRect = OooOO0(paramRect, paramInt1, (String)localObject2, m);
    this.Oooo0OO = paramRect;
  }
  
  public void OooOOo0(Rect paramRect, ConstraintSet paramConstraintSet, int paramInt1, int paramInt2)
  {
    int i = paramConstraintSet.OooO0Oo;
    if (i != 0)
    {
      Rect localRect = this.OooO00o;
      OooOOOo(paramRect, localRect, i, paramInt1, paramInt2);
      paramRect = this.OooO00o;
    }
    Object localObject = this.OooO0oo;
    float f1 = 1.0F;
    ((MotionPaths)localObject).o00Ooo0 = f1;
    ((MotionPaths)localObject).o00Ooo0O = f1;
    OooOOO((MotionPaths)localObject);
    localObject = this.OooO0oo;
    f1 = paramRect.left;
    float f2 = paramRect.top;
    float f3 = paramRect.width();
    float f4 = paramRect.height();
    ((MotionPaths)localObject).OooOOo0(f1, f2, f3, f4);
    localObject = this.OooO0oo;
    paramInt2 = this.OooO0OO;
    ConstraintSet.Constraint localConstraint = paramConstraintSet.getParameters(paramInt2);
    ((MotionPaths)localObject).OooO0O0(localConstraint);
    localObject = this.OooOO0;
    paramInt2 = this.OooO0OO;
    ((MotionConstrainedPoint)localObject).OooOO0(paramRect, paramConstraintSet, i, paramInt2);
  }
  
  public void OooOOoo(ViewState paramViewState, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = this.OooO0oO;
    ((MotionPaths)localObject1).o00Ooo0 = 0.0F;
    ((MotionPaths)localObject1).o00Ooo0O = 0.0F;
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    int i = 1;
    float f1 = 1.4E-45F;
    int j = 2;
    float f2 = 2.802597E-045F;
    int k;
    if (paramInt1 != i)
    {
      if (paramInt1 != j) {
        break label289;
      }
      paramInt2 = paramViewState.OooO0O0;
      i = paramViewState.OooO0Oo;
      paramInt2 += i;
      i = paramViewState.OooO0OO;
      k = paramViewState.OooO0o0;
      i += k;
      k = paramViewState.OooO0O0();
      i = (i + k) / j;
      paramInt3 -= i;
      ((Rect)localObject1).left = paramInt3;
      paramInt3 = paramViewState.OooO00o();
      paramInt2 = (paramInt2 - paramInt3) / j;
    }
    else
    {
      paramInt3 = paramViewState.OooO0O0;
      i = paramViewState.OooO0Oo;
      paramInt3 += i;
      i = paramViewState.OooO0OO;
      k = paramViewState.OooO0o0;
      i += k;
      k = paramViewState.OooO0O0();
      i = (i - k) / j;
      ((Rect)localObject1).left = i;
      i = paramViewState.OooO00o();
      paramInt3 = (paramInt3 + i) / j;
      paramInt2 -= paramInt3;
    }
    ((Rect)localObject1).top = paramInt2;
    paramInt2 = ((Rect)localObject1).left;
    paramInt3 = paramViewState.OooO0O0();
    paramInt2 += paramInt3;
    ((Rect)localObject1).right = paramInt2;
    paramInt2 = ((Rect)localObject1).top;
    paramInt3 = paramViewState.OooO00o();
    paramInt2 += paramInt3;
    ((Rect)localObject1).bottom = paramInt2;
    label289:
    Object localObject2 = this.OooO0oO;
    float f3 = ((Rect)localObject1).left;
    f1 = ((Rect)localObject1).top;
    f2 = ((Rect)localObject1).width();
    float f4 = ((Rect)localObject1).height();
    ((MotionPaths)localObject2).OooOOo0(f3, f1, f2, f4);
    localObject2 = this.OooO;
    float f5 = paramViewState.OooO00o;
    ((MotionConstrainedPoint)localObject2).OooO((Rect)localObject1, paramView, paramInt1, f5);
  }
  
  public void OooOo00(int paramInt1, int paramInt2, float paramFloat, long paramLong)
  {
    MotionController localMotionController = this;
    new HashSet();
    Object localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    Object localObject2 = new java/util/HashSet;
    ((HashSet)localObject2).<init>();
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    Object localObject4 = new java/util/HashMap;
    ((HashMap)localObject4).<init>();
    int i = this.Oooo000;
    int j = Key.OooO0o;
    if (i != j)
    {
      localObject5 = this.OooO0oO;
      ((MotionPaths)localObject5).o00OoooO = i;
    }
    Object localObject6 = localMotionController.OooO;
    Object localObject5 = localMotionController.OooOO0;
    ((MotionConstrainedPoint)localObject6).OooO0oO((MotionConstrainedPoint)localObject5, (HashSet)localObject2);
    localObject6 = localMotionController.OooOoOO;
    Object localObject10;
    Object localObject11;
    Object localObject12;
    boolean bool6;
    if (localObject6 != null)
    {
      localObject6 = ((ArrayList)localObject6).iterator();
      bool3 = false;
      localObject7 = null;
      for (;;)
      {
        boolean bool4 = ((Iterator)localObject6).hasNext();
        if (!bool4) {
          break;
        }
        localObject8 = (Key)((Iterator)localObject6).next();
        boolean bool5 = localObject8 instanceof KeyPosition;
        if (bool5)
        {
          localObject8 = (KeyPosition)localObject8;
          localObject9 = new androidx/constraintlayout/motion/widget/MotionPaths;
          localObject10 = localMotionController.OooO0oO;
          localObject11 = localMotionController.OooO0oo;
          int i2 = paramInt1;
          int i6 = paramInt2;
          localObject12 = localObject8;
          ((MotionPaths)localObject9).<init>(paramInt1, paramInt2, (KeyPosition)localObject8, (MotionPaths)localObject10, (MotionPaths)localObject11);
          localMotionController.OooOO0o((MotionPaths)localObject9);
          m = ((KeyPositionBase)localObject8).OooO0oO;
          int n = Key.OooO0o;
          if (m != n) {
            localMotionController.OooO0o = m;
          }
        }
        else
        {
          bool6 = localObject8 instanceof KeyCycle;
          if (bool6)
          {
            ((Key)localObject8).OooO0Oo((HashSet)localObject3);
          }
          else
          {
            bool6 = localObject8 instanceof KeyTimeCycle;
            if (bool6)
            {
              ((Key)localObject8).OooO0Oo((HashSet)localObject1);
            }
            else
            {
              bool6 = localObject8 instanceof KeyTrigger;
              if (bool6)
              {
                if (localObject7 == null)
                {
                  localObject7 = new java/util/ArrayList;
                  ((ArrayList)localObject7).<init>();
                }
                localObject8 = (KeyTrigger)localObject8;
                ((ArrayList)localObject7).add(localObject8);
              }
              else
              {
                ((Key)localObject8).setInterpolation((HashMap)localObject4);
                ((Key)localObject8).OooO0Oo((HashSet)localObject2);
              }
            }
          }
        }
      }
    }
    boolean bool3 = false;
    Object localObject7 = null;
    i = 0;
    localObject6 = null;
    if (localObject7 != null)
    {
      localObject8 = new KeyTrigger[0];
      localObject7 = (KeyTrigger[])((ArrayList)localObject7).toArray((Object[])localObject8);
      localMotionController.OooOooo = ((KeyTrigger[])localObject7);
    }
    bool3 = ((HashSet)localObject2).isEmpty();
    Object localObject8 = ",";
    Object localObject9 = "CUSTOM,";
    int i9 = 1;
    float f1 = 1.4E-45F;
    Object localObject13;
    Object localObject14;
    if (!bool3)
    {
      localObject7 = new java/util/HashMap;
      ((HashMap)localObject7).<init>();
      localMotionController.OooOoo = ((HashMap)localObject7);
      localObject7 = ((HashSet)localObject2).iterator();
      boolean bool7;
      for (;;)
      {
        bool7 = ((Iterator)localObject7).hasNext();
        if (!bool7) {
          break;
        }
        localObject13 = (String)((Iterator)localObject7).next();
        boolean bool10 = ((String)localObject13).startsWith((String)localObject9);
        if (bool10)
        {
          localObject14 = new android/util/SparseArray;
          ((SparseArray)localObject14).<init>();
          localObject12 = localObject13.split(localObject8)[i9];
          localObject10 = localMotionController.OooOoOO.iterator();
          for (;;)
          {
            boolean bool12 = ((Iterator)localObject10).hasNext();
            if (!bool12) {
              break;
            }
            localObject11 = (Key)((Iterator)localObject10).next();
            localObject5 = ((Key)localObject11).OooO0o0;
            if (localObject5 != null)
            {
              localObject5 = (ConstraintAttribute)((HashMap)localObject5).get(localObject12);
              if (localObject5 != null)
              {
                int i10 = ((Key)localObject11).OooO00o;
                ((SparseArray)localObject14).append(i10, localObject5);
              }
            }
          }
          localObject5 = ViewSpline.OooO0OO((String)localObject13, (SparseArray)localObject14);
        }
        else
        {
          localObject5 = ViewSpline.OooO0Oo((String)localObject13);
        }
        if (localObject5 != null)
        {
          ((SplineSet)localObject5).setType((String)localObject13);
          localObject14 = localMotionController.OooOoo;
          ((HashMap)localObject14).put(localObject13, localObject5);
        }
      }
      localObject5 = localMotionController.OooOoOO;
      if (localObject5 != null)
      {
        localObject5 = ((ArrayList)localObject5).iterator();
        for (;;)
        {
          bool3 = ((Iterator)localObject5).hasNext();
          if (!bool3) {
            break;
          }
          localObject7 = (Key)((Iterator)localObject5).next();
          bool7 = localObject7 instanceof KeyAttributes;
          if (bool7)
          {
            localObject13 = localMotionController.OooOoo;
            ((Key)localObject7).OooO00o((HashMap)localObject13);
          }
        }
      }
      localObject5 = localMotionController.OooO;
      localObject7 = localMotionController.OooOoo;
      ((MotionConstrainedPoint)localObject5).OooO0O0((HashMap)localObject7, 0);
      localObject5 = localMotionController.OooOO0;
      localObject7 = localMotionController.OooOoo;
      int i3 = 100;
      ((MotionConstrainedPoint)localObject5).OooO0O0((HashMap)localObject7, i3);
      localObject5 = localMotionController.OooOoo.keySet().iterator();
      for (;;)
      {
        bool3 = ((Iterator)localObject5).hasNext();
        if (!bool3) {
          break;
        }
        localObject7 = (String)((Iterator)localObject5).next();
        boolean bool8 = ((HashMap)localObject4).containsKey(localObject7);
        if (bool8)
        {
          localObject13 = (Integer)((HashMap)localObject4).get(localObject7);
          if (localObject13 != null)
          {
            i4 = ((Integer)localObject13).intValue();
            break label875;
          }
        }
        int i4 = 0;
        localObject13 = null;
        label875:
        localObject14 = localMotionController.OooOoo;
        localObject7 = (SplineSet)((HashMap)localObject14).get(localObject7);
        if (localObject7 != null) {
          ((SplineSet)localObject7).setup(i4);
        }
      }
    }
    boolean bool2 = ((HashSet)localObject1).isEmpty();
    int i11;
    if (!bool2)
    {
      localObject5 = localMotionController.OooOoo0;
      if (localObject5 == null)
      {
        localObject5 = new java/util/HashMap;
        ((HashMap)localObject5).<init>();
        localMotionController.OooOoo0 = ((HashMap)localObject5);
      }
      localObject1 = ((HashSet)localObject1).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject5 = (String)((Iterator)localObject1).next();
        localObject7 = localMotionController.OooOoo0;
        bool3 = ((HashMap)localObject7).containsKey(localObject5);
        if (!bool3)
        {
          bool3 = ((String)localObject5).startsWith((String)localObject9);
          if (bool3)
          {
            localObject7 = new android/util/SparseArray;
            ((SparseArray)localObject7).<init>();
            localObject13 = localObject5.split(localObject8)[i9];
            localObject14 = localMotionController.OooOoOO.iterator();
            for (;;)
            {
              boolean bool14 = ((Iterator)localObject14).hasNext();
              if (!bool14) {
                break;
              }
              localObject12 = (Key)((Iterator)localObject14).next();
              localObject10 = ((Key)localObject12).OooO0o0;
              if (localObject10 != null)
              {
                localObject10 = (ConstraintAttribute)((HashMap)localObject10).get(localObject13);
                if (localObject10 != null)
                {
                  i11 = ((Key)localObject12).OooO00o;
                  ((SparseArray)localObject7).append(i11, localObject10);
                }
              }
            }
            localObject7 = ViewTimeCycle.OooO0Oo((String)localObject5, (SparseArray)localObject7);
          }
          else
          {
            localObject7 = ViewTimeCycle.OooO0o0((String)localObject5, paramLong);
          }
          if (localObject7 != null)
          {
            ((TimeCycleSplineSet)localObject7).setType((String)localObject5);
            localObject12 = localMotionController.OooOoo0;
            ((HashMap)localObject12).put(localObject5, localObject7);
          }
        }
      }
      localObject1 = localMotionController.OooOoOO;
      if (localObject1 != null)
      {
        localObject1 = ((ArrayList)localObject1).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject1).hasNext();
          if (!bool2) {
            break;
          }
          localObject5 = (Key)((Iterator)localObject1).next();
          bool3 = localObject5 instanceof KeyTimeCycle;
          if (bool3)
          {
            localObject5 = (KeyTimeCycle)localObject5;
            localObject7 = localMotionController.OooOoo0;
            ((KeyTimeCycle)localObject5).OoooO0O((HashMap)localObject7);
          }
        }
      }
      localObject1 = localMotionController.OooOoo0.keySet().iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject5 = (String)((Iterator)localObject1).next();
        bool3 = ((HashMap)localObject4).containsKey(localObject5);
        if (bool3)
        {
          localObject7 = (Integer)((HashMap)localObject4).get(localObject5);
          k = ((Integer)localObject7).intValue();
        }
        else
        {
          k = 0;
          localObject7 = null;
        }
        localObject8 = localMotionController.OooOoo0;
        localObject5 = (ViewTimeCycle)((HashMap)localObject8).get(localObject5);
        ((TimeCycleSplineSet)localObject5).setup(k);
      }
    }
    localObject1 = localMotionController.OooOoO0;
    int i12 = ((ArrayList)localObject1).size();
    int i13 = 2;
    i12 += i13;
    localObject5 = new MotionPaths[i12];
    localObject7 = localMotionController.OooO0oO;
    localObject5[0] = localObject7;
    int k = i12 + -1;
    localObject8 = localMotionController.OooO0oo;
    localObject5[k] = localObject8;
    localObject7 = localMotionController.OooOoO0;
    k = ((ArrayList)localObject7).size();
    if (k > 0)
    {
      k = localMotionController.OooO0o;
      m = -1;
      if (k == m) {
        localMotionController.OooO0o = 0;
      }
    }
    localObject7 = localMotionController.OooOoO0.iterator();
    boolean bool9;
    int i7;
    for (int m = i9;; m = i7)
    {
      bool9 = ((Iterator)localObject7).hasNext();
      if (!bool9) {
        break;
      }
      localObject13 = (MotionPaths)((Iterator)localObject7).next();
      i7 = m + 1;
      localObject5[m] = localObject13;
    }
    localObject7 = new java/util/HashSet;
    ((HashSet)localObject7).<init>();
    localObject8 = localMotionController.OooO0oo.o00o000O.keySet().iterator();
    for (;;)
    {
      bool9 = ((Iterator)localObject8).hasNext();
      if (!bool9) {
        break;
      }
      localObject13 = (String)((Iterator)localObject8).next();
      localObject14 = localMotionController.OooO0oO.o00o000O;
      boolean bool11 = ((AbstractMap)localObject14).containsKey(localObject13);
      if (bool11)
      {
        localObject14 = new java/lang/StringBuilder;
        ((StringBuilder)localObject14).<init>();
        ((StringBuilder)localObject14).append((String)localObject9);
        ((StringBuilder)localObject14).append((String)localObject13);
        localObject14 = ((StringBuilder)localObject14).toString();
        bool11 = ((HashSet)localObject2).contains(localObject14);
        if (!bool11) {
          ((HashSet)localObject7).add(localObject13);
        }
      }
    }
    localObject2 = new String[0];
    localObject2 = (String[])((AbstractCollection)localObject7).toArray((Object[])localObject2);
    localMotionController.OooOo0 = ((String[])localObject2);
    localObject2 = new int[localObject2.length];
    localMotionController.OooOo0O = ((int[])localObject2);
    int i14 = 0;
    localObject2 = null;
    float f2 = 0.0F;
    for (;;)
    {
      localObject7 = localMotionController.OooOo0;
      m = localObject7.length;
      if (i14 >= m) {
        break;
      }
      localObject7 = localObject7[i14];
      localMotionController.OooOo0O[i14] = 0;
      m = 0;
      localObject8 = null;
      while (m < i12)
      {
        localObject9 = localObject5[m].o00o000O;
        bool6 = ((AbstractMap)localObject9).containsKey(localObject7);
        if (bool6)
        {
          localObject9 = (ConstraintAttribute)localObject5[m].o00o000O.get(localObject7);
          if (localObject9 != null)
          {
            localObject7 = localMotionController.OooOo0O;
            m = localObject7[i14];
            i1 = ((ConstraintAttribute)localObject9).OooO0o0();
            m += i1;
            localObject7[i14] = m;
            break;
          }
        }
        m += 1;
      }
      i14 += 1;
    }
    localObject2 = localObject5[0];
    i14 = ((MotionPaths)localObject2).o00OoooO;
    m = Key.OooO0o;
    if (i14 != m)
    {
      i14 = i9;
      f2 = f1;
    }
    else
    {
      i14 = 0;
      localObject2 = null;
      f2 = 0.0F;
    }
    k = localObject7.length;
    m = 18 + k;
    localObject7 = new boolean[m];
    int i1 = i9;
    float f3 = f1;
    int i8;
    while (i1 < i12)
    {
      localObject13 = localObject5[i1];
      i8 = i1 + -1;
      localObject14 = localObject5[i8];
      localObject12 = localMotionController.OooOo0;
      ((MotionPaths)localObject13).OooO0o0((MotionPaths)localObject14, (boolean[])localObject7, (String[])localObject12, i14);
      i1 += 1;
    }
    i1 = 0;
    localObject9 = null;
    f3 = 0.0F;
    i14 = i9;
    f2 = f1;
    int i5;
    while (i14 < m)
    {
      i5 = localObject7[i14];
      if (i5 != 0) {
        i1 += 1;
      }
      i14 += 1;
    }
    localObject2 = new int[i1];
    localMotionController.OooOOo = ((int[])localObject2);
    int i15 = Math.max(i13, i1);
    localObject9 = new double[i15];
    localMotionController.OooOOoo = ((double[])localObject9);
    localObject2 = new double[i15];
    localMotionController.OooOo00 = ((double[])localObject2);
    i1 = 0;
    localObject9 = null;
    f3 = 0.0F;
    i15 = i9;
    f2 = f1;
    while (i15 < m)
    {
      i5 = localObject7[i15];
      if (i5 != 0)
      {
        localObject13 = localMotionController.OooOOo;
        i8 = i1 + 1;
        localObject13[i1] = i15;
        i1 = i8;
      }
      i15 += 1;
    }
    int i16 = localMotionController.OooOOo.length;
    localObject2 = new int[] { i12, i16 };
    localObject2 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject2);
    localObject7 = new double[i12];
    m = 0;
    localObject8 = null;
    while (m < i12)
    {
      localObject9 = localObject5[m];
      localObject13 = localObject2[m];
      localObject14 = localMotionController.OooOOo;
      ((MotionPaths)localObject9).OooO0o((double[])localObject13, (int[])localObject14);
      localObject9 = localObject5[m];
      f3 = ((MotionPaths)localObject9).o00Ooo0;
      double d1 = f3;
      localObject7[m] = d1;
      m += 1;
    }
    m = 0;
    localObject8 = null;
    for (;;)
    {
      localObject9 = localMotionController.OooOOo;
      i5 = localObject9.length;
      if (m >= i5) {
        break;
      }
      i1 = localObject9[m];
      localObject13 = MotionPaths.o00o00Oo;
      i5 = localObject13.length;
      if (i1 < i5)
      {
        localObject9 = new java/lang/StringBuilder;
        ((StringBuilder)localObject9).<init>();
        localObject13 = MotionPaths.o00o00Oo;
        localObject14 = localMotionController.OooOOo;
        i8 = localObject14[m];
        localObject13 = localObject13[i8];
        ((StringBuilder)localObject9).append((String)localObject13);
        ((StringBuilder)localObject9).append(" [");
        localObject9 = ((StringBuilder)localObject9).toString();
        i5 = 0;
        localObject13 = null;
        while (i5 < i12)
        {
          localObject14 = new java/lang/StringBuilder;
          ((StringBuilder)localObject14).<init>();
          ((StringBuilder)localObject14).append((String)localObject9);
          double d2 = localObject2[i5][m];
          ((StringBuilder)localObject14).append(d2);
          localObject9 = ((StringBuilder)localObject14).toString();
          i5 += 1;
        }
      }
      m += 1;
    }
    localObject8 = new CurveFit[localMotionController.OooOo0.length + i9];
    localMotionController.OooOO0O = ((CurveFit[])localObject8);
    m = 0;
    localObject8 = null;
    for (;;)
    {
      localObject9 = localMotionController.OooOo0;
      i5 = localObject9.length;
      if (m >= i5) {
        break;
      }
      localObject9 = localObject9[m];
      i5 = 0;
      localObject13 = null;
      i11 = 0;
      localObject12 = null;
      i8 = 0;
      localObject14 = null;
      int i17 = 0;
      localObject10 = null;
      while (i5 < i12)
      {
        localObject11 = localObject5[i5];
        boolean bool13 = ((MotionPaths)localObject11).OooOO0o((String)localObject9);
        if (bool13)
        {
          if (localObject10 == null)
          {
            localObject14 = new double[i12];
            i17 = localObject5[i5].OooOO0((String)localObject9);
            localObject10 = new int[] { i12, i17 };
            localObject11 = Double.TYPE;
            localObject10 = (double[][])Array.newInstance((Class)localObject11, (int[])localObject10);
          }
          localObject11 = localObject5[i5];
          f1 = ((MotionPaths)localObject11).o00Ooo0;
          double d3 = f1;
          localObject14[i11] = d3;
          localObject4 = localObject10[i11];
          i = 0;
          localObject6 = null;
          ((MotionPaths)localObject11).OooO((String)localObject9, (double[])localObject4, 0);
          i11 += 1;
        }
        i5 += 1;
        i13 = 2;
        i = 0;
        localObject6 = null;
        i9 = 1;
        f1 = 1.4E-45F;
      }
      localObject4 = Arrays.copyOf((double[])localObject14, i11);
      localObject6 = (double[][])Arrays.copyOf((Object[])localObject10, i11);
      localObject9 = localMotionController.OooOO0O;
      m += 1;
      localObject4 = CurveFit.OooO00o(localMotionController.OooO0o, (double[])localObject4, (double[][])localObject6);
      localObject9[m] = localObject4;
      i13 = 2;
      i = 0;
      localObject6 = null;
      i9 = 1;
      f1 = 1.4E-45F;
    }
    localObject4 = localMotionController.OooOO0O;
    localObject2 = CurveFit.OooO00o(localMotionController.OooO0o, (double[])localObject7, (double[][])localObject2);
    i = 0;
    localObject6 = null;
    localObject4[0] = localObject2;
    localObject2 = localObject5[0];
    i16 = ((MotionPaths)localObject2).o00OoooO;
    i13 = Key.OooO0o;
    if (i16 != i13)
    {
      localObject2 = new int[i12];
      localObject4 = new double[i12];
      i = 2;
      localObject6 = new int[] { i12, i };
      localObject6 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject6);
      k = 0;
      localObject7 = null;
      while (k < i12)
      {
        localObject8 = localObject5[k];
        i1 = ((MotionPaths)localObject8).o00OoooO;
        localObject2[k] = i1;
        f3 = ((MotionPaths)localObject8).o00Ooo0;
        double d4 = f3;
        localObject4[k] = d4;
        localObject9 = localObject6[k];
        f1 = ((MotionPaths)localObject8).o00Ooo0o;
        double d5 = f1;
        i8 = 0;
        localObject14 = null;
        localObject9[0] = d5;
        d5 = ((MotionPaths)localObject8).o00OooO0;
        m = 1;
        localObject9[m] = d5;
        k += 1;
      }
      localObject1 = CurveFit.OooO0O0((int[])localObject2, (double[])localObject4, (double[][])localObject6);
      localMotionController.OooOO0o = ((CurveFit)localObject1);
    }
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    localMotionController.OooOooO = ((HashMap)localObject1);
    localObject1 = localMotionController.OooOoOO;
    if (localObject1 != null)
    {
      localObject1 = ((HashSet)localObject3).iterator();
      i16 = 2143289344;
      f2 = 0.0F / 0.0F;
      boolean bool16;
      for (;;)
      {
        bool16 = ((Iterator)localObject1).hasNext();
        if (!bool16) {
          break;
        }
        localObject3 = (String)((Iterator)localObject1).next();
        localObject4 = ViewOscillator.OooO0o((String)localObject3);
        if (localObject4 != null)
        {
          boolean bool1 = ((KeyCycleOscillator)localObject4).OooO0o0();
          if (bool1)
          {
            bool1 = Float.isNaN(f2);
            if (bool1) {
              f2 = getPreCycleDistance();
            }
          }
          ((KeyCycleOscillator)localObject4).setType((String)localObject3);
          localObject6 = localMotionController.OooOooO;
          ((HashMap)localObject6).put(localObject3, localObject4);
        }
      }
      localObject1 = localMotionController.OooOoOO.iterator();
      for (;;)
      {
        bool16 = ((Iterator)localObject1).hasNext();
        if (!bool16) {
          break;
        }
        localObject3 = (Key)((Iterator)localObject1).next();
        boolean bool15 = localObject3 instanceof KeyCycle;
        if (bool15)
        {
          localObject3 = (KeyCycle)localObject3;
          localObject4 = localMotionController.OooOooO;
          ((KeyCycle)localObject3).OoooOOO((HashMap)localObject4);
        }
      }
      localObject1 = localMotionController.OooOooO.values().iterator();
      for (;;)
      {
        bool16 = ((Iterator)localObject1).hasNext();
        if (!bool16) {
          break;
        }
        localObject3 = (ViewOscillator)((Iterator)localObject1).next();
        ((KeyCycleOscillator)localObject3).setup(f2);
      }
    }
  }
  
  public int getAnimateRelativeTo()
  {
    return this.OooO0oO.o00Ooooo;
  }
  
  public float getCenterX()
  {
    return this.OooOOOo;
  }
  
  public float getCenterY()
  {
    return this.OooOOo0;
  }
  
  public int getDrawPath()
  {
    MotionPaths localMotionPaths1 = this.OooO0oO;
    int i = localMotionPaths1.o00Ooo00;
    Iterator localIterator = this.OooOoO0.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MotionPaths localMotionPaths2 = (MotionPaths)localIterator.next();
      int j = localMotionPaths2.o00Ooo00;
      i = Math.max(i, j);
    }
    int k = this.OooO0oo.o00Ooo00;
    return Math.max(i, k);
  }
  
  public float getFinalHeight()
  {
    return this.OooO0oo.o00OooOO;
  }
  
  public float getFinalWidth()
  {
    return this.OooO0oo.o00OooO;
  }
  
  public float getFinalX()
  {
    return this.OooO0oo.o00Ooo0o;
  }
  
  public float getFinalY()
  {
    return this.OooO0oo.o00OooO0;
  }
  
  public MotionPaths getKeyFrame(int paramInt)
  {
    return (MotionPaths)this.OooOoO0.get(paramInt);
  }
  
  public float getStartHeight()
  {
    return this.OooO0oO.o00OooOO;
  }
  
  public float getStartWidth()
  {
    return this.OooO0oO.o00OooO;
  }
  
  public float getStartX()
  {
    return this.OooO0oO.o00Ooo0o;
  }
  
  public float getStartY()
  {
    return this.OooO0oO.o00OooO0;
  }
  
  public int getTransformPivotTarget()
  {
    return this.Oooo00O;
  }
  
  public View getView()
  {
    return this.OooO0O0;
  }
  
  public void setBothStates(View paramView)
  {
    MotionPaths localMotionPaths = this.OooO0oO;
    localMotionPaths.o00Ooo0 = 0.0F;
    localMotionPaths.o00Ooo0O = 0.0F;
    this.Oooo0o0 = true;
    float f1 = paramView.getX();
    float f2 = paramView.getY();
    float f3 = paramView.getWidth();
    float f4 = paramView.getHeight();
    localMotionPaths.OooOOo0(f1, f2, f3, f4);
    localMotionPaths = this.OooO0oo;
    f1 = paramView.getX();
    f2 = paramView.getY();
    f3 = paramView.getWidth();
    f4 = paramView.getHeight();
    localMotionPaths.OooOOo0(f1, f2, f3, f4);
    this.OooO.setState(paramView);
    this.OooOO0.setState(paramView);
  }
  
  public void setDrawPath(int paramInt)
  {
    this.OooO0oO.o00Ooo00 = paramInt;
  }
  
  public void setPathMotionArc(int paramInt)
  {
    this.Oooo000 = paramInt;
  }
  
  public void setStartCurrentState(View paramView)
  {
    MotionPaths localMotionPaths = this.OooO0oO;
    localMotionPaths.o00Ooo0 = 0.0F;
    localMotionPaths.o00Ooo0O = 0.0F;
    float f1 = paramView.getX();
    float f2 = paramView.getY();
    float f3 = paramView.getWidth();
    float f4 = paramView.getHeight();
    localMotionPaths.OooOOo0(f1, f2, f3, f4);
    this.OooO.setState(paramView);
  }
  
  public void setTransformPivotTarget(int paramInt)
  {
    this.Oooo00O = paramInt;
    this.Oooo00o = null;
  }
  
  public void setView(View paramView)
  {
    this.OooO0O0 = paramView;
    int i = paramView.getId();
    this.OooO0OO = i;
    paramView = paramView.getLayoutParams();
    boolean bool = paramView instanceof ConstraintLayout.LayoutParams;
    if (bool)
    {
      paramView = ((ConstraintLayout.LayoutParams)paramView).getConstraintTag();
      this.OooO0o0 = paramView;
    }
  }
  
  public void setupRelative(MotionController paramMotionController)
  {
    MotionPaths localMotionPaths1 = this.OooO0oO;
    MotionPaths localMotionPaths2 = paramMotionController.OooO0oO;
    localMotionPaths1.OooOo00(paramMotionController, localMotionPaths2);
    localMotionPaths1 = this.OooO0oo;
    localMotionPaths2 = paramMotionController.OooO0oo;
    localMotionPaths1.OooOo00(paramMotionController, localMotionPaths2);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(" start: x: ");
    float f1 = this.OooO0oO.o00Ooo0o;
    localStringBuilder.append(f1);
    String str = " y: ";
    localStringBuilder.append(str);
    float f2 = this.OooO0oO.o00OooO0;
    localStringBuilder.append(f2);
    localStringBuilder.append(" end: x: ");
    f2 = this.OooO0oo.o00Ooo0o;
    localStringBuilder.append(f2);
    localStringBuilder.append(str);
    f1 = this.OooO0oo.o00OooO0;
    localStringBuilder.append(f1);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionController
 * JD-Core Version:    0.7.0.1
 */