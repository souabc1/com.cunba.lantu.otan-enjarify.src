package androidx.constraintlayout.core.motion.utils;

public abstract interface TypedValues$TransitionType
{
  public static final String[] OooO00o = tmp33_24;
  
  static
  {
    String[] tmp5_2 = new String[9];
    String[] tmp6_5 = tmp5_2;
    String[] tmp6_5 = tmp5_2;
    tmp6_5[0] = "duration";
    tmp6_5[1] = "from";
    String[] tmp15_6 = tmp6_5;
    String[] tmp15_6 = tmp6_5;
    tmp15_6[2] = "to";
    tmp15_6[3] = "pathMotionArc";
    String[] tmp24_15 = tmp15_6;
    String[] tmp24_15 = tmp15_6;
    tmp24_15[4] = "autoTransition";
    tmp24_15[5] = "motionInterpolator";
    String[] tmp33_24 = tmp24_15;
    String[] tmp33_24 = tmp24_15;
    tmp33_24[6] = "staggered";
    tmp33_24[7] = "from";
    tmp33_24[8] = "transitionFlags";
  }
  
  public static int getType(int paramInt)
  {
    int i = 509;
    if (paramInt != i) {
      switch (paramInt)
      {
      default: 
        switch (paramInt)
        {
        default: 
          return -1;
        case 706: 
          return 4;
        }
      case 701: 
      case 702: 
        return 8;
      }
    }
    return 2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType
 * JD-Core Version:    0.7.0.1
 */