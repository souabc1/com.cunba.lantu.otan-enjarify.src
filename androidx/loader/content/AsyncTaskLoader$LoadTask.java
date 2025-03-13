package androidx.loader.content;

import androidx.core.os.OperationCanceledException;
import java.util.concurrent.CountDownLatch;

final class AsyncTaskLoader$LoadTask
  extends ModernAsyncTask
  implements Runnable
{
  public final CountDownLatch o00OoooO;
  public boolean o00Ooooo;
  
  public AsyncTaskLoader$LoadTask(AsyncTaskLoader paramAsyncTaskLoader)
  {
    paramAsyncTaskLoader = new java/util/concurrent/CountDownLatch;
    paramAsyncTaskLoader.<init>(1);
    this.o00OoooO = paramAsyncTaskLoader;
  }
  
  public void OooO0o(Object paramObject)
  {
    try
    {
      AsyncTaskLoader localAsyncTaskLoader = this.o00o0000;
      localAsyncTaskLoader.OooOo0o(this, paramObject);
      return;
    }
    finally
    {
      this.o00OoooO.countDown();
    }
  }
  
  public void OooO0oO(Object paramObject)
  {
    try
    {
      AsyncTaskLoader localAsyncTaskLoader = this.o00o0000;
      localAsyncTaskLoader.OooOo(this, paramObject);
      return;
    }
    finally
    {
      this.o00OoooO.countDown();
    }
  }
  
  public Object OooOO0o(Void... paramVarArgs)
  {
    try
    {
      paramVarArgs = this.o00o0000;
      return paramVarArgs.OooOoo0();
    }
    catch (OperationCanceledException paramVarArgs)
    {
      boolean bool = isCancelled();
      if (bool) {
        return null;
      }
      throw paramVarArgs;
    }
  }
  
  public void run()
  {
    this.o00Ooooo = false;
    this.o00o0000.OooOoO0();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.content.AsyncTaskLoader.LoadTask
 * JD-Core Version:    0.7.0.1
 */