package com.google.android.material.progressindicator;

import android.util.Property;

class LinearIndeterminateContiguousAnimatorDelegate$2
  extends Property
{
  public LinearIndeterminateContiguousAnimatorDelegate$2(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float get(LinearIndeterminateContiguousAnimatorDelegate paramLinearIndeterminateContiguousAnimatorDelegate)
  {
    return Float.valueOf(LinearIndeterminateContiguousAnimatorDelegate.access$300(paramLinearIndeterminateContiguousAnimatorDelegate));
  }
  
  public void set(LinearIndeterminateContiguousAnimatorDelegate paramLinearIndeterminateContiguousAnimatorDelegate, Float paramFloat)
  {
    float f = paramFloat.floatValue();
    paramLinearIndeterminateContiguousAnimatorDelegate.setAnimationFraction(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.2
 * JD-Core Version:    0.7.0.1
 */