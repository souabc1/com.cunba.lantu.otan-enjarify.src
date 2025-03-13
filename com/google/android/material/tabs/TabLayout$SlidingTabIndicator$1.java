package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class TabLayout$SlidingTabIndicator$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public TabLayout$SlidingTabIndicator$1(TabLayout.SlidingTabIndicator paramSlidingTabIndicator, View paramView1, View paramView2) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    TabLayout.SlidingTabIndicator localSlidingTabIndicator = this.this$1;
    View localView1 = this.val$currentView;
    View localView2 = this.val$targetView;
    float f = paramValueAnimator.getAnimatedFraction();
    TabLayout.SlidingTabIndicator.access$1800(localSlidingTabIndicator, localView1, localView2, f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
 * JD-Core Version:    0.7.0.1
 */