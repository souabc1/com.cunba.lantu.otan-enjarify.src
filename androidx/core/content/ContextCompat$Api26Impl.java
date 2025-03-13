package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

class ContextCompat$Api26Impl
{
  public static Intent OooO00o(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
  {
    int i = paramInt & 0x4;
    if ((i != 0) && (paramString == null))
    {
      paramString = ContextCompat.OooOO0(paramContext);
      return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler);
    }
    int j = paramInt & 0x1;
    return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, j);
  }
  
  public static ComponentName OooO0O0(Context paramContext, Intent paramIntent)
  {
    return paramContext.startForegroundService(paramIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.ContextCompat.Api26Impl
 * JD-Core Version:    0.7.0.1
 */