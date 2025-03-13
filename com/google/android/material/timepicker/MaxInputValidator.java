package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

class MaxInputValidator
  implements InputFilter
{
  private int max;
  
  public MaxInputValidator(int paramInt)
  {
    this.max = paramInt;
  }
  
  public CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(paramSpanned);
      paramCharSequence = paramCharSequence.subSequence(paramInt1, paramInt2);
      paramCharSequence = paramCharSequence.toString();
      localStringBuilder.replace(paramInt3, paramInt4, paramCharSequence);
      paramCharSequence = localStringBuilder.toString();
      int i = Integer.parseInt(paramCharSequence);
      paramInt1 = this.max;
      if (i <= paramInt1) {
        return null;
      }
    }
    catch (NumberFormatException localNumberFormatException) {}
    return "";
  }
  
  public int getMax()
  {
    return this.max;
  }
  
  public void setMax(int paramInt)
  {
    this.max = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.MaxInputValidator
 * JD-Core Version:    0.7.0.1
 */