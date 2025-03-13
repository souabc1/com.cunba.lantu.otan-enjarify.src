package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class TabLayout$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public TabLayout$1(TabLayout paramTabLayout) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    TabLayout localTabLayout = this.this$0;
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    localTabLayout.scrollTo(i, 0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabLayout.1
 * JD-Core Version:    0.7.0.1
 */