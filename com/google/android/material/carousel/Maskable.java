package com.google.android.material.carousel;

import android.graphics.RectF;

abstract interface Maskable
{
  public abstract RectF getMaskRectF();
  
  public abstract float getMaskXPercentage();
  
  public abstract void setMaskXPercentage(float paramFloat);
  
  public abstract void setOnMaskChangedListener(OnMaskChangedListener paramOnMaskChangedListener);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.Maskable
 * JD-Core Version:    0.7.0.1
 */