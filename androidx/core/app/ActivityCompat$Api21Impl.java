package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;

class ActivityCompat$Api21Impl
{
  public static void OooO00o(Activity paramActivity)
  {
    paramActivity.finishAfterTransition();
  }
  
  public static void OooO0O0(Activity paramActivity)
  {
    paramActivity.postponeEnterTransition();
  }
  
  public static void OooO0OO(Activity paramActivity, SharedElementCallback paramSharedElementCallback)
  {
    paramActivity.setEnterSharedElementCallback(paramSharedElementCallback);
  }
  
  public static void OooO0Oo(Activity paramActivity, SharedElementCallback paramSharedElementCallback)
  {
    paramActivity.setExitSharedElementCallback(paramSharedElementCallback);
  }
  
  public static void OooO0o0(Activity paramActivity)
  {
    paramActivity.startPostponedEnterTransition();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */