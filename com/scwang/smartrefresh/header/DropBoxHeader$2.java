package com.scwang.smartrefresh.header;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.scwang.smartrefresh.layout.constant.RefreshState;

class DropBoxHeader$2
  extends AnimatorListenerAdapter
{
  public DropBoxHeader$2(DropBoxHeader paramDropBoxHeader) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    RefreshState localRefreshState1 = paramAnimator.oo00oO;
    RefreshState localRefreshState2 = RefreshState.o00o00;
    if (localRefreshState1 == localRefreshState2)
    {
      paramAnimator = paramAnimator.o00o000o;
      if (paramAnimator != null) {
        paramAnimator.start();
      }
    }
    else
    {
      localRefreshState1 = null;
      paramAnimator.o00o0000 = 0.0F;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.DropBoxHeader.2
 * JD-Core Version:    0.7.0.1
 */