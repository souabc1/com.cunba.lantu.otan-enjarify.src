package com.google.android.material.carousel;

import android.view.View;

public abstract class CarouselStrategy
{
  public static float getChildMaskPercentage(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat1 -= paramFloat3;
    paramFloat2 -= paramFloat3;
    paramFloat1 /= paramFloat2;
    return 1.0F - paramFloat1;
  }
  
  public abstract KeylineState onFirstChildMeasuredWithMargins(Carousel paramCarousel, View paramView);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.CarouselStrategy
 * JD-Core Version:    0.7.0.1
 */