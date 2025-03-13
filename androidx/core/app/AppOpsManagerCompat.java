package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;

public final class AppOpsManagerCompat
{
  public static int OooO00o(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      AppOpsManager localAppOpsManager = AppOpsManagerCompat.Api29Impl.OooO0OO(paramContext);
      j = Binder.getCallingUid();
      int k = AppOpsManagerCompat.Api29Impl.OooO00o(localAppOpsManager, paramString1, j, paramString2);
      if (k != 0) {
        return k;
      }
      paramContext = AppOpsManagerCompat.Api29Impl.OooO0O0(paramContext);
      return AppOpsManagerCompat.Api29Impl.OooO00o(localAppOpsManager, paramString1, paramInt, paramContext);
    }
    return OooO0OO(paramContext, paramString1, paramString2);
  }
  
  public static int OooO0O0(Context paramContext, String paramString1, String paramString2)
  {
    return AppOpsManagerCompat.Api23Impl.OooO0O0((AppOpsManager)AppOpsManagerCompat.Api23Impl.OooO00o(paramContext, AppOpsManager.class), paramString1, paramString2);
  }
  
  public static int OooO0OO(Context paramContext, String paramString1, String paramString2)
  {
    return AppOpsManagerCompat.Api23Impl.OooO0OO((AppOpsManager)AppOpsManagerCompat.Api23Impl.OooO00o(paramContext, AppOpsManager.class), paramString1, paramString2);
  }
  
  public static String OooO0Oo(String paramString)
  {
    return AppOpsManagerCompat.Api23Impl.OooO0Oo(paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.AppOpsManagerCompat
 * JD-Core Version:    0.7.0.1
 */