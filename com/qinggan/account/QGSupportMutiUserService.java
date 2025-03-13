package com.qinggan.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class QGSupportMutiUserService
  extends Service
{
  public CurrentUserTracker o00OoOoo = null;
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    QGSupportMutiUserService.1 local1 = new com/qinggan/account/QGSupportMutiUserService$1;
    local1.<init>(this, this);
    this.o00OoOoo = local1;
    local1.OooO0O0();
  }
  
  public void onDestroy()
  {
    this.o00OoOoo.OooO0OO();
    super.onDestroy();
    System.exit(0);
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    super.onStart(paramIntent, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.account.QGSupportMutiUserService
 * JD-Core Version:    0.7.0.1
 */