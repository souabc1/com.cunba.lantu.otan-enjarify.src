package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;

class AppCompatDelegateImpl$Api24Impl
{
  public static void OooO00o(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3)
  {
    paramConfiguration1 = paramConfiguration1.getLocales();
    LocaleList localLocaleList = paramConfiguration2.getLocales();
    boolean bool = paramConfiguration1.equals(localLocaleList);
    if (!bool)
    {
      paramConfiguration3.setLocales(localLocaleList);
      paramConfiguration1 = paramConfiguration2.locale;
      paramConfiguration3.locale = paramConfiguration1;
    }
  }
  
  public static LocaleListCompat OooO0O0(Configuration paramConfiguration)
  {
    return LocaleListCompat.OooO0OO(paramConfiguration.getLocales().toLanguageTags());
  }
  
  public static void OooO0OO(Configuration paramConfiguration, LocaleListCompat paramLocaleListCompat)
  {
    paramLocaleListCompat = LocaleList.forLanguageTags(paramLocaleListCompat.OooO0o0());
    paramConfiguration.setLocales(paramLocaleListCompat);
  }
  
  public static void setDefaultLocales(LocaleListCompat paramLocaleListCompat)
  {
    LocaleList.setDefault(LocaleList.forLanguageTags(paramLocaleListCompat.OooO0o0()));
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl
 * JD-Core Version:    0.7.0.1
 */