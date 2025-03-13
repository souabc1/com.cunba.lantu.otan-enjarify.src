package com.xuexiang.xui.widget.statelayout;

import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import m54207b69;

public class StatefulLayout
  extends LinearLayout
{
  public boolean o00OoOoo;
  public Animation o00Ooo0;
  public Animation o00Ooo00;
  public int o00Ooo0O;
  public View o00Ooo0o;
  public MaterialProgressBar o00OooO;
  public LinearLayout o00OooO0;
  public ImageView o00OooOO;
  public TextView o00OooOo;
  public Button o0O00o0;
  
  private String getString(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (String)m54207b69.F54207b69_09(5719, arrayOfObject);
  }
  
  public void OooO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5714, arrayOfObject);
  }
  
  public final void OooO0oO(CustomStateOptions paramCustomStateOptions)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCustomStateOptions;
    m54207b69.F54207b69_00(5716, arrayOfObject);
  }
  
  public Animation getInAnimation()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Animation)m54207b69.F54207b69_09(5717, arrayOfObject);
  }
  
  public Animation getOutAnimation()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Animation)m54207b69.F54207b69_09(5718, arrayOfObject);
  }
  
  public boolean isAnimationEnabled()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(5720, arrayOfObject);
  }
  
  public void onFinishInflate()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5721, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.statelayout.StatefulLayout
 * JD-Core Version:    0.7.0.1
 */