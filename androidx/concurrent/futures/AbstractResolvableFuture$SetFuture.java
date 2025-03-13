package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;

final class AbstractResolvableFuture$SetFuture
  implements Runnable
{
  public final AbstractResolvableFuture o00OoOoo;
  public final ListenableFuture o00Ooo00;
  
  public void run()
  {
    Object localObject = this.o00OoOoo.o00OoOoo;
    if (localObject != this) {
      return;
    }
    localObject = AbstractResolvableFuture.OooO(this.o00Ooo00);
    AbstractResolvableFuture.AtomicHelper localAtomicHelper = AbstractResolvableFuture.o00OooO0;
    AbstractResolvableFuture localAbstractResolvableFuture = this.o00OoOoo;
    boolean bool = localAtomicHelper.OooO0O0(localAbstractResolvableFuture, this, localObject);
    if (bool)
    {
      localObject = this.o00OoOoo;
      AbstractResolvableFuture.OooO0o((AbstractResolvableFuture)localObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
 * JD-Core Version:    0.7.0.1
 */