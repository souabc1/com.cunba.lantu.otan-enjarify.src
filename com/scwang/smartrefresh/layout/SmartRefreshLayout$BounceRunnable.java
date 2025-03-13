package com.scwang.smartrefresh.layout;

import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.util.DensityUtil;

public class SmartRefreshLayout$BounceRunnable
  implements Runnable
{
  public int o00OoOoo = 0;
  public int o00Ooo0;
  public int o00Ooo00 = 10;
  public long o00Ooo0O;
  public float o00Ooo0o = 0.0F;
  public float o00OooO0;
  
  public SmartRefreshLayout$BounceRunnable(SmartRefreshLayout paramSmartRefreshLayout, float paramFloat, int paramInt)
  {
    this.o00OooO0 = paramFloat;
    this.o00Ooo0 = paramInt;
    long l = AnimationUtils.currentAnimationTimeMillis();
    this.o00Ooo0O = l;
    l = this.o00Ooo00;
    paramSmartRefreshLayout.postDelayed(this, l);
  }
  
  public void run()
  {
    SmartRefreshLayout localSmartRefreshLayout = this.o00OooO;
    Object localObject = localSmartRefreshLayout.o00ooO00;
    if (localObject == this)
    {
      localObject = localSmartRefreshLayout.o00oo0;
      boolean bool1 = ((RefreshState)localObject).o00OooO0;
      if (!bool1)
      {
        int j = Math.abs(localSmartRefreshLayout.o00Ooo00);
        int i = Math.abs(this.o00Ooo0);
        double d1;
        int k;
        double d3;
        if (j >= i)
        {
          j = this.o00Ooo0;
          if (j != 0)
          {
            f1 = this.o00OooO0;
            d1 = f1;
            k = this.o00OoOoo + 1;
            this.o00OoOoo = k;
            k *= 2;
            d2 = k;
            d3 = 0.449999988079071D;
          }
          else
          {
            f1 = this.o00OooO0;
            d1 = f1;
            k = this.o00OoOoo + 1;
            this.o00OoOoo = k;
            k *= 2;
            d2 = k;
            d3 = 0.8500000238418579D;
          }
        }
        else
        {
          f1 = this.o00OooO0;
          d1 = f1;
          k = this.o00OoOoo + 1;
          this.o00OoOoo = k;
          k *= 2;
          d2 = k;
          d3 = 0.949999988079071D;
        }
        double d2 = Math.pow(d3, d2);
        d1 *= d2;
        float f1 = (float)d1;
        this.o00OooO0 = f1;
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        long l2 = this.o00Ooo0O;
        l2 = l1 - l2;
        float f2 = (float)l2;
        float f3 = 1.0F;
        f2 = f2 * f3 / 1000.0F;
        float f4 = this.o00OooO0 * f2;
        f2 = Math.abs(f4);
        boolean bool2 = f2 < f3;
        if (!bool2)
        {
          this.o00Ooo0O = l1;
          f1 = this.o00Ooo0o + f4;
          this.o00Ooo0o = f1;
          localObject = this.o00OooO;
          ((SmartRefreshLayout)localObject).OooOo(f1);
          localSmartRefreshLayout = this.o00OooO;
          i = this.o00Ooo00;
          long l3 = i;
          localSmartRefreshLayout.postDelayed(this, l3);
        }
        else
        {
          localSmartRefreshLayout = this.o00OooO;
          localObject = null;
          localSmartRefreshLayout.o00ooO00 = null;
          j = Math.abs(localSmartRefreshLayout.o00Ooo00);
          i = Math.abs(this.o00Ooo0);
          if (j >= i)
          {
            localSmartRefreshLayout = this.o00OooO;
            j = localSmartRefreshLayout.o00Ooo00;
            i = this.o00Ooo0;
            f1 = DensityUtil.OooO0OO(Math.abs(j - i));
            j = Math.max((int)f1, 30);
            i = 100;
            j = Math.min(j, i) * 10;
            localObject = this.o00OooO;
            int m = this.o00Ooo0;
            f3 = 0.0F;
            Interpolator localInterpolator = ((SmartRefreshLayout)localObject).o00o0;
            ((SmartRefreshLayout)localObject).OooOO0O(m, 0, localInterpolator, j);
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.BounceRunnable
 * JD-Core Version:    0.7.0.1
 */