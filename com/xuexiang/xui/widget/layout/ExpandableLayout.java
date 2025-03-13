package com.xuexiang.xui.widget.layout;

import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import m54207b69;

public class ExpandableLayout
  extends FrameLayout
{
  public int o00OoOoo;
  public float o00Ooo0;
  public float o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public ValueAnimator o00OooO;
  public Interpolator o00OooO0;
  public ExpandableLayout.OnExpansionChangedListener o00OooOO;
  
  public final void OooO0O0(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(4350, arrayOfObject);
  }
  
  public void OooO0OO(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    arrayOfObject[1] = localBoolean;
    localBoolean = Boolean.valueOf(paramBoolean2);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(4351, arrayOfObject);
  }
  
  public int getDuration()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(4352, arrayOfObject);
  }
  
  public float getExpansion()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4353, arrayOfObject);
  }
  
  public int getOrientation()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(4354, arrayOfObject);
  }
  
  public float getParallax()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4355, arrayOfObject);
  }
  
  public int getState()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(4356, arrayOfObject);
  }
  
  public boolean isExpanded()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(4357, arrayOfObject);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramConfiguration;
    m54207b69.F54207b69_00(4358, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(4359, arrayOfObject);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcelable;
    m54207b69.F54207b69_00(4360, arrayOfObject);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Parcelable)m54207b69.F54207b69_09(4361, arrayOfObject);
  }
  
  public void setExpanded(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(4362, arrayOfObject);
  }
  
  public void setExpansion(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(4363, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.layout.ExpandableLayout
 * JD-Core Version:    0.7.0.1
 */