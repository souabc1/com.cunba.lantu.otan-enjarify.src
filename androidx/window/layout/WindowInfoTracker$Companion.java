package androidx.window.layout;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

public final class WindowInfoTracker$Companion
{
  public static final String OooO0O0 = Reflection.OooO0O0(WindowInfoTracker.class).getSimpleName();
  public static WindowInfoTrackerDecorator OooO0OO = EmptyDecorator.OooO00o;
  
  static
  {
    Companion localCompanion = new androidx/window/layout/WindowInfoTracker$Companion;
    localCompanion.<init>();
    OooO00o = localCompanion;
  }
  
  public final WindowInfoTracker OooO00o(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    WindowInfoTrackerImpl localWindowInfoTrackerImpl = new androidx/window/layout/WindowInfoTrackerImpl;
    WindowMetricsCalculatorCompat localWindowMetricsCalculatorCompat = WindowMetricsCalculatorCompat.OooO0O0;
    paramContext = OooO0O0(paramContext);
    localWindowInfoTrackerImpl.<init>(localWindowMetricsCalculatorCompat, paramContext);
    return OooO0OO.OooO00o(localWindowInfoTrackerImpl);
  }
  
  public final WindowBackend OooO0O0(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Object localObject1 = null;
    try
    {
      Object localObject2 = SafeWindowLayoutComponentProvider.OooO00o;
      localObject2 = ((SafeWindowLayoutComponentProvider)localObject2).getWindowLayoutComponent();
      if (localObject2 != null)
      {
        ExtensionWindowLayoutInfoBackend localExtensionWindowLayoutInfoBackend = new androidx/window/layout/ExtensionWindowLayoutInfoBackend;
        localExtensionWindowLayoutInfoBackend.<init>((WindowLayoutComponent)localObject2);
        localObject1 = localExtensionWindowLayoutInfoBackend;
      }
    }
    finally
    {
      label38:
      break label38;
    }
    if (localObject1 == null) {
      localObject1 = SidecarWindowBackend.OooO0OO.OooO00o(paramContext);
    }
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.WindowInfoTracker.Companion
 * JD-Core Version:    0.7.0.1
 */