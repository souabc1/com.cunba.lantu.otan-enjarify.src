package com.xuexiang.xui.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import m54207b69;

class SpanUtils$CustomIconMarginSpan
  implements LeadingMarginSpan, LineHeightSpan
{
  public Bitmap o00OoOoo;
  public int o00Ooo0;
  public final int o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  public boolean o00OooOO;
  
  public void chooseHeight(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint.FontMetricsInt paramFontMetricsInt)
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[4] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[5] = localInteger;
    arrayOfObject[6] = paramFontMetricsInt;
    m54207b69.F54207b69_00(2123, arrayOfObject);
  }
  
  public void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout)
  {
    Object[] arrayOfObject = new Object[13];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    arrayOfObject[2] = paramPaint;
    Object localObject = Integer.valueOf(paramInt1);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(paramInt3);
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(paramInt4);
    arrayOfObject[6] = localObject;
    localObject = Integer.valueOf(paramInt5);
    arrayOfObject[7] = localObject;
    arrayOfObject[8] = paramCharSequence;
    localObject = Integer.valueOf(paramInt6);
    arrayOfObject[9] = localObject;
    localObject = Integer.valueOf(paramInt7);
    arrayOfObject[10] = localObject;
    localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[11] = localObject;
    arrayOfObject[12] = paramLayout;
    m54207b69.F54207b69_00(2124, arrayOfObject);
  }
  
  public int getLeadingMargin(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return m54207b69.F54207b69_05(2125, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.SpanUtils.CustomIconMarginSpan
 * JD-Core Version:    0.7.0.1
 */