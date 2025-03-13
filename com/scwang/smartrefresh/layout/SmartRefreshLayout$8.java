package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.DecelerateInterpolator;

class SmartRefreshLayout$8
  implements Runnable
{
  public void run()
  {
    Object localObject1 = this.o00Ooo0O;
    int i = ((SmartRefreshLayout)localObject1).o00Ooo00;
    float f1 = ((SmartRefreshLayout)localObject1).o00oOO;
    float f2 = this.o00OoOoo;
    int j = (int)(f1 * f2);
    Object localObject2 = ValueAnimator.ofInt(new int[] { i, j });
    ((SmartRefreshLayout)localObject1).o00ooO0 = ((ValueAnimator)localObject2);
    localObject1 = this.o00Ooo0O.o00ooO0;
    long l = this.o00Ooo00;
    ((ValueAnimator)localObject1).setDuration(l);
    localObject1 = this.o00Ooo0O.o00ooO0;
    localObject2 = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject2).<init>();
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    localObject1 = this.o00Ooo0O.o00ooO0;
    localObject2 = new com/scwang/smartrefresh/layout/SmartRefreshLayout$8$1;
    ((SmartRefreshLayout.8.1)localObject2).<init>(this);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    localObject1 = this.o00Ooo0O.o00ooO0;
    localObject2 = new com/scwang/smartrefresh/layout/SmartRefreshLayout$8$2;
    ((SmartRefreshLayout.8.2)localObject2).<init>(this);
    ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
    this.o00Ooo0O.o00ooO0.start();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.8
 * JD-Core Version:    0.7.0.1
 */