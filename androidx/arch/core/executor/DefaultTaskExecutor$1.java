package androidx.arch.core.executor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class DefaultTaskExecutor$1
  implements ThreadFactory
{
  public final AtomicInteger o00OoOoo;
  
  public DefaultTaskExecutor$1(DefaultTaskExecutor paramDefaultTaskExecutor)
  {
    paramDefaultTaskExecutor = new java/util/concurrent/atomic/AtomicInteger;
    paramDefaultTaskExecutor.<init>(0);
    this.o00OoOoo = paramDefaultTaskExecutor;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new java/lang/Thread;
    localThread.<init>(paramRunnable);
    paramRunnable = new java/lang/StringBuilder;
    paramRunnable.<init>();
    paramRunnable.append("arch_disk_io_");
    int i = this.o00OoOoo.getAndIncrement();
    paramRunnable.append(i);
    paramRunnable = paramRunnable.toString();
    localThread.setName(paramRunnable);
    return localThread;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.arch.core.executor.DefaultTaskExecutor.1
 * JD-Core Version:    0.7.0.1
 */