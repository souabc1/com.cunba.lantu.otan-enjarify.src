package com.lzf.easyfloat.core;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.lzf.easyfloat.data.FloatConfig;

public final class FloatingWindowHelper$enterAnim$1$1
  implements Animator.AnimatorListener
{
  public FloatingWindowHelper$enterAnim$1$1(FloatingWindowHelper paramFloatingWindowHelper, View paramView) {}
  
  public void onAnimationCancel(Animator paramAnimator) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo.getConfig();
    int i = 0;
    paramAnimator.setAnim(false);
    paramAnimator = this.o00OoOoo.getConfig();
    boolean bool = paramAnimator.getImmersionStatusBar();
    if (!bool)
    {
      paramAnimator = this.o00OoOoo.getParams();
      i = 40;
      paramAnimator.flags = i;
    }
    FloatingWindowHelper.OooO0o0(this.o00OoOoo);
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.o00Ooo00.setVisibility(0);
    this.o00OoOoo.getConfig().setAnim(true);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.core.FloatingWindowHelper.enterAnim.1.1
 * JD-Core Version:    0.7.0.1
 */