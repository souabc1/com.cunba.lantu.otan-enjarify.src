package androidx.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

class GhostViewUtils
{
  public static GhostView OooO00o(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 28;
    if (i == j) {
      return GhostViewPlatform.OooO0O0(paramView, paramViewGroup, paramMatrix);
    }
    return GhostViewPort.OooO0O0(paramView, paramViewGroup, paramMatrix);
  }
  
  public static void OooO0O0(View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 28;
    if (i == j) {
      GhostViewPlatform.OooO0o(paramView);
    } else {
      GhostViewPort.OooO0o(paramView);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.GhostViewUtils
 * JD-Core Version:    0.7.0.1
 */