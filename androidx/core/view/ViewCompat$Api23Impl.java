package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

class ViewCompat$Api23Impl
{
  public static WindowInsetsCompat OooO00o(View paramView)
  {
    Object localObject = paramView.getRootWindowInsets();
    if (localObject == null) {
      return null;
    }
    localObject = WindowInsetsCompat.OooOO0((WindowInsets)localObject);
    ((WindowInsetsCompat)localObject).setRootWindowInsets((WindowInsetsCompat)localObject);
    paramView = paramView.getRootView();
    ((WindowInsetsCompat)localObject).OooO0Oo(paramView);
    return localObject;
  }
  
  public static int OooO0O0(View paramView)
  {
    return paramView.getScrollIndicators();
  }
  
  public static void OooO0OO(View paramView, int paramInt)
  {
    paramView.setScrollIndicators(paramInt);
  }
  
  public static void OooO0Oo(View paramView, int paramInt1, int paramInt2)
  {
    paramView.setScrollIndicators(paramInt1, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api23Impl
 * JD-Core Version:    0.7.0.1
 */