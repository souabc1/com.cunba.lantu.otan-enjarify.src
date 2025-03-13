package com.google.android.material.progressindicator;

import android.util.Property;

class DrawableWithAnimatedVisibilityChange$3
  extends Property
{
  public DrawableWithAnimatedVisibilityChange$3(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float get(DrawableWithAnimatedVisibilityChange paramDrawableWithAnimatedVisibilityChange)
  {
    return Float.valueOf(paramDrawableWithAnimatedVisibilityChange.getGrowFraction());
  }
  
  public void set(DrawableWithAnimatedVisibilityChange paramDrawableWithAnimatedVisibilityChange, Float paramFloat)
  {
    float f = paramFloat.floatValue();
    paramDrawableWithAnimatedVisibilityChange.setGrowFraction(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.3
 * JD-Core Version:    0.7.0.1
 */