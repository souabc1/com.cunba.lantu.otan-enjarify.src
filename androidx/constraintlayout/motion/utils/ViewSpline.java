package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.SplineSet;

public abstract class ViewSpline
  extends SplineSet
{
  public static ViewSpline OooO0OO(String paramString, SparseArray paramSparseArray)
  {
    ViewSpline.CustomSet localCustomSet = new androidx/constraintlayout/motion/utils/ViewSpline$CustomSet;
    localCustomSet.<init>(paramString, paramSparseArray);
    return localCustomSet;
  }
  
  public static ViewSpline OooO0Oo(String paramString)
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
    case 156108012: 
      str = "waveOffset";
      bool = paramString.equals(str);
      if (bool) {
        j = 15;
      }
      break;
    case 92909918: 
      str = "alpha";
      bool = paramString.equals(str);
      if (bool) {
        j = 14;
      }
      break;
    case 37232917: 
      str = "transitionPathRotate";
      bool = paramString.equals(str);
      if (bool) {
        j = 13;
      }
      break;
    case -4379043: 
      str = "elevation";
      bool = paramString.equals(str);
      if (bool) {
        j = 12;
      }
      break;
    case -40300674: 
      str = "rotation";
      bool = paramString.equals(str);
      if (bool) {
        j = 11;
      }
      break;
    case -760884509: 
      str = "transformPivotY";
      bool = paramString.equals(str);
      if (bool) {
        j = 10;
      }
      break;
    case -760884510: 
      str = "transformPivotX";
      bool = paramString.equals(str);
      if (bool) {
        j = 9;
      }
      break;
    case -797520672: 
      str = "waveVariesBy";
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
    case 15: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$AlphaSet;
      paramString.<init>();
      return paramString;
    case 14: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$AlphaSet;
      paramString.<init>();
      return paramString;
    case 13: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$PathRotate;
      paramString.<init>();
      return paramString;
    case 12: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$ElevationSet;
      paramString.<init>();
      return paramString;
    case 11: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$RotationSet;
      paramString.<init>();
      return paramString;
    case 10: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$PivotYset;
      paramString.<init>();
      return paramString;
    case 9: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$PivotXset;
      paramString.<init>();
      return paramString;
    case 8: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$AlphaSet;
      paramString.<init>();
      return paramString;
    case 7: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$ScaleYset;
      paramString.<init>();
      return paramString;
    case 6: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$ScaleXset;
      paramString.<init>();
      return paramString;
    case 5: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$ProgressSet;
      paramString.<init>();
      return paramString;
    case 4: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$TranslationZset;
      paramString.<init>();
      return paramString;
    case 3: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$TranslationYset;
      paramString.<init>();
      return paramString;
    case 2: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$TranslationXset;
      paramString.<init>();
      return paramString;
    case 1: 
      paramString = new androidx/constraintlayout/motion/utils/ViewSpline$RotationYset;
      paramString.<init>();
      return paramString;
    }
    paramString = new androidx/constraintlayout/motion/utils/ViewSpline$RotationXset;
    paramString.<init>();
    return paramString;
  }
  
  public abstract void OooO0o0(View paramView, float paramFloat);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewSpline
 * JD-Core Version:    0.7.0.1
 */