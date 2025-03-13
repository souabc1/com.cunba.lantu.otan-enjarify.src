package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class Transition$3
  extends AnimatorListenerAdapter
{
  public Transition$3(Transition paramTransition) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.o00OoOoo.end();
    paramAnimator.removeListener(this);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.Transition.3
 * JD-Core Version:    0.7.0.1
 */