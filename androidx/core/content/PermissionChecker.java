package androidx.core.content;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.util.ObjectsCompat;

public final class PermissionChecker
{
  public static int OooO00o(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    paramInt1 = paramContext.checkPermission(paramString1, paramInt1, paramInt2);
    int i = -1;
    if (paramInt1 == i) {
      return i;
    }
    paramString1 = AppOpsManagerCompat.OooO0Oo(paramString1);
    paramInt1 = 0;
    if (paramString1 == null) {
      return 0;
    }
    if (paramString2 == null)
    {
      paramString2 = paramContext.getPackageManager().getPackagesForUid(paramInt2);
      if (paramString2 != null)
      {
        int j = paramString2.length;
        if (j > 0)
        {
          paramString2 = paramString2[0];
          break label78;
        }
      }
      return i;
    }
    label78:
    i = Process.myUid();
    String str = paramContext.getPackageName();
    if (i == paramInt2)
    {
      bool = ObjectsCompat.OooO00o(str, paramString2);
      if (bool)
      {
        bool = true;
        break label118;
      }
    }
    boolean bool = false;
    label118:
    int k;
    if (bool) {
      k = AppOpsManagerCompat.OooO00o(paramContext, paramInt2, paramString1, paramString2);
    } else {
      k = AppOpsManagerCompat.OooO0OO(paramContext, paramString1, paramString2);
    }
    if (k != 0) {
      paramInt1 = -2;
    }
    return paramInt1;
  }
  
  public static int OooO0O0(Context paramContext, String paramString)
  {
    int i = Process.myPid();
    int j = Process.myUid();
    String str = paramContext.getPackageName();
    return OooO00o(paramContext, paramString, i, j, str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.PermissionChecker
 * JD-Core Version:    0.7.0.1
 */