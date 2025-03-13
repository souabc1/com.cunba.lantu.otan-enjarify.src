package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.PackageInfoFlags;

class ProfileVerifier$Api33Impl
{
  public static PackageInfo OooO00o(PackageManager paramPackageManager, Context paramContext)
  {
    paramContext = paramContext.getPackageName();
    PackageManager.PackageInfoFlags localPackageInfoFlags = PackageManager.PackageInfoFlags.of(0L);
    return paramPackageManager.getPackageInfo(paramContext, localPackageInfoFlags);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.ProfileVerifier.Api33Impl
 * JD-Core Version:    0.7.0.1
 */