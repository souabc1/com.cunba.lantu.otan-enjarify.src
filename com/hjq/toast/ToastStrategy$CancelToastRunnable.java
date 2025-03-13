package com.hjq.toast;

import com.hjq.toast.config.IToast;
import java.lang.ref.Reference;

class ToastStrategy$CancelToastRunnable
  implements Runnable
{
  public void run()
  {
    Object localObject = ToastStrategy.OooO0OO(this.o00OoOoo);
    if (localObject != null) {
      localObject = (IToast)ToastStrategy.OooO0OO(this.o00OoOoo).get();
    } else {
      localObject = null;
    }
    if (localObject == null) {
      return;
    }
    ((IToast)localObject).cancel();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.ToastStrategy.CancelToastRunnable
 * JD-Core Version:    0.7.0.1
 */