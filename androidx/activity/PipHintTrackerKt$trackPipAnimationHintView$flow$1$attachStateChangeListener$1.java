package androidx.activity;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
  implements View.OnAttachStateChangeListener
{
  public PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1(ProducerScope paramProducerScope, View paramView, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener, View.OnLayoutChangeListener paramOnLayoutChangeListener) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    Intrinsics.OooO0o(paramView, "v");
    paramView = this.o00OoOoo;
    Object localObject = PipHintTrackerKt.OooO00o(this.o00Ooo00);
    paramView.OooOo0o(localObject);
    paramView = this.o00Ooo00.getViewTreeObserver();
    localObject = this.o00Ooo0;
    paramView.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)localObject);
    paramView = this.o00Ooo00;
    localObject = this.o00Ooo0O;
    paramView.addOnLayoutChangeListener((View.OnLayoutChangeListener)localObject);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Intrinsics.OooO0o(paramView, "v");
    Object localObject = paramView.getViewTreeObserver();
    ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = this.o00Ooo0;
    ((ViewTreeObserver)localObject).removeOnScrollChangedListener(localOnScrollChangedListener);
    localObject = this.o00Ooo0O;
    paramView.removeOnLayoutChangeListener((View.OnLayoutChangeListener)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1.attachStateChangeListener.1
 * JD-Core Version:    0.7.0.1
 */