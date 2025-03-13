package androidx.core.content.res;

import androidx.core.provider.FontRequest;

public final class FontResourcesParserCompat$ProviderResourceEntry
  implements FontResourcesParserCompat.FamilyResourceEntry
{
  public final FontRequest OooO00o;
  public final int OooO0O0;
  public final int OooO0OO;
  public final String OooO0Oo;
  
  public FontResourcesParserCompat$ProviderResourceEntry(FontRequest paramFontRequest, int paramInt1, int paramInt2, String paramString)
  {
    this.OooO00o = paramFontRequest;
    this.OooO0OO = paramInt1;
    this.OooO0O0 = paramInt2;
    this.OooO0Oo = paramString;
  }
  
  public int getFetchStrategy()
  {
    return this.OooO0OO;
  }
  
  public FontRequest getRequest()
  {
    return this.OooO00o;
  }
  
  public String getSystemFontFamilyName()
  {
    return this.OooO0Oo;
  }
  
  public int getTimeout()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry
 * JD-Core Version:    0.7.0.1
 */