package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.material.shape.MaterialShapeDrawable;

class BottomSheetBehavior$2
  implements ValueAnimator.AnimatorUpdateListener
{
  public BottomSheetBehavior$2(BottomSheetBehavior paramBottomSheetBehavior) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    paramValueAnimator = (Float)paramValueAnimator.getAnimatedValue();
    float f = paramValueAnimator.floatValue();
    MaterialShapeDrawable localMaterialShapeDrawable = BottomSheetBehavior.access$200(this.this$0);
    if (localMaterialShapeDrawable != null)
    {
      localMaterialShapeDrawable = BottomSheetBehavior.access$200(this.this$0);
      localMaterialShapeDrawable.setInterpolation(f);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.bottomsheet.BottomSheetBehavior.2
 * JD-Core Version:    0.7.0.1
 */