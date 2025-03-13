package com.xuexiang.xupdate.proxy.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xuexiang.xupdate.entity.UpdateEntity;
import com.xuexiang.xupdate.service.OnFileDownloadListener;
import m54207b69;

class DefaultUpdateDownloader$1
  implements ServiceConnection
{
  public DefaultUpdateDownloader$1(DefaultUpdateDownloader paramDefaultUpdateDownloader, UpdateEntity paramUpdateEntity, OnFileDownloadListener paramOnFileDownloadListener) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramComponentName;
    arrayOfObject[2] = paramIBinder;
    m54207b69.F54207b69_00(6743, arrayOfObject);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramComponentName;
    m54207b69.F54207b69_00(6744, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate.proxy.impl.DefaultUpdateDownloader.1
 * JD-Core Version:    0.7.0.1
 */