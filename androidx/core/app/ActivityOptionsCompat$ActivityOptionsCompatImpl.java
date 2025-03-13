package androidx.core.app;

import android.app.ActivityOptions;
import android.graphics.Rect;
import android.os.Bundle;

class ActivityOptionsCompat$ActivityOptionsCompatImpl
  extends ActivityOptionsCompat
{
  public final ActivityOptions OooO00o;
  
  public Bundle OooO00o()
  {
    return this.OooO00o.toBundle();
  }
  
  public Rect getLaunchBounds()
  {
    return ActivityOptionsCompat.Api24Impl.OooO00o(this.OooO00o);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl
 * JD-Core Version:    0.7.0.1
 */