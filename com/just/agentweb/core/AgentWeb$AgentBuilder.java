package com.just.agentweb.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.fragment.app.Fragment;
import com.just.agentweb.action.PermissionInterceptor;
import com.just.agentweb.core.client.DefaultWebClient.OpenOtherPageWays;
import com.just.agentweb.core.client.MiddlewareWebChromeBase;
import com.just.agentweb.core.client.MiddlewareWebClientBase;
import com.just.agentweb.core.event.IEventHandler;
import com.just.agentweb.core.url.HttpHeaders;
import com.just.agentweb.core.web.HookManager;
import com.just.agentweb.core.web.IAgentWebSettings;
import com.just.agentweb.core.web.controller.AbsAgentWebUIController;
import com.just.agentweb.widget.IWebLayout;
import com.just.agentweb.widget.indicator.BaseIndicatorView;
import com.just.agentweb.widget.indicator.IndicatorController;
import com.just.agentweb.widget.indicator.WebCreator;
import m54207b69;

public final class AgentWeb$AgentBuilder
{
  public WebViewClient OooO;
  public Activity OooO00o;
  public Fragment OooO0O0;
  public ViewGroup OooO0OO;
  public int OooO0Oo;
  public IndicatorController OooO0o;
  public BaseIndicatorView OooO0o0;
  public boolean OooO0oO;
  public ViewGroup.LayoutParams OooO0oo;
  public WebChromeClient OooOO0;
  public int OooOO0O;
  public IAgentWebSettings OooOO0o;
  public HttpHeaders OooOOO;
  public WebCreator OooOOO0;
  public IEventHandler OooOOOO;
  public int OooOOOo;
  public AgentWeb.SecurityType OooOOo;
  public ArrayMap OooOOo0;
  public WebView OooOOoo;
  public DefaultWebClient.OpenOtherPageWays OooOo;
  public IWebLayout OooOo0;
  public boolean OooOo00;
  public PermissionInterceptor OooOo0O;
  public AbsAgentWebUIController OooOo0o;
  public MiddlewareWebClientBase OooOoO;
  public boolean OooOoO0;
  public MiddlewareWebClientBase OooOoOO;
  public MiddlewareWebChromeBase OooOoo;
  public MiddlewareWebChromeBase OooOoo0;
  public View OooOooO;
  public int OooOooo;
  public int Oooo000;
  public int Oooo00O;
  
  public AgentWeb$AgentBuilder(Activity paramActivity, Fragment paramFragment)
  {
    int i = -1;
    this.OooO0Oo = i;
    this.OooO0o = null;
    int j = 1;
    this.OooO0oO = j;
    this.OooO0oo = null;
    this.OooOO0O = i;
    this.OooOOO = null;
    this.OooOOOo = i;
    AgentWeb.SecurityType localSecurityType = AgentWeb.SecurityType.o00OoOoo;
    this.OooOOo = localSecurityType;
    this.OooOo00 = j;
    this.OooOo0 = null;
    this.OooOo0O = null;
    this.OooOo = null;
    this.OooOoO0 = false;
    this.OooOoo0 = null;
    this.OooOoo = null;
    this.OooO00o = paramActivity;
    this.OooO0O0 = paramFragment;
    this.Oooo00O = j;
  }
  
  public final void OoooOo0(String paramString, Object paramObject)
  {
    ArrayMap localArrayMap = this.OooOOo0;
    if (localArrayMap == null)
    {
      localArrayMap = new androidx/collection/ArrayMap;
      localArrayMap.<init>();
      this.OooOOo0 = localArrayMap;
    }
    this.OooOOo0.put(paramString, paramObject);
  }
  
  public final AgentWeb.PreAgentWeb OoooOoO()
  {
    int i = this.Oooo00O;
    int j = 1;
    if (i == j)
    {
      localObject1 = this.OooO0OO;
      if (localObject1 == null)
      {
        localObject1 = new java/lang/NullPointerException;
        localObject2 = m54207b69.F54207b69_11("V;6D53604F804E5A5553245C5327625C6667287D6A726F5E7533716D79746D3961746F6B3E6F7F6F817E87798975754944");
        ((NullPointerException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    Object localObject1 = new com/just/agentweb/core/AgentWeb$PreAgentWeb;
    Object localObject2 = new com/just/agentweb/core/AgentWeb;
    ((AgentWeb)localObject2).<init>(this, null);
    localObject2 = HookManager.OooO00o((AgentWeb)localObject2, this);
    ((AgentWeb.PreAgentWeb)localObject1).<init>((AgentWeb)localObject2);
    return localObject1;
  }
  
  public AgentWeb.IndicatorBuilder OoooOoo(ViewGroup paramViewGroup, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.OooO0OO = paramViewGroup;
    this.OooO0oo = paramLayoutParams;
    this.OooO0Oo = paramInt;
    paramViewGroup = new com/just/agentweb/core/AgentWeb$IndicatorBuilder;
    paramViewGroup.<init>(this);
    return paramViewGroup;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.AgentWeb.AgentBuilder
 * JD-Core Version:    0.7.0.1
 */