package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewSpline.CustomSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet.Motion;
import androidx.constraintlayout.widget.ConstraintSet.PropertySet;
import androidx.constraintlayout.widget.ConstraintSet.Transform;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

class MotionConstrainedPoint
  implements Comparable
{
  public static String[] o00o0OO = tmp28_15;
  public float o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public boolean o00Ooo0O;
  public float o00Ooo0o;
  public float o00OooO;
  public float o00OooO0;
  public float o00OooOO;
  public float o00OooOo;
  public float o00OoooO;
  public float o00Ooooo;
  public int o00o0;
  public float o00o00;
  public float o00o000;
  public float o00o0000;
  public float o00o000O;
  public Easing o00o000o;
  public float o00o00O0;
  public float o00o00Oo;
  public float o00o00o;
  public float o00o00o0;
  public float o00o00oO;
  public float o00o00oo;
  public int o00o0O0;
  public LinkedHashMap o00o0O00;
  public double[] o00o0O0O;
  public double[] o00o0OO0;
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
  
  public MotionConstrainedPoint()
  {
    float f = 1.0F;
    this.o00OoOoo = f;
    this.o00Ooo00 = 0;
    this.o00Ooo0O = false;
    this.o00Ooo0o = 0.0F;
    this.o00OooO0 = 0.0F;
    this.o00OooO = 0.0F;
    this.o00OooOO = 0.0F;
    this.o00OooOo = f;
    this.o0O00o0 = f;
    f = 0.0F / 0.0F;
    this.o00OoooO = f;
    this.o00Ooooo = f;
    this.o00o0000 = 0.0F;
    this.o00o000 = 0.0F;
    this.o00o000O = 0.0F;
    this.oo00oO = 0;
    this.o00o00oO = f;
    this.o00o00oo = f;
    this.o00o0 = -1;
    Object localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.o00o0O00 = ((LinkedHashMap)localObject);
    this.o00o0O0 = 0;
    int i = 18;
    double[] arrayOfDouble = new double[i];
    this.o00o0O0O = arrayOfDouble;
    localObject = new double[i];
    this.o00o0OO0 = ((double[])localObject);
  }
  
  public void OooO(Rect paramRect, View paramView, int paramInt, float paramFloat)
  {
    int i = paramRect.left;
    float f1 = i;
    int j = paramRect.top;
    float f2 = j;
    int k = paramRect.width();
    float f3 = k;
    float f4 = paramRect.height();
    OooO0oo(f1, f2, f3, f4);
    OooO0OO(paramView);
    f4 = 0.0F / 0.0F;
    this.o00OoooO = f4;
    this.o00Ooooo = f4;
    int m = 1;
    f4 = 1.4E-45F;
    float f5 = 90.0F;
    if (paramInt != m)
    {
      m = 2;
      f4 = 2.802597E-045F;
      if (paramInt != m) {
        return;
      }
      paramFloat += f5;
    }
    else
    {
      paramFloat -= f5;
    }
    this.o00OooO0 = paramFloat;
  }
  
  public void OooO0O0(HashMap paramHashMap, int paramInt)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    Object localObject1;
    float f1;
    float f2;
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      String str = (String)localIterator.next();
      localObject1 = (ViewSpline)paramHashMap.get(str);
      str.hashCode();
      int i = str.hashCode();
      int k = 1;
      int m = -1;
      Object localObject2;
      boolean bool2;
      switch (i)
      {
      default: 
        break;
      case 92909918: 
        localObject2 = "alpha";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 13;
        }
        break;
      case 37232917: 
        localObject2 = "transitionPathRotate";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 12;
        }
        break;
      case -4379043: 
        localObject2 = "elevation";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 11;
        }
        break;
      case -40300674: 
        localObject2 = "rotation";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 10;
        }
        break;
      case -760884509: 
        localObject2 = "transformPivotY";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 9;
        }
        break;
      case -760884510: 
        localObject2 = "transformPivotX";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 8;
        }
        break;
      case -908189617: 
        localObject2 = "scaleY";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 7;
        }
        break;
      case -908189618: 
        localObject2 = "scaleX";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 6;
        }
        break;
      case -1001078227: 
        localObject2 = "progress";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 5;
        }
        break;
      case -1225497655: 
        localObject2 = "translationZ";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 4;
        }
        break;
      case -1225497656: 
        localObject2 = "translationY";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 3;
        }
        break;
      case -1225497657: 
        localObject2 = "translationX";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 2;
        }
        break;
      case -1249320805: 
        localObject2 = "rotationY";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = k;
        }
        break;
      case -1249320806: 
        localObject2 = "rotationX";
        bool2 = str.equals(localObject2);
        if (bool2) {
          m = 0;
        }
        break;
      }
      int j = 1065353216;
      f1 = 1.0F;
      f2 = 0.0F;
      switch (m)
      {
      default: 
        localObject2 = "CUSTOM";
        boolean bool3 = str.startsWith((String)localObject2);
        if (bool3)
        {
          localObject2 = str.split(",")[k];
          Object localObject3 = this.o00o0O00;
          k = ((AbstractMap)localObject3).containsKey(localObject2);
          if (k != 0)
          {
            localObject3 = this.o00o0O00;
            localObject2 = (ConstraintAttribute)((LinkedHashMap)localObject3).get(localObject2);
            k = localObject1 instanceof ViewSpline.CustomSet;
            if (k != 0)
            {
              localObject1 = (ViewSpline.CustomSet)localObject1;
              ((ViewSpline.CustomSet)localObject1).setPoint(paramInt, (ConstraintAttribute)localObject2);
            }
            else
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append(str);
              ((StringBuilder)localObject3).append(" ViewSpline not a CustomSet frame = ");
              ((StringBuilder)localObject3).append(paramInt);
              str = ", value";
              ((StringBuilder)localObject3).append(str);
              f3 = ((ConstraintAttribute)localObject2).getValueToInterpolate();
              ((StringBuilder)localObject3).append(f3);
              ((StringBuilder)localObject3).append(localObject1);
            }
          }
        }
        else
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = "UNKNOWN spline ";
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(str);
        }
        break;
      case 13: 
        f3 = this.o00OoOoo;
        bool1 = Float.isNaN(f3);
        if (!bool1) {
          f1 = this.o00OoOoo;
        }
        label890:
        ((SplineSet)localObject1).setPoint(paramInt, f1);
      }
    }
    float f3 = this.o00o00oO;
    boolean bool1 = Float.isNaN(f3);
    if (!bool1)
    {
      f2 = this.o00o00oO;
      break label958;
      f3 = this.o00Ooo0o;
      bool1 = Float.isNaN(f3);
      if (!bool1) {
        f2 = this.o00Ooo0o;
      }
    }
    for (;;)
    {
      label958:
      ((SplineSet)localObject1).setPoint(paramInt, f2);
      break;
      f3 = this.o00OooO0;
      bool1 = Float.isNaN(f3);
      if (!bool1)
      {
        f2 = this.o00OooO0;
        continue;
        f3 = this.o00Ooooo;
        bool1 = Float.isNaN(f3);
        if (!bool1)
        {
          f2 = this.o00Ooooo;
          continue;
          f3 = this.o00OoooO;
          bool1 = Float.isNaN(f3);
          if (!bool1)
          {
            f2 = this.o00OoooO;
            continue;
            f3 = this.o0O00o0;
            bool1 = Float.isNaN(f3);
            if (bool1) {
              break label890;
            }
            f1 = this.o0O00o0;
            break label890;
            f3 = this.o00OooOo;
            bool1 = Float.isNaN(f3);
            if (bool1) {
              break label890;
            }
            f1 = this.o00OooOo;
            break label890;
            f3 = this.o00o00oo;
            bool1 = Float.isNaN(f3);
            if (!bool1)
            {
              f2 = this.o00o00oo;
              continue;
              f3 = this.o00o000O;
              bool1 = Float.isNaN(f3);
              if (!bool1)
              {
                f2 = this.o00o000O;
                continue;
                f3 = this.o00o000;
                bool1 = Float.isNaN(f3);
                if (!bool1)
                {
                  f2 = this.o00o000;
                  continue;
                  f3 = this.o00o0000;
                  bool1 = Float.isNaN(f3);
                  if (!bool1)
                  {
                    f2 = this.o00o0000;
                    continue;
                    f3 = this.o00OooOO;
                    bool1 = Float.isNaN(f3);
                    if (!bool1)
                    {
                      f2 = this.o00OooOO;
                      continue;
                      f3 = this.o00OooO;
                      bool1 = Float.isNaN(f3);
                      if (!bool1) {
                        f2 = this.o00OooO;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void OooO0OO(View paramView)
  {
    int i = paramView.getVisibility();
    this.o00Ooo0 = i;
    i = paramView.getVisibility();
    if (i != 0)
    {
      i = 0;
      f1 = 0.0F;
    }
    else
    {
      f1 = paramView.getAlpha();
    }
    this.o00OoOoo = f1;
    this.o00Ooo0O = false;
    float f1 = paramView.getElevation();
    this.o00Ooo0o = f1;
    f1 = paramView.getRotation();
    this.o00OooO0 = f1;
    f1 = paramView.getRotationX();
    this.o00OooO = f1;
    f1 = paramView.getRotationY();
    this.o00OooOO = f1;
    f1 = paramView.getScaleX();
    this.o00OooOo = f1;
    f1 = paramView.getScaleY();
    this.o0O00o0 = f1;
    f1 = paramView.getPivotX();
    this.o00OoooO = f1;
    f1 = paramView.getPivotY();
    this.o00Ooooo = f1;
    f1 = paramView.getTranslationX();
    this.o00o0000 = f1;
    f1 = paramView.getTranslationY();
    this.o00o000 = f1;
    float f2 = paramView.getTranslationZ();
    this.o00o000O = f2;
  }
  
  public void OooO0Oo(ConstraintSet.Constraint paramConstraint)
  {
    Object localObject = paramConstraint.OooO0OO;
    int i = ((ConstraintSet.PropertySet)localObject).OooO0OO;
    this.o00Ooo00 = i;
    int k = ((ConstraintSet.PropertySet)localObject).OooO0O0;
    this.o00Ooo0 = k;
    if ((k != 0) && (i == 0))
    {
      m = 0;
      f1 = 0.0F;
      localObject = null;
    }
    else
    {
      f1 = ((ConstraintSet.PropertySet)localObject).OooO0Oo;
    }
    this.o00OoOoo = f1;
    localObject = paramConstraint.OooO0o;
    boolean bool1 = ((ConstraintSet.Transform)localObject).OooOOO0;
    this.o00Ooo0O = bool1;
    float f2 = ((ConstraintSet.Transform)localObject).OooOOO;
    this.o00Ooo0o = f2;
    f2 = ((ConstraintSet.Transform)localObject).OooO0O0;
    this.o00OooO0 = f2;
    f2 = ((ConstraintSet.Transform)localObject).OooO0OO;
    this.o00OooO = f2;
    f2 = ((ConstraintSet.Transform)localObject).OooO0Oo;
    this.o00OooOO = f2;
    f2 = ((ConstraintSet.Transform)localObject).OooO0o0;
    this.o00OooOo = f2;
    f2 = ((ConstraintSet.Transform)localObject).OooO0o;
    this.o0O00o0 = f2;
    f2 = ((ConstraintSet.Transform)localObject).OooO0oO;
    this.o00OoooO = f2;
    f2 = ((ConstraintSet.Transform)localObject).OooO0oo;
    this.o00Ooooo = f2;
    f2 = ((ConstraintSet.Transform)localObject).OooOO0;
    this.o00o0000 = f2;
    f2 = ((ConstraintSet.Transform)localObject).OooOO0O;
    this.o00o000 = f2;
    float f1 = ((ConstraintSet.Transform)localObject).OooOO0o;
    this.o00o000O = f1;
    localObject = Easing.OooO0OO(paramConstraint.OooO0Oo.OooO0Oo);
    this.o00o000o = ((Easing)localObject);
    localObject = paramConstraint.OooO0Oo;
    f2 = ((ConstraintSet.Motion)localObject).OooO;
    this.o00o00oO = f2;
    int j = ((ConstraintSet.Motion)localObject).OooO0o;
    this.oo00oO = j;
    int m = ((ConstraintSet.Motion)localObject).OooO0O0;
    this.o00o0 = m;
    f1 = paramConstraint.OooO0OO.OooO0o0;
    this.o00o00oo = f1;
    localObject = paramConstraint.OooO0oO.keySet().iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject).hasNext();
      if (!bool2) {
        break;
      }
      String str = (String)((Iterator)localObject).next();
      ConstraintAttribute localConstraintAttribute = (ConstraintAttribute)paramConstraint.OooO0oO.get(str);
      boolean bool3 = localConstraintAttribute.isContinuous();
      if (bool3)
      {
        LinkedHashMap localLinkedHashMap = this.o00o0O00;
        localLinkedHashMap.put(str, localConstraintAttribute);
      }
    }
  }
  
  public final boolean OooO0o(float paramFloat1, float paramFloat2)
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
  
  public int OooO0o0(MotionConstrainedPoint paramMotionConstrainedPoint)
  {
    float f1 = this.o00o00;
    float f2 = paramMotionConstrainedPoint.o00o00;
    return Float.compare(f1, f2);
  }
  
  public void OooO0oO(MotionConstrainedPoint paramMotionConstrainedPoint, HashSet paramHashSet)
  {
    float f1 = this.o00OoOoo;
    float f2 = paramMotionConstrainedPoint.o00OoOoo;
    boolean bool1 = OooO0o(f1, f2);
    String str1 = "alpha";
    if (bool1) {
      paramHashSet.add(str1);
    }
    f1 = this.o00Ooo0o;
    float f3 = paramMotionConstrainedPoint.o00Ooo0o;
    bool1 = OooO0o(f1, f3);
    String str2;
    if (bool1)
    {
      str2 = "elevation";
      paramHashSet.add(str2);
    }
    int i = this.o00Ooo0;
    int j = paramMotionConstrainedPoint.o00Ooo0;
    if (i != j)
    {
      int k = this.o00Ooo00;
      if ((k == 0) && ((i == 0) || (j == 0))) {
        paramHashSet.add(str1);
      }
    }
    f1 = this.o00OooO0;
    f2 = paramMotionConstrainedPoint.o00OooO0;
    boolean bool2 = OooO0o(f1, f2);
    if (bool2)
    {
      str2 = "rotation";
      paramHashSet.add(str2);
    }
    f1 = this.o00o00oO;
    bool2 = Float.isNaN(f1);
    if (bool2)
    {
      f1 = paramMotionConstrainedPoint.o00o00oO;
      bool2 = Float.isNaN(f1);
      if (bool2) {}
    }
    else
    {
      str2 = "transitionPathRotate";
      paramHashSet.add(str2);
    }
    f1 = this.o00o00oo;
    bool2 = Float.isNaN(f1);
    if (bool2)
    {
      f1 = paramMotionConstrainedPoint.o00o00oo;
      bool2 = Float.isNaN(f1);
      if (bool2) {}
    }
    else
    {
      str2 = "progress";
      paramHashSet.add(str2);
    }
    f1 = this.o00OooO;
    f2 = paramMotionConstrainedPoint.o00OooO;
    bool2 = OooO0o(f1, f2);
    if (bool2)
    {
      str2 = "rotationX";
      paramHashSet.add(str2);
    }
    f1 = this.o00OooOO;
    f2 = paramMotionConstrainedPoint.o00OooOO;
    bool2 = OooO0o(f1, f2);
    if (bool2)
    {
      str2 = "rotationY";
      paramHashSet.add(str2);
    }
    f1 = this.o00OoooO;
    f2 = paramMotionConstrainedPoint.o00OoooO;
    bool2 = OooO0o(f1, f2);
    if (bool2)
    {
      str2 = "transformPivotX";
      paramHashSet.add(str2);
    }
    f1 = this.o00Ooooo;
    f2 = paramMotionConstrainedPoint.o00Ooooo;
    bool2 = OooO0o(f1, f2);
    if (bool2)
    {
      str2 = "transformPivotY";
      paramHashSet.add(str2);
    }
    f1 = this.o00OooOo;
    f2 = paramMotionConstrainedPoint.o00OooOo;
    bool2 = OooO0o(f1, f2);
    if (bool2)
    {
      str2 = "scaleX";
      paramHashSet.add(str2);
    }
    f1 = this.o0O00o0;
    f2 = paramMotionConstrainedPoint.o0O00o0;
    bool2 = OooO0o(f1, f2);
    if (bool2)
    {
      str2 = "scaleY";
      paramHashSet.add(str2);
    }
    f1 = this.o00o0000;
    f2 = paramMotionConstrainedPoint.o00o0000;
    bool2 = OooO0o(f1, f2);
    if (bool2)
    {
      str2 = "translationX";
      paramHashSet.add(str2);
    }
    f1 = this.o00o000;
    f2 = paramMotionConstrainedPoint.o00o000;
    bool2 = OooO0o(f1, f2);
    if (bool2)
    {
      str2 = "translationY";
      paramHashSet.add(str2);
    }
    f1 = this.o00o000O;
    float f4 = paramMotionConstrainedPoint.o00o000O;
    boolean bool3 = OooO0o(f1, f4);
    if (bool3)
    {
      paramMotionConstrainedPoint = "translationZ";
      paramHashSet.add(paramMotionConstrainedPoint);
    }
  }
  
  public void OooO0oo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.o00o00O0 = paramFloat1;
    this.o00o00Oo = paramFloat2;
    this.o00o00o0 = paramFloat3;
    this.o00o00o = paramFloat4;
  }
  
  public void OooOO0(Rect paramRect, ConstraintSet paramConstraintSet, int paramInt1, int paramInt2)
  {
    int i = paramRect.left;
    float f1 = i;
    int j = paramRect.top;
    float f2 = j;
    int k = paramRect.width();
    float f3 = k;
    float f4 = paramRect.height();
    OooO0oo(f1, f2, f3, f4);
    paramRect = paramConstraintSet.getParameters(paramInt2);
    OooO0Oo(paramRect);
    int m = 1;
    f4 = 1.4E-45F;
    int n = 1119092736;
    float f5 = 90.0F;
    if (paramInt1 != m)
    {
      m = 2;
      f4 = 2.802597E-045F;
      if (paramInt1 != m)
      {
        m = 3;
        f4 = 4.203895E-045F;
        if (paramInt1 != m)
        {
          m = 4;
          f4 = 5.605194E-045F;
          if (paramInt1 != m) {
            return;
          }
        }
      }
      else
      {
        f4 = this.o00OooO0 + f5;
        this.o00OooO0 = f4;
        f5 = 180.0F;
        boolean bool = f4 < f5;
        if (!bool) {
          return;
        }
        int i1 = 1135869952;
        f5 = 360.0F;
        break label178;
      }
    }
    f4 = this.o00OooO0;
    label178:
    f4 -= f5;
    this.o00OooO0 = f4;
  }
  
  public void setState(View paramView)
  {
    float f1 = paramView.getX();
    float f2 = paramView.getY();
    float f3 = paramView.getWidth();
    float f4 = paramView.getHeight();
    OooO0oo(f1, f2, f3, f4);
    OooO0OO(paramView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionConstrainedPoint
 * JD-Core Version:    0.7.0.1
 */