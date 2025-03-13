package com.xuexiang.xui.widget.banner.recycler;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import m54207b69;

public abstract class RecyclerViewBannerBase
  extends FrameLayout
{
  public RecyclerView o00OoOoo;
  public int o00Ooo0;
  public RecyclerViewBannerBase.IndicatorAdapter o00Ooo00;
  public boolean o00Ooo0O;
  public Drawable o00Ooo0o;
  public RecyclerView o00OooO;
  public Drawable o00OooO0;
  public boolean o00OooOO;
  public int o00OooOo;
  public int o00OoooO;
  public int o00Ooooo;
  public BannerLayout.OnIndicatorIndexChangedListener o00o000;
  public boolean o00o0000;
  public Handler o00o000O;
  public boolean o0O00o0;
  
  public void OooO00o(RecyclerView paramRecyclerView, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRecyclerView;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(2365, arrayOfObject);
  }
  
  public void OooO0O0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRecyclerView;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    m54207b69.F54207b69_00(2366, arrayOfObject);
  }
  
  public void OooO0OO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2367, arrayOfObject);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(2368, arrayOfObject);
  }
  
  public int getColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_05(2369, arrayOfObject);
  }
  
  public boolean isPlaying()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(2370, arrayOfObject);
  }
  
  public void onAttachedToWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2371, arrayOfObject);
  }
  
  public void onDetachedFromWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2372, arrayOfObject);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(2373, arrayOfObject);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      return super.onTouchEvent(paramMotionEvent);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localIllegalArgumentException;
    }
    return false;
  }
  
  public void onWindowVisibilityChanged(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2375, arrayOfObject);
  }
  
  public void setAutoPlaying(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2376, arrayOfObject);
  }
  
  public void setIndicatorInterval(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2377, arrayOfObject);
  }
  
  public void setPlaying(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2378, arrayOfObject);
  }
  
  public void setShowIndicator(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2379, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.banner.recycler.RecyclerViewBannerBase
 * JD-Core Version:    0.7.0.1
 */