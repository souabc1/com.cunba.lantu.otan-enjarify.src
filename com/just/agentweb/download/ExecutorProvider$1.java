package com.just.agentweb.download;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m54207b69;

class ExecutorProvider$1
  implements ThreadFactory
{
  public final AtomicInteger o00OoOoo;
  public ThreadGroup o00Ooo0;
  public SecurityManager o00Ooo00;
  
  public ExecutorProvider$1(ExecutorProvider paramExecutorProvider)
  {
    paramExecutorProvider = new java/util/concurrent/atomic/AtomicInteger;
    int i = 1;
    paramExecutorProvider.<init>(i);
    this.o00OoOoo = paramExecutorProvider;
    paramExecutorProvider = System.getSecurityManager();
    this.o00Ooo00 = paramExecutorProvider;
    if (paramExecutorProvider != null) {
      paramExecutorProvider = paramExecutorProvider.getThreadGroup();
    } else {
      paramExecutorProvider = Thread.currentThread().getThreadGroup();
    }
    this.o00Ooo0 = paramExecutorProvider;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new java/lang/Thread;
    ThreadGroup localThreadGroup = this.o00Ooo0;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("by09171818581D24231F16182727611B201B2D2A3068");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.o00OoOoo;
    int i = ((AtomicInteger)localObject2).getAndIncrement();
    ((StringBuilder)localObject1).append(i);
    localObject1 = ((StringBuilder)localObject1).toString();
    localThread.<init>(localThreadGroup, paramRunnable, (String)localObject1);
    boolean bool = localThread.isDaemon();
    if (bool)
    {
      bool = false;
      paramRunnable = null;
      localThread.setDaemon(false);
    }
    localThread.setPriority(1);
    return localThread;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.download.ExecutorProvider.1
 * JD-Core Version:    0.7.0.1
 */