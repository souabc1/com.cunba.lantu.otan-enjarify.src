package androidx.window.layout;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

final class SidecarCompat$FirstAttachAdapter
  implements View.OnAttachStateChangeListener
{
  public final SidecarCompat o00OoOoo;
  public final WeakReference o00Ooo00;
  
  public SidecarCompat$FirstAttachAdapter(SidecarCompat paramSidecarCompat, Activity paramActivity)
  {
    this.o00OoOoo = paramSidecarCompat;
    paramSidecarCompat = new java/lang/ref/WeakReference;
    paramSidecarCompat.<init>(paramActivity);
    this.o00Ooo00 = paramSidecarCompat;
  }
  
  public void onViewAttachedToWindow(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
    paramView.removeOnAttachStateChangeListener(this);
    paramView = (Activity)this.o00Ooo00.get();
    IBinder localIBinder = SidecarCompat.OooO0o.OooO00o(paramView);
    if (paramView == null) {
      return;
    }
    if (localIBinder == null) {
      return;
    }
    this.o00OoOoo.OooO0oO(localIBinder, paramView);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.SidecarCompat.FirstAttachAdapter
 * JD-Core Version:    0.7.0.1
 */