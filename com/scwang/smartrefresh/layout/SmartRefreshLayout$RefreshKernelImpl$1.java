package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.constant.RefreshState;

class SmartRefreshLayout$RefreshKernelImpl$1
  extends AnimatorListenerAdapter
{
  public SmartRefreshLayout$RefreshKernelImpl$1(SmartRefreshLayout.RefreshKernelImpl paramRefreshKernelImpl) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo.OooO00o.o00oOooo;
    RefreshState localRefreshState = RefreshState.o00o00Oo;
    paramAnimator.OooO00o(localRefreshState);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.RefreshKernelImpl.1
 * JD-Core Version:    0.7.0.1
 */