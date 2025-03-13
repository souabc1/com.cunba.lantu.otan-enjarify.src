package androidx.navigation;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class NavDeepLinkRequest$Builder
{
  public static final NavDeepLinkRequest.Builder.Companion OooO0Oo;
  public Uri OooO00o;
  public String OooO0O0;
  public String OooO0OO;
  
  static
  {
    NavDeepLinkRequest.Builder.Companion localCompanion = new androidx/navigation/NavDeepLinkRequest$Builder$Companion;
    localCompanion.<init>(null);
    OooO0Oo = localCompanion;
  }
  
  public final NavDeepLinkRequest OooO00o()
  {
    NavDeepLinkRequest localNavDeepLinkRequest = new androidx/navigation/NavDeepLinkRequest;
    Uri localUri = this.OooO00o;
    String str1 = this.OooO0O0;
    String str2 = this.OooO0OO;
    localNavDeepLinkRequest.<init>(localUri, str1, str2);
    return localNavDeepLinkRequest;
  }
  
  public final Builder OooO0O0(Uri paramUri)
  {
    Intrinsics.OooO0o(paramUri, "uri");
    this.OooO00o = paramUri;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavDeepLinkRequest.Builder
 * JD-Core Version:    0.7.0.1
 */