package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.material.shape.MaterialShapeDrawable;

abstract class FloatingActionButtonImpl$ShadowAnimatorImpl
  extends AnimatorListenerAdapter
  implements ValueAnimator.AnimatorUpdateListener
{
  private float shadowSizeEnd;
  private float shadowSizeStart;
  private boolean validValues;
  
  private FloatingActionButtonImpl$ShadowAnimatorImpl(FloatingActionButtonImpl paramFloatingActionButtonImpl) {}
  
  public abstract float getTargetShadowSize();
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.this$0;
    float f = (int)this.shadowSizeEnd;
    paramAnimator.updateShapeElevation(f);
    this.validValues = false;
  }
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    boolean bool = this.validValues;
    if (!bool)
    {
      localObject = this.this$0.shapeDrawable;
      if (localObject == null)
      {
        bool = false;
        f1 = 0.0F;
        localObject = null;
      }
      else
      {
        f1 = ((MaterialShapeDrawable)localObject).getElevation();
      }
      this.shadowSizeStart = f1;
      float f1 = getTargetShadowSize();
      this.shadowSizeEnd = f1;
      bool = true;
      f1 = 1.4E-45F;
      this.validValues = bool;
    }
    Object localObject = this.this$0;
    float f2 = this.shadowSizeStart;
    float f3 = this.shadowSizeEnd - f2;
    float f4 = paramValueAnimator.getAnimatedFraction();
    f3 *= f4;
    f4 = (int)(f2 + f3);
    ((FloatingActionButtonImpl)localObject).updateShapeElevation(f4);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
 * JD-Core Version:    0.7.0.1
 */