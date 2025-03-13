package androidx.core.app;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.view.View;

class ActivityOptionsCompat$Api23Impl
{
  public static ActivityOptions OooO00o()
  {
    return ActivityOptions.makeBasic();
  }
  
  public static ActivityOptions OooO0O0(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return ActivityOptions.makeClipRevealAnimation(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void OooO0OO(ActivityOptions paramActivityOptions, PendingIntent paramPendingIntent)
  {
    paramActivityOptions.requestUsageTimeReport(paramPendingIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityOptionsCompat.Api23Impl
 * JD-Core Version:    0.7.0.1
 */