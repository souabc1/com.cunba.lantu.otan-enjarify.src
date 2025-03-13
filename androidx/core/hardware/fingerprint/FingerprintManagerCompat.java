package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;

public class FingerprintManagerCompat
{
  public final Context OooO00o;
  
  public static FingerprintManager OooO00o(Context paramContext)
  {
    return FingerprintManagerCompat.Api23Impl.OooO0OO(paramContext);
  }
  
  public static FingerprintManagerCompat.CryptoObject OooO0O0(FingerprintManager.CryptoObject paramCryptoObject)
  {
    return FingerprintManagerCompat.Api23Impl.OooO0o(paramCryptoObject);
  }
  
  public boolean isHardwareDetected()
  {
    FingerprintManager localFingerprintManager = OooO00o(this.OooO00o);
    if (localFingerprintManager != null)
    {
      bool = FingerprintManagerCompat.Api23Impl.OooO0o0(localFingerprintManager);
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localFingerprintManager = null;
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.hardware.fingerprint.FingerprintManagerCompat
 * JD-Core Version:    0.7.0.1
 */