package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class CallbackToFutureAdapter$SafeFuture
  implements ListenableFuture
{
  public final WeakReference o00OoOoo;
  public final AbstractResolvableFuture o00Ooo00;
  
  public boolean OooO00o(Throwable paramThrowable)
  {
    return this.o00Ooo00.OooOOOo(paramThrowable);
  }
  
  public void addListener(Runnable paramRunnable, Executor paramExecutor)
  {
    this.o00Ooo00.addListener(paramRunnable, paramExecutor);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    CallbackToFutureAdapter.Completer localCompleter = (CallbackToFutureAdapter.Completer)this.o00OoOoo.get();
    AbstractResolvableFuture localAbstractResolvableFuture = this.o00Ooo00;
    paramBoolean = localAbstractResolvableFuture.cancel(paramBoolean);
    if ((paramBoolean) && (localCompleter != null)) {
      localCompleter.OooO00o();
    }
    return paramBoolean;
  }
  
  public Object get()
  {
    return this.o00Ooo00.get();
  }
  
  public Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.o00Ooo00.get(paramLong, paramTimeUnit);
  }
  
  public boolean isCancelled()
  {
    return this.o00Ooo00.isCancelled();
  }
  
  public boolean isDone()
  {
    return this.o00Ooo00.isDone();
  }
  
  public String toString()
  {
    return this.o00Ooo00.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture
 * JD-Core Version:    0.7.0.1
 */