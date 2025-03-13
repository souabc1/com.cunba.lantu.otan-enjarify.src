package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.constant.RefreshState;

class SmartRefreshLayout$7$1$1
  extends AnimatorListenerAdapter
{
  public SmartRefreshLayout$7$1$1(SmartRefreshLayout.7.1 param1) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    super.onAnimationEnd(paramAnimator);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo.o00Ooo00;
    Object localObject = paramAnimator.o00Ooo0;
    RefreshState localRefreshState = null;
    ((SmartRefreshLayout)localObject).o00oo0oO = false;
    boolean bool = paramAnimator.o00Ooo00;
    if (bool)
    {
      bool = true;
      ((SmartRefreshLayout)localObject).Oooo00O(bool);
    }
    paramAnimator = this.o00OoOoo.o00Ooo00.o00Ooo0;
    localObject = paramAnimator.o00oo0;
    localRefreshState = RefreshState.o00o00o;
    if (localObject == localRefreshState)
    {
      localObject = RefreshState.o00OooO;
      paramAnimator.OooOoO0((RefreshState)localObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.7.1.1
 * JD-Core Version:    0.7.0.1
 */