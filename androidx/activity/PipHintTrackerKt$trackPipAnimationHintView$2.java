package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

final class PipHintTrackerKt$trackPipAnimationHintView$2
  implements FlowCollector
{
  public final Object OooO00o(Rect paramRect, Continuation paramContinuation)
  {
    paramContinuation = Api26Impl.OooO00o;
    Activity localActivity = this.o00OoOoo;
    paramContinuation.OooO00o(localActivity, paramRect);
    return Unit.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
 * JD-Core Version:    0.7.0.1
 */