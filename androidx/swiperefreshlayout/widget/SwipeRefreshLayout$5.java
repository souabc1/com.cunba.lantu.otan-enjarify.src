package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class SwipeRefreshLayout$5
  implements Animation.AnimationListener
{
  public SwipeRefreshLayout$5(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = this.OooO00o;
    boolean bool = paramAnimation.o00o00O0;
    if (!bool)
    {
      bool = false;
      paramAnimation.OooOOo(null);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.5
 * JD-Core Version:    0.7.0.1
 */