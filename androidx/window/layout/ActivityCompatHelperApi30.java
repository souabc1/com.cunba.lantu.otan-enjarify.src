package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityCompatHelperApi30
{
  public static final ActivityCompatHelperApi30 OooO00o;
  
  static
  {
    ActivityCompatHelperApi30 localActivityCompatHelperApi30 = new androidx/window/layout/ActivityCompatHelperApi30;
    localActivityCompatHelperApi30.<init>();
    OooO00o = localActivityCompatHelperApi30;
  }
  
  public final Rect OooO00o(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    paramActivity = OooO0O0.OooO00o(OooO00o.OooO00o(paramActivity.getWindowManager()));
    Intrinsics.OooO0o0(paramActivity, "activity.windowManager.currentWindowMetrics.bounds");
    return paramActivity;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.ActivityCompatHelperApi30
 * JD-Core Version:    0.7.0.1
 */