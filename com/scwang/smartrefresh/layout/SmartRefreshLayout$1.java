package com.scwang.smartrefresh.layout;

import android.view.View;
import androidx.core.view.NestedScrollingParent;

class SmartRefreshLayout$1
  implements Runnable
{
  public SmartRefreshLayout$1(SmartRefreshLayout paramSmartRefreshLayout) {}
  
  public void run()
  {
    for (Object localObject1 = this.o00OoOoo;; localObject1 = (View)localObject1)
    {
      localObject1 = ((View)localObject1).getParent();
      if (localObject1 == null) {
        break;
      }
      boolean bool = localObject1 instanceof NestedScrollingParent;
      if (bool)
      {
        SmartRefreshLayout localSmartRefreshLayout = this.o00OoOoo;
        Object localObject2 = localObject1;
        localObject2 = (NestedScrollingParent)localObject1;
        int i = 2;
        bool = ((NestedScrollingParent)localObject2).onStartNestedScroll(localSmartRefreshLayout, localSmartRefreshLayout, i);
        if (bool)
        {
          this.o00OoOoo.setNestedScrollingEnabled(true);
          localObject1 = this.o00OoOoo;
          bool = false;
          localSmartRefreshLayout = null;
          ((SmartRefreshLayout)localObject1).o00o0oo = false;
          break;
        }
      }
      bool = localObject1 instanceof View;
      if (!bool) {
        break;
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.1
 * JD-Core Version:    0.7.0.1
 */