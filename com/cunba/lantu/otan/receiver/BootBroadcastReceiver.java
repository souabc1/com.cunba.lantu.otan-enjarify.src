package com.cunba.lantu.otan.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import m54207b69;

public class BootBroadcastReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    arrayOfObject[2] = paramIntent;
    m54207b69.F54207b69_00(432, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.receiver.BootBroadcastReceiver
 * JD-Core Version:    0.7.0.1
 */