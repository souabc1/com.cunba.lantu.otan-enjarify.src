package androidx.core.view;

import android.view.View;
import android.view.Window;

class WindowCompat$Api16Impl
{
  public static void OooO00o(Window paramWindow, boolean paramBoolean)
  {
    paramWindow = paramWindow.getDecorView();
    int i = paramWindow.getSystemUiVisibility();
    if (paramBoolean) {
      paramBoolean = i & 0xFFFFF8FF;
    } else {
      paramBoolean = i | 0x700;
    }
    paramWindow.setSystemUiVisibility(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowCompat.Api16Impl
 * JD-Core Version:    0.7.0.1
 */