package com.google.android.material.floatingactionbutton;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.animation.AnimationUtils;

class FloatingActionButtonImpl$4
  implements ValueAnimator.AnimatorUpdateListener
{
  public FloatingActionButtonImpl$4(FloatingActionButtonImpl paramFloatingActionButtonImpl, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Matrix paramMatrix) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f1 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    Object localObject = this.this$0.view;
    float f2 = this.val$startAlpha;
    float f3 = this.val$targetOpacity;
    f2 = AnimationUtils.lerp(f2, f3, 0.0F, 0.2F, f1);
    ((View)localObject).setAlpha(f2);
    localObject = this.this$0.view;
    f2 = this.val$startScaleX;
    f3 = this.val$targetScale;
    f2 = AnimationUtils.lerp(f2, f3, f1);
    ((FloatingActionButton)localObject).setScaleX(f2);
    localObject = this.this$0.view;
    f2 = this.val$startScaleY;
    f3 = this.val$targetScale;
    f2 = AnimationUtils.lerp(f2, f3, f1);
    ((FloatingActionButton)localObject).setScaleY(f2);
    localObject = this.this$0;
    f2 = this.val$startImageMatrixScale;
    f3 = this.val$targetIconScale;
    f2 = AnimationUtils.lerp(f2, f3, f1);
    FloatingActionButtonImpl.access$202((FloatingActionButtonImpl)localObject, f2);
    localObject = this.this$0;
    f2 = this.val$startImageMatrixScale;
    f3 = this.val$targetIconScale;
    f1 = AnimationUtils.lerp(f2, f3, f1);
    Matrix localMatrix = this.val$matrix;
    FloatingActionButtonImpl.access$300((FloatingActionButtonImpl)localObject, f1, localMatrix);
    paramValueAnimator = this.this$0.view;
    localObject = this.val$matrix;
    paramValueAnimator.setImageMatrix((Matrix)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4
 * JD-Core Version:    0.7.0.1
 */