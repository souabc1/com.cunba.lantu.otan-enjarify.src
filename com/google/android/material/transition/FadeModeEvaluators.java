package com.google.android.material.transition;

import m54207b69;

class FadeModeEvaluators
{
  private static final FadeModeEvaluator CROSS;
  private static final FadeModeEvaluator IN;
  private static final FadeModeEvaluator OUT;
  private static final FadeModeEvaluator THROUGH;
  
  static
  {
    Object localObject = new com/google/android/material/transition/FadeModeEvaluators$1;
    ((FadeModeEvaluators.1)localObject).<init>();
    IN = (FadeModeEvaluator)localObject;
    localObject = new com/google/android/material/transition/FadeModeEvaluators$2;
    ((FadeModeEvaluators.2)localObject).<init>();
    OUT = (FadeModeEvaluator)localObject;
    localObject = new com/google/android/material/transition/FadeModeEvaluators$3;
    ((FadeModeEvaluators.3)localObject).<init>();
    CROSS = (FadeModeEvaluator)localObject;
    localObject = new com/google/android/material/transition/FadeModeEvaluators$4;
    ((FadeModeEvaluators.4)localObject).<init>();
    THROUGH = (FadeModeEvaluator)localObject;
  }
  
  public static FadeModeEvaluator get(int paramInt, boolean paramBoolean)
  {
    Object localObject;
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        paramBoolean = true;
        if (paramInt != paramBoolean)
        {
          paramBoolean = true;
          if (paramInt == paramBoolean) {
            return THROUGH;
          }
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = m54207b69.F54207b69_11("?Z13352E3E3A3844814444484A8644434D4F718C");
          localStringBuilder.append(str);
          localStringBuilder.append(paramInt);
          localObject = localStringBuilder.toString();
          localIllegalArgumentException.<init>((String)localObject);
          throw localIllegalArgumentException;
        }
        return CROSS;
      }
      if (paramBoolean) {
        localObject = OUT;
      } else {
        localObject = IN;
      }
      return localObject;
    }
    if (paramBoolean) {
      localObject = IN;
    } else {
      localObject = OUT;
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.FadeModeEvaluators
 * JD-Core Version:    0.7.0.1
 */