package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;

class ActivityCompat$Api23Impl
{
  public static void OooO00o(Object paramObject)
  {
    ((SharedElementCallback.OnSharedElementsReadyListener)paramObject).onSharedElementsReady();
  }
  
  public static void OooO0O0(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    paramActivity.requestPermissions(paramArrayOfString, paramInt);
  }
  
  public static boolean OooO0OO(Activity paramActivity, String paramString)
  {
    return paramActivity.shouldShowRequestPermissionRationale(paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityCompat.Api23Impl
 * JD-Core Version:    0.7.0.1
 */