package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public class ScrollingTabContainerView$VisibilityAnimListener
  extends AnimatorListenerAdapter
{
  public boolean o00OoOoo = false;
  public int o00Ooo00;
  
  public ScrollingTabContainerView$VisibilityAnimListener(ScrollingTabContainerView paramScrollingTabContainerView) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.o00OoOoo = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool = this.o00OoOoo;
    if (bool) {
      return;
    }
    paramAnimator = this.o00Ooo0;
    paramAnimator.o0O00o0 = null;
    int i = this.o00Ooo00;
    paramAnimator.setVisibility(i);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.o00Ooo0.setVisibility(0);
    this.o00OoOoo = false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener
 * JD-Core Version:    0.7.0.1
 */