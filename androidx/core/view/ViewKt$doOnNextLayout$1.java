package androidx.core.view;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ViewKt$doOnNextLayout$1
  implements View.OnLayoutChangeListener
{
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    Intrinsics.OooO0o(paramView, "view");
    paramView.removeOnLayoutChangeListener(this);
    this.OooO00o.invoke(paramView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewKt.doOnNextLayout.1
 * JD-Core Version:    0.7.0.1
 */