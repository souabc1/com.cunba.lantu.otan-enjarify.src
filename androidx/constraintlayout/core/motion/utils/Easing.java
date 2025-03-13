package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;

public class Easing
{
  public static Easing OooO0O0;
  public static String[] OooO0OO = tmp30_17;
  public String OooO00o = "identity";
  
  static
  {
    Easing localEasing = new androidx/constraintlayout/core/motion/utils/Easing;
    localEasing.<init>();
    OooO0O0 = localEasing;
    String[] tmp16_13 = new String[4];
    String[] tmp17_16 = tmp16_13;
    String[] tmp17_16 = tmp16_13;
    tmp17_16[0] = "standard";
    tmp17_16[1] = "accelerate";
    tmp17_16[2] = "decelerate";
    String[] tmp30_17 = tmp17_16;
    tmp30_17[3] = "linear";
  }
  
  public static Easing OooO0OO(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    Object localObject = "cubic";
    boolean bool1 = paramString.startsWith((String)localObject);
    if (bool1)
    {
      localObject = new androidx/constraintlayout/core/motion/utils/Easing$CubicEasing;
      ((Easing.CubicEasing)localObject).<init>(paramString);
      return localObject;
    }
    localObject = "spline";
    bool1 = paramString.startsWith((String)localObject);
    if (bool1)
    {
      localObject = new androidx/constraintlayout/core/motion/utils/StepCurve;
      ((StepCurve)localObject).<init>(paramString);
      return localObject;
    }
    localObject = "Schlick";
    bool1 = paramString.startsWith((String)localObject);
    if (bool1)
    {
      localObject = new androidx/constraintlayout/core/motion/utils/Schlick;
      ((Schlick)localObject).<init>(paramString);
      return localObject;
    }
    int i = paramString.hashCode();
    int j = -1;
    boolean bool2;
    String str;
    switch (i)
    {
    default: 
      break;
    case 1312628413: 
      localObject = "standard";
      bool2 = paramString.equals(localObject);
      if (bool2) {
        j = 5;
      }
      break;
    case -749065269: 
      localObject = "overshoot";
      bool2 = paramString.equals(localObject);
      if (bool2) {
        j = 4;
      }
      break;
    case -1102672091: 
      localObject = "linear";
      bool2 = paramString.equals(localObject);
      if (bool2) {
        j = 3;
      }
      break;
    case -1197605014: 
      localObject = "anticipate";
      bool2 = paramString.equals(localObject);
      if (bool2) {
        j = 2;
      }
      break;
    case -1263948740: 
      localObject = "decelerate";
      bool2 = paramString.equals(localObject);
      if (bool2) {
        j = 1;
      }
      break;
    case -1354466595: 
      localObject = "accelerate";
      bool2 = paramString.equals(localObject);
      if (bool2)
      {
        j = 0;
        str = null;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramString = System.err;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
      str = Arrays.toString(OooO0OO);
      ((StringBuilder)localObject).append(str);
      localObject = ((StringBuilder)localObject).toString();
      paramString.println((String)localObject);
      return OooO0O0;
    case 5: 
      paramString = new androidx/constraintlayout/core/motion/utils/Easing$CubicEasing;
      paramString.<init>("cubic(0.4, 0.0, 0.2, 1)");
      return paramString;
    case 4: 
      paramString = new androidx/constraintlayout/core/motion/utils/Easing$CubicEasing;
      paramString.<init>("cubic(0.34, 1.56, 0.64, 1)");
      return paramString;
    case 3: 
      paramString = new androidx/constraintlayout/core/motion/utils/Easing$CubicEasing;
      paramString.<init>("cubic(1, 1, 0, 0)");
      return paramString;
    case 2: 
      paramString = new androidx/constraintlayout/core/motion/utils/Easing$CubicEasing;
      paramString.<init>("cubic(0.36, 0, 0.66, -0.56)");
      return paramString;
    case 1: 
      paramString = new androidx/constraintlayout/core/motion/utils/Easing$CubicEasing;
      paramString.<init>("cubic(0.0, 0.0, 0.2, 0.95)");
      return paramString;
    }
    paramString = new androidx/constraintlayout/core/motion/utils/Easing$CubicEasing;
    paramString.<init>("cubic(0.4, 0.05, 0.8, 0.7)");
    return paramString;
  }
  
  public double OooO00o(double paramDouble)
  {
    return paramDouble;
  }
  
  public double OooO0O0(double paramDouble)
  {
    return 1.0D;
  }
  
  public String toString()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.Easing
 * JD-Core Version:    0.7.0.1
 */