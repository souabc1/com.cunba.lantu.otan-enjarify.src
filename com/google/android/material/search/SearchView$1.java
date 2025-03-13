package com.google.android.material.search;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;

class SearchView$1
  implements TextWatcher
{
  public SearchView$1(SearchView paramSearchView) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    ImageButton localImageButton = this.this$0.clearButton;
    int i = paramCharSequence.length();
    if (i > 0)
    {
      i = 0;
      paramCharSequence = null;
    }
    else
    {
      i = 8;
    }
    localImageButton.setVisibility(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchView.1
 * JD-Core Version:    0.7.0.1
 */