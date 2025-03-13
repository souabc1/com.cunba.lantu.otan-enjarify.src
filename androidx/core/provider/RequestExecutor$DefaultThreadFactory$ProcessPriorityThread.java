package androidx.core.provider;

import android.os.Process;

class RequestExecutor$DefaultThreadFactory$ProcessPriorityThread
  extends Thread
{
  public final int o00OoOoo;
  
  public RequestExecutor$DefaultThreadFactory$ProcessPriorityThread(Runnable paramRunnable, String paramString, int paramInt)
  {
    super(paramRunnable, paramString);
    this.o00OoOoo = paramInt;
  }
  
  public void run()
  {
    Process.setThreadPriority(this.o00OoOoo);
    super.run();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.RequestExecutor.DefaultThreadFactory.ProcessPriorityThread
 * JD-Core Version:    0.7.0.1
 */