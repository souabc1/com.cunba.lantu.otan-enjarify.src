package androidx.core.app;

import android.app.AppOpsManager;

class AppOpsManagerCompat$Api19Impl
{
  public static int OooO00o(AppOpsManager paramAppOpsManager, String paramString1, int paramInt, String paramString2)
  {
    return paramAppOpsManager.noteOp(paramString1, paramInt, paramString2);
  }
  
  public static int OooO0O0(AppOpsManager paramAppOpsManager, String paramString1, int paramInt, String paramString2)
  {
    return paramAppOpsManager.noteOpNoThrow(paramString1, paramInt, paramString2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.AppOpsManagerCompat.Api19Impl
 * JD-Core Version:    0.7.0.1
 */