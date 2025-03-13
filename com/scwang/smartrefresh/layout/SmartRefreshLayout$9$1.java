package com.scwang.smartrefresh.layout;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.scwang.smartrefresh.layout.api.RefreshKernel;

class SmartRefreshLayout$9$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public SmartRefreshLayout$9$1(SmartRefreshLayout.9 param9) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    RefreshKernel localRefreshKernel = this.o00OoOoo.o00Ooo0O.o00oOooo;
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    localRefreshKernel.OooO0oo(i, true);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.9.1
 * JD-Core Version:    0.7.0.1
 */