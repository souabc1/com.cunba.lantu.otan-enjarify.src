package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import com.google.android.material.math.MathUtils;

public class CircularRevealWidget$CircularRevealEvaluator
  implements TypeEvaluator
{
  public static final TypeEvaluator CIRCULAR_REVEAL;
  private final CircularRevealWidget.RevealInfo revealInfo;
  
  static
  {
    CircularRevealEvaluator localCircularRevealEvaluator = new com/google/android/material/circularreveal/CircularRevealWidget$CircularRevealEvaluator;
    localCircularRevealEvaluator.<init>();
    CIRCULAR_REVEAL = localCircularRevealEvaluator;
  }
  
  public CircularRevealWidget$CircularRevealEvaluator()
  {
    CircularRevealWidget.RevealInfo localRevealInfo = new com/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;
    localRevealInfo.<init>(null);
    this.revealInfo = localRevealInfo;
  }
  
  public CircularRevealWidget.RevealInfo evaluate(float paramFloat, CircularRevealWidget.RevealInfo paramRevealInfo1, CircularRevealWidget.RevealInfo paramRevealInfo2)
  {
    CircularRevealWidget.RevealInfo localRevealInfo = this.revealInfo;
    float f1 = paramRevealInfo1.centerX;
    float f2 = paramRevealInfo2.centerX;
    f1 = MathUtils.lerp(f1, f2, paramFloat);
    f2 = paramRevealInfo1.centerY;
    float f3 = paramRevealInfo2.centerY;
    f2 = MathUtils.lerp(f2, f3, paramFloat);
    float f4 = paramRevealInfo1.radius;
    float f5 = paramRevealInfo2.radius;
    paramFloat = MathUtils.lerp(f4, f5, paramFloat);
    localRevealInfo.set(f1, f2, paramFloat);
    return this.revealInfo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealEvaluator
 * JD-Core Version:    0.7.0.1
 */