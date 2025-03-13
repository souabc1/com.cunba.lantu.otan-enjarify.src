package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

final class ContinuationRunnable
  extends AtomicBoolean
  implements Runnable
{
  public final Continuation o00OoOoo;
  
  public void run()
  {
    Continuation localContinuation = null;
    boolean bool1 = true;
    boolean bool2 = compareAndSet(false, bool1);
    if (bool2)
    {
      localContinuation = this.o00OoOoo;
      Object localObject = Result.o00Ooo00;
      localObject = Result.OooO0O0(Unit.OooO00o);
      localContinuation.resumeWith(localObject);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("ContinuationRunnable(ran = ");
    boolean bool = get();
    localStringBuilder.append(bool);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.ContinuationRunnable
 * JD-Core Version:    0.7.0.1
 */