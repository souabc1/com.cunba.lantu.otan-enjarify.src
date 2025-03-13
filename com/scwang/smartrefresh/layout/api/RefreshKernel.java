package com.scwang.smartrefresh.layout.api;

import android.animation.ValueAnimator;
import com.scwang.smartrefresh.layout.constant.RefreshState;

public abstract interface RefreshKernel
{
  public abstract RefreshKernel OooO(RefreshInternal paramRefreshInternal, int paramInt);
  
  public abstract RefreshKernel OooO00o(RefreshState paramRefreshState);
  
  public abstract RefreshKernel OooO0O0(RefreshInternal paramRefreshInternal, boolean paramBoolean);
  
  public abstract RefreshKernel OooO0OO();
  
  public abstract ValueAnimator OooO0Oo(int paramInt);
  
  public abstract RefreshKernel OooO0o(int paramInt);
  
  public abstract RefreshKernel OooO0o0(RefreshInternal paramRefreshInternal, boolean paramBoolean);
  
  public abstract RefreshKernel OooO0oO(boolean paramBoolean);
  
  public abstract RefreshKernel OooO0oo(int paramInt, boolean paramBoolean);
  
  public abstract RefreshContent getRefreshContent();
  
  public abstract RefreshLayout getRefreshLayout();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.api.RefreshKernel
 * JD-Core Version:    0.7.0.1
 */