package com.scwang.smartrefresh.layout;

import android.view.MotionEvent;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshInternal;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;

class SmartRefreshLayout$7
  implements Runnable
{
  public SmartRefreshLayout$7(SmartRefreshLayout paramSmartRefreshLayout, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public void run()
  {
    7 local7 = this;
    SmartRefreshLayout localSmartRefreshLayout = this.o00Ooo0;
    Object localObject1 = localSmartRefreshLayout.o00oo0;
    Object localObject2 = RefreshState.o00o00O0;
    boolean bool1 = true;
    float f1 = 1.4E-45F;
    label223:
    int j;
    if (localObject1 == localObject2)
    {
      localObject1 = localSmartRefreshLayout.o00oOoO;
      if (localObject1 != null)
      {
        localObject1 = localSmartRefreshLayout.o00oOoOO;
        if (localObject1 != null)
        {
          localObject1 = RefreshState.o00o00o;
          localSmartRefreshLayout.OooOoO0((RefreshState)localObject1);
          localSmartRefreshLayout = this.o00Ooo0;
          localObject1 = localSmartRefreshLayout.o00oOoO;
          boolean bool3 = this.o00OoOoo;
          int k = ((RefreshInternal)localObject1).OooO(localSmartRefreshLayout, bool3);
          localObject1 = this.o00Ooo0;
          localObject2 = ((SmartRefreshLayout)localObject1).o00oO00O;
          boolean bool4;
          if (localObject2 != null)
          {
            localObject1 = ((SmartRefreshLayout)localObject1).o00oOoO;
            bool4 = localObject1 instanceof RefreshFooter;
            if (bool4)
            {
              localObject1 = (RefreshFooter)localObject1;
              bool4 = this.o00OoOoo;
              ((OnMultiPurposeListener)localObject2).OooOO0O((RefreshFooter)localObject1, bool4);
            }
          }
          int n = -1 >>> 1;
          if (k >= n) {
            return;
          }
          boolean bool5 = local7.o00Ooo00;
          bool3 = false;
          localObject2 = null;
          if (bool5)
          {
            localObject1 = local7.o00Ooo0;
            bool4 = ((SmartRefreshLayout)localObject1).o00o0Oo0;
            if (bool4)
            {
              m = ((SmartRefreshLayout)localObject1).o00Ooo00;
              if (m < 0)
              {
                localObject1 = ((SmartRefreshLayout)localObject1).o00oOoOO;
                bool5 = ((RefreshContent)localObject1).OooO0o0();
                if (bool5) {
                  break label223;
                }
              }
            }
          }
          bool1 = false;
          Object localObject3 = null;
          f1 = 0.0F;
          localObject1 = local7.o00Ooo0;
          int m = ((SmartRefreshLayout)localObject1).o00Ooo00;
          int i1;
          if (bool1)
          {
            i1 = -((SmartRefreshLayout)localObject1).o00oOOOO;
            i1 = Math.max(m, i1);
          }
          else
          {
            i1 = 0;
            localObject1 = null;
          }
          m -= i1;
          localObject1 = local7.o00Ooo0;
          bool1 = ((SmartRefreshLayout)localObject1).o00o000;
          if (!bool1)
          {
            boolean bool7 = ((SmartRefreshLayout)localObject1).o00oO0;
            if (!bool7) {}
          }
          else
          {
            if (bool1)
            {
              f1 = ((SmartRefreshLayout)localObject1).o00OoooO;
              ((SmartRefreshLayout)localObject1).o00OooOo = f1;
              ((SmartRefreshLayout)localObject1).o00o000 = false;
              int i = ((SmartRefreshLayout)localObject1).o00Ooo00 - m;
              ((SmartRefreshLayout)localObject1).o00Ooo0O = i;
            }
            long l1 = System.currentTimeMillis();
            localObject1 = local7.o00Ooo0;
            float f2 = ((SmartRefreshLayout)localObject1).o0O00o0;
            f1 = ((SmartRefreshLayout)localObject1).o00OoooO;
            float f3 = m;
            f1 += f3;
            int i2 = ((SmartRefreshLayout)localObject1).o00OoOoo * 2;
            float f4 = i2;
            float f5 = f1 + f4;
            localObject3 = MotionEvent.obtain(l1, l1, 0, f2, f5, 0);
            SmartRefreshLayout.OooO((SmartRefreshLayout)localObject1, (MotionEvent)localObject3);
            localObject1 = local7.o00Ooo0;
            int i3 = 2;
            f2 = ((SmartRefreshLayout)localObject1).o0O00o0;
            f1 = ((SmartRefreshLayout)localObject1).o00OoooO;
            f5 = f1 + f3;
            f3 = 0.0F;
            localObject3 = MotionEvent.obtain(l1, l1, i3, f2, f5, 0);
            SmartRefreshLayout.OooOO0((SmartRefreshLayout)localObject1, (MotionEvent)localObject3);
            localObject1 = local7.o00Ooo0;
            boolean bool2 = ((SmartRefreshLayout)localObject1).o00oO0;
            if (bool2) {
              ((SmartRefreshLayout)localObject1).o00oOo = 0;
            }
          }
          localObject1 = local7.o00Ooo0;
          localObject2 = new com/scwang/smartrefresh/layout/SmartRefreshLayout$7$1;
          ((SmartRefreshLayout.7.1)localObject2).<init>(local7, m);
          localObject3 = local7.o00Ooo0;
          j = ((SmartRefreshLayout)localObject3).o00Ooo00;
          long l2;
          if (j < 0) {
            l2 = k;
          } else {
            l2 = 0L;
          }
          ((SmartRefreshLayout)localObject1).postDelayed((Runnable)localObject2, l2);
          return;
        }
      }
    }
    boolean bool6 = local7.o00Ooo00;
    if (bool6) {
      localSmartRefreshLayout.Oooo00O(j);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.7
 * JD-Core Version:    0.7.0.1
 */