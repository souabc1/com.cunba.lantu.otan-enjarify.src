package com.xuexiang.xui.widget.textview.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ImageSpan;
import m54207b69;

public class AlignMiddleImageSpan
  extends ImageSpan
{
  public float o00OoOoo;
  public int o00Ooo0;
  public boolean o00Ooo00;
  
  public void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    Object[] arrayOfObject = new Object[10];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    arrayOfObject[2] = paramCharSequence;
    Object localObject = Integer.valueOf(paramInt1);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[4] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(paramInt3);
    arrayOfObject[6] = localObject;
    localObject = Integer.valueOf(paramInt4);
    arrayOfObject[7] = localObject;
    localObject = Integer.valueOf(paramInt5);
    arrayOfObject[8] = localObject;
    arrayOfObject[9] = paramPaint;
    m54207b69.F54207b69_00(6418, arrayOfObject);
  }
  
  public int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramPaint;
    arrayOfObject[2] = paramCharSequence;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[4] = localInteger;
    arrayOfObject[5] = paramFontMetricsInt;
    return m54207b69.F54207b69_05(6419, arrayOfObject);
  }
  
  public void setAvoidSuperChangeFontMetrics(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(6420, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.span.AlignMiddleImageSpan
 * JD-Core Version:    0.7.0.1
 */