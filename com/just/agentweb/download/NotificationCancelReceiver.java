package com.just.agentweb.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.just.agentweb.utils.LogUtils;
import m54207b69;

public class NotificationCancelReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    String str = m54207b69.F54207b69_11("@~1D121553231E2117121225275C2A2D1F2D2C24252F2F");
    boolean bool1 = paramContext.equals(str);
    if (bool1)
    {
      paramContext = "TAG";
      try
      {
        paramContext = paramIntent.getStringExtra(paramContext);
        paramIntent = CancelDownloadInformer.getInformer();
        paramIntent.OooO0O0(paramContext);
      }
      finally
      {
        boolean bool2 = LogUtils.isDebug();
        if (bool2) {
          paramContext.printStackTrace();
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.download.NotificationCancelReceiver
 * JD-Core Version:    0.7.0.1
 */