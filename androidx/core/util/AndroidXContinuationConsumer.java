package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.coroutines.Continuation;

final class AndroidXContinuationConsumer
  extends AtomicBoolean
  implements Consumer
{
  public final Continuation o00OoOoo;
  
  public void accept(Object paramObject)
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
    localStringBuilder.append("ContinuationConsumer(resultAccepted = ");
    boolean bool = get();
    localStringBuilder.append(bool);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.AndroidXContinuationConsumer
 * JD-Core Version:    0.7.0.1
 */