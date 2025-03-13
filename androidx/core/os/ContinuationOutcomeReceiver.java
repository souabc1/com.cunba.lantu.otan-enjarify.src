package androidx.core.os;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

final class ContinuationOutcomeReceiver
  extends AtomicBoolean
  implements OutcomeReceiver
{
  public final Continuation o00OoOoo;
  
  public void onError(Throwable paramThrowable)
  {
    Intrinsics.OooO0o(paramThrowable, "error");
    Continuation localContinuation = null;
    boolean bool1 = true;
    boolean bool2 = compareAndSet(false, bool1);
    if (bool2)
    {
      localContinuation = this.o00OoOoo;
      paramThrowable = Result.OooO0O0(ResultKt.OooO00o(paramThrowable));
      localContinuation.resumeWith(paramThrowable);
    }
  }
  
  public void onResult(Object paramObject)
  {
    Continuation localContinuation = null;
    boolean bool1 = true;
    boolean bool2 = compareAndSet(false, bool1);
    if (bool2)
    {
      localContinuation = this.o00OoOoo;
      paramObject = Result.OooO0O0(paramObject);
      localContinuation.resumeWith(paramObject);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("ContinuationOutcomeReceiver(outcomeReceived = ");
    boolean bool = get();
    localStringBuilder.append(bool);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.ContinuationOutcomeReceiver
 * JD-Core Version:    0.7.0.1
 */