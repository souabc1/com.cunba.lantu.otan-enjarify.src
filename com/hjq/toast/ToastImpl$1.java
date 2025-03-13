package com.hjq.toast;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewManager;
import android.view.WindowManager.BadTokenException;
import android.view.WindowManager.LayoutParams;

class ToastImpl$1
  implements Runnable
{
  public ToastImpl$1(ToastImpl paramToastImpl) {}
  
  public void run()
  {
    Object localObject1 = ToastImpl.OooO00o(this.o00OoOoo).getWindowManager();
    if (localObject1 == null) {
      return;
    }
    Object localObject2 = new android/view/WindowManager$LayoutParams;
    ((WindowManager.LayoutParams)localObject2).<init>();
    int i = -2;
    ((WindowManager.LayoutParams)localObject2).height = i;
    ((WindowManager.LayoutParams)localObject2).width = i;
    ((WindowManager.LayoutParams)localObject2).format = -3;
    ((WindowManager.LayoutParams)localObject2).flags = 152;
    Object localObject3 = ToastImpl.OooO0O0(this.o00OoOoo);
    ((WindowManager.LayoutParams)localObject2).packageName = ((String)localObject3);
    i = ToastImpl.OooO0OO(this.o00OoOoo).getGravity();
    ((WindowManager.LayoutParams)localObject2).gravity = i;
    i = ToastImpl.OooO0OO(this.o00OoOoo).getXOffset();
    ((WindowManager.LayoutParams)localObject2).x = i;
    i = ToastImpl.OooO0OO(this.o00OoOoo).getYOffset();
    ((WindowManager.LayoutParams)localObject2).y = i;
    float f = ToastImpl.OooO0OO(this.o00OoOoo).getVerticalMargin();
    ((WindowManager.LayoutParams)localObject2).verticalMargin = f;
    f = ToastImpl.OooO0OO(this.o00OoOoo).getHorizontalMargin();
    ((WindowManager.LayoutParams)localObject2).horizontalMargin = f;
    i = ToastImpl.OooO0OO(this.o00OoOoo).getAnimationsId();
    ((WindowManager.LayoutParams)localObject2).windowAnimations = i;
    localObject3 = this.o00OoOoo;
    boolean bool = ToastImpl.OooO0Oo((ToastImpl)localObject3);
    int j;
    if (bool)
    {
      f = 2.855846E-042F;
      ((WindowManager.LayoutParams)localObject2).type = 2038;
      j = ((WindowManager.LayoutParams)localObject2).flags & 0xFFFFFFEF;
      ((WindowManager.LayoutParams)localObject2).flags = j;
    }
    try
    {
      localObject3 = this.o00OoOoo;
      localObject3 = ToastImpl.OooO0OO((ToastImpl)localObject3);
      localObject3 = ((CustomToast)localObject3).getView();
      ((ViewManager)localObject1).addView((View)localObject3, (ViewGroup.LayoutParams)localObject2);
      localObject1 = ToastImpl.OooO0o0();
      localObject2 = new com/hjq/toast/OooO0O0;
      ((OooO0O0)localObject2).<init>(this);
      localObject3 = this.o00OoOoo;
      localObject3 = ToastImpl.OooO0OO((ToastImpl)localObject3);
      j = ((CustomToast)localObject3).getDuration();
      int k = 1;
      if (j == k)
      {
        localObject3 = this.o00OoOoo;
        localObject3 = ToastImpl.OooO0OO((ToastImpl)localObject3);
      }
      long l;
      for (j = ((CustomToast)localObject3).getLongDuration();; j = ((CustomToast)localObject3).getShortDuration())
      {
        l = j;
        break;
        localObject3 = this.o00OoOoo;
        localObject3 = ToastImpl.OooO0OO((ToastImpl)localObject3);
      }
      ((Handler)localObject1).postDelayed((Runnable)localObject2, l);
      localObject1 = this.o00OoOoo;
      localObject1 = ToastImpl.OooO00o((ToastImpl)localObject1);
      localObject2 = this.o00OoOoo;
      ((WindowLifecycle)localObject1).OooO00o((ToastImpl)localObject2);
      localObject1 = this.o00OoOoo;
      ((ToastImpl)localObject1).setShow(k);
      localObject1 = this.o00OoOoo;
      localObject2 = ToastImpl.OooO0OO((ToastImpl)localObject1);
      localObject2 = ((CustomToast)localObject2).getView();
      ToastImpl.OooO0o((ToastImpl)localObject1, (View)localObject2);
    }
    catch (WindowManager.BadTokenException localBadTokenException) {}catch (IllegalStateException localIllegalStateException) {}
    localIllegalStateException.printStackTrace();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.ToastImpl.1
 * JD-Core Version:    0.7.0.1
 */