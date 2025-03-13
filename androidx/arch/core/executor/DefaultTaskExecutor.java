package androidx.arch.core.executor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class DefaultTaskExecutor
  extends TaskExecutor
{
  public final Object OooO00o;
  public final ExecutorService OooO0O0;
  public volatile Handler OooO0OO;
  
  public DefaultTaskExecutor()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.OooO00o = localObject;
    localObject = new androidx/arch/core/executor/DefaultTaskExecutor$1;
    ((DefaultTaskExecutor.1)localObject).<init>(this);
    localObject = Executors.newFixedThreadPool(4, (ThreadFactory)localObject);
    this.OooO0O0 = ((ExecutorService)localObject);
  }
  
  public static Handler OooO0OO(Looper paramLooper)
  {
    return DefaultTaskExecutor.Api28Impl.OooO00o(paramLooper);
  }
  
  public void OooO00o(Runnable paramRunnable)
  {
    this.OooO0O0.execute(paramRunnable);
  }
  
  public void OooO0O0(Runnable paramRunnable)
  {
    ??? = this.OooO0OO;
    if (??? == null) {
      synchronized (this.OooO00o)
      {
        Object localObject2 = this.OooO0OO;
        if (localObject2 == null)
        {
          localObject2 = Looper.getMainLooper();
          localObject2 = OooO0OO((Looper)localObject2);
          this.OooO0OO = ((Handler)localObject2);
        }
      }
    }
    this.OooO0OO.post(paramRunnable);
  }
  
  public boolean isMainThread()
  {
    Thread localThread1 = Looper.getMainLooper().getThread();
    Thread localThread2 = Thread.currentThread();
    boolean bool;
    if (localThread1 == localThread2)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localThread1 = null;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.arch.core.executor.DefaultTaskExecutor
 * JD-Core Version:    0.7.0.1
 */