package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.constant.RefreshState;

class SmartRefreshLayout$4
  extends AnimatorListenerAdapter
{
  public SmartRefreshLayout$4(SmartRefreshLayout paramSmartRefreshLayout) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    super.onAnimationEnd(paramAnimator);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    RefreshState localRefreshState1 = null;
    paramAnimator.o00ooO0 = null;
    int i = paramAnimator.o00Ooo00;
    RefreshState localRefreshState2;
    if (i == 0)
    {
      localRefreshState1 = paramAnimator.o00oo0;
      localRefreshState2 = RefreshState.o00OooO;
      if (localRefreshState1 != localRefreshState2)
      {
        boolean bool = localRefreshState1.o00Ooo0o;
        if (!bool) {
          paramAnimator.OooOoO0(localRefreshState2);
        }
      }
    }
    else
    {
      localRefreshState1 = paramAnimator.o00oo0;
      localRefreshState2 = paramAnimator.o00oo0OO;
      if (localRefreshState1 != localRefreshState2) {
        paramAnimator.setViceState(localRefreshState1);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.4
 * JD-Core Version:    0.7.0.1
 */