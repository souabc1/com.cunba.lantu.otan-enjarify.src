package com.xuexiang.xui.widget.searchview;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import m54207b69;

class MaterialSearchView$1
  implements TextView.OnEditorActionListener
{
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTextView;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    arrayOfObject[3] = paramKeyEvent;
    return m54207b69.F54207b69_01(5467, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.searchview.MaterialSearchView.1
 * JD-Core Version:    0.7.0.1
 */