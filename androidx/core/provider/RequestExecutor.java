package androidx.core.provider;

import android.os.Handler;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class RequestExecutor
{
  public static ThreadPoolExecutor OooO00o(String paramString, int paramInt1, int paramInt2)
  {
    RequestExecutor.DefaultThreadFactory localDefaultThreadFactory = new androidx/core/provider/RequestExecutor$DefaultThreadFactory;
    localDefaultThreadFactory.<init>(paramString, paramInt1);
    paramString = new java/util/concurrent/ThreadPoolExecutor;
    long l = paramInt2;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    LinkedBlockingDeque localLinkedBlockingDeque = new java/util/concurrent/LinkedBlockingDeque;
    localLinkedBlockingDeque.<init>();
    paramString.<init>(0, 1, l, localTimeUnit, localLinkedBlockingDeque, localDefaultThreadFactory);
    paramString.allowCoreThreadTimeOut(true);
    return paramString;
  }
  
  public static void OooO0O0(Executor paramExecutor, Callable paramCallable, Consumer paramConsumer)
  {
    Handler localHandler = CalleeHandler.OooO00o();
    RequestExecutor.ReplyRunnable localReplyRunnable = new androidx/core/provider/RequestExecutor$ReplyRunnable;
    localReplyRunnable.<init>(localHandler, paramCallable, paramConsumer);
    paramExecutor.execute(localReplyRunnable);
  }
  
  public static Object OooO0OO(ExecutorService paramExecutorService, Callable paramCallable, int paramInt)
  {
    paramExecutorService = paramExecutorService.submit(paramCallable);
    long l = paramInt;
    try
    {
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      return paramExecutorService.get(l, localTimeUnit);
    }
    catch (TimeoutException localTimeoutException)
    {
      paramExecutorService = new java/lang/InterruptedException;
      paramExecutorService.<init>("timeout");
      throw paramExecutorService;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw localInterruptedException;
    }
    catch (ExecutionException paramExecutorService)
    {
      paramCallable = new java/lang/RuntimeException;
      paramCallable.<init>(paramExecutorService);
      throw paramCallable;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.RequestExecutor
 * JD-Core Version:    0.7.0.1
 */