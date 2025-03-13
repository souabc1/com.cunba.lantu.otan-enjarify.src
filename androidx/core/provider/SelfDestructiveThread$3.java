package androidx.core.provider;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class SelfDestructiveThread$3
  implements Runnable
{
  public void run()
  {
    try
    {
      localObject1 = this.o00OoOoo;
      localObject3 = this.o00Ooo00;
      localObject3 = ((Callable)localObject3).call();
      ((AtomicReference)localObject1).set(localObject3);
    }
    catch (Exception localException)
    {
      Object localObject1;
      Object localObject3;
      label22:
      break label22;
    }
    localObject1 = this.o00Ooo0;
    ((ReentrantLock)localObject1).lock();
    try
    {
      localObject1 = this.o00Ooo0O;
      localObject3 = null;
      ((AtomicBoolean)localObject1).set(false);
      localObject1 = this.o00Ooo0o;
      ((Condition)localObject1).signal();
      return;
    }
    finally
    {
      this.o00Ooo0.unlock();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.SelfDestructiveThread.3
 * JD-Core Version:    0.7.0.1
 */