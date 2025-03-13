package com.xuexiang.xrouter.thread;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import m54207b69;

class DefaultPoolExecutor$1
  implements RejectedExecutionHandler
{
  public void rejectedExecution(Runnable paramRunnable, ThreadPoolExecutor paramThreadPoolExecutor)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRunnable;
    arrayOfObject[2] = paramThreadPoolExecutor;
    m54207b69.F54207b69_00(1847, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xrouter.thread.DefaultPoolExecutor.1
 * JD-Core Version:    0.7.0.1
 */