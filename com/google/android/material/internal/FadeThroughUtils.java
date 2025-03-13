package com.google.android.material.internal;

final class FadeThroughUtils
{
  static final float THRESHOLD_ALPHA = 0.5F;
  
  public static void calculateFadeOutAndInAlphas(float paramFloat, float[] paramArrayOfFloat)
  {
    float f1 = 0.5F;
    boolean bool = paramFloat < f1;
    float f2 = 1.0F;
    float f3 = 2.0F;
    int i = 1;
    if (!bool)
    {
      paramFloat *= f3;
      f2 -= paramFloat;
      paramArrayOfFloat[0] = f2;
      paramArrayOfFloat[i] = 0.0F;
    }
    else
    {
      paramArrayOfFloat[0] = 0.0F;
      paramFloat = paramFloat * f3 - f2;
      paramArrayOfFloat[i] = paramFloat;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.FadeThroughUtils
 * JD-Core Version:    0.7.0.1
 */