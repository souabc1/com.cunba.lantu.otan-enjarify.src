package androidx.concurrent.futures;

final class AbstractResolvableFuture$Failure
{
  public static final Failure OooO0O0;
  public final Throwable OooO00o;
  
  static
  {
    Failure localFailure = new androidx/concurrent/futures/AbstractResolvableFuture$Failure;
    AbstractResolvableFuture.Failure.1 local1 = new androidx/concurrent/futures/AbstractResolvableFuture$Failure$1;
    local1.<init>("Failure occurred while trying to finish a future.");
    localFailure.<init>(local1);
    OooO0O0 = localFailure;
  }
  
  public AbstractResolvableFuture$Failure(Throwable paramThrowable)
  {
    paramThrowable = (Throwable)AbstractResolvableFuture.OooO0Oo(paramThrowable);
    this.OooO00o = paramThrowable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.Failure
 * JD-Core Version:    0.7.0.1
 */