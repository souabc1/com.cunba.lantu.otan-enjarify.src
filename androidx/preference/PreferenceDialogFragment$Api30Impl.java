package androidx.preference;

import android.view.View;
import android.view.Window;
import android.view.WindowInsets.Type;
import android.view.WindowInsetsController;

class PreferenceDialogFragment$Api30Impl
{
  public static void OooO00o(Window paramWindow)
  {
    paramWindow = paramWindow.getDecorView().getWindowInsetsController();
    int i = WindowInsets.Type.ime();
    paramWindow.show(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.PreferenceDialogFragment.Api30Impl
 * JD-Core Version:    0.7.0.1
 */