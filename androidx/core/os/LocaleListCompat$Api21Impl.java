package androidx.core.os;

import androidx.core.text.ICUCompat;
import java.util.Locale;

class LocaleListCompat$Api21Impl
{
  public static final Locale[] OooO00o;
  
  static
  {
    Locale[] arrayOfLocale = new Locale[2];
    Locale localLocale = new java/util/Locale;
    localLocale.<init>("en", "XA");
    arrayOfLocale[0] = localLocale;
    localLocale = new java/util/Locale;
    localLocale.<init>("ar", "XB");
    arrayOfLocale[1] = localLocale;
    OooO00o = arrayOfLocale;
  }
  
  public static Locale OooO00o(String paramString)
  {
    return Locale.forLanguageTag(paramString);
  }
  
  public static boolean OooO0O0(Locale paramLocale)
  {
    Locale[] arrayOfLocale = OooO00o;
    int i = arrayOfLocale.length;
    int j = 0;
    while (j < i)
    {
      Locale localLocale = arrayOfLocale[j];
      boolean bool = localLocale.equals(paramLocale);
      if (bool) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public static boolean OooO0OO(Locale paramLocale1, Locale paramLocale2)
  {
    boolean bool1 = paramLocale1.equals(paramLocale2);
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    String str1 = paramLocale1.getLanguage();
    String str2 = paramLocale2.getLanguage();
    bool1 = str1.equals(str2);
    str2 = null;
    if (!bool1) {
      return false;
    }
    bool1 = OooO0O0(paramLocale1);
    if (!bool1)
    {
      bool1 = OooO0O0(paramLocale2);
      if (!bool1)
      {
        str1 = ICUCompat.OooO00o(paramLocale1);
        boolean bool3 = str1.isEmpty();
        if (bool3)
        {
          paramLocale1 = paramLocale1.getCountry();
          bool1 = paramLocale1.isEmpty();
          if (!bool1)
          {
            paramLocale2 = paramLocale2.getCountry();
            boolean bool4 = paramLocale1.equals(paramLocale2);
            if (!bool4) {
              bool2 = false;
            }
          }
          return bool2;
        }
        paramLocale1 = ICUCompat.OooO00o(paramLocale2);
        return str1.equals(paramLocale1);
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.LocaleListCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */