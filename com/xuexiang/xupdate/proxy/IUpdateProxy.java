package com.xuexiang.xupdate.proxy;

import android.content.Context;
import com.xuexiang.xupdate.entity.UpdateEntity;
import com.xuexiang.xupdate.listener.IUpdateParseCallback;
import com.xuexiang.xupdate.service.OnFileDownloadListener;

public abstract interface IUpdateProxy
{
  public abstract void OooO(UpdateEntity paramUpdateEntity, IUpdateProxy paramIUpdateProxy);
  
  public abstract void OooO00o();
  
  public abstract void OooO0O0();
  
  public abstract void OooO0OO(UpdateEntity paramUpdateEntity, OnFileDownloadListener paramOnFileDownloadListener);
  
  public abstract void OooO0Oo();
  
  public abstract void OooO0o(String paramString, IUpdateParseCallback paramIUpdateParseCallback);
  
  public abstract UpdateEntity OooO0o0(String paramString);
  
  public abstract void OooO0oO(Throwable paramThrowable);
  
  public abstract void OooO0oo();
  
  public abstract void OooOO0();
  
  public abstract void Oooo0O0();
  
  public abstract Context getContext();
  
  public abstract IUpdateHttpService getIUpdateHttpService();
  
  public abstract String getUrl();
  
  public abstract boolean isAsyncParser();
  
  public abstract void recycle();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate.proxy.IUpdateProxy
 * JD-Core Version:    0.7.0.1
 */