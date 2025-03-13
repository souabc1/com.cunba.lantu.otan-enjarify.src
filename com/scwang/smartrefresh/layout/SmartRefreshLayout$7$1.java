package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.constant.RefreshState;

class SmartRefreshLayout$7$1
  implements Runnable
{
  public SmartRefreshLayout$7$1(SmartRefreshLayout.7 param7, int paramInt) {}
  
  public void run()
  {
    Object localObject1 = this.o00Ooo00.o00Ooo0;
    boolean bool1 = ((SmartRefreshLayout)localObject1).o00o0o0o;
    if (bool1)
    {
      i = this.o00OoOoo;
      if (i < 0)
      {
        localObject2 = ((SmartRefreshLayout)localObject1).o00oOoOO;
        j = ((SmartRefreshLayout)localObject1).o00Ooo00;
        localObject1 = ((RefreshContent)localObject2).OooO0Oo(j);
        break label54;
      }
    }
    int j = 0;
    localObject1 = null;
    label54:
    int i = 0;
    Object localObject2 = null;
    if (localObject1 != null)
    {
      localObject3 = ValueAnimator.ofInt(new int[] { 0, 0 });
      ((ValueAnimator.AnimatorUpdateListener)localObject1).onAnimationUpdate((ValueAnimator)localObject3);
    }
    Object localObject3 = new com/scwang/smartrefresh/layout/SmartRefreshLayout$7$1$1;
    ((SmartRefreshLayout.7.1.1)localObject3).<init>(this);
    SmartRefreshLayout.7 local7 = this.o00Ooo00;
    SmartRefreshLayout localSmartRefreshLayout = local7.o00Ooo0;
    int m = localSmartRefreshLayout.o00Ooo00;
    if (m > 0) {}
    boolean bool2;
    do
    {
      do
      {
        localObject1 = localSmartRefreshLayout.o00oOooo.OooO0Oo(0);
        break label288;
        if ((localObject1 != null) || (m == 0)) {
          break;
        }
        bool2 = local7.o00Ooo00;
      } while (!bool2);
      bool2 = localSmartRefreshLayout.o00o0Oo0;
    } while (!bool2);
    int k = localSmartRefreshLayout.o00oOOOO;
    i = -k;
    if (m >= i)
    {
      localObject1 = RefreshState.o00OooO;
      localSmartRefreshLayout.OooOoO0((RefreshState)localObject1);
    }
    else
    {
      localObject2 = localSmartRefreshLayout.o00oOooo;
      k = -k;
      localObject1 = ((RefreshKernel)localObject2).OooO0Oo(k);
      break label288;
      localObject1 = localSmartRefreshLayout.o00ooO0;
      if (localObject1 != null)
      {
        ((ValueAnimator)localObject1).cancel();
        localObject1 = this.o00Ooo00.o00Ooo0;
        ((SmartRefreshLayout)localObject1).o00ooO0 = null;
      }
      this.o00Ooo00.o00Ooo0.o00oOooo.OooO0oo(0, false);
      localObject1 = this.o00Ooo00.o00Ooo0;
      ((SmartRefreshLayout)localObject1).OooOoo0();
    }
    k = 0;
    localObject1 = null;
    label288:
    if (localObject1 != null) {
      ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject3);
    } else {
      ((AnimatorListenerAdapter)localObject3).onAnimationEnd(null);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.7.1
 * JD-Core Version:    0.7.0.1
 */