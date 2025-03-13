package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

public final class NavDeepLink$Builder
{
  public static final NavDeepLink.Builder.Companion OooO0Oo;
  public String OooO00o;
  public String OooO0O0;
  public String OooO0OO;
  
  static
  {
    NavDeepLink.Builder.Companion localCompanion = new androidx/navigation/NavDeepLink$Builder$Companion;
    localCompanion.<init>(null);
    OooO0Oo = localCompanion;
  }
  
  public final NavDeepLink OooO00o()
  {
    NavDeepLink localNavDeepLink = new androidx/navigation/NavDeepLink;
    String str1 = this.OooO00o;
    String str2 = this.OooO0O0;
    String str3 = this.OooO0OO;
    localNavDeepLink.<init>(str1, str2, str3);
    return localNavDeepLink;
  }
  
  public final Builder OooO0O0(String paramString)
  {
    String str = "action";
    Intrinsics.OooO0o(paramString, str);
    int i = paramString.length();
    if (i > 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      str = null;
    }
    if (i != 0)
    {
      this.OooO0O0 = paramString;
      return this;
    }
    paramString = new java/lang/IllegalArgumentException;
    str = "The NavDeepLink cannot have an empty action.".toString();
    paramString.<init>(str);
    throw paramString;
  }
  
  public final Builder OooO0OO(String paramString)
  {
    Intrinsics.OooO0o(paramString, "mimeType");
    this.OooO0OO = paramString;
    return this;
  }
  
  public final Builder OooO0Oo(String paramString)
  {
    Intrinsics.OooO0o(paramString, "uriPattern");
    this.OooO00o = paramString;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavDeepLink.Builder
 * JD-Core Version:    0.7.0.1
 */