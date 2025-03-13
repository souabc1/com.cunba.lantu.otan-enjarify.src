package androidx.navigation;

import android.os.Bundle;

public final class NavAction
{
  public final int OooO00o;
  public NavOptions OooO0O0;
  public Bundle OooO0OO;
  
  public NavAction(int paramInt, NavOptions paramNavOptions, Bundle paramBundle)
  {
    this.OooO00o = paramInt;
    this.OooO0O0 = paramNavOptions;
    this.OooO0OO = paramBundle;
  }
  
  public final Bundle getDefaultArguments()
  {
    return this.OooO0OO;
  }
  
  public final int getDestinationId()
  {
    return this.OooO00o;
  }
  
  public final NavOptions getNavOptions()
  {
    return this.OooO0O0;
  }
  
  public final void setDefaultArguments(Bundle paramBundle)
  {
    this.OooO0OO = paramBundle;
  }
  
  public final void setNavOptions(NavOptions paramNavOptions)
  {
    this.OooO0O0 = paramNavOptions;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavAction
 * JD-Core Version:    0.7.0.1
 */