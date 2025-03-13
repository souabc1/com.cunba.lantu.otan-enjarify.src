package com.just.agentweb.widget;

import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import com.just.agentweb.utils.LogUtils;

class AgentWebView$FixedOnReceivedTitle
{
  public WebChromeClient OooO00o;
  public boolean OooO0O0;
  
  public void OooO00o(WebView paramWebView)
  {
    boolean bool1 = this.OooO0O0;
    if (!bool1)
    {
      Object localObject1 = this.OooO00o;
      if (localObject1 != null)
      {
        String str;
        try
        {
          localObject1 = paramWebView.copyBackForwardList();
        }
        catch (NullPointerException localNullPointerException)
        {
          boolean bool2 = LogUtils.isDebug();
          if (bool2) {
            localNullPointerException.printStackTrace();
          }
          bool1 = false;
          str = null;
        }
        if (str != null)
        {
          int i = str.getSize();
          if (i > 0)
          {
            i = str.getCurrentIndex();
            if (i >= 0)
            {
              i = str.getCurrentIndex();
              Object localObject2 = str.getItemAtIndex(i);
              if (localObject2 != null)
              {
                i = str.getCurrentIndex();
                str = str.getItemAtIndex(i).getTitle();
                localObject2 = this.OooO00o;
                ((WebChromeClient)localObject2).onReceivedTitle(paramWebView, str);
              }
            }
          }
        }
      }
    }
  }
  
  public void OooO0O0()
  {
    this.OooO0O0 = false;
  }
  
  public void OooO0OO()
  {
    this.OooO0O0 = true;
  }
  
  public void setWebChromeClient(WebChromeClient paramWebChromeClient)
  {
    this.OooO00o = paramWebChromeClient;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.widget.AgentWebView.FixedOnReceivedTitle
 * JD-Core Version:    0.7.0.1
 */