package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

class ViewCompat$Api20Impl
{
  public static WindowInsets OooO00o(View paramView, WindowInsets paramWindowInsets)
  {
    return paramView.dispatchApplyWindowInsets(paramWindowInsets);
  }
  
  public static WindowInsets OooO0O0(View paramView, WindowInsets paramWindowInsets)
  {
    return paramView.onApplyWindowInsets(paramWindowInsets);
  }
  
  public static void OooO0OO(View paramView)
  {
    paramView.requestApplyInsets();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api20Impl
 * JD-Core Version:    0.7.0.1
 */