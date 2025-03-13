package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import androidx.core.view.ViewCompat;

class BaseTransientBottomBar$14
  implements ValueAnimator.AnimatorUpdateListener
{
  private int previousAnimatedIntValue;
  
  public BaseTransientBottomBar$14(BaseTransientBottomBar paramBaseTransientBottomBar, int paramInt)
  {
    this.previousAnimatedIntValue = paramInt;
  }
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    paramValueAnimator = (Integer)paramValueAnimator.getAnimatedValue();
    int i = paramValueAnimator.intValue();
    boolean bool = BaseTransientBottomBar.access$1700();
    BaseTransientBottomBar.SnackbarBaseLayout localSnackbarBaseLayout;
    if (bool)
    {
      localSnackbarBaseLayout = this.this$0.view;
      int j = this.previousAnimatedIntValue;
      j = i - j;
      ViewCompat.OooooO0(localSnackbarBaseLayout, j);
    }
    else
    {
      localSnackbarBaseLayout = this.this$0.view;
      float f = i;
      localSnackbarBaseLayout.setTranslationY(f);
    }
    this.previousAnimatedIntValue = i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.14
 * JD-Core Version:    0.7.0.1
 */