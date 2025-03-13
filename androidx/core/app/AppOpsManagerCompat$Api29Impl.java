package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;

class AppOpsManagerCompat$Api29Impl
{
  public static int OooO00o(AppOpsManager paramAppOpsManager, String paramString1, int paramInt, String paramString2)
  {
    if (paramAppOpsManager == null) {
      return 1;
    }
    return paramAppOpsManager.checkOpNoThrow(paramString1, paramInt, paramString2);
  }
  
  public static String OooO0O0(Context paramContext)
  {
    return paramContext.getOpPackageName();
  }
  
  public static AppOpsManager OooO0OO(Context paramContext)
  {
    return (AppOpsManager)paramContext.getSystemService(AppOpsManager.class);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.AppOpsManagerCompat.Api29Impl
 * JD-Core Version:    0.7.0.1
 */