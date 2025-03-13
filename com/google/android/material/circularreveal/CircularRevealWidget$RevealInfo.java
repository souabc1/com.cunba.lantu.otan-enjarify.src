package com.google.android.material.circularreveal;

public class CircularRevealWidget$RevealInfo
{
  public static final float INVALID_RADIUS = 3.4028235E+38F;
  public float centerX;
  public float centerY;
  public float radius;
  
  private CircularRevealWidget$RevealInfo() {}
  
  public CircularRevealWidget$RevealInfo(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.centerX = paramFloat1;
    this.centerY = paramFloat2;
    this.radius = paramFloat3;
  }
  
  public CircularRevealWidget$RevealInfo(RevealInfo paramRevealInfo)
  {
    this(f1, f2, f3);
  }
  
  public boolean isInvalid()
  {
    float f1 = this.radius;
    float f2 = 3.4028235E+38F;
    boolean bool = f1 < f2;
    if (!bool)
    {
      bool = true;
      f1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      f1 = 0.0F;
    }
    return bool;
  }
  
  public void set(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.centerX = paramFloat1;
    this.centerY = paramFloat2;
    this.radius = paramFloat3;
  }
  
  public void set(RevealInfo paramRevealInfo)
  {
    float f1 = paramRevealInfo.centerX;
    float f2 = paramRevealInfo.centerY;
    float f3 = paramRevealInfo.radius;
    set(f1, f2, f3);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo
 * JD-Core Version:    0.7.0.1
 */