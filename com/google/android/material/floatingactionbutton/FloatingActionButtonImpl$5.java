package com.google.android.material.floatingactionbutton;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

class FloatingActionButtonImpl$5
  implements TypeEvaluator
{
  FloatEvaluator floatEvaluator;
  
  public FloatingActionButtonImpl$5(FloatingActionButtonImpl paramFloatingActionButtonImpl)
  {
    paramFloatingActionButtonImpl = new android/animation/FloatEvaluator;
    paramFloatingActionButtonImpl.<init>();
    this.floatEvaluator = paramFloatingActionButtonImpl;
  }
  
  public Float evaluate(float paramFloat, Float paramFloat1, Float paramFloat2)
  {
    FloatEvaluator localFloatEvaluator = this.floatEvaluator;
    Float localFloat = localFloatEvaluator.evaluate(paramFloat, paramFloat1, paramFloat2);
    paramFloat = localFloat.floatValue();
    float f = 0.1F;
    boolean bool = paramFloat < f;
    if (bool)
    {
      paramFloat = 0.0F;
      localFloat = null;
    }
    return Float.valueOf(paramFloat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.5
 * JD-Core Version:    0.7.0.1
 */