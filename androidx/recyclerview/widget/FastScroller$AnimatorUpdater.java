package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;

class FastScroller$AnimatorUpdater
  implements ValueAnimator.AnimatorUpdateListener
{
  public FastScroller$AnimatorUpdater(FastScroller paramFastScroller) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = (int)(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
    this.o00OoOoo.OooO0OO.setAlpha(i);
    this.o00OoOoo.OooO0Oo.setAlpha(i);
    this.o00OoOoo.OooOOOO();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.FastScroller.AnimatorUpdater
 * JD-Core Version:    0.7.0.1
 */