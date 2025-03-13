package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

abstract class AppCompatDelegateImpl$AutoNightModeManager
{
  public BroadcastReceiver OooO00o;
  
  public AppCompatDelegateImpl$AutoNightModeManager(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void OooO00o()
  {
    BroadcastReceiver localBroadcastReceiver = this.OooO00o;
    if (localBroadcastReceiver != null) {}
    try
    {
      Object localObject = this.OooO0O0;
      localObject = ((AppCompatDelegateImpl)localObject).o00OoooO;
      ((Context)localObject).unregisterReceiver(localBroadcastReceiver);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      label24:
      break label24;
    }
    localBroadcastReceiver = null;
    this.OooO00o = null;
  }
  
  public abstract IntentFilter OooO0O0();
  
  public abstract void OooO0OO();
  
  public void OooO0Oo()
  {
    OooO00o();
    IntentFilter localIntentFilter = OooO0O0();
    if (localIntentFilter != null)
    {
      int i = localIntentFilter.countActions();
      if (i != 0)
      {
        Object localObject = this.OooO00o;
        if (localObject == null)
        {
          localObject = new androidx/appcompat/app/AppCompatDelegateImpl$AutoNightModeManager$1;
          ((AppCompatDelegateImpl.AutoNightModeManager.1)localObject).<init>(this);
          this.OooO00o = ((BroadcastReceiver)localObject);
        }
        localObject = this.OooO0O0.o00OoooO;
        BroadcastReceiver localBroadcastReceiver = this.OooO00o;
        ((Context)localObject).registerReceiver(localBroadcastReceiver, localIntentFilter);
      }
    }
  }
  
  public abstract int getApplyableNightMode();
  
  public boolean isListening()
  {
    BroadcastReceiver localBroadcastReceiver = this.OooO00o;
    boolean bool;
    if (localBroadcastReceiver != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localBroadcastReceiver = null;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
 * JD-Core Version:    0.7.0.1
 */