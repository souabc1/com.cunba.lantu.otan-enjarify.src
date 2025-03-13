package androidx.core.app;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.Display;
import androidx.core.content.LocusIdCompat;

class ActivityCompat$Api30Impl
{
  public static Display OooO00o(ContextWrapper paramContextWrapper)
  {
    return paramContextWrapper.getDisplay();
  }
  
  public static void OooO0O0(Activity paramActivity, LocusIdCompat paramLocusIdCompat, Bundle paramBundle)
  {
    if (paramLocusIdCompat == null) {
      paramLocusIdCompat = null;
    } else {
      paramLocusIdCompat = paramLocusIdCompat.OooO00o();
    }
    paramActivity.setLocusContext(paramLocusIdCompat, paramBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityCompat.Api30Impl
 * JD-Core Version:    0.7.0.1
 */