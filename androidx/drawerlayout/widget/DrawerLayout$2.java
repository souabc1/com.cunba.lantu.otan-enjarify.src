package androidx.drawerlayout.widget;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

class DrawerLayout$2
  implements View.OnApplyWindowInsetsListener
{
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramView = (DrawerLayout)paramView;
    int i = paramWindowInsets.getSystemWindowInsetTop();
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    paramView.Oooo0oo(paramWindowInsets, i);
    return paramWindowInsets.consumeSystemWindowInsets();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.2
 * JD-Core Version:    0.7.0.1
 */