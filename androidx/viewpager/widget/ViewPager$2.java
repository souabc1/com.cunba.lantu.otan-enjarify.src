package androidx.viewpager.widget;

import android.view.animation.Interpolator;

final class ViewPager$2
  implements Interpolator
{
  public float getInterpolation(float paramFloat)
  {
    float f = 1.0F;
    paramFloat -= f;
    return paramFloat * paramFloat * paramFloat * paramFloat * paramFloat + f;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager.widget.ViewPager.2
 * JD-Core Version:    0.7.0.1
 */