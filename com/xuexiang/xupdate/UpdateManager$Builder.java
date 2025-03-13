package com.xuexiang.xupdate;

import android.content.Context;
import com.xuexiang.xupdate.entity.PromptEntity;
import com.xuexiang.xupdate.proxy.IUpdateChecker;
import com.xuexiang.xupdate.proxy.IUpdateDownloader;
import com.xuexiang.xupdate.proxy.IUpdateHttpService;
import com.xuexiang.xupdate.proxy.IUpdateParser;
import com.xuexiang.xupdate.proxy.IUpdatePrompter;
import com.xuexiang.xupdate.service.OnFileDownloadListener;
import java.util.Map;
import java.util.TreeMap;
import m54207b69;

public class UpdateManager$Builder
{
  public IUpdateChecker OooO;
  public Context OooO00o;
  public String OooO0O0;
  public Map OooO0OO;
  public IUpdateHttpService OooO0Oo;
  public boolean OooO0o;
  public IUpdateParser OooO0o0;
  public boolean OooO0oO;
  public boolean OooO0oo;
  public PromptEntity OooOO0;
  public IUpdatePrompter OooOO0O;
  public IUpdateDownloader OooOO0o;
  public String OooOOO;
  public OnFileDownloadListener OooOOO0;
  
  public UpdateManager$Builder(Context paramContext)
  {
    this.OooO00o = paramContext;
    paramContext = new java/util/TreeMap;
    paramContext.<init>();
    this.OooO0OO = paramContext;
    paramContext = _XUpdate.getParams();
    if (paramContext != null)
    {
      paramContext = this.OooO0OO;
      Map localMap = _XUpdate.getParams();
      paramContext.putAll(localMap);
    }
    paramContext = new com/xuexiang/xupdate/entity/PromptEntity;
    paramContext.<init>();
    this.OooOO0 = paramContext;
    paramContext = _XUpdate.getIUpdateHttpService();
    this.OooO0Oo = paramContext;
    paramContext = _XUpdate.getIUpdateChecker();
    this.OooO = paramContext;
    paramContext = _XUpdate.getIUpdateParser();
    this.OooO0o0 = paramContext;
    paramContext = _XUpdate.getIUpdatePrompter();
    this.OooOO0O = paramContext;
    paramContext = _XUpdate.getIUpdateDownLoader();
    this.OooOO0o = paramContext;
    boolean bool = _XUpdate.isGet();
    this.OooO0o = bool;
    bool = _XUpdate.isWifiOnly();
    this.OooO0oO = bool;
    bool = _XUpdate.isAutoMode();
    this.OooO0oo = bool;
    paramContext = _XUpdate.getApkCacheDir();
    this.OooOOO = paramContext;
  }
  
  public UpdateManager OooO00o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (UpdateManager)m54207b69.F54207b69_09(6557, arrayOfObject);
  }
  
  public Builder OooO0O0(String paramString, Object paramObject)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = paramObject;
    return (Builder)m54207b69.F54207b69_09(6558, arrayOfObject);
  }
  
  public Builder OooO0OO(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    return (Builder)m54207b69.F54207b69_09(6559, arrayOfObject);
  }
  
  public Builder OooO0Oo(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    return (Builder)m54207b69.F54207b69_09(6560, arrayOfObject);
  }
  
  public Builder OooO0o(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (Builder)m54207b69.F54207b69_09(6561, arrayOfObject);
  }
  
  public void OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6562, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate.UpdateManager.Builder
 * JD-Core Version:    0.7.0.1
 */