package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;

public final class AppLocalesMetadataHolderService
  extends Service
{
  public static ServiceInfo OooO00o(Context paramContext)
  {
    int i = AppLocalesMetadataHolderService.Api24Impl.getDisabledComponentFlag() | 0x80;
    PackageManager localPackageManager = paramContext.getPackageManager();
    ComponentName localComponentName = new android/content/ComponentName;
    localComponentName.<init>(paramContext, AppLocalesMetadataHolderService.class);
    return localPackageManager.getServiceInfo(localComponentName, i);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    paramIntent = new java/lang/UnsupportedOperationException;
    paramIntent.<init>();
    throw paramIntent;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppLocalesMetadataHolderService
 * JD-Core Version:    0.7.0.1
 */