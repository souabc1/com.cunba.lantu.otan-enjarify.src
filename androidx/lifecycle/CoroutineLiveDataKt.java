package androidx.lifecycle;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

public final class CoroutineLiveDataKt
{
  public static final Object OooO00o(MediatorLiveData paramMediatorLiveData, LiveData paramLiveData, Continuation paramContinuation)
  {
    MainCoroutineDispatcher localMainCoroutineDispatcher = Dispatchers.getMain().getImmediate();
    CoroutineLiveDataKt.addDisposableSource.2 local2 = new androidx/lifecycle/CoroutineLiveDataKt$addDisposableSource$2;
    local2.<init>(paramMediatorLiveData, paramLiveData, null);
    return BuildersKt.OooO0OO(localMainCoroutineDispatcher, local2, paramContinuation);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.CoroutineLiveDataKt
 * JD-Core Version:    0.7.0.1
 */