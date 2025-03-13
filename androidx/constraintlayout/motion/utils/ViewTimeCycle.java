package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;

public abstract class ViewTimeCycle
  extends TimeCycleSplineSet
{
  public static ViewTimeCycle OooO0Oo(String paramString, SparseArray paramSparseArray)
  {
    ViewTimeCycle.CustomSet localCustomSet = new androidx/constraintlayout/motion/utils/ViewTimeCycle$CustomSet;
    localCustomSet.<init>(paramString, paramSparseArray);
    return localCustomSet;
  }
  
  public static ViewTimeCycle OooO0o0(String paramString, long paramLong)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    String str;
    boolean bool;
    switch (i)
    {
    default: 
      break;
    case 92909918: 
      str = "alpha";
      bool = paramString.equals(str);
      if (bool) {
        j = 11;
      }
      break;
    case 37232917: 
      str = "transitionPathRotate";
      bool = paramString.equals(str);
      if (bool) {
        j = 10;
      }
      break;
    case -4379043: 
      str = "elevation";
      bool = paramString.equals(str);
      if (bool) {
        j = 9;
      }
      break;
    case -40300674: 
      str = "rotation";
      bool = paramString.equals(str);
      if (bool) {
        j = 8;
      }
      break;
    case -908189617: 
      str = "scaleY";
      bool = paramString.equals(str);
      if (bool) {
        j = 7;
      }
      break;
    case -908189618: 
      str = "scaleX";
      bool = paramString.equals(str);
      if (bool) {
        j = 6;
      }
      break;
    case -1001078227: 
      str = "progress";
      bool = paramString.equals(str);
      if (bool) {
        j = 5;
      }
      break;
    case -1225497655: 
      str = "translationZ";
      bool = paramString.equals(str);
      if (bool) {
        j = 4;
      }
      break;
    case -1225497656: 
      str = "translationY";
      bool = paramString.equals(str);
      if (bool) {
        j = 3;
      }
      break;
    case -1225497657: 
      str = "translationX";
      bool = paramString.equals(str);
      if (bool) {
        j = 2;
      }
      break;
    case -1249320805: 
      str = "rotationY";
      bool = paramString.equals(str);
      if (bool) {
        j = 1;
      }
      break;
    case -1249320806: 
      str = "rotationX";
      bool = paramString.equals(str);
      if (bool) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return null;
    case 11: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$AlphaSet;
      paramString.<init>();
      break;
    case 10: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$PathRotate;
      paramString.<init>();
      break;
    case 9: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$ElevationSet;
      paramString.<init>();
      break;
    case 8: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$RotationSet;
      paramString.<init>();
      break;
    case 7: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$ScaleYset;
      paramString.<init>();
      break;
    case 6: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$ScaleXset;
      paramString.<init>();
      break;
    case 5: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$ProgressSet;
      paramString.<init>();
      break;
    case 4: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$TranslationZset;
      paramString.<init>();
      break;
    case 3: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$TranslationYset;
      paramString.<init>();
      break;
    case 2: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$TranslationXset;
      paramString.<init>();
      break;
    case 1: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$RotationYset;
      paramString.<init>();
      break;
    case 0: 
      paramString = new androidx/constraintlayout/motion/utils/ViewTimeCycle$RotationXset;
      paramString.<init>();
    }
    paramString.setStartTime(paramLong);
    return paramString;
  }
  
  public float OooO0OO(float paramFloat, long paramLong, View paramView, KeyCache paramKeyCache)
  {
    ViewTimeCycle localViewTimeCycle = this;
    long l1 = paramLong;
    Object localObject1 = paramView;
    KeyCache localKeyCache = paramKeyCache;
    Object localObject2 = this.OooO00o;
    double d1 = paramFloat;
    float[] arrayOfFloat1 = this.OooO0oO;
    ((CurveFit)localObject2).OooO0o0(d1, arrayOfFloat1);
    localObject2 = this.OooO0oO;
    boolean bool1 = true;
    float f1 = localObject2[bool1];
    arrayOfFloat1 = null;
    boolean bool2 = f1 < 0.0F;
    int i = 2;
    if (!bool2)
    {
      this.OooO0oo = false;
      return localObject2[i];
    }
    float f2 = this.OooOO0;
    boolean bool3 = Float.isNaN(f2);
    if (bool3)
    {
      localObject2 = this.OooO0o;
      f2 = paramKeyCache.OooO00o(paramView, (String)localObject2, 0);
      this.OooOO0 = f2;
      bool3 = Float.isNaN(f2);
      if (bool3) {
        this.OooOO0 = 0.0F;
      }
    }
    long l2 = localViewTimeCycle.OooO;
    l2 = l1 - l2;
    double d2 = localViewTimeCycle.OooOO0;
    double d3 = l2;
    double d4 = 1.E-009D;
    d3 *= d4;
    d1 = f1;
    d3 *= d1;
    d2 += d3;
    double d5 = 1.0D;
    d2 %= d5;
    f2 = (float)d2;
    localViewTimeCycle.OooOO0 = f2;
    String str = localViewTimeCycle.OooO0o;
    localKeyCache.OooO0O0(localObject1, str, 0, f2);
    localViewTimeCycle.OooO = l1;
    float[] arrayOfFloat2 = localViewTimeCycle.OooO0oO;
    float f3 = arrayOfFloat2[0];
    float f4 = localViewTimeCycle.OooOO0;
    f4 = localViewTimeCycle.OooO00o(f4);
    localObject1 = localViewTimeCycle.OooO0oO;
    float f5 = localObject1[i];
    f4 = f4 * f3 + f5;
    boolean bool4 = f3 < 0.0F;
    if ((!bool4) && (!bool2))
    {
      bool1 = false;
      str = null;
    }
    else
    {
      bool1 = true;
    }
    localViewTimeCycle.OooO0oo = bool1;
    return f4;
  }
  
  public abstract boolean OooO0o(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewTimeCycle
 * JD-Core Version:    0.7.0.1
 */