package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;

class AppOpsManagerCompat$Api23Impl
{
  public static Object OooO00o(Context paramContext, Class paramClass)
  {
    return paramContext.getSystemService(paramClass);
  }
  
  public static int OooO0O0(AppOpsManager paramAppOpsManager, String paramString1, String paramString2)
  {
    return paramAppOpsManager.noteProxyOp(paramString1, paramString2);
  }
  
  public static int OooO0OO(AppOpsManager paramAppOpsManager, String paramString1, String paramString2)
  {
    return paramAppOpsManager.noteProxyOpNoThrow(paramString1, paramString2);
  }
  
  public static String OooO0Oo(String paramString)
  {
    return AppOpsManager.permissionToOp(paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.AppOpsManagerCompat.Api23Impl
 * JD-Core Version:    0.7.0.1
 */