package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;

class TextInputLayout$1
  implements TextWatcher
{
  public TextInputLayout$1(TextInputLayout paramTextInputLayout) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    TextInputLayout localTextInputLayout = this.this$0;
    boolean bool1 = TextInputLayout.access$000(localTextInputLayout) ^ true;
    localTextInputLayout.updateLabelState(bool1);
    localTextInputLayout = this.this$0;
    bool1 = localTextInputLayout.counterEnabled;
    if (bool1) {
      localTextInputLayout.updateCounter(paramEditable);
    }
    localTextInputLayout = this.this$0;
    boolean bool2 = TextInputLayout.access$100(localTextInputLayout);
    if (bool2)
    {
      localTextInputLayout = this.this$0;
      TextInputLayout.access$200(localTextInputLayout, paramEditable);
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.TextInputLayout.1
 * JD-Core Version:    0.7.0.1
 */