package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

class ViewCompat$Api21Impl$1
  implements View.OnApplyWindowInsetsListener
{
  public WindowInsetsCompat OooO00o = null;
  
  public ViewCompat$Api21Impl$1(View paramView, OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.OooOO0O(paramWindowInsets, paramView);
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i < j)
    {
      View localView = this.OooO0O0;
      ViewCompat.Api21Impl.OooO00o(paramWindowInsets, localView);
      paramWindowInsets = this.OooO00o;
      boolean bool = localWindowInsetsCompat.equals(paramWindowInsets);
      if (bool) {
        return this.OooO0OO.onApplyWindowInsets(paramView, localWindowInsetsCompat).OooO();
      }
    }
    this.OooO00o = localWindowInsetsCompat;
    paramWindowInsets = this.OooO0OO.onApplyWindowInsets(paramView, localWindowInsetsCompat);
    if (i >= j) {
      return paramWindowInsets.OooO();
    }
    ViewCompat.o00o0O(paramView);
    return paramWindowInsets.OooO();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api21Impl.1
 * JD-Core Version:    0.7.0.1
 */