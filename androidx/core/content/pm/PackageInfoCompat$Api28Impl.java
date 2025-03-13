package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;

class PackageInfoCompat$Api28Impl
{
  public static Signature[] OooO00o(SigningInfo paramSigningInfo)
  {
    return paramSigningInfo.getApkContentsSigners();
  }
  
  public static long OooO0O0(PackageInfo paramPackageInfo)
  {
    return paramPackageInfo.getLongVersionCode();
  }
  
  public static Signature[] OooO0OO(SigningInfo paramSigningInfo)
  {
    return paramSigningInfo.getSigningCertificateHistory();
  }
  
  public static boolean OooO0Oo(SigningInfo paramSigningInfo)
  {
    return paramSigningInfo.hasMultipleSigners();
  }
  
  public static boolean OooO0o0(PackageManager paramPackageManager, String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    return paramPackageManager.hasSigningCertificate(paramString, paramArrayOfByte, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.pm.PackageInfoCompat.Api28Impl
 * JD-Core Version:    0.7.0.1
 */