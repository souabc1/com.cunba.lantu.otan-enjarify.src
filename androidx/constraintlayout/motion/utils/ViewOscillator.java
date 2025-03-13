package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;

public abstract class ViewOscillator
  extends KeyCycleOscillator
{
  public static ViewOscillator OooO0o(String paramString)
  {
    String str = "CUSTOM";
    boolean bool1 = paramString.startsWith(str);
    if (bool1)
    {
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$CustomSet;
      paramString.<init>();
      return paramString;
    }
    int i = paramString.hashCode();
    int j = -1;
    boolean bool2;
    switch (i)
    {
    default: 
      break;
    case 156108012: 
      str = "waveOffset";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 13;
      }
      break;
    case 92909918: 
      str = "alpha";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 12;
      }
      break;
    case 37232917: 
      str = "transitionPathRotate";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 11;
      }
      break;
    case -4379043: 
      str = "elevation";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 10;
      }
      break;
    case -40300674: 
      str = "rotation";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 9;
      }
      break;
    case -797520672: 
      str = "waveVariesBy";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 8;
      }
      break;
    case -908189617: 
      str = "scaleY";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 7;
      }
      break;
    case -908189618: 
      str = "scaleX";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 6;
      }
      break;
    case -1001078227: 
      str = "progress";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 5;
      }
      break;
    case -1225497655: 
      str = "translationZ";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 4;
      }
      break;
    case -1225497656: 
      str = "translationY";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 3;
      }
      break;
    case -1225497657: 
      str = "translationX";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 2;
      }
      break;
    case -1249320805: 
      str = "rotationY";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 1;
      }
      break;
    case -1249320806: 
      str = "rotationX";
      bool2 = paramString.equals(str);
      if (bool2) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return null;
    case 13: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$AlphaSet;
      paramString.<init>();
      return paramString;
    case 12: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$AlphaSet;
      paramString.<init>();
      return paramString;
    case 11: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$PathRotateSet;
      paramString.<init>();
      return paramString;
    case 10: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$ElevationSet;
      paramString.<init>();
      return paramString;
    case 9: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$RotationSet;
      paramString.<init>();
      return paramString;
    case 8: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$AlphaSet;
      paramString.<init>();
      return paramString;
    case 7: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$ScaleYset;
      paramString.<init>();
      return paramString;
    case 6: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$ScaleXset;
      paramString.<init>();
      return paramString;
    case 5: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$ProgressSet;
      paramString.<init>();
      return paramString;
    case 4: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$TranslationZset;
      paramString.<init>();
      return paramString;
    case 3: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$TranslationYset;
      paramString.<init>();
      return paramString;
    case 2: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$TranslationXset;
      paramString.<init>();
      return paramString;
    case 1: 
      paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$RotationYset;
      paramString.<init>();
      return paramString;
    }
    paramString = new androidx/constraintlayout/motion/utils/ViewOscillator$RotationXset;
    paramString.<init>();
    return paramString;
  }
  
  public abstract void OooO0oO(View paramView, float paramFloat);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewOscillator
 * JD-Core Version:    0.7.0.1
 */