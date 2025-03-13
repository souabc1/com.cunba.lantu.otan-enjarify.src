package com.just.agentweb.core;

import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.just.agentweb.action.PermissionInterceptor;
import com.just.agentweb.core.client.MiddlewareWebChromeBase;
import com.just.agentweb.core.client.MiddlewareWebClientBase;
import com.just.agentweb.core.web.AgentWebUIControllerImplBase;
import com.just.agentweb.core.web.IAgentWebSettings;
import com.just.agentweb.widget.IWebLayout;

public class AgentWeb$CommonBuilder
{
  public AgentWeb.AgentBuilder OooO00o;
  
  public AgentWeb$CommonBuilder(AgentWeb.AgentBuilder paramAgentBuilder)
  {
    this.OooO00o = paramAgentBuilder;
  }
  
  public CommonBuilder OooO(WebChromeClient paramWebChromeClient)
  {
    AgentWeb.AgentBuilder.OooOO0(this.OooO00o, paramWebChromeClient);
    return this;
  }
  
  public CommonBuilder OooO00o(String paramString, Object paramObject)
  {
    AgentWeb.AgentBuilder.OoooO00(this.OooO00o, paramString, paramObject);
    return this;
  }
  
  public AgentWeb.PreAgentWeb OooO0O0()
  {
    return AgentWeb.AgentBuilder.Oooo(this.OooO00o);
  }
  
  public CommonBuilder OooO0OO()
  {
    AgentWeb.AgentBuilder.OooOooo(this.OooO00o, true);
    return this;
  }
  
  public CommonBuilder OooO0Oo(AgentWebUIControllerImplBase paramAgentWebUIControllerImplBase)
  {
    AgentWeb.AgentBuilder.OooOo0o(this.OooO00o, paramAgentWebUIControllerImplBase);
    return this;
  }
  
  public CommonBuilder OooO0o(int paramInt1, int paramInt2)
  {
    AgentWeb.AgentBuilder.OooOoO0(this.OooO00o, paramInt1);
    AgentWeb.AgentBuilder.OooOoOO(this.OooO00o, paramInt2);
    return this;
  }
  
  public CommonBuilder OooO0o0(IAgentWebSettings paramIAgentWebSettings)
  {
    AgentWeb.AgentBuilder.OooOOO(this.OooO00o, paramIAgentWebSettings);
    return this;
  }
  
  public CommonBuilder OooO0oO(PermissionInterceptor paramPermissionInterceptor)
  {
    AgentWeb.AgentBuilder.OooOOo0(this.OooO00o, paramPermissionInterceptor);
    return this;
  }
  
  public CommonBuilder OooO0oo(AgentWeb.SecurityType paramSecurityType)
  {
    AgentWeb.AgentBuilder.OooOo00(this.OooO00o, paramSecurityType);
    return this;
  }
  
  public CommonBuilder OooOO0(IWebLayout paramIWebLayout)
  {
    AgentWeb.AgentBuilder.OooO0oO(this.OooO00o, paramIWebLayout);
    return this;
  }
  
  public CommonBuilder OooOO0O(WebViewClient paramWebViewClient)
  {
    AgentWeb.AgentBuilder.OooOO0o(this.OooO00o, paramWebViewClient);
    return this;
  }
  
  public CommonBuilder OooOO0o(MiddlewareWebChromeBase paramMiddlewareWebChromeBase)
  {
    if (paramMiddlewareWebChromeBase == null) {
      return this;
    }
    Object localObject = AgentWeb.AgentBuilder.Oooo0O0(this.OooO00o);
    if (localObject == null)
    {
      localObject = this.OooO00o;
      paramMiddlewareWebChromeBase = AgentWeb.AgentBuilder.Oooo0oo((AgentWeb.AgentBuilder)localObject, paramMiddlewareWebChromeBase);
      AgentWeb.AgentBuilder.Oooo0OO((AgentWeb.AgentBuilder)localObject, paramMiddlewareWebChromeBase);
    }
    else
    {
      AgentWeb.AgentBuilder.Oooo0oO(this.OooO00o).OooO00o(paramMiddlewareWebChromeBase);
      localObject = this.OooO00o;
      AgentWeb.AgentBuilder.Oooo0oo((AgentWeb.AgentBuilder)localObject, paramMiddlewareWebChromeBase);
    }
    return this;
  }
  
  public CommonBuilder OooOOO0(MiddlewareWebClientBase paramMiddlewareWebClientBase)
  {
    if (paramMiddlewareWebClientBase == null) {
      return this;
    }
    Object localObject = AgentWeb.AgentBuilder.Oooo00O(this.OooO00o);
    if (localObject == null)
    {
      localObject = this.OooO00o;
      paramMiddlewareWebClientBase = AgentWeb.AgentBuilder.Oooo0o((AgentWeb.AgentBuilder)localObject, paramMiddlewareWebClientBase);
      AgentWeb.AgentBuilder.Oooo00o((AgentWeb.AgentBuilder)localObject, paramMiddlewareWebClientBase);
    }
    else
    {
      AgentWeb.AgentBuilder.Oooo0o0(this.OooO00o).OooO00o(paramMiddlewareWebClientBase);
      localObject = this.OooO00o;
      AgentWeb.AgentBuilder.Oooo0o((AgentWeb.AgentBuilder)localObject, paramMiddlewareWebClientBase);
    }
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.AgentWeb.CommonBuilder
 * JD-Core Version:    0.7.0.1
 */