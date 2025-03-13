package com.xuexiang.xui.widget.edittext.materialedittext.validation;

import m54207b69;

public abstract class METValidator
{
  protected String errorMessage;
  
  public METValidator(String paramString)
  {
    this.errorMessage = paramString;
  }
  
  public String getErrorMessage()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(3516, arrayOfObject);
  }
  
  public abstract boolean isValid(CharSequence paramCharSequence, boolean paramBoolean);
  
  public void setErrorMessage(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(3517, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator
 * JD-Core Version:    0.7.0.1
 */