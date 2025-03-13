package com.google.android.material.transition;

import android.graphics.RectF;
import m54207b69;

class FitModeEvaluators
{
  private static final FitModeEvaluator HEIGHT;
  private static final FitModeEvaluator WIDTH;
  
  static
  {
    Object localObject = new com/google/android/material/transition/FitModeEvaluators$1;
    ((FitModeEvaluators.1)localObject).<init>();
    WIDTH = (FitModeEvaluator)localObject;
    localObject = new com/google/android/material/transition/FitModeEvaluators$2;
    ((FitModeEvaluators.2)localObject).<init>();
    HEIGHT = (FitModeEvaluator)localObject;
  }
  
  public static FitModeEvaluator get(int paramInt, boolean paramBoolean, RectF paramRectF1, RectF paramRectF2)
  {
    Object localObject;
    if (paramInt != 0)
    {
      paramBoolean = true;
      if (paramInt != paramBoolean)
      {
        paramBoolean = true;
        if (paramInt == paramBoolean) {
          return HEIGHT;
        }
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        paramRectF1 = new java/lang/StringBuilder;
        paramRectF1.<init>();
        paramRectF2 = m54207b69.F54207b69_11("l37A5E4755635F5D1A5D63511E6A6965651924");
        paramRectF1.append(paramRectF2);
        paramRectF1.append(paramInt);
        localObject = paramRectF1.toString();
        localIllegalArgumentException.<init>((String)localObject);
        throw localIllegalArgumentException;
      }
      return WIDTH;
    }
    paramInt = shouldAutoFitToWidth(paramBoolean, paramRectF1, paramRectF2);
    if (paramInt != 0) {
      localObject = WIDTH;
    } else {
      localObject = HEIGHT;
    }
    return localObject;
  }
  
  private static boolean shouldAutoFitToWidth(boolean paramBoolean, RectF paramRectF1, RectF paramRectF2)
  {
    float f1 = paramRectF1.width();
    float f2 = paramRectF1.height();
    float f3 = paramRectF2.width();
    float f4 = paramRectF2.height();
    float f5 = f4 * f1 / f3;
    f3 = f3 * f2 / f1;
    boolean bool = true;
    f1 = 1.4E-45F;
    if (paramBoolean)
    {
      paramBoolean = f5 < f2;
      if (!paramBoolean) {
        break label82;
      }
    }
    else
    {
      paramBoolean = f3 < f4;
      if (!paramBoolean) {
        break label82;
      }
    }
    bool = false;
    f1 = 0.0F;
    label82:
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.FitModeEvaluators
 * JD-Core Version:    0.7.0.1
 */