package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;

final class KeylineState$Keyline
{
  final float loc;
  final float locOffset;
  final float mask;
  final float maskedItemSize;
  
  public KeylineState$Keyline(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.loc = paramFloat1;
    this.locOffset = paramFloat2;
    this.mask = paramFloat3;
    this.maskedItemSize = paramFloat4;
  }
  
  public static Keyline lerp(Keyline paramKeyline1, Keyline paramKeyline2, float paramFloat)
  {
    Keyline localKeyline = new com/google/android/material/carousel/KeylineState$Keyline;
    float f1 = paramKeyline1.loc;
    float f2 = paramKeyline2.loc;
    f1 = AnimationUtils.lerp(f1, f2, paramFloat);
    f2 = paramKeyline1.locOffset;
    float f3 = paramKeyline2.locOffset;
    f2 = AnimationUtils.lerp(f2, f3, paramFloat);
    f3 = paramKeyline1.mask;
    float f4 = paramKeyline2.mask;
    f3 = AnimationUtils.lerp(f3, f4, paramFloat);
    float f5 = paramKeyline1.maskedItemSize;
    float f6 = paramKeyline2.maskedItemSize;
    f5 = AnimationUtils.lerp(f5, f6, paramFloat);
    localKeyline.<init>(f1, f2, f3, f5);
    return localKeyline;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.KeylineState.Keyline
 * JD-Core Version:    0.7.0.1
 */