package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2
  extends AnimatorListenerAdapter
{
  public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2(WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener paramImpl21OnApplyWindowInsetsListener, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.o00OoOoo.setFraction(1.0F);
    paramAnimator = this.o00Ooo00;
    WindowInsetsAnimationCompat localWindowInsetsAnimationCompat = this.o00OoOoo;
    WindowInsetsAnimationCompat.Impl21.OooO0Oo(paramAnimator, localWindowInsetsAnimationCompat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
 * JD-Core Version:    0.7.0.1
 */