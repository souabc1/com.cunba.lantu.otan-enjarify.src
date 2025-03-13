package com.xuexiang.xui.widget.textview;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import m54207b69;

class ReadMoreTextView$ReadMoreClickableSpan
  extends ClickableSpan
{
  public void onClick(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(6152, arrayOfObject);
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTextPaint;
    m54207b69.F54207b69_00(6153, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.ReadMoreTextView.ReadMoreClickableSpan
 * JD-Core Version:    0.7.0.1
 */