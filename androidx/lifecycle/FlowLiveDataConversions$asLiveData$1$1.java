package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

final class FlowLiveDataConversions$asLiveData$1$1
  implements FlowCollector
{
  public FlowLiveDataConversions$asLiveData$1$1(LiveDataScope paramLiveDataScope) {}
  
  public final Object OooO0O0(Object paramObject, Continuation paramContinuation)
  {
    LiveDataScope localLiveDataScope = this.o00OoOoo;
    paramObject = localLiveDataScope.OooO0O0(paramObject, paramContinuation);
    paramContinuation = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    if (paramObject == paramContinuation) {
      return paramObject;
    }
    return Unit.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
 * JD-Core Version:    0.7.0.1
 */