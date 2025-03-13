package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tooltip.TooltipDrawable;
import java.util.Iterator;
import java.util.List;

class BaseSlider$2
  extends AnimatorListenerAdapter
{
  public BaseSlider$2(BaseSlider paramBaseSlider) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    super.onAnimationEnd(paramAnimator);
    paramAnimator = ViewUtils.getContentViewOverlay(this.this$0);
    Iterator localIterator = BaseSlider.access$000(this.this$0).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      TooltipDrawable localTooltipDrawable = (TooltipDrawable)localIterator.next();
      paramAnimator.remove(localTooltipDrawable);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.slider.BaseSlider.2
 * JD-Core Version:    0.7.0.1
 */