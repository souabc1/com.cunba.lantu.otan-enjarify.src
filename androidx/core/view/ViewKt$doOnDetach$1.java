package androidx.core.view;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ViewKt$doOnDetach$1
  implements View.OnAttachStateChangeListener
{
  public void onViewAttachedToWindow(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
    this.o00OoOoo.removeOnAttachStateChangeListener(this);
    this.o00Ooo00.invoke(paramView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewKt.doOnDetach.1
 * JD-Core Version:    0.7.0.1
 */