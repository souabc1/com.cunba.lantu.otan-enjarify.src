package androidx.core.view;

import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;

class WindowInsetsControllerCompat$Impl30$1
  implements WindowInsetsAnimationControlListener
{
  public WindowInsetsAnimationControllerCompat OooO00o;
  
  public void onCancelled(WindowInsetsAnimationController paramWindowInsetsAnimationController)
  {
    WindowInsetsAnimationControlListenerCompat localWindowInsetsAnimationControlListenerCompat = this.OooO0O0;
    if (paramWindowInsetsAnimationController == null) {
      paramWindowInsetsAnimationController = null;
    } else {
      paramWindowInsetsAnimationController = this.OooO00o;
    }
    localWindowInsetsAnimationControlListenerCompat.OooO00o(paramWindowInsetsAnimationController);
  }
  
  public void onFinished(WindowInsetsAnimationController paramWindowInsetsAnimationController)
  {
    paramWindowInsetsAnimationController = this.OooO0O0;
    WindowInsetsAnimationControllerCompat localWindowInsetsAnimationControllerCompat = this.OooO00o;
    paramWindowInsetsAnimationController.OooO0OO(localWindowInsetsAnimationControllerCompat);
  }
  
  public void onReady(WindowInsetsAnimationController paramWindowInsetsAnimationController, int paramInt)
  {
    WindowInsetsAnimationControllerCompat localWindowInsetsAnimationControllerCompat = new androidx/core/view/WindowInsetsAnimationControllerCompat;
    localWindowInsetsAnimationControllerCompat.<init>(paramWindowInsetsAnimationController);
    this.OooO00o = localWindowInsetsAnimationControllerCompat;
    this.OooO0O0.OooO0O0(localWindowInsetsAnimationControllerCompat, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat.Impl30.1
 * JD-Core Version:    0.7.0.1
 */