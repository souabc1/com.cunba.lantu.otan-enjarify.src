package com.google.android.material.textfield;

import android.widget.EditText;
import android.widget.TextView;

class EditTextUtils
{
  public static boolean isEditable(EditText paramEditText)
  {
    int i = paramEditText.getInputType();
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramEditText = null;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.EditTextUtils
 * JD-Core Version:    0.7.0.1
 */