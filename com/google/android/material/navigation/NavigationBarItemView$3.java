package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class NavigationBarItemView$3
  implements ValueAnimator.AnimatorUpdateListener
{
  public NavigationBarItemView$3(NavigationBarItemView paramNavigationBarItemView, float paramFloat) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f1 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    NavigationBarItemView localNavigationBarItemView = this.this$0;
    float f2 = this.val$newProgress;
    NavigationBarItemView.access$500(localNavigationBarItemView, f1, f2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.navigation.NavigationBarItemView.3
 * JD-Core Version:    0.7.0.1
 */