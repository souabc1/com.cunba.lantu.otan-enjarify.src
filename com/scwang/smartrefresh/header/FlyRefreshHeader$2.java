package com.scwang.smartrefresh.header;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class FlyRefreshHeader$2
  extends AnimatorListenerAdapter
{
  public FlyRefreshHeader$2(FlyRefreshHeader paramFlyRefreshHeader) {}
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo.o00Ooo0o;
    if (paramAnimator != null)
    {
      float f = 180.0F;
      paramAnimator.setRotationY(f);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.FlyRefreshHeader.2
 * JD-Core Version:    0.7.0.1
 */