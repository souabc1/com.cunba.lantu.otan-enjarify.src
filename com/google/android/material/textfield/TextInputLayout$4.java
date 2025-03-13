package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.material.internal.CollapsingTextHelper;

class TextInputLayout$4
  implements ValueAnimator.AnimatorUpdateListener
{
  public TextInputLayout$4(TextInputLayout paramTextInputLayout) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    CollapsingTextHelper localCollapsingTextHelper = this.this$0.collapsingTextHelper;
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    localCollapsingTextHelper.setExpansionFraction(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.TextInputLayout.4
 * JD-Core Version:    0.7.0.1
 */