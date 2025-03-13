package com.xuexiang.xui.widget.edittext;

import m54207b69;

class AsteriskPasswordTransformationMethod$AsteriskPasswordCharSequence
  implements CharSequence
{
  public CharSequence o00OoOoo;
  
  public AsteriskPasswordTransformationMethod$AsteriskPasswordCharSequence(CharSequence paramCharSequence)
  {
    this.o00OoOoo = paramCharSequence;
  }
  
  public char charAt(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_03(3277, arrayOfObject);
  }
  
  public int length()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3278, arrayOfObject);
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    return (CharSequence)m54207b69.F54207b69_09(3279, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.edittext.AsteriskPasswordTransformationMethod.AsteriskPasswordCharSequence
 * JD-Core Version:    0.7.0.1
 */