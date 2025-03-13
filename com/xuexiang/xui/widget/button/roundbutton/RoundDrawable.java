package com.xuexiang.xui.widget.button.roundbutton;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import m54207b69;

public class RoundDrawable
  extends GradientDrawable
{
  public boolean OooO00o = true;
  public ColorStateList OooO0O0;
  public int OooO0OO = 0;
  public ColorStateList OooO0Oo;
  
  public final boolean OooO00o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(2808, arrayOfObject);
  }
  
  public boolean isStateful()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(2809, arrayOfObject);
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRect;
    m54207b69.F54207b69_00(2810, arrayOfObject);
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfInt;
    return m54207b69.F54207b69_01(2811, arrayOfObject);
  }
  
  public void setBgData(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(2812, arrayOfObject);
  }
  
  public void setIsRadiusAdjustBounds(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2813, arrayOfObject);
  }
  
  public void setStrokeData(int paramInt, ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    arrayOfObject[2] = paramColorStateList;
    m54207b69.F54207b69_00(2814, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.roundbutton.RoundDrawable
 * JD-Core Version:    0.7.0.1
 */