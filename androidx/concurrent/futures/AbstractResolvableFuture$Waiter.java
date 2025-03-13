package androidx.concurrent.futures;

import java.util.concurrent.locks.LockSupport;

final class AbstractResolvableFuture$Waiter
{
  public static final Waiter OooO0OO;
  public volatile Thread OooO00o;
  public volatile Waiter OooO0O0;
  
  static
  {
    Waiter localWaiter = new androidx/concurrent/futures/AbstractResolvableFuture$Waiter;
    localWaiter.<init>(false);
    OooO0OO = localWaiter;
  }
  
  public AbstractResolvableFuture$Waiter()
  {
    AbstractResolvableFuture.AtomicHelper localAtomicHelper = AbstractResolvableFuture.o00OooO0;
    Thread localThread = Thread.currentThread();
    localAtomicHelper.OooO0o0(this, localThread);
  }
  
  public AbstractResolvableFuture$Waiter(boolean paramBoolean) {}
  
  public void OooO00o()
  {
    Thread localThread = this.OooO00o;
    if (localThread != null)
    {
      this.OooO00o = null;
      LockSupport.unpark(localThread);
    }
  }
  
  public void setNext(Waiter paramWaiter)
  {
    AbstractResolvableFuture.o00OooO0.OooO0Oo(this, paramWaiter);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.Waiter
 * JD-Core Version:    0.7.0.1
 */