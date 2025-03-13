package com.xuexiang.xui.widget.shadow;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import m54207b69;

public class ShadowDrawable
  extends Drawable
{
  public RectF OooO;
  public Paint OooO00o;
  public Paint OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  public int[] OooO0oo;
  
  public void draw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(5547, arrayOfObject);
  }
  
  public int getOpacity()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5548, arrayOfObject);
  }
  
  public void setAlpha(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5549, arrayOfObject);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(5550, arrayOfObject);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorFilter;
    m54207b69.F54207b69_00(5551, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.shadow.ShadowDrawable
 * JD-Core Version:    0.7.0.1
 */