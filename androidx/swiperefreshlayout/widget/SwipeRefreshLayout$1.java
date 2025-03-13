package androidx.swiperefreshlayout.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class SwipeRefreshLayout$1
  implements Animation.AnimationListener
{
  public SwipeRefreshLayout$1(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = this.OooO00o;
    boolean bool = paramAnimation.o00Ooo0;
    if (bool)
    {
      paramAnimation.o00o0OO0.setAlpha(255);
      this.OooO00o.o00o0OO0.start();
      paramAnimation = this.OooO00o;
      bool = paramAnimation.o00o0OoO;
      if (bool)
      {
        paramAnimation = paramAnimation.o00Ooo00;
        if (paramAnimation != null) {
          paramAnimation.OooO00o();
        }
      }
      paramAnimation = this.OooO00o;
      CircleImageView localCircleImageView = paramAnimation.o00o00o;
      int i = localCircleImageView.getTop();
      paramAnimation.o00o000 = i;
    }
    else
    {
      paramAnimation.OooOO0o();
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.1
 * JD-Core Version:    0.7.0.1
 */