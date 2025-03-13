package com.google.android.material.progressindicator;

import android.util.Property;

class CircularIndeterminateAnimatorDelegate$3
  extends Property
{
  public CircularIndeterminateAnimatorDelegate$3(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float get(CircularIndeterminateAnimatorDelegate paramCircularIndeterminateAnimatorDelegate)
  {
    return Float.valueOf(CircularIndeterminateAnimatorDelegate.access$200(paramCircularIndeterminateAnimatorDelegate));
  }
  
  public void set(CircularIndeterminateAnimatorDelegate paramCircularIndeterminateAnimatorDelegate, Float paramFloat)
  {
    float f = paramFloat.floatValue();
    paramCircularIndeterminateAnimatorDelegate.setAnimationFraction(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.3
 * JD-Core Version:    0.7.0.1
 */