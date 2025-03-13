package androidx.appcompat.app;

import android.content.IntentFilter;

class AppCompatDelegateImpl$AutoTimeNightModeManager
  extends AppCompatDelegateImpl.AutoNightModeManager
{
  public final TwilightManager OooO0OO;
  
  public AppCompatDelegateImpl$AutoTimeNightModeManager(AppCompatDelegateImpl paramAppCompatDelegateImpl, TwilightManager paramTwilightManager)
  {
    super(paramAppCompatDelegateImpl);
    this.OooO0OO = paramTwilightManager;
  }
  
  public IntentFilter OooO0O0()
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>();
    localIntentFilter.addAction("android.intent.action.TIME_SET");
    localIntentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
    localIntentFilter.addAction("android.intent.action.TIME_TICK");
    return localIntentFilter;
  }
  
  public void OooO0OO()
  {
    this.OooO0Oo.OooO0o();
  }
  
  public int getApplyableNightMode()
  {
    TwilightManager localTwilightManager = this.OooO0OO;
    boolean bool = localTwilightManager.isNight();
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
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.AutoTimeNightModeManager
 * JD-Core Version:    0.7.0.1
 */