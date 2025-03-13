package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class BaseTransientBottomBar$12
  implements ValueAnimator.AnimatorUpdateListener
{
  public BaseTransientBottomBar$12(BaseTransientBottomBar paramBaseTransientBottomBar) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.this$0.view.setScaleX(f);
    this.this$0.view.setScaleY(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.12
 * JD-Core Version:    0.7.0.1
 */