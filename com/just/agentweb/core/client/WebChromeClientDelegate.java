package com.just.agentweb.core.client;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;

public class WebChromeClientDelegate
  extends WebChromeClient
{
  public WebChromeClient OooO00o;
  
  public WebChromeClientDelegate(WebChromeClient paramWebChromeClient)
  {
    this.OooO00o = paramWebChromeClient;
  }
  
  public Bitmap getDefaultVideoPoster()
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      return localWebChromeClient.getDefaultVideoPoster();
    }
    return super.getDefaultVideoPoster();
  }
  
  public WebChromeClient getDelegate()
  {
    return this.OooO00o;
  }
  
  public View getVideoLoadingProgressView()
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      return localWebChromeClient.getVideoLoadingProgressView();
    }
    return super.getVideoLoadingProgressView();
  }
  
  public void getVisitedHistory(ValueCallback paramValueCallback)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.getVisitedHistory(paramValueCallback);
      return;
    }
    super.getVisitedHistory(paramValueCallback);
  }
  
  public void onCloseWindow(WebView paramWebView)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onCloseWindow(paramWebView);
      return;
    }
    super.onCloseWindow(paramWebView);
  }
  
  public void onConsoleMessage(String paramString1, int paramInt, String paramString2)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onConsoleMessage(paramString1, paramInt, paramString2);
      return;
    }
    super.onConsoleMessage(paramString1, paramInt, paramString2);
  }
  
  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      return localWebChromeClient.onConsoleMessage(paramConsoleMessage);
    }
    return super.onConsoleMessage(paramConsoleMessage);
  }
  
  public boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      return localWebChromeClient.onCreateWindow(paramWebView, paramBoolean1, paramBoolean2, paramMessage);
    }
    return super.onCreateWindow(paramWebView, paramBoolean1, paramBoolean2, paramMessage);
  }
  
  public void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onExceededDatabaseQuota(paramString1, paramString2, paramLong1, paramLong2, paramLong3, paramQuotaUpdater);
      return;
    }
    super.onExceededDatabaseQuota(paramString1, paramString2, paramLong1, paramLong2, paramLong3, paramQuotaUpdater);
  }
  
  public void onGeolocationPermissionsHidePrompt()
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onGeolocationPermissionsHidePrompt();
      return;
    }
    super.onGeolocationPermissionsHidePrompt();
  }
  
  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onGeolocationPermissionsShowPrompt(paramString, paramCallback);
      return;
    }
    super.onGeolocationPermissionsShowPrompt(paramString, paramCallback);
  }
  
  public void onHideCustomView()
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onHideCustomView();
      return;
    }
    super.onHideCustomView();
  }
  
  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      return localWebChromeClient.onJsAlert(paramWebView, paramString1, paramString2, paramJsResult);
    }
    return super.onJsAlert(paramWebView, paramString1, paramString2, paramJsResult);
  }
  
  public boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      return localWebChromeClient.onJsBeforeUnload(paramWebView, paramString1, paramString2, paramJsResult);
    }
    return super.onJsBeforeUnload(paramWebView, paramString1, paramString2, paramJsResult);
  }
  
  public boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      return localWebChromeClient.onJsConfirm(paramWebView, paramString1, paramString2, paramJsResult);
    }
    return super.onJsConfirm(paramWebView, paramString1, paramString2, paramJsResult);
  }
  
  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      return localWebChromeClient.onJsPrompt(paramWebView, paramString1, paramString2, paramString3, paramJsPromptResult);
    }
    return super.onJsPrompt(paramWebView, paramString1, paramString2, paramString3, paramJsPromptResult);
  }
  
  public boolean onJsTimeout()
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      return localWebChromeClient.onJsTimeout();
    }
    return super.onJsTimeout();
  }
  
  public void onPermissionRequest(PermissionRequest paramPermissionRequest)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onPermissionRequest(paramPermissionRequest);
      return;
    }
    super.onPermissionRequest(paramPermissionRequest);
  }
  
  public void onPermissionRequestCanceled(PermissionRequest paramPermissionRequest)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onPermissionRequestCanceled(paramPermissionRequest);
      return;
    }
    super.onPermissionRequestCanceled(paramPermissionRequest);
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    super.onProgressChanged(paramWebView, paramInt);
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      localWebChromeClient.onProgressChanged(paramWebView, paramInt);
    }
  }
  
  public void onReceivedIcon(WebView paramWebView, Bitmap paramBitmap)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onReceivedIcon(paramWebView, paramBitmap);
      return;
    }
    super.onReceivedIcon(paramWebView, paramBitmap);
  }
  
  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onReceivedTitle(paramWebView, paramString);
      return;
    }
    super.onReceivedTitle(paramWebView, paramString);
  }
  
  public void onReceivedTouchIconUrl(WebView paramWebView, String paramString, boolean paramBoolean)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onReceivedTouchIconUrl(paramWebView, paramString, paramBoolean);
      return;
    }
    super.onReceivedTouchIconUrl(paramWebView, paramString, paramBoolean);
  }
  
  public void onRequestFocus(WebView paramWebView)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onRequestFocus(paramWebView);
      return;
    }
    super.onRequestFocus(paramWebView);
  }
  
  public void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onShowCustomView(paramView, paramInt, paramCustomViewCallback);
      return;
    }
    super.onShowCustomView(paramView, paramInt, paramCustomViewCallback);
  }
  
  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null)
    {
      localWebChromeClient.onShowCustomView(paramView, paramCustomViewCallback);
      return;
    }
    super.onShowCustomView(paramView, paramCustomViewCallback);
  }
  
  public boolean onShowFileChooser(WebView paramWebView, ValueCallback paramValueCallback, WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    WebChromeClient localWebChromeClient = this.OooO00o;
    if (localWebChromeClient != null) {
      return localWebChromeClient.onShowFileChooser(paramWebView, paramValueCallback, paramFileChooserParams);
    }
    return super.onShowFileChooser(paramWebView, paramValueCallback, paramFileChooserParams);
  }
  
  public void setDelegate(WebChromeClient paramWebChromeClient)
  {
    this.OooO00o = paramWebChromeClient;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.client.WebChromeClientDelegate
 * JD-Core Version:    0.7.0.1
 */