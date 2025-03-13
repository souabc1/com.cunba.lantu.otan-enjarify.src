package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
  implements ComponentCallbacks
{
  public SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1(SidecarCompat paramSidecarCompat, Activity paramActivity) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    Object localObject = "newConfig";
    Intrinsics.OooO0o(paramConfiguration, (String)localObject);
    paramConfiguration = SidecarCompat.OooO0OO(this.o00OoOoo);
    if (paramConfiguration != null)
    {
      localObject = this.o00Ooo00;
      WindowLayoutInfo localWindowLayoutInfo = this.o00OoOoo.OooO0o((Activity)localObject);
      paramConfiguration.OooO00o((Activity)localObject, localWindowLayoutInfo);
    }
  }
  
  public void onLowMemory() {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.SidecarCompat.registerConfigurationChangeListener.configChangeObserver.1
 * JD-Core Version:    0.7.0.1
 */