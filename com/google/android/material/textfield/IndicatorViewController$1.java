package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;

class IndicatorViewController$1
  extends AnimatorListenerAdapter
{
  public IndicatorViewController$1(IndicatorViewController paramIndicatorViewController, int paramInt1, TextView paramTextView1, int paramInt2, TextView paramTextView2) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.this$0;
    int i = this.val$captionToShow;
    IndicatorViewController.access$002(paramAnimator, i);
    paramAnimator = this.this$0;
    i = 0;
    float f = 0.0F;
    IndicatorViewController.access$102(paramAnimator, null);
    paramAnimator = this.val$captionViewToHide;
    if (paramAnimator != null)
    {
      paramAnimator.setVisibility(4);
      int j = this.val$captionToHide;
      int k = 1;
      if (j == k)
      {
        paramAnimator = IndicatorViewController.access$200(this.this$0);
        if (paramAnimator != null)
        {
          paramAnimator = IndicatorViewController.access$200(this.this$0);
          paramAnimator.setText(null);
        }
      }
    }
    paramAnimator = this.val$captionViewToShow;
    if (paramAnimator != null)
    {
      paramAnimator.setTranslationY(0.0F);
      paramAnimator = this.val$captionViewToShow;
      i = 1065353216;
      f = 1.0F;
      paramAnimator.setAlpha(f);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.val$captionViewToShow;
    if (paramAnimator != null)
    {
      paramAnimator.setVisibility(0);
      paramAnimator = this.val$captionViewToShow;
      paramAnimator.setAlpha(0.0F);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.IndicatorViewController.1
 * JD-Core Version:    0.7.0.1
 */