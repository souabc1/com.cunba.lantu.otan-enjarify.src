package com.qinggan.account;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import m54207b69;

public abstract class CurrentUserTracker
  extends BroadcastReceiver
{
  public Context OooO00o;
  public int OooO0O0;
  
  public CurrentUserTracker(Context paramContext)
  {
    this.OooO00o = paramContext;
  }
  
  public abstract void OooO00o(int paramInt);
  
  public void OooO0O0()
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    String str = m54207b69.F54207b69_11("1F272924372D34286F37313C2E343F76363543413C3C7D292C1B2D33302D2C30242E2424");
    localIntentFilter.<init>(str);
    str = m54207b69.F54207b69_11("VB232D283331302C733335403238437A3231473D4040812D281F29371B1F1E2724302E392F2A");
    localIntentFilter.addAction(str);
    this.OooO00o.registerReceiver(this, localIntentFilter);
  }
  
  public void OooO0OO()
  {
    this.OooO00o.unregisterReceiver(this);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = new java/lang/StringBuilder;
    paramContext.<init>();
    String str = m54207b69.F54207b69_11(";c0A0E1909111C530B0E202C0B23171A1C");
    paramContext.append(str);
    str = paramIntent.getAction();
    paramContext.append(str);
    paramContext = m54207b69.F54207b69_11("VB232D283331302C733335403238437A3231473D4040812D281F29371B1F1E2724302E392F2A");
    str = paramIntent.getAction();
    boolean bool = paramContext.equals(str);
    if (bool)
    {
      paramContext = m54207b69.F54207b69_11("5e040C031A0E11075214141B0B171E590F2D2229175F252C172F53271F271E271F");
      str = null;
      int i = paramIntent.getIntExtra(paramContext, 0);
      this.OooO0O0 = i;
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramIntent = m54207b69.F54207b69_11("1D290833393A26303719402B41192D");
      paramContext.append(paramIntent);
      int j = this.OooO0O0;
      paramContext.append(j);
      i = this.OooO0O0;
      OooO00o(i);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.account.CurrentUserTracker
 * JD-Core Version:    0.7.0.1
 */