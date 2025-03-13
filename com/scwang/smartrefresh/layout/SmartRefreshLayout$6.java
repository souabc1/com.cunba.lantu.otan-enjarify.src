package com.scwang.smartrefresh.layout;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshInternal;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;

class SmartRefreshLayout$6
  implements Runnable
{
  public SmartRefreshLayout$6(SmartRefreshLayout paramSmartRefreshLayout, boolean paramBoolean) {}
  
  public void run()
  {
    Object localObject1 = this.o00Ooo00;
    Object localObject2 = ((SmartRefreshLayout)localObject1).o00oo0;
    Object localObject3 = RefreshState.o00o00;
    if (localObject2 == localObject3)
    {
      localObject2 = ((SmartRefreshLayout)localObject1).o00oOoO0;
      if (localObject2 != null)
      {
        localObject2 = ((SmartRefreshLayout)localObject1).o00oOoOO;
        if (localObject2 != null)
        {
          localObject2 = RefreshState.o00o00o0;
          ((SmartRefreshLayout)localObject1).OooOoO0((RefreshState)localObject2);
          localObject1 = this.o00Ooo00;
          localObject2 = ((SmartRefreshLayout)localObject1).o00oOoO0;
          boolean bool1 = this.o00OoOoo;
          int j = ((RefreshInternal)localObject2).OooO((RefreshLayout)localObject1, bool1);
          localObject2 = this.o00Ooo00;
          localObject3 = ((SmartRefreshLayout)localObject2).o00oO00O;
          boolean bool3;
          if (localObject3 != null)
          {
            localObject2 = ((SmartRefreshLayout)localObject2).o00oOoO0;
            bool3 = localObject2 instanceof RefreshHeader;
            if (bool3)
            {
              localObject2 = (RefreshHeader)localObject2;
              bool3 = this.o00OoOoo;
              ((OnMultiPurposeListener)localObject3).OooOOO((RefreshHeader)localObject2, bool3);
            }
          }
          int k = -1 >>> 1;
          if (j < k)
          {
            localObject2 = this.o00Ooo00;
            bool1 = ((SmartRefreshLayout)localObject2).o00o000;
            bool3 = false;
            if (!bool1)
            {
              boolean bool4 = ((SmartRefreshLayout)localObject2).o00oO0;
              if (!bool4) {}
            }
            else
            {
              if (bool1)
              {
                float f1 = ((SmartRefreshLayout)localObject2).o00OoooO;
                ((SmartRefreshLayout)localObject2).o00OooOo = f1;
                ((SmartRefreshLayout)localObject2).o00Ooo0O = 0;
                ((SmartRefreshLayout)localObject2).o00o000 = false;
              }
              long l = System.currentTimeMillis();
              SmartRefreshLayout localSmartRefreshLayout = this.o00Ooo00;
              float f2 = localSmartRefreshLayout.o0O00o0;
              float f3 = localSmartRefreshLayout.o00OoooO;
              float f4 = localSmartRefreshLayout.o00Ooo00;
              f3 += f4;
              f4 = localSmartRefreshLayout.o00OoOoo * 2;
              float f5 = f3 - f4;
              MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, f2, f5, 0);
              SmartRefreshLayout.OooO0oO(localSmartRefreshLayout, localMotionEvent);
              localSmartRefreshLayout = this.o00Ooo00;
              int n = 2;
              f2 = localSmartRefreshLayout.o0O00o0;
              f3 = localSmartRefreshLayout.o00OoooO;
              int i1 = localSmartRefreshLayout.o00Ooo00;
              f4 = i1;
              f5 = f3 + f4;
              localObject2 = MotionEvent.obtain(l, l, n, f2, f5, 0);
              SmartRefreshLayout.OooO0oo(localSmartRefreshLayout, (MotionEvent)localObject2);
              localObject2 = this.o00Ooo00;
              bool1 = ((SmartRefreshLayout)localObject2).o00oO0;
              if (bool1) {
                ((SmartRefreshLayout)localObject2).o00oOo = 0;
              }
            }
            localObject2 = this.o00Ooo00;
            int i = ((SmartRefreshLayout)localObject2).o00Ooo00;
            int m;
            boolean bool2;
            if (i > 0)
            {
              localObject3 = ((SmartRefreshLayout)localObject2).o00o0;
              m = ((SmartRefreshLayout)localObject2).o00OooO0;
              localObject1 = ((SmartRefreshLayout)localObject2).OooOO0O(0, j, (Interpolator)localObject3, m);
              localObject2 = this.o00Ooo00;
              bool2 = ((SmartRefreshLayout)localObject2).o00o0o;
              if (bool2)
              {
                localObject3 = ((SmartRefreshLayout)localObject2).o00oOoOO;
                k = ((SmartRefreshLayout)localObject2).o00Ooo00;
                localObject2 = ((RefreshContent)localObject3).OooO0Oo(k);
              }
              else
              {
                k = 0;
                localObject2 = null;
              }
              if ((localObject1 != null) && (localObject2 != null)) {
                ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
              }
            }
            else if (bool2)
            {
              localObject3 = ((SmartRefreshLayout)localObject2).o00o0;
              m = ((SmartRefreshLayout)localObject2).o00OooO0;
              ((SmartRefreshLayout)localObject2).OooOO0O(0, j, (Interpolator)localObject3, m);
            }
            else
            {
              ((SmartRefreshLayout)localObject2).o00oOooo.OooO0oo(0, false);
              localObject1 = this.o00Ooo00;
              ((SmartRefreshLayout)localObject1).OooOoo0();
            }
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.6
 * JD-Core Version:    0.7.0.1
 */