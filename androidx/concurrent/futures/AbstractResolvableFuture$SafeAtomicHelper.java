package androidx.concurrent.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class AbstractResolvableFuture$SafeAtomicHelper
  extends AbstractResolvableFuture.AtomicHelper
{
  public final AtomicReferenceFieldUpdater OooO00o;
  public final AtomicReferenceFieldUpdater OooO0O0;
  public final AtomicReferenceFieldUpdater OooO0OO;
  public final AtomicReferenceFieldUpdater OooO0Oo;
  public final AtomicReferenceFieldUpdater OooO0o0;
  
  public AbstractResolvableFuture$SafeAtomicHelper(AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater5)
  {
    super(null);
    this.OooO00o = paramAtomicReferenceFieldUpdater1;
    this.OooO0O0 = paramAtomicReferenceFieldUpdater2;
    this.OooO0OO = paramAtomicReferenceFieldUpdater3;
    this.OooO0Oo = paramAtomicReferenceFieldUpdater4;
    this.OooO0o0 = paramAtomicReferenceFieldUpdater5;
  }
  
  public boolean OooO00o(AbstractResolvableFuture paramAbstractResolvableFuture, AbstractResolvableFuture.Listener paramListener1, AbstractResolvableFuture.Listener paramListener2)
  {
    return OooO00o.OooO00o(this.OooO0Oo, paramAbstractResolvableFuture, paramListener1, paramListener2);
  }
  
  public boolean OooO0O0(AbstractResolvableFuture paramAbstractResolvableFuture, Object paramObject1, Object paramObject2)
  {
    return OooO00o.OooO00o(this.OooO0o0, paramAbstractResolvableFuture, paramObject1, paramObject2);
  }
  
  public boolean OooO0OO(AbstractResolvableFuture paramAbstractResolvableFuture, AbstractResolvableFuture.Waiter paramWaiter1, AbstractResolvableFuture.Waiter paramWaiter2)
  {
    return OooO00o.OooO00o(this.OooO0OO, paramAbstractResolvableFuture, paramWaiter1, paramWaiter2);
  }
  
  public void OooO0Oo(AbstractResolvableFuture.Waiter paramWaiter1, AbstractResolvableFuture.Waiter paramWaiter2)
  {
    this.OooO0O0.lazySet(paramWaiter1, paramWaiter2);
  }
  
  public void OooO0o0(AbstractResolvableFuture.Waiter paramWaiter, Thread paramThread)
  {
    this.OooO00o.lazySet(paramWaiter, paramThread);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.SafeAtomicHelper
 * JD-Core Version:    0.7.0.1
 */