package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

public final class EmittedSource
  implements DisposableHandle
{
  public final LiveData o00OoOoo;
  public boolean o00Ooo0;
  public final MediatorLiveData o00Ooo00;
  
  public EmittedSource(LiveData paramLiveData, MediatorLiveData paramMediatorLiveData)
  {
    this.o00OoOoo = paramLiveData;
    this.o00Ooo00 = paramMediatorLiveData;
  }
  
  public final Object OooO0O0(Continuation paramContinuation)
  {
    Object localObject = Dispatchers.getMain().getImmediate();
    EmittedSource.disposeNow.2 local2 = new androidx/lifecycle/EmittedSource$disposeNow$2;
    local2.<init>(this, null);
    paramContinuation = BuildersKt.OooO0OO((CoroutineContext)localObject, local2, paramContinuation);
    localObject = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    if (paramContinuation == localObject) {
      return paramContinuation;
    }
    return Unit.OooO00o;
  }
  
  public final void OooO0OO()
  {
    boolean bool = this.o00Ooo0;
    if (!bool)
    {
      MediatorLiveData localMediatorLiveData = this.o00Ooo00;
      LiveData localLiveData = this.o00OoOoo;
      localMediatorLiveData.OooOOO(localLiveData);
      bool = true;
      this.o00Ooo0 = bool;
    }
  }
  
  public void dispose()
  {
    CoroutineScope localCoroutineScope = CoroutineScopeKt.OooO00o(Dispatchers.getMain().getImmediate());
    EmittedSource.dispose.1 local1 = new androidx/lifecycle/EmittedSource$dispose$1;
    local1.<init>(this, null);
    BuildersKt.OooO0O0(localCoroutineScope, null, null, local1, 3, null);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.EmittedSource
 * JD-Core Version:    0.7.0.1
 */