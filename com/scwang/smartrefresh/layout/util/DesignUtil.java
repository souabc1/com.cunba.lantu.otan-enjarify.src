package com.scwang.smartrefresh.layout.util;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.CoordinatorLayoutListener;

public class DesignUtil
{
  public static void OooO00o(View paramView, RefreshKernel paramRefreshKernel, CoordinatorLayoutListener paramCoordinatorLayoutListener)
  {
    boolean bool = paramView instanceof CoordinatorLayout;
    if (bool) {}
    try
    {
      paramRefreshKernel = paramRefreshKernel.getRefreshLayout();
      bool = false;
      paramRefreshKernel.OooO0o(false);
      paramView = (ViewGroup)paramView;
      OooO0O0(paramView, paramCoordinatorLayoutListener);
      label36:
      return;
    }
    finally
    {
      break label36;
    }
  }
  
  public static void OooO0O0(ViewGroup paramViewGroup, CoordinatorLayoutListener paramCoordinatorLayoutListener)
  {
    int i = paramViewGroup.getChildCount() + -1;
    while (i >= 0)
    {
      Object localObject = paramViewGroup.getChildAt(i);
      boolean bool = localObject instanceof AppBarLayout;
      if (bool)
      {
        localObject = (AppBarLayout)localObject;
        DesignUtil.1 local1 = new com/scwang/smartrefresh/layout/util/DesignUtil$1;
        local1.<init>(paramCoordinatorLayoutListener);
        ((AppBarLayout)localObject).addOnOffsetChangedListener(local1);
      }
      i += -1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.util.DesignUtil
 * JD-Core Version:    0.7.0.1
 */