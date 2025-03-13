package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class AppBarLayout$BaseBehavior$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public AppBarLayout$BaseBehavior$1(AppBarLayout.BaseBehavior paramBaseBehavior, CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppBarLayout.BaseBehavior localBaseBehavior = this.this$0;
    CoordinatorLayout localCoordinatorLayout = this.val$coordinatorLayout;
    AppBarLayout localAppBarLayout = this.val$child;
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    localBaseBehavior.setHeaderTopBottomOffset(localCoordinatorLayout, localAppBarLayout, i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
 * JD-Core Version:    0.7.0.1
 */