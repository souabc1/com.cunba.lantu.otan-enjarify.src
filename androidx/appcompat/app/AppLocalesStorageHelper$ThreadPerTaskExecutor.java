package androidx.appcompat.app;

import java.util.concurrent.Executor;

class AppLocalesStorageHelper$ThreadPerTaskExecutor
  implements Executor
{
  public void execute(Runnable paramRunnable)
  {
    Thread localThread = new java/lang/Thread;
    localThread.<init>(paramRunnable);
    localThread.start();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppLocalesStorageHelper.ThreadPerTaskExecutor
 * JD-Core Version:    0.7.0.1
 */