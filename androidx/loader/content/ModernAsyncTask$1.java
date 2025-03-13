package androidx.loader.content;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ModernAsyncTask$1
  implements ThreadFactory
{
  public final AtomicInteger o00OoOoo;
  
  public ModernAsyncTask$1()
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(1);
    this.o00OoOoo = localAtomicInteger;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new java/lang/Thread;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("ModernAsyncTask #");
    int i = this.o00OoOoo.getAndIncrement();
    ((StringBuilder)localObject).append(i);
    localObject = ((StringBuilder)localObject).toString();
    localThread.<init>(paramRunnable, (String)localObject);
    return localThread;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.content.ModernAsyncTask.1
 * JD-Core Version:    0.7.0.1
 */