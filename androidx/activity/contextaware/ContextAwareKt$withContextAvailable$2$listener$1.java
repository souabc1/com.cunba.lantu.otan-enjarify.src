package androidx.activity.contextaware;

import android.content.Context;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

public final class ContextAwareKt$withContextAvailable$2$listener$1
  implements OnContextAvailableListener
{
  public void OooO00o(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    CancellableContinuation localCancellableContinuation = this.OooO00o;
    Object localObject = this.OooO0O0;
    try
    {
      paramContext = ((Function1)localObject).invoke(paramContext);
      paramContext = Result.OooO0O0(paramContext);
    }
    finally
    {
      localObject = Result.o00Ooo00;
      paramContext = Result.OooO0O0(ResultKt.OooO00o(paramContext));
    }
    localCancellableContinuation.resumeWith(paramContext);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.contextaware.ContextAwareKt.withContextAvailable.2.listener.1
 * JD-Core Version:    0.7.0.1
 */