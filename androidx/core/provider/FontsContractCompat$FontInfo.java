package androidx.core.provider;

import android.net.Uri;
import androidx.core.util.Preconditions;

public class FontsContractCompat$FontInfo
{
  public final Uri OooO00o;
  public final int OooO0O0;
  public final int OooO0OO;
  public final boolean OooO0Oo;
  public final int OooO0o0;
  
  public FontsContractCompat$FontInfo(Uri paramUri, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    paramUri = (Uri)Preconditions.OooO0oo(paramUri);
    this.OooO00o = paramUri;
    this.OooO0O0 = paramInt1;
    this.OooO0OO = paramInt2;
    this.OooO0Oo = paramBoolean;
    this.OooO0o0 = paramInt3;
  }
  
  public static FontInfo OooO00o(Uri paramUri, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    FontInfo localFontInfo = new androidx/core/provider/FontsContractCompat$FontInfo;
    localFontInfo.<init>(paramUri, paramInt1, paramInt2, paramBoolean, paramInt3);
    return localFontInfo;
  }
  
  public int getResultCode()
  {
    return this.OooO0o0;
  }
  
  public int getTtcIndex()
  {
    return this.OooO0O0;
  }
  
  public Uri getUri()
  {
    return this.OooO00o;
  }
  
  public int getWeight()
  {
    return this.OooO0OO;
  }
  
  public boolean isItalic()
  {
    return this.OooO0Oo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.FontsContractCompat.FontInfo
 * JD-Core Version:    0.7.0.1
 */