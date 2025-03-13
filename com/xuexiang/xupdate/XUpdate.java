package com.xuexiang.xupdate;

import android.app.Application;
import android.content.Context;
import com.xuexiang.xupdate.listener.OnInstallListener;
import com.xuexiang.xupdate.listener.OnUpdateFailureListener;
import com.xuexiang.xupdate.listener.impl.DefaultInstallListener;
import com.xuexiang.xupdate.listener.impl.DefaultUpdateFailureListener;
import com.xuexiang.xupdate.logs.UpdateLog;
import com.xuexiang.xupdate.proxy.IFileEncryptor;
import com.xuexiang.xupdate.proxy.IUpdateChecker;
import com.xuexiang.xupdate.proxy.IUpdateDownloader;
import com.xuexiang.xupdate.proxy.IUpdateHttpService;
import com.xuexiang.xupdate.proxy.IUpdateParser;
import com.xuexiang.xupdate.proxy.IUpdatePrompter;
import com.xuexiang.xupdate.proxy.impl.DefaultFileEncryptor;
import com.xuexiang.xupdate.proxy.impl.DefaultUpdateChecker;
import com.xuexiang.xupdate.proxy.impl.DefaultUpdateDownloader;
import com.xuexiang.xupdate.proxy.impl.DefaultUpdateParser;
import com.xuexiang.xupdate.proxy.impl.DefaultUpdatePrompter;
import java.util.Map;
import m54207b69;

public class XUpdate
{
  public static XUpdate OooOOOO;
  public IUpdateParser OooO;
  public Application OooO00o;
  public Map OooO0O0;
  public boolean OooO0OO = false;
  public boolean OooO0Oo = true;
  public String OooO0o;
  public boolean OooO0o0 = false;
  public IUpdateHttpService OooO0oO;
  public IUpdateChecker OooO0oo;
  public IUpdatePrompter OooOO0;
  public IUpdateDownloader OooOO0O;
  public IFileEncryptor OooOO0o;
  public OnUpdateFailureListener OooOOO;
  public OnInstallListener OooOOO0;
  
  private XUpdate()
  {
    Object localObject = new com/xuexiang/xupdate/proxy/impl/DefaultUpdateChecker;
    ((DefaultUpdateChecker)localObject).<init>();
    this.OooO0oo = ((IUpdateChecker)localObject);
    localObject = new com/xuexiang/xupdate/proxy/impl/DefaultUpdateParser;
    ((DefaultUpdateParser)localObject).<init>();
    this.OooO = ((IUpdateParser)localObject);
    localObject = new com/xuexiang/xupdate/proxy/impl/DefaultUpdateDownloader;
    ((DefaultUpdateDownloader)localObject).<init>();
    this.OooOO0O = ((IUpdateDownloader)localObject);
    localObject = new com/xuexiang/xupdate/proxy/impl/DefaultUpdatePrompter;
    ((DefaultUpdatePrompter)localObject).<init>();
    this.OooOO0 = ((IUpdatePrompter)localObject);
    localObject = new com/xuexiang/xupdate/proxy/impl/DefaultFileEncryptor;
    ((DefaultFileEncryptor)localObject).<init>();
    this.OooOO0o = ((IFileEncryptor)localObject);
    localObject = new com/xuexiang/xupdate/listener/impl/DefaultInstallListener;
    ((DefaultInstallListener)localObject).<init>();
    this.OooOOO0 = ((OnInstallListener)localObject);
    localObject = new com/xuexiang/xupdate/listener/impl/DefaultUpdateFailureListener;
    ((DefaultUpdateFailureListener)localObject).<init>();
    this.OooOOO = ((OnUpdateFailureListener)localObject);
  }
  
  public static UpdateManager.Builder OooO0o(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return (UpdateManager.Builder)m54207b69.F54207b69_09(6587, arrayOfObject);
  }
  
  public static XUpdate get()
  {
    Object[] arrayOfObject = new Object[0];
    return (XUpdate)m54207b69.F54207b69_09(6595, arrayOfObject);
  }
  
  private Application getApplication()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Application)m54207b69.F54207b69_09(6596, arrayOfObject);
  }
  
  public static Context getContext()
  {
    Object[] arrayOfObject = new Object[0];
    return (Context)m54207b69.F54207b69_09(6597, arrayOfObject);
  }
  
  public XUpdate OooO(IUpdateHttpService paramIUpdateHttpService)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("设置全局更新网络请求服务:");
    String str = paramIUpdateHttpService.getClass().getCanonicalName();
    localStringBuilder.append(str);
    UpdateLog.OooO00o(localStringBuilder.toString());
    this.OooO0oO = paramIUpdateHttpService;
    return this;
  }
  
  public XUpdate OooO00o(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (XUpdate)m54207b69.F54207b69_09(6583, arrayOfObject);
  }
  
  public void OooO0O0(Application paramApplication)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramApplication;
    m54207b69.F54207b69_00(6584, arrayOfObject);
  }
  
  public XUpdate OooO0OO(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (XUpdate)m54207b69.F54207b69_09(6585, arrayOfObject);
  }
  
  public XUpdate OooO0Oo(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (XUpdate)m54207b69.F54207b69_09(6586, arrayOfObject);
  }
  
  public XUpdate OooO0o0(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (XUpdate)m54207b69.F54207b69_09(6588, arrayOfObject);
  }
  
  public XUpdate OooO0oO(String paramString, Object paramObject)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = paramObject;
    return (XUpdate)m54207b69.F54207b69_09(6589, arrayOfObject);
  }
  
  public XUpdate OooO0oo(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (XUpdate)m54207b69.F54207b69_09(6590, arrayOfObject);
  }
  
  public XUpdate OooOO0(OnInstallListener paramOnInstallListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnInstallListener;
    return (XUpdate)m54207b69.F54207b69_09(6591, arrayOfObject);
  }
  
  public XUpdate OooOO0O(OnUpdateFailureListener paramOnUpdateFailureListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnUpdateFailureListener;
    return (XUpdate)m54207b69.F54207b69_09(6592, arrayOfObject);
  }
  
  public XUpdate OooOO0o(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (XUpdate)m54207b69.F54207b69_09(6593, arrayOfObject);
  }
  
  public final void OooOOO0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6594, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate.XUpdate
 * JD-Core Version:    0.7.0.1
 */