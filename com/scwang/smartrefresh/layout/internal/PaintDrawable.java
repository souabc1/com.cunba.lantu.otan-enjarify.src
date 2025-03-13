package com.scwang.smartrefresh.layout.internal;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;

public abstract class PaintDrawable
  extends Drawable
{
  public Paint o00OoOoo;
  
  public PaintDrawable()
  {
    Paint localPaint = new android/graphics/Paint;
    localPaint.<init>();
    this.o00OoOoo = localPaint;
    Paint.Style localStyle = Paint.Style.FILL;
    localPaint.setStyle(localStyle);
    this.o00OoOoo.setAntiAlias(true);
    this.o00OoOoo.setColor(-5592406);
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void setAlpha(int paramInt)
  {
    this.o00OoOoo.setAlpha(paramInt);
  }
  
  public void setColor(int paramInt)
  {
    this.o00OoOoo.setColor(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.o00OoOoo.setColorFilter(paramColorFilter);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.internal.PaintDrawable
 * JD-Core Version:    0.7.0.1
 */