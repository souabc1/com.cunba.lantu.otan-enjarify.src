package com.cunba.lantu.otan.ui.webview;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import m54207b69;

class AgentWebFragment$6
  extends WebViewClient
{
  public HashMap OooO00o;
  public String OooO0O0;
  
  public AgentWebFragment$6(AgentWebFragment paramAgentWebFragment)
  {
    paramAgentWebFragment = new java/util/HashMap;
    paramAgentWebFragment.<init>();
    this.OooO00o = paramAgentWebFragment;
    this.OooO0O0 = null;
  }
  
  public void doUpdateVisitedHistory(WebView paramWebView, String paramString, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    arrayOfObject[2] = paramString;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[3] = localBoolean;
    m54207b69.F54207b69_00(704, arrayOfObject);
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    arrayOfObject[2] = paramString;
    m54207b69.F54207b69_00(705, arrayOfObject);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    arrayOfObject[2] = paramString;
    arrayOfObject[3] = paramBitmap;
    m54207b69.F54207b69_00(706, arrayOfObject);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    arrayOfObject[3] = paramString1;
    arrayOfObject[4] = paramString2;
    m54207b69.F54207b69_00(707, arrayOfObject);
  }
  
  public void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    arrayOfObject[2] = paramWebResourceRequest;
    arrayOfObject[3] = paramWebResourceError;
    m54207b69.F54207b69_00(708, arrayOfObject);
  }
  
  public void onReceivedHttpError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceResponse paramWebResourceResponse)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    arrayOfObject[2] = paramWebResourceRequest;
    arrayOfObject[3] = paramWebResourceResponse;
    m54207b69.F54207b69_00(709, arrayOfObject);
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    arrayOfObject[2] = paramWebResourceRequest;
    return (WebResourceResponse)m54207b69.F54207b69_09(710, arrayOfObject);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    arrayOfObject[2] = paramWebResourceRequest;
    return m54207b69.F54207b69_01(711, arrayOfObject);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    arrayOfObject[2] = paramString;
    return m54207b69.F54207b69_01(712, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.ui.webview.AgentWebFragment.6
 * JD-Core Version:    0.7.0.1
 */