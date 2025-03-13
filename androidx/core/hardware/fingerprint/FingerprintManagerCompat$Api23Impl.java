package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.CancellationSignal;
import android.os.Handler;

class FingerprintManagerCompat$Api23Impl
{
  public static void OooO00o(Object paramObject1, Object paramObject2, CancellationSignal paramCancellationSignal, int paramInt, Object paramObject3, Handler paramHandler)
  {
    Object localObject1 = paramObject1;
    localObject1 = (FingerprintManager)paramObject1;
    Object localObject2 = paramObject2;
    localObject2 = (FingerprintManager.CryptoObject)paramObject2;
    Object localObject3 = paramObject3;
    localObject3 = (FingerprintManager.AuthenticationCallback)paramObject3;
    ((FingerprintManager)localObject1).authenticate((FingerprintManager.CryptoObject)localObject2, paramCancellationSignal, paramInt, (FingerprintManager.AuthenticationCallback)localObject3, paramHandler);
  }
  
  public static FingerprintManager.CryptoObject OooO0O0(Object paramObject)
  {
    return ((FingerprintManager.AuthenticationResult)paramObject).getCryptoObject();
  }
  
  public static FingerprintManager OooO0OO(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    String str = "android.hardware.fingerprint";
    boolean bool = localPackageManager.hasSystemFeature(str);
    if (bool) {
      return (FingerprintManager)paramContext.getSystemService(FingerprintManager.class);
    }
    return null;
  }
  
  public static boolean OooO0Oo(Object paramObject)
  {
    return ((FingerprintManager)paramObject).hasEnrolledFingerprints();
  }
  
  public static FingerprintManagerCompat.CryptoObject OooO0o(Object paramObject)
  {
    paramObject = (FingerprintManager.CryptoObject)paramObject;
    FingerprintManagerCompat.CryptoObject localCryptoObject = null;
    if (paramObject == null) {
      return null;
    }
    Object localObject = paramObject.getCipher();
    if (localObject != null)
    {
      localCryptoObject = new androidx/core/hardware/fingerprint/FingerprintManagerCompat$CryptoObject;
      paramObject = paramObject.getCipher();
      localCryptoObject.<init>(paramObject);
      return localCryptoObject;
    }
    localObject = paramObject.getSignature();
    if (localObject != null)
    {
      localCryptoObject = new androidx/core/hardware/fingerprint/FingerprintManagerCompat$CryptoObject;
      paramObject = paramObject.getSignature();
      localCryptoObject.<init>(paramObject);
      return localCryptoObject;
    }
    localObject = paramObject.getMac();
    if (localObject != null)
    {
      localCryptoObject = new androidx/core/hardware/fingerprint/FingerprintManagerCompat$CryptoObject;
      paramObject = paramObject.getMac();
      localCryptoObject.<init>(paramObject);
    }
    return localCryptoObject;
  }
  
  public static boolean OooO0o0(Object paramObject)
  {
    return ((FingerprintManager)paramObject).isHardwareDetected();
  }
  
  public static FingerprintManager.CryptoObject OooO0oO(FingerprintManagerCompat.CryptoObject paramCryptoObject)
  {
    FingerprintManager.CryptoObject localCryptoObject = null;
    if (paramCryptoObject == null) {
      return null;
    }
    Object localObject = paramCryptoObject.getCipher();
    if (localObject != null)
    {
      localCryptoObject = new android/hardware/fingerprint/FingerprintManager$CryptoObject;
      paramCryptoObject = paramCryptoObject.getCipher();
      localCryptoObject.<init>(paramCryptoObject);
      return localCryptoObject;
    }
    localObject = paramCryptoObject.getSignature();
    if (localObject != null)
    {
      localCryptoObject = new android/hardware/fingerprint/FingerprintManager$CryptoObject;
      paramCryptoObject = paramCryptoObject.getSignature();
      localCryptoObject.<init>(paramCryptoObject);
      return localCryptoObject;
    }
    localObject = paramCryptoObject.getMac();
    if (localObject != null)
    {
      localCryptoObject = new android/hardware/fingerprint/FingerprintManager$CryptoObject;
      paramCryptoObject = paramCryptoObject.getMac();
      localCryptoObject.<init>(paramCryptoObject);
    }
    return localCryptoObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl
 * JD-Core Version:    0.7.0.1
 */