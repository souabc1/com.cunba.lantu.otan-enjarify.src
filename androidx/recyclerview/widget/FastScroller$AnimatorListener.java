package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

class FastScroller$AnimatorListener
  extends AnimatorListenerAdapter
{
  public boolean o00OoOoo = false;
  
  public FastScroller$AnimatorListener(FastScroller paramFastScroller) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.o00OoOoo = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool = this.o00OoOoo;
    int i = 0;
    if (bool)
    {
      this.o00OoOoo = false;
      return;
    }
    paramAnimator = (Float)this.o00Ooo00.OooOoO.getAnimatedValue();
    float f = paramAnimator.floatValue();
    bool = f < 0.0F;
    if (!bool)
    {
      paramAnimator = this.o00Ooo00;
      paramAnimator.OooOoOO = 0;
      paramAnimator.setState(0);
    }
    else
    {
      paramAnimator = this.o00Ooo00;
      i = 2;
      paramAnimator.OooOoOO = i;
      paramAnimator.OooOOOO();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.FastScroller.AnimatorListener
 * JD-Core Version:    0.7.0.1
 */