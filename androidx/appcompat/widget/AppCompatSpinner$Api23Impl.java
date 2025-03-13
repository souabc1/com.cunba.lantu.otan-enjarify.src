package androidx.appcompat.widget;

import android.content.res.Resources.Theme;
import android.widget.ThemedSpinnerAdapter;
import androidx.core.util.ObjectsCompat;

final class AppCompatSpinner$Api23Impl
{
  public static void OooO00o(ThemedSpinnerAdapter paramThemedSpinnerAdapter, Resources.Theme paramTheme)
  {
    Resources.Theme localTheme = paramThemedSpinnerAdapter.getDropDownViewTheme();
    boolean bool = ObjectsCompat.OooO00o(localTheme, paramTheme);
    if (!bool) {
      paramThemedSpinnerAdapter.setDropDownViewTheme(paramTheme);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.Api23Impl
 * JD-Core Version:    0.7.0.1
 */