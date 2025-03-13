package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import m54207b69;

public class FixedSpeedScroller
  extends Scroller
{
  public int OooO00o;
  
  public FixedSpeedScroller(Context paramContext, Interpolator paramInterpolator, int paramInt)
  {
    super(paramContext, paramInterpolator);
    this.OooO00o = paramInt;
  }
  
  public void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[4] = localInteger;
    localInteger = Integer.valueOf(paramInt5);
    arrayOfObject[5] = localInteger;
    m54207b69.F54207b69_00(2632, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.banner.widget.loopviewpager.FixedSpeedScroller
 * JD-Core Version:    0.7.0.1
 */