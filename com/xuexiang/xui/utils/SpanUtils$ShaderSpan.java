package com.xuexiang.xui.utils;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import m54207b69;

class SpanUtils$ShaderSpan
  extends CharacterStyle
  implements UpdateAppearance
{
  public Shader o00OoOoo;
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTextPaint;
    m54207b69.F54207b69_00(2134, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.SpanUtils.ShaderSpan
 * JD-Core Version:    0.7.0.1
 */