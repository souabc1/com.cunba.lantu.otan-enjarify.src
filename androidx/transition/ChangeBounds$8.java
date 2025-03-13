package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;

class ChangeBounds$8
  extends AnimatorListenerAdapter
{
  public boolean o00OoOoo;
  
  public ChangeBounds$8(ChangeBounds paramChangeBounds, View paramView, Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.o00OoOoo = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool = this.o00OoOoo;
    if (!bool)
    {
      paramAnimator = this.o00Ooo00;
      Rect localRect = this.o00Ooo0;
      ViewCompat.o0OO00O(paramAnimator, localRect);
      paramAnimator = this.o00Ooo00;
      int i = this.o00Ooo0O;
      int j = this.o00Ooo0o;
      int k = this.o00OooO0;
      int m = this.o00OooO;
      ViewUtils.OooO0oO(paramAnimator, i, j, k, m);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ChangeBounds.8
 * JD-Core Version:    0.7.0.1
 */