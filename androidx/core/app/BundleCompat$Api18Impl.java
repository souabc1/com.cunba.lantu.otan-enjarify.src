package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

class BundleCompat$Api18Impl
{
  public static IBinder OooO00o(Bundle paramBundle, String paramString)
  {
    return paramBundle.getBinder(paramString);
  }
  
  public static void OooO0O0(Bundle paramBundle, String paramString, IBinder paramIBinder)
  {
    paramBundle.putBinder(paramString, paramIBinder);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.BundleCompat.Api18Impl
 * JD-Core Version:    0.7.0.1
 */