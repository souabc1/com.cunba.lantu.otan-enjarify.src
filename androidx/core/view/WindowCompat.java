package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;

public final class WindowCompat
{
  public static WindowInsetsControllerCompat OooO00o(Window paramWindow, View paramView)
  {
    WindowInsetsControllerCompat localWindowInsetsControllerCompat = new androidx/core/view/WindowInsetsControllerCompat;
    localWindowInsetsControllerCompat.<init>(paramWindow, paramView);
    return localWindowInsetsControllerCompat;
  }
  
  public static void OooO0O0(Window paramWindow, boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      WindowCompat.Api30Impl.OooO00o(paramWindow, paramBoolean);
    } else {
      WindowCompat.Api16Impl.OooO00o(paramWindow, paramBoolean);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowCompat
 * JD-Core Version:    0.7.0.1
 */