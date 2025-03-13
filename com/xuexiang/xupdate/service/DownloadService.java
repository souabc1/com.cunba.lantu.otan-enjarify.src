package com.xuexiang.xupdate.service;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.app.NotificationManagerCompat;
import com.xuexiang.xupdate.entity.DownloadEntity;
import com.xuexiang.xupdate.entity.UpdateEntity;
import java.io.File;
import m54207b69;

public class DownloadService
  extends Service
{
  public static boolean o00Ooo0 = false;
  public static final CharSequence o00Ooo0O = m54207b69.F54207b69_11("3Q29252338342A3A153A423A4A4B414B1D4F414E47");
  public NotificationManagerCompat o00OoOoo;
  public NotificationCompat.Builder o00Ooo00;
  
  public static void OooOO0(ServiceConnection paramServiceConnection)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramServiceConnection;
    m54207b69.F54207b69_00(6791, arrayOfObject);
  }
  
  private NotificationCompat.Builder getNotificationBuilder()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (NotificationCompat.Builder)m54207b69.F54207b69_09(6797, arrayOfObject);
  }
  
  public static boolean isRunning()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(6798, arrayOfObject);
  }
  
  private void setUpNotification(DownloadEntity paramDownloadEntity)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDownloadEntity;
    m54207b69.F54207b69_00(6803, arrayOfObject);
  }
  
  public final void OooOO0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6792, arrayOfObject);
  }
  
  public final void OooOO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6793, arrayOfObject);
  }
  
  public final void OooOOO(UpdateEntity paramUpdateEntity, DownloadService.FileDownloadCallBack paramFileDownloadCallBack)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramUpdateEntity;
    arrayOfObject[2] = paramFileDownloadCallBack;
    m54207b69.F54207b69_00(6794, arrayOfObject);
  }
  
  public final void OooOOO0(File paramFile)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramFile;
    m54207b69.F54207b69_00(6795, arrayOfObject);
  }
  
  public final void OooOOOO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(6796, arrayOfObject);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramIntent;
    return (IBinder)m54207b69.F54207b69_09(6799, arrayOfObject);
  }
  
  public void onCreate()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6800, arrayOfObject);
  }
  
  public void onDestroy()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6801, arrayOfObject);
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramIntent;
    return m54207b69.F54207b69_01(6802, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate.service.DownloadService
 * JD-Core Version:    0.7.0.1
 */