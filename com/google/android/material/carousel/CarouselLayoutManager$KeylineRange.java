package com.google.android.material.carousel;

import androidx.core.util.Preconditions;

class CarouselLayoutManager$KeylineRange
{
  final KeylineState.Keyline left;
  final KeylineState.Keyline right;
  
  public CarouselLayoutManager$KeylineRange(KeylineState.Keyline paramKeyline1, KeylineState.Keyline paramKeyline2)
  {
    float f1 = paramKeyline1.loc;
    float f2 = paramKeyline2.loc;
    boolean bool = f1 < f2;
    if (!bool)
    {
      bool = true;
      f1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      f1 = 0.0F;
    }
    Preconditions.OooO00o(bool);
    this.left = paramKeyline1;
    this.right = paramKeyline2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.CarouselLayoutManager.KeylineRange
 * JD-Core Version:    0.7.0.1
 */