package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

public class FadeThroughUpdateListener
  implements ValueAnimator.AnimatorUpdateListener
{
  private final float[] alphas;
  private final View fadeInView;
  private final View fadeOutView;
  
  public FadeThroughUpdateListener(View paramView1, View paramView2)
  {
    this.fadeOutView = paramView1;
    this.fadeInView = paramView2;
    paramView1 = new float[2];
    this.alphas = paramView1;
  }
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f1 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    float[] arrayOfFloat = this.alphas;
    FadeThroughUtils.calculateFadeOutAndInAlphas(f1, arrayOfFloat);
    paramValueAnimator = this.fadeOutView;
    int i;
    float f2;
    if (paramValueAnimator != null)
    {
      arrayOfFloat = this.alphas;
      i = 0;
      f2 = arrayOfFloat[0];
      paramValueAnimator.setAlpha(f2);
    }
    paramValueAnimator = this.fadeInView;
    if (paramValueAnimator != null)
    {
      arrayOfFloat = this.alphas;
      i = 1;
      f2 = arrayOfFloat[i];
      paramValueAnimator.setAlpha(f2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.FadeThroughUpdateListener
 * JD-Core Version:    0.7.0.1
 */