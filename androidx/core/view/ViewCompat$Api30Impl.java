package androidx.core.view;

import android.view.View;

class ViewCompat$Api30Impl
{
  public static CharSequence OooO00o(View paramView)
  {
    return paramView.getStateDescription();
  }
  
  public static WindowInsetsControllerCompat OooO0O0(View paramView)
  {
    paramView = paramView.getWindowInsetsController();
    if (paramView != null) {
      paramView = WindowInsetsControllerCompat.OooO0OO(paramView);
    } else {
      paramView = null;
    }
    return paramView;
  }
  
  public static void OooO0OO(View paramView, CharSequence paramCharSequence)
  {
    paramView.setStateDescription(paramCharSequence);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api30Impl
 * JD-Core Version:    0.7.0.1
 */