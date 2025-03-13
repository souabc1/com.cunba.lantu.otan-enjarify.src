package com.scwang.smartrefresh.header;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.scwang.smartrefresh.layout.api.RefreshLayout;

class FlyRefreshHeader$3
  extends AnimatorListenerAdapter
{
  public FlyRefreshHeader$3(FlyRefreshHeader paramFlyRefreshHeader, AnimatorListenerAdapter paramAnimatorListenerAdapter) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object localObject = this.o00Ooo00.o00OooO;
    if (localObject != null)
    {
      boolean bool = true;
      ((RefreshLayout)localObject).OooO0Oo(bool);
    }
    localObject = this.o00OoOoo;
    if (localObject != null) {
      ((AnimatorListenerAdapter)localObject).onAnimationEnd(paramAnimator);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.o00Ooo00.o00Ooo0o;
    if (paramAnimator != null) {
      paramAnimator.setRotationY(0.0F);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.FlyRefreshHeader.3
 * JD-Core Version:    0.7.0.1
 */