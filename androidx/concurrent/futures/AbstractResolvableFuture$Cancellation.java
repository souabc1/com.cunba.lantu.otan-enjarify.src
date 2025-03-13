package androidx.concurrent.futures;

final class AbstractResolvableFuture$Cancellation
{
  public static final Cancellation OooO0OO;
  public static final Cancellation OooO0Oo;
  public final boolean OooO00o;
  public final Throwable OooO0O0;
  
  static
  {
    boolean bool1 = AbstractResolvableFuture.o00Ooo0O;
    if (bool1)
    {
      OooO0Oo = null;
      OooO0OO = null;
    }
    else
    {
      Cancellation localCancellation = new androidx/concurrent/futures/AbstractResolvableFuture$Cancellation;
      localCancellation.<init>(false, null);
      OooO0Oo = localCancellation;
      localCancellation = new androidx/concurrent/futures/AbstractResolvableFuture$Cancellation;
      boolean bool2 = true;
      localCancellation.<init>(bool2, null);
      OooO0OO = localCancellation;
    }
  }
  
  public AbstractResolvableFuture$Cancellation(boolean paramBoolean, Throwable paramThrowable)
  {
    this.OooO00o = paramBoolean;
    this.OooO0O0 = paramThrowable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
 * JD-Core Version:    0.7.0.1
 */