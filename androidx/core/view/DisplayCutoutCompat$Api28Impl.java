package androidx.core.view;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

class DisplayCutoutCompat$Api28Impl
{
  public static DisplayCutout OooO00o(Rect paramRect, List paramList)
  {
    DisplayCutout localDisplayCutout = new android/view/DisplayCutout;
    localDisplayCutout.<init>(paramRect, paramList);
    return localDisplayCutout;
  }
  
  public static List OooO0O0(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getBoundingRects();
  }
  
  public static int OooO0OO(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetBottom();
  }
  
  public static int OooO0Oo(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetLeft();
  }
  
  public static int OooO0o(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetTop();
  }
  
  public static int OooO0o0(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetRight();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.DisplayCutoutCompat.Api28Impl
 * JD-Core Version:    0.7.0.1
 */