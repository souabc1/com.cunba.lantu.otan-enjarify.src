package androidx.core.provider;

import android.os.Handler;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;

class RequestExecutor$ReplyRunnable
  implements Runnable
{
  public Callable o00OoOoo;
  public Handler o00Ooo0;
  public Consumer o00Ooo00;
  
  public RequestExecutor$ReplyRunnable(Handler paramHandler, Callable paramCallable, Consumer paramConsumer)
  {
    this.o00OoOoo = paramCallable;
    this.o00Ooo00 = paramConsumer;
    this.o00Ooo0 = paramHandler;
  }
  
  public void run()
  {
    Object localObject;
    try
    {
      localObject = this.o00OoOoo;
      localObject = ((Callable)localObject).call();
    }
    catch (Exception localException)
    {
      localObject = null;
    }
    Consumer localConsumer = this.o00Ooo00;
    Handler localHandler = this.o00Ooo0;
    RequestExecutor.ReplyRunnable.1 local1 = new androidx/core/provider/RequestExecutor$ReplyRunnable$1;
    local1.<init>(this, localConsumer, localObject);
    localHandler.post(local1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.RequestExecutor.ReplyRunnable
 * JD-Core Version:    0.7.0.1
 */