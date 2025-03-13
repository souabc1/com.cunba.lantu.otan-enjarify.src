package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

public final class RepeatOnLifecycleKt
{
  public static final Object OooO00o(Lifecycle paramLifecycle, Lifecycle.State paramState, Function2 paramFunction2, Continuation paramContinuation)
  {
    Object localObject = Lifecycle.State.o00Ooo00;
    int i;
    if (paramState != localObject)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    if (i != 0)
    {
      localObject = paramLifecycle.getCurrentState();
      Lifecycle.State localState = Lifecycle.State.o00OoOoo;
      if (localObject == localState) {
        return Unit.OooO00o;
      }
      localObject = new androidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3;
      localState = null;
      ((RepeatOnLifecycleKt.repeatOnLifecycle.3)localObject).<init>(paramLifecycle, paramState, paramFunction2, null);
      paramLifecycle = CoroutineScopeKt.OooO0O0((Function2)localObject, paramContinuation);
      paramState = IntrinsicsKt.getCOROUTINE_SUSPENDED();
      if (paramLifecycle == paramState) {
        return paramLifecycle;
      }
      return Unit.OooO00o;
    }
    paramLifecycle = new java/lang/IllegalArgumentException;
    paramState = "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString();
    paramLifecycle.<init>(paramState);
    throw paramLifecycle;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.RepeatOnLifecycleKt
 * JD-Core Version:    0.7.0.1
 */