package com.xuexiang.xui.utils;

import android.graphics.Paint.FontMetricsInt;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LineHeightSpan;
import m54207b69;

class SpanUtils$CustomLineHeightSpan
  extends CharacterStyle
  implements LineHeightSpan
{
  public final int o00OoOoo;
  public final int o00Ooo00;
  
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
    m54207b69.F54207b69_00(2127, arrayOfObject);
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTextPaint;
    m54207b69.F54207b69_00(2128, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.SpanUtils.CustomLineHeightSpan
 * JD-Core Version:    0.7.0.1
 */