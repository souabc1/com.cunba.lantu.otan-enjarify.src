package androidx.window.layout;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityCompatHelperApi24
{
  public static final ActivityCompatHelperApi24 OooO00o;
  
  static
  {
    ActivityCompatHelperApi24 localActivityCompatHelperApi24 = new androidx/window/layout/ActivityCompatHelperApi24;
    localActivityCompatHelperApi24.<init>();
    OooO00o = localActivityCompatHelperApi24;
  }
  
  public final boolean OooO00o(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    return paramActivity.isInMultiWindowMode();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.ActivityCompatHelperApi24
 * JD-Core Version:    0.7.0.1
 */