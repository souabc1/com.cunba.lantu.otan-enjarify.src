package com.google.android.material.slider;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import androidx.core.view.ViewCompat;
import com.google.android.material.tooltip.TooltipDrawable;
import java.util.Iterator;
import java.util.List;

class BaseSlider$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public BaseSlider$1(BaseSlider paramBaseSlider) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    paramValueAnimator = (Float)paramValueAnimator.getAnimatedValue();
    float f = paramValueAnimator.floatValue();
    Iterator localIterator = BaseSlider.access$000(this.this$0).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      TooltipDrawable localTooltipDrawable = (TooltipDrawable)localIterator.next();
      localTooltipDrawable.setRevealFraction(f);
    }
    ViewCompat.Ooooooo(this.this$0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.slider.BaseSlider.1
 * JD-Core Version:    0.7.0.1
 */