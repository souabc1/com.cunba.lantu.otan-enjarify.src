package androidx.core.provider;

public class FontsContractCompat$FontFamilyResult
{
  public final int OooO00o;
  public final FontsContractCompat.FontInfo[] OooO0O0;
  
  public FontsContractCompat$FontFamilyResult(int paramInt, FontsContractCompat.FontInfo[] paramArrayOfFontInfo)
  {
    this.OooO00o = paramInt;
    this.OooO0O0 = paramArrayOfFontInfo;
  }
  
  public static FontFamilyResult OooO00o(int paramInt, FontsContractCompat.FontInfo[] paramArrayOfFontInfo)
  {
    FontFamilyResult localFontFamilyResult = new androidx/core/provider/FontsContractCompat$FontFamilyResult;
    localFontFamilyResult.<init>(paramInt, paramArrayOfFontInfo);
    return localFontFamilyResult;
  }
  
  public FontsContractCompat.FontInfo[] getFonts()
  {
    return this.OooO0O0;
  }
  
  public int getStatusCode()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.FontsContractCompat.FontFamilyResult
 * JD-Core Version:    0.7.0.1
 */