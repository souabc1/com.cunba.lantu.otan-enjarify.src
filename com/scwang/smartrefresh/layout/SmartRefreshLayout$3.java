package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshInternal;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

class SmartRefreshLayout$3
  extends AnimatorListenerAdapter
{
  public SmartRefreshLayout$3(SmartRefreshLayout paramSmartRefreshLayout) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.o00OoOoo;
    long l = System.currentTimeMillis();
    paramAnimator.o00oo0O0 = l;
    paramAnimator = this.o00OoOoo;
    Object localObject1 = RefreshState.o00o00;
    paramAnimator.OooOoO0((RefreshState)localObject1);
    paramAnimator = this.o00OoOoo;
    localObject1 = paramAnimator.o00oo000;
    if (localObject1 != null)
    {
      ((OnRefreshListener)localObject1).OooOO0o(paramAnimator);
    }
    else
    {
      localObject1 = paramAnimator.o00oO00O;
      if (localObject1 == null)
      {
        int i = 3000;
        paramAnimator.OooOOOo(i);
      }
    }
    paramAnimator = this.o00OoOoo;
    localObject1 = paramAnimator.o00oOoO0;
    float f2;
    int k;
    if (localObject1 != null)
    {
      int j = paramAnimator.o00oOO;
      float f1 = paramAnimator.o00oOo00;
      f2 = j;
      f1 *= f2;
      k = (int)f1;
      ((RefreshInternal)localObject1).OooO0O0(paramAnimator, j, k);
    }
    paramAnimator = this.o00OoOoo;
    localObject1 = paramAnimator.o00oO00O;
    if (localObject1 != null)
    {
      Object localObject2 = paramAnimator.o00oOoO0;
      boolean bool = localObject2 instanceof RefreshHeader;
      if (bool)
      {
        ((OnRefreshListener)localObject1).OooOO0o(paramAnimator);
        paramAnimator = this.o00OoOoo;
        localObject1 = paramAnimator.o00oO00O;
        localObject2 = (RefreshHeader)paramAnimator.o00oOoO0;
        k = paramAnimator.o00oOO;
        float f3 = paramAnimator.o00oOo00;
        f2 = k;
        f3 *= f2;
        int m = (int)f3;
        ((OnMultiPurposeListener)localObject1).OooOOo0((RefreshHeader)localObject2, k, m);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.3
 * JD-Core Version:    0.7.0.1
 */