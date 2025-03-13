package androidx.core.location;

import android.os.Handler;
import android.os.Looper;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class LocationManagerCompat$InlineHandlerExecutor
  implements Executor
{
  public final Handler o00OoOoo;
  
  public void execute(Runnable paramRunnable)
  {
    Object localObject1 = Looper.myLooper();
    Object localObject2 = this.o00OoOoo.getLooper();
    if (localObject1 == localObject2)
    {
      paramRunnable.run();
    }
    else
    {
      localObject1 = this.o00OoOoo;
      paramRunnable = (Runnable)Preconditions.OooO0oo(paramRunnable);
      boolean bool = ((Handler)localObject1).post(paramRunnable);
      if (!bool) {
        break label52;
      }
    }
    return;
    label52:
    paramRunnable = new java/util/concurrent/RejectedExecutionException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = this.o00OoOoo;
    ((StringBuilder)localObject1).append(localObject2);
    ((StringBuilder)localObject1).append(" is shutting down");
    localObject1 = ((StringBuilder)localObject1).toString();
    paramRunnable.<init>((String)localObject1);
    throw paramRunnable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.InlineHandlerExecutor
 * JD-Core Version:    0.7.0.1
 */