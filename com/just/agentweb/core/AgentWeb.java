package com.just.agentweb.core;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import com.just.agentweb.core.client.DefaultChromeClient;
import com.just.agentweb.core.client.DefaultWebClient;
import com.just.agentweb.core.client.DefaultWebClient.Builder;
import com.just.agentweb.core.client.DefaultWebClient.OpenOtherPageWays;
import com.just.agentweb.core.client.MiddlewareWebChromeBase;
import com.just.agentweb.core.client.MiddlewareWebClientBase;
import com.just.agentweb.core.client.WebListenerManager;
import com.just.agentweb.core.event.EventHandlerImpl;
import com.just.agentweb.core.event.EventInterceptor;
import com.just.agentweb.core.event.IEventHandler;
import com.just.agentweb.core.url.HttpHeaders;
import com.just.agentweb.core.url.IUrlLoader;
import com.just.agentweb.core.url.UrlLoaderImpl;
import com.just.agentweb.core.video.IVideo;
import com.just.agentweb.core.video.VideoImpl;
import com.just.agentweb.core.web.AbsAgentWebSettings;
import com.just.agentweb.core.web.AgentWebConfig;
import com.just.agentweb.core.web.AgentWebUIControllerImplBase;
import com.just.agentweb.core.web.IAgentWebSettings;
import com.just.agentweb.core.web.controller.AbsAgentWebUIController;
import com.just.agentweb.core.web.lifecycle.DefaultWebLifeCycleImpl;
import com.just.agentweb.core.web.lifecycle.WebLifeCycle;
import com.just.agentweb.js.AgentWebJsInterfaceCompat;
import com.just.agentweb.js.JsAccessEntrace;
import com.just.agentweb.js.JsAccessEntraceImpl;
import com.just.agentweb.js.JsInterfaceHolder;
import com.just.agentweb.js.JsInterfaceHolderImpl;
import com.just.agentweb.security.WebSecurityCheckLogic;
import com.just.agentweb.security.WebSecurityController;
import com.just.agentweb.security.WebSecurityControllerImpl;
import com.just.agentweb.security.WebSecurityLogicImpl;
import com.just.agentweb.utils.LogUtils;
import com.just.agentweb.widget.IWebLayout;
import com.just.agentweb.widget.WebParentLayout;
import com.just.agentweb.widget.indicator.BaseIndicatorSpec;
import com.just.agentweb.widget.indicator.BaseIndicatorView;
import com.just.agentweb.widget.indicator.DefaultWebCreator;
import com.just.agentweb.widget.indicator.IWebIndicator;
import com.just.agentweb.widget.indicator.IndicatorController;
import com.just.agentweb.widget.indicator.IndicatorHandler;
import com.just.agentweb.widget.indicator.WebCreator;
import java.util.Map;
import m54207b69;

public final class AgentWeb
{
  public static final String OooOooo = "AgentWeb";
  public boolean OooO;
  public Activity OooO00o;
  public ViewGroup OooO0O0;
  public WebCreator OooO0OO;
  public IAgentWebSettings OooO0Oo;
  public IndicatorController OooO0o;
  public AgentWeb OooO0o0;
  public WebChromeClient OooO0oO;
  public WebViewClient OooO0oo;
  public IEventHandler OooOO0;
  public ArrayMap OooOO0O;
  public int OooOO0o;
  public WebSecurityController OooOOO;
  public WebListenerManager OooOOO0;
  public WebSecurityCheckLogic OooOOOO;
  public WebChromeClient OooOOOo;
  public AgentWebJsInterfaceCompat OooOOo;
  public AgentWeb.SecurityType OooOOo0;
  public JsAccessEntrace OooOOoo;
  public PermissionInterceptor OooOo;
  public WebLifeCycle OooOo0;
  public IUrlLoader OooOo00;
  public IVideo OooOo0O;
  public boolean OooOo0o;
  public int OooOoO;
  public boolean OooOoO0;
  public MiddlewareWebClientBase OooOoOO;
  public EventInterceptor OooOoo;
  public MiddlewareWebChromeBase OooOoo0;
  public JsInterfaceHolder OooOooO;
  
