package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

class AppCompatDelegateImpl$3
  implements OnApplyWindowInsetsListener
{
  public AppCompatDelegateImpl$3(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public WindowInsetsCompat onApplyWindowInsets(View paramView, WindowInsetsCompat paramWindowInsetsCompat)
  {
    int i = paramWindowInsetsCompat.getSystemWindowInsetTop();
    AppCompatDelegateImpl localAppCompatDelegateImpl = this.OooO00o;
    int j = 0;
    int k = localAppCompatDelegateImpl.o00000oo(paramWindowInsetsCompat, null);
    if (i != k)
    {
      i = paramWindowInsetsCompat.getSystemWindowInsetLeft();
      j = paramWindowInsetsCompat.getSystemWindowInsetRight();
      int m = paramWindowInsetsCompat.getSystemWindowInsetBottom();
      paramWindowInsetsCompat = paramWindowInsetsCompat.OooO0oo(i, k, j, m);
    }
    return ViewCompat.OooooOO(paramView, paramWindowInsetsCompat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.3
 * JD-Core Version:    0.7.0.1
 */