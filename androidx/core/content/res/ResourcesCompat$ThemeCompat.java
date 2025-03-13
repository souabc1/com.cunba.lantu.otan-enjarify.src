package androidx.core.content.res;

import android.content.res.Resources.Theme;
import android.os.Build.VERSION;

public final class ResourcesCompat$ThemeCompat
{
  public static void OooO00o(Resources.Theme paramTheme)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      ResourcesCompat.ThemeCompat.Api29Impl.OooO00o(paramTheme);
    } else {
      ResourcesCompat.ThemeCompat.Api23Impl.OooO00o(paramTheme);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.ThemeCompat
 * JD-Core Version:    0.7.0.1
 */