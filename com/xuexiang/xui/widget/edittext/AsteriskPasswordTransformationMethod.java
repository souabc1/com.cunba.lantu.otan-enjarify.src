package com.xuexiang.xui.widget.edittext;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import m54207b69;

public class AsteriskPasswordTransformationMethod
  extends PasswordTransformationMethod
{
  public static AsteriskPasswordTransformationMethod o00OoOoo;
  
  public static PasswordTransformationMethod getInstance()
  {
    Object[] arrayOfObject = new Object[0];
    return (PasswordTransformationMethod)m54207b69.F54207b69_09(3280, arrayOfObject);
  }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    arrayOfObject[2] = paramView;
    return (CharSequence)m54207b69.F54207b69_09(3281, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.edittext.AsteriskPasswordTransformationMethod
 * JD-Core Version:    0.7.0.1
 */