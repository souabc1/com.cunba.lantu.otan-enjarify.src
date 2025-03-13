package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

class ChangeBounds$10
  extends AnimatorListenerAdapter
{
  public ChangeBounds$10(ChangeBounds paramChangeBounds, ViewGroup paramViewGroup, BitmapDrawable paramBitmapDrawable, View paramView, float paramFloat) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = ViewUtils.OooO0O0(this.o00OoOoo);
    BitmapDrawable localBitmapDrawable = this.o00Ooo00;
    paramAnimator.remove(localBitmapDrawable);
    paramAnimator = this.o00Ooo0;
    float f = this.o00Ooo0O;
    ViewUtils.OooO0oo(paramAnimator, f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ChangeBounds.10
 * JD-Core Version:    0.7.0.1
 */