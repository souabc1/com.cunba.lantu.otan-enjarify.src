package androidx.core.text;

import android.icu.util.ULocale;
import java.util.Locale;

class ICUCompat$Api24Impl
{
  public static ULocale OooO00o(Object paramObject)
  {
    return ULocale.addLikelySubtags((ULocale)paramObject);
  }
  
  public static ULocale OooO0O0(Locale paramLocale)
  {
    return ULocale.forLocale(paramLocale);
  }
  
  public static String OooO0OO(Object paramObject)
  {
    return ((ULocale)paramObject).getScript();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.ICUCompat.Api24Impl
 * JD-Core Version:    0.7.0.1
 */