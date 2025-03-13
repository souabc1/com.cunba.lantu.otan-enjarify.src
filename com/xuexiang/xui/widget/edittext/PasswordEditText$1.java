package com.xuexiang.xui.widget.edittext;

import android.text.Editable;
import android.text.TextWatcher;
import m54207b69;

class PasswordEditText$1
  implements TextWatcher
{
  public void afterTextChanged(Editable paramEditable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramEditable;
    m54207b69.F54207b69_00(3319, arrayOfObject);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(3320, arrayOfObject);
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(3321, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.edittext.PasswordEditText.1
 * JD-Core Version:    0.7.0.1
 */