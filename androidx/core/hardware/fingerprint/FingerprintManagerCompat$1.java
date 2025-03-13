package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;

class FingerprintManagerCompat$1
  extends FingerprintManager.AuthenticationCallback
{
  public void onAuthenticationError(int paramInt, CharSequence paramCharSequence)
  {
    this.OooO00o.OooO00o(paramInt, paramCharSequence);
  }
  
  public void onAuthenticationFailed()
  {
    this.OooO00o.OooO0O0();
  }
  
  public void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence)
  {
    this.OooO00o.OooO0OO(paramInt, paramCharSequence);
  }
  
  public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult paramAuthenticationResult)
  {
    FingerprintManagerCompat.AuthenticationCallback localAuthenticationCallback = this.OooO00o;
    FingerprintManagerCompat.AuthenticationResult localAuthenticationResult = new androidx/core/hardware/fingerprint/FingerprintManagerCompat$AuthenticationResult;
    paramAuthenticationResult = FingerprintManagerCompat.OooO0O0(FingerprintManagerCompat.Api23Impl.OooO0O0(paramAuthenticationResult));
    localAuthenticationResult.<init>(paramAuthenticationResult);
    localAuthenticationCallback.OooO0Oo(localAuthenticationResult);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.hardware.fingerprint.FingerprintManagerCompat.1
 * JD-Core Version:    0.7.0.1
 */