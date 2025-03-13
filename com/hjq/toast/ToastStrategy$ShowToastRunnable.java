package com.hjq.toast;

import com.hjq.toast.config.IToast;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class ToastStrategy$ShowToastRunnable
  implements Runnable
{
  public final ToastParams o00OoOoo;
  
  public ToastStrategy$ShowToastRunnable(ToastStrategy paramToastStrategy, ToastParams paramToastParams)
  {
    this.o00OoOoo = paramToastParams;
  }
  
  public void run()
  {
    Object localObject1 = ToastStrategy.OooO0OO(this.o00Ooo00);
    if (localObject1 != null) {
      localObject1 = (IToast)ToastStrategy.OooO0OO(this.o00Ooo00).get();
    } else {
      localObject1 = null;
    }
    if (localObject1 != null) {
      ((IToast)localObject1).cancel();
    }
    localObject1 = this.o00Ooo00;
    Object localObject2 = this.o00OoOoo;
    localObject1 = ((ToastStrategy)localObject1).OooO0o((ToastParams)localObject2);
    localObject2 = this.o00Ooo00;
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(localObject1);
    ToastStrategy.OooO0Oo((ToastStrategy)localObject2, localWeakReference);
    int i = this.o00OoOoo.OooO0O0;
    ((IToast)localObject1).setDuration(i);
    localObject2 = this.o00OoOoo.OooO00o;
    ((IToast)localObject1).setText((CharSequence)localObject2);
    ((IToast)localObject1).show();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.ToastStrategy.ShowToastRunnable
 * JD-Core Version:    0.7.0.1
 */