package com.scwang.smartrefresh.header.waveswipe;

import android.view.animation.Interpolator;

public class DropBounceInterpolator
  implements Interpolator
{
  public float getInterpolation(float paramFloat)
  {
    float f = 0.25F;
    boolean bool1 = paramFloat < f;
    double d1 = 2.0D;
    double d2 = paramFloat;
    double d3;
    double d4;
    int i;
    if (bool1)
    {
      d3 = 0.125D;
      d2 -= d3;
      d4 = Math.pow(d2, d1);
      paramFloat = (float)d4 * -38.400002F;
      i = 1058642330;
    }
    for (f = 0.6F;; f = 0.3F)
    {
      return paramFloat + f;
      d3 = 0.5D;
      boolean bool2 = d2 < d3;
      if (bool2) {
        break;
      }
      d3 = 0.75D;
      bool2 = d2 < d3;
      if (!bool2) {
        break;
      }
      d3 = 0.625D;
      d2 -= d3;
      d4 = Math.pow(d2, d1);
      paramFloat = (float)d4 * -19.200001F;
      i = 1050253722;
    }
    return 0.0F;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.waveswipe.DropBounceInterpolator
 * JD-Core Version:    0.7.0.1
 */