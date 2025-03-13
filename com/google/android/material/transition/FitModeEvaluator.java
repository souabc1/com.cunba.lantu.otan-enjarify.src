package com.google.android.material.transition;

import android.graphics.RectF;

abstract interface FitModeEvaluator
{
  public abstract void applyMask(RectF paramRectF, float paramFloat, FitModeResult paramFitModeResult);
  
  public abstract FitModeResult evaluate(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7);
  
  public abstract boolean shouldMaskStartBounds(FitModeResult paramFitModeResult);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.FitModeEvaluator
 * JD-Core Version:    0.7.0.1
 */