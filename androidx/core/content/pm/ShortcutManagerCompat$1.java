package androidx.core.content.pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;

class ShortcutManagerCompat$1
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      IntentSender localIntentSender = this.OooO00o;
      localIntentSender.sendIntent(paramContext, 0, null, null, null);
      label14:
      return;
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
      break label14;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.pm.ShortcutManagerCompat.1
 * JD-Core Version:    0.7.0.1
 */