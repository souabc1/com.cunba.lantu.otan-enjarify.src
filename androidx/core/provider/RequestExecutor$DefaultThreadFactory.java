package androidx.core.provider;

import java.util.concurrent.ThreadFactory;

class RequestExecutor$DefaultThreadFactory
  implements ThreadFactory
{
  public String o00OoOoo;
  public int o00Ooo00;
  
  public RequestExecutor$DefaultThreadFactory(String paramString, int paramInt)
  {
    this.o00OoOoo = paramString;
    this.o00Ooo00 = paramInt;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    RequestExecutor.DefaultThreadFactory.ProcessPriorityThread localProcessPriorityThread = new androidx/core/provider/RequestExecutor$DefaultThreadFactory$ProcessPriorityThread;
    String str = this.o00OoOoo;
    int i = this.o00Ooo00;
    localProcessPriorityThread.<init>(paramRunnable, str, i);
    return localProcessPriorityThread;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.RequestExecutor.DefaultThreadFactory
 * JD-Core Version:    0.7.0.1
 */