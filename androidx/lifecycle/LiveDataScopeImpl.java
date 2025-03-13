package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

public final class LiveDataScopeImpl
  implements LiveDataScope
{
  public CoroutineLiveData OooO00o;
  public final CoroutineContext OooO0O0;
  
  public LiveDataScopeImpl(CoroutineLiveData paramCoroutineLiveData, CoroutineContext paramCoroutineContext)
  {
    this.OooO00o = paramCoroutineLiveData;
    paramCoroutineLiveData = Dispatchers.getMain().getImmediate();
    paramCoroutineLiveData = paramCoroutineContext.OooOO0(paramCoroutineLiveData);
    this.OooO0O0 = paramCoroutineLiveData;
  }
  
  public Object OooO0O0(Object paramObject, Continuation paramContinuation)
  {
    CoroutineContext localCoroutineContext = this.OooO0O0;
    LiveDataScopeImpl.emit.2 local2 = new androidx/lifecycle/LiveDataScopeImpl$emit$2;
    local2.<init>(this, paramObject, null);
    paramObject = BuildersKt.OooO0OO(localCoroutineContext, local2, paramContinuation);
    paramContinuation = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    if (paramObject == paramContinuation) {
      return paramObject;
    }
    return Unit.OooO00o;
  }
  
  public Object getLatestValue()
  {
    return this.OooO00o.getValue();
  }
  
  public final CoroutineLiveData getTarget$lifecycle_livedata_ktx_release()
  {
    return this.OooO00o;
  }
  
  public final void setTarget$lifecycle_livedata_ktx_release(CoroutineLiveData paramCoroutineLiveData)
  {
    Intrinsics.OooO0o(paramCoroutineLiveData, "<set-?>");
    this.OooO00o = paramCoroutineLiveData;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LiveDataScopeImpl
 * JD-Core Version:    0.7.0.1
 */