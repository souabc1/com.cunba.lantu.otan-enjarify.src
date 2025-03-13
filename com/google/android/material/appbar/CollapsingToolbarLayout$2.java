package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class CollapsingToolbarLayout$2
  implements ValueAnimator.AnimatorUpdateListener
{
  public CollapsingToolbarLayout$2(CollapsingToolbarLayout paramCollapsingToolbarLayout) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    CollapsingToolbarLayout localCollapsingToolbarLayout = this.this$0;
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    localCollapsingToolbarLayout.setScrimAlpha(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.appbar.CollapsingToolbarLayout.2
 * JD-Core Version:    0.7.0.1
 */