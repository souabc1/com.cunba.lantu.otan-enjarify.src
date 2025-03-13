package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Motion
  implements TypedValues
{
  public float OooO;
  public Rect OooO00o;
  public MotionWidget OooO0O0;
  public int OooO0OO;
  public MotionPaths OooO0Oo;
  public MotionConstrainedPoint OooO0o;
  public MotionPaths OooO0o0;
  public MotionConstrainedPoint OooO0oO;
  public CurveFit[] OooO0oo;
  public float OooOO0;
  public float OooOO0O;
  public float OooOO0o;
  public int[] OooOOO;
  public float OooOOO0;
  public double[] OooOOOO;
  public int OooOOOo;
  public ArrayList OooOOo;
  public float[] OooOOo0;
  public float[] OooOOoo;
  public int OooOo;
  public int OooOo0;
  public ArrayList OooOo00;
  public int OooOo0O;
  public MotionWidget OooOo0o;
  public DifferentialInterpolator OooOoO;
  public float OooOoO0;
  public boolean OooOoOO;
  
  public Motion(MotionWidget paramMotionWidget)
  {
    Rect localRect = new androidx/constraintlayout/core/motion/utils/Rect;
    localRect.<init>();
    this.OooO00o = localRect;
    int i = -1;
    this.OooO0OO = i;
    Object localObject1 = new androidx/constraintlayout/core/motion/MotionPaths;
    ((MotionPaths)localObject1).<init>();
    this.OooO0Oo = ((MotionPaths)localObject1);
    localObject1 = new androidx/constraintlayout/core/motion/MotionPaths;
    ((MotionPaths)localObject1).<init>();
    this.OooO0o0 = ((MotionPaths)localObject1);
    localObject1 = new androidx/constraintlayout/core/motion/MotionConstrainedPoint;
    ((MotionConstrainedPoint)localObject1).<init>();
    this.OooO0o = ((MotionConstrainedPoint)localObject1);
    localObject1 = new androidx/constraintlayout/core/motion/MotionConstrainedPoint;
    ((MotionConstrainedPoint)localObject1).<init>();
    this.OooO0oO = ((MotionConstrainedPoint)localObject1);
    float f = 0.0F / 0.0F;
    this.OooO = f;
    this.OooOO0 = 0.0F;
    this.OooOO0O = 1.0F;
    int j = 4;
    this.OooOOOo = j;
    Object localObject2 = new float[j];
    this.OooOOo0 = ((float[])localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.OooOOo = ((ArrayList)localObject2);
    localObject2 = new float[1];
    this.OooOOoo = ((float[])localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.OooOo00 = ((ArrayList)localObject2);
    this.OooOo0 = i;
    this.OooOo0O = i;
    this.OooOo0o = null;
    this.OooOo = i;
    this.OooOoO0 = f;
    this.OooOoO = null;
    this.OooOoOO = false;
    setView(paramMotionWidget);
  }
  
  public static DifferentialInterpolator OooO0oO(int paramInt1, String paramString, int paramInt2)
  {
    paramInt2 = -1;
    if (paramInt1 != paramInt2) {
      return null;
    }
    Easing localEasing = Easing.OooO0OO(paramString);
    paramString = new androidx/constraintlayout/core/motion/Motion$1;
    paramString.<init>(localEasing);
    return paramString;
  }
  
  private float getPreCycleDistance()
  {
    Motion localMotion = this;
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
      Object localObject1 = localMotion.OooO0Oo.o00OoOoo;
      Object localObject2 = localMotion.OooOOo.iterator();
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
      Object localObject5 = localMotion.OooO0oo;
      float f9 = 0.0F;
      localObject5 = localObject5[0];
      localObject1 = localMotion.OooOOOO;
      ((CurveFit)localObject5).OooO0Oo(d4, (double[])localObject1);
      localObject5 = localMotion.OooO0Oo;
      localObject1 = localMotion.OooOOO;
      localObject2 = localMotion.OooOOOO;
      f2 = 0.0F;
      Object localObject4 = null;
      f10 = f4;
      int m = k;
      k = 0;
      f5 = 0.0F;
      ((MotionPaths)localObject5).OooO0Oo(d4, (int[])localObject1, (double[])localObject2, arrayOfFloat, 0);
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
  
  public boolean OooO00o(int paramInt1, int paramInt2)
  {
    int i = 509;
    boolean bool = true;
    if (paramInt1 != i)
    {
      paramInt2 = 704;
      if (paramInt1 != paramInt2) {
        return false;
      }
      return bool;
    }
    setPathMotionArc(paramInt2);
    return bool;
  }
  
  public boolean OooO0O0(int paramInt, float paramFloat)
  {
    return false;
  }
  
  public boolean OooO0OO(int paramInt, String paramString)
  {
    int i = 705;
    if (i == paramInt)
    {
      Object localObject1 = System.out;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "TYPE_INTERPOLATOR  ";
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramString);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((PrintStream)localObject1).println((String)localObject2);
      paramInt = -1;
      localObject1 = OooO0oO(paramInt, paramString, 0);
      this.OooOoO = ((DifferentialInterpolator)localObject1);
    }
    return false;
  }
  
  public boolean OooO0Oo(int paramInt, boolean paramBoolean)
  {
    return false;
  }
  
  public void OooO0o(double paramDouble, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    int i = 4;
    double[] arrayOfDouble1 = new double[i];
    double[] arrayOfDouble2 = new double[i];
    this.OooO0oo[0].OooO0Oo(paramDouble, arrayOfDouble1);
    this.OooO0oo[0].OooO0oO(paramDouble, arrayOfDouble2);
    Arrays.fill(paramArrayOfFloat2, 0.0F);
    MotionPaths localMotionPaths = this.OooO0Oo;
    int[] arrayOfInt = this.OooOOO;
    localMotionPaths.OooO0o0(paramDouble, arrayOfInt, arrayOfDouble1, paramArrayOfFloat1, arrayOfDouble2, paramArrayOfFloat2);
  }
  
  public void OooO0o0(MotionKey paramMotionKey)
  {
    this.OooOo00.add(paramMotionKey);
  }
  
  public final void OooO0oo(MotionPaths paramMotionPaths)
  {
    float f1 = this.OooO0O0.getX();
    float f2 = this.OooO0O0.getY();
    float f3 = this.OooO0O0.getWidth();
    float f4 = this.OooO0O0.getHeight();
    paramMotionPaths.OooO0o(f1, f2, f3, f4);
  }
  
  public int getAnimateRelativeTo()
  {
    return this.OooO0Oo.o00Ooooo;
  }
  
  public float getCenterX()
  {
    return this.OooOO0o;
  }
  
  public float getCenterY()
  {
    return this.OooOOO0;
  }
  
  public int getDrawPath()
  {
    MotionPaths localMotionPaths1 = this.OooO0Oo;
    int i = localMotionPaths1.o00Ooo00;
    Iterator localIterator = this.OooOOo.iterator();
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
    int k = this.OooO0o0.o00Ooo00;
    return Math.max(i, k);
  }
  
  public float getFinalHeight()
  {
    return this.OooO0o0.o00OooOO;
  }
  
  public float getFinalWidth()
  {
    return this.OooO0o0.o00OooO;
  }
  
  public float getFinalX()
  {
    return this.OooO0o0.o00Ooo0o;
  }
  
  public float getFinalY()
  {
    return this.OooO0o0.o00OooO0;
  }
  
  public MotionPaths getKeyFrame(int paramInt)
  {
    return (MotionPaths)this.OooOOo.get(paramInt);
  }
  
  public float getStartHeight()
  {
    return this.OooO0Oo.o00OooOO;
  }
  
  public float getStartWidth()
  {
    return this.OooO0Oo.o00OooO;
  }
  
  public float getStartX()
  {
    return this.OooO0Oo.o00Ooo0o;
  }
  
  public float getStartY()
  {
    return this.OooO0Oo.o00OooO0;
  }
  
  public int getTransformPivotTarget()
  {
    return this.OooOo0O;
  }
  
  public MotionWidget getView()
  {
    return this.OooO0O0;
  }
  
  public void setBothStates(MotionWidget paramMotionWidget)
  {
    MotionPaths localMotionPaths = this.OooO0Oo;
    localMotionPaths.o00Ooo0 = 0.0F;
    localMotionPaths.o00Ooo0O = 0.0F;
    this.OooOoOO = true;
    float f1 = paramMotionWidget.getX();
    float f2 = paramMotionWidget.getY();
    float f3 = paramMotionWidget.getWidth();
    float f4 = paramMotionWidget.getHeight();
    localMotionPaths.OooO0o(f1, f2, f3, f4);
    localMotionPaths = this.OooO0o0;
    f1 = paramMotionWidget.getX();
    f2 = paramMotionWidget.getY();
    f3 = paramMotionWidget.getWidth();
    f4 = paramMotionWidget.getHeight();
    localMotionPaths.OooO0o(f1, f2, f3, f4);
    this.OooO0o.setState(paramMotionWidget);
    this.OooO0oO.setState(paramMotionWidget);
  }
  
  public void setDrawPath(int paramInt)
  {
    this.OooO0Oo.o00Ooo00 = paramInt;
  }
  
  public void setEnd(MotionWidget paramMotionWidget)
  {
    MotionPaths localMotionPaths = this.OooO0o0;
    float f1 = 1.0F;
    localMotionPaths.o00Ooo0 = f1;
    localMotionPaths.o00Ooo0O = f1;
    OooO0oo(localMotionPaths);
    localMotionPaths = this.OooO0o0;
    f1 = paramMotionWidget.getLeft();
    float f2 = paramMotionWidget.getTop();
    float f3 = paramMotionWidget.getWidth();
    float f4 = paramMotionWidget.getHeight();
    localMotionPaths.OooO0o(f1, f2, f3, f4);
    this.OooO0o0.OooO0O0(paramMotionWidget);
    this.OooO0oO.setState(paramMotionWidget);
  }
  
  public void setPathMotionArc(int paramInt)
  {
    this.OooOo0 = paramInt;
  }
  
  public void setStart(MotionWidget paramMotionWidget)
  {
    MotionPaths localMotionPaths = this.OooO0Oo;
    localMotionPaths.o00Ooo0 = 0.0F;
    localMotionPaths.o00Ooo0O = 0.0F;
    float f1 = paramMotionWidget.getX();
    float f2 = paramMotionWidget.getY();
    float f3 = paramMotionWidget.getWidth();
    float f4 = paramMotionWidget.getHeight();
    localMotionPaths.OooO0o(f1, f2, f3, f4);
    this.OooO0Oo.OooO0O0(paramMotionWidget);
    this.OooO0o.setState(paramMotionWidget);
  }
  
  public void setTransformPivotTarget(int paramInt)
  {
    this.OooOo0O = paramInt;
    this.OooOo0o = null;
  }
  
  public void setView(MotionWidget paramMotionWidget)
  {
    this.OooO0O0 = paramMotionWidget;
  }
  
  public void setupRelative(Motion paramMotion)
  {
    MotionPaths localMotionPaths1 = this.OooO0Oo;
    MotionPaths localMotionPaths2 = paramMotion.OooO0Oo;
    localMotionPaths1.OooO0oO(paramMotion, localMotionPaths2);
    localMotionPaths1 = this.OooO0o0;
    localMotionPaths2 = paramMotion.OooO0o0;
    localMotionPaths1.OooO0oO(paramMotion, localMotionPaths2);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(" start: x: ");
    float f1 = this.OooO0Oo.o00Ooo0o;
    localStringBuilder.append(f1);
    String str = " y: ";
    localStringBuilder.append(str);
    float f2 = this.OooO0Oo.o00OooO0;
    localStringBuilder.append(f2);
    localStringBuilder.append(" end: x: ");
    f2 = this.OooO0o0.o00Ooo0o;
    localStringBuilder.append(f2);
    localStringBuilder.append(str);
    f1 = this.OooO0o0.o00OooO0;
    localStringBuilder.append(f1);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.Motion
 * JD-Core Version:    0.7.0.1
 */