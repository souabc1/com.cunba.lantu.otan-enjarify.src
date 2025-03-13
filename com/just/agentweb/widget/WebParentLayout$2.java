package com.just.agentweb.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.FrameLayout;

class WebParentLayout$2
  implements View.OnClickListener
{
  public WebParentLayout$2(WebParentLayout paramWebParentLayout, FrameLayout paramFrameLayout) {}
  
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
 * Qualified Name:     com.just.agentweb.widget.WebParentLayout.2
 * JD-Core Version:    0.7.0.1
 */