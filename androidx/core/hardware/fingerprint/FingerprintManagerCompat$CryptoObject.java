package androidx.core.hardware.fingerprint;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class FingerprintManagerCompat$CryptoObject
{
  public final Signature OooO00o;
  public final Cipher OooO0O0;
  public final Mac OooO0OO;
  
  public FingerprintManagerCompat$CryptoObject(Signature paramSignature)
  {
    this.OooO00o = paramSignature;
    this.OooO0O0 = null;
    this.OooO0OO = null;
  }
  
  public FingerprintManagerCompat$CryptoObject(Cipher paramCipher)
  {
    this.OooO0O0 = paramCipher;
    this.OooO00o = null;
    this.OooO0OO = null;
  }
  
  public FingerprintManagerCompat$CryptoObject(Mac paramMac)
  {
    this.OooO0OO = paramMac;
    this.OooO0O0 = null;
    this.OooO00o = null;
  }
  
  public Cipher getCipher()
  {
    return this.OooO0O0;
  }
  
  public Mac getMac()
  {
    return this.OooO0OO;
  }
  
  public Signature getSignature()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject
 * JD-Core Version:    0.7.0.1
 */