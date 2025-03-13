package androidx.customview.widget;

import android.view.animation.Interpolator;

class ViewDragHelper$1
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
 * Qualified Name:     androidx.customview.widget.ViewDragHelper.1
 * JD-Core Version:    0.7.0.1
 */