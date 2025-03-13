package androidx.constraintlayout.core.motion.utils;

public abstract interface TypedValues$PositionType
{
  public static final String[] OooO00o = tmp24_15;
  
  static
  {
    String[] tmp5_2 = new String[7];
    String[] tmp6_5 = tmp5_2;
    String[] tmp6_5 = tmp5_2;
    tmp6_5[0] = "transitionEasing";
    tmp6_5[1] = "drawPath";
    String[] tmp15_6 = tmp6_5;
    String[] tmp15_6 = tmp6_5;
    tmp15_6[2] = "percentWidth";
    tmp15_6[3] = "percentHeight";
    String[] tmp24_15 = tmp15_6;
    String[] tmp24_15 = tmp15_6;
    tmp24_15[4] = "sizePercent";
    tmp24_15[5] = "percentX";
    tmp24_15[6] = "percentY";
  }
  
  public static int getType(int paramInt)
  {
    int i = 100;
    if (paramInt != i)
    {
      i = 101;
      if (paramInt != i) {}
      switch (paramInt)
      {
      default: 
        return -1;
      case 503: 
      case 504: 
      case 505: 
      case 506: 
      case 507: 
        return 4;
      case 501: 
      case 502: 
        return 8;
      }
    }
    return 2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedValues.PositionType
 * JD-Core Version:    0.7.0.1
 */