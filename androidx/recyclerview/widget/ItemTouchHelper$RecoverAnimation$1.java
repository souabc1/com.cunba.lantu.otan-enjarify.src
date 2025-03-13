package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class ItemTouchHelper$RecoverAnimation$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public ItemTouchHelper$RecoverAnimation$1(ItemTouchHelper.RecoverAnimation paramRecoverAnimation) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    ItemTouchHelper.RecoverAnimation localRecoverAnimation = this.o00OoOoo;
    float f = paramValueAnimator.getAnimatedFraction();
    localRecoverAnimation.setFraction(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.1
 * JD-Core Version:    0.7.0.1
 */