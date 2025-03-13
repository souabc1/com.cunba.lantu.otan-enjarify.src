package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.window.core.Version;
import androidx.window.core.Version.Companion;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarCompat$Companion
{
  public final IBinder OooO00o(Activity paramActivity)
  {
    IBinder localIBinder = null;
    if (paramActivity != null)
    {
      paramActivity = paramActivity.getWindow();
      if (paramActivity != null)
      {
        paramActivity = paramActivity.getAttributes();
        if (paramActivity != null) {
          localIBinder = paramActivity.token;
        }
      }
    }
    return localIBinder;
  }
  
  public final SidecarInterface OooO0O0(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    return SidecarProvider.getSidecarImpl(paramContext.getApplicationContext());
  }
  
  public final Version getSidecarVersion()
  {
    Version localVersion = null;
    try
    {
      String str = SidecarProvider.getApiVersion();
      boolean bool = TextUtils.isEmpty(str);
      if (!bool)
      {
        Version.Companion localCompanion = Version.o00OooO0;
        localVersion = localCompanion.OooO00o(str);
      }
    }
    catch (NoClassDefFoundError|UnsupportedOperationException localNoClassDefFoundError)
    {
      label27:
      break label27;
    }
    return localVersion;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.SidecarCompat.Companion
 * JD-Core Version:    0.7.0.1
 */