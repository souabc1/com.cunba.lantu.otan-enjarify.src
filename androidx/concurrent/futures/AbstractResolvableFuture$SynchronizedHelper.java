package androidx.concurrent.futures;

final class AbstractResolvableFuture$SynchronizedHelper
  extends AbstractResolvableFuture.AtomicHelper
{
  public AbstractResolvableFuture$SynchronizedHelper()
  {
    super(null);
  }
  
  public boolean OooO00o(AbstractResolvableFuture paramAbstractResolvableFuture, AbstractResolvableFuture.Listener paramListener1, AbstractResolvableFuture.Listener paramListener2)
  {
    try
    {
      AbstractResolvableFuture.Listener localListener = paramAbstractResolvableFuture.o00Ooo00;
      if (localListener == paramListener1)
      {
        paramAbstractResolvableFuture.o00Ooo00 = paramListener2;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public boolean OooO0O0(AbstractResolvableFuture paramAbstractResolvableFuture, Object paramObject1, Object paramObject2)
  {
    try
    {
      Object localObject = paramAbstractResolvableFuture.o00OoOoo;
      if (localObject == paramObject1)
      {
        paramAbstractResolvableFuture.o00OoOoo = paramObject2;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public boolean OooO0OO(AbstractResolvableFuture paramAbstractResolvableFuture, AbstractResolvableFuture.Waiter paramWaiter1, AbstractResolvableFuture.Waiter paramWaiter2)
  {
    try
    {
      AbstractResolvableFuture.Waiter localWaiter = paramAbstractResolvableFuture.o00Ooo0;
      if (localWaiter == paramWaiter1)
      {
        paramAbstractResolvableFuture.o00Ooo0 = paramWaiter2;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public void OooO0Oo(AbstractResolvableFuture.Waiter paramWaiter1, AbstractResolvableFuture.Waiter paramWaiter2)
  {
    paramWaiter1.OooO0O0 = paramWaiter2;
  }
  
  public void OooO0o0(AbstractResolvableFuture.Waiter paramWaiter, Thread paramThread)
  {
    paramWaiter.OooO00o = paramThread;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.SynchronizedHelper
 * JD-Core Version:    0.7.0.1
 */