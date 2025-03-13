package com.just.agentweb.js;

import android.app.Activity;
import android.webkit.WebView;
import com.just.agentweb.action.PermissionInterceptor;
import com.just.agentweb.core.AgentWeb;
import com.just.agentweb.utils.AgentWebUtils;
import com.just.agentweb.utils.LogUtils;
import com.just.agentweb.widget.indicator.WebCreator;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class AgentWebJsInterfaceCompat
{
  public WeakReference OooO00o = null;
  public WeakReference OooO0O0 = null;
  public String OooO0OO;
  
  public AgentWebJsInterfaceCompat(AgentWeb paramAgentWeb, Activity paramActivity)
  {
    Object localObject = getClass().getSimpleName();
    this.OooO0OO = ((String)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(paramAgentWeb);
    this.OooO00o = ((WeakReference)localObject);
    paramAgentWeb = new java/lang/ref/WeakReference;
    paramAgentWeb.<init>(paramActivity);
    this.OooO0O0 = paramAgentWeb;
  }
  
  public void uploadFile()
  {
    uploadFile("*/*");
  }
  
  public void uploadFile(String paramString)
  {
    Object localObject1 = this.OooO0OO;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append(paramString);
    Object localObject3 = "  ";
    ((StringBuilder)localObject2).append((String)localObject3);
    Object localObject4 = this.OooO0O0.get();
    ((StringBuilder)localObject2).append(localObject4);
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject3 = this.OooO00o.get();
    ((StringBuilder)localObject2).append(localObject3);
    localObject2 = ((StringBuilder)localObject2).toString();
    LogUtils.OooO0OO((String)localObject1, (String)localObject2);
    localObject1 = this.OooO0O0.get();
    if (localObject1 != null)
    {
      localObject1 = this.OooO00o.get();
      if (localObject1 != null)
      {
        localObject1 = this.OooO0O0.get();
        localObject2 = localObject1;
        localObject2 = (Activity)localObject1;
        localObject3 = ((AgentWeb)this.OooO00o.get()).getWebCreator().getWebView();
        localObject4 = null;
        localObject1 = (AgentWeb)this.OooO00o.get();
        PermissionInterceptor localPermissionInterceptor = ((AgentWeb)localObject1).getPermissionInterceptor();
        AgentWebJsInterfaceCompat.1 local1 = new com/just/agentweb/js/AgentWebJsInterfaceCompat$1;
        local1.<init>(this);
        AgentWebUtils.OooOooO((Activity)localObject2, (WebView)localObject3, null, null, localPermissionInterceptor, null, paramString, local1);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.js.AgentWebJsInterfaceCompat
 * JD-Core Version:    0.7.0.1
 */