package com.xuexiang.xaop.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import m54207b69;

class AppExecutors$MainThreadExecutor
  implements Executor
{
  public Handler o00OoOoo;
  
  private AppExecutors$MainThreadExecutor()
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    this.o00OoOoo = localHandler;
  }
  
  public void execute(Runnable paramRunnable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRunnable;
    m54207b69.F54207b69_00(977, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xaop.util.AppExecutors.MainThreadExecutor
 * JD-Core Version:    0.7.0.1
 */