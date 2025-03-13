package com.xuexiang.xui.widget.banner.recycler;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;
import m54207b69;

public class BannerLayout
  extends FrameLayout
{
  public BannerLayout.IndicatorAdapter o00OoOoo;
  public Drawable o00Ooo0;
  public int o00Ooo00;
  public Drawable o00Ooo0O;
  public RecyclerView o00Ooo0o;
  public boolean o00OooO;
  public BannerLayoutManager o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  public boolean o00OoooO;
  public int o00Ooooo;
  public BannerLayout.OnIndicatorIndexChangedListener o00o000;
  public boolean o00o0000;
  public Handler o00o000O;
  public boolean o0O00o0;
  
  public void OooOO0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2350, arrayOfObject);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(2351, arrayOfObject);
  }
  
  public boolean isPlaying()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(2352, arrayOfObject);
  }
  
  public void onAttachedToWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2353, arrayOfObject);
  }
  
  public void onDetachedFromWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2354, arrayOfObject);
  }
  
  public void onWindowVisibilityChanged(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2355, arrayOfObject);
  }
  
  public void setAdapter(RecyclerView.Adapter paramAdapter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAdapter;
    m54207b69.F54207b69_00(2356, arrayOfObject);
  }
  
  public void setPlaying(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2357, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.banner.recycler.BannerLayout
 * JD-Core Version:    0.7.0.1
 */