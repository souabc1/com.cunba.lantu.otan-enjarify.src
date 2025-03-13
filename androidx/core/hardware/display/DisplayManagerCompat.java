package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.WeakHashMap;

public final class DisplayManagerCompat
{
  public static final WeakHashMap OooO0O0;
  public final Context OooO00o;
  
  static
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    OooO0O0 = localWeakHashMap;
  }
  
  public Display getDisplay(int paramInt)
  {
    return DisplayManagerCompat.Api17Impl.OooO00o((DisplayManager)this.OooO00o.getSystemService("display"), paramInt);
  }
  
  public Display[] getDisplays()
  {
    return DisplayManagerCompat.Api17Impl.OooO0O0((DisplayManager)this.OooO00o.getSystemService("display"));
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.hardware.display.DisplayManagerCompat
 * JD-Core Version:    0.7.0.1
 */