package androidx.core.provider;

import androidx.core.util.Consumer;

class RequestExecutor$ReplyRunnable$1
  implements Runnable
{
  public RequestExecutor$ReplyRunnable$1(RequestExecutor.ReplyRunnable paramReplyRunnable, Consumer paramConsumer, Object paramObject) {}
  
  public void run()
  {
    Consumer localConsumer = this.o00OoOoo;
    Object localObject = this.o00Ooo00;
    localConsumer.accept(localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.RequestExecutor.ReplyRunnable.1
 * JD-Core Version:    0.7.0.1
 */