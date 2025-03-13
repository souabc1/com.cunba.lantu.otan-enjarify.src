package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class BaseTransientBottomBar$11
  implements ValueAnimator.AnimatorUpdateListener
{
  public BaseTransientBottomBar$11(BaseTransientBottomBar paramBaseTransientBottomBar) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    BaseTransientBottomBar.SnackbarBaseLayout localSnackbarBaseLayout = this.this$0.view;
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    localSnackbarBaseLayout.setAlpha(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.11
 * JD-Core Version:    0.7.0.1
 */