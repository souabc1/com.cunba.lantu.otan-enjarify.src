package com.xuexiang.xrouter.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m54207b69;

public class DefaultThreadFactory
  implements ThreadFactory
{
  public static final AtomicInteger o00Ooo0O;
  public final AtomicInteger o00OoOoo;
  public final String o00Ooo0;
  public final ThreadGroup o00Ooo00;
  
  static
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(1);
    o00Ooo0O = localAtomicInteger;
  }
  
  public DefaultThreadFactory()
  {
    Object localObject = new java/util/concurrent/atomic/AtomicInteger;
    int i = 1;
    ((AtomicInteger)localObject).<init>(i);
    this.o00OoOoo = ((AtomicInteger)localObject);
    localObject = System.getSecurityManager();
    if (localObject != null) {
      localObject = ((SecurityManager)localObject).getThreadGroup();
    } else {
      localObject = Thread.currentThread().getThreadGroup();
    }
    this.o00Ooo00 = ((ThreadGroup)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("E^060D332E2E403285324837408A3B3F40428F224484");
    ((StringBuilder)localObject).append(str);
    i = o00Ooo0O.getAndIncrement();
    ((StringBuilder)localObject).append(i);
    str = m54207b69.F54207b69_11("k<101D4A57525E635F247B5D1D");
    ((StringBuilder)localObject).append(str);
    localObject = ((StringBuilder)localObject).toString();
    this.o00Ooo0 = ((String)localObject);
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRunnable;
    return (Thread)m54207b69.F54207b69_09(1851, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xrouter.thread.DefaultThreadFactory
 * JD-Core Version:    0.7.0.1
 */