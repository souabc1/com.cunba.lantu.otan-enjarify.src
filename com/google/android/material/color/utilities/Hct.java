package com.google.android.material.color.utilities;

public final class Hct
{
  private int argb;
  private double chroma;
  private double hue;
  private double tone;
  
  private Hct(int paramInt)
  {
    setInternalState(paramInt);
  }
  
  public static Hct from(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    int i = HctSolver.solveToInt(paramDouble1, paramDouble2, paramDouble3);
    Hct localHct = new com/google/android/material/color/utilities/Hct;
    localHct.<init>(i);
    return localHct;
  }
  
  public static Hct fromInt(int paramInt)
  {
    Hct localHct = new com/google/android/material/color/utilities/Hct;
    localHct.<init>(paramInt);
    return localHct;
  }
  
  private void setInternalState(int paramInt)
  {
    this.argb = paramInt;
    Cam16 localCam16 = Cam16.fromInt(paramInt);
    double d1 = localCam16.getHue();
    this.hue = d1;
    double d2 = localCam16.getChroma();
    this.chroma = d2;
    d2 = ColorUtils.lstarFromArgb(paramInt);
    this.tone = d2;
  }
  
  public double getChroma()
  {
    return this.chroma;
  }
  
  public double getHue()
  {
    return this.hue;
  }
  
  public double getTone()
  {
    return this.tone;
  }
  
  public Hct inViewingConditions(ViewingConditions paramViewingConditions)
  {
    paramViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(paramViewingConditions, null);
    double d1 = paramViewingConditions[0];
    int i = 1;
    double d2 = paramViewingConditions[i];
    double d3 = paramViewingConditions[2];
    ViewingConditions localViewingConditions = ViewingConditions.DEFAULT;
    Cam16 localCam16 = Cam16.fromXyzInViewingConditions(d1, d2, d3, localViewingConditions);
    double d4 = localCam16.getHue();
    double d5 = localCam16.getChroma();
    double d6 = ColorUtils.lstarFromY(paramViewingConditions[i]);
    return from(d4, d5, d6);
  }
  
  public void setChroma(double paramDouble)
  {
    double d1 = this.hue;
    double d2 = this.tone;
    int i = HctSolver.solveToInt(d1, paramDouble, d2);
    setInternalState(i);
  }
  
  public void setHue(double paramDouble)
  {
    double d1 = this.chroma;
    double d2 = this.tone;
    int i = HctSolver.solveToInt(paramDouble, d1, d2);
    setInternalState(i);
  }
  
  public void setTone(double paramDouble)
  {
    double d1 = this.hue;
    double d2 = this.chroma;
    int i = HctSolver.solveToInt(d1, d2, paramDouble);
    setInternalState(i);
  }
  
  public int toInt()
  {
    return this.argb;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.Hct
 * JD-Core Version:    0.7.0.1
 */