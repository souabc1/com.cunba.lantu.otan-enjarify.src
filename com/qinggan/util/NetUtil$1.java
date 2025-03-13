package com.qinggan.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import m54207b69;

class NetUtil$1
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = paramIntent.getAction();
    NetUtil.OooO00o();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("7l3E0A110C091F0F0F540E0C23150F265B1D202A181717626D");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramIntent);
    localObject = m54207b69.F54207b69_11("5x19171E0D1B16225D1E26166127242425664C49494A52514349474B473D44594F59576160");
    boolean bool1 = paramIntent.equals(localObject);
    if (!bool1) {
      return;
    }
    bool1 = NetUtil.OooO0O0();
    boolean bool2 = NetUtil.OooO0Oo(paramContext);
    if (bool1 == bool2) {
      return;
    }
    NetUtil.OooO0OO(this.OooO00o, bool2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.NetUtil.1
 * JD-Core Version:    0.7.0.1
 */