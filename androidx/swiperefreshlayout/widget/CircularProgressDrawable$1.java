package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;

class CircularProgressDrawable$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public CircularProgressDrawable$1(CircularProgressDrawable paramCircularProgressDrawable, CircularProgressDrawable.Ring paramRing) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    CircularProgressDrawable localCircularProgressDrawable = this.o00Ooo00;
    CircularProgressDrawable.Ring localRing = this.o00OoOoo;
    localCircularProgressDrawable.OooO0oO(f, localRing);
    localCircularProgressDrawable = this.o00Ooo00;
    localRing = this.o00OoOoo;
    localCircularProgressDrawable.OooO0O0(f, localRing, false);
    this.o00Ooo00.invalidateSelf();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
 * JD-Core Version:    0.7.0.1
 */