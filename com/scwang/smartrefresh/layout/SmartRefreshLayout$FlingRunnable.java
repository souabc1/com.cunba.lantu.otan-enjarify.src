package com.scwang.smartrefresh.layout;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.util.SmartUtil;

public class SmartRefreshLayout$FlingRunnable
  implements Runnable
{
  public int o00OoOoo;
  public int o00Ooo0 = 10;
  public int o00Ooo00 = 0;
  public float o00Ooo0O;
  public float o00Ooo0o = 0.98F;
  public long o00OooO;
  public long o00OooO0 = 0L;
  
  public SmartRefreshLayout$FlingRunnable(SmartRefreshLayout paramSmartRefreshLayout, float paramFloat)
  {
    long l = AnimationUtils.currentAnimationTimeMillis();
    this.o00OooO = l;
    this.o00Ooo0O = paramFloat;
    int i = paramSmartRefreshLayout.o00Ooo00;
    this.o00OoOoo = i;
  }
  
  public Runnable OooO00o()
  {
    SmartRefreshLayout localSmartRefreshLayout = this.o00OooOO;
    RefreshState localRefreshState1 = localSmartRefreshLayout.o00oo0;
    boolean bool1 = localRefreshState1.o00OooO0;
    if (bool1) {
      return null;
    }
    int i = localSmartRefreshLayout.o00Ooo00;
    if (i != 0)
    {
      boolean bool3 = localRefreshState1.o00Ooo0o;
      boolean bool4;
      int j;
      if (!bool3)
      {
        bool3 = localSmartRefreshLayout.o00o0oOo;
        if (bool3)
        {
          bool3 = localSmartRefreshLayout.o00o0Oo0;
          if (bool3)
          {
            bool3 = localSmartRefreshLayout.o00o0O0O;
            bool4 = localSmartRefreshLayout.OooOo0O(bool3);
            if (!bool4) {}
          }
        }
      }
      else
      {
        localSmartRefreshLayout = this.o00OooOO;
        localRefreshState1 = localSmartRefreshLayout.o00oo0;
        localRefreshState2 = RefreshState.o00o00O0;
        if (localRefreshState1 != localRefreshState2)
        {
          bool3 = localSmartRefreshLayout.o00o0oOo;
          if (bool3)
          {
            bool3 = localSmartRefreshLayout.o00o0Oo0;
            if (bool3)
            {
              bool3 = localSmartRefreshLayout.o00o0O0O;
              bool4 = localSmartRefreshLayout.OooOo0O(bool3);
              if (!bool4) {}
            }
          }
        }
        else
        {
          localSmartRefreshLayout = this.o00OooOO;
          j = localSmartRefreshLayout.o00Ooo00;
          k = -localSmartRefreshLayout.o00oOOOO;
          if (j < k) {
            break label209;
          }
        }
        localSmartRefreshLayout = this.o00OooOO;
        localRefreshState1 = localSmartRefreshLayout.o00oo0;
        localRefreshState2 = RefreshState.o00o00;
        if (localRefreshState1 != localRefreshState2) {
          break label428;
        }
        j = localSmartRefreshLayout.o00Ooo00;
        k = localSmartRefreshLayout.o00oOO;
        if (j <= k) {
          break label428;
        }
      }
      label209:
      localSmartRefreshLayout = this.o00OooOO;
      int k = localSmartRefreshLayout.o00Ooo00;
      float f1 = this.o00Ooo0O;
      i = 0;
      RefreshState localRefreshState2 = null;
      float f5;
      for (int m = k;; m = (int)f5)
      {
        int n = k * m;
        if (n <= 0) {
          break;
        }
        double d1 = f1;
        double d2 = this.o00Ooo0o;
        i += 1;
        j = this.o00Ooo0 * i / 10;
        double d3 = j;
        d2 = Math.pow(d2, d3);
        d1 *= d2;
        f1 = (float)d1;
        n = this.o00Ooo0;
        float f2 = n;
        float f3 = 1.0F;
        f2 = f2 * f3 / 1000.0F * f1;
        float f4 = Math.abs(f2);
        boolean bool5 = f4 < f3;
        if (bool5)
        {
          localSmartRefreshLayout = this.o00OooOO;
          localRefreshState1 = localSmartRefreshLayout.o00oo0;
          boolean bool2 = localRefreshState1.o00Ooo0o;
          if (bool2)
          {
            localRefreshState2 = RefreshState.o00o00;
            if (localRefreshState1 == localRefreshState2)
            {
              n = localSmartRefreshLayout.o00oOO;
              if (m > n) {}
            }
            else
            {
              if (localRefreshState1 == localRefreshState2) {
                break;
              }
              k = -localSmartRefreshLayout.o00oOOOO;
              if (m >= k) {
                break;
              }
            }
          }
          return null;
        }
        f5 = m + f2;
      }
    }
    label428:
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    this.o00OooO0 = l1;
    localSmartRefreshLayout = this.o00OooOO;
    long l2 = this.o00Ooo0;
    localSmartRefreshLayout.postDelayed(this, l2);
    return this;
  }
  
  public void run()
  {
    Object localObject1 = this.o00OooOO;
    Object localObject2 = ((SmartRefreshLayout)localObject1).o00ooO00;
    if (localObject2 == this)
    {
      localObject1 = ((SmartRefreshLayout)localObject1).o00oo0;
      boolean bool1 = ((RefreshState)localObject1).o00OooO0;
      if (!bool1)
      {
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        long l2 = this.o00OooO;
        l2 = l1 - l2;
        double d1 = this.o00Ooo0O;
        float f1 = this.o00Ooo0o;
        double d2 = f1;
        long l3 = this.o00OooO0;
        l3 = l1 - l3;
        int j = this.o00Ooo0;
        int k = 1000 / j;
        long l4 = k;
        l3 /= l4;
        double d3 = l3;
        d2 = Math.pow(d2, d3);
        d1 *= d2;
        float f2 = (float)d1;
        this.o00Ooo0O = f2;
        float f3 = (float)l2;
        float f4 = 1.0F;
        f3 *= f4;
        int m = 1148846080;
        float f5 = 1000.0F;
        f3 /= f5;
        f2 *= f3;
        f3 = Math.abs(f2);
        boolean bool2 = f3 < f4;
        f4 = 0.0F;
        if (bool2)
        {
          this.o00OooO = l1;
          float f6 = this.o00OoOoo + f2;
          int i = (int)f6;
          this.o00OoOoo = i;
          localObject2 = this.o00OooOO;
          int n = ((SmartRefreshLayout)localObject2).o00Ooo00 * i;
          m = 1;
          f5 = 1.4E-45F;
          int i1;
          if (n > 0)
          {
            localObject2 = ((SmartRefreshLayout)localObject2).o00oOooo;
            ((RefreshKernel)localObject2).OooO0oo(i, m);
            localObject1 = this.o00OooOO;
            i1 = this.o00Ooo0;
            long l5 = i1;
            ((SmartRefreshLayout)localObject1).postDelayed(this, l5);
          }
          else
          {
            ((SmartRefreshLayout)localObject2).o00ooO00 = null;
            localObject1 = ((SmartRefreshLayout)localObject2).o00oOooo;
            i1 = 0;
            localObject2 = null;
            ((RefreshKernel)localObject1).OooO0oo(0, m);
            localObject1 = this.o00OooOO.o00oOoOO.getScrollableView();
            f3 = -this.o00Ooo0O;
            n = (int)f3;
            SmartUtil.OooO00o((View)localObject1, n);
            localObject1 = this.o00OooOO;
            boolean bool3 = ((SmartRefreshLayout)localObject1).o00oo0oO;
            if (bool3)
            {
              f3 = 0.0F;
              bool3 = f2 < 0.0F;
              if (bool3) {
                ((SmartRefreshLayout)localObject1).o00oo0oO = false;
              }
            }
          }
        }
        else
        {
          localObject1 = this.o00OooOO;
          ((SmartRefreshLayout)localObject1).o00ooO00 = null;
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.FlingRunnable
 * JD-Core Version:    0.7.0.1
 */