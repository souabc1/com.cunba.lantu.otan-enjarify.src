package com.google.android.material.animation;

import android.animation.TypeEvaluator;

public class ArgbEvaluatorCompat
  implements TypeEvaluator
{
  private static final ArgbEvaluatorCompat instance;
  
  static
  {
    ArgbEvaluatorCompat localArgbEvaluatorCompat = new com/google/android/material/animation/ArgbEvaluatorCompat;
    localArgbEvaluatorCompat.<init>();
    instance = localArgbEvaluatorCompat;
  }
  
  public static ArgbEvaluatorCompat getInstance()
  {
    return instance;
  }
  
  public Integer evaluate(float paramFloat, Integer paramInteger1, Integer paramInteger2)
  {
    int i = paramInteger1.intValue();
    float f1 = i >> 24 & 0xFF;
    float f2 = 255.0F;
    f1 /= f2;
    float f3 = (i >> 16 & 0xFF) / f2;
    float f4 = (i >> 8 & 0xFF) / f2;
    float f5 = (i & 0xFF) / f2;
    int j = paramInteger2.intValue();
    float f6 = (j >> 24 & 0xFF) / f2;
    float f7 = (j >> 16 & 0xFF) / f2;
    float f8 = (j >> 8 & 0xFF) / f2;
    float f9 = (j & 0xFF) / f2;
    double d1 = f3;
    double d2 = 2.2D;
    f3 = (float)Math.pow(d1, d2);
    f4 = (float)Math.pow(f4, d2);
    f5 = (float)Math.pow(f5, d2);
    f7 = (float)Math.pow(f7, d2);
    f8 = (float)Math.pow(f8, d2);
    f9 = (float)Math.pow(f9, d2);
    f6 = (f6 - f1) * paramFloat;
    f1 += f6;
    f7 = (f7 - f3) * paramFloat;
    f3 += f7;
    f8 = (f8 - f4) * paramFloat;
    f4 += f8;
    f9 -= f5;
    paramFloat *= f9;
    f5 += paramFloat;
    f1 *= f2;
    double d3 = f3;
    double d4 = 0.4545454545454545D;
    paramFloat = (float)Math.pow(d3, d4) * f2;
    f9 = (float)Math.pow(f4, d4) * f2;
    f5 = (float)Math.pow(f5, d4) * f2;
    int k = Math.round(f1) << 24;
    int m = Math.round(paramFloat) << 16 | k;
    j = Math.round(f9) << 8;
    m |= j;
    i = Math.round(f5);
    return Integer.valueOf(m | i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.animation.ArgbEvaluatorCompat
 * JD-Core Version:    0.7.0.1
 */