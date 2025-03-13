package androidx.core.os;

import android.os.Handler;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

class ExecutorCompat$HandlerExecutor
  implements Executor
{
  public final Handler o00OoOoo;
  
  public void execute(Runnable paramRunnable)
  {
    Object localObject = this.o00OoOoo;
    paramRunnable = (Runnable)Preconditions.OooO0oo(paramRunnable);
    boolean bool = ((Handler)localObject).post(paramRunnable);
    if (bool) {
      return;
    }
    paramRunnable = new java/util/concurrent/RejectedExecutionException;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    Handler localHandler = this.o00OoOoo;
    ((StringBuilder)localObject).append(localHandler);
    ((StringBuilder)localObject).append(" is shutting down");
    localObject = ((StringBuilder)localObject).toString();
    paramRunnable.<init>((String)localObject);
    throw paramRunnable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.ExecutorCompat.HandlerExecutor
 * JD-Core Version:    0.7.0.1
 */