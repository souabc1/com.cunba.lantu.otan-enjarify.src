package androidx.core.hardware.display;

import android.hardware.display.DisplayManager;
import android.view.Display;

class DisplayManagerCompat$Api17Impl
{
  public static Display OooO00o(DisplayManager paramDisplayManager, int paramInt)
  {
    return paramDisplayManager.getDisplay(paramInt);
  }
  
  public static Display[] OooO0O0(DisplayManager paramDisplayManager)
  {
    return paramDisplayManager.getDisplays();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.hardware.display.DisplayManagerCompat.Api17Impl
 * JD-Core Version:    0.7.0.1
 */