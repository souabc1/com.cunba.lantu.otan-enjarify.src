package com.cunba.lantu.otan.ui.webview;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import m54207b69;

class AgentWebFragment$5
  extends WebChromeClient
{
  public AgentWebFragment$5(AgentWebFragment paramAgentWebFragment) {}
  
  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramConsoleMessage;
    return m54207b69.F54207b69_01(698, arrayOfObject);
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(699, arrayOfObject);
  }
  
  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    arrayOfObject[2] = paramString;
    m54207b69.F54207b69_00(700, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.ui.webview.AgentWebFragment.5
 * JD-Core Version:    0.7.0.1
 */