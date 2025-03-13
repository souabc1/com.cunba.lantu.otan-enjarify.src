package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;

final class FlowExtKt$flowWithLifecycle$1$1$1
  implements FlowCollector
{
  public FlowExtKt$flowWithLifecycle$1$1$1(ProducerScope paramProducerScope) {}
  
  public final Object OooO0O0(Object paramObject, Continuation paramContinuation)
  {
    ProducerScope localProducerScope = this.o00OoOoo;
    paramObject = localProducerScope.OooOoO(paramObject, paramContinuation);
    paramContinuation = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    if (paramObject == paramContinuation) {
      return paramObject;
    }
    return Unit.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
 * JD-Core Version:    0.7.0.1
 */