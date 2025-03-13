package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

class AppCompatDelegateImpl$Api17Impl
{
  public static Context OooO00o(Context paramContext, Configuration paramConfiguration)
  {
    return paramContext.createConfigurationContext(paramConfiguration);
  }
  
  public static void OooO0O0(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3)
  {
    int i = paramConfiguration1.densityDpi;
    int j = paramConfiguration2.densityDpi;
    if (i != j) {
      paramConfiguration3.densityDpi = j;
    }
  }
  
  public static void OooO0OO(Configuration paramConfiguration, Locale paramLocale)
  {
    paramConfiguration.setLayoutDirection(paramLocale);
  }
  
  public static void OooO0Oo(Configuration paramConfiguration, Locale paramLocale)
  {
    paramConfiguration.setLocale(paramLocale);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.Api17Impl
 * JD-Core Version:    0.7.0.1
 */