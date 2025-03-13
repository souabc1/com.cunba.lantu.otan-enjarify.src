package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;

class DisplayCutoutCompat$Api30Impl
{
  public static DisplayCutout OooO00o(Insets paramInsets1, Rect paramRect1, Rect paramRect2, Rect paramRect3, Rect paramRect4, Insets paramInsets2)
  {
    DisplayCutout localDisplayCutout = new android/view/DisplayCutout;
    localDisplayCutout.<init>(paramInsets1, paramRect1, paramRect2, paramRect3, paramRect4, paramInsets2);
    return localDisplayCutout;
  }
  
  public static Insets OooO0O0(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getWaterfallInsets();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.DisplayCutoutCompat.Api30Impl
 * JD-Core Version:    0.7.0.1
 */