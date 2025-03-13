package com.lzf.easyfloat.core;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.lzf.easyfloat.data.FloatConfig;

public final class TouchUtils$sideAnim$2
  implements Animator.AnimatorListener
{
  public TouchUtils$sideAnim$2(TouchUtils paramTouchUtils, View paramView) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    View localView = this.o00Ooo00;
    TouchUtils.OooO0O0(paramAnimator, localView);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    View localView = this.o00Ooo00;
    TouchUtils.OooO0O0(paramAnimator, localView);
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.o00OoOoo.getConfig().setAnim(true);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.core.TouchUtils.sideAnim.2
 * JD-Core Version:    0.7.0.1
 */