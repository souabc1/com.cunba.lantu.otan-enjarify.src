package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.constant.RefreshState;

class SmartRefreshLayout$8$2
  extends AnimatorListenerAdapter
{
  public SmartRefreshLayout$8$2(SmartRefreshLayout.8 param8) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    Object localObject = paramAnimator.o00Ooo0O;
    RefreshState localRefreshState = null;
    ((SmartRefreshLayout)localObject).o00ooO0 = null;
    boolean bool = paramAnimator.o00Ooo0;
    if (bool)
    {
      paramAnimator = ((SmartRefreshLayout)localObject).o00oo0;
      localRefreshState = RefreshState.o00Ooooo;
      if (paramAnimator == localRefreshState)
      {
        paramAnimator = ((SmartRefreshLayout)localObject).o00oOooo;
        localObject = RefreshState.o00OooOO;
        paramAnimator.OooO00o((RefreshState)localObject);
      }
    }
    else
    {
      paramAnimator = ((SmartRefreshLayout)localObject).o00oo0;
      localRefreshState = RefreshState.o00Ooooo;
      if (paramAnimator != localRefreshState)
      {
        paramAnimator = ((SmartRefreshLayout)localObject).o00oOooo;
        paramAnimator.OooO00o(localRefreshState);
      }
    }
    this.o00OoOoo.o00Ooo0O.OooOoO();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo.o00Ooo0O;
    float f = paramAnimator.getMeasuredWidth() / 2;
    paramAnimator.o0O00o0 = f;
    paramAnimator = this.o00OoOoo.o00Ooo0O.o00oOooo;
    RefreshState localRefreshState = RefreshState.o00OooOO;
    paramAnimator.OooO00o(localRefreshState);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.8.2
 * JD-Core Version:    0.7.0.1
 */