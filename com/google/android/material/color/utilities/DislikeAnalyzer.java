package com.google.android.material.color.utilities;

public final class DislikeAnalyzer
{
  private DislikeAnalyzer()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static Hct fixIfDisliked(Hct paramHct)
  {
    boolean bool = isDisliked(paramHct);
    if (bool)
    {
      double d1 = paramHct.getHue();
      double d2 = paramHct.getChroma();
      double d3 = 70.0D;
      paramHct = Hct.from(d1, d2, d3);
    }
    return paramHct;
  }
  
  public static boolean isDisliked(Hct paramHct)
  {
    long l1 = Math.round(paramHct.getHue());
    double d1 = l1;
    double d2 = 90.0D;
    boolean bool1 = d1 < d2;
    boolean bool2 = true;
    if (!bool1)
    {
      l2 = Math.round(paramHct.getHue());
      d3 = l2;
      d4 = 111.0D;
      bool1 = d3 < d4;
      if (!bool1)
      {
        bool1 = bool2;
        break label71;
      }
    }
    bool1 = false;
    label71:
    long l2 = Math.round(paramHct.getChroma());
    double d3 = l2;
    double d4 = 16.0D;
    boolean bool3 = d3 < d4;
    if (bool3) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    long l3 = Math.round(paramHct.getTone());
    double d5 = l3;
    double d6 = 70.0D;
    boolean bool4 = d5 < d6;
    if (bool4)
    {
      bool4 = bool2;
    }
    else
    {
      bool4 = false;
      paramHct = null;
    }
    if ((!bool1) || (!bool3) || (!bool4)) {
      bool2 = false;
    }
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.DislikeAnalyzer
 * JD-Core Version:    0.7.0.1
 */