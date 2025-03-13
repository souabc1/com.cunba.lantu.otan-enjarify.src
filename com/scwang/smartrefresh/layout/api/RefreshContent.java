package com.scwang.smartrefresh.layout.api;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.MotionEvent;
import android.view.View;

public abstract interface RefreshContent
{
  public abstract boolean OooO00o();
  
  public abstract void OooO0O0(MotionEvent paramMotionEvent);
  
  public abstract void OooO0OO(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract ValueAnimator.AnimatorUpdateListener OooO0Oo(int paramInt);
  
  public abstract boolean OooO0o0();
  
  public abstract void OooO0oO(RefreshKernel paramRefreshKernel, View paramView1, View paramView2);
  
  public abstract View getScrollableView();
  
  public abstract View getView();
  
  public abstract void setEnableLoadMoreWhenContentNotFull(boolean paramBoolean);
  
  public abstract void setScrollBoundaryDecider(ScrollBoundaryDecider paramScrollBoundaryDecider);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.api.RefreshContent
 * JD-Core Version:    0.7.0.1
 */