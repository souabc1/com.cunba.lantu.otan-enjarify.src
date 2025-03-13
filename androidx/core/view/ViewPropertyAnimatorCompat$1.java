package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class ViewPropertyAnimatorCompat$1
  extends AnimatorListenerAdapter
{
  public ViewPropertyAnimatorCompat$1(ViewPropertyAnimatorCompat paramViewPropertyAnimatorCompat, ViewPropertyAnimatorListener paramViewPropertyAnimatorListener, View paramView) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    View localView = this.o00Ooo00;
    paramAnimator.OooO00o(localView);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    View localView = this.o00Ooo00;
    paramAnimator.OooO0O0(localView);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    View localView = this.o00Ooo00;
    paramAnimator.OooO0OO(localView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewPropertyAnimatorCompat.1
 * JD-Core Version:    0.7.0.1
 */