package androidx.constraintlayout.core.motion;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

class MotionConstrainedPoint
  implements Comparable
{
  public static String[] o00o0OO0 = tmp28_15;
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
  public LinkedHashMap o00o0;
  public float o00o00;
  public float o00o000;
  public float o00o0000;
  public float o00o000O;
  public int o00o000o;
  public float o00o00O0;
  public float o00o00Oo;
  public float o00o00o;
  public float o00o00o0;
  public float o00o00oO;
  public int o00o00oo;
  public double[] o00o0O0;
  public int o00o0O00;
  public double[] o00o0O0O;
  public float o0O00o0;
  public float oo00oO;
  
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
    this.o00o000o = 0;
    this.o00o00o = f;
    this.o00o00oO = f;
    this.o00o00oo = -1;
    Object localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.o00o0 = ((LinkedHashMap)localObject);
    this.o00o0O00 = 0;
    int i = 18;
    double[] arrayOfDouble = new double[i];
    this.o00o0O0 = arrayOfDouble;
    localObject = new double[i];
    this.o00o0O0O = ((double[])localObject);
  }
  
  public void OooO0O0(MotionWidget paramMotionWidget)
  {
    int i = paramMotionWidget.getVisibility();
    this.o00Ooo0 = i;
    i = paramMotionWidget.getVisibility();
    int j = 4;
    if (i != j)
    {
      i = 0;
      f = 0.0F;
      localIterator = null;
    }
    else
    {
      f = paramMotionWidget.getAlpha();
    }
    this.o00OoOoo = f;
    i = 0;
    this.o00Ooo0O = false;
    float f = paramMotionWidget.getRotationZ();
    this.o00OooO0 = f;
    f = paramMotionWidget.getRotationX();
    this.o00OooO = f;
    f = paramMotionWidget.getRotationY();
    this.o00OooOO = f;
    f = paramMotionWidget.getScaleX();
    this.o00OooOo = f;
    f = paramMotionWidget.getScaleY();
    this.o0O00o0 = f;
    f = paramMotionWidget.getPivotX();
    this.o00OoooO = f;
    f = paramMotionWidget.getPivotY();
    this.o00Ooooo = f;
    f = paramMotionWidget.getTranslationX();
    this.o00o0000 = f;
    f = paramMotionWidget.getTranslationY();
    this.o00o000 = f;
    f = paramMotionWidget.getTranslationZ();
    this.o00o000O = f;
    Iterator localIterator = paramMotionWidget.getCustomAttributeNames().iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      String str = (String)localIterator.next();
      CustomVariable localCustomVariable = paramMotionWidget.OooO0o0(str);
      if (localCustomVariable != null)
      {
        boolean bool2 = localCustomVariable.isContinuous();
        if (bool2)
        {
          LinkedHashMap localLinkedHashMap = this.o00o0;
          localLinkedHashMap.put(str, localCustomVariable);
        }
      }
    }
  }
  
  public int OooO0OO(MotionConstrainedPoint paramMotionConstrainedPoint)
  {
    float f1 = this.oo00oO;
    float f2 = paramMotionConstrainedPoint.oo00oO;
    return Float.compare(f1, f2);
  }
  
  public void OooO0Oo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.o00o00 = paramFloat1;
    this.o00o00O0 = paramFloat2;
    this.o00o00Oo = paramFloat3;
    this.o00o00o0 = paramFloat4;
  }
  
  public void setState(MotionWidget paramMotionWidget)
  {
    float f1 = paramMotionWidget.getX();
    float f2 = paramMotionWidget.getY();
    float f3 = paramMotionWidget.getWidth();
    float f4 = paramMotionWidget.getHeight();
    OooO0Oo(f1, f2, f3, f4);
    OooO0O0(paramMotionWidget);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.MotionConstrainedPoint
 * JD-Core Version:    0.7.0.1
 */