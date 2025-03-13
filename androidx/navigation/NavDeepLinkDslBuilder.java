package androidx.navigation;

public final class NavDeepLinkDslBuilder
{
  public final NavDeepLink.Builder OooO00o;
  public String OooO0O0;
  public String OooO0OO;
  public String OooO0Oo;
  
  public NavDeepLinkDslBuilder()
  {
    NavDeepLink.Builder localBuilder = new androidx/navigation/NavDeepLink$Builder;
    localBuilder.<init>();
    this.OooO00o = localBuilder;
  }
  
  public final String getAction()
  {
    return this.OooO0OO;
  }
  
  public final String getMimeType()
  {
    return this.OooO0Oo;
  }
  
  public final String getUriPattern()
  {
    return this.OooO0O0;
  }
  
  public final void setAction(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.length();
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        paramString = new java/lang/IllegalArgumentException;
        paramString.<init>("The NavDeepLink cannot have an empty action.");
        throw paramString;
      }
    }
    this.OooO0OO = paramString;
  }
  
  public final void setMimeType(String paramString)
  {
    this.OooO0Oo = paramString;
  }
  
  public final void setUriPattern(String paramString)
  {
    this.OooO0O0 = paramString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavDeepLinkDslBuilder
 * JD-Core Version:    0.7.0.1
 */