  public AgentWeb(AgentWeb.AgentBuilder paramAgentBuilder)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    this.OooO0o0 = null;
    Object localObject2 = new androidx/collection/ArrayMap;
    ((ArrayMap)localObject2).<init>();
    this.OooOO0O = ((ArrayMap)localObject2);
    this.OooOO0o = 0;
    this.OooOOO = null;
    this.OooOOOO = null;
    Object localObject3 = AgentWeb.SecurityType.o00OoOoo;
    this.OooOOo0 = ((AgentWeb.SecurityType)localObject3);
    this.OooOOo = null;
    this.OooOOoo = null;
    this.OooOo00 = null;
    this.OooOo0O = null;
    int j = 1;
    this.OooOo0o = j;
    this.OooOoO0 = false;
    this.OooOoO = -1;
    this.OooOooO = null;
    int k = AgentWeb.AgentBuilder.OooO00o(paramAgentBuilder);
    this.OooOO0o = k;
    localObject2 = AgentWeb.AgentBuilder.OooO0O0(paramAgentBuilder);
    this.OooO00o = ((Activity)localObject2);
    localObject2 = AgentWeb.AgentBuilder.OooOOo(paramAgentBuilder);
    this.OooO0O0 = ((ViewGroup)localObject2);
    localObject2 = AgentWeb.AgentBuilder.Oooo0(paramAgentBuilder);
    this.OooOO0 = ((IEventHandler)localObject2);
    boolean bool2 = AgentWeb.AgentBuilder.OoooO0(paramAgentBuilder);
    this.OooO = bool2;
    localObject2 = AgentWeb.AgentBuilder.OoooO0O(paramAgentBuilder);
    if (localObject2 == null)
    {
      localObject4 = AgentWeb.AgentBuilder.OoooO(paramAgentBuilder);
      int n = AgentWeb.AgentBuilder.OoooOO0(paramAgentBuilder);
      ViewGroup.LayoutParams localLayoutParams = AgentWeb.AgentBuilder.o000oOoO(paramAgentBuilder);
      int i1 = AgentWeb.AgentBuilder.OoooOOO(paramAgentBuilder);
      int i2 = AgentWeb.AgentBuilder.OooO0OO(paramAgentBuilder);
      WebView localWebView = AgentWeb.AgentBuilder.OooO0o0(paramAgentBuilder);
      IWebLayout localIWebLayout = AgentWeb.AgentBuilder.OooO0o(paramAgentBuilder);
      localObject3 = this;
      localObject2 = OooO0Oo((BaseIndicatorView)localObject4, n, localLayoutParams, i1, i2, localWebView, localIWebLayout);
    }
    else
    {
      localObject2 = AgentWeb.AgentBuilder.OoooO0O(paramAgentBuilder);
    }
    this.OooO0OO = ((WebCreator)localObject2);
    localObject2 = AgentWeb.AgentBuilder.OooO0oo(paramAgentBuilder);
    this.OooO0o = ((IndicatorController)localObject2);
    localObject2 = AgentWeb.AgentBuilder.OooO(paramAgentBuilder);
    this.OooO0oO = ((WebChromeClient)localObject2);
    localObject2 = AgentWeb.AgentBuilder.OooOO0O(paramAgentBuilder);
    this.OooO0oo = ((WebViewClient)localObject2);
    this.OooO0o0 = this;
    localObject2 = AgentWeb.AgentBuilder.OooOOO0(paramAgentBuilder);
    this.OooO0Oo = ((IAgentWebSettings)localObject2);
    localObject2 = AgentWeb.AgentBuilder.OooOOOO(paramAgentBuilder);
    if (localObject2 != null)
    {
      localObject2 = AgentWeb.AgentBuilder.OooOOOO(paramAgentBuilder);
      bool2 = ((SimpleArrayMap)localObject2).isEmpty();
      if (!bool2)
      {
        localObject2 = this.OooOO0O;
        localObject3 = AgentWeb.AgentBuilder.OooOOOO(paramAgentBuilder);
        ((ArrayMap)localObject2).putAll((Map)localObject3);
        localObject2 = OooOooo;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = m54207b69.F54207b69_11("b}10381E0E2037251E202713681A21152757");
        ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = this.OooOO0O;
        int i3 = ((SimpleArrayMap)localObject4).size();
        ((StringBuilder)localObject3).append(i3);
        localObject3 = ((StringBuilder)localObject3).toString();
        LogUtils.OooO0OO((String)localObject2, (String)localObject3);
      }
    }
    localObject2 = AgentWeb.AgentBuilder.OooOOOo(paramAgentBuilder);
    if (localObject2 != null)
    {
      localObject2 = new com/just/agentweb/core/AgentWeb$PermissionInterceptorWrapper;
      localObject3 = AgentWeb.AgentBuilder.OooOOOo(paramAgentBuilder);
      ((AgentWeb.PermissionInterceptorWrapper)localObject2).<init>((PermissionInterceptor)localObject3, null);
      localObject1 = localObject2;
    }
    this.OooOo = ((PermissionInterceptor)localObject1);
    localObject1 = AgentWeb.AgentBuilder.OooOOoo(paramAgentBuilder);
    this.OooOOo0 = ((AgentWeb.SecurityType)localObject1);
    localObject1 = new com/just/agentweb/core/url/UrlLoaderImpl;
    localObject2 = this.OooO0OO.OooO00o().getWebView();
    localObject3 = AgentWeb.AgentBuilder.OooOo0(paramAgentBuilder);
    ((UrlLoaderImpl)localObject1).<init>((WebView)localObject2, (HttpHeaders)localObject3);
    this.OooOo00 = ((IUrlLoader)localObject1);
    localObject1 = this.OooO0OO.getWebParentLayout();
    bool1 = localObject1 instanceof WebParentLayout;
    if (bool1)
    {
      localObject1 = (WebParentLayout)this.OooO0OO.getWebParentLayout();
      localObject2 = AgentWeb.AgentBuilder.OooOo0O(paramAgentBuilder);
      if (localObject2 == null) {
        localObject2 = AgentWebUIControllerImplBase.OooOOO();
      } else {
        localObject2 = AgentWeb.AgentBuilder.OooOo0O(paramAgentBuilder);
      }
      ((WebParentLayout)localObject1).OooO00o((AbsAgentWebUIController)localObject2);
      int m = AgentWeb.AgentBuilder.OooOo(paramAgentBuilder);
      j = AgentWeb.AgentBuilder.OooOoO(paramAgentBuilder);
      ((WebParentLayout)localObject1).setErrorLayoutRes(m, j);
      localObject2 = AgentWeb.AgentBuilder.OooOoo0(paramAgentBuilder);
      ((WebParentLayout)localObject1).setErrorView((View)localObject2);
    }
    localObject1 = new com/just/agentweb/core/web/lifecycle/DefaultWebLifeCycleImpl;
    localObject2 = this.OooO0OO.getWebView();
    ((DefaultWebLifeCycleImpl)localObject1).<init>((WebView)localObject2);
    this.OooOo0 = ((WebLifeCycle)localObject1);
    localObject1 = new com/just/agentweb/security/WebSecurityControllerImpl;
    localObject2 = this.OooO0OO.getWebView();
    localObject3 = this.OooO0o0.OooOO0O;
    Object localObject4 = this.OooOOo0;
    ((WebSecurityControllerImpl)localObject1).<init>((WebView)localObject2, (ArrayMap)localObject3, (AgentWeb.SecurityType)localObject4);
    this.OooOOO = ((WebSecurityController)localObject1);
    bool1 = AgentWeb.AgentBuilder.OooOoo(paramAgentBuilder);
    this.OooOo0o = bool1;
    bool1 = AgentWeb.AgentBuilder.OooOooO(paramAgentBuilder);
    this.OooOoO0 = bool1;
    localObject1 = AgentWeb.AgentBuilder.Oooo000(paramAgentBuilder);
    if (localObject1 != null)
    {
      localObject1 = AgentWeb.AgentBuilder.Oooo000(paramAgentBuilder);
      int i = ((DefaultWebClient.OpenOtherPageWays)localObject1).getCode();
      this.OooOoO = i;
    }
    localObject1 = AgentWeb.AgentBuilder.Oooo00O(paramAgentBuilder);
    this.OooOoOO = ((MiddlewareWebClientBase)localObject1);
    paramAgentBuilder = AgentWeb.AgentBuilder.Oooo0O0(paramAgentBuilder);
    this.OooOoo0 = paramAgentBuilder;
    OooOO0();
  }
  
  public static AgentWeb.AgentBuilder OooOO0o(Fragment paramFragment)
  {
    Object localObject = paramFragment.getActivity();
    if (localObject != null)
    {
      AgentWeb.AgentBuilder localAgentBuilder = new com/just/agentweb/core/AgentWeb$AgentBuilder;
      localAgentBuilder.<init>((Activity)localObject, paramFragment);
      return localAgentBuilder;
    }
    paramFragment = new java/lang/NullPointerException;
    localObject = m54207b69.F54207b69_11("$R3332283E28402C327A3A3D477E494B3582414985503C54558A95");
    paramFragment.<init>((String)localObject);
    throw paramFragment;
  }
  
  private WebChromeClient getChromeClient()
  {
    Object localObject1 = this.OooO0o;
    if (localObject1 == null)
    {
      localObject1 = IndicatorHandler.getInstance();
      localObject2 = this.OooO0OO.OooO0O0();
      localObject1 = ((IndicatorHandler)localObject1).OooO0Oo((BaseIndicatorSpec)localObject2);
    }
    Object localObject3 = localObject1;
    localObject1 = new com/just/agentweb/core/client/DefaultChromeClient;
    Object localObject4 = this.OooO00o;
    this.OooO0o = ((IndicatorController)localObject3);
    Object localObject5 = this.OooO0oO;
    Object localObject6 = getIVideo();
    this.OooOo0O = ((IVideo)localObject6);
    Object localObject7 = this.OooOo;
    WebView localWebView = this.OooO0OO.getWebView();
    Object localObject2 = localObject1;
    ((DefaultChromeClient)localObject1).<init>((Activity)localObject4, (IndicatorController)localObject3, (WebChromeClient)localObject5, (IVideo)localObject6, (PermissionInterceptor)localObject7, localWebView);
    localObject2 = OooOooo;
    localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject3 = m54207b69.F54207b69_11("Vn390C0E300A21070A13360C12170D2863");
    ((StringBuilder)localObject4).append((String)localObject3);
    localObject3 = this.OooO0oO;
    ((StringBuilder)localObject4).append(localObject3);
    localObject4 = ((StringBuilder)localObject4).toString();
    LogUtils.OooO0OO((String)localObject2, (String)localObject4);
    localObject2 = this.OooOoo0;
    if (localObject2 != null)
    {
      int i = 1;
      localObject3 = localObject2;
      for (;;)
      {
        localObject5 = ((MiddlewareWebChromeBase)localObject3).OooO0O0();
        if (localObject5 == null) {
          break;
        }
        localObject3 = ((MiddlewareWebChromeBase)localObject3).OooO0O0();
        i += 1;
      }
      localObject5 = OooOooo;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      localObject7 = m54207b69.F54207b69_11(".y34111F201921141F132538272747231F2C281F4E2C1F32702C29373831392C372B3D7B3D3A313D346B");
      ((StringBuilder)localObject6).append((String)localObject7);
      ((StringBuilder)localObject6).append(i);
      localObject4 = ((StringBuilder)localObject6).toString();
      LogUtils.OooO0OO((String)localObject5, (String)localObject4);
      ((MiddlewareWebChromeBase)localObject3).setDelegate((WebChromeClient)localObject1);
      this.OooOOOo = ((WebChromeClient)localObject2);
      return localObject2;
    }
    this.OooOOOo = ((WebChromeClient)localObject1);
    return localObject1;
  }
  
  private IVideo getIVideo()
  {
    Object localObject = this.OooOo0O;
    if (localObject == null)
    {
      localObject = new com/just/agentweb/core/video/VideoImpl;
      Activity localActivity = this.OooO00o;
      WebView localWebView = this.OooO0OO.getWebView();
      ((VideoImpl)localObject).<init>(localActivity, localWebView);
    }
    return localObject;
  }
  
  private EventInterceptor getInterceptor()
  {
    Object localObject = this.OooOoo;
    if (localObject != null) {
      return localObject;
    }
    localObject = this.OooOo0O;
    boolean bool = localObject instanceof VideoImpl;
    if (bool)
    {
      localObject = (EventInterceptor)localObject;
      this.OooOoo = ((EventInterceptor)localObject);
      return localObject;
    }
    return null;
  }
  
  private WebViewClient getWebViewClient()
  {
    Object localObject1 = OooOooo;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = m54207b69.F54207b69_11("tp1716063719211B1E190D1F55");
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject3 = this.OooOoOO;
    ((StringBuilder)localObject2).append(localObject3);
    localObject2 = ((StringBuilder)localObject2).toString();
    LogUtils.OooO0OO((String)localObject1, (String)localObject2);
    localObject1 = DefaultWebClient.OooO0Oo();
    localObject2 = this.OooO00o;
    localObject1 = ((DefaultWebClient.Builder)localObject1).OooO0oo((Activity)localObject2);
    localObject2 = this.OooO0oo;
    localObject1 = ((DefaultWebClient.Builder)localObject1).OooO((WebViewClient)localObject2);
    boolean bool = this.OooOo0o;
    localObject1 = ((DefaultWebClient.Builder)localObject1).OooOOO0(bool);
    localObject2 = this.OooOo;
    localObject1 = ((DefaultWebClient.Builder)localObject1).OooOO0O((PermissionInterceptor)localObject2);
    localObject2 = this.OooO0OO.getWebView();
    localObject1 = ((DefaultWebClient.Builder)localObject1).OooOOO((WebView)localObject2);
    bool = this.OooOoO0;
    localObject1 = ((DefaultWebClient.Builder)localObject1).OooOO0(bool);
    int i = this.OooOoO;
    localObject1 = ((DefaultWebClient.Builder)localObject1).OooOO0o(i).OooO0oO();
    localObject2 = this.OooOoOO;
    if (localObject2 != null)
    {
      int j = 1;
      Object localObject4 = localObject2;
      for (;;)
      {
        localObject5 = ((MiddlewareWebClientBase)localObject4).OooO0O0();
        if (localObject5 == null) {
          break;
        }
        localObject4 = ((MiddlewareWebClientBase)localObject4).OooO0O0();
        j += 1;
      }
      Object localObject5 = OooOooo;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = m54207b69.F54207b69_11(".y34111F201921141F132538272747231F2C281F4E2C1F32702C29373831392C372B3D7B3D3A313D346B");
      localStringBuilder.append(str);
      localStringBuilder.append(j);
      localObject3 = localStringBuilder.toString();
      LogUtils.OooO0OO((String)localObject5, (String)localObject3);
      ((MiddlewareWebClientBase)localObject4).setDelegate((WebViewClient)localObject1);
      return localObject2;
    }
    return localObject1;
  }
  
  public boolean OooO(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = this.OooOO0;
    if (localObject == null)
    {
      localObject = this.OooO0OO.getWebView();
      EventInterceptor localEventInterceptor = getInterceptor();
      localObject = EventHandlerImpl.OooO0O0((WebView)localObject, localEventInterceptor);
      this.OooOO0 = ((IEventHandler)localObject);
    }
    return this.OooOO0.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean OooO0OO()
  {
    Object localObject = this.OooOO0;
    if (localObject == null)
    {
      localObject = this.OooO0OO.getWebView();
      EventInterceptor localEventInterceptor = getInterceptor();
      localObject = EventHandlerImpl.OooO0O0((WebView)localObject, localEventInterceptor);
      this.OooOO0 = ((IEventHandler)localObject);
    }
    return this.OooOO0.OooO00o();
  }
  
  public final WebCreator OooO0Oo(BaseIndicatorView paramBaseIndicatorView, int paramInt1, ViewGroup.LayoutParams paramLayoutParams, int paramInt2, int paramInt3, WebView paramWebView, IWebLayout paramIWebLayout)
  {
    AgentWeb localAgentWeb = this;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    if (paramBaseIndicatorView != null)
    {
      bool = this.OooO;
      if (bool)
      {
        localObject1 = new com/just/agentweb/widget/indicator/DefaultWebCreator;
        localObject2 = this.OooO00o;
        localObject3 = this.OooO0O0;
        localObject4 = localObject1;
        localObject5 = paramLayoutParams;
        localObject6 = paramBaseIndicatorView;
        localObject7 = paramWebView;
        ((DefaultWebCreator)localObject1).<init>((Activity)localObject2, (ViewGroup)localObject3, paramLayoutParams, paramInt1, paramBaseIndicatorView, paramWebView, paramIWebLayout);
        return localObject1;
      }
    }
    boolean bool = localAgentWeb.OooO;
    if (bool)
    {
      localObject4 = new com/just/agentweb/widget/indicator/DefaultWebCreator;
      localObject3 = localAgentWeb.OooO00o;
      localObject5 = localAgentWeb.OooO0O0;
      localObject2 = localObject4;
      localObject1 = paramWebView;
      ((DefaultWebCreator)localObject4).<init>((Activity)localObject3, (ViewGroup)localObject5, paramLayoutParams, paramInt1, paramInt2, paramInt3, paramWebView, paramIWebLayout);
    }
    else
    {
      localObject4 = new com/just/agentweb/widget/indicator/DefaultWebCreator;
      localObject6 = localAgentWeb.OooO00o;
      localObject7 = localAgentWeb.OooO0O0;
      ((DefaultWebCreator)localObject4).<init>((Activity)localObject6, (ViewGroup)localObject7, paramLayoutParams, paramInt1, paramWebView, paramIWebLayout);
    }
    return localObject4;
  }
  
  public final void OooO0o()
  {
    ArrayMap localArrayMap = this.OooOO0O;
    AgentWebJsInterfaceCompat localAgentWebJsInterfaceCompat = new com/just/agentweb/js/AgentWebJsInterfaceCompat;
    Object localObject = this.OooO00o;
    localAgentWebJsInterfaceCompat.<init>(this, (Activity)localObject);
    this.OooOOo = localAgentWebJsInterfaceCompat;
    localObject = m54207b69.F54207b69_11(">H29302F2940243331");
    localArrayMap.put(localObject, localAgentWebJsInterfaceCompat);
  }
  
  public void OooO0o0()
  {
    this.OooOo0.onDestroy();
  }
  
  public final void OooO0oO()
  {
    Object localObject = this.OooOOOO;
    if (localObject == null)
    {
      localObject = WebSecurityLogicImpl.getInstance();
      this.OooOOOO = ((WebSecurityCheckLogic)localObject);
    }
    this.OooOOO.OooO00o(localObject);
  }
  
  public final AgentWeb OooO0oo(String paramString)
  {
    IUrlLoader localIUrlLoader = getUrlLoader();
    localIUrlLoader.OooO0O0(paramString);
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool)
    {
      paramString = getIndicatorController();
      if (paramString != null)
      {
        paramString = paramString.OooO0O0();
        if (paramString != null)
        {
          paramString = getIndicatorController().OooO0O0();
          paramString.show();
        }
      }
    }
    return this;
  }
  
  public final void OooOO0()
  {
    OooO0o();
    OooO0oO();
  }
  
  public final AgentWeb OooOO0O()
  {
    AgentWebConfig.OooO0o0(this.OooO00o.getApplicationContext());
    Object localObject1 = this.OooO0Oo;
    if (localObject1 == null)
    {
      localObject1 = AbsAgentWebSettings.getInstance();
      this.OooO0Oo = ((IAgentWebSettings)localObject1);
    }
    boolean bool1 = localObject1 instanceof AbsAgentWebSettings;
    if (bool1)
    {
      localObject2 = localObject1;
      localObject2 = (AbsAgentWebSettings)localObject1;
      ((AbsAgentWebSettings)localObject2).OooO0o0(this);
    }
    Object localObject2 = this.OooOOO0;
    if ((localObject2 == null) && (bool1))
    {
      localObject3 = localObject1;
      localObject3 = (WebListenerManager)localObject1;
      this.OooOOO0 = ((WebListenerManager)localObject3);
    }
    Object localObject3 = this.OooO0OO.getWebView();
    ((IAgentWebSettings)localObject1).OooO0OO((WebView)localObject3);
    localObject1 = this.OooOooO;
    if (localObject1 == null)
    {
      localObject1 = this.OooO0OO.getWebView();
      localObject3 = this.OooOOo0;
      localObject1 = JsInterfaceHolderImpl.OooO0o0((WebView)localObject1, (AgentWeb.SecurityType)localObject3);
      this.OooOooO = ((JsInterfaceHolder)localObject1);
    }
    localObject1 = OooOooo;
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject2 = m54207b69.F54207b69_11("&W3A1E38243A1D3B443A3D2D2F79");
    ((StringBuilder)localObject3).append((String)localObject2);
    localObject2 = this.OooOO0O;
    int i = ((SimpleArrayMap)localObject2).size();
    ((StringBuilder)localObject3).append(i);
    localObject3 = ((StringBuilder)localObject3).toString();
    LogUtils.OooO0OO((String)localObject1, (String)localObject3);
    localObject1 = this.OooOO0O;
    if (localObject1 != null)
    {
      boolean bool2 = ((SimpleArrayMap)localObject1).isEmpty();
      if (!bool2)
      {
        localObject1 = this.OooOooO;
        localObject3 = this.OooOO0O;
        ((JsInterfaceHolder)localObject1).OooO00o((Map)localObject3);
      }
    }
    localObject1 = this.OooOOO0;
    if (localObject1 != null)
    {
      localObject3 = this.OooO0OO.getWebView();
      i = 0;
      ((WebListenerManager)localObject1).OooO0O0((WebView)localObject3, null);
      localObject1 = this.OooOOO0;
      localObject3 = this.OooO0OO.getWebView();
      localObject2 = getChromeClient();
      ((WebListenerManager)localObject1).OooO00o((WebView)localObject3, (WebChromeClient)localObject2);
      localObject1 = this.OooOOO0;
      localObject3 = this.OooO0OO.getWebView();
      localObject2 = getWebViewClient();
      ((WebListenerManager)localObject1).OooO0Oo((WebView)localObject3, (WebViewClient)localObject2);
    }
    return this;
  }
  
  public IAgentWebSettings getAgentWebSettings()
  {
    return this.OooO0Oo;
  }
  
  public IEventHandler getIEventHandler()
  {
    Object localObject = this.OooOO0;
    if (localObject == null)
    {
      localObject = this.OooO0OO.getWebView();
      EventInterceptor localEventInterceptor = getInterceptor();
      localObject = EventHandlerImpl.OooO0O0((WebView)localObject, localEventInterceptor);
      this.OooOO0 = ((IEventHandler)localObject);
    }
    return localObject;
  }
  
  public IndicatorController getIndicatorController()
  {
    return this.OooO0o;
  }
  
  public JsAccessEntrace getJsAccessEntrace()
  {
    Object localObject = this.OooOOoo;
    if (localObject == null)
    {
      localObject = JsAccessEntraceImpl.OooO0o(this.OooO0OO.getWebView());
      this.OooOOoo = ((JsAccessEntrace)localObject);
    }
    return localObject;
  }
  
  public JsInterfaceHolder getJsInterfaceHolder()
  {
    return this.OooOooO;
  }
  
  public PermissionInterceptor getPermissionInterceptor()
  {
    return this.OooOo;
  }
  
  public IUrlLoader getUrlLoader()
  {
    return this.OooOo00;
  }
  
  public WebCreator getWebCreator()
  {
    return this.OooO0OO;
  }
  
  public WebLifeCycle getWebLifeCycle()
  {
    return this.OooOo0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.AgentWeb
 * JD-Core Version:    0.7.0.1
 */