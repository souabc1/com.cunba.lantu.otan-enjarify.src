package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

class ContextCompat$Api33Impl
{
  public static Intent OooO00o(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
  {
    return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.ContextCompat.Api33Impl
 * JD-Core Version:    0.7.0.1
 */