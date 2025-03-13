package androidx.appcompat.app;

import androidx.core.os.LocaleListCompat;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

final class LocaleOverlayHelper
{
  public static LocaleListCompat OooO00o(LocaleListCompat paramLocaleListCompat1, LocaleListCompat paramLocaleListCompat2)
  {
    LinkedHashSet localLinkedHashSet = new java/util/LinkedHashSet;
    localLinkedHashSet.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramLocaleListCompat1.OooO0Oo();
      int k = paramLocaleListCompat2.OooO0Oo();
      j += k;
      if (i >= j) {
        break;
      }
      j = paramLocaleListCompat1.OooO0Oo();
      Locale localLocale;
      if (i < j)
      {
        localLocale = paramLocaleListCompat1.get(i);
      }
      else
      {
        j = paramLocaleListCompat1.OooO0Oo();
        j = i - j;
        localLocale = paramLocaleListCompat2.get(j);
      }
      if (localLocale != null) {
        localLinkedHashSet.add(localLocale);
      }
      i += 1;
    }
    paramLocaleListCompat1 = new Locale[localLinkedHashSet.size()];
    return LocaleListCompat.OooO00o((Locale[])localLinkedHashSet.toArray(paramLocaleListCompat1));
  }
  
  public static LocaleListCompat OooO0O0(LocaleListCompat paramLocaleListCompat1, LocaleListCompat paramLocaleListCompat2)
  {
    if (paramLocaleListCompat1 != null)
    {
      boolean bool = paramLocaleListCompat1.isEmpty();
      if (!bool) {
        return OooO00o(paramLocaleListCompat1, paramLocaleListCompat2);
      }
    }
    return LocaleListCompat.getEmptyLocaleList();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.LocaleOverlayHelper
 * JD-Core Version:    0.7.0.1
 */