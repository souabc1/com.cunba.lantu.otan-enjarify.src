package com.just.agentweb.core.web.controller;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.snackbar.Snackbar;
import com.just.agentweb.widget.WebParentLayout;

public abstract class AbsAgentWebUIController
{
  public static boolean OooO0o = false;
  public Activity OooO00o;
  public WebParentLayout OooO0O0;
  public volatile boolean OooO0OO = false;
  public AbsAgentWebUIController OooO0Oo;
  public String OooO0o0;
  
  static
  {
    try
    {
      i = Snackbar.OooO00o;
      i = BottomSheetDialog.o00OoOoo;
      i = 1;
      OooO0o = i;
    }
    finally
    {
      int i = 0;
      OooO0o = false;
    }
  }
  
  public AbsAgentWebUIController()
  {
    String str = getClass().getSimpleName();
    this.OooO0o0 = str;
  }
  
  public abstract void OooO(WebView paramWebView, String paramString, Handler.Callback paramCallback);
  
  public abstract void OooO00o(WebParentLayout paramWebParentLayout, Activity paramActivity);
  
  public final void OooO0O0(WebParentLayout paramWebParentLayout, Activity paramActivity)
  {
    try
    {
      boolean bool = this.OooO0OO;
      if (!bool)
      {
        bool = true;
        this.OooO0OO = bool;
        this.OooO0O0 = paramWebParentLayout;
        this.OooO00o = paramActivity;
        OooO00o(paramWebParentLayout, paramActivity);
      }
      return;
    }
    finally {}
  }
  
  public AbsAgentWebUIController OooO0OO()
  {
    boolean bool = OooO0o;
    Object localObject;
    if (bool)
    {
      localObject = new com/just/agentweb/core/web/controller/DefaultDesignUIController;
      ((DefaultDesignUIController)localObject).<init>();
    }
    else
    {
      localObject = new com/just/agentweb/core/web/controller/DefaultUIController;
      ((DefaultUIController)localObject).<init>();
    }
    return localObject;
  }
  
  public abstract void OooO0Oo(String paramString, Handler.Callback paramCallback);
  
  public abstract void OooO0o(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult);
  
  public abstract void OooO0o0(WebView paramWebView, String paramString1, String paramString2);
  
  public abstract void OooO0oO(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult);
  
  public abstract void OooO0oo(WebView paramWebView, int paramInt, String paramString1, String paramString2);
  
  public abstract void OooOO0(String[] paramArrayOfString, String paramString1, String paramString2);
  
  public abstract void OooOO0O();
  
  public abstract void OooOO0o(String paramString1, String paramString2);
  
  public void OooOOO0(Dialog paramDialog)
  {
    if (paramDialog != null)
    {
      boolean bool = paramDialog.isShowing();
      if (bool) {
        paramDialog.dismiss();
      }
    }
  }
  
  public AbsAgentWebUIController getDelegate()
  {
    AbsAgentWebUIController localAbsAgentWebUIController = this.OooO0Oo;
    if (localAbsAgentWebUIController == null)
    {
      localAbsAgentWebUIController = OooO0OO();
      this.OooO0Oo = localAbsAgentWebUIController;
    }
    return localAbsAgentWebUIController;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.controller.AbsAgentWebUIController
 * JD-Core Version:    0.7.0.1
 */