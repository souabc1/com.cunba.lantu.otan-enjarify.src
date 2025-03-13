package com.google.android.material.progressindicator;

import android.util.Property;

class LinearIndeterminateDisjointAnimatorDelegate$3
  extends Property
{
  public LinearIndeterminateDisjointAnimatorDelegate$3(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float get(LinearIndeterminateDisjointAnimatorDelegate paramLinearIndeterminateDisjointAnimatorDelegate)
  {
    return Float.valueOf(LinearIndeterminateDisjointAnimatorDelegate.access$300(paramLinearIndeterminateDisjointAnimatorDelegate));
  }
  
  public void set(LinearIndeterminateDisjointAnimatorDelegate paramLinearIndeterminateDisjointAnimatorDelegate, Float paramFloat)
  {
    float f = paramFloat.floatValue();
    paramLinearIndeterminateDisjointAnimatorDelegate.setAnimationFraction(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.3
 * JD-Core Version:    0.7.0.1
 */