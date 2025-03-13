package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

class AppCompatDelegateImpl$AutoBatteryNightModeManager
  extends AppCompatDelegateImpl.AutoNightModeManager
{
  public final PowerManager OooO0OO;
  
  public AppCompatDelegateImpl$AutoBatteryNightModeManager(AppCompatDelegateImpl paramAppCompatDelegateImpl, Context paramContext)
  {
    super(paramAppCompatDelegateImpl);
    paramAppCompatDelegateImpl = (PowerManager)paramContext.getApplicationContext().getSystemService("power");
    this.OooO0OO = paramAppCompatDelegateImpl;
  }
  
  public IntentFilter OooO0O0()
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>();
    localIntentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
    return localIntentFilter;
  }
  
  public void OooO0OO()
  {
    this.OooO0Oo.OooO0o();
  }
  
  public int getApplyableNightMode()
  {
    PowerManager localPowerManager = this.OooO0OO;
    boolean bool = AppCompatDelegateImpl.Api21Impl.OooO00o(localPowerManager);
    int i;
    if (bool) {
      i = 2;
    } else {
      i = 1;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.AutoBatteryNightModeManager
 * JD-Core Version:    0.7.0.1
 */