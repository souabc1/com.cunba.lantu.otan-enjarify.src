package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.core.view.ViewCompat;

class Fade$FadeAnimatorListener
  extends AnimatorListenerAdapter
{
  public final View o00OoOoo;
  public boolean o00Ooo00 = false;
  
  public Fade$FadeAnimatorListener(View paramView)
  {
    this.o00OoOoo = paramView;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    float f = 1.0F;
    ViewUtils.OooO0oo(paramAnimator, f);
    boolean bool = this.o00Ooo00;
    if (bool)
    {
      paramAnimator = this.o00OoOoo;
      f = 0.0F;
      paramAnimator.setLayerType(0, null);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    boolean bool = ViewCompat.OoooO0O(paramAnimator);
    if (bool)
    {
      paramAnimator = this.o00OoOoo;
      int i = paramAnimator.getLayerType();
      if (i == 0)
      {
        i = 1;
        this.o00Ooo00 = i;
        paramAnimator = this.o00OoOoo;
        int j = 2;
        paramAnimator.setLayerType(j, null);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.Fade.FadeAnimatorListener
 * JD-Core Version:    0.7.0.1
 */