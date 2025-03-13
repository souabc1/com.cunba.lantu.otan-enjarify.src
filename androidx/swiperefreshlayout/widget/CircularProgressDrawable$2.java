package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

class CircularProgressDrawable$2
  implements Animator.AnimatorListener
{
  public CircularProgressDrawable$2(CircularProgressDrawable paramCircularProgressDrawable, CircularProgressDrawable.Ring paramRing) {}
  
  public void onAnimationCancel(Animator paramAnimator) {}
  
  public void onAnimationEnd(Animator paramAnimator) {}
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    CircularProgressDrawable localCircularProgressDrawable = this.o00Ooo00;
    CircularProgressDrawable.Ring localRing = this.o00OoOoo;
    boolean bool1 = true;
    float f1 = 1.0F;
    localCircularProgressDrawable.OooO0O0(f1, localRing, bool1);
    this.o00OoOoo.OooO0o();
    this.o00OoOoo.OooO0OO();
    localCircularProgressDrawable = this.o00Ooo00;
    boolean bool2 = localCircularProgressDrawable.o00OooO0;
    if (bool2)
    {
      bool2 = false;
      localRing = null;
      localCircularProgressDrawable.o00OooO0 = false;
      paramAnimator.cancel();
      long l = 1332L;
      paramAnimator.setDuration(l);
      paramAnimator.start();
      paramAnimator = this.o00OoOoo;
      paramAnimator.setShowArrow(false);
    }
    else
    {
      float f2 = localCircularProgressDrawable.o00Ooo0o + f1;
      localCircularProgressDrawable.o00Ooo0o = f2;
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.o00Ooo00.o00Ooo0o = 0.0F;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
 * JD-Core Version:    0.7.0.1
 */