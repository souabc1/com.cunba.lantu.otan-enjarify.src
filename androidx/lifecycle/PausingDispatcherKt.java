package androidx.lifecycle;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

public final class PausingDispatcherKt
{
  public static final Object OooO00o(Lifecycle paramLifecycle, Function2 paramFunction2, Continuation paramContinuation)
  {
    Lifecycle.State localState = Lifecycle.State.o00Ooo0;
    return OooO0Oo(paramLifecycle, localState, paramFunction2, paramContinuation);
  }
  
  public static final Object OooO0O0(Lifecycle paramLifecycle, Function2 paramFunction2, Continuation paramContinuation)
  {
    Lifecycle.State localState = Lifecycle.State.o00Ooo0o;
    return OooO0Oo(paramLifecycle, localState, paramFunction2, paramContinuation);
  }
  
  public static final Object OooO0OO(Lifecycle paramLifecycle, Function2 paramFunction2, Continuation paramContinuation)
  {
    Lifecycle.State localState = Lifecycle.State.o00Ooo0O;
    return OooO0Oo(paramLifecycle, localState, paramFunction2, paramContinuation);
  }
  
  public static final Object OooO0Oo(Lifecycle paramLifecycle, Lifecycle.State paramState, Function2 paramFunction2, Continuation paramContinuation)
  {
    MainCoroutineDispatcher localMainCoroutineDispatcher = Dispatchers.getMain().getImmediate();
    PausingDispatcherKt.whenStateAtLeast.2 local2 = new androidx/lifecycle/PausingDispatcherKt$whenStateAtLeast$2;
    local2.<init>(paramLifecycle, paramState, paramFunction2, null);
    return BuildersKt.OooO0OO(localMainCoroutineDispatcher, local2, paramContinuation);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.PausingDispatcherKt
 * JD-Core Version:    0.7.0.1
 */