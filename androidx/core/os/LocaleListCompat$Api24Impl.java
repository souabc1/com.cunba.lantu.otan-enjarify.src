package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

class LocaleListCompat$Api24Impl
{
  public static LocaleList OooO00o(Locale... paramVarArgs)
  {
    LocaleList localLocaleList = new android/os/LocaleList;
    localLocaleList.<init>(paramVarArgs);
    return localLocaleList;
  }
  
  public static LocaleList getAdjustedDefault()
  {
    return LocaleList.getAdjustedDefault();
  }
  
  public static LocaleList getDefault()
  {
    return LocaleList.getDefault();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.LocaleListCompat.Api24Impl
 * JD-Core Version:    0.7.0.1
 */