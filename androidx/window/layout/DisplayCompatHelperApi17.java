package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import kotlin.jvm.internal.Intrinsics;

public final class DisplayCompatHelperApi17
{
  public static final DisplayCompatHelperApi17 OooO00o;
  
  static
  {
    DisplayCompatHelperApi17 localDisplayCompatHelperApi17 = new androidx/window/layout/DisplayCompatHelperApi17;
    localDisplayCompatHelperApi17.<init>();
    OooO00o = localDisplayCompatHelperApi17;
  }
  
  public final void OooO00o(Display paramDisplay, Point paramPoint)
  {
    Intrinsics.OooO0o(paramDisplay, "display");
    Intrinsics.OooO0o(paramPoint, "point");
    paramDisplay.getRealSize(paramPoint);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.DisplayCompatHelperApi17
 * JD-Core Version:    0.7.0.1
 */