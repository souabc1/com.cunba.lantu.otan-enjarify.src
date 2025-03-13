package com.google.android.material.color.utilities;

public class Blend
{
  public static int cam16Ucs(int paramInt1, int paramInt2, double paramDouble)
  {
    Cam16 localCam161 = Cam16.fromInt(paramInt1);
    Cam16 localCam162 = Cam16.fromInt(paramInt2);
    double d1 = localCam161.getJstar();
    double d2 = localCam161.getAstar();
    double d3 = localCam161.getBstar();
    double d4 = localCam162.getJstar();
    double d5 = localCam162.getAstar();
    double d6 = localCam162.getBstar();
    d4 = (d4 - d1) * paramDouble;
    double d7 = d1 + d4;
    d5 = (d5 - d2) * paramDouble;
    double d8 = d2 + d5;
    d6 = (d6 - d3) * paramDouble;
    double d9 = d3 + d6;
    return Cam16.fromUcs(d7, d8, d9).toInt();
  }
  
  public static int harmonize(int paramInt1, int paramInt2)
  {
    Hct localHct1 = Hct.fromInt(paramInt1);
    Hct localHct2 = Hct.fromInt(paramInt2);
    double d1 = localHct1.getHue();
    double d2 = localHct2.getHue();
    d1 = Math.min(MathUtils.differenceDegrees(d1, d2) * 0.5D, 15.0D);
    d2 = localHct1.getHue();
    double d3 = localHct1.getHue();
    double d4 = localHct2.getHue();
    d3 = MathUtils.rotationDirection(d3, d4);
    d1 *= d3;
    d3 = MathUtils.sanitizeDegreesDouble(d2 + d1);
    d4 = localHct1.getChroma();
    double d5 = localHct1.getTone();
    return Hct.from(d3, d4, d5).toInt();
  }
  
  public static int hctHue(int paramInt1, int paramInt2, double paramDouble)
  {
    Cam16 localCam161 = Cam16.fromInt(cam16Ucs(paramInt1, paramInt2, paramDouble));
    Cam16 localCam162 = Cam16.fromInt(paramInt1);
    double d1 = localCam161.getHue();
    double d2 = localCam162.getChroma();
    double d3 = ColorUtils.lstarFromArgb(paramInt1);
    return Hct.from(d1, d2, d3).toInt();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.Blend
 * JD-Core Version:    0.7.0.1
 */