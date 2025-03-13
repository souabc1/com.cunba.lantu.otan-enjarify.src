package com.just.agentweb.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

class WebParentLayout$1
  implements View.OnClickListener
{
  public WebParentLayout$1(WebParentLayout paramWebParentLayout, View paramView) {}
  
  public void onClick(View paramView)
  {
    paramView = this.o00Ooo00.getWebView();
    if (paramView != null)
    {
      this.o00OoOoo.setClickable(false);
      paramView = this.o00Ooo00.getWebView();
      paramView.reload();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.widget.WebParentLayout.1
 * JD-Core Version:    0.7.0.1
 */