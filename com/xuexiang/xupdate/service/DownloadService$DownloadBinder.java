package com.xuexiang.xupdate.service;

import android.os.Binder;
import com.xuexiang.xupdate.entity.UpdateEntity;
import m54207b69;

public class DownloadService$DownloadBinder
  extends Binder
{
  public DownloadService.FileDownloadCallBack OooO00o;
  public UpdateEntity OooO0O0;
  
  public DownloadService$DownloadBinder(DownloadService paramDownloadService) {}
  
  public void OooO00o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6763, arrayOfObject);
  }
  
  public void OooO0O0(UpdateEntity paramUpdateEntity, OnFileDownloadListener paramOnFileDownloadListener)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramUpdateEntity;
    arrayOfObject[2] = paramOnFileDownloadListener;
    m54207b69.F54207b69_00(6764, arrayOfObject);
  }
  
  public void OooO0OO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(6765, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate.service.DownloadService.DownloadBinder
 * JD-Core Version:    0.7.0.1
 */